package io.livekit.android;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lio/livekit/android/LiveKitOverrides;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "videoEncoderFactory", "Llivekit/org/webrtc/VideoEncoderFactory;", "videoDecoderFactory", "Llivekit/org/webrtc/VideoDecoderFactory;", "audioOptions", "Lio/livekit/android/AudioOptions;", "eglBase", "Llivekit/org/webrtc/EglBase;", "peerConnectionFactoryOptions", "Llivekit/org/webrtc/PeerConnectionFactory$Options;", "(Lokhttp3/OkHttpClient;Llivekit/org/webrtc/VideoEncoderFactory;Llivekit/org/webrtc/VideoDecoderFactory;Lio/livekit/android/AudioOptions;Llivekit/org/webrtc/EglBase;Llivekit/org/webrtc/PeerConnectionFactory$Options;)V", "getAudioOptions", "()Lio/livekit/android/AudioOptions;", "getEglBase", "()Llivekit/org/webrtc/EglBase;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "getPeerConnectionFactoryOptions", "()Llivekit/org/webrtc/PeerConnectionFactory$Options;", "getVideoDecoderFactory", "()Llivekit/org/webrtc/VideoDecoderFactory;", "getVideoEncoderFactory", "()Llivekit/org/webrtc/VideoEncoderFactory;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class LiveKitOverrides {
    private final AudioOptions audioOptions;
    private final EglBase eglBase;
    private final OkHttpClient okHttpClient;
    private final PeerConnectionFactory.Options peerConnectionFactoryOptions;
    private final VideoDecoderFactory videoDecoderFactory;
    private final VideoEncoderFactory videoEncoderFactory;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LiveKitOverrides(OkHttpClient okHttpClient, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioOptions audioOptions, EglBase eglBase, PeerConnectionFactory.Options options, int i10, f fVar) {
        this(okHttpClient, videoEncoderFactory, videoDecoderFactory, audioOptions, eglBase, r8);
        PeerConnectionFactory.Options options2;
        okHttpClient = (i10 & 1) != 0 ? null : okHttpClient;
        videoEncoderFactory = (i10 & 2) != 0 ? null : videoEncoderFactory;
        videoDecoderFactory = (i10 & 4) != 0 ? null : videoDecoderFactory;
        audioOptions = (i10 & 8) != 0 ? null : audioOptions;
        eglBase = (i10 & 16) != 0 ? null : eglBase;
        if ((i10 & 32) != 0) {
            options2 = null;
        } else {
            options2 = options;
        }
    }

    public static /* synthetic */ LiveKitOverrides copy$default(LiveKitOverrides liveKitOverrides, OkHttpClient okHttpClient, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioOptions audioOptions, EglBase eglBase, PeerConnectionFactory.Options options, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            okHttpClient = liveKitOverrides.okHttpClient;
        }
        if ((i10 & 2) != 0) {
            videoEncoderFactory = liveKitOverrides.videoEncoderFactory;
        }
        if ((i10 & 4) != 0) {
            videoDecoderFactory = liveKitOverrides.videoDecoderFactory;
        }
        if ((i10 & 8) != 0) {
            audioOptions = liveKitOverrides.audioOptions;
        }
        if ((i10 & 16) != 0) {
            eglBase = liveKitOverrides.eglBase;
        }
        if ((i10 & 32) != 0) {
            options = liveKitOverrides.peerConnectionFactoryOptions;
        }
        EglBase eglBase2 = eglBase;
        PeerConnectionFactory.Options options2 = options;
        return liveKitOverrides.copy(okHttpClient, videoEncoderFactory, videoDecoderFactory, audioOptions, eglBase2, options2);
    }

    /* renamed from: component1, reason: from getter */
    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoEncoderFactory getVideoEncoderFactory() {
        return this.videoEncoderFactory;
    }

    /* renamed from: component3, reason: from getter */
    public final VideoDecoderFactory getVideoDecoderFactory() {
        return this.videoDecoderFactory;
    }

    /* renamed from: component4, reason: from getter */
    public final AudioOptions getAudioOptions() {
        return this.audioOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final EglBase getEglBase() {
        return this.eglBase;
    }

    /* renamed from: component6, reason: from getter */
    public final PeerConnectionFactory.Options getPeerConnectionFactoryOptions() {
        return this.peerConnectionFactoryOptions;
    }

    public final LiveKitOverrides copy(OkHttpClient okHttpClient, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioOptions audioOptions, EglBase eglBase, PeerConnectionFactory.Options peerConnectionFactoryOptions) {
        return new LiveKitOverrides(okHttpClient, videoEncoderFactory, videoDecoderFactory, audioOptions, eglBase, peerConnectionFactoryOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveKitOverrides)) {
            return false;
        }
        LiveKitOverrides liveKitOverrides = (LiveKitOverrides) other;
        if (m.c(this.okHttpClient, liveKitOverrides.okHttpClient) && m.c(this.videoEncoderFactory, liveKitOverrides.videoEncoderFactory) && m.c(this.videoDecoderFactory, liveKitOverrides.videoDecoderFactory) && m.c(this.audioOptions, liveKitOverrides.audioOptions) && m.c(this.eglBase, liveKitOverrides.eglBase) && m.c(this.peerConnectionFactoryOptions, liveKitOverrides.peerConnectionFactoryOptions)) {
            return true;
        }
        return false;
    }

    public final AudioOptions getAudioOptions() {
        return this.audioOptions;
    }

    public final EglBase getEglBase() {
        return this.eglBase;
    }

    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    public final PeerConnectionFactory.Options getPeerConnectionFactoryOptions() {
        return this.peerConnectionFactoryOptions;
    }

    public final VideoDecoderFactory getVideoDecoderFactory() {
        return this.videoDecoderFactory;
    }

    public final VideoEncoderFactory getVideoEncoderFactory() {
        return this.videoEncoderFactory;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        OkHttpClient okHttpClient = this.okHttpClient;
        int i10 = 0;
        if (okHttpClient == null) {
            hashCode = 0;
        } else {
            hashCode = okHttpClient.hashCode();
        }
        int i11 = hashCode * 31;
        VideoEncoderFactory videoEncoderFactory = this.videoEncoderFactory;
        if (videoEncoderFactory == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = videoEncoderFactory.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        VideoDecoderFactory videoDecoderFactory = this.videoDecoderFactory;
        if (videoDecoderFactory == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = videoDecoderFactory.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        AudioOptions audioOptions = this.audioOptions;
        if (audioOptions == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = audioOptions.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        EglBase eglBase = this.eglBase;
        if (eglBase == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = eglBase.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        PeerConnectionFactory.Options options = this.peerConnectionFactoryOptions;
        if (options != null) {
            i10 = options.hashCode();
        }
        return i15 + i10;
    }

    public String toString() {
        return "LiveKitOverrides(okHttpClient=" + this.okHttpClient + ", videoEncoderFactory=" + this.videoEncoderFactory + ", videoDecoderFactory=" + this.videoDecoderFactory + ", audioOptions=" + this.audioOptions + ", eglBase=" + this.eglBase + ", peerConnectionFactoryOptions=" + this.peerConnectionFactoryOptions + ')';
    }

    public LiveKitOverrides(OkHttpClient okHttpClient, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, AudioOptions audioOptions, EglBase eglBase, PeerConnectionFactory.Options options) {
        this.okHttpClient = okHttpClient;
        this.videoEncoderFactory = videoEncoderFactory;
        this.videoDecoderFactory = videoDecoderFactory;
        this.audioOptions = audioOptions;
        this.eglBase = eglBase;
        this.peerConnectionFactoryOptions = options;
    }

    public LiveKitOverrides() {
        this(null, null, null, null, null, null, 63, null);
    }
}
