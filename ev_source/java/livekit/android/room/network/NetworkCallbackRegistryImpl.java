package io.livekit.android.room.network;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/livekit/android/room/network/NetworkCallbackRegistryImpl;", "Lio/livekit/android/room/network/NetworkCallbackRegistry;", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroid/net/ConnectivityManager;)V", "Landroid/net/NetworkRequest;", "networkRequest", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Lsn/z;", "registerNetworkCallback", "(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V", "unregisterNetworkCallback", "(Landroid/net/ConnectivityManager$NetworkCallback;)V", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class NetworkCallbackRegistryImpl implements NetworkCallbackRegistry {
    private final ConnectivityManager connectivityManager;

    public NetworkCallbackRegistryImpl(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        this.connectivityManager = connectivityManager;
    }

    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    @Override // io.livekit.android.room.network.NetworkCallbackRegistry
    public void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        networkRequest.getClass();
        networkCallback.getClass();
        this.connectivityManager.registerNetworkCallback(networkRequest, networkCallback);
    }

    @Override // io.livekit.android.room.network.NetworkCallbackRegistry
    public void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        networkCallback.getClass();
        this.connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
