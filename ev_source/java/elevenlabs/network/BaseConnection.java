package io.elevenlabs.network;

import a9.a;
import ho.l;
import io.elevenlabs.ConversationConfig;
import io.elevenlabs.models.DisconnectionDetails;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0012H&¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/network/BaseConnection;", "", "<init>", "()V", "", "serverUrl", "Lio/elevenlabs/ConversationConfig;", "config", "Lsn/z;", "connect", "(Ljava/lang/String;Lio/elevenlabs/ConversationConfig;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/models/DisconnectionDetails;", "details", "disconnect", "(Lio/elevenlabs/models/DisconnectionDetails;)V", "message", "sendMessage", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "listener", "setOnMessageListener", "(Lho/l;)V", "Lio/elevenlabs/network/ConnectionState;", "setOnConnectionStateListener", "getConnectionState", "()Lio/elevenlabs/network/ConnectionState;", "connectionState", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class BaseConnection {
    public static /* synthetic */ void disconnect$default(BaseConnection baseConnection, DisconnectionDetails disconnectionDetails, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                disconnectionDetails = null;
            }
            baseConnection.disconnect(disconnectionDetails);
            return;
        }
        a.y("Super calls with default arguments not supported in this target, function: disconnect");
    }

    public abstract Object connect(String str, ConversationConfig conversationConfig, c<? super z> cVar);

    public abstract void disconnect(DisconnectionDetails details);

    public abstract ConnectionState getConnectionState();

    public abstract void sendMessage(Object message);

    public abstract void setOnConnectionStateListener(l listener);

    public abstract void setOnMessageListener(l listener);
}
