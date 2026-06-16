package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15618a;

    public /* synthetic */ b(int i10) {
        this.f15618a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15618a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$HomeScreenV3Kt.g(mVar, intValue);
            case 1:
                return ComposableSingletons$HomeScreenV3Kt.h(mVar, intValue);
            case 2:
                return ComposableSingletons$HomeScreenV3Kt.f(mVar, intValue);
            case 3:
                return ComposableSingletons$PreviewHomeScreenV3errorDefaultGroupPreviewHomeScreenV3errorKt.a(mVar, intValue);
            case 4:
                return ComposableSingletons$PreviewHomeScreenV3idleDefaultGroupPreviewHomeScreenV3idleKt.a(mVar, intValue);
            case 5:
                return ComposableSingletons$PreviewHomeScreenV3loadedDefaultGroupDark1Kt.a(mVar, intValue);
            case 6:
                return ComposableSingletons$PreviewHomeScreenV3loadedDefaultGroupLightKt.a(mVar, intValue);
            case 7:
                return ComposableSingletons$PreviewHomeScreenV3loadingDefaultGroupPreviewHomeScreenV3loadingKt.a(mVar, intValue);
            case 8:
                return ComposableSingletons$PreviewHomeScreenV3playingDefaultGroupPreviewHomeScreenV3playingKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewHomeScreenV3warningDefaultGroupPreviewHomeScreenV3warningKt.a(mVar, intValue);
        }
    }
}
