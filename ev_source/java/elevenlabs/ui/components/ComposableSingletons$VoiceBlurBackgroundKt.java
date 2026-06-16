package io.elevenlabs.ui.components;

import com.skydoves.landscapist.transformation.blur.BlurTransformationPlugin;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceBlurBackgroundKt {
    public static final ComposableSingletons$VoiceBlurBackgroundKt INSTANCE = new ComposableSingletons$VoiceBlurBackgroundKt();

    /* renamed from: lambda$-471316193 */
    private static ho.q f669lambda$471316193 = new c3.j(new c0(12), false, -471316193);

    public static final sn.z lambda__471316193$lambda$0(xk.b bVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        bVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(bVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            bVar.f37971a.add(new BlurTransformationPlugin(36));
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-471316193$ui_release */
    public final ho.q m1825getLambda$471316193$ui_release() {
        return f669lambda$471316193;
    }
}
