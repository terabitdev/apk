package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.api.Endpoint;
import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import ho.q;
import hr.x;
import io.elevenlabs.data.api.ConfigAPI;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReaderUserConfigResponseModel;
import io.elevenlabs.data.services.RestUserConfigService;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ConnectivityServiceKt;
import ir.m1;
import ir.r;
import ir.w;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.RestUserConfigService$sync$2", f = "RestUserConfigService.kt", l = {130}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RestUserConfigService$sync$2 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RestUserConfigService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.data.services.RestUserConfigService$sync$2$1", f = "RestUserConfigService.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "<anonymous>", "()Lir/i;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.services.RestUserConfigService$sync$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.l {
        int label;
        final /* synthetic */ RestUserConfigService this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.RestUserConfigService$sync$2$1$1", f = "RestUserConfigService.kt", l = {92, 96, Endpoint.TARGET_FIELD_NUMBER, 110, 113}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.RestUserConfigService$sync$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00161 extends yn.i implements p {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ RestUserConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00161(RestUserConfigService restUserConfigService, wn.c<? super C00161> cVar) {
                super(2, cVar);
                this.this$0 = restUserConfigService;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00161 c00161 = new C00161(this.this$0, cVar);
                c00161.L$0 = obj;
                return c00161;
            }

            @Override // ho.p
            public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
                return ((C00161) create(jVar, cVar)).invokeSuspend(z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0120, code lost:
            
                if (r0.emit(r10, r9) == r8) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0122, code lost:
            
                return r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
            
                if (r0.emit(r10, r9) == r8) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
            
                if (r10 == r8) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
            
                if (r10 == r8) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0051, code lost:
            
                if (r0.emit(r10, r9) == r8) goto L44;
             */
            @Override // yn.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ReaderUserConfigResponseModel lastPendingChanges;
                ConfigAPI configAPI;
                ReaderUserConfigResponseModel readerUserConfigResponseModel;
                Logger logger;
                String str;
                ConfigAPI configAPI2;
                Logger logger2;
                String str2;
                Logger logger3;
                String str3;
                ReaderUserConfigResponseModel readerUserConfigResponseModel2;
                Logger logger4;
                String str4;
                ir.j jVar = (ir.j) this.L$0;
                int i10 = this.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    sn.a.g(obj);
                                    ApiResult apiResult = (ApiResult) obj;
                                    if (apiResult instanceof ApiResult.Success) {
                                        this.this$0.saveConfig((ReaderUserConfigResponseModel) ((ApiResult.Success) apiResult).getData());
                                        SyncStatus syncStatus = SyncStatus.READY;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 5;
                                    } else {
                                        if (apiResult instanceof ApiResult.Error) {
                                            logger4 = this.this$0.logger;
                                            str4 = this.this$0.tag;
                                            logger4.log(str4, "Error fetching config");
                                            throw new RestUserConfigService.UserConfigSyncException();
                                        }
                                        c6.p();
                                        return null;
                                    }
                                }
                            }
                            sn.a.g(obj);
                            return z.f31622a;
                        }
                        sn.a.g(obj);
                        ApiResult apiResult2 = (ApiResult) obj;
                        if (apiResult2 instanceof ApiResult.Success) {
                            logger3 = this.this$0.logger;
                            str3 = this.this$0.tag;
                            logger3.log(str3, "Pending config changes posted successfully");
                            this.this$0.saveConfig((ReaderUserConfigResponseModel) ((ApiResult.Success) apiResult2).getData());
                            RestUserConfigService restUserConfigService = this.this$0;
                            readerUserConfigResponseModel2 = restUserConfigService.emptyPendingChanges;
                            restUserConfigService.savePendingChanges(readerUserConfigResponseModel2);
                            SyncStatus syncStatus2 = SyncStatus.READY;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                        } else {
                            if (apiResult2 instanceof ApiResult.Error) {
                                logger2 = this.this$0.logger;
                                str2 = this.this$0.tag;
                                logger2.log(str2, "Error posting pending config changes");
                                throw new RestUserConfigService.UserConfigSyncException();
                            }
                            c6.p();
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    SyncStatus syncStatus3 = SyncStatus.SYNCING;
                    this.L$0 = jVar;
                    this.label = 1;
                }
                lastPendingChanges = this.this$0.getLastPendingChanges();
                if (lastPendingChanges != null) {
                    readerUserConfigResponseModel = this.this$0.emptyPendingChanges;
                    if (!lastPendingChanges.equals(readerUserConfigResponseModel)) {
                        logger = this.this$0.logger;
                        str = this.this$0.tag;
                        logger.log(str, "Found pending changes, posting them first");
                        configAPI2 = this.this$0.configAPI;
                        this.L$0 = jVar;
                        this.L$1 = null;
                        this.label = 2;
                        obj = configAPI2.saveUserConfig(lastPendingChanges, this);
                    }
                }
                configAPI = this.this$0.configAPI;
                this.L$0 = jVar;
                this.L$1 = null;
                this.label = 4;
                obj = configAPI.getUserConfig(this);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.RestUserConfigService$sync$2$1$2", f = "RestUserConfigService.kt", l = {124}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ParameterNames.CAUSE, ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.data.services.RestUserConfigService$sync$2$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends yn.i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RestUserConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RestUserConfigService restUserConfigService, wn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = restUserConfigService;
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
                    Logger.logWarning$default(logger, str, defpackage.f.i("UserConfig sync failed, will retry: ", th.getMessage()), null, 4, null);
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
        @yn.e(c = "io.elevenlabs.data.services.RestUserConfigService$sync$2$1$3", f = "RestUserConfigService.kt", l = {128}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.RestUserConfigService$sync$2$1$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends yn.i implements q {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RestUserConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RestUserConfigService restUserConfigService, wn.c<? super AnonymousClass3> cVar) {
                super(3, cVar);
                this.this$0 = restUserConfigService;
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
        public AnonymousClass1(RestUserConfigService restUserConfigService, wn.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.this$0 = restUserConfigService;
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
                return new w(r.C(new m1(new C00161(this.this$0, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null));
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestUserConfigService$sync$2(RestUserConfigService restUserConfigService, wn.c<? super RestUserConfigService$sync$2> cVar) {
        super(2, cVar);
        this.this$0 = restUserConfigService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        RestUserConfigService$sync$2 restUserConfigService$sync$2 = new RestUserConfigService$sync$2(this.this$0, cVar);
        restUserConfigService$sync$2.L$0 = obj;
        return restUserConfigService$sync$2;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((RestUserConfigService$sync$2) create(xVar, cVar)).invokeSuspend(z.f31622a);
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
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.data.services.RestUserConfigService$sync$2.2
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
