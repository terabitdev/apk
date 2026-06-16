package io.elevenlabs.ui.components;

import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j6;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SliderKt {
    public static final ComposableSingletons$SliderKt INSTANCE = new ComposableSingletons$SliderKt();

    /* renamed from: lambda$-958054878 */
    private static ho.q f667lambda$958054878 = new c3.j(new c0(11), false, -958054878);

    public static final sn.z lambda__958054878$lambda$0(j6 j6Var, u2.m mVar, int i10) {
        boolean z6;
        j6Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 0;
            i3.t o6 = r1.p2.o(BoxShadowKt.boxShadow$default(r1.d.I(i3.q.f13017a, t2.u.P, 2, t2.u.P, t2.u.P, 13), new BoxShadow[]{new BoxShadow(p3.h0.c(419430400), 28, t2.u.P, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), false, 20, null)}, null, false, 6, null), 12);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            r1.p.a(l1.n.h(o6, defpackage.f.b(elevenLabsTheme, qVar, 6), elevenLabsTheme.getShapes(qVar, 6).getFull()), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-958054878$ui_release */
    public final ho.q m1823getLambda$958054878$ui_release() {
        return f667lambda$958054878;
    }
}
