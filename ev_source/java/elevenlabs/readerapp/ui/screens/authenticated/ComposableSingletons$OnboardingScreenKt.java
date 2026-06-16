package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$OnboardingScreenKt {
    public static final ComposableSingletons$OnboardingScreenKt INSTANCE = new ComposableSingletons$OnboardingScreenKt();

    /* renamed from: lambda$-1050809806 */
    private static ho.q f185lambda$1050809806 = new c3.j(new c(5), false, -1050809806);
    private static ho.q lambda$280739419 = new c3.j(new c(6), false, 280739419);

    public static final sn.z lambda_280739419$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            OnboardingScreenKt.SectionHeader(kj.c.R(qVar, R.string.voice_onboarding_elevenlabs_voices), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1050809806$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            OnboardingScreenKt.SectionHeader(kj.c.R(qVar, R.string.voice_onboarding_iconic_voices), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1050809806$app_productionRelease */
    public final ho.q m1194getLambda$1050809806$app_productionRelease() {
        return f185lambda$1050809806;
    }

    public final ho.q getLambda$280739419$app_productionRelease() {
        return lambda$280739419;
    }
}
