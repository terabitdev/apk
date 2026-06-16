package io.livekit.android.room;

import ho.a;
import ho.l;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.org.webrtc.DataChannel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "invoke", "()Lsn/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SubscriberTransportObserver$onDataChannel$1 extends n implements a {
    final /* synthetic */ DataChannel $channel;
    final /* synthetic */ SubscriberTransportObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberTransportObserver$onDataChannel$1(SubscriberTransportObserver subscriberTransportObserver, DataChannel dataChannel) {
        super(0);
        this.this$0 = subscriberTransportObserver;
        this.$channel = dataChannel;
    }

    @Override // ho.a
    public final z invoke() {
        l dataChannelListener = this.this$0.getDataChannelListener();
        if (dataChannelListener != null) {
            dataChannelListener.invoke(this.$channel);
            return z.f31622a;
        }
        return null;
    }
}
