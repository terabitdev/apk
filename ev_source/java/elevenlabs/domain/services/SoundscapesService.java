package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Soundscape;
import ir.i;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/SoundscapesService;", "", "Lio/elevenlabs/domain/model/AsyncCallResult;", "", "Lio/elevenlabs/domain/model/Soundscape;", "getSoundscapes", "(Lwn/c;)Ljava/lang/Object;", "soundscape", "Lir/i;", "Lio/elevenlabs/domain/services/SoundscapeDownloadState;", "downloadSoundscape", "(Lio/elevenlabs/domain/model/Soundscape;)Lir/i;", "", "isCached", "(Lio/elevenlabs/domain/model/Soundscape;)Z", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface SoundscapesService {
    i downloadSoundscape(Soundscape soundscape);

    Object getSoundscapes(c<? super AsyncCallResult<List<Soundscape>>> cVar);

    boolean isCached(Soundscape soundscape);
}
