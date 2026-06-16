package io.livekit.android.room.participant;

import com.google.android.gms.internal.play_billing.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.VideoCodec;
import io.livekit.android.room.track.VideoEncoding;
import io.livekit.android.room.track.VideoPreset;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.RtpParameters;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0083\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001J\b\u00104\u001a\u0004\u0018\u00010\u0000J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006;"}, d2 = {"Lio/livekit/android/room/participant/VideoTrackPublishOptions;", "Lio/livekit/android/room/participant/BaseVideoTrackPublishOptions;", "Lio/livekit/android/room/participant/TrackPublishOptions;", DiagnosticsEntry.NAME_KEY, "", "base", "source", "Lio/livekit/android/room/track/Track$Source;", "stream", "(Ljava/lang/String;Lio/livekit/android/room/participant/BaseVideoTrackPublishOptions;Lio/livekit/android/room/track/Track$Source;Ljava/lang/String;)V", "videoEncoding", "Lio/livekit/android/room/track/VideoEncoding;", "simulcast", "", "videoCodec", "scalabilityMode", "backupCodec", "Lio/livekit/android/room/participant/BackupVideoCodec;", "degradationPreference", "Llivekit/org/webrtc/RtpParameters$DegradationPreference;", "simulcastLayers", "", "Lio/livekit/android/room/track/VideoPreset;", "(Ljava/lang/String;Lio/livekit/android/room/track/VideoEncoding;ZLjava/lang/String;Ljava/lang/String;Lio/livekit/android/room/participant/BackupVideoCodec;Lio/livekit/android/room/track/Track$Source;Ljava/lang/String;Llivekit/org/webrtc/RtpParameters$DegradationPreference;Ljava/util/List;)V", "getBackupCodec", "()Lio/livekit/android/room/participant/BackupVideoCodec;", "getDegradationPreference", "()Llivekit/org/webrtc/RtpParameters$DegradationPreference;", "getName", "()Ljava/lang/String;", "getScalabilityMode", "getSimulcast", "()Z", "getSimulcastLayers", "()Ljava/util/List;", "getSource", "()Lio/livekit/android/room/track/Track$Source;", "getStream", "getVideoCodec", "getVideoEncoding", "()Lio/livekit/android/room/track/VideoEncoding;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "createBackupOptions", "equals", "other", "", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class VideoTrackPublishOptions extends BaseVideoTrackPublishOptions implements TrackPublishOptions {
    private final BackupVideoCodec backupCodec;
    private final RtpParameters.DegradationPreference degradationPreference;
    private final String name;
    private final String scalabilityMode;
    private final boolean simulcast;
    private final List<VideoPreset> simulcastLayers;
    private final Track.Source source;
    private final String stream;
    private final String videoCodec;
    private final VideoEncoding videoEncoding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ VideoTrackPublishOptions(String str, VideoEncoding videoEncoding, boolean z6, String str2, String str3, BackupVideoCodec backupVideoCodec, Track.Source source, String str4, RtpParameters.DegradationPreference degradationPreference, List list, int i10, f fVar) {
        this(str, videoEncoding, z6, str2, str3, backupVideoCodec, source, str4, degradationPreference, r12);
        List list2;
        str = (i10 & 1) != 0 ? null : str;
        videoEncoding = (i10 & 2) != 0 ? null : videoEncoding;
        z6 = (i10 & 4) != 0 ? true : z6;
        str2 = (i10 & 8) != 0 ? VideoCodec.VP8.getCodecName() : str2;
        str3 = (i10 & 16) != 0 ? null : str3;
        backupVideoCodec = (i10 & 32) != 0 ? null : backupVideoCodec;
        source = (i10 & 64) != 0 ? null : source;
        str4 = (i10 & 128) != 0 ? null : str4;
        degradationPreference = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : degradationPreference;
        if ((i10 & 512) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
    }

    public static /* synthetic */ VideoTrackPublishOptions copy$default(VideoTrackPublishOptions videoTrackPublishOptions, String str, VideoEncoding videoEncoding, boolean z6, String str2, String str3, BackupVideoCodec backupVideoCodec, Track.Source source, String str4, RtpParameters.DegradationPreference degradationPreference, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = videoTrackPublishOptions.name;
        }
        if ((i10 & 2) != 0) {
            videoEncoding = videoTrackPublishOptions.videoEncoding;
        }
        if ((i10 & 4) != 0) {
            z6 = videoTrackPublishOptions.simulcast;
        }
        if ((i10 & 8) != 0) {
            str2 = videoTrackPublishOptions.videoCodec;
        }
        if ((i10 & 16) != 0) {
            str3 = videoTrackPublishOptions.scalabilityMode;
        }
        if ((i10 & 32) != 0) {
            backupVideoCodec = videoTrackPublishOptions.backupCodec;
        }
        if ((i10 & 64) != 0) {
            source = videoTrackPublishOptions.source;
        }
        if ((i10 & 128) != 0) {
            str4 = videoTrackPublishOptions.stream;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            degradationPreference = videoTrackPublishOptions.degradationPreference;
        }
        if ((i10 & 512) != 0) {
            list = videoTrackPublishOptions.simulcastLayers;
        }
        RtpParameters.DegradationPreference degradationPreference2 = degradationPreference;
        List list2 = list;
        Track.Source source2 = source;
        String str5 = str4;
        String str6 = str3;
        BackupVideoCodec backupVideoCodec2 = backupVideoCodec;
        return videoTrackPublishOptions.copy(str, videoEncoding, z6, str2, str6, backupVideoCodec2, source2, str5, degradationPreference2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<VideoPreset> component10() {
        return this.simulcastLayers;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoEncoding getVideoEncoding() {
        return this.videoEncoding;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSimulcast() {
        return this.simulcast;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVideoCodec() {
        return this.videoCodec;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScalabilityMode() {
        return this.scalabilityMode;
    }

    /* renamed from: component6, reason: from getter */
    public final BackupVideoCodec getBackupCodec() {
        return this.backupCodec;
    }

    /* renamed from: component7, reason: from getter */
    public final Track.Source getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStream() {
        return this.stream;
    }

    /* renamed from: component9, reason: from getter */
    public final RtpParameters.DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    public final VideoTrackPublishOptions copy(String r12, VideoEncoding videoEncoding, boolean simulcast, String videoCodec, String scalabilityMode, BackupVideoCodec backupCodec, Track.Source source, String stream, RtpParameters.DegradationPreference degradationPreference, List<? extends VideoPreset> simulcastLayers) {
        videoCodec.getClass();
        return new VideoTrackPublishOptions(r12, videoEncoding, simulcast, videoCodec, scalabilityMode, backupCodec, source, stream, degradationPreference, simulcastLayers);
    }

    public final VideoTrackPublishOptions createBackupOptions() {
        if (LocalParticipantKt.hasBackupCodec(this)) {
            BackupVideoCodec backupCodec = getBackupCodec();
            backupCodec.getClass();
            return copy$default(this, null, getBackupCodec().getEncoding(), false, backupCodec.getCodec(), null, null, null, null, null, null, 1013, null);
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTrackPublishOptions)) {
            return false;
        }
        VideoTrackPublishOptions videoTrackPublishOptions = (VideoTrackPublishOptions) other;
        if (m.c(this.name, videoTrackPublishOptions.name) && m.c(this.videoEncoding, videoTrackPublishOptions.videoEncoding) && this.simulcast == videoTrackPublishOptions.simulcast && m.c(this.videoCodec, videoTrackPublishOptions.videoCodec) && m.c(this.scalabilityMode, videoTrackPublishOptions.scalabilityMode) && m.c(this.backupCodec, videoTrackPublishOptions.backupCodec) && this.source == videoTrackPublishOptions.source && m.c(this.stream, videoTrackPublishOptions.stream) && this.degradationPreference == videoTrackPublishOptions.degradationPreference && m.c(this.simulcastLayers, videoTrackPublishOptions.simulcastLayers)) {
            return true;
        }
        return false;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public BackupVideoCodec getBackupCodec() {
        return this.backupCodec;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public RtpParameters.DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    @Override // io.livekit.android.room.participant.TrackPublishOptions
    public String getName() {
        return this.name;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public String getScalabilityMode() {
        return this.scalabilityMode;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public boolean getSimulcast() {
        return this.simulcast;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public List<VideoPreset> getSimulcastLayers() {
        return this.simulcastLayers;
    }

    @Override // io.livekit.android.room.participant.TrackPublishOptions
    public Track.Source getSource() {
        return this.source;
    }

    @Override // io.livekit.android.room.participant.TrackPublishOptions
    public String getStream() {
        return this.stream;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public String getVideoCodec() {
        return this.videoCodec;
    }

    @Override // io.livekit.android.room.participant.BaseVideoTrackPublishOptions
    public VideoEncoding getVideoEncoding() {
        return this.videoEncoding;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.name;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        VideoEncoding videoEncoding = this.videoEncoding;
        if (videoEncoding == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = videoEncoding.hashCode();
        }
        int c5 = c.c(b.f((i11 + hashCode2) * 31, 31, this.simulcast), 31, this.videoCodec);
        String str2 = this.scalabilityMode;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (c5 + hashCode3) * 31;
        BackupVideoCodec backupVideoCodec = this.backupCodec;
        if (backupVideoCodec == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = backupVideoCodec.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Track.Source source = this.source;
        if (source == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = source.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str3 = this.stream;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        RtpParameters.DegradationPreference degradationPreference = this.degradationPreference;
        if (degradationPreference == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = degradationPreference.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        List<VideoPreset> list = this.simulcastLayers;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i16 + i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoTrackPublishOptions(name=");
        sb.append(this.name);
        sb.append(", videoEncoding=");
        sb.append(this.videoEncoding);
        sb.append(", simulcast=");
        sb.append(this.simulcast);
        sb.append(", videoCodec=");
        sb.append(this.videoCodec);
        sb.append(", scalabilityMode=");
        sb.append(this.scalabilityMode);
        sb.append(", backupCodec=");
        sb.append(this.backupCodec);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", stream=");
        sb.append(this.stream);
        sb.append(", degradationPreference=");
        sb.append(this.degradationPreference);
        sb.append(", simulcastLayers=");
        return n.k(sb, this.simulcastLayers, ')');
    }

    public VideoTrackPublishOptions() {
        this(null, null, false, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoTrackPublishOptions(String str, VideoEncoding videoEncoding, boolean z6, String str2, String str3, BackupVideoCodec backupVideoCodec, Track.Source source, String str4, RtpParameters.DegradationPreference degradationPreference, List<? extends VideoPreset> list) {
        str2.getClass();
        this.name = str;
        this.videoEncoding = videoEncoding;
        this.simulcast = z6;
        this.videoCodec = str2;
        this.scalabilityMode = str3;
        this.backupCodec = backupVideoCodec;
        this.source = source;
        this.stream = str4;
        this.degradationPreference = degradationPreference;
        this.simulcastLayers = list;
    }

    public /* synthetic */ VideoTrackPublishOptions(String str, BaseVideoTrackPublishOptions baseVideoTrackPublishOptions, Track.Source source, String str2, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, baseVideoTrackPublishOptions, (i10 & 4) != 0 ? null : source, (i10 & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoTrackPublishOptions(String str, BaseVideoTrackPublishOptions baseVideoTrackPublishOptions, Track.Source source, String str2) {
        this(str, baseVideoTrackPublishOptions.getVideoEncoding(), baseVideoTrackPublishOptions.getSimulcast(), baseVideoTrackPublishOptions.getVideoCodec(), baseVideoTrackPublishOptions.getScalabilityMode(), baseVideoTrackPublishOptions.getBackupCodec(), source, str2, baseVideoTrackPublishOptions.getDegradationPreference(), baseVideoTrackPublishOptions.getSimulcastLayers());
        baseVideoTrackPublishOptions.getClass();
    }
}
