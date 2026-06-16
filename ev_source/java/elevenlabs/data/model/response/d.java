package io.elevenlabs.data.model.response;

import io.elevenlabs.data.model.response.ReaderExploreAvailableFiltersResponseModelV2CategoryInner;
import io.elevenlabs.data.model.response.ReaderPublisherProfileResponseModel;
import io.elevenlabs.data.services.optimized.ChapterContentBlob;
import io.elevenlabs.data.services.optimized.ChapterSlotIndexBlob;
import io.elevenlabs.data.services.optimized.OptimizedReadIndexBlob;
import io.elevenlabs.data.worker.OfflineMediaDownloader;
import io.elevenlabs.data.worker.OfflineReadsDownloader;
import io.elevenlabs.di.NetworkModule;
import io.elevenlabs.domain.model.CurrencyUtilsKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14111a;

    public /* synthetic */ d(int i10) {
        this.f14111a = i10;
    }

    @Override // ho.a
    public final Object invoke() {
        boolean c5;
        z zVar;
        z zVar2;
        z zVar3;
        switch (this.f14111a) {
            case 0:
                return ReaderExploreAvailableFiltersResponseModelV2CategoryInner.a();
            case 1:
                return ReaderExploreAvailableFiltersResponseModelV2CategoryInner.Type.a();
            case 2:
                return ReaderPublisherProfileResponseModel.b();
            case 3:
                return ReaderPublisherProfileResponseModel.c();
            case 4:
                return ReaderPublisherProfileResponseModel.a();
            case 5:
                return ReaderPublisherProfileResponseModel.Language.a();
            case 6:
                return ReaderUserConfigResponseModel.a();
            case 7:
                return ReaderUserConfigResponseModel.b();
            case 8:
                return ReaderUserConfigResponseModel.c();
            case 9:
                return ReaderVoicesExploreResponseModelV2.a();
            case 10:
                return ReaderVoicesResponseModel.a();
            case 11:
                return ReadsSection.a();
            case 12:
                return ReadsV2Section.a();
            case 13:
                return ReportLinksResponseModel.a();
            case 14:
                return SampleConfigResponseModel.a();
            case 15:
                return UserReadConversionsResponseModel.a();
            case 16:
                return VoiceCollectionVoicesResponseModel.a();
            case 17:
                return VoiceDesignPreviewsResponse.a();
            case 18:
                return ChapterContentBlob.b();
            case 19:
                return ChapterContentBlob.a();
            case 20:
                return ChapterContentBlob.c();
            case 21:
                return ChapterSlotIndexBlob.a();
            case 22:
                return OptimizedReadIndexBlob.a();
            case 23:
                c5 = OfflineMediaDownloader.c();
                break;
            case 24:
                c5 = OfflineReadsDownloader.a();
                break;
            case 25:
                return NetworkModule.b();
            case 26:
                return CurrencyUtilsKt.a();
            case 27:
                zVar = z.f31622a;
                return zVar;
            case 28:
                zVar2 = z.f31622a;
                return zVar2;
            default:
                zVar3 = z.f31622a;
                return zVar3;
        }
        return Boolean.valueOf(c5);
    }
}
