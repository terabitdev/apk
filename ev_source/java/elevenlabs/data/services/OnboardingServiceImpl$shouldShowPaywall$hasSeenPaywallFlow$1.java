package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.OnboardingServiceImpl$shouldShowPaywall$hasSeenPaywallFlow$1", f = "OnboardingServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroid/content/SharedPreferences;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OnboardingServiceImpl$shouldShowPaywall$hasSeenPaywallFlow$1 extends yn.i implements p {
    int label;
    final /* synthetic */ OnboardingServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingServiceImpl$shouldShowPaywall$hasSeenPaywallFlow$1(OnboardingServiceImpl onboardingServiceImpl, wn.c<? super OnboardingServiceImpl$shouldShowPaywall$hasSeenPaywallFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = onboardingServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new OnboardingServiceImpl$shouldShowPaywall$hasSeenPaywallFlow$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(SharedPreferences sharedPreferences, wn.c<? super Boolean> cVar) {
        return ((OnboardingServiceImpl$shouldShowPaywall$hasSeenPaywallFlow$1) create(sharedPreferences, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean hasSeenPaywall;
        if (this.label == 0) {
            sn.a.g(obj);
            hasSeenPaywall = this.this$0.getHasSeenPaywall();
            if (!hasSeenPaywall) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
