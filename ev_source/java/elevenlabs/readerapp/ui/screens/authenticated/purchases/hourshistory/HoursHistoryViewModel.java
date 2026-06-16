package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import ho.p;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.ocr.t;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.c0;
import ir.j;
import ir.m0;
import ir.r;
import ir.z1;
import java.util.concurrent.CancellationException;
import jr.s;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/hourshistory/HoursHistoryViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/hourshistory/HoursHistoryState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "toggleExtraHoursExpanded", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "visible", "onVisibilityToggled", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "refresh", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lfr/k1;", "loadJob", "Lfr/k1;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HoursHistoryViewModel extends MviViewModel<HoursHistoryState> {
    public static final int $stable = 8;
    private final CustomerService customerService;
    private k1 loadJob;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HoursHistoryViewModel(DispatcherFactory dispatcherFactory, CustomerService customerService, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        super(new HoursHistoryState(false, null, null, false, false, 31, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        customerService.getClass();
        resolveErrorMessageUseCase.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.customerService = customerService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        refresh();
        launch(dispatcherFactory.getDefault(), new AnonymousClass1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HoursHistoryState onVisibilityToggled$lambda$0(boolean z6, HoursHistoryState hoursHistoryState) {
        hoursHistoryState.getClass();
        return HoursHistoryState.copy$default(hoursHistoryState, false, null, null, false, z6, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HoursHistoryState refresh$lambda$0(HoursHistoryViewModel hoursHistoryViewModel, HoursHistoryState hoursHistoryState) {
        hoursHistoryState.getClass();
        k1 k1Var = hoursHistoryViewModel.loadJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        hoursHistoryViewModel.launch(hoursHistoryViewModel.getDispatcherFactory().getDefault(), new HoursHistoryViewModel$refresh$1$1(hoursHistoryViewModel, null));
        hoursHistoryViewModel.loadJob = hoursHistoryViewModel.launch(hoursHistoryViewModel.getDispatcherFactory().getDefault(), new HoursHistoryViewModel$refresh$1$2(hoursHistoryViewModel, null));
        return HoursHistoryState.copy$default(hoursHistoryState, true, "", null, false, false, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HoursHistoryState toggleExtraHoursExpanded$lambda$0(HoursHistoryState hoursHistoryState) {
        hoursHistoryState.getClass();
        return HoursHistoryState.copy$default(hoursHistoryState, false, null, null, !hoursHistoryState.isExtraHoursExpanded(), false, 23, null);
    }

    public final MviViewModel.StateUpdate onVisibilityToggled(boolean visible) {
        return queueStateUpdate(new t(visible, 5));
    }

    public final MviViewModel.StateUpdate refresh() {
        return queueStateUpdate(new g(this, 1));
    }

    public final MviViewModel.StateUpdate toggleExtraHoursExpanded() {
        return queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(4));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1", f = "HoursHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$1", f = "HoursHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00451 extends yn.i implements p {
            int label;
            final /* synthetic */ HoursHistoryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00451(HoursHistoryViewModel hoursHistoryViewModel, wn.c<? super C00451> cVar) {
                super(2, cVar);
                this.this$0 = hoursHistoryViewModel;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                return new C00451(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
                return ((C00451) create(d0Var, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.customerService.sync();
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            d0 d0Var = (d0) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                g0.D(d0Var, null, null, new C00451(HoursHistoryViewModel.this, null), 3);
                g0.D(d0Var, null, null, new AnonymousClass2(HoursHistoryViewModel.this, null), 3);
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2", f = "HoursHistoryViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends yn.i implements p {
            int label;
            final /* synthetic */ HoursHistoryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HoursHistoryViewModel hoursHistoryViewModel, wn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = hoursHistoryViewModel;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass2(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
                return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                z zVar = z.f31622a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return zVar;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                final z1 stateFlow = this.this$0.getStateFlow();
                final c0 q = r.q(r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$invokeSuspend$$inlined$map$1$2", f = "HoursHistoryViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(j jVar) {
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
                                        j jVar = this.$this_unsafeFlow;
                                        Boolean valueOf = Boolean.valueOf(((HoursHistoryState) obj).isScreenVisible());
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
                    public Object collect(j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                }), 1);
                ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$invokeSuspend$$inlined$filter$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$invokeSuspend$$inlined$filter$1$2", f = "HoursHistoryViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(j jVar) {
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
                                        j jVar = this.$this_unsafeFlow;
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
                    public Object collect(j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                };
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 1;
                Object collect = iVar.collect(new m0(s.f19851a, anonymousClass3), this);
                xn.a aVar = xn.a.f37986a;
                if (collect != aVar) {
                    collect = zVar;
                }
                if (collect != aVar) {
                    collect = zVar;
                }
                if (collect == aVar) {
                    return aVar;
                }
                return zVar;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$3", f = "HoursHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lsn/z;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$1$2$3, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass3 extends yn.i implements p {
                int label;
                final /* synthetic */ HoursHistoryViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(HoursHistoryViewModel hoursHistoryViewModel, wn.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.this$0 = hoursHistoryViewModel;
                }

                @Override // yn.a
                public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                    return new AnonymousClass3(this.this$0, cVar);
                }

                public final Object invoke(boolean z6, wn.c<? super z> cVar) {
                    return ((AnonymousClass3) create(Boolean.valueOf(z6), cVar)).invokeSuspend(z.f31622a);
                }

                @Override // yn.a
                public final Object invokeSuspend(Object obj) {
                    if (this.label == 0) {
                        sn.a.g(obj);
                        this.this$0.refresh();
                        return z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }

                @Override // ho.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (wn.c<? super z>) obj2);
                }
            }
        }
    }
}
