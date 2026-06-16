package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadCreationStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/GenFMLoadingViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/GenFMLoadingState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "readsService", "Lio/elevenlabs/domain/services/ReadsService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "stringProvider", "Lio/elevenlabs/domain/StringProvider;", "logger", "Lio/elevenlabs/domain/Logger;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/Logger;)V", ParameterNames.TAG, "", "setReadId", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "readId", "retry", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GenFMLoadingViewModel extends MviViewModel<GenFMLoadingState> {
    public static final int $stable = 8;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1", f = "GenFMLoadingScreen.kt", l = {97}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        final /* synthetic */ Logger $logger;
        final /* synthetic */ StringProvider $stringProvider;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1$3", f = "GenFMLoadingScreen.kt", l = {99}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "readId", "Lsn/z;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            final /* synthetic */ Logger $logger;
            final /* synthetic */ StringProvider $stringProvider;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GenFMLoadingViewModel this$0;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1$3$WhenMappings */
            /* loaded from: classes4.dex */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ReadCreationStatus.values().length];
                    try {
                        iArr[ReadCreationStatus.Pending.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ReadCreationStatus.Creating.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ReadCreationStatus.Finished.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ReadCreationStatus.Failed.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Logger logger, GenFMLoadingViewModel genFMLoadingViewModel, StringProvider stringProvider, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.$logger = logger;
                this.this$0 = genFMLoadingViewModel;
                this.$stringProvider = stringProvider;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final GenFMLoadingState invokeSuspend$lambda$0(GenFMLoadingViewModel genFMLoadingViewModel, AsyncCallResult asyncCallResult, GenFMLoadingState genFMLoadingState) {
                return GenFMLoadingState.copy$default(genFMLoadingState, null, false, false, ResolveErrorMessageUseCase.invoke$default(genFMLoadingViewModel.resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), false, 23, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final GenFMLoadingState invokeSuspend$lambda$1(Logger logger, GenFMLoadingViewModel genFMLoadingViewModel, AsyncCallResult asyncCallResult, StringProvider stringProvider, GenFMLoadingState genFMLoadingState) {
                int i10;
                AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                logger.log(genFMLoadingViewModel.tag, "creation status / " + ((ReadMeta) success.getData()).getCreationStatus());
                ReadCreationStatus creationStatus = ((ReadMeta) success.getData()).getCreationStatus();
                if (creationStatus == null) {
                    i10 = -1;
                } else {
                    i10 = WhenMappings.$EnumSwitchMapping$0[creationStatus.ordinal()];
                }
                if (i10 != -1 && i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return GenFMLoadingState.copy$default(genFMLoadingState, null, false, false, stringProvider.getString(R.string.genfm_read_row_podcast_failed_description), false, 23, null);
                        }
                        c6.p();
                        return null;
                    }
                    return GenFMLoadingState.copy$default(genFMLoadingState, null, true, false, "", false, 21, null);
                }
                return GenFMLoadingState.copy$default(genFMLoadingState, null, false, false, "", false, 23, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$logger, this.this$0, this.$stringProvider, cVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // ho.p
            public final Object invoke(String str, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass3) create(str, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.L$0;
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
                    ib.i.r("refreshRead / ", str, this.$logger, this.this$0.tag);
                    ReadsService readsService = this.this$0.readsService;
                    this.L$0 = null;
                    this.label = 1;
                    obj = readsService.refreshRead(str, true, this);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                if (asyncCallResult instanceof AsyncCallResult.Error) {
                    GenFMLoadingViewModel genFMLoadingViewModel = this.this$0;
                    genFMLoadingViewModel.queueStateUpdate(new s(genFMLoadingViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
                } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                    final GenFMLoadingViewModel genFMLoadingViewModel2 = this.this$0;
                    final Logger logger = this.$logger;
                    final StringProvider stringProvider = this.$stringProvider;
                    final AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                    genFMLoadingViewModel2.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.t
                        @Override // ho.l
                        public final Object invoke(Object obj2) {
                            GenFMLoadingState invokeSuspend$lambda$1;
                            invokeSuspend$lambda$1 = GenFMLoadingViewModel.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$1(Logger.this, genFMLoadingViewModel2, success, stringProvider, (GenFMLoadingState) obj2);
                            return invokeSuspend$lambda$1;
                        }
                    });
                } else {
                    c6.p();
                    return null;
                }
                return sn.z.f31622a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Logger logger, StringProvider stringProvider, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$logger = logger;
            this.$stringProvider = stringProvider;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$logger, this.$stringProvider, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            fr.d0 d0Var = (fr.d0) this.L$0;
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
                final z1 stateFlow = GenFMLoadingViewModel.this.getStateFlow();
                jr.j G = ir.r.G(ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "GenFMLoadingScreen.kt", l = {52}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
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

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
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
                                        String readId = ((GenFMLoadingState) obj).getReadId();
                                        if (readId != null) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(readId, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                }), new GenFMLoadingViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, d0Var));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$logger, GenFMLoadingViewModel.this, this.$stringProvider, null);
                this.L$0 = null;
                this.label = 1;
                Object l4 = ir.r.l(G, anonymousClass3, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GenFMLoadingViewModel(DispatcherFactory dispatcherFactory, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, StringProvider stringProvider, Logger logger) {
        super(new GenFMLoadingState(null, false, false, null, false, 31, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        readsService.getClass();
        resolveErrorMessageUseCase.getClass();
        stringProvider.getClass();
        logger.getClass();
        Logger logger2 = null;
        this.readsService = readsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.tag = "GenFMLoadingViewModel";
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(logger, stringProvider, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenFMLoadingState retry$lambda$0(GenFMLoadingViewModel genFMLoadingViewModel, GenFMLoadingState genFMLoadingState) {
        genFMLoadingState.getClass();
        if (genFMLoadingState.getRetryLoading() || genFMLoadingState.getReadId() == null) {
            return genFMLoadingState;
        }
        fr.g0.D(c1.h(genFMLoadingViewModel), genFMLoadingViewModel.getDispatcherFactory().getDefault(), null, new GenFMLoadingViewModel$retry$1$1(genFMLoadingViewModel, genFMLoadingState, null), 2);
        return GenFMLoadingState.copy$default(genFMLoadingState, null, false, false, null, true, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenFMLoadingState setReadId$lambda$0(String str, GenFMLoadingState genFMLoadingState) {
        genFMLoadingState.getClass();
        return GenFMLoadingState.copy$default(genFMLoadingState, str, false, false, null, false, 30, null);
    }

    public final MviViewModel.StateUpdate retry() {
        return queueStateUpdate(new o(this, 1));
    }

    public final MviViewModel.StateUpdate setReadId(String readId) {
        readId.getClass();
        return queueStateUpdate(new r(readId, 0));
    }
}
