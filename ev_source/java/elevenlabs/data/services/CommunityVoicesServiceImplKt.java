package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.model.response.FilterOptionResponseModel;
import io.elevenlabs.domain.model.Filter;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/Filter;", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CommunityVoicesServiceImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Filter toDomain(FilterOptionResponseModel filterOptionResponseModel) {
        if (filterOptionResponseModel instanceof FilterOptionResponseModel.Default) {
            FilterOptionResponseModel.Default r32 = (FilterOptionResponseModel.Default) filterOptionResponseModel;
            return new Filter.Default(r32.getKey(), r32.getValue());
        }
        if (filterOptionResponseModel instanceof FilterOptionResponseModel.Accent) {
            FilterOptionResponseModel.Accent accent = (FilterOptionResponseModel.Accent) filterOptionResponseModel;
            return new Filter.Accent(accent.getKey(), accent.getValue(), accent.getLanguage());
        }
        c6.p();
        return null;
    }
}
