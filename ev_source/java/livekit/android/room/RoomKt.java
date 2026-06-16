package io.livekit.android.room;

import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "packed", "Lsn/k;", "unpackStreamId", "(Ljava/lang/String;)Lsn/k;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RoomKt {
    public static final k unpackStreamId(String str) {
        str.getClass();
        List A0 = n.A0(str, new char[]{'|'}, 6);
        if (A0.size() != 2) {
            return new k(str, null);
        }
        return new k(A0.get(0), A0.get(1));
    }
}
