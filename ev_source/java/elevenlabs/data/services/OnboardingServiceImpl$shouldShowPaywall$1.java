package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.q;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.OnboardingServiceImpl$shouldShowPaywall$1", f = "OnboardingServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "hasSeenPaywall", "returnSessionPaywall"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OnboardingServiceImpl$shouldShowPaywall$1 extends yn.i implements q {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    public OnboardingServiceImpl$shouldShowPaywall$1(wn.c<? super OnboardingServiceImpl$shouldShowPaywall$1> cVar) {
        super(3, cVar);
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (wn.c<? super Boolean>) obj3);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean z6;
        boolean z10 = this.Z$0;
        boolean z11 = this.Z$1;
        if (this.label == 0) {
            sn.a.g(obj);
            if (!z10 && !z11) {
                z6 = false;
            } else {
                z6 = true;
            }
            return Boolean.valueOf(z6);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(boolean z6, boolean z10, wn.c<? super Boolean> cVar) {
        OnboardingServiceImpl$shouldShowPaywall$1 onboardingServiceImpl$shouldShowPaywall$1 = new OnboardingServiceImpl$shouldShowPaywall$1(cVar);
        onboardingServiceImpl$shouldShowPaywall$1.Z$0 = z6;
        onboardingServiceImpl$shouldShowPaywall$1.Z$1 = z10;
        return onboardingServiceImpl$shouldShowPaywall$1.invokeSuspend(z.f31622a);
    }
}
