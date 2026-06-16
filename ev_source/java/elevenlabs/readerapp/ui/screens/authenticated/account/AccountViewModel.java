package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.services.AccountService;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.n1;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0081\u0001\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010 J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u001e¢\u0006\u0004\b*\u0010 J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b+\u0010 J\u000f\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/H\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010;¨\u0006="}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountState;", "Ljl/a;", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/PasswordResetService;", "passwordResetService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/AppConfigService;", "appConfigService", "Lio/elevenlabs/domain/services/AccountService;", "accountService", "Lio/elevenlabs/domain/services/OfflineReadsService;", "offlineReadsService", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "<init>", "(Ljl/a;Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Ljl/a;Ljl/a;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/AppConfigService;Lio/elevenlabs/domain/services/AccountService;Lio/elevenlabs/domain/services/OfflineReadsService;Lio/elevenlabs/domain/services/PurchasesService;)V", "Lsn/z;", "startSignOutFlow", "()V", "confirmSignOut", "dismissSignOutConfirmation", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "resetPassword", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "visible", "onVisibilityToggled", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "showCustomerCenter", "dismissCustomerCenter", "", "consumePendingCustomerCenterAction", "()Ljava/lang/String;", "Lir/i;", "loadPage", "()Lir/i;", "Ljl/a;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/AppConfigService;", "Lio/elevenlabs/domain/services/AccountService;", "Lio/elevenlabs/domain/services/OfflineReadsService;", "Lio/elevenlabs/domain/services/PurchasesService;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountViewModel extends MviViewModel<AccountState> {

    @Deprecated
    public static final String TAG = "AccountViewModel";
    private final AccountService accountService;
    private final Analytics analytics;
    private final AppConfigService appConfigService;
    private final jl.a authService;
    private final Logger logger;
    private final OfflineReadsService offlineReadsService;
    private final jl.a passwordResetService;
    private final PurchasesService purchasesService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final jl.a stringProvider;
    private final jl.a toastService;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$3", f = "AccountViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$3$1", f = "AccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/AppConfig;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/AppConfig;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AccountViewModel accountViewModel, wn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = accountViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AccountState invokeSuspend$lambda$0(AppConfig appConfig, AccountState accountState) {
                return AccountState.copy$default(accountState, null, false, appConfig, null, false, null, false, false, false, false, null, 2043, null);
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
                    this.this$0.queueStateUpdate(new h(appConfig, 2));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass3(wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(cVar);
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
                ir.i config = AccountViewModel.this.appConfigService.getConfig();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(config, anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$4", f = "AccountViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends yn.i implements ho.p {
        int label;

        public AnonymousClass4(wn.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass4(cVar);
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
                final z1 stateFlow = AccountViewModel.this.getStateFlow();
                jr.j G = ir.r.G(ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$4$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$4$invokeSuspend$$inlined$map$1$2", f = "AccountViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
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
                                        Boolean valueOf = Boolean.valueOf(((AccountState) obj).isScreenVisible());
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(valueOf, anonymousClass1);
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
                }), new AccountViewModel$4$invokeSuspend$$inlined$flatMapLatest$1(null, AccountViewModel.this));
                this.label = 1;
                Object k4 = ir.r.k(G, this);
                xn.a aVar = xn.a.f37986a;
                if (k4 == aVar) {
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
    public AccountViewModel(jl.a aVar, DispatcherFactory dispatcherFactory, jl.a aVar2, jl.a aVar3, jl.a aVar4, Logger logger, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase, AppConfigService appConfigService, AccountService accountService, OfflineReadsService offlineReadsService, PurchasesService purchasesService) {
        super(new AccountState(null, false, null, null, false, null, false, false, false, false, null, 2047, null), dispatcherFactory, r3, 4, null);
        aVar.getClass();
        dispatcherFactory.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        logger.getClass();
        analytics.getClass();
        resolveErrorMessageUseCase.getClass();
        appConfigService.getClass();
        accountService.getClass();
        offlineReadsService.getClass();
        purchasesService.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.authService = aVar;
        this.passwordResetService = aVar2;
        this.toastService = aVar3;
        this.stringProvider = aVar4;
        this.logger = logger;
        this.analytics = analytics;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.appConfigService = appConfigService;
        this.accountService = accountService;
        this.offlineReadsService = offlineReadsService;
        this.purchasesService = purchasesService;
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass4(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountState confirmSignOut$lambda$0(AccountState accountState) {
        accountState.getClass();
        return AccountState.copy$default(accountState, null, false, null, null, false, null, false, false, false, false, null, 1663, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountState consumePendingCustomerCenterAction$lambda$0(AccountState accountState) {
        accountState.getClass();
        return AccountState.copy$default(accountState, null, false, null, null, false, null, false, false, false, false, null, 1023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountState dismissCustomerCenter$lambda$0(AccountState accountState) {
        accountState.getClass();
        return AccountState.copy$default(accountState, null, false, null, null, false, null, false, false, false, false, null, 1535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountState dismissSignOutConfirmation$lambda$0(AccountState accountState) {
        accountState.getClass();
        return AccountState.copy$default(accountState, null, false, null, null, false, null, false, false, false, false, null, 1663, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ir.i loadPage() {
        return ir.r.j(new AccountViewModel$loadPage$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountState onVisibilityToggled$lambda$0(AccountViewModel accountViewModel, boolean z6, AccountState accountState) {
        accountState.getClass();
        accountViewModel.logger.log(TAG, "onVisibilityToggled: " + z6);
        return AccountState.copy$default(accountState, null, false, null, null, false, null, z6, false, false, false, null, 1983, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountState resetPassword$lambda$0(AccountViewModel accountViewModel, AccountState accountState) {
        String str;
        accountState.getClass();
        accountViewModel.analytics.log(Analytics.Event.ClickedResetPassword.INSTANCE);
        User user = accountState.getUser();
        if (user != null) {
            str = user.getEmail();
        } else {
            str = null;
        }
        if (!accountState.isLoadingPasswordReset() && str != null) {
            g0.D(c1.h(accountViewModel), accountViewModel.getDispatcherFactory().getIo(), null, new AccountViewModel$resetPassword$1$1(accountViewModel, str, null), 2);
            return AccountState.copy$default(accountState, null, true, null, null, false, null, false, false, false, false, null, 2045, null);
        }
        return accountState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountState showCustomerCenter$lambda$0(AccountState accountState) {
        accountState.getClass();
        return AccountState.copy$default(accountState, null, false, null, null, false, null, false, false, false, true, null, 1535, null);
    }

    public final void confirmSignOut() {
        queueStateUpdate(new j(25));
        g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new AccountViewModel$confirmSignOut$2(this, null), 2);
    }

    public final String consumePendingCustomerCenterAction() {
        String pendingCustomerCenterAction = ((AccountState) getStateFlow().getValue()).getPendingCustomerCenterAction();
        if (pendingCustomerCenterAction == null) {
            return null;
        }
        queueStateUpdate(new j(26));
        return pendingCustomerCenterAction;
    }

    public final void dismissCustomerCenter() {
        this.analytics.log(Analytics.Event.CustomerCenterDismissed.INSTANCE);
        queueStateUpdate(new j(27));
    }

    public final void dismissSignOutConfirmation() {
        queueStateUpdate(new j(24));
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final MviViewModel.StateUpdate onVisibilityToggled(boolean visible) {
        return queueStateUpdate(new g(this, visible, 0));
    }

    public final MviViewModel.StateUpdate resetPassword() {
        return queueStateUpdate(new f(this, 1));
    }

    public final void showCustomerCenter() {
        queueStateUpdate(new j(23));
    }

    public final void startSignOutFlow() {
        g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new AccountViewModel$startSignOutFlow$1(this, null), 2);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountViewModel$Companion;", "", "<init>", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$2", f = "AccountViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
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
                ir.i user = ((AuthService) AccountViewModel.this.authService.get()).user();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountViewModel.this);
                this.label = 1;
                Object collect = user.collect(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ AccountViewModel this$0;

            public AnonymousClass1(AccountViewModel accountViewModel) {
                this.this$0 = accountViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AccountState emit$lambda$0(User user, AccountState accountState) {
                accountState.getClass();
                return AccountState.copy$default(accountState, user, false, null, null, false, null, false, false, false, false, null, 2046, null);
            }

            public final Object emit(User user, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new h(user, 1));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((User) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$1", f = "AccountViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                n1 customerCenterEvents = AccountViewModel.this.purchasesService.getCustomerCenterEvents();
                C00291 c00291 = new C00291(AccountViewModel.this);
                this.label = 1;
                Object collect = customerCenterEvents.collect(c00291, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            c6.u();
            return null;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00291<T> implements ir.j {
            final /* synthetic */ AccountViewModel this$0;

            public C00291(AccountViewModel accountViewModel) {
                this.this$0 = accountViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AccountState emit$lambda$0(PurchasesService.CustomerCenterEvent customerCenterEvent, AccountState accountState) {
                accountState.getClass();
                return AccountState.copy$default(accountState, null, false, null, null, false, null, false, false, false, false, ((PurchasesService.CustomerCenterEvent.CustomAction) customerCenterEvent).getActionId(), 511, null);
            }

            public final Object emit(PurchasesService.CustomerCenterEvent customerCenterEvent, wn.c<? super z> cVar) {
                if (customerCenterEvent instanceof PurchasesService.CustomerCenterEvent.CustomAction) {
                    this.this$0.queueStateUpdate(new h((PurchasesService.CustomerCenterEvent.CustomAction) customerCenterEvent, 0));
                    return z.f31622a;
                }
                c6.p();
                return null;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((PurchasesService.CustomerCenterEvent) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}
