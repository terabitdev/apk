package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import ho.q;
import hr.x;
import io.elevenlabs.data.api.VoicesAPI;
import io.elevenlabs.data.database.entities.voices.VoiceEntity;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReaderVoicesResponseModel;
import io.elevenlabs.data.services.VoicesServiceImpl;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ConnectivityServiceKt;
import ir.m1;
import ir.r;
import ir.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$sync$1", f = "VoicesServiceImpl.kt", l = {173}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class VoicesServiceImpl$sync$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VoicesServiceImpl this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$sync$1$1", f = "VoicesServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "<anonymous>", "()Lir/i;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$sync$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.l {
        int label;
        final /* synthetic */ VoicesServiceImpl this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$sync$1$1$1", f = "VoicesServiceImpl.kt", l = {138, 141, 148, 163}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$sync$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00171 extends yn.i implements p {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
            Object L$7;
            int label;
            final /* synthetic */ VoicesServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00171(VoicesServiceImpl voicesServiceImpl, wn.c<? super C00171> cVar) {
                super(2, cVar);
                this.this$0 = voicesServiceImpl;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00171 c00171 = new C00171(this.this$0, cVar);
                c00171.L$0 = obj;
                return c00171;
            }

            @Override // ho.p
            public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
                return ((C00171) create(jVar, cVar)).invokeSuspend(z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:53:0x01c6, code lost:
            
                if (r0.emit(r14, r13) == r7) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01c8, code lost:
            
                return r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
            
                if (r14 == r7) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0083, code lost:
            
                if (r14 == r7) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0060, code lost:
            
                if (r0.emit(r14, r13) == r7) goto L54;
             */
            @Override // yn.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                VoicesAPI voicesAPI;
                Logger logger2;
                String str2;
                List transform;
                VoicesDao voicesDao;
                Logger logger3;
                String str3;
                VoicesDao voicesDao2;
                Logger logger4;
                String str4;
                VoicesDao voicesDao3;
                Logger logger5;
                String str5;
                ir.j jVar = (ir.j) this.L$0;
                int i10 = this.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    sn.a.g(obj);
                                    logger5 = this.this$0.logger;
                                    str5 = this.this$0.tag;
                                    logger5.log(str5, "Voices sync completed successfully");
                                    return z.f31622a;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            transform = (List) this.L$2;
                            sn.a.g(obj);
                            List list = (List) obj;
                            int H = a0.H(tn.p.a0(list, 10));
                            int i11 = 16;
                            if (H < 16) {
                                H = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                            for (Object obj2 : list) {
                                linkedHashMap.put(((VoiceEntity) obj2).getVoiceId(), obj2);
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : transform) {
                                VoiceEntity voiceEntity = (VoiceEntity) obj3;
                                if (!voiceEntity.equals(linkedHashMap.get(voiceEntity.getVoiceId()))) {
                                    arrayList.add(obj3);
                                }
                            }
                            int H2 = a0.H(tn.p.a0(transform, 10));
                            if (H2 >= 16) {
                                i11 = H2;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                            for (Object obj4 : transform) {
                                linkedHashMap2.put(((VoiceEntity) obj4).getVoiceId(), obj4);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : list) {
                                if (!linkedHashMap2.containsKey(((VoiceEntity) obj5).getVoiceId())) {
                                    arrayList2.add(obj5);
                                }
                            }
                            logger3 = this.this$0.logger;
                            str3 = this.this$0.tag;
                            logger3.log(str3, "Voices to add: " + arrayList.size());
                            voicesDao2 = this.this$0.voicesDao;
                            voicesDao2.insertAll(arrayList);
                            logger4 = this.this$0.logger;
                            str4 = this.this$0.tag;
                            logger4.log(str4, "Voices to remove: " + arrayList2.size());
                            voicesDao3 = this.this$0.voicesDao;
                            voicesDao3.deleteAll(arrayList2);
                            SyncStatus syncStatus = SyncStatus.READY;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.label = 4;
                        } else {
                            sn.a.g(obj);
                            ApiResult apiResult = (ApiResult) obj;
                            boolean z6 = apiResult instanceof ApiResult.Success;
                            VoicesServiceImpl voicesServiceImpl = this.this$0;
                            if (z6) {
                                transform = voicesServiceImpl.transform((ReaderVoicesResponseModel) ((ApiResult.Success) apiResult).getData());
                                voicesDao = this.this$0.voicesDao;
                                ir.i all = voicesDao.getAll();
                                this.L$0 = jVar;
                                this.L$1 = null;
                                this.L$2 = transform;
                                this.label = 3;
                                obj = r.u(all, this);
                            } else {
                                logger2 = voicesServiceImpl.logger;
                                str2 = this.this$0.tag;
                                Logger.logWarning$default(logger2, str2, "Error during voices sync: " + apiResult, null, 4, null);
                                throw new VoicesServiceImpl.VoicesSyncException();
                            }
                        }
                    } else {
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    SyncStatus syncStatus2 = SyncStatus.SYNCING;
                    this.L$0 = jVar;
                    this.label = 1;
                }
                logger = this.this$0.logger;
                str = this.this$0.tag;
                logger.log(str, "Voices sync started");
                voicesAPI = this.this$0.voicesAPI;
                this.L$0 = jVar;
                this.label = 2;
                obj = voicesAPI.getVoices(this);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$sync$1$1$2", f = "VoicesServiceImpl.kt", l = {167}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ParameterNames.CAUSE, ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$sync$1$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends yn.i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ VoicesServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(VoicesServiceImpl voicesServiceImpl, wn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = voicesServiceImpl;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // ho.p
            public final Object invoke(Throwable th, wn.c<? super Boolean> cVar) {
                return ((AnonymousClass2) create(th, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                Throwable th = (Throwable) this.L$0;
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
                    Logger.logWarning$default(logger, str, defpackage.f.i("Voices sync failed, will retry: ", th.getMessage()), null, 4, null);
                    xq.a aVar = xq.b.f38124b;
                    long n2 = xq.g.n(2, xq.d.SECONDS);
                    this.L$0 = null;
                    this.label = 1;
                    Object n10 = g0.n(n2, this);
                    xn.a aVar2 = xn.a.f37986a;
                    if (n10 == aVar2) {
                        return aVar2;
                    }
                }
                return Boolean.TRUE;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$sync$1$1$3", f = "VoicesServiceImpl.kt", l = {171}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.VoicesServiceImpl$sync$1$1$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends yn.i implements q {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ VoicesServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(VoicesServiceImpl voicesServiceImpl, wn.c<? super AnonymousClass3> cVar) {
                super(3, cVar);
                this.this$0 = voicesServiceImpl;
            }

            @Override // ho.q
            public final Object invoke(ir.j jVar, Throwable th, wn.c<? super z> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, cVar);
                anonymousClass3.L$0 = jVar;
                return anonymousClass3.invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                ir.j jVar = (ir.j) this.L$0;
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
                    logger.log(str, "Sync failed after all retries");
                    SyncStatus syncStatus = SyncStatus.ERROR;
                    this.L$0 = null;
                    this.label = 1;
                    Object emit = jVar.emit(syncStatus, this);
                    xn.a aVar = xn.a.f37986a;
                    if (emit == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoicesServiceImpl voicesServiceImpl, wn.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.this$0 = voicesServiceImpl;
        }

        @Override // yn.a
        public final wn.c<z> create(wn.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // ho.l
        public final Object invoke(wn.c<? super ir.i> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sn.a.g(obj);
                return new w(r.C(new m1(new C00171(this.this$0, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null));
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicesServiceImpl$sync$1(VoicesServiceImpl voicesServiceImpl, wn.c<? super VoicesServiceImpl$sync$1> cVar) {
        super(2, cVar);
        this.this$0 = voicesServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        VoicesServiceImpl$sync$1 voicesServiceImpl$sync$1 = new VoicesServiceImpl$sync$1(this.this$0, cVar);
        voicesServiceImpl$sync$1.L$0 = obj;
        return voicesServiceImpl$sync$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((VoicesServiceImpl$sync$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConnectivityService connectivityService;
        final x xVar = (x) this.L$0;
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
            connectivityService = this.this$0.connectivityService;
            ir.i whenConnected = ConnectivityServiceKt.whenConnected(connectivityService, new AnonymousClass1(this.this$0, null));
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.data.services.VoicesServiceImpl$sync$1.2
                public final Object emit(SyncStatus syncStatus, wn.c<? super z> cVar) {
                    Object c5 = ((hr.w) x.this).f12593d.c(syncStatus, cVar);
                    if (c5 == xn.a.f37986a) {
                        return c5;
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((SyncStatus) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.L$0 = null;
            this.label = 1;
            Object collect = whenConnected.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
