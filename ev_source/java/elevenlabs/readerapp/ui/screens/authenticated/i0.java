package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15784b;

    public /* synthetic */ i0(Object obj, int i10) {
        this.f15783a = i10;
        this.f15784b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z ExploreCollectionScreen$lambda$7$0;
        sn.z NotificationPrimerBottomSheet$lambda$0$0$0;
        int OnboardingScreenUI$lambda$0$0$0$0;
        switch (this.f15783a) {
            case 0:
                ExploreCollectionScreen$lambda$7$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$7$0((u2.z0) this.f15784b);
                return ExploreCollectionScreen$lambda$7$0;
            case 1:
                NotificationPrimerBottomSheet$lambda$0$0$0 = NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheet$lambda$0$0$0((BottomSheetControl) this.f15784b);
                return NotificationPrimerBottomSheet$lambda$0$0$0;
            default:
                OnboardingScreenUI$lambda$0$0$0$0 = OnboardingScreenKt.OnboardingScreenUI$lambda$0$0$0$0((OnboardingState) this.f15784b);
                return Integer.valueOf(OnboardingScreenUI$lambda$0$0$0$0);
        }
    }
}
