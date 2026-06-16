package io.elevenlabs.data.api;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.Logger;
import ir.i;
import ir.r;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.serialization.json.b;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import vr.c;
import vr.j;
import vr.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJC\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00120\u0011*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00120\u00112\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/elevenlabs/data/api/ReadsStreamingAPI;", "Lio/elevenlabs/data/api/StreamingAPI;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lio/elevenlabs/domain/Logger;", "logger", "Lvr/c;", "json", "<init>", "(Lokhttp3/OkHttpClient;Lio/elevenlabs/domain/Logger;Lvr/c;)V", "", "Lio/elevenlabs/data/api/WebSocketResponse;", "decodeResponse", "(Ljava/lang/String;)Lio/elevenlabs/data/api/WebSocketResponse;", "url", "", "headers", "Lir/i;", "Lsn/k;", "Lokhttp3/WebSocket;", "webSocketStream", "(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/util/Map;)Lir/i;", "getNewStreamId", "()Ljava/lang/String;", "uri", "Lio/elevenlabs/data/api/SendingChannel;", "Lio/elevenlabs/data/api/WebSocketDataResponse;", "openStreamSocket", "(Ljava/lang/String;Ljava/util/Map;)Lir/i;", "Lokhttp3/OkHttpClient;", "Lio/elevenlabs/domain/Logger;", "Lvr/c;", ParameterNames.TAG, "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsStreamingAPI implements StreamingAPI {
    private final c json;
    private final Logger logger;
    private final OkHttpClient okHttpClient;
    private final String tag;

    public ReadsStreamingAPI(OkHttpClient okHttpClient, Logger logger, c cVar) {
        okHttpClient.getClass();
        logger.getClass();
        cVar.getClass();
        this.okHttpClient = okHttpClient;
        this.logger = logger;
        this.json = cVar;
        this.tag = "StreamingAPI";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebSocketResponse decodeResponse(String str) {
        c cVar = this.json;
        cVar.getClass();
        str.getClass();
        b bVar = (b) cVar.b(str, l.f35878a);
        boolean containsKey = j.g(bVar).containsKey(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        c cVar2 = this.json;
        if (containsKey) {
            cVar2.getClass();
            return (WebSocketResponse) cVar2.a(WebSocketErrorResponse.INSTANCE.serializer(), bVar);
        }
        cVar2.getClass();
        return (WebSocketResponse) cVar2.a(WebSocketDataResponse.INSTANCE.serializer(), bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i webSocketStream(OkHttpClient okHttpClient, String str, Map<String, String> map) {
        return r.j(new ReadsStreamingAPI$webSocketStream$1(this, okHttpClient, str, map, null));
    }

    @Override // io.elevenlabs.data.api.StreamingAPI
    public String getNewStreamId() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    @Override // io.elevenlabs.data.api.StreamingAPI
    public i openStreamSocket(String uri, Map<String, String> headers) {
        uri.getClass();
        headers.getClass();
        return r.j(new ReadsStreamingAPI$openStreamSocket$1(this, uri, headers, null));
    }
}
