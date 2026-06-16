package io.livekit.android.audio;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/audio/JavaAudioRecordPrewarmer;", "Lio/livekit/android/audio/AudioRecordPrewarmer;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule;", "audioDeviceModule", "<init>", "(Llivekit/org/webrtc/audio/JavaAudioDeviceModule;)V", "Lsn/z;", "prewarm", "()V", "stop", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class JavaAudioRecordPrewarmer implements AudioRecordPrewarmer {
    private final JavaAudioDeviceModule audioDeviceModule;

    public JavaAudioRecordPrewarmer(JavaAudioDeviceModule javaAudioDeviceModule) {
        javaAudioDeviceModule.getClass();
        this.audioDeviceModule = javaAudioDeviceModule;
    }

    @Override // io.livekit.android.audio.AudioRecordPrewarmer
    public void prewarm() {
        this.audioDeviceModule.prewarmRecording();
    }

    @Override // io.livekit.android.audio.AudioRecordPrewarmer
    public void stop() {
        this.audioDeviceModule.requestStopRecording();
    }
}
