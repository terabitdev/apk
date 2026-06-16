package io.livekit.android.dagger;

import ho.l;
import io.livekit.android.AudioOptions;
import io.livekit.android.AudioType;
import io.livekit.android.LiveKitOverrides;
import io.livekit.android.audio.AudioHandler;
import io.livekit.android.audio.AudioProcessorOptions;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.audio.AudioDeviceModule;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)¨\u0006*"}, d2 = {"Lio/livekit/android/dagger/OverridesModule;", "", "Lio/livekit/android/LiveKitOverrides;", "overrides", "<init>", "(Lio/livekit/android/LiveKitOverrides;)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "()Lokhttp3/OkHttpClient;", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "audioDeviceModule", "()Llivekit/org/webrtc/audio/AudioDeviceModule;", "Lio/livekit/android/audio/AudioProcessorOptions;", "audioProcessorOptions", "()Lio/livekit/android/audio/AudioProcessorOptions;", "Lkotlin/Function1;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$Builder;", "Lsn/z;", "javaAudioDeviceModuleCustomizer", "()Lho/l;", "Llivekit/org/webrtc/VideoEncoderFactory;", "videoEncoderFactory", "()Llivekit/org/webrtc/VideoEncoderFactory;", "Llivekit/org/webrtc/VideoDecoderFactory;", "videoDecoderFactory", "()Llivekit/org/webrtc/VideoDecoderFactory;", "Lio/livekit/android/audio/AudioHandler;", "audioHandler", "()Lio/livekit/android/audio/AudioHandler;", "Lio/livekit/android/AudioType;", "audioOutputType", "()Lio/livekit/android/AudioType;", "Llivekit/org/webrtc/PeerConnectionFactory$Options;", "peerConnectionFactoryOptions", "()Llivekit/org/webrtc/PeerConnectionFactory$Options;", "", "disableCommunicationWorkAround", "()Z", "Llivekit/org/webrtc/EglBase;", "eglBase", "()Llivekit/org/webrtc/EglBase;", "Lio/livekit/android/LiveKitOverrides;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OverridesModule {
    private final LiveKitOverrides overrides;

    public OverridesModule(LiveKitOverrides liveKitOverrides) {
        liveKitOverrides.getClass();
        this.overrides = liveKitOverrides;
    }

    public final AudioDeviceModule audioDeviceModule() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getAudioDeviceModule();
        }
        return null;
    }

    public final AudioHandler audioHandler() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getAudioHandler();
        }
        return null;
    }

    public final AudioType audioOutputType() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getAudioOutputType();
        }
        return null;
    }

    public final AudioProcessorOptions audioProcessorOptions() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getAudioProcessorOptions();
        }
        return null;
    }

    public final boolean disableCommunicationWorkAround() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getDisableCommunicationModeWorkaround();
        }
        return false;
    }

    public final EglBase eglBase() {
        return this.overrides.getEglBase();
    }

    public final l javaAudioDeviceModuleCustomizer() {
        AudioOptions audioOptions = this.overrides.getAudioOptions();
        if (audioOptions != null) {
            return audioOptions.getJavaAudioDeviceModuleCustomizer();
        }
        return null;
    }

    public final OkHttpClient okHttpClient() {
        return this.overrides.getOkHttpClient();
    }

    public final PeerConnectionFactory.Options peerConnectionFactoryOptions() {
        return this.overrides.getPeerConnectionFactoryOptions();
    }

    public final VideoDecoderFactory videoDecoderFactory() {
        return this.overrides.getVideoDecoderFactory();
    }

    public final VideoEncoderFactory videoEncoderFactory() {
        return this.overrides.getVideoEncoderFactory();
    }
}
