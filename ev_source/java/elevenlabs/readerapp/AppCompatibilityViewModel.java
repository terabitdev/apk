package io.elevenlabs.readerapp;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.AppCompatibilityDialogService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.a1;
import ir.r;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/readerapp/AppCompatibilityViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/AppCompatibilityState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AppCompatibilityDialogService;", "dialogService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AppCompatibilityDialogService;Lio/elevenlabs/domain/services/CustomerService;)V", "Lsn/z;", "dismiss", "()V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AppCompatibilityViewModel extends MviViewModel<AppCompatibilityState> {
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatibilityViewModel(DispatcherFactory dispatcherFactory, AppCheckTokenService appCheckTokenService, AppCompatibilityDialogService appCompatibilityDialogService, CustomerService customerService) {
        super(new AppCompatibilityState(false, false, false, 7, r5), dispatcherFactory, r3, 4, r5);
        dispatcherFactory.getClass();
        appCheckTokenService.getClass();
        appCompatibilityDialogService.getClass();
        customerService.getClass();
        kotlin.jvm.internal.f fVar = null;
        Logger logger = null;
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(customerService, appCheckTokenService, appCompatibilityDialogService, this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatibilityState dismiss$lambda$0(AppCompatibilityState appCompatibilityState) {
        appCompatibilityState.getClass();
        return new AppCompatibilityState(false, false, false, 7, null);
    }

    public final void dismiss() {
        queueStateUpdate(new d(1));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.AppCompatibilityViewModel$1", f = "AppCompatibilityViewModel.kt", l = {39}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.AppCompatibilityViewModel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        final /* synthetic */ AppCheckTokenService $appCheckTokenService;
        final /* synthetic */ CustomerService $customerService;
        final /* synthetic */ AppCompatibilityDialogService $dialogService;
        int label;
        final /* synthetic */ AppCompatibilityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CustomerService customerService, AppCheckTokenService appCheckTokenService, AppCompatibilityDialogService appCompatibilityDialogService, AppCompatibilityViewModel appCompatibilityViewModel, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$customerService = customerService;
            this.$appCheckTokenService = appCheckTokenService;
            this.$dialogService = appCompatibilityDialogService;
            this.this$0 = appCompatibilityViewModel;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$customerService, this.$appCheckTokenService, this.$dialogService, this.this$0, cVar);
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
                final a1 a1Var = new a1(this.$customerService.getCustomerOrNull(), 0);
                final ir.i o6 = r.o(new ir.i() { // from class: io.elevenlabs.readerapp.AppCompatibilityViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.AppCompatibilityViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.AppCompatibilityViewModel$1$invokeSuspend$$inlined$map$1$2", f = "AppCompatibilityViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.AppCompatibilityViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        Boolean valueOf = Boolean.valueOf(((Customer) obj).isFreeUser());
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
                });
                ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.AppCompatibilityViewModel$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.AppCompatibilityViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.AppCompatibilityViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "AppCompatibilityViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.AppCompatibilityViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                        if (((Boolean) obj).booleanValue()) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(obj, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$appCheckTokenService, this.$dialogService, this.this$0);
                this.label = 1;
                Object collect = iVar.collect(anonymousClass3, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.AppCompatibilityViewModel$1$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3<T> implements ir.j {
            final /* synthetic */ AppCheckTokenService $appCheckTokenService;
            final /* synthetic */ AppCompatibilityDialogService $dialogService;
            final /* synthetic */ AppCompatibilityViewModel this$0;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.AppCompatibilityViewModel$1$3$WhenMappings */
            /* loaded from: classes3.dex */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AppCompatibilityDialogService.Reason.values().length];
                    try {
                        iArr[AppCompatibilityDialogService.Reason.NO_PLAY_SERVICES.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AppCompatibilityDialogService.Reason.NO_PLAY_STORE_INSTALLED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AppCompatibilityDialogService.Reason.NO_PLAY_STORE_ACCOUNT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public AnonymousClass3(AppCheckTokenService appCheckTokenService, AppCompatibilityDialogService appCompatibilityDialogService, AppCompatibilityViewModel appCompatibilityViewModel) {
                this.$appCheckTokenService = appCheckTokenService;
                this.$dialogService = appCompatibilityDialogService;
                this.this$0 = appCompatibilityViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AppCompatibilityState emit$lambda$0(AppCompatibilityDialogService.Reason reason, AppCompatibilityState appCompatibilityState) {
                appCompatibilityState.getClass();
                int i10 = WhenMappings.$EnumSwitchMapping$0[reason.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            return AppCompatibilityState.copy$default(appCompatibilityState, false, false, true, 3, null);
                        }
                        c6.p();
                        return null;
                    }
                    return AppCompatibilityState.copy$default(appCompatibilityState, false, true, false, 5, null);
                }
                return AppCompatibilityState.copy$default(appCompatibilityState, true, false, false, 6, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(boolean z6, wn.c<? super z> cVar) {
                AppCompatibilityViewModel$1$3$emit$1 appCompatibilityViewModel$1$3$emit$1;
                int i10;
                boolean c5;
                AppCompatibilityDialogService.Reason reason;
                if (cVar instanceof AppCompatibilityViewModel$1$3$emit$1) {
                    appCompatibilityViewModel$1$3$emit$1 = (AppCompatibilityViewModel$1$3$emit$1) cVar;
                    int i11 = appCompatibilityViewModel$1$3$emit$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        appCompatibilityViewModel$1$3$emit$1.label = i11 - Integer.MIN_VALUE;
                        Object obj = appCompatibilityViewModel$1$3$emit$1.result;
                        i10 = appCompatibilityViewModel$1$3$emit$1.label;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                sn.a.g(obj);
                            } else {
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            sn.a.g(obj);
                            AppCheckTokenService appCheckTokenService = this.$appCheckTokenService;
                            appCompatibilityViewModel$1$3$emit$1.Z$0 = z6;
                            appCompatibilityViewModel$1$3$emit$1.label = 1;
                            obj = appCheckTokenService.getAppCheckToken(appCompatibilityViewModel$1$3$emit$1);
                            xn.a aVar = xn.a.f37986a;
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                        AppCheckTokenService.Result result = (AppCheckTokenService.Result) obj;
                        c5 = m.c(result, AppCheckTokenService.Result.Error.NoPlayServices.INSTANCE);
                        z zVar = z.f31622a;
                        if (!c5) {
                            reason = AppCompatibilityDialogService.Reason.NO_PLAY_SERVICES;
                        } else if (m.c(result, AppCheckTokenService.Result.Error.NoPlayStoreInstalled.INSTANCE)) {
                            reason = AppCompatibilityDialogService.Reason.NO_PLAY_STORE_INSTALLED;
                        } else if (m.c(result, AppCheckTokenService.Result.Error.NoPlayStoreAccount.INSTANCE)) {
                            reason = AppCompatibilityDialogService.Reason.NO_PLAY_STORE_ACCOUNT;
                        } else {
                            if (!m.c(result, AppCheckTokenService.Result.Error.FatalError.INSTANCE) && !m.c(result, AppCheckTokenService.Result.Error.TemporalError.INSTANCE) && !(result instanceof AppCheckTokenService.Result.Success)) {
                                c6.p();
                                return null;
                            }
                            return zVar;
                        }
                        if (this.$dialogService.shouldShow(reason)) {
                            this.$dialogService.markShown(reason);
                            this.this$0.queueStateUpdate(new a(reason, 0));
                            return zVar;
                        }
                        return zVar;
                    }
                }
                appCompatibilityViewModel$1$3$emit$1 = new AppCompatibilityViewModel$1$3$emit$1(this, cVar);
                Object obj2 = appCompatibilityViewModel$1$3$emit$1.result;
                i10 = appCompatibilityViewModel$1$3$emit$1.label;
                if (i10 == 0) {
                }
                AppCheckTokenService.Result result2 = (AppCheckTokenService.Result) obj2;
                c5 = m.c(result2, AppCheckTokenService.Result.Error.NoPlayServices.INSTANCE);
                z zVar2 = z.f31622a;
                if (!c5) {
                }
                if (this.$dialogService.shouldShow(reason)) {
                }
                return zVar2;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit(((Boolean) obj).booleanValue(), (wn.c<? super z>) cVar);
            }
        }
    }
}
