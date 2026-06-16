package io.elevenlabs.data.api;

import com.google.protobuf.c6;
import ho.p;
import hr.w;
import hr.x;
import io.elevenlabs.domain.Logger;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;
import sn.k;
import sn.l;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.api.ReadsStreamingAPI$webSocketStream$1", f = "ReadsStreamingAPI.kt", l = {87, 141}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhr/x;", "Lsn/k;", "Lokhttp3/WebSocket;", "", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsStreamingAPI$webSocketStream$1 extends i implements p {
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ OkHttpClient $this_webSocketStream;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ReadsStreamingAPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsStreamingAPI$webSocketStream$1(ReadsStreamingAPI readsStreamingAPI, OkHttpClient okHttpClient, String str, Map<String, String> map, c<? super ReadsStreamingAPI$webSocketStream$1> cVar) {
        super(2, cVar);
        this.this$0 = readsStreamingAPI;
        this.$this_webSocketStream = okHttpClient;
        this.$url = str;
        this.$headers = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z invokeSuspend$lambda$1(WebSocket webSocket) {
        webSocket.cancel();
        return z.f31622a;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        ReadsStreamingAPI$webSocketStream$1 readsStreamingAPI$webSocketStream$1 = new ReadsStreamingAPI$webSocketStream$1(this.this$0, this.$this_webSocketStream, this.$url, this.$headers, cVar);
        readsStreamingAPI$webSocketStream$1.L$0 = obj;
        return readsStreamingAPI$webSocketStream$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, c<? super z> cVar) {
        return ((ReadsStreamingAPI$webSocketStream$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (n0.l.h(r0, r1, r8) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r9 == r4) goto L19;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        final x xVar = (x) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            logger = this.this$0.logger;
            str = this.this$0.tag;
            this.L$0 = xVar;
            this.label = 1;
            obj = logger.startTransaction(str, "webSocketStream-first-message", this);
        }
        final Logger.Transaction transaction = (Logger.Transaction) obj;
        OkHttpClient okHttpClient = this.$this_webSocketStream;
        Request.Builder builder = new Request.Builder();
        builder.f(this.$url);
        for (Map.Entry<String, String> entry : this.$headers.entrySet()) {
            builder.c(entry.getKey(), entry.getValue());
        }
        Request request = new Request(builder);
        final ReadsStreamingAPI readsStreamingAPI = this.this$0;
        final RealWebSocket b10 = okHttpClient.b(request, new WebSocketListener() { // from class: io.elevenlabs.data.api.ReadsStreamingAPI$webSocketStream$1$webSocket$2
            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int code, String reason) {
                Logger logger2;
                String str2;
                webSocket.getClass();
                reason.getClass();
                logger2 = ReadsStreamingAPI.this.logger;
                str2 = ReadsStreamingAPI.this.tag;
                logger2.log(str2, "WebSocket onClosed");
                ((w) xVar).m(null);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
                Logger logger2;
                String str2;
                Object lVar;
                Logger logger3;
                String str3;
                webSocket.getClass();
                t10.getClass();
                transaction.error(t10);
                if (response == null) {
                    logger2 = ReadsStreamingAPI.this.logger;
                    str2 = ReadsStreamingAPI.this.tag;
                    logger2.log(str2, "WebSocket onFailure (no response) / " + t10);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("WebSocket onFailure - Response code: " + response.f25426d + ", URL: " + response.f25423a.f25399a);
                    try {
                        lVar = response.Y.E();
                    } catch (Throwable th) {
                        lVar = new l(th);
                    }
                    if (lVar instanceof l) {
                        lVar = null;
                    }
                    String str4 = (String) lVar;
                    if (str4 != null) {
                        sb.append(", Response body: ".concat(str4));
                    }
                    sb.append(" / " + t10);
                    String sb2 = sb.toString();
                    logger3 = ReadsStreamingAPI.this.logger;
                    str3 = ReadsStreamingAPI.this.tag;
                    logger3.log(str3, sb2);
                }
                webSocket.cancel();
                ((w) xVar).m(t10);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String text) {
                Logger logger2;
                String str2;
                webSocket.getClass();
                text.getClass();
                transaction.ok();
                logger2 = ReadsStreamingAPI.this.logger;
                str2 = ReadsStreamingAPI.this.tag;
                logger2.log(str2, "WebSocket onMessage");
                ((w) xVar).d(new k(webSocket, text));
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                Logger logger2;
                String str2;
                webSocket.getClass();
                response.getClass();
                super.onOpen(webSocket, response);
                logger2 = ReadsStreamingAPI.this.logger;
                str2 = ReadsStreamingAPI.this.tag;
                logger2.log(str2, "WebSocket onOpen");
                ((w) xVar).d(new k(webSocket, null));
            }
        });
        ho.a aVar2 = new ho.a() { // from class: io.elevenlabs.data.api.a
            @Override // ho.a
            public final Object invoke() {
                z invokeSuspend$lambda$1;
                invokeSuspend$lambda$1 = ReadsStreamingAPI$webSocketStream$1.invokeSuspend$lambda$1(RealWebSocket.this);
                return invokeSuspend$lambda$1;
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
