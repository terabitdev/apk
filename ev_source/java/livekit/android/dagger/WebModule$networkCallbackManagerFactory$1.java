package io.livekit.android.dagger;

import android.net.ConnectivityManager;
import ho.l;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.room.network.NetworkCallbackManagerImpl;
import io.livekit.android.room.network.NetworkCallbackRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/livekit/android/room/network/NetworkCallbackManagerImpl;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class WebModule$networkCallbackManagerFactory$1 extends n implements l {
    final /* synthetic */ CloseableManager $closeableManager;
    final /* synthetic */ NetworkCallbackRegistry $registrar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebModule$networkCallbackManagerFactory$1(NetworkCallbackRegistry networkCallbackRegistry, CloseableManager closeableManager) {
        super(1);
        this.$registrar = networkCallbackRegistry;
        this.$closeableManager = closeableManager;
    }

    @Override // ho.l
    public final NetworkCallbackManagerImpl invoke(ConnectivityManager.NetworkCallback networkCallback) {
        networkCallback.getClass();
        NetworkCallbackManagerImpl networkCallbackManagerImpl = new NetworkCallbackManagerImpl(networkCallback, this.$registrar);
        this.$closeableManager.registerClosable(networkCallbackManagerImpl);
        return networkCallbackManagerImpl;
    }
}
