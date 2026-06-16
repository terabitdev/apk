package io.livekit.android.room.rpc;

import com.google.firebase.analytics.FirebaseAnalytics;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;
import xq.a;
import xq.b;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J;\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Lio/livekit/android/room/rpc/RpcManager;", "", "", FirebaseAnalytics.Param.METHOD, "Lkotlin/Function2;", "Lio/livekit/android/room/participant/RpcInvocationData;", "Lwn/c;", "handler", "Lsn/z;", "registerRpcMethod", "(Ljava/lang/String;Lho/p;)V", "unregisterRpcMethod", "(Ljava/lang/String;)V", "Lio/livekit/android/room/participant/Participant$Identity;", "destinationIdentity", "payload", "Lxq/b;", "responseTimeout", "performRpc-9o0yd6Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "performRpc", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface RpcManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int RPC_VERSION = 1;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lio/livekit/android/room/rpc/RpcManager$Companion;", "", "()V", "RPC_VERSION", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int RPC_VERSION = 1;

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        /* renamed from: performRpc-9o0yd6Q$default, reason: not valid java name */
        public static /* synthetic */ Object m2632performRpc9o0yd6Q$default(RpcManager rpcManager, String str, String str2, String str3, long j4, c cVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    a aVar = b.f38124b;
                    j4 = g.n(15, d.SECONDS);
                }
                return rpcManager.mo2540performRpc9o0yd6Q(str, str2, str3, j4, cVar);
            }
            a9.a.y("Super calls with default arguments not supported in this target, function: performRpc-9o0yd6Q");
            return null;
        }
    }

    /* renamed from: performRpc-9o0yd6Q */
    Object mo2540performRpc9o0yd6Q(String str, String str2, String str3, long j4, c<? super String> cVar);

    void registerRpcMethod(String method, p handler);

    void unregisterRpcMethod(String method);
}
