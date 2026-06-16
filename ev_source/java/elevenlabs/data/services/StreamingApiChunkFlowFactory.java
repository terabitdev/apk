package io.elevenlabs.data.services;

import android.net.Uri;
import com.google.protobuf.c6;
import fr.g0;
import io.elevenlabs.data.api.StreamingAPI;
import io.elevenlabs.data.api.WebSocketDataResponse;
import io.elevenlabs.data.model.response.EnrichedAudioChunk;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.VoicesService;
import ir.r;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import ur.a1;
import ur.g1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u00014BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lio/elevenlabs/data/services/StreamingApiChunkFlowFactory;", "Lio/elevenlabs/data/services/ChunkFlowFactory;", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/data/api/StreamingAPI;", "streamingAPI", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "playerVisibilityService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "<init>", "(Lvr/c;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/data/api/StreamingAPI;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/PlayerVisibilityService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/VoicesService;Lio/elevenlabs/domain/services/ConnectivityService;)V", "", "readId", "getReadOfflineVersions", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "uri", "offlineVoiceId", "Landroid/net/Uri;", "ensureVoiceIdQueryParam", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "startingPosition", "Lir/i;", "Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "createChunkFlow", "(Ljava/lang/String;JLjava/lang/String;)Lir/i;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/data/api/StreamingAPI;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/VoicesService;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lxq/b;", "requestTime", "Lxq/b;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class StreamingApiChunkFlowFactory implements ChunkFlowFactory {
    private static final long INITIAL_WS_RETRY_DELAY;
    private static final int MAX_WS_RETRIES = 2;
    private static final String TAG = "StreamingApiChunkFlowFactory";
    private final Analytics analytics;
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final AppCheckTokenService appCheckTokenService;
    private final ConnectivityService connectivityService;
    private final vr.c json;
    private final Logger logger;
    private final PlayerVisibilityService playerVisibilityService;
    private final ReadsService readsService;
    private xq.b requestTime;
    private final StreamingAPI streamingAPI;
    private final VoicesService voicesService;

    static {
        xq.a aVar = xq.b.f38124b;
        INITIAL_WS_RETRY_DELAY = xq.g.n(1, xq.d.SECONDS);
    }

    public StreamingApiChunkFlowFactory(vr.c cVar, Logger logger, StreamingAPI streamingAPI, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Analytics analytics, PlayerVisibilityService playerVisibilityService, ReadsService readsService, VoicesService voicesService, ConnectivityService connectivityService) {
        cVar.getClass();
        logger.getClass();
        streamingAPI.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        analytics.getClass();
        playerVisibilityService.getClass();
        readsService.getClass();
        voicesService.getClass();
        connectivityService.getClass();
        this.json = cVar;
        this.logger = logger;
        this.streamingAPI = streamingAPI;
        this.appCheckTokenService = appCheckTokenService;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.analytics = analytics;
        this.playerVisibilityService = playerVisibilityService;
        this.readsService = readsService;
        this.voicesService = voicesService;
        this.connectivityService = connectivityService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(4:19|20|14|15))(2:21|22))(2:34|(2:41|(2:43|31))(1:40))|23|(1:25)|(3:(1:29)|14|15)(1:32)|31))|45|6|7|(0)(0)|23|(0)|(0)(0)|31) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        if (r13 == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        if (r13 == r7) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x00ae, blocks: (B:22:0x006d, B:23:0x00a6, B:25:0x00aa, B:41:0x008e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureVoiceIdQueryParam(String str, String str2, wn.c<? super Uri> cVar) {
        StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1 streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1;
        int i10;
        ?? r52;
        String str3;
        String str4;
        Object obj;
        Boolean bool;
        if (cVar instanceof StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1) {
            streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1 = (StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1) cVar;
            int i11 = streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.label = i11 - Integer.MIN_VALUE;
                ?? r13 = streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.result;
                i10 = streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.label;
                r52 = 1;
                r52 = 1;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                Uri uri = (Uri) streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$2;
                                sn.a.g(r13);
                                str = uri;
                                str4 = r13;
                                str2 = str4;
                                Uri build = str.buildUpon().appendQueryParameter("voice_id", str2).build();
                                build.getClass();
                                return build;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Uri uri2 = (Uri) streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$2;
                        sn.a.g(r13);
                        str = uri2;
                        str3 = r13;
                        str2 = str3;
                        Uri build2 = str.buildUpon().appendQueryParameter("voice_id", str2).build();
                        build2.getClass();
                        return build2;
                    }
                    Uri uri3 = (Uri) streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$2;
                    str2 = (String) streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$1;
                    sn.a.g(r13);
                    str = uri3;
                    obj = r13;
                } else {
                    sn.a.g(r13);
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("voice_id");
                    if (queryParameter != null && queryParameter.length() != 0 && !queryParameter.equals("null")) {
                        return parse;
                    }
                    StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1 streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1 = new StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1(this, null);
                    streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$0 = null;
                    streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$1 = str2;
                    streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$2 = parse;
                    streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$3 = null;
                    streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.label = 1;
                    Object S = g0.S(500L, streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$isConnected$1, streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1);
                    str = parse;
                    obj = S;
                    if (S == aVar) {
                        return aVar;
                    }
                }
                bool = (Boolean) obj;
                if (bool != null) {
                    r52 = bool.booleanValue();
                }
                if (r52 != 0) {
                    if (str2 == null) {
                        ir.i defaultVoiceId = this.voicesService.defaultVoiceId();
                        streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$0 = null;
                        streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$1 = null;
                        streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$2 = str;
                        streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$3 = null;
                        streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.I$0 = r52;
                        streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.label = 2;
                        ?? u6 = r.u(defaultVoiceId, streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1);
                        str = str;
                        str3 = u6;
                    }
                    Uri build22 = str.buildUpon().appendQueryParameter("voice_id", str2).build();
                    build22.getClass();
                    return build22;
                }
                ir.i defaultVoiceId2 = this.voicesService.defaultVoiceId();
                streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$0 = null;
                streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$1 = null;
                streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$2 = str;
                streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.L$3 = null;
                streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.I$0 = r52;
                streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.label = 3;
                ?? u10 = r.u(defaultVoiceId2, streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1);
                str = str;
                str4 = u10;
                return aVar;
            }
        }
        streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1 = new StreamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1(this, cVar);
        ?? r132 = streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.result;
        i10 = streamingApiChunkFlowFactory$ensureVoiceIdQueryParam$1.label;
        r52 = 1;
        r52 = 1;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        bool = (Boolean) obj;
        if (bool != null) {
        }
        if (r52 != 0) {
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getReadOfflineVersions(String str, wn.c<? super String> cVar) {
        StreamingApiChunkFlowFactory$getReadOfflineVersions$1 streamingApiChunkFlowFactory$getReadOfflineVersions$1;
        int i10;
        ReadMeta readMeta;
        OfflineReadData offlineReadData;
        String voiceId;
        if (cVar instanceof StreamingApiChunkFlowFactory$getReadOfflineVersions$1) {
            streamingApiChunkFlowFactory$getReadOfflineVersions$1 = (StreamingApiChunkFlowFactory$getReadOfflineVersions$1) cVar;
            int i11 = streamingApiChunkFlowFactory$getReadOfflineVersions$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                streamingApiChunkFlowFactory$getReadOfflineVersions$1.label = i11 - Integer.MIN_VALUE;
                Object obj = streamingApiChunkFlowFactory$getReadOfflineVersions$1.result;
                i10 = streamingApiChunkFlowFactory$getReadOfflineVersions$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ReadsService readsService = this.readsService;
                    streamingApiChunkFlowFactory$getReadOfflineVersions$1.L$0 = null;
                    streamingApiChunkFlowFactory$getReadOfflineVersions$1.label = 1;
                    obj = readsService.getRead(str, streamingApiChunkFlowFactory$getReadOfflineVersions$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                readMeta = (ReadMeta) obj;
                if (readMeta == null && (offlineReadData = readMeta.getOfflineReadData()) != null && (voiceId = offlineReadData.getVoiceId()) != null) {
                    vr.c cVar2 = this.json;
                    cVar2.getClass();
                    return cVar2.d(new a1(e0.f20562a.b(String.class), g1.f34588a), new String[]{voiceId});
                }
                return "[]";
            }
        }
        streamingApiChunkFlowFactory$getReadOfflineVersions$1 = new StreamingApiChunkFlowFactory$getReadOfflineVersions$1(this, cVar);
        Object obj2 = streamingApiChunkFlowFactory$getReadOfflineVersions$1.result;
        i10 = streamingApiChunkFlowFactory$getReadOfflineVersions$1.label;
        if (i10 == 0) {
        }
        readMeta = (ReadMeta) obj2;
        return readMeta == null ? "[]" : "[]";
    }

    @Override // io.elevenlabs.data.services.ChunkFlowFactory
    public ir.i createChunkFlow(String readId, long startingPosition, String uri) {
        readId.getClass();
        uri.getClass();
        final ir.e j4 = r.j(new StreamingApiChunkFlowFactory$createChunkFlow$1(this, startingPosition, readId, uri, null));
        return new ir.i() { // from class: io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$$inlined$map$1$2", f = "ReadsStreamingService.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                EnrichedAudioChunk enrichedAudioChunk = ReadsStreamingServiceKt.toEnrichedAudioChunk((WebSocketDataResponse) obj);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(enrichedAudioChunk, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }
}
