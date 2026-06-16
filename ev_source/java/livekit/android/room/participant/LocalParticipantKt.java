package io.livekit.android.room.participant;

import as.qd;
import ig.f;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.room.track.VideoCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitRtc$TrackPublishedResponse;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e*B\u0010\u0013\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f2\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f¨\u0006\u0014"}, d2 = {"Lio/livekit/android/room/participant/LocalParticipant;", "", "Llivekit/LivekitRtc$TrackPublishedResponse;", "publishTracksInfo", "(Lio/livekit/android/room/participant/LocalParticipant;)Ljava/util/List;", "Lio/livekit/android/room/participant/VideoTrackPublishOptions;", "", "hasBackupCodec", "(Lio/livekit/android/room/participant/VideoTrackPublishOptions;)Z", "", "codecName", "isBackupCodec", "(Ljava/lang/String;)Z", "backupCodecs", "Ljava/util/List;", "Lkotlin/Function2;", "Lio/livekit/android/room/participant/RpcInvocationData;", "Lwn/c;", "", "RpcHandler", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalParticipantKt {
    private static final List<String> backupCodecs = f.I(VideoCodec.VP8.getCodecName(), VideoCodec.H264.getCodecName());

    public static final /* synthetic */ boolean access$isBackupCodec(String str) {
        return isBackupCodec(str);
    }

    public static final boolean hasBackupCodec(VideoTrackPublishOptions videoTrackPublishOptions) {
        String str;
        videoTrackPublishOptions.getClass();
        BackupVideoCodec backupCodec = videoTrackPublishOptions.getBackupCodec();
        if (backupCodec != null) {
            str = backupCodec.getCodec();
        } else {
            str = null;
        }
        if (str != null && !m.c(videoTrackPublishOptions.getVideoCodec(), videoTrackPublishOptions.getBackupCodec().getCodec())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBackupCodec(String str) {
        return backupCodecs.contains(str);
    }

    public static final List<LivekitRtc$TrackPublishedResponse> publishTracksInfo(LocalParticipant localParticipant) {
        LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse;
        localParticipant.getClass();
        Collection<TrackPublication> values = localParticipant.getTrackPublications().values();
        ArrayList arrayList = new ArrayList();
        for (TrackPublication trackPublication : values) {
            Track track = trackPublication.getTrack();
            if (track == null) {
                livekitRtc$TrackPublishedResponse = null;
            } else {
                qd newBuilder = LivekitRtc$TrackPublishedResponse.newBuilder();
                newBuilder.b(track.getRtcTrack().id());
                newBuilder.c(trackPublication.getTrackInfo());
                livekitRtc$TrackPublishedResponse = (LivekitRtc$TrackPublishedResponse) newBuilder.build();
            }
            if (livekitRtc$TrackPublishedResponse != null) {
                arrayList.add(livekitRtc$TrackPublishedResponse);
            }
        }
        return arrayList;
    }
}
