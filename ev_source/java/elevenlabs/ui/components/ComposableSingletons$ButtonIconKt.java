package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ButtonIconKt {
    public static final ComposableSingletons$ButtonIconKt INSTANCE = new ComposableSingletons$ButtonIconKt();

    /* renamed from: lambda$-1964299783 */
    private static ho.q f640lambda$1964299783 = new c3.j(new c0(7), false, -1964299783);

    public static final sn.z lambda__1964299783$lambda$0(r1.v0 v0Var, u2.m mVar, int i10) {
        boolean z6;
        v0Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            tn.e eVar = (tn.e) ButtonIconVariant.getEntries();
            eVar.getClass();
            g1.a1 a1Var = new g1.a1(eVar, 9);
            while (a1Var.hasNext()) {
                ButtonIconVariant buttonIconVariant = (ButtonIconVariant) a1Var.next();
                qVar.X(2093521655);
                tn.e eVar2 = (tn.e) ButtonIconSize.getEntries();
                eVar2.getClass();
                g1.a1 a1Var2 = new g1.a1(eVar2, 9);
                while (a1Var2.hasNext()) {
                    ButtonIconSize buttonIconSize = (ButtonIconSize) a1Var2.next();
                    int i11 = R.drawable.apple;
                    Object L = qVar.L();
                    u2.e eVar3 = u2.l.f33918a;
                    if (L == eVar3) {
                        L = new a(20);
                        qVar.h0(L);
                    }
                    ButtonIconKt.ButtonIcon(i11, "Button that does something", (ho.a) L, null, buttonIconVariant, buttonIconSize, false, false, false, qVar, 432, 456);
                    float f10 = 4;
                    i3.q qVar2 = i3.q.f13017a;
                    r1.p.a(r1.p2.f(qVar2, f10), qVar, 6);
                    int i12 = R.drawable.apple;
                    Object L2 = qVar.L();
                    if (L2 == eVar3) {
                        L2 = new a(21);
                        qVar.h0(L2);
                    }
                    ButtonIconKt.ButtonIcon(i12, "Button that does something", (ho.a) L2, null, buttonIconVariant, buttonIconSize, true, false, false, qVar, 1573296, 392);
                    r1.p.a(r1.p2.f(qVar2, f10), qVar, 6);
                }
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1964299783$ui_release */
    public final ho.q m1796getLambda$1964299783$ui_release() {
        return f640lambda$1964299783;
    }
}
