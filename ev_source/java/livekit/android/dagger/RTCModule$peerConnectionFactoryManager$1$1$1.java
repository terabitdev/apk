package io.livekit.android.dagger;

import io.livekit.android.webrtc.PeerConnectionFactoryManager;
import io.livekit.android.webrtc.peerconnection.RTCThreadTokenImpl;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "close", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCModule$peerConnectionFactoryManager$1$1$1 implements Closeable {
    final /* synthetic */ PeerConnectionFactoryManager $this_apply;

    public RTCModule$peerConnectionFactoryManager$1$1$1(PeerConnectionFactoryManager peerConnectionFactoryManager) {
        this.$this_apply = peerConnectionFactoryManager;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RTCThreadUtilsKt.executeOnRTCThread(new RTCThreadTokenImpl(this.$this_apply), new AnonymousClass1(this.$this_apply));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.dagger.RTCModule$peerConnectionFactoryManager$1$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends n implements ho.a {
        final /* synthetic */ PeerConnectionFactoryManager $this_apply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PeerConnectionFactoryManager peerConnectionFactoryManager) {
            super(0);
            this.$this_apply = peerConnectionFactoryManager;
        }

        @Override // ho.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2518invoke();
            return z.f31622a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m2518invoke() {
            this.$this_apply.dispose();
        }
    }
}
