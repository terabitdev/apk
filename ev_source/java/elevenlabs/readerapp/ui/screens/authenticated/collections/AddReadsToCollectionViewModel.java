package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import androidx.lifecycle.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.k1;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.z1;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0015J\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadsToCollectionViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadsToCollectionState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionsService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/CollectionsService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ToastService;)V", "", FirebaseAnalytics.Event.SEARCH, "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setQuery", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "readId", "toggleRead", "submit", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "collectionId", "setCollectionId", "loadNextPage", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/CollectionsService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/ToastService;", "Lfr/k1;", "debounceJob", "Lfr/k1;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AddReadsToCollectionViewModel extends MviViewModel<AddReadsToCollectionState> {
    public static final int $stable = 8;
    private final CollectionsService collectionsService;
    private k1 debounceJob;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final ToastService toastService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$1", f = "AddReadsToCollectionScreen.kt", l = {92}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$1$1", f = "AddReadsToCollectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/SyncStatus;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/SyncStatus;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00351 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AddReadsToCollectionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00351(AddReadsToCollectionViewModel addReadsToCollectionViewModel, wn.c<? super C00351> cVar) {
                super(2, cVar);
                this.this$0 = addReadsToCollectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AddReadsToCollectionState invokeSuspend$lambda$0(SyncStatus syncStatus, AddReadsToCollectionState addReadsToCollectionState) {
                return AddReadsToCollectionState.copy$default(addReadsToCollectionState, null, syncStatus, null, false, null, false, null, 0, null, false, 1021, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                C00351 c00351 = new C00351(this.this$0, cVar);
                c00351.L$0 = obj;
                return c00351;
            }

            @Override // ho.p
            public final Object invoke(SyncStatus syncStatus, wn.c<? super sn.z> cVar) {
                return ((C00351) create(syncStatus, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                SyncStatus syncStatus = (SyncStatus) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new g(syncStatus, 1));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                ir.i sync = AddReadsToCollectionViewModel.this.readsService.sync();
                C00351 c00351 = new C00351(AddReadsToCollectionViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(sync, c00351, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2", f = "AddReadsToCollectionScreen.kt", l = {106}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2$3", f = "AddReadsToCollectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/elevenlabs/domain/model/ReadMeta;", "list", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AddReadsToCollectionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AddReadsToCollectionViewModel addReadsToCollectionViewModel, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.this$0 = addReadsToCollectionViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AddReadsToCollectionState invokeSuspend$lambda$0(List list, AddReadsToCollectionState addReadsToCollectionState) {
                boolean z6;
                if (list.size() >= addReadsToCollectionState.getLimit()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return AddReadsToCollectionState.copy$default(addReadsToCollectionState, null, null, list, z6, null, false, null, list.size() + 10, null, false, 371, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, cVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // ho.p
            public final Object invoke(List<ReadMeta> list, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass3) create(list, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new h(list, 1));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                final z1 stateFlow = AddReadsToCollectionViewModel.this.getStateFlow();
                jr.j G = ir.r.G(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$map$1$2", f = "AddReadsToCollectionScreen.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                        AddReadsToCollectionState addReadsToCollectionState = (AddReadsToCollectionState) obj;
                                        sn.k kVar = new sn.k(new Integer(addReadsToCollectionState.getLimit()), addReadsToCollectionState.getQuery());
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(kVar, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
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
                }, new AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(null, AddReadsToCollectionViewModel.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(AddReadsToCollectionViewModel.this, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReadsToCollectionViewModel(DispatcherFactory dispatcherFactory, ReadsService readsService, CollectionsService collectionsService, Logger logger, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService) {
        super(new AddReadsToCollectionState(null, null, null, false, null, false, null, 0, null, false, 1023, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        readsService.getClass();
        collectionsService.getClass();
        logger.getClass();
        resolveErrorMessageUseCase.getClass();
        toastService.getClass();
        this.readsService = readsService;
        this.collectionsService = collectionsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.toastService = toastService;
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
        fr.g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass2(null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadsToCollectionState loadNextPage$lambda$0(AddReadsToCollectionState addReadsToCollectionState) {
        addReadsToCollectionState.getClass();
        if (!addReadsToCollectionState.getHasMore() || addReadsToCollectionState.isLoading()) {
            return addReadsToCollectionState;
        }
        return AddReadsToCollectionState.copy$default(addReadsToCollectionState, null, null, null, false, null, false, null, addReadsToCollectionState.getLimit() + 10, null, true, 383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadsToCollectionState setCollectionId$lambda$0(String str, AddReadsToCollectionState addReadsToCollectionState) {
        addReadsToCollectionState.getClass();
        return AddReadsToCollectionState.copy$default(addReadsToCollectionState, str, null, null, false, null, false, null, 0, null, false, 1022, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadsToCollectionState setQuery$lambda$0(String str, AddReadsToCollectionViewModel addReadsToCollectionViewModel, AddReadsToCollectionState addReadsToCollectionState) {
        addReadsToCollectionState.getClass();
        if (kotlin.jvm.internal.m.c(str, addReadsToCollectionState.getQuery())) {
            return addReadsToCollectionState;
        }
        k1 k1Var = addReadsToCollectionViewModel.debounceJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        addReadsToCollectionViewModel.debounceJob = fr.g0.D(c1.h(addReadsToCollectionViewModel), addReadsToCollectionViewModel.getDispatcherFactory().getDefault(), null, new AddReadsToCollectionViewModel$setQuery$1$1(null), 2);
        return AddReadsToCollectionState.copy$default(addReadsToCollectionState, null, null, null, true, null, false, null, 10, str, true, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadsToCollectionState submit$lambda$0(AddReadsToCollectionViewModel addReadsToCollectionViewModel, AddReadsToCollectionState addReadsToCollectionState) {
        addReadsToCollectionState.getClass();
        if (addReadsToCollectionState.getCollectionId() == null || addReadsToCollectionState.isSubmitLoading()) {
            return addReadsToCollectionState;
        }
        fr.g0.D(c1.h(addReadsToCollectionViewModel), addReadsToCollectionViewModel.getDispatcherFactory().getDefault(), null, new AddReadsToCollectionViewModel$submit$1$1(addReadsToCollectionViewModel, addReadsToCollectionState, null), 2);
        return AddReadsToCollectionState.copy$default(addReadsToCollectionState, null, null, null, false, null, true, null, 0, null, false, 991, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddReadsToCollectionState toggleRead$lambda$0(String str, AddReadsToCollectionState addReadsToCollectionState) {
        LinkedHashSet O;
        addReadsToCollectionState.getClass();
        if (addReadsToCollectionState.getSelectedItemsIds().contains(str)) {
            O = kd.a.K(addReadsToCollectionState.getSelectedItemsIds(), str);
        } else {
            O = kd.a.O(addReadsToCollectionState.getSelectedItemsIds(), str);
        }
        return AddReadsToCollectionState.copy$default(addReadsToCollectionState, null, null, null, false, O, false, null, 0, null, false, 1007, null);
    }

    public final MviViewModel.StateUpdate loadNextPage() {
        return queueStateUpdate(new o(17));
    }

    public final MviViewModel.StateUpdate setCollectionId(String collectionId) {
        collectionId.getClass();
        return queueStateUpdate(new k(collectionId, 1));
    }

    public final MviViewModel.StateUpdate setQuery(String search) {
        search.getClass();
        return queueStateUpdate(new f0(search, this, 4));
    }

    public final MviViewModel.StateUpdate submit() {
        return queueStateUpdate(new l(this, 1));
    }

    public final MviViewModel.StateUpdate toggleRead(String readId) {
        readId.getClass();
        return queueStateUpdate(new k(readId, 2));
    }
}
