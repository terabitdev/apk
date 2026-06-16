package io.livekit.android.audio;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import com.google.protobuf.c6;
import defpackage.f;
import et.d;
import ho.l;
import io.livekit.android.audio.MixerAudioBufferCallback;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.room.track.Track;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.ScreenCapturerAndroid;
import livekit.org.webrtc.VideoCapturer;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00068"}, d2 = {"Lio/livekit/android/audio/ScreenAudioCapturer;", "Lio/livekit/android/audio/MixerAudioBufferCallback;", "Landroid/media/projection/MediaProjection;", "mediaProjection", "Lkotlin/Function1;", "Landroid/media/AudioPlaybackCaptureConfiguration$Builder;", "Lsn/z;", "Lio/livekit/android/audio/AudioPlaybackCaptureConfigurator;", "captureConfigurator", "<init>", "(Landroid/media/projection/MediaProjection;Lho/l;)V", "", "audioFormat", "getBytesPerSample", "(I)I", "Ljava/nio/ByteBuffer;", "buffer", "", "gain", "adjustByteBuffer", "(Ljava/nio/ByteBuffer;F)V", "Ljava/nio/ShortBuffer;", "adjustShortBuffer", "(Ljava/nio/ShortBuffer;F)V", "Ljava/nio/FloatBuffer;", "adjustFloatBuffer", "(Ljava/nio/FloatBuffer;F)V", "originalBuffer", "channelCount", "sampleRate", "bytesRead", "", "captureTimeNs", "Lio/livekit/android/audio/MixerAudioBufferCallback$BufferResponse;", "onBufferRequest", "(Ljava/nio/ByteBuffer;IIIIJ)Lio/livekit/android/audio/MixerAudioBufferCallback$BufferResponse;", "", "initAudioRecord", "(III)Z", "releaseAudioResources", "()V", "Landroid/media/projection/MediaProjection;", "Lho/l;", "Landroid/media/AudioRecord;", "audioRecord", "Landroid/media/AudioRecord;", "hasInitialized", "Z", "byteBuffer", "Ljava/nio/ByteBuffer;", TokenNames.F, "getGain", "()F", "setGain", "(F)V", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ScreenAudioCapturer extends MixerAudioBufferCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AudioRecord audioRecord;
    private ByteBuffer byteBuffer;
    private final l captureConfigurator;
    private float gain;
    private boolean hasInitialized;
    private final MediaProjection mediaProjection;

    public ScreenAudioCapturer(MediaProjection mediaProjection, l lVar) {
        mediaProjection.getClass();
        lVar.getClass();
        this.mediaProjection = mediaProjection;
        this.captureConfigurator = lVar;
        this.gain = 1.0f;
    }

    private final void adjustByteBuffer(ByteBuffer buffer, float gain) {
        int capacity = buffer.capacity();
        for (int i10 = 0; i10 < capacity; i10++) {
            buffer.put(i10, (byte) ae.l.m(jo.a.y(buffer.get(i10) * gain), -128, 127));
        }
    }

    private final void adjustFloatBuffer(FloatBuffer buffer, float gain) {
        int capacity = buffer.capacity();
        for (int i10 = 0; i10 < capacity; i10++) {
            buffer.put(i10, ae.l.l(buffer.get(i10) * gain, -1.0f, 1.0f));
        }
    }

    private final void adjustShortBuffer(ShortBuffer buffer, float gain) {
        int capacity = buffer.capacity();
        for (int i10 = 0; i10 < capacity; i10++) {
            buffer.put(i10, (short) ae.l.m(jo.a.y(buffer.get(i10) * gain), -32768, 32767));
        }
    }

    private final int getBytesPerSample(int audioFormat) {
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

    public final float getGain() {
        return this.gain;
    }

    public final boolean initAudioRecord(int audioFormat, int channelCount, int sampleRate) {
        AudioPlaybackCaptureConfiguration build;
        int i10;
        AudioRecord.Builder audioPlaybackCaptureConfig;
        h6.a.h();
        AudioPlaybackCaptureConfiguration.Builder b10 = h6.a.b(this.mediaProjection);
        this.captureConfigurator.invoke(b10);
        build = b10.build();
        build.getClass();
        if (channelCount == 1) {
            i10 = 16;
        } else {
            i10 = 12;
        }
        int minBufferSize = AudioRecord.getMinBufferSize(sampleRate, i10, audioFormat);
        if (minBufferSize != -2 && minBufferSize != -1) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.VERBOSE;
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (loggingLevel.compareTo(companion2.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.e(null, f.e(minBufferSize, "AudioRecord.getMinBufferSize: "), new Object[0]);
            }
            int bytesPerSample = (sampleRate / 100) * channelCount * getBytesPerSample(audioFormat);
            ByteBuffer order = ByteBuffer.allocateDirect(bytesPerSample).order(ByteOrder.nativeOrder());
            if (!order.hasArray()) {
                if (LoggingLevel.ERROR.compareTo(companion2.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, "ByteBuffer does not have backing array.", new Object[0]);
                    return false;
                }
            } else {
                this.byteBuffer = order;
                audioPlaybackCaptureConfig = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(audioFormat).setSampleRate(sampleRate).setChannelMask(i10).build()).setBufferSizeInBytes(Math.max(minBufferSize * 2, bytesPerSample)).setAudioPlaybackCaptureConfig(build);
                AudioRecord build2 = audioPlaybackCaptureConfig.build();
                try {
                    build2.startRecording();
                    if (build2.getRecordingState() != 3) {
                        if (LoggingLevel.ERROR.compareTo(companion2.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.b(null, "AudioRecord.startRecording failed - incorrect state: " + build2.getRecordingState(), new Object[0]);
                        }
                    } else {
                        this.audioRecord = build2;
                        return true;
                    }
                } catch (Exception e10) {
                    LKLog.Companion companion3 = LKLog.INSTANCE;
                    if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.b(e10, "AudioRecord.startRecording failed:", new Object[0]);
                    }
                    build2.release();
                    return false;
                }
            }
            return false;
        }
        c6.x(f.e(minBufferSize, "minBuffer size error: "));
        return false;
    }

    @Override // io.livekit.android.audio.MixerAudioBufferCallback
    public MixerAudioBufferCallback.BufferResponse onBufferRequest(ByteBuffer originalBuffer, int audioFormat, int channelCount, int sampleRate, int bytesRead, long captureTimeNs) {
        ByteBuffer byteBuffer;
        originalBuffer.getClass();
        if (!this.hasInitialized && this.audioRecord == null) {
            this.hasInitialized = true;
            initAudioRecord(audioFormat, channelCount, sampleRate);
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null || (byteBuffer = this.byteBuffer) == null) {
            return null;
        }
        audioRecord.read(byteBuffer, byteBuffer.capacity());
        if (Math.abs(this.gain - 1.0f) > 0.01f) {
            byteBuffer.position(0);
            if (audioFormat != 1 && audioFormat != 2) {
                if (audioFormat != 3) {
                    if (audioFormat != 4) {
                        LKLog.Companion companion = LKLog.INSTANCE;
                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.f(null, f.e(audioFormat, "Unsupported audio format: "), new Object[0]);
                        }
                    } else {
                        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
                        asFloatBuffer.getClass();
                        adjustFloatBuffer(asFloatBuffer, this.gain);
                    }
                } else {
                    adjustByteBuffer(byteBuffer, this.gain);
                }
            } else {
                ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                asShortBuffer.getClass();
                adjustShortBuffer(asShortBuffer, this.gain);
            }
        }
        return new MixerAudioBufferCallback.BufferResponse(byteBuffer, null, 2, null);
    }

    public final void releaseAudioResources() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    public final void setGain(float f10) {
        this.gain = f10;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/livekit/android/audio/ScreenAudioCapturer$Companion;", "", "()V", "createFromScreenShareTrack", "Lio/livekit/android/audio/ScreenAudioCapturer;", "track", "Lio/livekit/android/room/track/Track;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ScreenAudioCapturer createFromScreenShareTrack(Track track) {
            LocalVideoTrack localVideoTrack;
            ScreenCapturerAndroid screenCapturerAndroid;
            l lVar = null;
            Object[] objArr = 0;
            if (track instanceof LocalVideoTrack) {
                localVideoTrack = (LocalVideoTrack) track;
            } else {
                localVideoTrack = null;
            }
            if (localVideoTrack == null) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, "Tried to create screen audio capturer but passed track is not a video track: " + track, new Object[0]);
                    return null;
                }
            } else {
                VideoCapturer capturer = localVideoTrack.getCapturer();
                if (capturer instanceof ScreenCapturerAndroid) {
                    screenCapturerAndroid = (ScreenCapturerAndroid) capturer;
                } else {
                    screenCapturerAndroid = null;
                }
                if (screenCapturerAndroid == null) {
                    LKLog.Companion companion2 = LKLog.INSTANCE;
                    if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.b(null, "Tried to create screen audio capturer but passed track does not contain a screen capturer: " + localVideoTrack.getCapturer(), new Object[0]);
                        return null;
                    }
                } else {
                    MediaProjection mediaProjection = screenCapturerAndroid.getMediaProjection();
                    if (mediaProjection == null) {
                        LKLog.Companion companion3 = LKLog.INSTANCE;
                        if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.b(null, "Tried to create screen audio capturer but the capturer doesn't have a media projection. Have you called startCapture?", new Object[0]);
                        }
                    } else {
                        return new ScreenAudioCapturer(mediaProjection, lVar, 2, objArr == true ? 1 : 0);
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScreenAudioCapturer(MediaProjection mediaProjection, l lVar, int i10, kotlin.jvm.internal.f fVar) {
        this(mediaProjection, (i10 & 2) != 0 ? ScreenAudioCapturerKt.DEFAULT_CONFIGURATOR : lVar);
    }
}
