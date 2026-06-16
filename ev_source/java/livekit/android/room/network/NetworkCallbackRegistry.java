package io.livekit.android.room.network;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/room/network/NetworkCallbackRegistry;", "", "Landroid/net/NetworkRequest;", "networkRequest", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Lsn/z;", "registerNetworkCallback", "(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V", "unregisterNetworkCallback", "(Landroid/net/ConnectivityManager$NetworkCallback;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface NetworkCallbackRegistry {
    void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback);

    void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback);
}
