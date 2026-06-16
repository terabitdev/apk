package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16201a;

    public /* synthetic */ k(int i10) {
        this.f16201a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16201a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$PreviewPlayerScreenLoadingHtmlContentDefaultGroupPreviewPlayerScreenLoadingHtmlContentKt.a(mVar, intValue);
            case 1:
                return ComposableSingletons$PreviewPlayerScreenNetworkDisconnectedDefaultGroupPreviewPlayerScreenNetworkDisconnected1Kt.a(mVar, intValue);
            case 2:
                return ComposableSingletons$PreviewPlayerScreenNetworkDisconnectedDefaultGroupPreviewPlayerScreenNetworkDisconnectedKt.a(mVar, intValue);
            case 3:
                return ComposableSingletons$PreviewPlayerScreenNotFollowingContentDefaultGroupPreviewPlayerScreenNotFollowingContentKt.a(mVar, intValue);
            case 4:
                return ComposableSingletons$PreviewPlayerScreenOfflineDefaultGroupPreviewPlayerScreenOfflineKt.a(mVar, intValue);
            case 5:
                return ComposableSingletons$PreviewPlayerScreenPlayerBufferingAndPlayingDefaultGroupPreviewPlayerScreenPlayerBufferingAndPlayingKt.a(mVar, intValue);
            case 6:
                return ComposableSingletons$PreviewPlayerScreenPlayerBufferingNotPlayingDefaultGroupPreviewPlayerScreenPlayerBufferingNotPlayingKt.a(mVar, intValue);
            case 7:
                return ComposableSingletons$PreviewPlayerScreenPlayerReadyAndPlayingDefaultGroupPreviewPlayerScreenPlayerReadyAndPlayingKt.a(mVar, intValue);
            case 8:
                return ComposableSingletons$PreviewPlayerScreenPlayerReadySleepTimerDefaultGroupPreviewPlayerScreenPlayerReadySleepTimerKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewPlayerScreenShowsChaptersAndShareDefaultGroupPreviewPlayerScreenShowsChaptersAndShareKt.a(mVar, intValue);
        }
    }
}
