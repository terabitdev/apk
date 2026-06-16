package io.elevenlabs.domain.services;

import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\bJ-\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/ExploreVoicesService;", "", "", "readId", "Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/ExploreVoiceSections;", "observeReadExploreVoices", "(Ljava/lang/String;)Lir/i;", "observeHomeExploreVoices", "()Lir/i;", "collectionId", "Lio/elevenlabs/domain/model/VoiceCollectionWithVoices;", "observeVoiceCollection", "(Ljava/lang/String;Ljava/lang/String;)Lir/i;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ExploreVoicesService {
    i observeHomeExploreVoices();

    i observeReadExploreVoices(String readId);

    i observeVoiceCollection(String collectionId);

    i observeVoiceCollection(String collectionId, String readId);
}
