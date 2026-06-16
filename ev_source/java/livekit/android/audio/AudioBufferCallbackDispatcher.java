package io.livekit.android.audio;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/livekit/android/audio/AudioBufferCallbackDispatcher;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$AudioBufferCallback;", "()V", "bufferCallback", "Lio/livekit/android/audio/AudioBufferCallback;", "getBufferCallback", "()Lio/livekit/android/audio/AudioBufferCallback;", "setBufferCallback", "(Lio/livekit/android/audio/AudioBufferCallback;)V", "onBuffer", "", "buffer", "Ljava/nio/ByteBuffer;", "audioFormat", "", "channelCount", "sampleRate", "bytesRead", "captureTimeNs", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AudioBufferCallbackDispatcher implements JavaAudioDeviceModule.AudioBufferCallback {
    private AudioBufferCallback bufferCallback;

    public final AudioBufferCallback getBufferCallback() {
        return this.bufferCallback;
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioBufferCallback
    public long onBuffer(ByteBuffer buffer, int audioFormat, int channelCount, int sampleRate, int bytesRead, long captureTimeNs) {
        buffer.getClass();
        AudioBufferCallback audioBufferCallback = this.bufferCallback;
        if (audioBufferCallback != null) {
            return audioBufferCallback.onBuffer(buffer, audioFormat, channelCount, sampleRate, bytesRead, captureTimeNs);
        }
        return 0L;
    }

    public final void setBufferCallback(AudioBufferCallback audioBufferCallback) {
        this.bufferCallback = audioBufferCallback;
    }
}
