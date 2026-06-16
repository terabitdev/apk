package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15787c;

    public /* synthetic */ i1(Object obj, Object obj2, int i10) {
        this.f15785a = i10;
        this.f15786b = obj;
        this.f15787c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        OnboardingState invokeSuspend$lambda$1;
        sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0;
        switch (this.f15785a) {
            case 0:
                invokeSuspend$lambda$1 = OnboardingViewModel$loadVoiceSuggestions$1$1.invokeSuspend$lambda$1((OnboardingViewModel) this.f15786b, (AsyncCallResult.Success) this.f15787c, (OnboardingState) obj);
                return invokeSuspend$lambda$1;
            default:
                DownloadsScreenUI$lambda$7$1$0$1$0$0 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1$0$1$0$0((DownloadsState) this.f15786b, (ho.l) this.f15787c, (t1.t) obj);
                return DownloadsScreenUI$lambda$7$1$0$1$0$0;
        }
    }
}
