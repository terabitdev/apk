package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import i3.t;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.echo.components.ButtonIconContainerSize;
import io.elevenlabs.ui.echo.components.ButtonIconKt;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.c3;
import r1.d2;
import r1.i1;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "title", "author", "", "titleVisible", "showShareButton", "Lkotlin/Function0;", "Lsn/z;", "onClickBack", "onClickShare", "onClickMoreActions", "Li3/t;", "modifier", "PlayerHeader", "(Ljava/lang/String;Ljava/lang/String;ZZLho/a;Lho/a;Lho/a;Li3/t;Lu2/m;II)V", "Preview_PlayerHeader", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlayerHeader(String str, String str2, boolean z6, boolean z10, ho.a aVar, ho.a aVar2, ho.a aVar3, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z11;
        q qVar;
        boolean z12;
        String str3;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str4 = str;
        str4.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(375194097);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str4)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.g(z6)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.g(z10)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(aVar2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        if ((1572864 & i10) == 0) {
            if (qVar2.h(aVar3)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        int i21 = i11 & 128;
        if (i21 != 0) {
            i12 |= 12582912;
        } else if ((12582912 & i10) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i12 |= i13;
            if ((4793491 & i12) == 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar2.O(i12 & 1, z11)) {
                i3.q qVar3 = i3.q.f13017a;
                if (i21 != 0) {
                    tVar4 = qVar3;
                } else {
                    tVar4 = tVar2;
                }
                String R = kj.c.R(qVar2, R.string.accessibility_go_back);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i22 = EchoTheme.$stable;
                t tVar5 = tVar4;
                t t10 = r1.d.t(r1.d.I(tVar4, u.P, echoTheme.getSpacings(qVar2, i22).getX4(), u.P, u.P, 13), i1.f29224a);
                int i23 = i12;
                x a10 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(t10, qVar2);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                h4.e eVar = g.f11907f;
                r.J(eVar, a10, qVar2);
                h4.e eVar2 = g.f11906e;
                r.J(eVar2, l4, qVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = g.f11908g;
                r.y(qVar2, valueOf, eVar3);
                h4.d dVar = g.f11909h;
                r.F(dVar, qVar2);
                h4.e eVar4 = g.f11905d;
                r.J(eVar4, c5, qVar2);
                WeakHashMap weakHashMap = c3.f29142x;
                r1.d.g(r1.d.p(r1.d.Q(u0.e(qVar2).f29149g), u0.e(qVar2).f29149g), qVar2);
                double d10 = 1.0f;
                if (d10 <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t I = r1.d.I(new m1(1.0f, true), echoTheme.getSpacings(qVar2, i22).getX4(), u.P, echoTheme.getSpacings(qVar2, i22).getX4(), echoTheme.getSpacings(qVar2, i22).getX3(), 2);
                k2 a11 = i2.a(j.f29228a, i3.d.f13004y0, qVar2, 0);
                int hashCode2 = Long.hashCode(qVar2.T);
                o l7 = qVar2.l();
                t c10 = i3.a.c(I, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(eVar, a11, qVar2);
                r.J(eVar2, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                r.J(eVar4, c10, qVar2);
                int i24 = R.drawable.ic_chevron_bottom;
                float f10 = 20;
                float x32 = echoTheme.getSpacings(qVar2, i22).getX3();
                ButtonIconContainerSize.WrapIcon wrapIcon = new ButtonIconContainerSize.WrapIcon(new d2(x32, x32, x32, x32));
                int i25 = i23 >> 6;
                int i26 = ButtonIconContainerSize.WrapIcon.$stable << 18;
                ButtonIconKt.m1961ButtonIconFhKo8ac(i24, R, aVar, null, f10, 0L, wrapIcon, null, false, qVar2, (i25 & 896) | 24576 | i26, 424);
                q qVar4 = qVar2;
                r1.d.g(p2.s(qVar3, echoTheme.getSpacings(qVar4, i22).getX2()), qVar4);
                if (d10 <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t c11 = p2.c(new m1(1.0f, true), 1.0f);
                f1 d11 = p.d(i3.d.f12997a, false);
                int hashCode3 = Long.hashCode(qVar4.T);
                o l10 = qVar4.l();
                t c12 = i3.a.c(c11, qVar4);
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                r.J(eVar, d11, qVar4);
                r.J(eVar2, l10, qVar4);
                defpackage.f.u(hashCode3, qVar4, eVar3, qVar4, dVar);
                r.J(eVar4, c12, qVar4);
                str4 = str;
                str3 = str2;
                z12 = z6;
                AnimatedVisibilityContainersKt.AnimatedSlideDownWithFadeVisibility(z12, k.d(520897545, true, new f5.b(1, str4, str3), qVar4), qVar4, (i25 & 14) | 48);
                qVar4.p(true);
                if (z10) {
                    qVar4.X(355532599);
                    int i27 = R.drawable.ic_arrow_out_of_box;
                    float x33 = echoTheme.getSpacings(qVar4, i22).getX3();
                    ButtonIconKt.m1961ButtonIconFhKo8ac(i27, kj.c.R(qVar4, io.elevenlabs.readerapp.R.string.share_read_title), aVar2, null, f10, 0L, new ButtonIconContainerSize.WrapIcon(new d2(x33, x33, x33, x33)), null, false, qVar4, ((i23 >> 9) & 896) | 24576 | i26, 424);
                    qVar4 = qVar4;
                    qVar4.p(false);
                } else {
                    qVar4.X(355977015);
                    qVar4.p(false);
                }
                int i28 = R.drawable.ic_dot_grid_1x3_horizontal;
                float x34 = echoTheme.getSpacings(qVar4, i22).getX3();
                q qVar5 = qVar4;
                ButtonIconKt.m1961ButtonIconFhKo8ac(i28, kj.c.R(qVar4, io.elevenlabs.readerapp.R.string.player_accessibility_more), aVar3, null, f10, 0L, new ButtonIconContainerSize.WrapIcon(new d2(x34, x34, x34, x34)), null, false, qVar5, ((i23 >> 12) & 896) | 24576 | i26, 424);
                qVar = qVar5;
                qVar.p(true);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar = qVar2;
                z12 = z6;
                str3 = str2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.m(str4, str3, z12, z10, aVar, aVar2, aVar3, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((4793491 & i12) == 4793490) {
        }
        if (!qVar2.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z PlayerHeader$lambda$0$0$0$0(String str, String str2, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t d10 = p2.d(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29232e, i3.d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(d10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i11);
            int i12 = EchoThemeTypography.$stable;
            j7.d(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, typography.getBaseRegular500(qVar, i12), qVar, 0, 24960, 110590);
            q qVar2 = qVar;
            if (str2 != null && str2.length() != 0) {
                qVar2.X(830924909);
                j7.d(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, y0.a(echoTheme.getTypography(qVar2, i11).getSmRegular400(qVar2, i12), echoTheme.getColors(qVar2, i11).getText().getSecondary(qVar2, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar2, 0, 24960, 110590);
                qVar2 = qVar2;
                qVar2.p(false);
            } else {
                qVar2.X(831321647);
                qVar2.p(false);
            }
            qVar2.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PlayerHeader$lambda$1(String str, String str2, boolean z6, boolean z10, ho.a aVar, ho.a aVar2, ho.a aVar3, t tVar, int i10, int i11, m mVar, int i12) {
        PlayerHeader(str, str2, z6, z10, aVar, aVar2, aVar3, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_PlayerHeader(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1786098399);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(1);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(2);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new d(3);
                qVar.h0(L3);
            }
            PlayerHeader("The Great Gatsby", "F. Scott Fitzgerald", true, true, aVar, aVar2, (ho.a) L3, null, qVar, 1797558, 128);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 5);
        }
    }

    public static final z Preview_PlayerHeader$lambda$3(int i10, m mVar, int i11) {
        Preview_PlayerHeader(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
