package io.livekit.android.stats;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lio/livekit/android/stats/AndroidNetworkInfo;", "Lio/livekit/android/stats/NetworkInfo;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getNetworkType", "Lio/livekit/android/stats/NetworkType;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AndroidNetworkInfo implements NetworkInfo {
    private final Context context;

    public AndroidNetworkInfo(Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // io.livekit.android.stats.NetworkInfo
    public NetworkType getNetworkType() {
        ConnectivityManager connectivityManager;
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return NetworkType.UNKNOWN;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return NetworkType.UNKNOWN;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return NetworkType.UNKNOWN;
        }
        if (networkCapabilities.hasTransport(1)) {
            return NetworkType.WIFI;
        }
        if (networkCapabilities.hasTransport(3)) {
            return NetworkType.ETHERNET;
        }
        if (networkCapabilities.hasTransport(0)) {
            return NetworkType.CELLULAR;
        }
        if (networkCapabilities.hasTransport(4)) {
            return NetworkType.VPN;
        }
        if (networkCapabilities.hasTransport(2)) {
            return NetworkType.BLUETOOTH;
        }
        if (networkCapabilities.hasTransport(5)) {
            return NetworkType.OTHER;
        }
        if (networkCapabilities.hasTransport(6)) {
            return NetworkType.OTHER;
        }
        if (networkCapabilities.hasTransport(8)) {
            return NetworkType.OTHER;
        }
        return NetworkType.UNKNOWN;
    }
}
