package io.elevenlabs.data.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.OnboardingServiceImpl", f = "OnboardingServiceImpl.kt", l = {188}, m = "getIntro", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OnboardingServiceImpl$getIntro$1 extends yn.c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnboardingServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingServiceImpl$getIntro$1(OnboardingServiceImpl onboardingServiceImpl, wn.c<? super OnboardingServiceImpl$getIntro$1> cVar) {
        super(cVar);
        this.this$0 = onboardingServiceImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getIntro(this);
    }
}
