package io.livekit.android.room.participant;

import as.d9;
import as.jb;
import as.xc;
import ho.l;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.room.track.Track;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import livekit.LivekitModels$VideoLayer;
import livekit.LivekitRtc$SimulcastCodec;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Las/jb;", "Lsn/z;", "invoke", "(Las/jb;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$publishVideoTrack$5 extends n implements l {
    final /* synthetic */ d0 $options;
    final /* synthetic */ String $rtcTrackId;
    final /* synthetic */ LocalVideoTrack $track;
    final /* synthetic */ List<LivekitModels$VideoLayer> $videoLayers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishVideoTrack$5(LocalVideoTrack localVideoTrack, d0 d0Var, List<LivekitModels$VideoLayer> list, String str) {
        super(1);
        this.$track = localVideoTrack;
        this.$options = d0Var;
        this.$videoLayers = list;
        this.$rtcTrackId = str;
    }

    public final void invoke(jb jbVar) {
        d9 d9Var;
        String str;
        jbVar.getClass();
        jbVar.r(this.$track.getDimensions().getWidth());
        jbVar.k(this.$track.getDimensions().getHeight());
        Track.Source source = ((VideoTrackPublishOptions) this.$options.f20559a).getSource();
        if (source == null || (d9Var = source.toProto()) == null) {
            if (this.$track.getOptions().isScreencast()) {
                d9Var = d9.SCREEN_SHARE;
            } else {
                d9Var = d9.CAMERA;
            }
        }
        jbVar.o(d9Var);
        jbVar.c(this.$videoLayers);
        xc newBuilder = LivekitRtc$SimulcastCodec.newBuilder();
        d0 d0Var = this.$options;
        String str2 = this.$rtcTrackId;
        newBuilder.c(((VideoTrackPublishOptions) d0Var.f20559a).getVideoCodec());
        newBuilder.b(str2);
        jbVar.d((LivekitRtc$SimulcastCodec) newBuilder.build());
        BackupVideoCodec backupCodec = ((VideoTrackPublishOptions) this.$options.f20559a).getBackupCodec();
        String str3 = null;
        if (backupCodec != null) {
            str = backupCodec.getCodec();
        } else {
            str = null;
        }
        if (str != null) {
            String videoCodec = ((VideoTrackPublishOptions) this.$options.f20559a).getVideoCodec();
            BackupVideoCodec backupCodec2 = ((VideoTrackPublishOptions) this.$options.f20559a).getBackupCodec();
            if (backupCodec2 != null) {
                str3 = backupCodec2.getCodec();
            }
            if (!m.c(videoCodec, str3)) {
                xc newBuilder2 = LivekitRtc$SimulcastCodec.newBuilder();
                BackupVideoCodec backupCodec3 = ((VideoTrackPublishOptions) this.$options.f20559a).getBackupCodec();
                backupCodec3.getClass();
                newBuilder2.c(backupCodec3.getCodec());
                newBuilder2.b("");
                jbVar.d((LivekitRtc$SimulcastCodec) newBuilder2.build());
            }
        }
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((jb) obj);
        return z.f31622a;
    }
}
