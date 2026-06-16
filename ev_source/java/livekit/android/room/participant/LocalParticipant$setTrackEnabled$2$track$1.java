package io.livekit.android.room.participant;

import ho.a;
import ho.l;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.screencapture.ScreenCaptureParams;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/livekit/android/room/track/Track;", "it", "Lsn/z;", "invoke", "(Lio/livekit/android/room/track/Track;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$setTrackEnabled$2$track$1 extends n implements l {
    final /* synthetic */ ScreenCaptureParams $screenCaptureParams;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$setTrackEnabled$2$track$1(LocalParticipant localParticipant, ScreenCaptureParams screenCaptureParams) {
        super(1);
        this.this$0 = localParticipant;
        this.$screenCaptureParams = screenCaptureParams;
    }

    public final void invoke(Track track) {
        track.getClass();
        LocalParticipant.unpublishTrack$default(this.this$0, track, false, 2, null);
        a onStop = this.$screenCaptureParams.getOnStop();
        if (onStop != null) {
            onStop.invoke();
        }
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Track) obj);
        return z.f31622a;
    }
}
