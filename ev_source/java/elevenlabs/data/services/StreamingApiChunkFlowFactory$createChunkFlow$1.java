package io.elevenlabs.data.services;

import android.gov.nist.core.Separators;
import android.net.Uri;
import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import hr.w;
import hr.x;
import io.elevenlabs.data.api.InitialMessagePayload;
import io.elevenlabs.data.api.PositionMessagePayload;
import io.elevenlabs.data.api.SendingChannel;
import io.elevenlabs.data.api.StreamingAPI;
import io.elevenlabs.data.api.WebSocketDataResponse;
import io.elevenlabs.data.model.response.Alignment;
import io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.ApiException;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.ReadsService;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$1", f = "ReadsStreamingService.kt", l = {294, 300, 303, 312, 324, 342, 432, 443}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/data/api/WebSocketDataResponse;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class StreamingApiChunkFlowFactory$createChunkFlow$1 extends yn.i implements p {
    final /* synthetic */ String $readId;
    final /* synthetic */ long $startingPosition;
    final /* synthetic */ String $uri;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ StreamingApiChunkFlowFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamingApiChunkFlowFactory$createChunkFlow$1(StreamingApiChunkFlowFactory streamingApiChunkFlowFactory, long j4, String str, String str2, wn.c<? super StreamingApiChunkFlowFactory$createChunkFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = streamingApiChunkFlowFactory;
        this.$startingPosition = j4;
        this.$readId = str;
        this.$uri = str2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        StreamingApiChunkFlowFactory$createChunkFlow$1 streamingApiChunkFlowFactory$createChunkFlow$1 = new StreamingApiChunkFlowFactory$createChunkFlow$1(this.this$0, this.$startingPosition, this.$readId, this.$uri, cVar);
        streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = obj;
        return streamingApiChunkFlowFactory$createChunkFlow$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((StreamingApiChunkFlowFactory$createChunkFlow$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:(1:12)|13|14|15|16|(1:18)(1:89)|19|20|(2:73|74)|22|23|24|25|26|27|28|(5:30|31|32|8|(2:10|11)(0))|33|34) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:12|13|14|15|16|(1:18)(1:89)|19|20|(2:73|74)|22|23|24|25|26|27|28|(5:30|31|32|8|(2:10|11)(0))|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x031a, code lost:
    
        if (r13 == r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x025d, code lost:
    
        if (r10 == r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0225, code lost:
    
        if (r0 == r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0430, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0431, code lost:
    
        r6 = r11;
        r31 = r18;
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0436, code lost:
    
        r11 = r3;
        r3 = r2;
        r2 = r12;
        r12 = r17;
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x05df, code lost:
    
        r6 = r9;
        r0 = r10;
        r9 = io.elevenlabs.data.services.StreamingApiChunkFlowFactory.INITIAL_WS_RETRY_DELAY;
        r9 = xq.b.h(1 << (r7.f20557a - 1), r9);
        r0 = r1.this$0.logger;
        r0.log("StreamingApiChunkFlowFactory", r12.concat(xq.b.j(r9)));
        r1.L$0 = r5;
        r1.L$1 = null;
        r1.L$2 = r4;
        r1.L$3 = r3;
        r1.L$4 = r15;
        r1.L$5 = null;
        r1.L$6 = null;
        r1.L$7 = r14;
        r1.L$8 = null;
        r1.L$9 = r13;
        r1.L$10 = r2;
        r1.L$11 = r0;
        r1.L$12 = r6;
        r1.L$13 = r7;
        r1.L$14 = r11;
        r18 = r2;
        r1.L$15 = null;
        r1.J$0 = r9;
        r1.label = 7;
        r2 = fr.g0.n(r9, r1);
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0639, code lost:
    
        if (r2 == r9) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x063c, code lost:
    
        r20 = r0;
        r22 = r3;
        r24 = r5;
        r25 = r6;
        r23 = r7;
        r27 = r11;
        r28 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x042a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x042b, code lost:
    
        r5 = r3;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04e5, code lost:
    
        r6 = r1.this$0.logger;
        r21 = r5;
        r5 = r18;
        r18 = r12;
        r12 = r19;
        ib.i.q(r12, r7.f20557a, r5, r6, "StreamingApiChunkFlowFactory");
        r10.error(r0);
        r9.error(r0);
        ((hr.w) r3).f12593d.n(false, r0);
        r22 = r2;
        r24 = r3;
        r19 = r4;
        r23 = r7;
        r25 = r9;
        r6 = r12;
        r28 = r15;
        r4 = r17;
        r12 = r18;
        r11 = r20;
        r27 = r21;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0520, code lost:
    
        r21 = r5;
        r11 = r18;
        r18 = r12;
        r5 = io.elevenlabs.data.services.StreamingApiChunkFlowFactory.INITIAL_WS_RETRY_DELAY;
        r5 = xq.b.h(1 << (r7.f20557a - 1), r5);
        r0 = r1.this$0.logger;
        r31 = r11;
        r12 = r17;
        r0.log("StreamingApiChunkFlowFactory", r12.concat(xq.b.j(r5)));
        r1.L$0 = r3;
        r1.L$1 = null;
        r1.L$2 = r4;
        r1.L$3 = r2;
        r1.L$4 = r15;
        r1.L$5 = null;
        r1.L$6 = null;
        r1.L$7 = r14;
        r1.L$8 = null;
        r1.L$9 = r13;
        r1.L$10 = r18;
        r1.L$11 = r10;
        r1.L$12 = r9;
        r1.L$13 = r7;
        r1.L$14 = r21;
        r1.L$15 = null;
        r1.J$0 = r5;
        r1.label = 8;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x057e, code lost:
    
        if (fr.g0.n(r5, r1) == r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0583, code lost:
    
        r27 = r21;
        r22 = r2;
        r24 = r3;
        r23 = r7;
        r25 = r9;
        r20 = r10;
        r28 = r15;
        r15 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x041f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0420, code lost:
    
        r22 = r2;
        r27 = r3;
        r23 = r7;
        r28 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0447, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0448, code lost:
    
        r6 = r11;
        r31 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0443, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0444, code lost:
    
        r24 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x043f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0440, code lost:
    
        r24 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0479, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x047a, code lost:
    
        r17 = r4;
        r18 = r5;
        r4 = r19;
        r10 = r20;
        r2 = r22;
        r7 = r23;
        r9 = r25;
        r3 = r27;
        r15 = r28;
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x044e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x044f, code lost:
    
        r17 = r4;
        r18 = r5;
        r4 = r19;
        r10 = r20;
        r9 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04a7, code lost:
    
        r31 = r5;
        r18 = r12;
        r12 = r4;
        r4 = r19;
        r10 = r20;
        r2 = r22;
        r7 = r23;
        r9 = r25;
        r3 = r27;
        r15 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04bf, code lost:
    
        r19 = r6;
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x05b4, code lost:
    
        r17 = r0;
        r11 = r3;
        r5 = r24;
        r3 = r2;
        r2 = r18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d4 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:118:0x01c8, B:120:0x02cc, B:123:0x02de, B:127:0x02d4, B:129:0x02d8, B:130:0x02e7, B:131:0x02ec), top: B:117:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x034f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0520  */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10, types: [kotlin.jvm.internal.b0] */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v10, types: [kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x04e5 -> B:8:0x0349). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0583 -> B:7:0x0593). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        Object startTransaction;
        Logger.Transaction transaction;
        StreamingAPI streamingAPI;
        String newStreamId;
        AtomicLong atomicLong;
        AtomicBoolean atomicBoolean;
        ReadsService readsService;
        Object read;
        String str;
        Object ensureVoiceIdQueryParam;
        Logger.Transaction transaction2;
        AtomicBoolean atomicBoolean2;
        Logger.Transaction transaction3;
        String str2;
        OfflineReadData offlineReadData;
        Uri uri;
        Logger.Transaction startChild;
        AtomicLong atomicLong2;
        Logger.Transaction transaction4;
        AppCheckTokenService appCheckTokenService;
        Object appCheckToken;
        String str3;
        Uri uri2;
        AtomicBoolean atomicBoolean3;
        AtomicLong atomicLong3;
        String str4;
        Logger.Transaction transaction5;
        AnonCaptchaTokenService anonCaptchaTokenService;
        Object token;
        AppCheckTokenService.Result result;
        x xVar;
        AtomicBoolean atomicBoolean4;
        AtomicLong atomicLong4;
        String str5;
        Logger.Transaction startChild2;
        String str6;
        Logger.Transaction transaction6;
        ?? obj2;
        ?? obj3;
        String str7;
        Uri uri3;
        c0 c0Var;
        b0 b0Var;
        Logger.Transaction transaction7;
        Logger.Transaction transaction8;
        AtomicBoolean atomicBoolean5;
        String str8;
        String str9;
        String str10;
        String str11;
        x xVar2;
        AtomicLong atomicLong5;
        c0 c0Var2;
        String str12;
        xn.a aVar;
        x xVar3;
        c0 c0Var3;
        String str13;
        AtomicLong atomicLong6;
        ApiException apiException;
        String str14;
        int i10;
        int i11;
        Logger logger2;
        String str15;
        StreamingAPI streamingAPI2;
        StreamingApiChunkFlowFactory$createChunkFlow$1 streamingApiChunkFlowFactory$createChunkFlow$1 = this;
        x xVar4 = (x) streamingApiChunkFlowFactory$createChunkFlow$1.L$0;
        int i12 = streamingApiChunkFlowFactory$createChunkFlow$1.label;
        String str16 = "WebSocket error, retrying in ";
        String str17 = " attempts";
        String str18 = "WebSocket error failed after ";
        xn.a aVar2 = xn.a.f37986a;
        switch (i12) {
            case 0:
                sn.a.g(obj);
                logger = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.logger;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                streamingApiChunkFlowFactory$createChunkFlow$1.label = 1;
                startTransaction = logger.startTransaction("StreamingApiChunkFlowFactory", "connectionFlow", streamingApiChunkFlowFactory$createChunkFlow$1);
                break;
            case 1:
                sn.a.g(obj);
                startTransaction = obj;
                transaction = (Logger.Transaction) startTransaction;
                streamingAPI = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.streamingAPI;
                newStreamId = streamingAPI.getNewStreamId();
                atomicLong = new AtomicLong(streamingApiChunkFlowFactory$createChunkFlow$1.$startingPosition);
                atomicBoolean = new AtomicBoolean(false);
                readsService = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.readsService;
                String str19 = streamingApiChunkFlowFactory$createChunkFlow$1.$readId;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = transaction;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = newStreamId;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean;
                streamingApiChunkFlowFactory$createChunkFlow$1.label = 2;
                read = readsService.getRead(str19, streamingApiChunkFlowFactory$createChunkFlow$1);
                break;
            case 2:
                atomicBoolean = (AtomicBoolean) streamingApiChunkFlowFactory$createChunkFlow$1.L$4;
                atomicLong = (AtomicLong) streamingApiChunkFlowFactory$createChunkFlow$1.L$3;
                newStreamId = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$2;
                transaction = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$1;
                sn.a.g(obj);
                read = obj;
                ReadMeta readMeta = (ReadMeta) read;
                if (readMeta != null && (offlineReadData = readMeta.getOfflineReadData()) != null) {
                    str = offlineReadData.getVoiceId();
                } else {
                    str = null;
                }
                Logger.Transaction startChild3 = transaction.startChild("updateUri");
                StreamingApiChunkFlowFactory streamingApiChunkFlowFactory = streamingApiChunkFlowFactory$createChunkFlow$1.this$0;
                String str20 = streamingApiChunkFlowFactory$createChunkFlow$1.$uri;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = transaction;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = newStreamId;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$5 = null;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$6 = startChild3;
                streamingApiChunkFlowFactory$createChunkFlow$1.label = 3;
                ensureVoiceIdQueryParam = streamingApiChunkFlowFactory.ensureVoiceIdQueryParam(str20, str, streamingApiChunkFlowFactory$createChunkFlow$1);
                if (ensureVoiceIdQueryParam != aVar2) {
                    transaction2 = transaction;
                    atomicBoolean2 = atomicBoolean;
                    transaction3 = startChild3;
                    str2 = newStreamId;
                    uri = (Uri) ensureVoiceIdQueryParam;
                    transaction3.ok();
                    startChild = transaction2.startChild("getAppCheckToken");
                    try {
                        appCheckTokenService = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.appCheckTokenService;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = transaction2;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = str2;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean2;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$5 = null;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$6 = null;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$7 = uri;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$8 = startChild;
                        streamingApiChunkFlowFactory$createChunkFlow$1.label = 4;
                        appCheckToken = appCheckTokenService.getAppCheckToken(streamingApiChunkFlowFactory$createChunkFlow$1);
                    } catch (Exception e10) {
                        e = e10;
                        atomicLong2 = atomicLong;
                        transaction4 = startChild;
                        transaction4.error(e);
                        str3 = null;
                        uri2 = uri;
                        atomicBoolean3 = atomicBoolean2;
                        atomicLong3 = atomicLong2;
                        str4 = str2;
                        transaction5 = transaction2;
                        anonCaptchaTokenService = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.anonCaptchaTokenService;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = transaction5;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = str4;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong3;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean3;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$5 = null;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$6 = null;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$7 = uri2;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$8 = null;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$9 = str3;
                        streamingApiChunkFlowFactory$createChunkFlow$1.label = 5;
                        token = anonCaptchaTokenService.getToken(streamingApiChunkFlowFactory$createChunkFlow$1);
                        break;
                    }
                    if (appCheckToken != aVar2) {
                        atomicLong2 = atomicLong;
                        transaction4 = startChild;
                        result = (AppCheckTokenService.Result) appCheckToken;
                        if (!(result instanceof AppCheckTokenService.Result.Error)) {
                            str3 = null;
                        } else if (result instanceof AppCheckTokenService.Result.Success) {
                            str3 = ((AppCheckTokenService.Result.Success) result).getToken();
                        } else {
                            throw new RuntimeException();
                        }
                        transaction4.ok();
                        uri2 = uri;
                        atomicBoolean3 = atomicBoolean2;
                        atomicLong3 = atomicLong2;
                        str4 = str2;
                        transaction5 = transaction2;
                        anonCaptchaTokenService = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.anonCaptchaTokenService;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = transaction5;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = str4;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong3;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean3;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$5 = null;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$6 = null;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$7 = uri2;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$8 = null;
                        streamingApiChunkFlowFactory$createChunkFlow$1.L$9 = str3;
                        streamingApiChunkFlowFactory$createChunkFlow$1.label = 5;
                        token = anonCaptchaTokenService.getToken(streamingApiChunkFlowFactory$createChunkFlow$1);
                    }
                }
                return aVar2;
            case 3:
                transaction3 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$6;
                AtomicBoolean atomicBoolean6 = (AtomicBoolean) streamingApiChunkFlowFactory$createChunkFlow$1.L$4;
                AtomicLong atomicLong7 = (AtomicLong) streamingApiChunkFlowFactory$createChunkFlow$1.L$3;
                String str21 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$2;
                Logger.Transaction transaction9 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$1;
                sn.a.g(obj);
                str2 = str21;
                transaction2 = transaction9;
                ensureVoiceIdQueryParam = obj;
                atomicBoolean2 = atomicBoolean6;
                atomicLong = atomicLong7;
                uri = (Uri) ensureVoiceIdQueryParam;
                transaction3.ok();
                startChild = transaction2.startChild("getAppCheckToken");
                appCheckTokenService = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.appCheckTokenService;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = transaction2;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = str2;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean2;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$5 = null;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$6 = null;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$7 = uri;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$8 = startChild;
                streamingApiChunkFlowFactory$createChunkFlow$1.label = 4;
                appCheckToken = appCheckTokenService.getAppCheckToken(streamingApiChunkFlowFactory$createChunkFlow$1);
                if (appCheckToken != aVar2) {
                }
                return aVar2;
            case 4:
                transaction4 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$8;
                uri = (Uri) streamingApiChunkFlowFactory$createChunkFlow$1.L$7;
                atomicBoolean2 = (AtomicBoolean) streamingApiChunkFlowFactory$createChunkFlow$1.L$4;
                atomicLong2 = (AtomicLong) streamingApiChunkFlowFactory$createChunkFlow$1.L$3;
                str2 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$2;
                transaction2 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$1;
                try {
                    sn.a.g(obj);
                    appCheckToken = obj;
                    result = (AppCheckTokenService.Result) appCheckToken;
                    if (!(result instanceof AppCheckTokenService.Result.Error)) {
                    }
                    transaction4.ok();
                } catch (Exception e11) {
                    e = e11;
                    transaction4.error(e);
                    str3 = null;
                    uri2 = uri;
                    atomicBoolean3 = atomicBoolean2;
                    atomicLong3 = atomicLong2;
                    str4 = str2;
                    transaction5 = transaction2;
                    anonCaptchaTokenService = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.anonCaptchaTokenService;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = transaction5;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = str4;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong3;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean3;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$5 = null;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$6 = null;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$7 = uri2;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$8 = null;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$9 = str3;
                    streamingApiChunkFlowFactory$createChunkFlow$1.label = 5;
                    token = anonCaptchaTokenService.getToken(streamingApiChunkFlowFactory$createChunkFlow$1);
                    break;
                }
                uri2 = uri;
                atomicBoolean3 = atomicBoolean2;
                atomicLong3 = atomicLong2;
                str4 = str2;
                transaction5 = transaction2;
                anonCaptchaTokenService = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.anonCaptchaTokenService;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar4;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = transaction5;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = str4;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong3;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean3;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$5 = null;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$6 = null;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$7 = uri2;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$8 = null;
                streamingApiChunkFlowFactory$createChunkFlow$1.L$9 = str3;
                streamingApiChunkFlowFactory$createChunkFlow$1.label = 5;
                token = anonCaptchaTokenService.getToken(streamingApiChunkFlowFactory$createChunkFlow$1);
                break;
            case 5:
                str3 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$9;
                uri2 = (Uri) streamingApiChunkFlowFactory$createChunkFlow$1.L$7;
                atomicBoolean3 = (AtomicBoolean) streamingApiChunkFlowFactory$createChunkFlow$1.L$4;
                atomicLong3 = (AtomicLong) streamingApiChunkFlowFactory$createChunkFlow$1.L$3;
                str4 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$2;
                transaction5 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$1;
                sn.a.g(obj);
                token = obj;
                Logger.Transaction startChild4 = transaction5.startChild("connect");
                xVar = xVar4;
                atomicBoolean4 = atomicBoolean3;
                atomicLong4 = atomicLong3;
                str5 = str4;
                startChild2 = transaction5.startChild("first-chunk");
                str6 = (String) token;
                transaction6 = startChild4;
                obj2 = new Object();
                obj3 = new Object();
                str7 = str3;
                uri3 = uri2;
                if (!g0.y(xVar)) {
                    try {
                        try {
                            try {
                            } catch (Exception e12) {
                                e = e12;
                                str9 = str16;
                                str11 = str17;
                                str10 = str5;
                                transaction8 = transaction6;
                                atomicLong5 = atomicLong4;
                                b0Var = obj2;
                                transaction7 = startChild2;
                                c0Var = obj3;
                                atomicBoolean5 = atomicBoolean4;
                                str8 = str18;
                                break;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            str9 = str16;
                            str11 = str17;
                            str10 = str5;
                            transaction8 = transaction6;
                            atomicLong5 = atomicLong4;
                            b0Var = obj2;
                            transaction7 = startChild2;
                            c0Var = obj3;
                            atomicBoolean5 = atomicBoolean4;
                            str8 = str18;
                            break;
                        }
                    } catch (ApiException e14) {
                        e = e14;
                        str12 = str17;
                        String str22 = str6;
                        str14 = str16;
                        transaction8 = transaction6;
                        AtomicLong atomicLong8 = atomicLong4;
                        b0Var = obj2;
                        transaction7 = startChild2;
                        c0 c0Var4 = obj3;
                        atomicBoolean5 = atomicBoolean4;
                        str10 = str5;
                        break;
                    }
                    un.e eVar = new un.e();
                    if (str7 == null) {
                        str15 = "";
                    } else {
                        str15 = str7;
                    }
                    eVar.put("xi-app-check-token", str15);
                    if (str6 != null) {
                        try {
                        } catch (ApiException e15) {
                            apiException = e15;
                            str12 = str17;
                            str13 = str6;
                            transaction8 = transaction6;
                            atomicLong6 = atomicLong4;
                            b0Var = obj2;
                            xVar3 = xVar;
                            transaction7 = startChild2;
                            atomicBoolean5 = atomicBoolean4;
                            str14 = str16;
                            str10 = str5;
                            str8 = str18;
                            aVar = aVar2;
                            c0Var3 = obj3;
                            i11 = b0Var.f20557a;
                            xn.a aVar3 = aVar;
                            b0Var.f20557a = i11 + 1;
                            if (i11 < 2) {
                            }
                            String str23 = str13;
                            Logger.Transaction transaction10 = transaction7;
                            Logger.Transaction transaction11 = transaction8;
                            logger2 = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.logger;
                            String str24 = str8;
                            ib.i.q(str24, b0Var.f20557a, str12, logger2, "StreamingApiChunkFlowFactory");
                            ApiException apiException2 = apiException;
                            transaction11.error(apiException2);
                            transaction10.error(apiException2);
                            ((w) xVar3).f12593d.n(false, apiException2);
                            streamingApiChunkFlowFactory$createChunkFlow$1 = this;
                            transaction6 = transaction11;
                            xVar = xVar3;
                            startChild2 = transaction10;
                            obj2 = b0Var;
                            obj3 = c0Var3;
                            atomicBoolean4 = atomicBoolean5;
                            atomicLong4 = atomicLong6;
                            str17 = str12;
                            str18 = str24;
                            str5 = str10;
                            aVar2 = aVar3;
                            str16 = str14;
                            str6 = str23;
                            if (!g0.y(xVar)) {
                            }
                        } catch (IOException e16) {
                            e = e16;
                            str9 = str16;
                            str11 = str17;
                            str10 = str5;
                            transaction8 = transaction6;
                            atomicLong5 = atomicLong4;
                            b0Var = obj2;
                            xVar2 = xVar;
                            transaction7 = startChild2;
                            c0Var2 = obj3;
                            atomicBoolean5 = atomicBoolean4;
                            str8 = str18;
                            i10 = b0Var.f20557a;
                            xn.a aVar4 = aVar2;
                            b0Var.f20557a = i10 + 1;
                            if (i10 >= 2) {
                            }
                        } catch (Exception e17) {
                            e = e17;
                            str9 = str16;
                            str11 = str17;
                            str10 = str5;
                            transaction8 = transaction6;
                            transaction7 = startChild2;
                            str8 = str18;
                            obj2 = obj2;
                            obj3 = obj3;
                            transaction8.error(e);
                            transaction7.error(e);
                            ((w) xVar).f12593d.n(false, e);
                            startChild2 = transaction7;
                            transaction6 = transaction8;
                            str17 = str11;
                            str18 = str8;
                            str5 = str10;
                            str16 = str9;
                            if (!g0.y(xVar)) {
                            }
                        }
                        eVar.put("hcaptcha-token", str6);
                    }
                    un.e b10 = eVar.b();
                    streamingAPI2 = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.streamingAPI;
                    String uri4 = uri3.toString();
                    uri4.getClass();
                    ir.i openStreamSocket = streamingAPI2.openStreamSocket(uri4, b10);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(str5, transaction6, streamingApiChunkFlowFactory$createChunkFlow$1.this$0, atomicLong4, obj2, xVar, startChild2, streamingApiChunkFlowFactory$createChunkFlow$1.$readId, obj3, atomicBoolean4);
                    str9 = str16;
                    str10 = str5;
                    transaction8 = transaction6;
                    atomicLong5 = atomicLong4;
                    b0Var = obj2;
                    transaction7 = startChild2;
                    c0Var = obj3;
                    atomicBoolean5 = atomicBoolean4;
                    str8 = str18;
                    str11 = str17;
                    xVar3 = xVar;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$0 = xVar3;
                    xVar = xVar3;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$1 = null;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$2 = str10;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$3 = atomicLong5;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$4 = atomicBoolean5;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$5 = null;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$6 = null;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$7 = uri3;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$8 = null;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$9 = str7;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$10 = str6;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$11 = transaction8;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$12 = transaction7;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$13 = b0Var;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$14 = c0Var;
                    streamingApiChunkFlowFactory$createChunkFlow$1.L$15 = null;
                    streamingApiChunkFlowFactory$createChunkFlow$1.label = 6;
                    if (openStreamSocket.collect(anonymousClass1, streamingApiChunkFlowFactory$createChunkFlow$1) != aVar2) {
                        atomicLong4 = atomicLong5;
                        obj3 = c0Var;
                        obj2 = b0Var;
                        startChild2 = transaction7;
                        transaction6 = transaction8;
                        atomicBoolean4 = atomicBoolean5;
                        str17 = str11;
                        str18 = str8;
                        str5 = str10;
                        str16 = str9;
                        if (!g0.y(xVar)) {
                            return z.f31622a;
                        }
                    }
                    return aVar2;
                }
                break;
            case 6:
                c0Var = (c0) streamingApiChunkFlowFactory$createChunkFlow$1.L$14;
                b0Var = (b0) streamingApiChunkFlowFactory$createChunkFlow$1.L$13;
                transaction7 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$12;
                transaction8 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$11;
                str6 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$10;
                str7 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$9;
                uri3 = (Uri) streamingApiChunkFlowFactory$createChunkFlow$1.L$7;
                atomicBoolean5 = (AtomicBoolean) streamingApiChunkFlowFactory$createChunkFlow$1.L$4;
                AtomicLong atomicLong9 = (AtomicLong) streamingApiChunkFlowFactory$createChunkFlow$1.L$3;
                String str25 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$2;
                try {
                    sn.a.g(obj);
                    xVar = xVar4;
                    str8 = "WebSocket error failed after ";
                    atomicLong4 = atomicLong9;
                    str9 = "WebSocket error, retrying in ";
                    str10 = str25;
                    str11 = " attempts";
                } catch (ApiException e18) {
                    str12 = " attempts";
                    str8 = "WebSocket error failed after ";
                    aVar = aVar2;
                    xVar3 = xVar4;
                    c0Var3 = c0Var;
                    str13 = str6;
                    atomicLong6 = atomicLong9;
                    apiException = e18;
                    str14 = "WebSocket error, retrying in ";
                    str10 = str25;
                    i11 = b0Var.f20557a;
                    xn.a aVar32 = aVar;
                    b0Var.f20557a = i11 + 1;
                    if (i11 < 2) {
                    }
                    String str232 = str13;
                    Logger.Transaction transaction102 = transaction7;
                    Logger.Transaction transaction112 = transaction8;
                    logger2 = streamingApiChunkFlowFactory$createChunkFlow$1.this$0.logger;
                    String str242 = str8;
                    ib.i.q(str242, b0Var.f20557a, str12, logger2, "StreamingApiChunkFlowFactory");
                    ApiException apiException22 = apiException;
                    transaction112.error(apiException22);
                    transaction102.error(apiException22);
                    ((w) xVar3).f12593d.n(false, apiException22);
                    streamingApiChunkFlowFactory$createChunkFlow$1 = this;
                    transaction6 = transaction112;
                    xVar = xVar3;
                    startChild2 = transaction102;
                    obj2 = b0Var;
                    obj3 = c0Var3;
                    atomicBoolean4 = atomicBoolean5;
                    atomicLong4 = atomicLong6;
                    str17 = str12;
                    str18 = str242;
                    str5 = str10;
                    aVar2 = aVar32;
                    str16 = str14;
                    str6 = str232;
                    if (!g0.y(xVar)) {
                    }
                } catch (IOException e19) {
                    e = e19;
                    xVar2 = xVar4;
                    atomicLong5 = atomicLong9;
                    str9 = "WebSocket error, retrying in ";
                    str10 = str25;
                    str11 = " attempts";
                    c0Var2 = c0Var;
                    str8 = str18;
                    i10 = b0Var.f20557a;
                    xn.a aVar42 = aVar2;
                    b0Var.f20557a = i10 + 1;
                    if (i10 >= 2) {
                    }
                } catch (Exception e20) {
                    e = e20;
                    xVar = xVar4;
                    obj3 = c0Var;
                    str8 = "WebSocket error failed after ";
                    obj2 = b0Var;
                    atomicBoolean4 = atomicBoolean5;
                    atomicLong4 = atomicLong9;
                    str9 = "WebSocket error, retrying in ";
                    str10 = str25;
                    str11 = " attempts";
                    transaction8.error(e);
                    transaction7.error(e);
                    ((w) xVar).f12593d.n(false, e);
                    startChild2 = transaction7;
                    transaction6 = transaction8;
                    str17 = str11;
                    str18 = str8;
                    str5 = str10;
                    str16 = str9;
                    if (!g0.y(xVar)) {
                    }
                }
                obj3 = c0Var;
                obj2 = b0Var;
                startChild2 = transaction7;
                transaction6 = transaction8;
                atomicBoolean4 = atomicBoolean5;
                str17 = str11;
                str18 = str8;
                str5 = str10;
                str16 = str9;
                if (!g0.y(xVar)) {
                }
                break;
            case 7:
                c0 c0Var5 = (c0) streamingApiChunkFlowFactory$createChunkFlow$1.L$14;
                b0 b0Var2 = (b0) streamingApiChunkFlowFactory$createChunkFlow$1.L$13;
                Logger.Transaction transaction12 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$12;
                Logger.Transaction transaction13 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$11;
                String str26 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$10;
                String str27 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$9;
                Uri uri5 = (Uri) streamingApiChunkFlowFactory$createChunkFlow$1.L$7;
                AtomicBoolean atomicBoolean7 = (AtomicBoolean) streamingApiChunkFlowFactory$createChunkFlow$1.L$4;
                AtomicLong atomicLong10 = (AtomicLong) streamingApiChunkFlowFactory$createChunkFlow$1.L$3;
                String str28 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$2;
                sn.a.g(obj);
                xVar = xVar4;
                obj2 = b0Var2;
                str12 = " attempts";
                str8 = "WebSocket error failed after ";
                startChild2 = transaction12;
                transaction6 = transaction13;
                xn.a aVar5 = aVar2;
                atomicBoolean4 = atomicBoolean7;
                atomicLong4 = atomicLong10;
                obj3 = c0Var5;
                uri3 = uri5;
                str7 = str27;
                str14 = "WebSocket error, retrying in ";
                str10 = str28;
                String str29 = str26;
                str17 = str12;
                aVar2 = aVar5;
                str18 = str8;
                str5 = str10;
                str16 = str14;
                str6 = str29;
                if (!g0.y(xVar)) {
                }
                break;
            case 8:
                c0 c0Var6 = (c0) streamingApiChunkFlowFactory$createChunkFlow$1.L$14;
                b0 b0Var3 = (b0) streamingApiChunkFlowFactory$createChunkFlow$1.L$13;
                Logger.Transaction transaction14 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$12;
                Logger.Transaction transaction15 = (Logger.Transaction) streamingApiChunkFlowFactory$createChunkFlow$1.L$11;
                String str30 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$10;
                String str31 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$9;
                Uri uri6 = (Uri) streamingApiChunkFlowFactory$createChunkFlow$1.L$7;
                AtomicBoolean atomicBoolean8 = (AtomicBoolean) streamingApiChunkFlowFactory$createChunkFlow$1.L$4;
                AtomicLong atomicLong11 = (AtomicLong) streamingApiChunkFlowFactory$createChunkFlow$1.L$3;
                String str32 = (String) streamingApiChunkFlowFactory$createChunkFlow$1.L$2;
                sn.a.g(obj);
                xVar = xVar4;
                atomicBoolean4 = atomicBoolean8;
                String str33 = " attempts";
                str8 = "WebSocket error failed after ";
                atomicLong4 = atomicLong11;
                xn.a aVar6 = aVar2;
                obj2 = b0Var3;
                startChild2 = transaction14;
                transaction6 = transaction15;
                obj3 = c0Var6;
                String str34 = "WebSocket error, retrying in ";
                uri3 = uri6;
                str7 = str31;
                str10 = str32;
                str17 = str33;
                aVar2 = aVar6;
                str18 = str8;
                str5 = str10;
                str16 = str34;
                str6 = str30;
                if (!g0.y(xVar)) {
                }
                break;
            default:
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ x $$this$channelFlow;
        final /* synthetic */ Logger.Transaction $connectTransaction;
        final /* synthetic */ AtomicLong $currentPosition;
        final /* synthetic */ Logger.Transaction $firstChunkTransaction;
        final /* synthetic */ c0 $lastHeartbeatTimestamp;
        final /* synthetic */ String $readId;
        final /* synthetic */ AtomicBoolean $receivedLastChunk;
        final /* synthetic */ b0 $retryCounter;
        final /* synthetic */ String $streamId;
        final /* synthetic */ StreamingApiChunkFlowFactory this$0;

        public AnonymousClass1(String str, Logger.Transaction transaction, StreamingApiChunkFlowFactory streamingApiChunkFlowFactory, AtomicLong atomicLong, b0 b0Var, x xVar, Logger.Transaction transaction2, String str2, c0 c0Var, AtomicBoolean atomicBoolean) {
            this.$streamId = str;
            this.$connectTransaction = transaction;
            this.this$0 = streamingApiChunkFlowFactory;
            this.$currentPosition = atomicLong;
            this.$retryCounter = b0Var;
            this.$$this$channelFlow = xVar;
            this.$firstChunkTransaction = transaction2;
            this.$readId = str2;
            this.$lastHeartbeatTimestamp = c0Var;
            this.$receivedLastChunk = atomicBoolean;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String emit$lambda$0(WebSocketDataResponse webSocketDataResponse) {
            String str;
            List<String> chars;
            Alignment alignment = webSocketDataResponse.getAlignment();
            if (alignment != null && (chars = alignment.getChars()) != null) {
                str = o.E0(o.b1(chars, 100), null, null, null, null, 63);
            } else {
                str = null;
            }
            return defpackage.f.C("onMessage text: ", str, "...");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String emit$lambda$1(WebSocketDataResponse webSocketDataResponse) {
            List<Integer> list;
            Integer num;
            Alignment alignment = webSocketDataResponse.getAlignment();
            String str = null;
            if (alignment != null) {
                list = alignment.getCharDurationsMs();
            } else {
                list = null;
            }
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (list != null) {
                str = o.E0(o.b1(list, 500), Separators.COMMA, null, null, null, 62);
            }
            return "onMessage durations (" + num + "): " + str + "...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String emit$lambda$2(WebSocketDataResponse webSocketDataResponse) {
            List<Integer> list;
            Integer num;
            Alignment alignment = webSocketDataResponse.getAlignment();
            String str = null;
            if (alignment != null) {
                list = alignment.getCharStartTimesMs();
            } else {
                list = null;
            }
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (list != null) {
                str = o.E0(o.b1(list, 500), Separators.COMMA, null, null, null, 62);
            }
            return "onMessage starts (" + num + "): " + str + "...";
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(sn.k kVar, wn.c<? super z> cVar) {
            StreamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1 streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1;
            int i10;
            SendingChannel sendingChannel;
            final WebSocketDataResponse webSocketDataResponse;
            Logger logger;
            Logger logger2;
            Logger logger3;
            Logger logger4;
            Logger logger5;
            xq.b bVar;
            Analytics analytics;
            PlayerVisibilityService playerVisibilityService;
            Object readOfflineVersions;
            String str;
            long j4;
            SendingChannel sendingChannel2;
            Analytics analytics2;
            Analytics.Event.PlayerVisibility playerVisibility;
            float o6;
            Object readOfflineVersions2;
            SendingChannel sendingChannel3;
            WebSocketDataResponse webSocketDataResponse2;
            Analytics analytics3;
            PlayerVisibilityService playerVisibilityService2;
            Logger logger6;
            Logger logger7;
            if (cVar instanceof StreamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1) {
                streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1 = (StreamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1) cVar;
                int i11 = streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.result;
                    i10 = streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.label;
                    final int i12 = 2;
                    final int i13 = 1;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                j4 = streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.J$0;
                                playerVisibility = (Analytics.Event.PlayerVisibility) streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$5;
                                str = (String) streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$4;
                                analytics2 = (Analytics) streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$3;
                                webSocketDataResponse = (WebSocketDataResponse) streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$1;
                                sendingChannel2 = (SendingChannel) streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$0;
                                sn.a.g(obj);
                                analytics2.log(new Analytics.Event.GlobalListenedActive(str, playerVisibility, (String) obj));
                                this.$lastHeartbeatTimestamp.f20558a = j4;
                                sendingChannel = sendingChannel2;
                            } else {
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            o6 = streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.F$0;
                            webSocketDataResponse2 = (WebSocketDataResponse) streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$1;
                            sendingChannel3 = (SendingChannel) streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$0;
                            sn.a.g(obj);
                            analytics3 = this.this$0.analytics;
                            String str2 = this.$readId;
                            playerVisibilityService2 = this.this$0.playerVisibilityService;
                            analytics3.log(new Analytics.Event.GlobalListenedActiveFirst(o6, str2, playerVisibilityService2.getPlayerVisibility(), (String) obj));
                            this.this$0.requestTime = null;
                            sendingChannel = sendingChannel3;
                            webSocketDataResponse = webSocketDataResponse2;
                        }
                    } else {
                        sn.a.g(obj);
                        sendingChannel = (SendingChannel) kVar.f31600a;
                        webSocketDataResponse = (WebSocketDataResponse) kVar.f31601b;
                        long time = new Date().getTime();
                        xq.d dVar = xq.d.MILLISECONDS;
                        if (webSocketDataResponse != null && m.c(webSocketDataResponse.getStreamId(), this.$streamId)) {
                            final int i14 = 0;
                            this.$retryCounter.f20557a = 0;
                            logger3 = this.this$0.logger;
                            logger3.verbose("StreamingApiChunkFlowFactory", new ho.a() { // from class: io.elevenlabs.data.services.i
                                @Override // ho.a
                                public final Object invoke() {
                                    String emit$lambda$0;
                                    String emit$lambda$1;
                                    String emit$lambda$2;
                                    switch (i14) {
                                        case 0:
                                            emit$lambda$0 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$0(webSocketDataResponse);
                                            return emit$lambda$0;
                                        case 1:
                                            emit$lambda$1 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$1(webSocketDataResponse);
                                            return emit$lambda$1;
                                        default:
                                            emit$lambda$2 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$2(webSocketDataResponse);
                                            return emit$lambda$2;
                                    }
                                }
                            });
                            logger4 = this.this$0.logger;
                            logger4.verbose("StreamingApiChunkFlowFactory", new ho.a() { // from class: io.elevenlabs.data.services.i
                                @Override // ho.a
                                public final Object invoke() {
                                    String emit$lambda$0;
                                    String emit$lambda$1;
                                    String emit$lambda$2;
                                    switch (i13) {
                                        case 0:
                                            emit$lambda$0 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$0(webSocketDataResponse);
                                            return emit$lambda$0;
                                        case 1:
                                            emit$lambda$1 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$1(webSocketDataResponse);
                                            return emit$lambda$1;
                                        default:
                                            emit$lambda$2 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$2(webSocketDataResponse);
                                            return emit$lambda$2;
                                    }
                                }
                            });
                            logger5 = this.this$0.logger;
                            logger5.verbose("StreamingApiChunkFlowFactory", new ho.a() { // from class: io.elevenlabs.data.services.i
                                @Override // ho.a
                                public final Object invoke() {
                                    String emit$lambda$0;
                                    String emit$lambda$1;
                                    String emit$lambda$2;
                                    switch (i12) {
                                        case 0:
                                            emit$lambda$0 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$0(webSocketDataResponse);
                                            return emit$lambda$0;
                                        case 1:
                                            emit$lambda$1 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$1(webSocketDataResponse);
                                            return emit$lambda$1;
                                        default:
                                            emit$lambda$2 = StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1.emit$lambda$2(webSocketDataResponse);
                                            return emit$lambda$2;
                                    }
                                }
                            });
                            ((w) this.$$this$channelFlow).d(webSocketDataResponse);
                            if (webSocketDataResponse.getAlignment() != null) {
                                this.$firstChunkTransaction.ok();
                                bVar = this.this$0.requestTime;
                                xn.a aVar = xn.a.f37986a;
                                if (bVar != null) {
                                    xq.a aVar2 = xq.b.f38124b;
                                    o6 = ((int) ae.l.o(xq.b.i(xq.b.g(xq.g.o(time, dVar), xq.b.k(bVar.f38128a)), dVar), -2147483648L, 2147483647L)) / 1000.0f;
                                    StreamingApiChunkFlowFactory streamingApiChunkFlowFactory = this.this$0;
                                    String str3 = this.$readId;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$0 = sendingChannel;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$1 = webSocketDataResponse;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$2 = null;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.J$0 = time;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.F$0 = o6;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.label = 1;
                                    readOfflineVersions2 = streamingApiChunkFlowFactory.getReadOfflineVersions(str3, streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1);
                                    if (readOfflineVersions2 != aVar) {
                                        sendingChannel3 = sendingChannel;
                                        obj = readOfflineVersions2;
                                        webSocketDataResponse2 = webSocketDataResponse;
                                        analytics3 = this.this$0.analytics;
                                        String str22 = this.$readId;
                                        playerVisibilityService2 = this.this$0.playerVisibilityService;
                                        analytics3.log(new Analytics.Event.GlobalListenedActiveFirst(o6, str22, playerVisibilityService2.getPlayerVisibility(), (String) obj));
                                        this.this$0.requestTime = null;
                                        sendingChannel = sendingChannel3;
                                        webSocketDataResponse = webSocketDataResponse2;
                                    }
                                } else if (time - this.$lastHeartbeatTimestamp.f20558a > 300000) {
                                    analytics = this.this$0.analytics;
                                    String str4 = this.$readId;
                                    playerVisibilityService = this.this$0.playerVisibilityService;
                                    Analytics.Event.PlayerVisibility playerVisibility2 = playerVisibilityService.getPlayerVisibility();
                                    StreamingApiChunkFlowFactory streamingApiChunkFlowFactory2 = this.this$0;
                                    String str5 = this.$readId;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$0 = sendingChannel;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$1 = webSocketDataResponse;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$2 = null;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$3 = analytics;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$4 = str4;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.L$5 = playerVisibility2;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.J$0 = time;
                                    streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.label = 2;
                                    readOfflineVersions = streamingApiChunkFlowFactory2.getReadOfflineVersions(str5, streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1);
                                    if (readOfflineVersions != aVar) {
                                        str = str4;
                                        j4 = time;
                                        sendingChannel2 = sendingChannel;
                                        obj = readOfflineVersions;
                                        analytics2 = analytics;
                                        playerVisibility = playerVisibility2;
                                        analytics2.log(new Analytics.Event.GlobalListenedActive(str, playerVisibility, (String) obj));
                                        this.$lastHeartbeatTimestamp.f20558a = j4;
                                        sendingChannel = sendingChannel2;
                                    }
                                }
                                return aVar;
                            }
                            if (webSocketDataResponse.isFinal()) {
                                logger7 = this.this$0.logger;
                                logger7.log("StreamingApiChunkFlowFactory", "Final response");
                                this.$receivedLastChunk.set(true);
                                ((w) this.$$this$channelFlow).m(null);
                            } else {
                                sendingChannel.sendPositionMessage(new PositionMessagePayload(this.$streamId, this.$currentPosition.get()));
                                logger6 = this.this$0.logger;
                                logger6.log("StreamingApiChunkFlowFactory", "PositionMessagePayload sent");
                            }
                            return z.f31622a;
                        }
                        this.$connectTransaction.ok();
                        StreamingApiChunkFlowFactory streamingApiChunkFlowFactory3 = this.this$0;
                        xq.a aVar3 = xq.b.f38124b;
                        streamingApiChunkFlowFactory3.requestTime = new xq.b(xq.g.o(time, dVar));
                        logger = this.this$0.logger;
                        logger.log("StreamingApiChunkFlowFactory", "onOpen");
                        sendingChannel.sendInitialMessage(new InitialMessagePayload(this.$streamId, this.$currentPosition.get()));
                        logger2 = this.this$0.logger;
                        logger2.log("StreamingApiChunkFlowFactory", "InitialMessagePayload sent");
                        return z.f31622a;
                    }
                    this.$currentPosition.addAndGet(webSocketDataResponse.getAlignment().getChars().size());
                    if (webSocketDataResponse.isFinal()) {
                    }
                    return z.f31622a;
                }
            }
            streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1 = new StreamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1(this, cVar);
            Object obj2 = streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.result;
            i10 = streamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1.label;
            final int i122 = 2;
            final int i132 = 1;
            if (i10 == 0) {
            }
            this.$currentPosition.addAndGet(webSocketDataResponse.getAlignment().getChars().size());
            if (webSocketDataResponse.isFinal()) {
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((sn.k) obj, (wn.c<? super z>) cVar);
        }
    }
}
