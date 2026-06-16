package io.livekit.android.audio;

import ae.l;
import defpackage.f;
import et.d;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lio/livekit/android/audio/MixerAudioBufferCallback;", "Lio/livekit/android/audio/AudioBufferCallback;", "<init>", "()V", "Ljava/nio/ByteBuffer;", "original", "addBuffer", "Lsn/z;", "mixByteBuffers", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V", "Ljava/nio/ShortBuffer;", "mixShortBuffers", "(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;)V", "Ljava/nio/FloatBuffer;", "mixFloatBuffers", "(Ljava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V", "buffer", "", "audioFormat", "channelCount", "sampleRate", "bytesRead", "", "captureTimeNs", "onBuffer", "(Ljava/nio/ByteBuffer;IIIIJ)J", "originalBuffer", "Lio/livekit/android/audio/MixerAudioBufferCallback$BufferResponse;", "onBufferRequest", "(Ljava/nio/ByteBuffer;IIIIJ)Lio/livekit/android/audio/MixerAudioBufferCallback$BufferResponse;", "BufferResponse", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class MixerAudioBufferCallback implements AudioBufferCallback {
    private final void mixByteBuffers(ByteBuffer original, ByteBuffer addBuffer) {
        int min = Math.min(original.capacity(), addBuffer.capacity());
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                original.put(i10, (byte) l.m(addBuffer.get(i10) + original.get(i10), -128, 127));
            }
        }
    }

    private final void mixFloatBuffers(FloatBuffer original, FloatBuffer addBuffer) {
        int min = Math.min(original.capacity(), addBuffer.capacity());
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                original.put(i10, l.l(addBuffer.get(i10) + original.get(i10), -1.0f, 1.0f));
            }
        }
    }

    private final void mixShortBuffers(ShortBuffer original, ShortBuffer addBuffer) {
        int min = Math.min(original.capacity(), addBuffer.capacity());
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                original.put(i10, (short) l.m(addBuffer.get(i10) + original.get(i10), -32768, 32767));
            }
        }
    }

    @Override // io.livekit.android.audio.AudioBufferCallback
    public final long onBuffer(ByteBuffer buffer, int audioFormat, int channelCount, int sampleRate, int bytesRead, long captureTimeNs) {
        ByteBuffer byteBuffer;
        Long captureTimeNs2;
        buffer.getClass();
        BufferResponse onBufferRequest = onBufferRequest(buffer, audioFormat, channelCount, sampleRate, bytesRead, captureTimeNs);
        if (onBufferRequest != null) {
            byteBuffer = onBufferRequest.getByteBuffer();
        } else {
            byteBuffer = null;
        }
        if (byteBuffer != null) {
            buffer.order(ByteOrder.nativeOrder()).position(0);
            byteBuffer.order(ByteOrder.nativeOrder()).position(0);
            if (audioFormat != 1 && audioFormat != 2) {
                if (audioFormat != 3) {
                    if (audioFormat != 4) {
                        LKLog.Companion companion = LKLog.INSTANCE;
                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.f(null, f.e(audioFormat, "Unsupported audio format: "), new Object[0]);
                        }
                    } else {
                        FloatBuffer asFloatBuffer = buffer.asFloatBuffer();
                        asFloatBuffer.getClass();
                        FloatBuffer asFloatBuffer2 = byteBuffer.asFloatBuffer();
                        asFloatBuffer2.getClass();
                        mixFloatBuffers(asFloatBuffer, asFloatBuffer2);
                    }
                } else {
                    mixByteBuffers(buffer, byteBuffer);
                }
            } else {
                ShortBuffer asShortBuffer = buffer.asShortBuffer();
                asShortBuffer.getClass();
                ShortBuffer asShortBuffer2 = byteBuffer.asShortBuffer();
                asShortBuffer2.getClass();
                mixShortBuffers(asShortBuffer, asShortBuffer2);
            }
        }
        if (captureTimeNs != 0) {
            return captureTimeNs;
        }
        if (onBufferRequest == null || (captureTimeNs2 = onBufferRequest.getCaptureTimeNs()) == null) {
            return 0L;
        }
        return captureTimeNs2.longValue();
    }

    public abstract BufferResponse onBufferRequest(ByteBuffer originalBuffer, int audioFormat, int channelCount, int sampleRate, int bytesRead, long captureTimeNs);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/livekit/android/audio/MixerAudioBufferCallback$BufferResponse;", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "captureTimeNs", "", "(Ljava/nio/ByteBuffer;Ljava/lang/Long;)V", "getByteBuffer", "()Ljava/nio/ByteBuffer;", "getCaptureTimeNs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class BufferResponse {
        private final ByteBuffer byteBuffer;
        private final Long captureTimeNs;

        public /* synthetic */ BufferResponse(ByteBuffer byteBuffer, Long l4, int i10, kotlin.jvm.internal.f fVar) {
            this((i10 & 1) != 0 ? null : byteBuffer, (i10 & 2) != 0 ? null : l4);
        }

        public final ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        public final Long getCaptureTimeNs() {
            return this.captureTimeNs;
        }

        public BufferResponse(ByteBuffer byteBuffer, Long l4) {
            this.byteBuffer = byteBuffer;
            this.captureTimeNs = l4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BufferResponse() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
