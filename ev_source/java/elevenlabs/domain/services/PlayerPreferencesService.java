package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.PlayerPreferences;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/PlayerPreferencesService;", "", "Lir/i;", "Lio/elevenlabs/domain/model/PlayerPreferences;", "getPreferences", "()Lir/i;", "preferences", "Lsn/z;", "updatePreferences", "(Lio/elevenlabs/domain/model/PlayerPreferences;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PlayerPreferencesService {
    i getPreferences();

    Object updatePreferences(PlayerPreferences playerPreferences, c<? super z> cVar);
}
