package io.livekit.android.room.track;

import io.livekit.android.dagger.InjectionNames;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.RtpSender;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lio/livekit/android/room/track/SimulcastTrackInfo;", "", "codec", "", "rtcTrack", "Llivekit/org/webrtc/MediaStreamTrack;", InjectionNames.SENDER, "Llivekit/org/webrtc/RtpSender;", "encodings", "", "Llivekit/org/webrtc/RtpParameters$Encoding;", "(Ljava/lang/String;Llivekit/org/webrtc/MediaStreamTrack;Llivekit/org/webrtc/RtpSender;Ljava/util/List;)V", "getCodec", "()Ljava/lang/String;", "setCodec", "(Ljava/lang/String;)V", "getEncodings", "()Ljava/util/List;", "setEncodings", "(Ljava/util/List;)V", "getRtcTrack", "()Llivekit/org/webrtc/MediaStreamTrack;", "setRtcTrack", "(Llivekit/org/webrtc/MediaStreamTrack;)V", "getSender", "()Llivekit/org/webrtc/RtpSender;", "setSender", "(Llivekit/org/webrtc/RtpSender;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SimulcastTrackInfo {
    private String codec;
    private List<? extends RtpParameters.Encoding> encodings;
    private MediaStreamTrack rtcTrack;
    private RtpSender sender;

    public SimulcastTrackInfo(String str, MediaStreamTrack mediaStreamTrack, RtpSender rtpSender, List<? extends RtpParameters.Encoding> list) {
        str.getClass();
        mediaStreamTrack.getClass();
        this.codec = str;
        this.rtcTrack = mediaStreamTrack;
        this.sender = rtpSender;
        this.encodings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimulcastTrackInfo copy$default(SimulcastTrackInfo simulcastTrackInfo, String str, MediaStreamTrack mediaStreamTrack, RtpSender rtpSender, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = simulcastTrackInfo.codec;
        }
        if ((i10 & 2) != 0) {
            mediaStreamTrack = simulcastTrackInfo.rtcTrack;
        }
        if ((i10 & 4) != 0) {
            rtpSender = simulcastTrackInfo.sender;
        }
        if ((i10 & 8) != 0) {
            list = simulcastTrackInfo.encodings;
        }
        return simulcastTrackInfo.copy(str, mediaStreamTrack, rtpSender, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    /* renamed from: component2, reason: from getter */
    public final MediaStreamTrack getRtcTrack() {
        return this.rtcTrack;
    }

    /* renamed from: component3, reason: from getter */
    public final RtpSender getSender() {
        return this.sender;
    }

    public final List<RtpParameters.Encoding> component4() {
        return this.encodings;
    }

    public final SimulcastTrackInfo copy(String codec, MediaStreamTrack rtcTrack, RtpSender sender, List<? extends RtpParameters.Encoding> encodings) {
        codec.getClass();
        rtcTrack.getClass();
        return new SimulcastTrackInfo(codec, rtcTrack, sender, encodings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimulcastTrackInfo)) {
            return false;
        }
        SimulcastTrackInfo simulcastTrackInfo = (SimulcastTrackInfo) other;
        if (m.c(this.codec, simulcastTrackInfo.codec) && m.c(this.rtcTrack, simulcastTrackInfo.rtcTrack) && m.c(this.sender, simulcastTrackInfo.sender) && m.c(this.encodings, simulcastTrackInfo.encodings)) {
            return true;
        }
        return false;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final List<RtpParameters.Encoding> getEncodings() {
        return this.encodings;
    }

    public final MediaStreamTrack getRtcTrack() {
        return this.rtcTrack;
    }

    public final RtpSender getSender() {
        return this.sender;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.rtcTrack.hashCode() + (this.codec.hashCode() * 31)) * 31;
        RtpSender rtpSender = this.sender;
        int i10 = 0;
        if (rtpSender == null) {
            hashCode = 0;
        } else {
            hashCode = rtpSender.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        List<? extends RtpParameters.Encoding> list = this.encodings;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 + i10;
    }

    public final void setCodec(String str) {
        str.getClass();
        this.codec = str;
    }

    public final void setEncodings(List<? extends RtpParameters.Encoding> list) {
        this.encodings = list;
    }

    public final void setRtcTrack(MediaStreamTrack mediaStreamTrack) {
        mediaStreamTrack.getClass();
        this.rtcTrack = mediaStreamTrack;
    }

    public final void setSender(RtpSender rtpSender) {
        this.sender = rtpSender;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimulcastTrackInfo(codec=");
        sb.append(this.codec);
        sb.append(", rtcTrack=");
        sb.append(this.rtcTrack);
        sb.append(", sender=");
        sb.append(this.sender);
        sb.append(", encodings=");
        return n.k(sb, this.encodings, ')');
    }

    public /* synthetic */ SimulcastTrackInfo(String str, MediaStreamTrack mediaStreamTrack, RtpSender rtpSender, List list, int i10, f fVar) {
        this(str, mediaStreamTrack, (i10 & 4) != 0 ? null : rtpSender, (i10 & 8) != 0 ? null : list);
    }
}
