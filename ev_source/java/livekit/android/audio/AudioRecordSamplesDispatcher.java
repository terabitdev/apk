package io.livekit.android.audio;

import android.os.SystemClock;
import com.google.protobuf.c6;
import defpackage.f;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.AudioTrackSink;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/livekit/android/audio/AudioRecordSamplesDispatcher;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;", "<init>", "()V", "", "audioFormat", "getBytesPerSample", "(I)I", "Llivekit/org/webrtc/AudioTrackSink;", "sink", "Lsn/z;", "registerSink", "(Llivekit/org/webrtc/AudioTrackSink;)V", "unregisterSink", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$AudioSamples;", "samples", "onWebRtcAudioRecordSamplesReady", "(Llivekit/org/webrtc/audio/JavaAudioDeviceModule$AudioSamples;)V", "", "sinks", "Ljava/util/Set;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AudioRecordSamplesDispatcher implements JavaAudioDeviceModule.SamplesReadyCallback {
    private final Set<AudioTrackSink> sinks = new LinkedHashSet();

    private final int getBytesPerSample(int audioFormat) {
        if (audioFormat != 0) {
            int i10 = 1;
            if (audioFormat != 1 && audioFormat != 2) {
                if (audioFormat != 3) {
                    i10 = 4;
                    if (audioFormat != 4) {
                        if (audioFormat != 13) {
                            c6.t(f.e(audioFormat, "Bad audio format "));
                            return 0;
                        }
                    }
                }
                return i10;
            }
            return 2;
        }
        c6.t(f.e(audioFormat, "Bad audio format "));
        return 0;
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public synchronized void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples samples) {
        samples.getClass();
        int bytesPerSample = getBytesPerSample(samples.getAudioFormat()) * 8;
        int sampleRate = samples.getSampleRate() / 100;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<AudioTrackSink> it = this.sinks.iterator();
        while (it.hasNext()) {
            it.next().onData(ByteBuffer.wrap(samples.getData()), bytesPerSample, samples.getSampleRate(), samples.getChannelCount(), sampleRate, elapsedRealtime);
        }
    }

    public final synchronized void registerSink(AudioTrackSink sink) {
        sink.getClass();
        this.sinks.add(sink);
    }

    public final synchronized void unregisterSink(AudioTrackSink sink) {
        sink.getClass();
        this.sinks.remove(sink);
    }
}
