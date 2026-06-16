package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker;

import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"originalAudioVoice", "Lio/elevenlabs/domain/model/Voice;", "stringProvider", "Lio/elevenlabs/domain/StringProvider;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerVoiceKt {
    public static final Voice originalAudioVoice(StringProvider stringProvider) {
        stringProvider.getClass();
        return new Voice("", EffectivePlaybackModeKt.ORIGINAL_AUDIO, stringProvider.getString(R.string.player_voice_picker_original_audio_item_title), null, stringProvider.getString(R.string.player_voice_picker_original_audio_item_subtitle), "", "", "", "", "", false, null, null, VoiceCategory.User, null, null, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, null);
    }
}
