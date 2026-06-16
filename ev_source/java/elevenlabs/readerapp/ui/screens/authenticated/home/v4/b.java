package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15700a;

    public /* synthetic */ b(int i10) {
        this.f15700a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        hd.b PreviewHomeScreenV4DefaultGroupDark1$lambda$0;
        hd.b PreviewHomeScreenV4DefaultGroupLight$lambda$0;
        switch (this.f15700a) {
            case 0:
                return ComposableSingletons$HomeScreenV4Kt.f((u2.m) obj, ((Integer) obj2).intValue());
            case 1:
                return ComposableSingletons$HomeScreenV4Kt.e((u2.m) obj, ((Integer) obj2).intValue());
            case 2:
                PreviewHomeScreenV4DefaultGroupDark1$lambda$0 = PreviewHomeScreenV4DefaultGroupDark1Kt.PreviewHomeScreenV4DefaultGroupDark1$lambda$0(((Integer) obj).intValue(), (HomeStateV4) obj2);
                return PreviewHomeScreenV4DefaultGroupDark1$lambda$0;
            default:
                PreviewHomeScreenV4DefaultGroupLight$lambda$0 = PreviewHomeScreenV4DefaultGroupLightKt.PreviewHomeScreenV4DefaultGroupLight$lambda$0(((Integer) obj).intValue(), (HomeStateV4) obj2);
                return PreviewHomeScreenV4DefaultGroupLight$lambda$0;
        }
    }
}
