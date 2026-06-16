package io.livekit.android;

import com.google.android.gms.internal.play_billing.b;
import io.livekit.android.room.ProtocolVersion;
import io.livekit.android.room.SignalClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000f¨\u0006."}, d2 = {"Lio/livekit/android/ConnectOptions;", "", "autoSubscribe", "", "iceServers", "", "Llivekit/org/webrtc/PeerConnection$IceServer;", "rtcConfig", "Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "audio", "video", "protocolVersion", "Lio/livekit/android/room/ProtocolVersion;", "(ZLjava/util/List;Llivekit/org/webrtc/PeerConnection$RTCConfiguration;ZZLio/livekit/android/room/ProtocolVersion;)V", "getAudio", "()Z", "getAutoSubscribe", "getIceServers", "()Ljava/util/List;", "participantSid", "", "getParticipantSid$livekit_android_sdk_release", "()Ljava/lang/String;", "setParticipantSid$livekit_android_sdk_release", "(Ljava/lang/String;)V", "getProtocolVersion", "()Lio/livekit/android/room/ProtocolVersion;", SignalClient.CONNECT_QUERY_RECONNECT, "getReconnect$livekit_android_sdk_release", "setReconnect$livekit_android_sdk_release", "(Z)V", "getRtcConfig", "()Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "getVideo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ConnectOptions {
    private final boolean audio;
    private final boolean autoSubscribe;
    private final List<PeerConnection.IceServer> iceServers;
    private String participantSid;
    private final ProtocolVersion protocolVersion;
    private boolean reconnect;
    private final PeerConnection.RTCConfiguration rtcConfig;
    private final boolean video;

    public /* synthetic */ ConnectOptions(boolean z6, List list, PeerConnection.RTCConfiguration rTCConfiguration, boolean z10, boolean z11, ProtocolVersion protocolVersion, int i10, f fVar) {
        this((i10 & 1) != 0 ? true : z6, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : rTCConfiguration, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? ProtocolVersion.v13 : protocolVersion);
    }

    public static /* synthetic */ ConnectOptions copy$default(ConnectOptions connectOptions, boolean z6, List list, PeerConnection.RTCConfiguration rTCConfiguration, boolean z10, boolean z11, ProtocolVersion protocolVersion, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = connectOptions.autoSubscribe;
        }
        if ((i10 & 2) != 0) {
            list = connectOptions.iceServers;
        }
        if ((i10 & 4) != 0) {
            rTCConfiguration = connectOptions.rtcConfig;
        }
        if ((i10 & 8) != 0) {
            z10 = connectOptions.audio;
        }
        if ((i10 & 16) != 0) {
            z11 = connectOptions.video;
        }
        if ((i10 & 32) != 0) {
            protocolVersion = connectOptions.protocolVersion;
        }
        boolean z12 = z11;
        ProtocolVersion protocolVersion2 = protocolVersion;
        return connectOptions.copy(z6, list, rTCConfiguration, z10, z12, protocolVersion2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAutoSubscribe() {
        return this.autoSubscribe;
    }

    public final List<PeerConnection.IceServer> component2() {
        return this.iceServers;
    }

    /* renamed from: component3, reason: from getter */
    public final PeerConnection.RTCConfiguration getRtcConfig() {
        return this.rtcConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAudio() {
        return this.audio;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getVideo() {
        return this.video;
    }

    /* renamed from: component6, reason: from getter */
    public final ProtocolVersion getProtocolVersion() {
        return this.protocolVersion;
    }

    public final ConnectOptions copy(boolean autoSubscribe, List<? extends PeerConnection.IceServer> iceServers, PeerConnection.RTCConfiguration rtcConfig, boolean audio, boolean video, ProtocolVersion protocolVersion) {
        protocolVersion.getClass();
        return new ConnectOptions(autoSubscribe, iceServers, rtcConfig, audio, video, protocolVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectOptions)) {
            return false;
        }
        ConnectOptions connectOptions = (ConnectOptions) other;
        if (this.autoSubscribe == connectOptions.autoSubscribe && m.c(this.iceServers, connectOptions.iceServers) && m.c(this.rtcConfig, connectOptions.rtcConfig) && this.audio == connectOptions.audio && this.video == connectOptions.video && this.protocolVersion == connectOptions.protocolVersion) {
            return true;
        }
        return false;
    }

    public final boolean getAudio() {
        return this.audio;
    }

    public final boolean getAutoSubscribe() {
        return this.autoSubscribe;
    }

    public final List<PeerConnection.IceServer> getIceServers() {
        return this.iceServers;
    }

    /* renamed from: getParticipantSid$livekit_android_sdk_release, reason: from getter */
    public final String getParticipantSid() {
        return this.participantSid;
    }

    public final ProtocolVersion getProtocolVersion() {
        return this.protocolVersion;
    }

    /* renamed from: getReconnect$livekit_android_sdk_release, reason: from getter */
    public final boolean getReconnect() {
        return this.reconnect;
    }

    public final PeerConnection.RTCConfiguration getRtcConfig() {
        return this.rtcConfig;
    }

    public final boolean getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.autoSubscribe) * 31;
        List<PeerConnection.IceServer> list = this.iceServers;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        PeerConnection.RTCConfiguration rTCConfiguration = this.rtcConfig;
        if (rTCConfiguration != null) {
            i10 = rTCConfiguration.hashCode();
        }
        return this.protocolVersion.hashCode() + b.f(b.f((i11 + i10) * 31, 31, this.audio), 31, this.video);
    }

    public final void setParticipantSid$livekit_android_sdk_release(String str) {
        this.participantSid = str;
    }

    public final void setReconnect$livekit_android_sdk_release(boolean z6) {
        this.reconnect = z6;
    }

    public String toString() {
        return "ConnectOptions(autoSubscribe=" + this.autoSubscribe + ", iceServers=" + this.iceServers + ", rtcConfig=" + this.rtcConfig + ", audio=" + this.audio + ", video=" + this.video + ", protocolVersion=" + this.protocolVersion + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectOptions(boolean z6, List<? extends PeerConnection.IceServer> list, PeerConnection.RTCConfiguration rTCConfiguration, boolean z10, boolean z11, ProtocolVersion protocolVersion) {
        protocolVersion.getClass();
        this.autoSubscribe = z6;
        this.iceServers = list;
        this.rtcConfig = rTCConfiguration;
        this.audio = z10;
        this.video = z11;
        this.protocolVersion = protocolVersion;
    }

    public ConnectOptions() {
        this(false, null, null, false, false, null, 63, null);
    }
}
