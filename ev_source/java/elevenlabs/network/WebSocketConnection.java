package io.elevenlabs.network;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import fr.r0;
import fs.k;
import ho.l;
import ho.p;
import hr.n;
import io.elevenlabs.ConversationConfig;
import io.elevenlabs.ConversationOverridesBuilder;
import io.elevenlabs.models.ConnectionStatusKt;
import io.elevenlabs.models.DisconnectionDetails;
import ir.j1;
import ir.r;
import ja.h3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import mr.d;
import mr.e;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONObject;
import sn.z;
import wn.c;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0007*\u0001A\u0018\u0000 F2\u00020\u0001:\u0001FB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\"H\u0016¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\"H\u0016¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\b058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010#\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010BR\u0014\u0010E\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lio/elevenlabs/network/WebSocketConnection;", "Lio/elevenlabs/network/BaseConnection;", "Lokhttp3/OkHttpClient;", "client", "Lfr/d0;", "scope", "<init>", "(Lokhttp3/OkHttpClient;Lfr/d0;)V", "", ParameterNames.TEXT, "Lsn/z;", "handleIncomingText", "(Ljava/lang/String;)V", "tryNotifyConversationId", "startMessageProcessing", "()V", "Lio/elevenlabs/network/ConnectionState;", "newState", "updateConnectionState", "(Lio/elevenlabs/network/ConnectionState;)V", "Lio/elevenlabs/models/DisconnectionDetails;", "details", "invokeOnDisconnect", "(Lio/elevenlabs/models/DisconnectionDetails;)V", "serverUrl", "Lio/elevenlabs/ConversationConfig;", "config", "connect", "(Ljava/lang/String;Lio/elevenlabs/ConversationConfig;Lwn/c;)Ljava/lang/Object;", "disconnect", "", "message", "sendMessage", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "listener", "setOnMessageListener", "(Lho/l;)V", "setOnConnectionStateListener", "cleanup", "Lokhttp3/OkHttpClient;", "Lfr/d0;", "Lir/j1;", "_connectionState", "Lir/j1;", "messageListener", "Lho/l;", "connectionStateListener", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/WebSocket;", "latestConfig", "Lio/elevenlabs/ConversationConfig;", "Lhr/n;", "messageChannel", "Lhr/n;", "Lfr/k1;", "messageJob", "Lfr/k1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disconnectCallbackInvoked", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "conversationIdNotified", "Z", "io/elevenlabs/network/WebSocketConnection$listener$1", "Lio/elevenlabs/network/WebSocketConnection$listener$1;", "getConnectionState", "()Lio/elevenlabs/network/ConnectionState;", "connectionState", "Companion", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class WebSocketConnection extends BaseConnection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NORMAL_CLOSURE = 1000;
    private static final String WS_PATH = "/v1/convai/conversation";
    private final j1 _connectionState;
    private final OkHttpClient client;
    private l connectionStateListener;
    private volatile boolean conversationIdNotified;
    private final AtomicBoolean disconnectCallbackInvoked;
    private ConversationConfig latestConfig;
    private final WebSocketConnection$listener$1 listener;
    private final n messageChannel;
    private k1 messageJob;
    private l messageListener;
    private final d0 scope;
    private WebSocket webSocket;

    /* JADX WARN: Type inference failed for: r2v6, types: [io.elevenlabs.network.WebSocketConnection$listener$1] */
    public WebSocketConnection(OkHttpClient okHttpClient, d0 d0Var) {
        okHttpClient.getClass();
        d0Var.getClass();
        this.client = okHttpClient;
        this.scope = d0Var;
        this._connectionState = r.c(ConnectionState.IDLE);
        this.messageChannel = a.b(f.API_PRIORITY_OTHER, 6, null);
        this.disconnectCallbackInvoked = new AtomicBoolean(false);
        this.listener = new WebSocketListener() { // from class: io.elevenlabs.network.WebSocketConnection$listener$1
            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int code, String reason) {
                DisconnectionDetails error;
                webSocket.getClass();
                reason.getClass();
                Log.d("WebSocketConnection", "WebSocket closed: code=" + code + " reason=" + reason);
                if (code == 1000) {
                    error = DisconnectionDetails.User.INSTANCE;
                } else {
                    error = new DisconnectionDetails.Error(new RuntimeException(p.n.h(code, "WebSocket closed: ", Separators.SP, reason)));
                }
                WebSocketConnection.this.updateConnectionState(ConnectionState.DISCONNECTED);
                WebSocketConnection.this.invokeOnDisconnect(error);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int code, String reason) {
                webSocket.getClass();
                reason.getClass();
                Log.d("WebSocketConnection", "WebSocket closing: code=" + code + " reason=" + reason);
                webSocket.f(code, reason);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
                Exception runtimeException;
                webSocket.getClass();
                t10.getClass();
                Log.e("WebSocketConnection", "WebSocket failure: " + t10.getMessage(), t10);
                WebSocketConnection.this.updateConnectionState(ConnectionState.ERROR);
                if (t10 instanceof Exception) {
                    runtimeException = (Exception) t10;
                } else {
                    runtimeException = new RuntimeException(t10);
                }
                WebSocketConnection.this.invokeOnDisconnect(new DisconnectionDetails.Error(runtimeException));
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, k bytes) {
                webSocket.getClass();
                bytes.getClass();
                WebSocketConnection.this.handleIncomingText(bytes.s());
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                ConversationConfig conversationConfig;
                webSocket.getClass();
                response.getClass();
                Log.d("WebSocketConnection", "WebSocket opened");
                WebSocketConnection.this.updateConnectionState(ConnectionState.CONNECTED);
                try {
                    conversationConfig = WebSocketConnection.this.latestConfig;
                    if (conversationConfig == null) {
                        return;
                    }
                    String jSONObject = ConversationOverridesBuilder.INSTANCE.constructOverrides(conversationConfig).toString();
                    jSONObject.getClass();
                    webSocket.a(jSONObject);
                } catch (Exception e10) {
                    android.gov.nist.javax.sip.header.a.s("Failed to send initiation payload: ", e10.getMessage(), "WebSocketConnection");
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String text) {
                webSocket.getClass();
                text.getClass();
                WebSocketConnection.this.handleIncomingText(text);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleIncomingText(String text) {
        p onMessage;
        this.messageChannel.d(text);
        try {
            ConversationConfig conversationConfig = this.latestConfig;
            if (conversationConfig != null && (onMessage = conversationConfig.getOnMessage()) != null) {
                onMessage.invoke("ai", text);
            }
        } catch (Throwable th) {
            android.gov.nist.javax.sip.header.a.s("onMessage callback threw: ", th.getMessage(), "WebSocketConnection");
        }
        if (!this.conversationIdNotified) {
            tryNotifyConversationId(text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeOnDisconnect(DisconnectionDetails details) {
        l onDisconnect;
        if (this.disconnectCallbackInvoked.compareAndSet(false, true)) {
            try {
                ConversationConfig conversationConfig = this.latestConfig;
                if (conversationConfig != null && (onDisconnect = conversationConfig.getOnDisconnect()) != null) {
                    onDisconnect.invoke(details);
                }
            } catch (Throwable th) {
                android.gov.nist.javax.sip.header.a.s("onDisconnect callback threw: ", th.getMessage(), "WebSocketConnection");
            }
        }
    }

    private final void startMessageProcessing() {
        this.messageJob = g0.D(this.scope, null, null, new WebSocketConnection$startMessageProcessing$1(this, null), 3);
    }

    private final void tryNotifyConversationId(String text) {
        l onConnect;
        try {
            JSONObject jSONObject = new JSONObject(text);
            if (m.c(jSONObject.optString("type"), "conversation_initiation_metadata")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("conversation_initiation_metadata_event");
                if (optJSONObject != null || (optJSONObject = jSONObject.optJSONObject("conversation_initiation_metadata")) != null) {
                    jSONObject = optJSONObject;
                }
                String optString = jSONObject.optString("conversation_id", "");
                optString.getClass();
                if (optString.length() == 0) {
                    return;
                }
                this.conversationIdNotified = true;
                try {
                    ConversationConfig conversationConfig = this.latestConfig;
                    if (conversationConfig != null && (onConnect = conversationConfig.getOnConnect()) != null) {
                        onConnect.invoke(optString);
                    }
                } catch (Throwable th) {
                    Log.d("WebSocketConnection", "onConnect callback threw: " + th.getMessage());
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConnectionState(ConnectionState newState) {
        l onStatusChange;
        if (this._connectionState.getValue() != newState) {
            this._connectionState.setValue(newState);
            l lVar = this.connectionStateListener;
            if (lVar != null) {
                lVar.invoke(newState);
            }
            try {
                ConversationConfig conversationConfig = this.latestConfig;
                if (conversationConfig != null && (onStatusChange = conversationConfig.getOnStatusChange()) != null) {
                    onStatusChange.invoke(ConnectionStatusKt.toConversationStatus(newState));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void cleanup() {
        BaseConnection.disconnect$default(this, null, 1, null);
        g0.i(this.scope, null);
    }

    @Override // io.elevenlabs.network.BaseConnection
    public Object connect(String str, ConversationConfig conversationConfig, c<? super z> cVar) {
        if (getConnectionState() != ConnectionState.IDLE && getConnectionState() != ConnectionState.DISCONNECTED) {
            c6.x("Already connected or connecting");
            return null;
        }
        try {
            updateConnectionState(ConnectionState.CONNECTING);
            this.latestConfig = conversationConfig;
            this.disconnectCallbackInvoked.set(false);
            this.conversationIdNotified = false;
            String buildWebSocketUrl$elevenlabs_sdk_release = INSTANCE.buildWebSocketUrl$elevenlabs_sdk_release(str, conversationConfig.getSignedUrl(), conversationConfig.getAgentId());
            Log.d("WebSocketConnection", "Connecting to " + buildWebSocketUrl$elevenlabs_sdk_release);
            Request.Builder builder = new Request.Builder();
            builder.f(buildWebSocketUrl$elevenlabs_sdk_release);
            this.webSocket = this.client.b(new Request(builder), this.listener);
            startMessageProcessing();
            return z.f31622a;
        } catch (Exception e10) {
            invokeOnDisconnect(new DisconnectionDetails.Error(e10));
            updateConnectionState(ConnectionState.ERROR);
            h3.e("Failed to open WebSocket", e10);
            return null;
        }
    }

    @Override // io.elevenlabs.network.BaseConnection
    public void disconnect(DisconnectionDetails details) {
        Throwable th;
        if (details == null) {
            details = DisconnectionDetails.User.INSTANCE;
        }
        try {
            try {
                k1 k1Var = this.messageJob;
                if (k1Var != null) {
                    k1Var.cancel((CancellationException) null);
                }
                this.messageJob = null;
                WebSocket webSocket = this.webSocket;
                if (webSocket != null) {
                    webSocket.f(1000, "client closed");
                }
                this.webSocket = null;
                updateConnectionState(ConnectionState.IDLE);
                Log.d("WebSocketConnection", "Disconnected and reset to IDLE state");
                invokeOnDisconnect(details);
            } catch (Throwable th2) {
                th = th2;
                invokeOnDisconnect(details);
                throw th;
            }
        } catch (Exception e10) {
            Log.d("WebSocketConnection", "Error during disconnect: " + e10.getMessage());
            DisconnectionDetails.Error error = new DisconnectionDetails.Error(e10);
            try {
                updateConnectionState(ConnectionState.ERROR);
                invokeOnDisconnect(error);
            } catch (Throwable th3) {
                th = th3;
                details = error;
                invokeOnDisconnect(details);
                throw th;
            }
        }
    }

    @Override // io.elevenlabs.network.BaseConnection
    public ConnectionState getConnectionState() {
        return (ConnectionState) this._connectionState.getValue();
    }

    @Override // io.elevenlabs.network.BaseConnection
    public void sendMessage(Object message) {
        String serializeOutgoingEvent;
        message.getClass();
        if (getConnectionState().isActive()) {
            WebSocket webSocket = this.webSocket;
            if (webSocket != null) {
                if (message instanceof String) {
                    serializeOutgoingEvent = (String) message;
                } else {
                    serializeOutgoingEvent = ConversationEventParser.INSTANCE.serializeOutgoingEvent((OutgoingEvent) message);
                }
                if (!webSocket.a(serializeOutgoingEvent)) {
                    Log.d("WebSocketConnection", "WebSocket.send returned false (queue full or closed)");
                    return;
                }
                return;
            }
            c6.x("WebSocket not initialized");
            return;
        }
        c6.x("Not connected");
    }

    @Override // io.elevenlabs.network.BaseConnection
    public void setOnConnectionStateListener(l listener) {
        listener.getClass();
        this.connectionStateListener = listener;
    }

    @Override // io.elevenlabs.network.BaseConnection
    public void setOnMessageListener(l listener) {
        listener.getClass();
        this.messageListener = listener;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/network/WebSocketConnection$Companion;", "", "<init>", "()V", "WS_PATH", "", "NORMAL_CLOSURE", "", "buildWebSocketUrl", "serverUrl", "signedUrl", "agentId", "buildWebSocketUrl$elevenlabs_sdk_release", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final String buildWebSocketUrl$elevenlabs_sdk_release(String serverUrl, String signedUrl, String agentId) {
            serverUrl.getClass();
            if (signedUrl != null && !wq.n.m0(signedUrl)) {
                if (!u.W(signedUrl, "ws://", false) && !u.W(signedUrl, "wss://", false)) {
                    c6.t("signedUrl must be a ws:// or wss:// URL");
                    return null;
                }
                return signedUrl;
            }
            if (agentId != null && !wq.n.m0(agentId)) {
                return defpackage.f.j(wq.n.M0(u.U(u.U(serverUrl, "https://", "wss://"), "http://", "ws://"), '/'), "/v1/convai/conversation?agent_id=", agentId);
            }
            c6.t("WebSocket connection requires either signedUrl (private) or agentId (public)");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebSocketConnection(OkHttpClient okHttpClient, d0 d0Var, int i10, kotlin.jvm.internal.f fVar) {
        this(okHttpClient, d0Var);
        okHttpClient = (i10 & 1) != 0 ? new OkHttpClient() : okHttpClient;
        if ((i10 & 2) != 0) {
            e eVar = r0.f9888a;
            d0Var = g0.c(d.f23445b.plus(g0.f()));
        }
    }

    public WebSocketConnection() {
        this(null, null, 3, null);
    }
}
