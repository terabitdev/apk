package io.elevenlabs.readerapp.services;

import android.gov.nist.core.Separators;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.google.protobuf.c6;
import ho.p;
import hr.w;
import hr.x;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import n0.l;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.AndroidConnectivityService$isConnected$1", f = "AndroidConnectivityService.kt", l = {71}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AndroidConnectivityService$isConnected$1 extends i implements p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AndroidConnectivityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidConnectivityService$isConnected$1(AndroidConnectivityService androidConnectivityService, c<? super AndroidConnectivityService$isConnected$1> cVar) {
        super(2, cVar);
        this.this$0 = androidConnectivityService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z invokeSuspend$lambda$0(AndroidConnectivityService androidConnectivityService, AndroidConnectivityService$isConnected$1$networkCallback$1 androidConnectivityService$isConnected$1$networkCallback$1) {
        ConnectivityManager connectivityManager;
        connectivityManager = androidConnectivityService.connectivityManager;
        connectivityManager.unregisterNetworkCallback(androidConnectivityService$isConnected$1$networkCallback$1);
        return z.f31622a;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        AndroidConnectivityService$isConnected$1 androidConnectivityService$isConnected$1 = new AndroidConnectivityService$isConnected$1(this.this$0, cVar);
        androidConnectivityService$isConnected$1.L$0 = obj;
        return androidConnectivityService$isConnected$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, c<? super z> cVar) {
        return ((AndroidConnectivityService$isConnected$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.net.ConnectivityManager$NetworkCallback, io.elevenlabs.readerapp.services.AndroidConnectivityService$isConnected$1$networkCallback$1] */
    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConnectivityManager connectivityManager;
        final x xVar = (x) this.L$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            final AndroidConnectivityService androidConnectivityService = this.this$0;
            final ?? r12 = new ConnectivityManager.NetworkCallback() { // from class: io.elevenlabs.readerapp.services.AndroidConnectivityService$isConnected$1$networkCallback$1
                private final void emitConnectivityChange(Network target, boolean targetOnline) {
                    ConnectivityManager connectivityManager2;
                    boolean anyNetworkOnline;
                    Logger logger;
                    AndroidConnectivityService androidConnectivityService2 = AndroidConnectivityService.this;
                    connectivityManager2 = androidConnectivityService2.connectivityManager;
                    anyNetworkOnline = androidConnectivityService2.anyNetworkOnline(connectivityManager2, target, Boolean.valueOf(targetOnline));
                    x xVar2 = xVar;
                    if (((w) xVar2).f12593d.d(Boolean.valueOf(anyNetworkOnline)) instanceof hr.p) {
                        logger = AndroidConnectivityService.this.logger;
                        logger.log("AndroidConnectivityService", "Failed to emit connectivity change");
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    Logger logger;
                    network.getClass();
                    logger = AndroidConnectivityService.this.logger;
                    logger.log("AndroidConnectivityService", "Network became available (" + network + Separators.RPAREN);
                    emitConnectivityChange(network, true);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    Logger logger;
                    network.getClass();
                    networkCapabilities.getClass();
                    boolean hasCapability = networkCapabilities.hasCapability(12);
                    logger = AndroidConnectivityService.this.logger;
                    logger.log("AndroidConnectivityService", "Network capabilities changed (" + network + ") => " + hasCapability + " (networkCapabilities=" + networkCapabilities + Separators.RPAREN);
                    emitConnectivityChange(network, hasCapability);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    Logger logger;
                    network.getClass();
                    logger = AndroidConnectivityService.this.logger;
                    logger.log("AndroidConnectivityService", "Network lost (" + network + Separators.RPAREN);
                    emitConnectivityChange(network, false);
                }
            };
            connectivityManager = this.this$0.connectivityManager;
            connectivityManager.registerNetworkCallback(build, (ConnectivityManager.NetworkCallback) r12);
            final AndroidConnectivityService androidConnectivityService2 = this.this$0;
            ho.a aVar = new ho.a() { // from class: io.elevenlabs.readerapp.services.a
                @Override // ho.a
                public final Object invoke() {
                    z invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidConnectivityService$isConnected$1.invokeSuspend$lambda$0(AndroidConnectivityService.this, r12);
                    return invokeSuspend$lambda$0;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            Object h10 = l.h(xVar, aVar, this);
            xn.a aVar2 = xn.a.f37986a;
            if (h10 == aVar2) {
                return aVar2;
            }
        }
        return z.f31622a;
    }
}
