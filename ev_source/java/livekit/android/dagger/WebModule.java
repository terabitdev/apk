package io.livekit.android.dagger;

import android.content.Context;
import android.net.ConnectivityManager;
import ho.l;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.room.network.NetworkCallbackRegistry;
import io.livekit.android.room.network.NetworkCallbackRegistryImpl;
import io.livekit.android.room.util.ConnectionWarmer;
import io.livekit.android.room.util.OkHttpConnectionWarmer;
import io.livekit.android.stats.AndroidNetworkInfo;
import io.livekit.android.stats.NetworkInfo;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001ej\u0002`!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/livekit/android/dagger/WebModule;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClientOverride", "okHttpClient", "(Lokhttp3/OkHttpClient;)Lokhttp3/OkHttpClient;", "Lio/livekit/android/room/util/OkHttpConnectionWarmer;", "okHttpConnectionWarmer", "Lio/livekit/android/room/util/ConnectionWarmer;", "connectionWarmer", "(Lio/livekit/android/room/util/OkHttpConnectionWarmer;)Lio/livekit/android/room/util/ConnectionWarmer;", "Lokhttp3/WebSocket$Factory;", "websocketFactory", "(Lokhttp3/OkHttpClient;)Lokhttp3/WebSocket$Factory;", "Landroid/content/Context;", "context", "Lio/livekit/android/stats/NetworkInfo;", "networkInfo", "(Landroid/content/Context;)Lio/livekit/android/stats/NetworkInfo;", "Landroid/net/ConnectivityManager;", "connectivityManager", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "Lio/livekit/android/room/network/NetworkCallbackRegistry;", "networkCallbackRegistrar", "(Landroid/net/ConnectivityManager;)Lio/livekit/android/room/network/NetworkCallbackRegistry;", "Lio/livekit/android/memory/CloseableManager;", "closeableManager", "registrar", "Lkotlin/Function1;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lio/livekit/android/room/network/NetworkCallbackManager;", "Lio/livekit/android/room/network/NetworkCallbackManagerFactory;", "networkCallbackManagerFactory", "(Lio/livekit/android/memory/CloseableManager;Lio/livekit/android/room/network/NetworkCallbackRegistry;)Lho/l;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class WebModule {
    public static final WebModule INSTANCE = new WebModule();

    private WebModule() {
    }

    public final ConnectionWarmer connectionWarmer(OkHttpConnectionWarmer okHttpConnectionWarmer) {
        okHttpConnectionWarmer.getClass();
        return okHttpConnectionWarmer;
    }

    public final ConnectivityManager connectivityManager(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        return (ConnectivityManager) systemService;
    }

    public final l networkCallbackManagerFactory(CloseableManager closeableManager, NetworkCallbackRegistry registrar) {
        closeableManager.getClass();
        registrar.getClass();
        return new WebModule$networkCallbackManagerFactory$1(registrar, closeableManager);
    }

    public final NetworkCallbackRegistry networkCallbackRegistrar(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        return new NetworkCallbackRegistryImpl(connectivityManager);
    }

    public final NetworkInfo networkInfo(Context context) {
        context.getClass();
        return new AndroidNetworkInfo(context);
    }

    public final OkHttpClient okHttpClient(OkHttpClient okHttpClientOverride) {
        if (okHttpClientOverride == null) {
            return WebModuleKt.getGlobalOkHttpClient();
        }
        return okHttpClientOverride;
    }

    public final WebSocket.Factory websocketFactory(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        return okHttpClient;
    }
}
