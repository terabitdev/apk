package io.elevenlabs.data.services;

import io.elevenlabs.data.model.response.GenerateReferralResponse;
import io.elevenlabs.data.model.response.GetAccountResponse;
import io.elevenlabs.data.model.response.GetMessageResponseModel;
import io.elevenlabs.data.model.response.GetSoundscapesResponse;
import io.elevenlabs.data.model.response.ReaderUserConfigResponseModel;
import io.elevenlabs.data.model.response.ReportLinksResponseModel;
import io.elevenlabs.data.model.response.VoiceDesignCreateVoiceResponse;
import io.elevenlabs.data.model.response.VoiceDesignPreviewsResponse;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import io.elevenlabs.domain.model.AccountPage;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14125a;

    public /* synthetic */ h(int i10) {
        this.f14125a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AccountPage account$lambda$0;
        switch (this.f14125a) {
            case 0:
                return ReferralServiceImpl.b((GenerateReferralResponse) obj);
            case 1:
                account$lambda$0 = RestAccountService.getAccount$lambda$0((GetAccountResponse) obj);
                return account$lambda$0;
            case 2:
                return RestAppConfigService.a((ReportLinksResponseModel) obj);
            case 3:
                return RestMessagesService.a((GetMessageResponseModel) obj);
            case 4:
                return RestUserConfigService.a((ReaderUserConfigResponseModel) obj);
            case 5:
                return SoundscapeDownloader.b(((Byte) obj).byteValue());
            case 6:
                return SoundscapesServiceImpl.a((GetSoundscapesResponse) obj);
            case 7:
                return VoiceDesignServiceImpl.a((VoiceDesignPreviewsResponse) obj);
            case 8:
                return VoiceDesignServiceImpl.b((VoiceDesignCreateVoiceResponse) obj);
            default:
                return VoicesServiceImpl.a((VoiceItemResponseModel) obj);
        }
    }
}
