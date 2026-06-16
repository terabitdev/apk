package io.livekit.android.room.track.video;

import ho.p;
import io.livekit.android.room.track.CameraPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "id", "", "<anonymous parameter 1>", "Lio/livekit/android/room/track/CameraPosition;", "invoke", "(Ljava/lang/String;Lio/livekit/android/room/track/CameraPosition;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CameraCapturerUtils$findCamera$1 extends n implements p {
    final /* synthetic */ String $deviceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraCapturerUtils$findCamera$1(String str) {
        super(2);
        this.$deviceId = str;
    }

    @Override // ho.p
    public final Boolean invoke(String str, CameraPosition cameraPosition) {
        str.getClass();
        return Boolean.valueOf(str.equals(this.$deviceId));
    }
}
