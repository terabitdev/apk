package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "onCtaClick", "WhatsNewPopup", "(Lho/a;Lho/a;Lu2/m;I)V", "WhatsNewContent", "(Lho/a;Lu2/m;I)V", "Preview_WhatsNewContent", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class WhatsNewPopupKt {
    public static final void Preview_WhatsNewContent(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(166874039);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$WhatsNewPopupKt.INSTANCE.m1083getLambda$2066394211$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 22);
        }
    }

    public static final sn.z Preview_WhatsNewContent$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_WhatsNewContent(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void WhatsNewContent(ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        ho.a aVar2 = aVar;
        aVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1236071246);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i14 = EchoTheme.$stable;
            if (echoTheme.isDarkMode(qVar, i14)) {
                i12 = R.drawable.whats_new_voice_design_dark;
            } else {
                i12 = R.drawable.whats_new_voice_design_light;
            }
            i3.q qVar2 = i3.q.f13017a;
            i3.t x10 = i4.i0.x(qVar2, "whats-new-popup");
            i3.j jVar = i3.d.C0;
            r1.e eVar = r1.j.f29230c;
            r1.x a10 = r1.w.a(eVar, jVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(x10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c5, qVar);
            int i15 = i11;
            l1.n.c(kd.a.M(i12, qVar, 0), null, p2.f(p2.e(qVar2, 1.0f), 320), null, f4.q.f8839b, t2.u.P, null, qVar, u3.c.$stable | 25008, 104);
            i3.t I = r1.d.I(qVar2, echoTheme.getSpacings(qVar, i14).getX5(), t2.u.P, echoTheme.getSpacings(qVar, i14).getX5(), echoTheme.getSpacings(qVar, i14).getX5(), 2);
            r1.x a11 = r1.w.a(eVar, jVar, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(I, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a11, qVar);
            u2.r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c10, qVar);
            ib.i.z(echoTheme, qVar, i14, qVar2, qVar);
            String R = kj.c.R(qVar, R.string.whats_new_title);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i14);
            int i16 = EchoThemeTypography.$stable;
            s4.y0 lgCompact500 = typography.getLgCompact500(qVar, i16);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i14).getText();
            int i17 = EchoThemeColors.Text.$stable;
            j7.d(R, null, text.getPrimary(qVar, i17), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, lgCompact500, qVar, 0, 0, 130042);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i14).getX2()), qVar);
            j7.d(kj.c.R(qVar, R.string.whats_new_description), null, ib.i.b(i14, i17, echoTheme, qVar, qVar), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i14).getBaseRegular400(qVar, i16), qVar, 0, 0, 130042);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i14).getX6()), qVar);
            aVar2 = aVar;
            EchoButtonKt.m1835EchoButton562pCRU(kj.c.R(qVar, R.string.whats_new_button), aVar2, p2.e(qVar2, 1.0f), EchoButtonVariant.Primary, EchoButtonSize.Large, null, false, false, null, false, false, qVar, ((i15 << 3) & 112) | 28032, 0, 2016);
            qVar = qVar;
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 1);
        }
    }

    public static final sn.z WhatsNewContent$lambda$1(ho.a aVar, int i10, u2.m mVar, int i11) {
        WhatsNewContent(aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void WhatsNewPopup(ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar3;
        int i12;
        int i13;
        aVar.getClass();
        aVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(537134867);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            aVar3 = aVar;
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar3, null, true, null, null, c3.k.d(628931878, true, new i1(0, aVar2), qVar), qVar, ((i11 << 3) & 112) | 1575936, 53);
        } else {
            aVar3 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(aVar3, aVar2, i10, 0);
        }
    }

    public static final sn.z WhatsNewPopup$lambda$0(ho.a aVar, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl) | qVar.f(aVar);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new y0(bottomSheetControl, aVar, 6);
            qVar.h0(L);
        }
        WhatsNewContent((ho.a) L, qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z WhatsNewPopup$lambda$0$0$0(BottomSheetControl bottomSheetControl, ho.a aVar) {
        bottomSheetControl.close();
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z WhatsNewPopup$lambda$1(ho.a aVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        WhatsNewPopup(aVar, aVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
