package io.elevenlabs.data.api;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import okhttp3.WebSocket;
import vr.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006#"}, d2 = {"Lio/elevenlabs/data/api/WebSocketSendingChannel;", "Lio/elevenlabs/data/api/SendingChannel;", "Lokhttp3/WebSocket;", "webSocket", "Lvr/c;", "json", "<init>", "(Lokhttp3/WebSocket;Lvr/c;)V", "component1", "()Lokhttp3/WebSocket;", "component2", "()Lvr/c;", "Lio/elevenlabs/data/api/InitialMessagePayload;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lsn/z;", "sendInitialMessage", "(Lio/elevenlabs/data/api/InitialMessagePayload;)V", "Lio/elevenlabs/data/api/PositionMessagePayload;", "sendPositionMessage", "(Lio/elevenlabs/data/api/PositionMessagePayload;)V", "copy", "(Lokhttp3/WebSocket;Lvr/c;)Lio/elevenlabs/data/api/WebSocketSendingChannel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/WebSocket;", "Lvr/c;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class WebSocketSendingChannel implements SendingChannel {
    private final c json;
    private final WebSocket webSocket;

    public WebSocketSendingChannel(WebSocket webSocket, c cVar) {
        webSocket.getClass();
        cVar.getClass();
        this.webSocket = webSocket;
        this.json = cVar;
    }

    /* renamed from: component1, reason: from getter */
    private final WebSocket getWebSocket() {
        return this.webSocket;
    }

    /* renamed from: component2, reason: from getter */
    private final c getJson() {
        return this.json;
    }

    public static /* synthetic */ WebSocketSendingChannel copy$default(WebSocketSendingChannel webSocketSendingChannel, WebSocket webSocket, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            webSocket = webSocketSendingChannel.webSocket;
        }
        if ((i10 & 2) != 0) {
            cVar = webSocketSendingChannel.json;
        }
        return webSocketSendingChannel.copy(webSocket, cVar);
    }

    public final WebSocketSendingChannel copy(WebSocket webSocket, c json) {
        webSocket.getClass();
        json.getClass();
        return new WebSocketSendingChannel(webSocket, json);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketSendingChannel)) {
            return false;
        }
        WebSocketSendingChannel webSocketSendingChannel = (WebSocketSendingChannel) other;
        if (m.c(this.webSocket, webSocketSendingChannel.webSocket) && m.c(this.json, webSocketSendingChannel.json)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.json.hashCode() + (this.webSocket.hashCode() * 31);
    }

    @Override // io.elevenlabs.data.api.SendingChannel
    public void sendInitialMessage(InitialMessagePayload data) {
        data.getClass();
        WebSocket webSocket = this.webSocket;
        c cVar = this.json;
        cVar.getClass();
        webSocket.a(cVar.d(InitialMessagePayload.INSTANCE.serializer(), data));
    }

    @Override // io.elevenlabs.data.api.SendingChannel
    public void sendPositionMessage(PositionMessagePayload data) {
        data.getClass();
        WebSocket webSocket = this.webSocket;
        c cVar = this.json;
        cVar.getClass();
        webSocket.a(cVar.d(PositionMessagePayload.INSTANCE.serializer(), data));
    }

    public String toString() {
        return "WebSocketSendingChannel(webSocket=" + this.webSocket + ", json=" + this.json + Separators.RPAREN;
    }
}
