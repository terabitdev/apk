package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import a2.o2;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.f2;
import i3.t;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterOfflineDownloadStatus;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.readerapp.ui.screens.authenticated.r0;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.echo.components.ButtonIconKt;
import io.elevenlabs.ui.echo.components.EchoToastKt;
import io.livekit.android.rpc.RpcError;
import ir.z1;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p4.b0;
import p4.y;
import q2.j7;
import r1.c3;
import r1.d2;
import r1.i1;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import rd.c1;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aY\u0010\r\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\u0011\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0014¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "Lsn/z;", "action", "Lir/z1;", "", "currentChapterIndexFlow", "", "showTooLargeForOfflineToast", "", "chapterDownloadErrorMessage", "PlayerContentsScreen", "(Lio/elevenlabs/domain/model/ReadMeta;Lho/l;Lir/z1;ZLjava/lang/String;Lu2/m;I)V", "Lkotlin/Function0;", "onClose", "PlayerContentsScreenUI", "(Lio/elevenlabs/domain/model/ReadMeta;Lho/l;Lho/a;Lir/z1;Lu2/m;I)V", "EmptyState", "(Lu2/m;I)V", "Header", "(Lho/a;Lu2/m;I)V", "Preview_PlayerContentsScreenUI", "Preview_PlayerContentsScreenUI_Empty", "currentChapterIndex", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerContentsScreenKt {
    private static final void EmptyState(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1909292703);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t G = r1.d.G(e10, u.P, echoTheme.getSpacings(qVar, i11).getX20(), 1);
            f1 d10 = p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            j7.d(kj.c.R(qVar, R.string.player_contents_empty_state_message), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(echoTheme.getTypography(qVar, i11).getBaseRegular400(qVar, EchoThemeTypography.$stable), echoTheme.getColors(qVar, i11).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, 0, 0, 131070);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 8);
        }
    }

    public static final z EmptyState$lambda$1(int i10, m mVar, int i11) {
        EmptyState(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void Header(ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        q qVar = (q) mVar;
        qVar.Z(-370989590);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            t t10 = r1.d.t(p2.e(i3.q.f13017a, 1.0f), i1.f29224a);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            t F = r1.d.F(t10, echoTheme.getSpacings(qVar, i13).getX5(), echoTheme.getSpacings(qVar, i13).getX4());
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(F, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            String R = kj.c.R(qVar, R.string.player_item_contents);
            y0 lgCompact500 = echoTheme.getTypography(qVar, i13).getLgCompact500(qVar, EchoThemeTypography.$stable);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new l(15);
                qVar.h0(L);
            }
            j7.d(R, p4.q.b(m1Var, (ho.l) L), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, lgCompact500, qVar, 0, 24960, 110588);
            ButtonIconKt.m1961ButtonIconFhKo8ac(io.elevenlabs.ui.R.drawable.ic_cross_large, kj.c.R(qVar, R.string.chapters_close_accessibility_hint), aVar, null, 20, 0L, null, null, false, qVar, ((i11 << 6) & 896) | 24576, 488);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar, i10, 10);
        }
    }

    public static final z Header$lambda$0$0$0(b0 b0Var) {
        b0Var.getClass();
        y.b(b0Var);
        return z.f31622a;
    }

    public static final z Header$lambda$1(ho.a aVar, int i10, m mVar, int i11) {
        Header(aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void PlayerContentsScreen(ReadMeta readMeta, ho.l lVar, z1 z1Var, boolean z6, String str, m mVar, int i10) {
        int i11;
        z1 z1Var2;
        boolean z10;
        String str2;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        lVar.getClass();
        z1Var.getClass();
        q qVar = (q) mVar;
        qVar.Z(2057398690);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            z1Var2 = z1Var;
            if (qVar.h(z1Var2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        } else {
            z1Var2 = z1Var;
        }
        if ((i10 & 3072) == 0) {
            z10 = z6;
            if (qVar.g(z10)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        } else {
            z10 = z6;
        }
        if ((i10 & 24576) == 0) {
            str2 = str;
            if (qVar.f(str2)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        } else {
            str2 = str;
        }
        boolean z12 = false;
        if ((i11 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar.O(i11 & 1, z11)) {
            if ((i11 & 112) == 32) {
                z12 = true;
            }
            Object L = qVar.L();
            if (z12 || L == u2.l.f33918a) {
                L = new id.z(lVar, 23);
                qVar.h0(L);
            }
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, u.P, (ho.a) L, false, (ho.r) c3.k.d(-1695722412, true, new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.c(readMeta, lVar, z1Var2, z10, str2), qVar), (m) qVar, 1572864, 47);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r0(readMeta, lVar, z1Var, z6, str, i10, 4);
        }
    }

    public static final z PlayerContentsScreen$lambda$0$0(ho.l lVar) {
        lVar.invoke(new l(14));
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onContentsClose();
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$1(ReadMeta readMeta, ho.l lVar, z1 z1Var, boolean z6, String str, r1.y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        t c5;
        yVar.getClass();
        bottomSheetControl.getClass();
        c5 = ((r1.z) yVar).c(i3.q.f13017a, 1.0f, true);
        boolean z10 = false;
        f1 d10 = p.d(i3.d.f12998b, false);
        q qVar = (q) mVar;
        int hashCode = Long.hashCode(qVar.T);
        o l4 = qVar.l();
        t c10 = i3.a.c(c5, mVar);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar.f33969a;
        qVar.b0();
        if (qVar.S) {
            qVar.k(fVar);
        } else {
            qVar.k0();
        }
        r.J(h4.g.f11907f, d10, mVar);
        r.J(h4.g.f11906e, l4, mVar);
        r.y(mVar, Integer.valueOf(hashCode), h4.g.f11908g);
        r.F(h4.g.f11909h, mVar);
        r.J(h4.g.f11905d, c10, mVar);
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.g(bottomSheetControl, 2);
            qVar.h0(L);
        }
        PlayerContentsScreenUI(readMeta, lVar, (ho.a) L, z1Var, mVar, 0);
        z zVar = z.f31622a;
        if (z6) {
            qVar.X(1425330183);
            boolean f10 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f10 || L2 == eVar) {
                L2 = new PlayerContentsScreenKt$PlayerContentsScreen$2$1$2$1(lVar, null);
                qVar.h0(L2);
            }
            r.f((ho.p) L2, zVar, mVar);
            qVar.p(false);
        } else {
            qVar.X(1425496436);
            qVar.p(false);
        }
        AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility(z6, c3.k.d(-1354386427, true, new j(lVar, 0), mVar), mVar, 48);
        if (str != null) {
            qVar.X(1426126387);
            boolean f11 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f11 || L3 == eVar) {
                L3 = new PlayerContentsScreenKt$PlayerContentsScreen$2$1$4$1(lVar, null);
                qVar.h0(L3);
            }
            r.f((ho.p) L3, str, mVar);
            qVar.p(false);
        } else {
            qVar.X(1426311860);
            qVar.p(false);
        }
        if (str != null) {
            z10 = true;
        }
        AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility(z10, c3.k.d(-17586130, true, new f2.i(str, lVar, 6), mVar), mVar, 48);
        qVar.p(true);
        return zVar;
    }

    public static final z PlayerContentsScreen$lambda$1$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$1$0$2(ho.l lVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            t e10 = ib.i.e(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, r1.d.P(i3.q.f13017a, u0.e(qVar).f29154l));
            String R = kj.c.R(qVar, R.string.book_too_large_for_offline_title);
            String R2 = kj.c.R(qVar, R.string.book_too_large_for_offline_toast_message);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new id.z(lVar, 22);
                qVar.h0(L);
            }
            EchoToastKt.EchoToast(R2, e10, R, null, (ho.a) L, null, qVar, 0, 40);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$1$0$2$0$0(ho.l lVar) {
        lVar.invoke(new l(10));
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$1$0$2$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onTooLargeForOfflineToastClose();
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$1$0$4(String str, ho.l lVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            t e10 = ib.i.e(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, r1.d.P(i3.q.f13017a, u0.e(qVar).f29154l));
            String R = kj.c.R(qVar, R.string.download_failed_alert_title);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new id.z(lVar, 24);
                qVar.h0(L);
            }
            EchoToastKt.EchoToast(str2, e10, R, null, (ho.a) L, null, qVar, 0, 40);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$1$0$4$0$0(ho.l lVar) {
        lVar.invoke(new l(9));
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$1$0$4$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onChapterDownloadErrorClose();
        return z.f31622a;
    }

    public static final z PlayerContentsScreen$lambda$2(ReadMeta readMeta, ho.l lVar, z1 z1Var, boolean z6, String str, int i10, m mVar, int i11) {
        PlayerContentsScreen(readMeta, lVar, z1Var, z6, str, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void PlayerContentsScreenUI(ReadMeta readMeta, ho.l lVar, ho.a aVar, z1 z1Var, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        List<Chapter> list;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        q qVar2 = (q) mVar;
        qVar2.Z(-352651473);
        if ((i10 & 6) == 0) {
            if (qVar2.h(readMeta)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(z1Var)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            if (readMeta != null) {
                list = readMeta.getChapters();
            } else {
                list = null;
            }
            if (list == null) {
                list = tn.t.f33547a;
            }
            z0 o6 = r.o(z1Var, qVar2, (i11 >> 9) & 14);
            t1.z a10 = t1.b0.a(0, qVar2, 3);
            h5.c cVar = (h5.c) qVar2.j(i4.j1.f13129h);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i16 = EchoTheme.$stable;
            float x10 = echoTheme.getSpacings(qVar2, i16).getX10();
            boolean f10 = qVar2.f(cVar);
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                L = Integer.valueOf(-((int) cVar.d0(x10)));
                qVar2.h0(L);
            }
            int intValue = ((Number) L).intValue();
            Integer valueOf = Integer.valueOf(PlayerContentsScreenUI$lambda$0(o6));
            boolean f11 = qVar2.f(o6) | qVar2.f(a10) | qVar2.d(intValue);
            Object L2 = qVar2.L();
            if (f11 || L2 == eVar) {
                L2 = new PlayerContentsScreenKt$PlayerContentsScreenUI$1$1(a10, intValue, o6, null);
                qVar2.h0(L2);
            }
            r.f((ho.p) L2, valueOf, qVar2);
            x a11 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            i3.q qVar3 = i3.q.f13017a;
            t c5 = i3.a.c(qVar3, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(h4.g.f11907f, a11, qVar2);
            r.J(h4.g.f11906e, l4, qVar2);
            r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar2);
            r.J(h4.g.f11905d, c5, qVar2);
            Header(aVar, qVar2, (i11 >> 6) & 14);
            if (!list.isEmpty()) {
                qVar2.X(-1016010061);
                t e10 = p2.e(qVar3, 1.0f);
                d2 d2Var = new d2(echoTheme.getSpacings(qVar2, i16).getX2_5(), echoTheme.getSpacings(qVar2, i16).getX6(), echoTheme.getSpacings(qVar2, i16).getX2_5(), echoTheme.getSpacings(qVar2, i16).getX10());
                boolean h10 = qVar2.h(list) | qVar2.f(o6) | qVar2.h(readMeta);
                if ((i11 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = h10 | z11;
                if ((i11 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z14 = z12 | z13;
                Object L3 = qVar2.L();
                if (z14 || L3 == eVar) {
                    o2 o2Var = new o2(list, readMeta, lVar, aVar, o6, 3);
                    qVar2.h0(o2Var);
                    L3 = o2Var;
                }
                z10 = true;
                c1.c(e10, a10, d2Var, false, null, null, null, false, null, (ho.l) L3, qVar2, 6, 504);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                z10 = true;
                qVar.X(-1014096059);
                EmptyState(qVar, 0);
                qVar.p(false);
            }
            qVar.p(z10);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(readMeta, lVar, aVar, z1Var, i10, 3);
        }
    }

    public static final int PlayerContentsScreenUI$lambda$0(s2 s2Var) {
        return ((Number) s2Var.getValue()).intValue();
    }

    public static final z PlayerContentsScreenUI$lambda$3$0$0(List list, ReadMeta readMeta, ho.l lVar, ho.a aVar, s2 s2Var, t1.t tVar) {
        tVar.getClass();
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (it.hasNext()) {
                i10 = i11 + 1;
                ReadMeta readMeta2 = readMeta;
                ho.l lVar2 = lVar;
                t1.t.c(tVar, null, "chapter", new c3.j(new k((Chapter) it.next(), i11, readMeta2, lVar2, aVar, s2Var), true, 797514825), 1);
                t1.t.c(tVar, null, "spacer", ComposableSingletons$PlayerContentsScreenKt.INSTANCE.getLambda$797514825$app_productionRelease(), 1);
                readMeta = readMeta2;
                lVar = lVar2;
            } else {
                t1.t.c(tVar, null, "bottom_spacer", ComposableSingletons$PlayerContentsScreenKt.INSTANCE.getLambda$1204210953$app_productionRelease(), 1);
                return z.f31622a;
            }
        }
    }

    public static final z PlayerContentsScreenUI$lambda$3$0$0$0(Chapter chapter, int i10, ReadMeta readMeta, ho.l lVar, ho.a aVar, s2 s2Var, t1.b bVar, m mVar, int i11) {
        boolean z6;
        ChapterState chapterState;
        ChapterOfflineDownloadStatus chapterOfflineDownloadStatus;
        OfflineReadData offlineReadData;
        bVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            if (i10 < PlayerContentsScreenUI$lambda$0(s2Var)) {
                chapterState = ChapterState.Past;
            } else if (i10 == PlayerContentsScreenUI$lambda$0(s2Var)) {
                chapterState = ChapterState.Active;
            } else {
                chapterState = ChapterState.Future;
            }
            ChapterState chapterState2 = chapterState;
            if (readMeta == null || (offlineReadData = readMeta.getOfflineReadData()) == null || (chapterOfflineDownloadStatus = OfflineReadData.chapterDownloadIndicator$default(offlineReadData, i10, 0L, 2, null)) == null) {
                chapterOfflineDownloadStatus = ChapterOfflineDownloadStatus.NotDownloaded.INSTANCE;
            }
            boolean f10 = qVar.f(lVar) | qVar.d(i10);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                L = new g(lVar, i10, 0);
                qVar.h0(L);
            }
            ho.a aVar2 = (ho.a) L;
            boolean f11 = qVar.f(lVar) | qVar.d(i10);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                L2 = new h(lVar, i10);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            boolean f12 = qVar.f(aVar) | qVar.f(lVar) | qVar.h(chapter);
            Object L3 = qVar.L();
            if (f12 || L3 == eVar) {
                L3 = new c3.b(aVar, lVar, chapter, 19);
                qVar.h0(L3);
            }
            ChapterListItemKt.ChapterListItem(chapter, chapterState2, chapterOfflineDownloadStatus, aVar2, lVar2, (ho.a) L3, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PlayerContentsScreenUI$lambda$3$0$0$0$0$0(ho.l lVar, int i10) {
        lVar.invoke(new io.elevenlabs.highlighter.t(i10, 12));
        return z.f31622a;
    }

    public static final z PlayerContentsScreenUI$lambda$3$0$0$0$0$0$0(int i10, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.downloadChapter(i10);
        return z.f31622a;
    }

    public static final z PlayerContentsScreenUI$lambda$3$0$0$0$1$0(ho.l lVar, final int i10, final boolean z6) {
        lVar.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.i
            @Override // ho.l
            public final Object invoke(Object obj) {
                z PlayerContentsScreenUI$lambda$3$0$0$0$1$0$0;
                PlayerContentsScreenUI$lambda$3$0$0$0$1$0$0 = PlayerContentsScreenKt.PlayerContentsScreenUI$lambda$3$0$0$0$1$0$0(i10, z6, (PlayerViewModel) obj);
                return PlayerContentsScreenUI$lambda$3$0$0$0$1$0$0;
            }
        });
        return z.f31622a;
    }

    public static final z PlayerContentsScreenUI$lambda$3$0$0$0$1$0$0(int i10, boolean z6, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.removeChapterDownload(i10, z6);
        return z.f31622a;
    }

    public static final z PlayerContentsScreenUI$lambda$3$0$0$0$2$0(ho.a aVar, ho.l lVar, Chapter chapter) {
        aVar.invoke();
        lVar.invoke(new c(chapter, 1));
        return z.f31622a;
    }

    public static final z PlayerContentsScreenUI$lambda$3$0$0$0$2$0$0(Chapter chapter, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onChapterClick(chapter);
        return z.f31622a;
    }

    public static final z PlayerContentsScreenUI$lambda$4(ReadMeta readMeta, ho.l lVar, ho.a aVar, z1 z1Var, int i10, m mVar, int i11) {
        PlayerContentsScreenUI(readMeta, lVar, aVar, z1Var, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerContentsScreenUI(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1315580147);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, c3.k.d(-76256793, true, new b(new Chapter(0, 0L, "Chapter 1: The Beginning", 1500L, false, 0L, null, null, 192, null), 1), qVar), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 7);
        }
    }

    public static final z Preview_PlayerContentsScreenUI$lambda$0(Chapter chapter, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ChapterState chapterState = ChapterState.Active;
            ChapterOfflineDownloadStatus.Downloaded downloaded = ChapterOfflineDownloadStatus.Downloaded.INSTANCE;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new a(12);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new l(11);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(13);
                qVar.h0(L3);
            }
            ChapterListItemKt.ChapterListItem(chapter, chapterState, downloaded, aVar, lVar, (ho.a) L3, qVar, 224304);
            Chapter copy$default = Chapter.copy$default(chapter, 0, 0L, "Chapter 2: The Journey", 0L, false, 0L, null, null, 251, null);
            ChapterState chapterState2 = ChapterState.Future;
            ChapterOfflineDownloadStatus.NotDownloaded notDownloaded = ChapterOfflineDownloadStatus.NotDownloaded.INSTANCE;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(14);
                qVar.h0(L4);
            }
            ho.a aVar2 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new l(12);
                qVar.h0(L5);
            }
            ho.l lVar2 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new a(15);
                qVar.h0(L6);
            }
            ChapterListItemKt.ChapterListItem(copy$default, chapterState2, notDownloaded, aVar2, lVar2, (ho.a) L6, qVar, 224304);
            Chapter copy$default2 = Chapter.copy$default(chapter, 0, 0L, "Chapter 3: Downloading", 0L, false, 0L, null, null, 251, null);
            ChapterOfflineDownloadStatus.Downloading downloading = new ChapterOfflineDownloadStatus.Downloading(50);
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new a(16);
                qVar.h0(L7);
            }
            ho.a aVar3 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new l(13);
                qVar.h0(L8);
            }
            ho.l lVar3 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new a(17);
                qVar.h0(L9);
            }
            ChapterListItemKt.ChapterListItem(copy$default2, chapterState2, downloading, aVar3, lVar3, (ho.a) L9, qVar, 224304);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Preview_PlayerContentsScreenUI$lambda$0$0$1$0(boolean z6) {
        return z.f31622a;
    }

    public static final z Preview_PlayerContentsScreenUI$lambda$0$0$4$0(boolean z6) {
        return z.f31622a;
    }

    public static final z Preview_PlayerContentsScreenUI$lambda$0$0$7$0(boolean z6) {
        return z.f31622a;
    }

    public static final z Preview_PlayerContentsScreenUI$lambda$1(int i10, m mVar, int i11) {
        Preview_PlayerContentsScreenUI(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerContentsScreenUI_Empty(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-303730373);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerContentsScreenKt.INSTANCE.getLambda$857536661$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 6);
        }
    }

    public static final z Preview_PlayerContentsScreenUI_Empty$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerContentsScreenUI_Empty(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final /* synthetic */ void access$PlayerContentsScreenUI(ReadMeta readMeta, ho.l lVar, ho.a aVar, z1 z1Var, m mVar, int i10) {
        PlayerContentsScreenUI(readMeta, lVar, aVar, z1Var, mVar, i10);
    }
}
