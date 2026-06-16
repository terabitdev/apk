package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16398a;

    public /* synthetic */ j(int i10) {
        this.f16398a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda__685450041$lambda$0;
        z lambda_514870909$lambda$0;
        switch (this.f16398a) {
            case 0:
                return Boolean.valueOf(VoicePickerExploreViewModel$produceUiState$1.d((VoicePickerSharedContract.State) obj, (VoicePickerSharedContract.State) obj2));
            case 1:
                lambda__685450041$lambda$0 = ComposableSingletons$PreviewVoiceExploreScreenDataCollectionsDefaultGroupPreviewVoiceExploreScreenDataCollections1Kt.lambda__685450041$lambda$0((m) obj, ((Integer) obj2).intValue());
                return lambda__685450041$lambda$0;
            case 2:
                lambda_514870909$lambda$0 = ComposableSingletons$PreviewVoiceExploreScreenDataCollectionsDefaultGroupPreviewVoiceExploreScreenDataCollectionsKt.lambda_514870909$lambda$0((m) obj, ((Integer) obj2).intValue());
                return lambda_514870909$lambda$0;
            case 3:
                return ComposableSingletons$PreviewVoiceExploreScreenDataFeaturedDefaultGroupPreviewVoiceExploreScreenDataFeatured1Kt.a((m) obj, ((Integer) obj2).intValue());
            case 4:
                return ComposableSingletons$PreviewVoiceExploreScreenDataFeaturedDefaultGroupPreviewVoiceExploreScreenDataFeaturedKt.a((m) obj, ((Integer) obj2).intValue());
            case 5:
                return ComposableSingletons$PreviewVoiceExploreScreenDataGridDefaultGroupPreviewVoiceExploreScreenDataGrid1Kt.a((m) obj, ((Integer) obj2).intValue());
            case 6:
                return ComposableSingletons$PreviewVoiceExploreScreenDataGridDefaultGroupPreviewVoiceExploreScreenDataGridKt.a((m) obj, ((Integer) obj2).intValue());
            case 7:
                return ComposableSingletons$PreviewVoiceExploreScreenDataListDefaultGroupPreviewVoiceExploreScreenDataList1Kt.a((m) obj, ((Integer) obj2).intValue());
            case 8:
                return ComposableSingletons$PreviewVoiceExploreScreenDataListDefaultGroupPreviewVoiceExploreScreenDataListKt.a((m) obj, ((Integer) obj2).intValue());
            case 9:
                return ComposableSingletons$PreviewVoiceExploreScreenErrorDefaultGroupPreviewVoiceExploreScreenError1Kt.a((m) obj, ((Integer) obj2).intValue());
            case 10:
                return ComposableSingletons$PreviewVoiceExploreScreenErrorDefaultGroupPreviewVoiceExploreScreenErrorKt.a((m) obj, ((Integer) obj2).intValue());
            case 11:
                return ComposableSingletons$PreviewVoiceExploreScreenLoadingDefaultGroupPreviewVoiceExploreScreenLoading1Kt.a((m) obj, ((Integer) obj2).intValue());
            default:
                return ComposableSingletons$PreviewVoiceExploreScreenLoadingDefaultGroupPreviewVoiceExploreScreenLoadingKt.a((m) obj, ((Integer) obj2).intValue());
        }
    }
}
