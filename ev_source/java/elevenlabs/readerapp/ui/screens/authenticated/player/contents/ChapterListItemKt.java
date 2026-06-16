package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import a2.d0;
import a2.n2;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.q;
import i3.t;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterOfflineDownloadStatus;
import io.elevenlabs.readerapp.ui.formatter.ChapterDurationFormatterKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.echo.components.MenuKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p4.b0;
import p4.y;
import q2.e5;
import q2.f5;
import q2.j7;
import q2.y2;
import r1.i1;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001aW\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/domain/model/Chapter;", "chapter", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/contents/ChapterState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;", "downloadIndicator", "Lkotlin/Function0;", "Lsn/z;", "onDownloadClick", "Lkotlin/Function1;", "", "onRemoveDownloadClick", "onClick", "ChapterListItem", "(Lio/elevenlabs/domain/model/Chapter;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/contents/ChapterState;Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;Lho/a;Lho/l;Lho/a;Lu2/m;I)V", "Preview_ChapterListItem", "(Lu2/m;I)V", "menuExpanded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ChapterListItemKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChapterState.values().length];
            try {
                iArr[ChapterState.Past.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChapterState.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChapterState.Future.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ChapterListItem(Chapter chapter, ChapterState chapterState, ChapterOfflineDownloadStatus chapterOfflineDownloadStatus, ho.a aVar, ho.l lVar, ho.a aVar2, m mVar, int i10) {
        int i11;
        ho.a aVar3;
        boolean z6;
        u2.e eVar;
        q qVar;
        z0 z0Var;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        long quaternary;
        long secondary;
        z0 z0Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        chapter.getClass();
        chapterState.getClass();
        chapterOfflineDownloadStatus.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-953515654);
        if ((i10 & 6) == 0) {
            if (qVar2.h(chapter)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i11 = i19 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.d(chapterState.ordinal())) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i11 |= i18;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(chapterOfflineDownloadStatus)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i11 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(lVar)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i15;
        }
        if ((196608 & i10) == 0) {
            aVar3 = aVar2;
            if (qVar2.h(aVar3)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i11 |= i14;
        } else {
            aVar3 = aVar2;
        }
        if ((74899 & i11) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            Object L = qVar2.L();
            u2.e eVar2 = u2.l.f33918a;
            if (L == eVar2) {
                L = r.A(Boolean.FALSE);
                qVar2.h0(L);
            }
            z0 z0Var3 = (z0) L;
            q qVar3 = q.f13017a;
            t t10 = r1.d.t(p2.e(qVar3, 1.0f), i1.f29224a);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i20 = EchoTheme.$stable;
            t c5 = m3.h.c(t10, echoTheme.getShapes(qVar2, i20).getMd(qVar2, EchoThemeShapes.$stable));
            Object L2 = qVar2.L();
            if (L2 == eVar2) {
                L2 = j0.c.o(qVar2);
            }
            p1.l lVar2 = (p1.l) L2;
            EchoThemeColors.Text text = echoTheme.getColors(qVar2, i20).getText();
            int i21 = EchoThemeColors.Text.$stable;
            f5 b10 = e5.b(u.P, 3, text.getPrimary(qVar2, i21), false);
            Object L3 = qVar2.L();
            if (L3 == eVar2) {
                L3 = new d0(z0Var3, 19);
                qVar2.h0(L3);
            }
            t q = n.q(c5, lVar2, b10, false, null, (ho.a) L3, aVar3, 444);
            i3.k kVar = i3.d.f13005z0;
            k2 a10 = i2.a(r1.j.f29228a, kVar, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c10 = i3.a.c(q, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar3 = h4.g.f11907f;
            r.J(eVar3, a10, qVar2);
            h4.e eVar4 = h4.g.f11906e;
            r.J(eVar4, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar5 = h4.g.f11908g;
            r.y(qVar2, valueOf, eVar5);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar2);
            int i22 = i11;
            h4.e eVar6 = h4.g.f11905d;
            r.J(eVar6, c10, qVar2);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            t H = r1.d.H(new m1(1.0f, true), echoTheme.getSpacings(qVar2, i20).getX2_5(), echoTheme.getSpacings(qVar2, i20).getX1_5(), echoTheme.getSpacings(qVar2, i20).getX2(), echoTheme.getSpacings(qVar2, i20).getX1_5());
            boolean h10 = qVar2.h(chapter);
            Object L4 = qVar2.L();
            if (h10 || L4 == eVar2) {
                L4 = new c(chapter, 0);
                qVar2.h0(L4);
            }
            t c11 = p4.q.c(H, true, (ho.l) L4);
            r1.h i23 = r1.j.i(echoTheme.getSpacings(qVar2, i20).getX1(), kVar);
            i3.j jVar = i3.d.B0;
            x a11 = w.a(i23, jVar, qVar2, 0);
            int hashCode2 = Long.hashCode(qVar2.T);
            o l7 = qVar2.l();
            t c12 = i3.a.c(c11, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(eVar3, a11, qVar2);
            r.J(eVar4, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar5, qVar2, dVar);
            r.J(eVar6, c12, qVar2);
            k2 a12 = i2.a(r1.j.h(echoTheme.getSpacings(qVar2, i20).getX2(), jVar), kVar, qVar2, 48);
            int hashCode3 = Long.hashCode(qVar2.T);
            o l10 = qVar2.l();
            t c13 = i3.a.c(qVar3, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(eVar3, a12, qVar2);
            r.J(eVar4, l10, qVar2);
            defpackage.f.u(hashCode3, qVar2, eVar5, qVar2, dVar);
            r.J(eVar6, c13, qVar2);
            if (chapterState == ChapterState.Active) {
                qVar2.X(625092365);
                eVar = eVar2;
                z10 = false;
                z0Var = z0Var3;
                qVar = qVar3;
                i12 = i21;
                i13 = 3;
                z11 = true;
                y2.a(kd.a.M(R.drawable.ic_play, qVar2, 0), null, p2.o(qVar3, 16), echoTheme.getColors(qVar2, i20).getIcon().getPrimary(qVar2, EchoThemeColors.Icon.$stable), qVar2, u3.c.$stable | 432, 0);
                qVar2.p(false);
            } else {
                eVar = eVar2;
                qVar = qVar3;
                z0Var = z0Var3;
                i12 = i21;
                z10 = false;
                i13 = 3;
                z11 = true;
                qVar2.X(625384106);
                qVar2.p(false);
            }
            String chapterName = chapter.getChapterName();
            EchoThemeTypography typography = echoTheme.getTypography(qVar2, i20);
            int i24 = EchoThemeTypography.$stable;
            y0 baseRegular500 = typography.getBaseRegular500(qVar2, i24);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i25 = iArr[chapterState.ordinal()];
            if (i25 != z11) {
                if (i25 != 2) {
                    if (i25 == i13) {
                        quaternary = ib.i.g(-811093887, i20, echoTheme, qVar2, qVar2).getSecondary(qVar2, i12);
                        qVar2.p(z10);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(-811101642, qVar2, z10);
                    }
                } else {
                    quaternary = ib.i.g(-811096481, i20, echoTheme, qVar2, qVar2).getPrimary(qVar2, i12);
                    qVar2.p(z10);
                }
            } else {
                quaternary = ib.i.g(-811099166, i20, echoTheme, qVar2, qVar2).getQuaternary(qVar2, i12);
                qVar2.p(z10);
            }
            y0 a13 = y0.a(baseRegular500, quaternary, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
            Object L5 = qVar2.L();
            u2.e eVar7 = eVar;
            if (L5 == eVar7) {
                L5 = new l(5);
                qVar2.h0(L5);
            }
            boolean z12 = z11;
            z0 z0Var4 = z0Var;
            q qVar4 = qVar;
            j7.d(chapterName, p4.q.b(qVar, (ho.l) L5), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, a13, qVar2, 0, 24960, 110588);
            qVar2.p(z12);
            String formattedDuration = ChapterDurationFormatterKt.getFormattedDuration(chapter);
            y0 smRegular400 = echoTheme.getTypography(qVar2, i20).getSmRegular400(qVar2, i24);
            if (iArr[chapterState.ordinal()] == z12) {
                secondary = ib.i.g(1034073534, i20, echoTheme, qVar2, qVar2).getQuaternary(qVar2, i12);
                qVar2.p(false);
            } else {
                secondary = ib.i.g(1034075613, i20, echoTheme, qVar2, qVar2).getSecondary(qVar2, i12);
                qVar2.p(false);
            }
            y0 a14 = y0.a(smRegular400, secondary, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
            Object L6 = qVar2.L();
            if (L6 == eVar7) {
                L6 = new l(6);
                qVar2.h0(L6);
            }
            j7.d(formattedDuration, p4.q.b(qVar4, (ho.l) L6), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, a14, qVar2, 0, 24960, 110588);
            qVar2 = qVar2;
            qVar2.p(z12);
            ChapterDownloadStatusIconKt.ChapterDownloadStatusIcon(chapterOfflineDownloadStatus, aVar, qVar2, (i22 >> 6) & 126);
            r1.d.g(r1.d.I(qVar4, u.P, u.P, echoTheme.getSpacings(qVar2, i20).getX1(), u.P, 11), qVar2);
            boolean ChapterListItem$lambda$1 = ChapterListItem$lambda$1(z0Var4);
            Object L7 = qVar2.L();
            if (L7 == eVar7) {
                z0Var2 = z0Var4;
                L7 = new d0(z0Var2, 20);
                qVar2.h0(L7);
            } else {
                z0Var2 = z0Var4;
            }
            MenuKt.Menu(ChapterListItem$lambda$1, (ho.a) L7, c3.k.d(333512924, z12, new n2(chapterOfflineDownloadStatus, lVar, aVar, z0Var2, 6), qVar2), qVar2, 432);
            qVar2.p(z12);
        } else {
            qVar2.R();
        }
        r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new c3.e(chapter, chapterState, chapterOfflineDownloadStatus, aVar, lVar, aVar2, i10, 9);
        }
    }

    private static final boolean ChapterListItem$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void ChapterListItem$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z ChapterListItem$lambda$4$0(z0 z0Var) {
        ChapterListItem$lambda$2(z0Var, true);
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$5$0$0(Chapter chapter, b0 b0Var) {
        b0Var.getClass();
        y.d(chapter.getChapterName(), b0Var);
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$5$1$0$0$0(b0 b0Var) {
        b0Var.getClass();
        y.b(b0Var);
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$5$1$1$0(b0 b0Var) {
        b0Var.getClass();
        y.b(b0Var);
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$5$2$0(z0 z0Var) {
        ChapterListItem$lambda$2(z0Var, false);
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$5$3(ChapterOfflineDownloadStatus chapterOfflineDownloadStatus, ho.l lVar, ho.a aVar, z0 z0Var, r1.y yVar, m mVar, int i10) {
        boolean z6;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean z10 = chapterOfflineDownloadStatus instanceof ChapterOfflineDownloadStatus.Downloaded;
            u2.e eVar = u2.l.f33918a;
            if (z10) {
                qVar.X(-1616623640);
                int i11 = R.drawable.close;
                String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.swipe_action_remove_download);
                boolean f10 = qVar.f(lVar);
                Object L = qVar.L();
                if (f10 || L == eVar) {
                    L = new d(lVar, z0Var, 0);
                    qVar.h0(L);
                }
                MenuKt.MenuItem(i11, R, (ho.a) L, true, null, qVar, 3072, 16);
                qVar.p(false);
            } else if (chapterOfflineDownloadStatus instanceof ChapterOfflineDownloadStatus.Downloading) {
                qVar.X(-1616612035);
                int i12 = R.drawable.close;
                String R2 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.swipe_action_cancel_download);
                boolean f11 = qVar.f(lVar);
                Object L2 = qVar.L();
                if (f11 || L2 == eVar) {
                    L2 = new d(lVar, z0Var, 1);
                    qVar.h0(L2);
                }
                MenuKt.MenuItem(i12, R2, (ho.a) L2, false, null, qVar, 0, 24);
                qVar.p(false);
            } else if (chapterOfflineDownloadStatus instanceof ChapterOfflineDownloadStatus.NotDownloaded) {
                qVar.X(-1616601713);
                int i13 = R.drawable.download;
                String R3 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.swipe_action_download);
                boolean f12 = qVar.f(aVar);
                Object L3 = qVar.L();
                if (f12 || L3 == eVar) {
                    L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.c(aVar, z0Var, 2);
                    qVar.h0(L3);
                }
                MenuKt.MenuItem(i13, R3, (ho.a) L3, false, null, qVar, 0, 24);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(-1616625755, qVar, false);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$5$3$0$0(ho.l lVar, z0 z0Var) {
        ChapterListItem$lambda$2(z0Var, false);
        lVar.invoke(Boolean.FALSE);
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$5$3$1$0(ho.l lVar, z0 z0Var) {
        ChapterListItem$lambda$2(z0Var, false);
        lVar.invoke(Boolean.TRUE);
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$5$3$2$0(ho.a aVar, z0 z0Var) {
        ChapterListItem$lambda$2(z0Var, false);
        aVar.invoke();
        return z.f31622a;
    }

    public static final z ChapterListItem$lambda$6(Chapter chapter, ChapterState chapterState, ChapterOfflineDownloadStatus chapterOfflineDownloadStatus, ho.a aVar, ho.l lVar, ho.a aVar2, int i10, m mVar, int i11) {
        ChapterListItem(chapter, chapterState, chapterOfflineDownloadStatus, aVar, lVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ChapterListItem(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1020865469);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, c3.k.d(183983645, true, new b(new Chapter(0, 0L, "Chapter 1: The Beginning", 1500L, false, 0L, null, null, 192, null), 0), qVar), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 5);
        }
    }

    public static final z Preview_ChapterListItem$lambda$0(Chapter chapter, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(q.f13017a, qVar);
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
                L = new a(6);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new l(2);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(0);
                qVar.h0(L3);
            }
            ChapterListItem(chapter, chapterState, downloaded, aVar, lVar, (ho.a) L3, qVar, 224304);
            Chapter copy$default = Chapter.copy$default(chapter, 0, 0L, "Chapter 2: The Journey", 0L, false, 0L, null, null, 251, null);
            ChapterState chapterState2 = ChapterState.Future;
            ChapterOfflineDownloadStatus.NotDownloaded notDownloaded = ChapterOfflineDownloadStatus.NotDownloaded.INSTANCE;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new a(1);
                qVar.h0(L4);
            }
            ho.a aVar2 = (ho.a) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new l(3);
                qVar.h0(L5);
            }
            ho.l lVar2 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new a(2);
                qVar.h0(L6);
            }
            ChapterListItem(copy$default, chapterState2, notDownloaded, aVar2, lVar2, (ho.a) L6, qVar, 224304);
            Chapter copy$default2 = Chapter.copy$default(chapter, 0, 0L, "Chapter 3: Downloading", 0L, false, 0L, null, null, 251, null);
            ChapterOfflineDownloadStatus.Downloading downloading = new ChapterOfflineDownloadStatus.Downloading(50);
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new a(3);
                qVar.h0(L7);
            }
            ho.a aVar3 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new l(4);
                qVar.h0(L8);
            }
            ho.l lVar3 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new a(4);
                qVar.h0(L9);
            }
            ChapterListItem(copy$default2, chapterState2, downloading, aVar3, lVar3, (ho.a) L9, qVar, 224304);
            Chapter copy$default3 = Chapter.copy$default(chapter, 0, 0L, "Chapter 4: Past Chapter", 0L, false, 0L, null, null, 251, null);
            ChapterState chapterState3 = ChapterState.Past;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new a(5);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new l(7);
                qVar.h0(L11);
            }
            ho.l lVar4 = (ho.l) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new a(7);
                qVar.h0(L12);
            }
            ChapterListItem(copy$default3, chapterState3, downloaded, aVar4, lVar4, (ho.a) L12, qVar, 224304);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Preview_ChapterListItem$lambda$0$0$1$0(boolean z6) {
        return z.f31622a;
    }

    public static final z Preview_ChapterListItem$lambda$0$0$10$0(boolean z6) {
        return z.f31622a;
    }

    public static final z Preview_ChapterListItem$lambda$0$0$4$0(boolean z6) {
        return z.f31622a;
    }

    public static final z Preview_ChapterListItem$lambda$0$0$7$0(boolean z6) {
        return z.f31622a;
    }

    public static final z Preview_ChapterListItem$lambda$1(int i10, m mVar, int i11) {
        Preview_ChapterListItem(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
