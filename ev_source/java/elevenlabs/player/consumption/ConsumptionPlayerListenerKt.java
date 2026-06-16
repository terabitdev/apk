package io.elevenlabs.player.consumption;

import io.elevenlabs.domain.model.AudioType;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"resolveEngineAudioType", "Lio/elevenlabs/domain/model/AudioType;", "isReadMediaType", "", "voiceId", "", "player_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConsumptionPlayerListenerKt {
    public static final AudioType resolveEngineAudioType(boolean z6, String str) {
        if (!z6) {
            return AudioType.TTS;
        }
        if (str != null) {
            return AudioType.TTS;
        }
        return AudioType.MEDIA;
    }
}
