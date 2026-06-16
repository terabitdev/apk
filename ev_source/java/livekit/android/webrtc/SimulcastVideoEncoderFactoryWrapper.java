package io.livekit.android.webrtc;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.webrtc.SimulcastVideoEncoderFactoryWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.HardwareVideoEncoderFactory;
import livekit.org.webrtc.SimulcastVideoEncoderFactory;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoCodecStatus;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.VideoEncoderFallback;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.WrappedNativeVideoEncoder;
import p.n;
import tn.o;
import tn.p;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper;", "Llivekit/org/webrtc/VideoEncoderFactory;", "sharedContext", "Llivekit/org/webrtc/EglBase$Context;", "enableIntelVp8Encoder", "", "enableH264HighProfile", "(Llivekit/org/webrtc/EglBase$Context;ZZ)V", "fallback", "native", "Llivekit/org/webrtc/SimulcastVideoEncoderFactory;", "primary", "createEncoder", "Llivekit/org/webrtc/VideoEncoder;", ParameterNames.INFO, "Llivekit/org/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Llivekit/org/webrtc/VideoCodecInfo;", "FallbackFactory", "HashableVideoCodecInfo", "StreamEncoderWrapper", "StreamEncoderWrapperFactory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class SimulcastVideoEncoderFactoryWrapper implements VideoEncoderFactory {
    private final VideoEncoderFactory fallback;
    private final SimulcastVideoEncoderFactory native;
    private final VideoEncoderFactory primary;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;", "Llivekit/org/webrtc/VideoEncoderFactory;", "hardwareVideoEncoderFactory", "(Llivekit/org/webrtc/VideoEncoderFactory;)V", "softwareVideoEncoderFactory", "createEncoder", "Llivekit/org/webrtc/VideoEncoder;", ParameterNames.INFO, "Llivekit/org/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Llivekit/org/webrtc/VideoCodecInfo;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class FallbackFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory hardwareVideoEncoderFactory;
        private final VideoEncoderFactory softwareVideoEncoderFactory;

        public FallbackFactory(VideoEncoderFactory videoEncoderFactory) {
            videoEncoderFactory.getClass();
            this.hardwareVideoEncoderFactory = videoEncoderFactory;
            this.softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
        }

        @Override // livekit.org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo r32) {
            r32.getClass();
            VideoEncoder createEncoder = this.softwareVideoEncoderFactory.createEncoder(r32);
            VideoEncoder createEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(r32);
            if (createEncoder2 != null && createEncoder != null) {
                return new VideoEncoderFallback(createEncoder2, createEncoder);
            }
            if (createEncoder == null) {
                return createEncoder2;
            }
            return createEncoder;
        }

        @Override // livekit.org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            ArrayList arrayList = new ArrayList();
            VideoCodecInfo[] supportedCodecs = this.softwareVideoEncoderFactory.getSupportedCodecs();
            supportedCodecs.getClass();
            o.h0(arrayList, supportedCodecs);
            VideoCodecInfo[] supportedCodecs2 = this.hardwareVideoEncoderFactory.getSupportedCodecs();
            supportedCodecs2.getClass();
            o.h0(arrayList, supportedCodecs2);
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u001a\u0010(\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u00060"}, d2 = {"Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;", "Llivekit/org/webrtc/VideoEncoder;", "encoder", "(Llivekit/org/webrtc/VideoEncoder;)V", "executor", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "streamSettings", "Llivekit/org/webrtc/VideoEncoder$Settings;", "getStreamSettings", "()Llivekit/org/webrtc/VideoEncoder$Settings;", "setStreamSettings", "(Llivekit/org/webrtc/VideoEncoder$Settings;)V", "createNative", "", "webrtcEnvRef", "encode", "Llivekit/org/webrtc/VideoCodecStatus;", "frame", "Llivekit/org/webrtc/VideoFrame;", "encodeInfo", "Llivekit/org/webrtc/VideoEncoder$EncodeInfo;", "getEncoderInfo", "Llivekit/org/webrtc/VideoEncoder$EncoderInfo;", "getImplementationName", "", "getResolutionBitrateLimits", "", "Llivekit/org/webrtc/VideoEncoder$ResolutionBitrateLimits;", "()[Llivekit/org/webrtc/VideoEncoder$ResolutionBitrateLimits;", "getScalingSettings", "Llivekit/org/webrtc/VideoEncoder$ScalingSettings;", "initEncode", "settings", "callback", "Llivekit/org/webrtc/VideoEncoder$Callback;", "isHardwareEncoder", "", "release", "setRateAllocation", "allocation", "Llivekit/org/webrtc/VideoEncoder$BitrateAllocation;", "frameRate", "", "setRates", "rcParameters", "Llivekit/org/webrtc/VideoEncoder$RateControlParameters;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class StreamEncoderWrapper implements VideoEncoder {
        private final VideoEncoder encoder;
        private final ExecutorService executor;
        private VideoEncoder.Settings streamSettings;

        public StreamEncoderWrapper(VideoEncoder videoEncoder) {
            videoEncoder.getClass();
            this.encoder = videoEncoder;
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            newSingleThreadExecutor.getClass();
            this.executor = newSingleThreadExecutor;
        }

        public static final Long createNative$lambda$7(StreamEncoderWrapper streamEncoderWrapper, long j4) {
            streamEncoderWrapper.getClass();
            return Long.valueOf(streamEncoderWrapper.encoder.createNative(j4));
        }

        public static final VideoCodecStatus encode$lambda$3(StreamEncoderWrapper streamEncoderWrapper, VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
            streamEncoderWrapper.getClass();
            videoFrame.getClass();
            if (streamEncoderWrapper.streamSettings == null) {
                return streamEncoderWrapper.encoder.encode(videoFrame, encodeInfo);
            }
            int width = videoFrame.getBuffer().getWidth();
            VideoEncoder.Settings settings = streamEncoderWrapper.streamSettings;
            settings.getClass();
            if (width == settings.width) {
                return streamEncoderWrapper.encoder.encode(videoFrame, encodeInfo);
            }
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            int width2 = buffer.getWidth();
            int height = buffer.getHeight();
            VideoEncoder.Settings settings2 = streamEncoderWrapper.streamSettings;
            settings2.getClass();
            int i10 = settings2.width;
            VideoEncoder.Settings settings3 = streamEncoderWrapper.streamSettings;
            settings3.getClass();
            VideoFrame.Buffer cropAndScale = buffer.cropAndScale(0, 0, width2, height, i10, settings3.height);
            VideoCodecStatus encode = streamEncoderWrapper.encoder.encode(new VideoFrame(cropAndScale, videoFrame.getRotation(), videoFrame.getTimestampNs()), encodeInfo);
            cropAndScale.release();
            return encode;
        }

        public static final VideoEncoder.EncoderInfo getEncoderInfo$lambda$11(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.getEncoderInfo();
        }

        public static final String getImplementationName$lambda$6(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.getImplementationName();
        }

        public static final VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits$lambda$10(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.getResolutionBitrateLimits();
        }

        public static final VideoEncoder.ScalingSettings getScalingSettings$lambda$5(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.getScalingSettings();
        }

        public static final VideoCodecStatus initEncode$lambda$1(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            streamEncoderWrapper.getClass();
            settings.getClass();
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.c(null, wq.o.K("initEncode() thread=" + Thread.currentThread().getName() + " [" + Thread.currentThread().getId() + "]\n                |  encoder=" + streamEncoderWrapper.encoder.getImplementationName() + "\n                |  streamSettings:\n                |    numberOfCores=" + settings.numberOfCores + "\n                |    width=" + settings.width + "\n                |    height=" + settings.height + "\n                |    startBitrate=" + settings.startBitrate + "\n                |    maxFramerate=" + settings.maxFramerate + "\n                |    automaticResizeOn=" + settings.automaticResizeOn + "\n                |    numberOfSimulcastStreams=" + settings.numberOfSimulcastStreams + "\n                |    lossNotification=" + settings.capabilities.lossNotification + "\n                        "), new Object[0]);
            }
            return streamEncoderWrapper.encoder.initEncode(settings, callback);
        }

        public static final Boolean isHardwareEncoder$lambda$8(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return Boolean.valueOf(streamEncoderWrapper.encoder.isHardwareEncoder());
        }

        public static final VideoCodecStatus release$lambda$2(StreamEncoderWrapper streamEncoderWrapper) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.release();
        }

        public static final VideoCodecStatus setRateAllocation$lambda$4(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.BitrateAllocation bitrateAllocation, int i10) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.setRateAllocation(bitrateAllocation, i10);
        }

        public static final VideoCodecStatus setRates$lambda$9(StreamEncoderWrapper streamEncoderWrapper, VideoEncoder.RateControlParameters rateControlParameters) {
            streamEncoderWrapper.getClass();
            return streamEncoderWrapper.encoder.setRates(rateControlParameters);
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public long createNative(final long webrtcEnvRef) {
            Object obj = this.executor.submit(new Callable() { // from class: io.livekit.android.webrtc.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Long createNative$lambda$7;
                    createNative$lambda$7 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.createNative$lambda$7(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.this, webrtcEnvRef);
                    return createNative$lambda$7;
                }
            }).get();
            obj.getClass();
            return ((Number) obj).longValue();
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public VideoCodecStatus encode(VideoFrame frame, VideoEncoder.EncodeInfo encodeInfo) {
            frame.getClass();
            Object obj = this.executor.submit(new e(this, frame, encodeInfo, 0)).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public VideoEncoder.EncoderInfo getEncoderInfo() {
            Object obj = this.executor.submit(new a(this, 3)).get();
            obj.getClass();
            return (VideoEncoder.EncoderInfo) obj;
        }

        public final ExecutorService getExecutor() {
            return this.executor;
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public String getImplementationName() {
            Object obj = this.executor.submit(new a(this, 1)).get();
            obj.getClass();
            return (String) obj;
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
            Object obj = this.executor.submit(new a(this, 2)).get();
            obj.getClass();
            return (VideoEncoder.ResolutionBitrateLimits[]) obj;
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public VideoEncoder.ScalingSettings getScalingSettings() {
            Object obj = this.executor.submit(new a(this, 0)).get();
            obj.getClass();
            return (VideoEncoder.ScalingSettings) obj;
        }

        public final VideoEncoder.Settings getStreamSettings() {
            return this.streamSettings;
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            settings.getClass();
            this.streamSettings = settings;
            Object obj = this.executor.submit(new e(this, settings, callback, 1)).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public boolean isHardwareEncoder() {
            Object obj = this.executor.submit(new a(this, 4)).get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public VideoCodecStatus release() {
            Object obj = this.executor.submit(new a(this, 5)).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation allocation, final int frameRate) {
            Object obj = this.executor.submit(new Callable() { // from class: io.livekit.android.webrtc.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    VideoCodecStatus rateAllocation$lambda$4;
                    rateAllocation$lambda$4 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.setRateAllocation$lambda$4(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.this, allocation, frameRate);
                    return rateAllocation$lambda$4;
                }
            }).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        @Override // livekit.org.webrtc.VideoEncoder
        public VideoCodecStatus setRates(final VideoEncoder.RateControlParameters rcParameters) {
            Object obj = this.executor.submit(new Callable() { // from class: io.livekit.android.webrtc.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    VideoCodecStatus rates$lambda$9;
                    rates$lambda$9 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.setRates$lambda$9(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.this, rcParameters);
                    return rates$lambda$9;
                }
            }).get();
            obj.getClass();
            return (VideoCodecStatus) obj;
        }

        public final void setStreamSettings(VideoEncoder.Settings settings) {
            this.streamSettings = settings;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;", "Llivekit/org/webrtc/VideoEncoderFactory;", "factory", "(Llivekit/org/webrtc/VideoEncoderFactory;)V", "createEncoder", "Llivekit/org/webrtc/VideoEncoder;", "videoCodecInfo", "Llivekit/org/webrtc/VideoCodecInfo;", "getSupportedCodecs", "", "()[Llivekit/org/webrtc/VideoCodecInfo;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class StreamEncoderWrapperFactory implements VideoEncoderFactory {
        private final VideoEncoderFactory factory;

        public StreamEncoderWrapperFactory(VideoEncoderFactory videoEncoderFactory) {
            videoEncoderFactory.getClass();
            this.factory = videoEncoderFactory;
        }

        @Override // livekit.org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
            VideoEncoder createEncoder = this.factory.createEncoder(videoCodecInfo);
            if (createEncoder == null) {
                return null;
            }
            if (createEncoder instanceof WrappedNativeVideoEncoder) {
                return createEncoder;
            }
            return new StreamEncoderWrapper(createEncoder);
        }

        @Override // livekit.org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            VideoCodecInfo[] supportedCodecs = this.factory.getSupportedCodecs();
            supportedCodecs.getClass();
            return supportedCodecs;
        }
    }

    public SimulcastVideoEncoderFactoryWrapper(EglBase.Context context, boolean z6, boolean z10) {
        StreamEncoderWrapperFactory streamEncoderWrapperFactory = new StreamEncoderWrapperFactory(new HardwareVideoEncoderFactory(context, z6, z10));
        this.primary = streamEncoderWrapperFactory;
        StreamEncoderWrapperFactory streamEncoderWrapperFactory2 = new StreamEncoderWrapperFactory(new FallbackFactory(streamEncoderWrapperFactory));
        this.fallback = streamEncoderWrapperFactory2;
        this.native = new SimulcastVideoEncoderFactory(streamEncoderWrapperFactory, streamEncoderWrapperFactory2);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo r22) {
        return this.native.createEncoder(r22);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        Map<String, String> map;
        VideoCodecInfo[] supportedCodecs = this.native.getSupportedCodecs();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        supportedCodecs.getClass();
        for (VideoCodecInfo videoCodecInfo : supportedCodecs) {
            if (!u.O(videoCodecInfo.name, "vp9", true) || ((map = videoCodecInfo.params) != null && !map.isEmpty())) {
                linkedHashSet.add(HashableVideoCodecInfo.INSTANCE.fromVideoCodecInfo(videoCodecInfo));
            }
        }
        ArrayList arrayList = new ArrayList(p.a0(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((HashableVideoCodecInfo) it.next()).getOriginalInfo());
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper$HashableVideoCodecInfo;", "", DiagnosticsEntry.NAME_KEY, "", "params", "", "scalabilityModes", "", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "originalInfo", "Llivekit/org/webrtc/VideoCodecInfo;", "getOriginalInfo", "()Llivekit/org/webrtc/VideoCodecInfo;", "setOriginalInfo", "(Llivekit/org/webrtc/VideoCodecInfo;)V", "getParams", "()Ljava/util/Map;", "getScalabilityModes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class HashableVideoCodecInfo {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String name;
        public VideoCodecInfo originalInfo;
        private final Map<String, String> params;
        private final List<String> scalabilityModes;

        public HashableVideoCodecInfo(String str, Map<String, String> map, List<String> list) {
            str.getClass();
            map.getClass();
            list.getClass();
            this.name = str;
            this.params = map;
            this.scalabilityModes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HashableVideoCodecInfo copy$default(HashableVideoCodecInfo hashableVideoCodecInfo, String str, Map map, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hashableVideoCodecInfo.name;
            }
            if ((i10 & 2) != 0) {
                map = hashableVideoCodecInfo.params;
            }
            if ((i10 & 4) != 0) {
                list = hashableVideoCodecInfo.scalabilityModes;
            }
            return hashableVideoCodecInfo.copy(str, map, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Map<String, String> component2() {
            return this.params;
        }

        public final List<String> component3() {
            return this.scalabilityModes;
        }

        public final HashableVideoCodecInfo copy(String r22, Map<String, String> params, List<String> scalabilityModes) {
            r22.getClass();
            params.getClass();
            scalabilityModes.getClass();
            return new HashableVideoCodecInfo(r22, params, scalabilityModes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HashableVideoCodecInfo)) {
                return false;
            }
            HashableVideoCodecInfo hashableVideoCodecInfo = (HashableVideoCodecInfo) other;
            if (m.c(this.name, hashableVideoCodecInfo.name) && m.c(this.params, hashableVideoCodecInfo.params) && m.c(this.scalabilityModes, hashableVideoCodecInfo.scalabilityModes)) {
                return true;
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final VideoCodecInfo getOriginalInfo() {
            VideoCodecInfo videoCodecInfo = this.originalInfo;
            if (videoCodecInfo != null) {
                return videoCodecInfo;
            }
            m.i("originalInfo");
            throw null;
        }

        public final Map<String, String> getParams() {
            return this.params;
        }

        public final List<String> getScalabilityModes() {
            return this.scalabilityModes;
        }

        public int hashCode() {
            return this.scalabilityModes.hashCode() + f.a(this.params, this.name.hashCode() * 31, 31);
        }

        public final void setOriginalInfo(VideoCodecInfo videoCodecInfo) {
            videoCodecInfo.getClass();
            this.originalInfo = videoCodecInfo;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HashableVideoCodecInfo(name=");
            sb.append(this.name);
            sb.append(", params=");
            sb.append(this.params);
            sb.append(", scalabilityModes=");
            return n.k(sb, this.scalabilityModes, ')');
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper$HashableVideoCodecInfo$Companion;", "", "()V", "fromVideoCodecInfo", "Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper$HashableVideoCodecInfo;", "codecInfo", "Llivekit/org/webrtc/VideoCodecInfo;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final HashableVideoCodecInfo fromVideoCodecInfo(VideoCodecInfo codecInfo) {
                codecInfo.getClass();
                String str = codecInfo.name;
                str.getClass();
                Map<String, String> map = codecInfo.params;
                map.getClass();
                List<String> list = codecInfo.scalabilityModes;
                list.getClass();
                HashableVideoCodecInfo hashableVideoCodecInfo = new HashableVideoCodecInfo(str, map, list);
                hashableVideoCodecInfo.setOriginalInfo(codecInfo);
                return hashableVideoCodecInfo;
            }

            private Companion() {
            }
        }
    }
}
