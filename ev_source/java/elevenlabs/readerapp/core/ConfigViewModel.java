package io.elevenlabs.readerapp.core;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.AuthService;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/readerapp/core/ConfigViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/core/ConfigState;", "Ljl/a;", "Lio/elevenlabs/domain/services/AppConfigService;", "appConfigService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Ljl/a;Ljl/a;Ljl/a;Ljl/a;Lio/elevenlabs/domain/DispatcherFactory;)V", "", "currentVersion", "Lsn/z;", "setCurrentAppVersion", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConfigViewModel extends MviViewModel<ConfigState> {
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.ConfigViewModel$1", f = "ConfigViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.ConfigViewModel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        final /* synthetic */ jl.a $appConfigService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jl.a aVar, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$appConfigService = aVar;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$appConfigService, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
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
                ir.i sync = ((AppConfigService) this.$appConfigService.get()).sync();
                this.label = 1;
                Object k4 = r.k(sync, this);
                xn.a aVar = xn.a.f37986a;
                if (k4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.ConfigViewModel$2", f = "ConfigViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.ConfigViewModel$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ jl.a $authService;
        final /* synthetic */ jl.a $userConfigService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(jl.a aVar, jl.a aVar2, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$authService = aVar;
            this.$userConfigService = aVar2;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.$authService, this.$userConfigService, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
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
                jr.j G = r.G(((AuthService) this.$authService.get()).isSignedIn(), new ConfigViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(null, this.$userConfigService));
                this.label = 1;
                Object k4 = r.k(G, this);
                xn.a aVar = xn.a.f37986a;
                if (k4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.ConfigViewModel$3", f = "ConfigViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.ConfigViewModel$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        final /* synthetic */ jl.a $authService;
        final /* synthetic */ jl.a $customerService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(jl.a aVar, jl.a aVar2, wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$authService = aVar;
            this.$customerService = aVar2;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(this.$authService, this.$customerService, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
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
                jr.j G = r.G(((AuthService) this.$authService.get()).isSignedIn(), new ConfigViewModel$3$invokeSuspend$$inlined$flatMapLatest$1(null, this.$customerService));
                this.label = 1;
                Object k4 = r.k(G, this);
                xn.a aVar = xn.a.f37986a;
                if (k4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.core.ConfigViewModel$4", f = "ConfigViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.core.ConfigViewModel$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends yn.i implements ho.p {
        final /* synthetic */ jl.a $appConfigService;
        int label;
        final /* synthetic */ ConfigViewModel this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.core.ConfigViewModel$4$1", f = "ConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/AppConfig;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/AppConfig;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.core.ConfigViewModel$4$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ConfigViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConfigViewModel configViewModel, wn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = configViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ConfigState invokeSuspend$lambda$0(AppConfig appConfig, ConfigState configState) {
                return ConfigState.copy$default(configState, appConfig.getMinAppVersion(), null, 2, null);
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // ho.p
            public final Object invoke(AppConfig appConfig, wn.c<? super z> cVar) {
                return ((AnonymousClass1) create(appConfig, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                AppConfig appConfig = (AppConfig) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new b(appConfig, 0));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(jl.a aVar, ConfigViewModel configViewModel, wn.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$appConfigService = aVar;
            this.this$0 = configViewModel;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass4(this.$appConfigService, this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass4) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
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
                ir.i config = ((AppConfigService) this.$appConfigService.get()).getConfig();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                Object l4 = r.l(config, anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConfigViewModel(jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, DispatcherFactory dispatcherFactory) {
        super(new ConfigState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), dispatcherFactory, r3, 4, null);
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        dispatcherFactory.getClass();
        Logger logger = null;
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(aVar, null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass2(aVar4, aVar3, null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass3(aVar4, aVar2, null), 2);
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass4(aVar, this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfigState setCurrentAppVersion$lambda$0(String str, ConfigState configState) {
        configState.getClass();
        return ConfigState.copy$default(configState, null, str, 1, null);
    }

    public final void setCurrentAppVersion(String currentVersion) {
        currentVersion.getClass();
        queueStateUpdate(new b(currentVersion, 2));
    }
}
