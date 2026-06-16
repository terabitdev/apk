package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.data.api.StreamingAPI;
import io.elevenlabs.data.model.response.EnrichedAudioChunk;
import io.elevenlabs.data.services.WssStreamingSession;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.BinarySearchList;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.StreamingService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.services.player.Mp3ChunkDurationExtractor;
import ir.j1;
import ir.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.i0;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u00100J\u0011\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\n\u0018\u000105j\u0004\u0018\u0001`6H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00109R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u00109R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010:R\u001e\u0010G\u001a\n\u0018\u000105j\u0004\u0018\u0001`68\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lio/elevenlabs/data/services/WssStreamingSession;", "Lio/elevenlabs/domain/services/StreamingService$StreamingSession;", "Landroid/content/Context;", "appContext", "Lvr/c;", "json", "", "uri", "Lir/j1;", "Lio/elevenlabs/domain/model/BinarySearchList;", "alignments", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "", "isLoadingAllowed", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "Lio/elevenlabs/domain/services/player/Mp3ChunkDurationExtractor;", "mp3ChunkDurationExtractor", "Lio/elevenlabs/data/api/StreamingAPI;", "streamingAPI", "Lio/elevenlabs/domain/Analytics;", "analytics", "", "initialOffset", "readId", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "playerVisibilityService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "<init>", "(Landroid/content/Context;Lvr/c;Ljava/lang/String;Lir/j1;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Lir/j1;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;Lio/elevenlabs/domain/services/player/Mp3ChunkDurationExtractor;Lio/elevenlabs/data/api/StreamingAPI;Lio/elevenlabs/domain/Analytics;JLjava/lang/String;Lio/elevenlabs/domain/services/PlayerVisibilityService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/VoicesService;Lio/elevenlabs/domain/services/ConnectivityService;)V", "isOfflineUri", "(Ljava/lang/String;)Z", "getUri", "()Ljava/lang/String;", "Lsn/z;", "close", "()V", "hasEnded", "()Z", "hasMoreBytes", "", "getNextChunk", "()[B", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "()Ljava/lang/Exception;", "Ljava/lang/String;", "Lir/j1;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Lio/elevenlabs/domain/services/player/Mp3ChunkDurationExtractor;", ParameterNames.TAG, "Lfr/d0;", "scope", "Lfr/d0;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lfs/k;", "wssData", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "hasReceivedLastChunk", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ljava/lang/Exception;", "Lio/elevenlabs/data/services/ChunkFlowFactory;", "chunkFlowFactory", "Lio/elevenlabs/data/services/ChunkFlowFactory;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class WssStreamingSession implements StreamingService.StreamingSession {
    private final j1 alignments;
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final ChunkFlowFactory chunkFlowFactory;
    private Exception error;
    private final j1 hasReceivedLastChunk;
    private final j1 isLoadingAllowed;
    private final Logger logger;
    private final Mp3ChunkDurationExtractor mp3ChunkDurationExtractor;
    private final String readId;
    private final d0 scope;
    private final String tag;
    private final String uri;
    private final ConcurrentLinkedQueue<fs.k> wssData;

    public WssStreamingSession(Context context, vr.c cVar, String str, j1 j1Var, DispatcherFactory dispatcherFactory, Logger logger, j1 j1Var2, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Mp3ChunkDurationExtractor mp3ChunkDurationExtractor, StreamingAPI streamingAPI, Analytics analytics, long j4, String str2, PlayerVisibilityService playerVisibilityService, ReadsService readsService, VoicesService voicesService, ConnectivityService connectivityService) {
        ChunkFlowFactory streamingApiChunkFlowFactory;
        context.getClass();
        cVar.getClass();
        str.getClass();
        j1Var.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        j1Var2.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        mp3ChunkDurationExtractor.getClass();
        streamingAPI.getClass();
        analytics.getClass();
        str2.getClass();
        playerVisibilityService.getClass();
        readsService.getClass();
        voicesService.getClass();
        connectivityService.getClass();
        this.uri = str;
        this.alignments = j1Var;
        this.logger = logger;
        this.isLoadingAllowed = j1Var2;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.mp3ChunkDurationExtractor = mp3ChunkDurationExtractor;
        this.readId = str2;
        this.tag = "WssStreamingSession";
        kr.d c5 = g0.c(n0.l.J(g0.f(), dispatcherFactory.getDefault()));
        this.scope = c5;
        this.wssData = new ConcurrentLinkedQueue<>();
        this.hasReceivedLastChunk = r.c(Boolean.FALSE);
        if (isOfflineUri(str)) {
            streamingApiChunkFlowFactory = new OfflineChunkFlowFactory(context, cVar, logger);
        } else {
            streamingApiChunkFlowFactory = new StreamingApiChunkFlowFactory(cVar, logger, streamingAPI, appCheckTokenService, anonCaptchaTokenService, analytics, playerVisibilityService, readsService, voicesService, connectivityService);
        }
        this.chunkFlowFactory = streamingApiChunkFlowFactory;
        logger.log("WssStreamingSession", "init / initialOffset: " + j4);
        g0.D(c5, dispatcherFactory.getDefault(), null, new AnonymousClass1(j4, this, null), 2);
    }

    private final boolean isOfflineUri(String uri) {
        return u.W(uri, "offlineRead://", false);
    }

    @Override // io.elevenlabs.domain.services.StreamingService.StreamingSession
    public void close() {
        g0.i(this.scope, null);
        ConcurrentLinkedQueue<fs.k> concurrentLinkedQueue = this.wssData;
        concurrentLinkedQueue.removeAll(concurrentLinkedQueue);
    }

    @Override // io.elevenlabs.domain.services.StreamingService.StreamingSession
    public Exception getError() {
        return this.error;
    }

    @Override // io.elevenlabs.domain.services.StreamingService.StreamingSession
    public byte[] getNextChunk() {
        fs.k poll = this.wssData.poll();
        if (poll != null) {
            return poll.r();
        }
        return null;
    }

    @Override // io.elevenlabs.domain.services.StreamingService.StreamingSession
    public String getUri() {
        return this.uri;
    }

    @Override // io.elevenlabs.domain.services.StreamingService.StreamingSession
    public boolean hasEnded() {
        return ((Boolean) this.hasReceivedLastChunk.getValue()).booleanValue();
    }

    @Override // io.elevenlabs.domain.services.StreamingService.StreamingSession
    public boolean hasMoreBytes() {
        return !this.wssData.isEmpty();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.data.services.WssStreamingSession$1", f = "ReadsStreamingService.kt", l = {191}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.services.WssStreamingSession$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        final /* synthetic */ long $initialOffset;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ WssStreamingSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j4, WssStreamingSession wssStreamingSession, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$initialOffset = j4;
            this.this$0 = wssStreamingSession;
        }

        public static final boolean invokeSuspend$lambda$2(EnrichedAudioChunk enrichedAudioChunk, EnrichedAudioChunk enrichedAudioChunk2) {
            if (enrichedAudioChunk.hashCode() == enrichedAudioChunk2.hashCode()) {
                return true;
            }
            return false;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$initialOffset, this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.jvm.internal.c0] */
        /* JADX WARN: Type inference failed for: r3v4, types: [ho.p, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.jvm.internal.c0] */
        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ?? obj2 = new Object();
                    obj2.f20558a = this.$initialOffset;
                    ?? obj3 = new Object();
                    jr.j G = r.G(r.G(this.this$0.hasReceivedLastChunk, new WssStreamingSession$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), new WssStreamingSession$1$invokeSuspend$$inlined$flatMapLatest$2(null, this.this$0, obj2));
                    ?? obj4 = new Object();
                    a2.p pVar = r.f18031a;
                    i0.d(2, obj4);
                    ir.g p10 = r.p(G, pVar, obj4);
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, obj2, obj3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    Object collect = p10.collect(anonymousClass4, this);
                    xn.a aVar = xn.a.f37986a;
                    if (collect == aVar) {
                        return aVar;
                    }
                }
            } catch (IntegrityServiceException e10) {
                this.this$0.logger.log(this.this$0.tag, "IntegrityServiceException - ".concat(sn.a.f(e10)));
                if (!((Boolean) this.this$0.hasReceivedLastChunk.getValue()).booleanValue()) {
                    this.this$0.error = e10;
                }
            } catch (IOException e11) {
                this.this$0.logger.log(this.this$0.tag, "IOException - ".concat(sn.a.f(e11)));
                if (!((Boolean) this.this$0.hasReceivedLastChunk.getValue()).booleanValue()) {
                    this.this$0.error = e11;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.data.services.WssStreamingSession$1$4 */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass4<T> implements ir.j {
            final /* synthetic */ c0 $actualDurationUs;
            final /* synthetic */ c0 $bufferOffset;
            final /* synthetic */ WssStreamingSession this$0;

            public AnonymousClass4(WssStreamingSession wssStreamingSession, c0 c0Var, c0 c0Var2) {
                this.this$0 = wssStreamingSession;
                this.$bufferOffset = c0Var;
                this.$actualDurationUs = c0Var2;
            }

            public static final String emit$lambda$2$1(c0 c0Var, c0 c0Var2, long j4) {
                return defpackage.f.g((c0Var.f20558a - c0Var2.f20558a) - j4, "Alignment duration diff: ");
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
            public final Object emit(EnrichedAudioChunk enrichedAudioChunk, wn.c<? super z> cVar) {
                xq.d dVar;
                xq.d dVar2;
                fs.k kVar;
                float f10;
                j1 j1Var;
                AnonymousClass4<T> anonymousClass4 = this;
                if (enrichedAudioChunk.getAudio() != null && enrichedAudioChunk.getAlignment() != null) {
                    fs.k kVar2 = fs.k.f9979d;
                    fs.k q = fj.a.q(enrichedAudioChunk.getAudio());
                    Mp3ChunkDurationExtractor mp3ChunkDurationExtractor = anonymousClass4.this$0.mp3ChunkDurationExtractor;
                    q.getClass();
                    final long durationUs = mp3ChunkDurationExtractor.getDurationUs(q.f9980a.length);
                    anonymousClass4.this$0.logger.verbose(anonymousClass4.this$0.tag, new k(durationUs, 0));
                    Iterator<T> it = enrichedAudioChunk.getAlignment().getCharDurationsMs().iterator();
                    long j4 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        dVar = xq.d.MILLISECONDS;
                        dVar2 = xq.d.MICROSECONDS;
                        if (!hasNext) {
                            break;
                        }
                        int intValue = ((Number) it.next()).intValue();
                        xq.a aVar = xq.b.f38124b;
                        j4 += xq.b.i(xq.g.n(intValue, dVar), dVar2);
                    }
                    float f11 = ((float) durationUs) / ((float) j4);
                    anonymousClass4.$bufferOffset.f20558a += enrichedAudioChunk.getAlignment().getChars().size();
                    j1 j1Var2 = anonymousClass4.this$0.alignments;
                    final c0 c0Var = anonymousClass4.$actualDurationUs;
                    WssStreamingSession wssStreamingSession = anonymousClass4.this$0;
                    while (true) {
                        Object value = j1Var2.getValue();
                        BinarySearchList binarySearchList = (BinarySearchList) value;
                        final ?? obj = new Object();
                        obj.f20558a = c0Var.f20558a;
                        List<Integer> charDurationsMs = enrichedAudioChunk.getAlignment().getCharDurationsMs();
                        ArrayList arrayList = new ArrayList(tn.p.a0(charDurationsMs, 10));
                        Iterator<T> it2 = charDurationsMs.iterator();
                        while (it2.hasNext()) {
                            int intValue2 = ((Number) it2.next()).intValue();
                            fs.k kVar3 = q;
                            long j10 = obj.f20558a;
                            if (intValue2 > 0) {
                                xq.a aVar2 = xq.b.f38124b;
                                f10 = f11;
                                j1Var = j1Var2;
                                obj.f20558a = jo.a.z(((float) xq.b.i(xq.g.n(intValue2, dVar), dVar2)) * f10) + j10;
                            } else {
                                f10 = f11;
                                j1Var = j1Var2;
                            }
                            xq.a aVar3 = xq.b.f38124b;
                            arrayList.add(new Long(xq.b.d(xq.g.o(j10, dVar2))));
                            q = kVar3;
                            f11 = f10;
                            j1Var2 = j1Var;
                        }
                        kVar = q;
                        float f12 = f11;
                        j1 j1Var3 = j1Var2;
                        BinarySearchList plus = binarySearchList.plus(arrayList);
                        wssStreamingSession.logger.verbose(wssStreamingSession.tag, new ho.a() { // from class: io.elevenlabs.data.services.l
                            @Override // ho.a
                            public final Object invoke() {
                                String emit$lambda$2$1;
                                emit$lambda$2$1 = WssStreamingSession.AnonymousClass1.AnonymousClass4.emit$lambda$2$1(c0.this, c0Var, durationUs);
                                return emit$lambda$2$1;
                            }
                        });
                        if (j1Var3.compareAndSet(value, plus)) {
                            break;
                        }
                        j1Var2 = j1Var3;
                        q = kVar;
                        f11 = f12;
                    }
                    anonymousClass4 = this;
                    anonymousClass4.$actualDurationUs.f20558a += durationUs;
                    anonymousClass4.this$0.wssData.add(kVar);
                    anonymousClass4.this$0.anonCaptchaTokenService.confirmTokenAccepted();
                }
                if (enrichedAudioChunk.isFinal()) {
                    anonymousClass4.this$0.logger.log(anonymousClass4.this$0.tag, "Final chunk, closing");
                    Object emit = anonymousClass4.this$0.hasReceivedLastChunk.emit(Boolean.TRUE, cVar);
                    if (emit == xn.a.f37986a) {
                        return emit;
                    }
                }
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((EnrichedAudioChunk) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}
