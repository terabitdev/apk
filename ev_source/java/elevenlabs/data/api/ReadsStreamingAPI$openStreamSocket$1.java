package io.elevenlabs.data.api;

import com.google.protobuf.c6;
import defpackage.f;
import ho.p;
import hr.w;
import hr.x;
import io.elevenlabs.domain.ApiException;
import io.elevenlabs.domain.Logger;
import ir.j;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import sn.k;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.api.ReadsStreamingAPI$openStreamSocket$1", f = "ReadsStreamingAPI.kt", l = {37}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhr/x;", "Lsn/k;", "Lio/elevenlabs/data/api/SendingChannel;", "Lio/elevenlabs/data/api/WebSocketDataResponse;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsStreamingAPI$openStreamSocket$1 extends i implements p {
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ String $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReadsStreamingAPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsStreamingAPI$openStreamSocket$1(ReadsStreamingAPI readsStreamingAPI, String str, Map<String, String> map, c<? super ReadsStreamingAPI$openStreamSocket$1> cVar) {
        super(2, cVar);
        this.this$0 = readsStreamingAPI;
        this.$uri = str;
        this.$headers = map;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        ReadsStreamingAPI$openStreamSocket$1 readsStreamingAPI$openStreamSocket$1 = new ReadsStreamingAPI$openStreamSocket$1(this.this$0, this.$uri, this.$headers, cVar);
        readsStreamingAPI$openStreamSocket$1.L$0 = obj;
        return readsStreamingAPI$openStreamSocket$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, c<? super z> cVar) {
        return ((ReadsStreamingAPI$openStreamSocket$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        OkHttpClient okHttpClient;
        ir.i webSocketStream;
        x xVar = (x) this.L$0;
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
            logger = this.this$0.logger;
            str = this.this$0.tag;
            logger.log(str, "Starting upstream flow");
            ReadsStreamingAPI readsStreamingAPI = this.this$0;
            okHttpClient = readsStreamingAPI.okHttpClient;
            webSocketStream = readsStreamingAPI.webSocketStream(okHttpClient, this.$uri, this.$headers);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, xVar);
            this.L$0 = null;
            this.label = 1;
            Object collect = webSocketStream.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.api.ReadsStreamingAPI$openStreamSocket$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1<T> implements j {
        final /* synthetic */ x $$this$channelFlow;
        final /* synthetic */ ReadsStreamingAPI this$0;

        public AnonymousClass1(ReadsStreamingAPI readsStreamingAPI, x xVar) {
            this.this$0 = readsStreamingAPI;
            this.$$this$channelFlow = xVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        
            if (((hr.w) r9).f12593d.c(r10, r0) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
        
            if (((hr.w) r3).f12593d.c(r10, r0) == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(k kVar, c<? super z> cVar) {
            ReadsStreamingAPI$openStreamSocket$1$1$emit$1 readsStreamingAPI$openStreamSocket$1$1$emit$1;
            int i10;
            WebSocketResponse webSocketResponse;
            Logger logger;
            String str;
            vr.c cVar2;
            vr.c cVar3;
            Logger logger2;
            String str2;
            Logger logger3;
            String str3;
            if (cVar instanceof ReadsStreamingAPI$openStreamSocket$1$1$emit$1) {
                readsStreamingAPI$openStreamSocket$1$1$emit$1 = (ReadsStreamingAPI$openStreamSocket$1$1$emit$1) cVar;
                int i11 = readsStreamingAPI$openStreamSocket$1$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    readsStreamingAPI$openStreamSocket$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = readsStreamingAPI$openStreamSocket$1$1$emit$1.result;
                    i10 = readsStreamingAPI$openStreamSocket$1$1$emit$1.label;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                webSocketResponse = (WebSocketResponse) readsStreamingAPI$openStreamSocket$1$1$emit$1.L$2;
                                sn.a.g(obj);
                                if (((WebSocketDataResponse) webSocketResponse).isFinal()) {
                                    logger3 = this.this$0.logger;
                                    str3 = this.this$0.tag;
                                    logger3.log(str3, "Final response received");
                                    ((w) this.$$this$channelFlow).m(null);
                                }
                                logger2 = this.this$0.logger;
                                str2 = this.this$0.tag;
                                logger2.log(str2, "Sending response");
                                return z.f31622a;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                        logger2 = this.this$0.logger;
                        str2 = this.this$0.tag;
                        logger2.log(str2, "Sending response");
                        return z.f31622a;
                    }
                    sn.a.g(obj);
                    WebSocket webSocket = (WebSocket) kVar.f31600a;
                    String str4 = (String) kVar.f31601b;
                    if (str4 != null) {
                        webSocketResponse = this.this$0.decodeResponse(str4);
                    } else {
                        webSocketResponse = null;
                    }
                    xn.a aVar = xn.a.f37986a;
                    if (webSocketResponse == null) {
                        x xVar = this.$$this$channelFlow;
                        cVar3 = this.this$0.json;
                        k kVar2 = new k(new WebSocketSendingChannel(webSocket, cVar3), null);
                        readsStreamingAPI$openStreamSocket$1$1$emit$1.L$0 = null;
                        readsStreamingAPI$openStreamSocket$1$1$emit$1.L$1 = null;
                        readsStreamingAPI$openStreamSocket$1$1$emit$1.L$2 = null;
                        readsStreamingAPI$openStreamSocket$1$1$emit$1.label = 1;
                    } else if (webSocketResponse instanceof WebSocketDataResponse) {
                        x xVar2 = this.$$this$channelFlow;
                        cVar2 = this.this$0.json;
                        k kVar3 = new k(new WebSocketSendingChannel(webSocket, cVar2), webSocketResponse);
                        readsStreamingAPI$openStreamSocket$1$1$emit$1.L$0 = null;
                        readsStreamingAPI$openStreamSocket$1$1$emit$1.L$1 = null;
                        readsStreamingAPI$openStreamSocket$1$1$emit$1.L$2 = webSocketResponse;
                        readsStreamingAPI$openStreamSocket$1$1$emit$1.label = 2;
                    } else {
                        if (webSocketResponse instanceof WebSocketErrorResponse) {
                            logger = this.this$0.logger;
                            str = this.this$0.tag;
                            WebSocketErrorResponse webSocketErrorResponse = (WebSocketErrorResponse) webSocketResponse;
                            logger.log(str, f.k("Error received: ", webSocketErrorResponse.getError(), " - ", webSocketErrorResponse.getMessage()));
                            throw new ApiException(webSocketErrorResponse.getError(), webSocketErrorResponse.getMessage(), null, 4, null);
                        }
                        c6.p();
                        return null;
                    }
                    return aVar;
                }
            }
            readsStreamingAPI$openStreamSocket$1$1$emit$1 = new ReadsStreamingAPI$openStreamSocket$1$1$emit$1(this, cVar);
            Object obj2 = readsStreamingAPI$openStreamSocket$1$1$emit$1.result;
            i10 = readsStreamingAPI$openStreamSocket$1$1$emit$1.label;
            if (i10 == 0) {
            }
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
            return emit((k) obj, (c<? super z>) cVar);
        }
    }
}
