package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import ho.q;
import hr.x;
import io.elevenlabs.data.api.ConfigAPI;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReaderAppConfigResponseModel;
import io.elevenlabs.data.services.RestAppConfigService;
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
@yn.e(c = "io.elevenlabs.data.services.RestAppConfigService$sync$1", f = "RestAppConfigService.kt", l = {69}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RestAppConfigService$sync$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RestAppConfigService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.data.services.RestAppConfigService$sync$1$1", f = "RestAppConfigService.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "<anonymous>", "()Lir/i;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.services.RestAppConfigService$sync$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.l {
        int label;
        final /* synthetic */ RestAppConfigService this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.RestAppConfigService$sync$1$1$1", f = "RestAppConfigService.kt", l = {45, 47, 52}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.RestAppConfigService$sync$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00151 extends yn.i implements p {
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ RestAppConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00151(RestAppConfigService restAppConfigService, wn.c<? super C00151> cVar) {
                super(2, cVar);
                this.this$0 = restAppConfigService;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00151 c00151 = new C00151(this.this$0, cVar);
                c00151.L$0 = obj;
                return c00151;
            }

            @Override // ho.p
            public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
                return ((C00151) create(jVar, cVar)).invokeSuspend(z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
            
                if (r0.emit(r8, r7) == r5) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
            
                return r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
            
                if (r8 == r5) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
            
                if (r0.emit(r8, r7) == r5) goto L22;
             */
            @Override // yn.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                ConfigAPI configAPI;
                Logger logger2;
                String str2;
                SharedPreferences sharedPreferences;
                String str3;
                vr.c cVar;
                Logger logger3;
                String str4;
                ir.j jVar = (ir.j) this.L$0;
                int i10 = this.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                logger3 = this.this$0.logger;
                                str4 = this.this$0.tag;
                                logger3.log(str4, "App config sync completed successfully");
                                return z.f31622a;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                            sharedPreferences = this.this$0.sharedPreferences;
                            RestAppConfigService restAppConfigService = this.this$0;
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            str3 = restAppConfigService.prefConfig;
                            cVar = restAppConfigService.json;
                            Object data = ((ApiResult.Success) apiResult).getData();
                            cVar.getClass();
                            edit.putString(str3, cVar.d(ReaderAppConfigResponseModel.INSTANCE.serializer(), data));
                            edit.apply();
                            SyncStatus syncStatus = SyncStatus.READY;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                        } else {
                            if (apiResult instanceof ApiResult.Error) {
                                logger2 = this.this$0.logger;
                                str2 = this.this$0.tag;
                                Logger.logWarning$default(logger2, str2, "Error during app config sync: " + apiResult, null, 4, null);
                                throw new RestAppConfigService.AppConfigSyncException();
                            }
                            c6.p();
                            return null;
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
                logger.log(str, "App config sync started");
                configAPI = this.this$0.configAPI;
                this.L$0 = jVar;
                this.label = 2;
                obj = configAPI.getAppConfig(this);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.RestAppConfigService$sync$1$1$2", f = "RestAppConfigService.kt", l = {63}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ParameterNames.CAUSE, ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.data.services.RestAppConfigService$sync$1$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends yn.i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RestAppConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RestAppConfigService restAppConfigService, wn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = restAppConfigService;
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
                    Logger.logWarning$default(logger, str, defpackage.f.i("App config sync failed, will retry: ", th.getMessage()), null, 4, null);
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
        @yn.e(c = "io.elevenlabs.data.services.RestAppConfigService$sync$1$1$3", f = "RestAppConfigService.kt", l = {67}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.RestAppConfigService$sync$1$1$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends yn.i implements q {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RestAppConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RestAppConfigService restAppConfigService, wn.c<? super AnonymousClass3> cVar) {
                super(3, cVar);
                this.this$0 = restAppConfigService;
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
        public AnonymousClass1(RestAppConfigService restAppConfigService, wn.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.this$0 = restAppConfigService;
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
                return new w(r.C(new m1(new C00151(this.this$0, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null));
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestAppConfigService$sync$1(RestAppConfigService restAppConfigService, wn.c<? super RestAppConfigService$sync$1> cVar) {
        super(2, cVar);
        this.this$0 = restAppConfigService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        RestAppConfigService$sync$1 restAppConfigService$sync$1 = new RestAppConfigService$sync$1(this.this$0, cVar);
        restAppConfigService$sync$1.L$0 = obj;
        return restAppConfigService$sync$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((RestAppConfigService$sync$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
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
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.data.services.RestAppConfigService$sync$1.2
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
