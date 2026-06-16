package io.elevenlabs.readerapp.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import fr.e1;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.highlighter.z;
import ir.m1;
import ir.o;
import ir.r;
import ir.y1;
import ir.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import xq.b;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\u000b*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/readerapp/services/AndroidConnectivityService;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Landroid/content/Context;", "context", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Landroid/content/Context;Lio/elevenlabs/domain/Logger;)V", "Landroid/net/ConnectivityManager;", "Landroid/net/Network;", "changed", "", "changedState", "anyNetworkOnline", "(Landroid/net/ConnectivityManager;Landroid/net/Network;Ljava/lang/Boolean;)Z", "isOnline", "(Landroid/net/Network;)Z", "Lio/elevenlabs/domain/Logger;", "connectivityManager", "Landroid/net/ConnectivityManager;", "Lir/z1;", "isConnected", "Lir/z1;", "()Lir/z1;", "isConnected$annotations", "()V", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AndroidConnectivityService implements ConnectivityService {
    private static final String TAG = "AndroidConnectivityService";
    private final ConnectivityManager connectivityManager;
    private final z1 isConnected;
    private final Logger logger;
    public static final int $stable = 8;

    public AndroidConnectivityService(Context context, Logger logger) {
        context.getClass();
        logger.getClass();
        this.logger = logger;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.connectivityManager = connectivityManager;
        this.isConnected = r.E(new m1(new o(new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.a(new z(16), 7), r.h(new AndroidConnectivityService$isConnected$1(this, null)), null)), e1.f9817a, new y1(5000L, Long.MAX_VALUE), Boolean.valueOf(anyNetworkOnline$default(this, connectivityManager, null, null, 3, null)));
    }

    public static /* synthetic */ b a(boolean z6) {
        return isConnected$lambda$0(z6);
    }

    public final boolean anyNetworkOnline(ConnectivityManager connectivityManager, Network network, Boolean bool) {
        boolean isOnline;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        allNetworks.getClass();
        for (Network network2 : allNetworks) {
            if (m.c(network2, network) && bool != null) {
                isOnline = bool.booleanValue();
            } else {
                network2.getClass();
                isOnline = isOnline(network2);
            }
            if (isOnline) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean anyNetworkOnline$default(AndroidConnectivityService androidConnectivityService, ConnectivityManager connectivityManager, Network network, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            network = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return androidConnectivityService.anyNetworkOnline(connectivityManager, network, bool);
    }

    public static final b isConnected$lambda$0(boolean z6) {
        long n2;
        d dVar = d.SECONDS;
        if (z6) {
            xq.a aVar = b.f38124b;
            n2 = g.n(0, dVar);
        } else {
            xq.a aVar2 = b.f38124b;
            n2 = g.n(1, dVar);
        }
        return new b(n2);
    }

    private final boolean isOnline(Network network) {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            return false;
        }
        return true;
    }

    @Override // io.elevenlabs.domain.services.ConnectivityService
    /* renamed from: isConnected, reason: from getter */
    public z1 getIsConnected() {
        return this.isConnected;
    }

    public static /* synthetic */ void isConnected$annotations() {
    }
}
