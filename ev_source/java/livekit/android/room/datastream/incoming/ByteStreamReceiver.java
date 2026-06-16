package io.livekit.android.room.datastream.incoming;

import android.gov.nist.javax.sip.header.ParameterNames;
import hr.n;
import io.livekit.android.room.datastream.ByteStreamInfo;
import ir.i;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/livekit/android/room/datastream/incoming/ByteStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/BaseStreamReceiver;", "", "Lio/livekit/android/room/datastream/ByteStreamInfo;", ParameterNames.INFO, "Lhr/n;", "channel", "<init>", "(Lio/livekit/android/room/datastream/ByteStreamInfo;Lhr/n;)V", "Lio/livekit/android/room/datastream/ByteStreamInfo;", "getInfo", "()Lio/livekit/android/room/datastream/ByteStreamInfo;", "Lir/i;", "flow", "Lir/i;", "getFlow", "()Lir/i;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ByteStreamReceiver extends BaseStreamReceiver<byte[]> {
    private final i flow;
    private final ByteStreamInfo info;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamReceiver(ByteStreamInfo byteStreamInfo, n nVar) {
        super(nVar);
        byteStreamInfo.getClass();
        nVar.getClass();
        this.info = byteStreamInfo;
        this.flow = r.B(nVar);
    }

    @Override // io.livekit.android.room.datastream.incoming.BaseStreamReceiver
    public i getFlow() {
        return this.flow;
    }

    public final ByteStreamInfo getInfo() {
        return this.info;
    }
}
