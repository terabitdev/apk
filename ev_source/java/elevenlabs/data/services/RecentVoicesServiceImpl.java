package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.RecentVoicesApi;
import io.elevenlabs.data.database.entities.voices.RecentVoiceEntity;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao;
import io.elevenlabs.data.mapping.VoiceMappingKt;
import io.elevenlabs.data.usecase.CurrentTimeMillisUseCase;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.RecentVoicesService;
import ir.m1;
import ir.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/data/services/RecentVoicesServiceImpl;", "Lio/elevenlabs/domain/services/RecentVoicesService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/data/api/RecentVoicesApi;", "api", "Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "dao", "Lio/elevenlabs/data/usecase/CurrentTimeMillisUseCase;", "currentTimeMillisUseCase", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/data/api/RecentVoicesApi;Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;Lio/elevenlabs/data/usecase/CurrentTimeMillisUseCase;)V", "Lir/i;", "", "Lio/elevenlabs/domain/model/RecentVoice;", "observeRecentVoices", "()Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "syncRecentVoices", "", "voiceId", "Lsn/z;", "markVoiceAsRecent", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/data/api/RecentVoicesApi;", "Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "Lio/elevenlabs/data/usecase/CurrentTimeMillisUseCase;", "Companion", "RecentVoicesSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RecentVoicesServiceImpl implements RecentVoicesService {
    private static final String TAG = "RecentVoicesService";
    private final RecentVoicesApi api;
    private final CurrentTimeMillisUseCase currentTimeMillisUseCase;
    private final RecentVoicesDao dao;
    private final Logger logger;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/RecentVoicesServiceImpl$RecentVoicesSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class RecentVoicesSyncException extends Exception {
    }

    public RecentVoicesServiceImpl(Logger logger, RecentVoicesApi recentVoicesApi, RecentVoicesDao recentVoicesDao, CurrentTimeMillisUseCase currentTimeMillisUseCase) {
        logger.getClass();
        recentVoicesApi.getClass();
        recentVoicesDao.getClass();
        currentTimeMillisUseCase.getClass();
        this.logger = logger;
        this.api = recentVoicesApi;
        this.dao = recentVoicesDao;
        this.currentTimeMillisUseCase = currentTimeMillisUseCase;
    }

    @Override // io.elevenlabs.domain.services.RecentVoicesService
    public Object markVoiceAsRecent(String str, wn.c<? super z> cVar) {
        Object insertRecentVoice = this.dao.insertRecentVoice(new RecentVoiceEntity(str, this.currentTimeMillisUseCase.invoke()), cVar);
        if (insertRecentVoice == xn.a.f37986a) {
            return insertRecentVoice;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.RecentVoicesService
    public ir.i observeRecentVoices() {
        final ir.i observeRecentVoices = this.dao.observeRecentVoices();
        return new ir.i() { // from class: io.elevenlabs.data.services.RecentVoicesServiceImpl$observeRecentVoices$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.RecentVoicesServiceImpl$observeRecentVoices$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.RecentVoicesServiceImpl$observeRecentVoices$$inlined$map$1$2", f = "RecentVoicesServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.RecentVoicesServiceImpl$observeRecentVoices$$inlined$map$1$2$1, reason: invalid class name */
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
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(VoiceMappingKt.toDomain((RecentVoiceEntity) it.next()));
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(arrayList, anonymousClass1);
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

    @Override // io.elevenlabs.domain.services.RecentVoicesService
    public ir.i syncRecentVoices() {
        return new w(new m1(new RecentVoicesServiceImpl$syncRecentVoices$1(this, null)), new RecentVoicesServiceImpl$syncRecentVoices$2(this, null));
    }
}
