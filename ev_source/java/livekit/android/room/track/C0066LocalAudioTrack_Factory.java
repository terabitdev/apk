package io.livekit.android.room.track;

import fr.z;
import io.livekit.android.audio.AudioBufferCallbackDispatcher;
import io.livekit.android.audio.AudioProcessingController;
import io.livekit.android.audio.AudioRecordPrewarmer;
import io.livekit.android.audio.AudioRecordSamplesDispatcher;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.track.LocalAudioTrack_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0066LocalAudioTrack_Factory {
    private final rn.a audioBufferCallbackDispatcherProvider;
    private final rn.a audioProcessingControllerProvider;
    private final rn.a audioRecordPrewarmerProvider;
    private final rn.a audioRecordSamplesDispatcherProvider;
    private final rn.a dispatcherProvider;
    private final rn.a rtcThreadTokenProvider;

    public C0066LocalAudioTrack_Factory(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6) {
        this.audioProcessingControllerProvider = aVar;
        this.dispatcherProvider = aVar2;
        this.audioRecordSamplesDispatcherProvider = aVar3;
        this.audioBufferCallbackDispatcherProvider = aVar4;
        this.audioRecordPrewarmerProvider = aVar5;
        this.rtcThreadTokenProvider = aVar6;
    }

    public static C0066LocalAudioTrack_Factory create(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6) {
        return new C0066LocalAudioTrack_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static LocalAudioTrack newInstance(String str, livekit.org.webrtc.AudioTrack audioTrack, LocalAudioTrackOptions localAudioTrackOptions, AudioProcessingController audioProcessingController, z zVar, AudioRecordSamplesDispatcher audioRecordSamplesDispatcher, AudioBufferCallbackDispatcher audioBufferCallbackDispatcher, AudioRecordPrewarmer audioRecordPrewarmer, RTCThreadToken rTCThreadToken) {
        return new LocalAudioTrack(str, audioTrack, localAudioTrackOptions, audioProcessingController, zVar, audioRecordSamplesDispatcher, audioBufferCallbackDispatcher, audioRecordPrewarmer, rTCThreadToken);
    }

    public LocalAudioTrack get(String str, livekit.org.webrtc.AudioTrack audioTrack, LocalAudioTrackOptions localAudioTrackOptions) {
        return newInstance(str, audioTrack, localAudioTrackOptions, (AudioProcessingController) this.audioProcessingControllerProvider.get(), (z) this.dispatcherProvider.get(), (AudioRecordSamplesDispatcher) this.audioRecordSamplesDispatcherProvider.get(), (AudioBufferCallbackDispatcher) this.audioBufferCallbackDispatcherProvider.get(), (AudioRecordPrewarmer) this.audioRecordPrewarmerProvider.get(), (RTCThreadToken) this.rtcThreadTokenProvider.get());
    }
}
