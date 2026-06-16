package io.livekit.android.room.network;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import et.d;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/livekit/android/room/network/NetworkCallbackManagerImpl;", "Lio/livekit/android/room/network/NetworkCallbackManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Lio/livekit/android/room/network/NetworkCallbackRegistry;", "connectivityManager", "<init>", "(Landroid/net/ConnectivityManager$NetworkCallback;Lio/livekit/android/room/network/NetworkCallbackRegistry;)V", "Lsn/z;", "registerCallback", "()V", "unregisterCallback", "close", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lio/livekit/android/room/network/NetworkCallbackRegistry;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class NetworkCallbackManagerImpl implements NetworkCallbackManager {
    private final NetworkCallbackRegistry connectivityManager;
    private final AtomicBoolean isClosed;
    private final AtomicBoolean isRegistered;
    private final ConnectivityManager.NetworkCallback networkCallback;

    public NetworkCallbackManagerImpl(ConnectivityManager.NetworkCallback networkCallback, NetworkCallbackRegistry networkCallbackRegistry) {
        networkCallback.getClass();
        networkCallbackRegistry.getClass();
        this.networkCallback = networkCallback;
        this.connectivityManager = networkCallbackRegistry;
        this.isRegistered = new AtomicBoolean(false);
        this.isClosed = new AtomicBoolean(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.isClosed.get()) {
                return;
            }
            if (this.isRegistered.get()) {
                unregisterCallback();
            }
            this.isClosed.set(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.livekit.android.room.network.NetworkCallbackManager
    public synchronized void registerCallback() {
        if (!this.isClosed.get() && this.isRegistered.compareAndSet(false, true)) {
            try {
                NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
                NetworkCallbackRegistry networkCallbackRegistry = this.connectivityManager;
                build.getClass();
                networkCallbackRegistry.registerNetworkCallback(build, this.networkCallback);
            } catch (Exception e10) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.f(e10, "Exception when trying to register network callback, reconnection may be impaired.", new Object[0]);
                }
            }
        }
    }

    @Override // io.livekit.android.room.network.NetworkCallbackManager
    public synchronized void unregisterCallback() {
        if (!this.isClosed.get() && this.isRegistered.compareAndSet(true, false)) {
            try {
                this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
            } catch (IllegalArgumentException unused) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.f(null, "NetworkCallback was unregistered multiple times?", new Object[0]);
                }
            }
        }
    }
}
