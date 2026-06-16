package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/FavoriteVoicesService;", "", "", "voiceId", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/Voice;", "addFavorite", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "removeFavorite", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface FavoriteVoicesService {
    Object addFavorite(String str, c<? super AsyncCallResult<Voice>> cVar);

    Object removeFavorite(String str, c<? super AsyncCallResult<Voice>> cVar);
}
