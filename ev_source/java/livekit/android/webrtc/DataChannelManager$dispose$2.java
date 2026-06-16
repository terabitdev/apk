package io.livekit.android.webrtc;

import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DataChannelManager$dispose$2 extends n implements ho.a {
    final /* synthetic */ DataChannelManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataChannelManager$dispose$2(DataChannelManager dataChannelManager) {
        super(0);
        this.this$0 = dataChannelManager;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2637invoke() {
        this.this$0.getDataChannel().unregisterObserver();
        this.this$0.getDataChannel().close();
        this.this$0.getDataChannel().dispose();
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m2637invoke();
        return z.f31622a;
    }
}
