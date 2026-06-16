package io.elevenlabs.data.services;

import io.elevenlabs.data.mapping.VoiceMappingKt;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import io.elevenlabs.domain.model.Voice;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class FavoriteVoicesServiceImpl$addFavorite$2 extends kotlin.jvm.internal.j implements ho.l {
    public static final FavoriteVoicesServiceImpl$addFavorite$2 INSTANCE = new FavoriteVoicesServiceImpl$addFavorite$2();

    public FavoriteVoicesServiceImpl$addFavorite$2() {
        super(1, VoiceMappingKt.class, "toDomain", "toDomain(Lio/elevenlabs/data/model/response/VoiceItemResponseModel;)Lio/elevenlabs/domain/model/Voice;", 1);
    }

    @Override // ho.l
    public final Voice invoke(VoiceItemResponseModel voiceItemResponseModel) {
        voiceItemResponseModel.getClass();
        return VoiceMappingKt.toDomain(voiceItemResponseModel);
    }
}
