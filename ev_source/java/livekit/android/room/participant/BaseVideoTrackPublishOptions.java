package io.livekit.android.room.participant;

import io.livekit.android.room.track.VideoEncoding;
import io.livekit.android.room.track.VideoPreset;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.RtpParameters;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/livekit/android/room/participant/BaseVideoTrackPublishOptions;", "", "()V", "backupCodec", "Lio/livekit/android/room/participant/BackupVideoCodec;", "getBackupCodec", "()Lio/livekit/android/room/participant/BackupVideoCodec;", "degradationPreference", "Llivekit/org/webrtc/RtpParameters$DegradationPreference;", "getDegradationPreference", "()Llivekit/org/webrtc/RtpParameters$DegradationPreference;", "scalabilityMode", "", "getScalabilityMode", "()Ljava/lang/String;", "simulcast", "", "getSimulcast", "()Z", "simulcastLayers", "", "Lio/livekit/android/room/track/VideoPreset;", "getSimulcastLayers", "()Ljava/util/List;", "videoCodec", "getVideoCodec", "videoEncoding", "Lio/livekit/android/room/track/VideoEncoding;", "getVideoEncoding", "()Lio/livekit/android/room/track/VideoEncoding;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class BaseVideoTrackPublishOptions {
    public abstract BackupVideoCodec getBackupCodec();

    public abstract RtpParameters.DegradationPreference getDegradationPreference();

    public abstract String getScalabilityMode();

    public abstract boolean getSimulcast();

    public abstract List<VideoPreset> getSimulcastLayers();

    public abstract String getVideoCodec();

    public abstract VideoEncoding getVideoEncoding();
}
