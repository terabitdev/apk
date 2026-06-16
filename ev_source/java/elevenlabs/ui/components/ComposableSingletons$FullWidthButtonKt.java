package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$FullWidthButtonKt {
    public static final ComposableSingletons$FullWidthButtonKt INSTANCE = new ComposableSingletons$FullWidthButtonKt();

    /* renamed from: lambda$-1133657958 */
    private static ho.p f657lambda$1133657958 = new c3.j(new j(27), false, -1133657958);

    public static final sn.z lambda__1133657958$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t y10 = l1.n.y(i3.q.f13017a, l1.n.x(qVar), true, true);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            i3.t E = r1.d.E(y10, echoTheme.getSpacings(qVar, 6).getX3());
            i3.j jVar = i3.d.C0;
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.m(echoTheme, qVar, 6), jVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            qVar.X(1214711208);
            tn.e eVar = (tn.e) FullWidthButtonVariant.getEntries();
            eVar.getClass();
            int i11 = 9;
            g1.a1 a1Var = new g1.a1(eVar, 9);
            while (a1Var.hasNext()) {
                FullWidthButtonVariant fullWidthButtonVariant = (FullWidthButtonVariant) a1Var.next();
                qVar.X(1214713240);
                tn.e eVar2 = (tn.e) FullWidthButtonSize.getEntries();
                eVar2.getClass();
                g1.a1 a1Var2 = new g1.a1(eVar2, i11);
                while (a1Var2.hasNext()) {
                    FullWidthButtonSize fullWidthButtonSize = (FullWidthButtonSize) a1Var2.next();
                    String str = "Button " + fullWidthButtonVariant + Separators.SLASH + fullWidthButtonSize;
                    int i12 = R.drawable.email_1;
                    Object L = qVar.L();
                    u2.e eVar3 = u2.l.f33918a;
                    if (L == eVar3) {
                        L = new m0(i11);
                        qVar.h0(L);
                    }
                    g1.a1 a1Var3 = a1Var2;
                    FullWidthButtonKt.EchoThemeFullWidthButton(str, (ho.a) L, null, fullWidthButtonSize, fullWidthButtonVariant, Integer.valueOf(i12), false, false, false, qVar, 48, 452);
                    String str2 = "Loading " + fullWidthButtonVariant + Separators.SLASH + fullWidthButtonSize;
                    int i13 = R.drawable.email_1;
                    Object L2 = qVar.L();
                    if (L2 == eVar3) {
                        L2 = new m0(10);
                        qVar.h0(L2);
                    }
                    FullWidthButtonKt.EchoThemeFullWidthButton(str2, (ho.a) L2, null, fullWidthButtonSize, fullWidthButtonVariant, Integer.valueOf(i13), true, false, false, qVar, 1572912, 388);
                    a1Var2 = a1Var3;
                    i11 = 9;
                }
                qVar.p(false);
                i11 = 9;
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1133657958$ui_release */
    public final ho.p m1813getLambda$1133657958$ui_release() {
        return f657lambda$1133657958;
    }
}
