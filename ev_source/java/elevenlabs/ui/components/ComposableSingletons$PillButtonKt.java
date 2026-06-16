package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PillButtonKt {
    public static final ComposableSingletons$PillButtonKt INSTANCE = new ComposableSingletons$PillButtonKt();

    /* renamed from: lambda$-728709398 */
    private static ho.p f660lambda$728709398 = new c3.j(new n0(3), false, -728709398);

    public static final sn.z lambda__728709398$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t E = r1.d.E(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM());
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.n(elevenLabsTheme, qVar, 6), i3.d.B0, qVar, 0);
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
            int i11 = R.drawable.email_1;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new m0(14);
                qVar.h0(L);
            }
            PillButtonKt.PillButton("Primary", i11, (ho.a) L, null, null, qVar, 390, 24);
            int i12 = R.drawable.email_1;
            PillButtonVariant pillButtonVariant = PillButtonVariant.Secondary;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new m0(15);
                qVar.h0(L2);
            }
            PillButtonKt.PillButton("Secondary", i12, (ho.a) L2, pillButtonVariant, null, qVar, 3462, 16);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-728709398$ui_release */
    public final ho.p m1816getLambda$728709398$ui_release() {
        return f660lambda$728709398;
    }
}
