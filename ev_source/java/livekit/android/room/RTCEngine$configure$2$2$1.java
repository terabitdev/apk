package io.livekit.android.room;

import ho.l;
import io.livekit.android.room.RTCEngine;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import livekit.org.webrtc.DataChannel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llivekit/org/webrtc/DataChannel;", "dataChannel", "Lsn/z;", "invoke", "(Llivekit/org/webrtc/DataChannel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$configure$2$2$1 extends n implements l {
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$configure$2$2$1(RTCEngine rTCEngine) {
        super(1);
        this.this$0 = rTCEngine;
    }

    public final void invoke(DataChannel dataChannel) {
        dataChannel.getClass();
        String label = dataChannel.label();
        if (m.c(label, RTCEngine.RELIABLE_DATA_CHANNEL_LABEL)) {
            this.this$0.reliableDataChannelSub = dataChannel;
        } else if (m.c(label, RTCEngine.LOSSY_DATA_CHANNEL_LABEL)) {
            this.this$0.lossyDataChannelSub = dataChannel;
        } else {
            return;
        }
        dataChannel.registerObserver(new RTCEngine.DataChannelObserver(this.this$0, dataChannel));
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DataChannel) obj);
        return z.f31622a;
    }
}
