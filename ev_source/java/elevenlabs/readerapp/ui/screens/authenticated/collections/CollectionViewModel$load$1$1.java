package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionData;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1", f = "CollectionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class CollectionViewModel$load$1$1 extends yn.i implements ho.p {
    final /* synthetic */ CollectionState $this_queueStateUpdate;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CollectionViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1$1", f = "CollectionViewModel.kt", l = {85, 85}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        final /* synthetic */ CollectionState $this_queueStateUpdate;
        int label;
        final /* synthetic */ CollectionViewModel this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1$1$1", f = "CollectionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/CollectionMeta;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/CollectionMeta;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1$1$1 */
        /* loaded from: classes4.dex */
        public static final class C00381 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CollectionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00381(CollectionViewModel collectionViewModel, wn.c<? super C00381> cVar) {
                super(2, cVar);
                this.this$0 = collectionViewModel;
            }

            public static final CollectionState invokeSuspend$lambda$0(CollectionMeta collectionMeta, CollectionState collectionState) {
                return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, collectionMeta, null, null, null, false, false, null, 32511, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                C00381 c00381 = new C00381(this.this$0, cVar);
                c00381.L$0 = obj;
                return c00381;
            }

            @Override // ho.p
            public final Object invoke(CollectionMeta collectionMeta, wn.c<? super sn.z> cVar) {
                return ((C00381) create(collectionMeta, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                CollectionMeta collectionMeta = (CollectionMeta) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new c0(collectionMeta, 0));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CollectionViewModel collectionViewModel, CollectionState collectionState, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = collectionViewModel;
            this.$this_queueStateUpdate = collectionState;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$this_queueStateUpdate, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (ir.r.l((ir.i) r6, r0, r5) == r3) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            if (r6 == r3) goto L33;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CollectionsService collectionsService;
            int i10 = this.label;
            xn.a aVar = xn.a.f37986a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                collectionsService = this.this$0.collectionsService;
                String collectionId = this.$this_queueStateUpdate.getCollectionId();
                this.label = 1;
                obj = collectionsService.getCollection(collectionId, this);
            }
            C00381 c00381 = new C00381(this.this$0, null);
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$load$1$1(CollectionViewModel collectionViewModel, CollectionState collectionState, wn.c<? super CollectionViewModel$load$1$1> cVar) {
        super(2, cVar);
        this.this$0 = collectionViewModel;
        this.$this_queueStateUpdate = collectionState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        CollectionViewModel$load$1$1 collectionViewModel$load$1$1 = new CollectionViewModel$load$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
        collectionViewModel$load$1$1.L$0 = obj;
        return collectionViewModel$load$1$1;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((CollectionViewModel$load$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        DispatcherFactory dispatcherFactory;
        DispatcherFactory dispatcherFactory2;
        fr.d0 d0Var = (fr.d0) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            dispatcherFactory = this.this$0.getDispatcherFactory();
            fr.g0.g(d0Var, dispatcherFactory.getDefault(), new AnonymousClass1(this.this$0, this.$this_queueStateUpdate, null), 2);
            dispatcherFactory2 = this.this$0.getDispatcherFactory();
            fr.g0.g(d0Var, dispatcherFactory2.getDefault(), new AnonymousClass2(this.this$0, this.$this_queueStateUpdate, null), 2);
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1$2", f = "CollectionViewModel.kt", l = {91, 92}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ CollectionState $this_queueStateUpdate;
        int label;
        final /* synthetic */ CollectionViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CollectionViewModel collectionViewModel, CollectionState collectionState, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = collectionViewModel;
            this.$this_queueStateUpdate = collectionState;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$this_queueStateUpdate, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (((ir.i) r6).collect(r0, r5) == r3) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r6 == r3) goto L33;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CollectionsService collectionsService;
            int i10 = this.label;
            xn.a aVar = xn.a.f37986a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                collectionsService = this.this$0.collectionsService;
                String collectionId = this.$this_queueStateUpdate.getCollectionId();
                String nextCursor = this.$this_queueStateUpdate.getNextCursor();
                this.label = 1;
                obj = collectionsService.observeCollectionData(collectionId, nextCursor, this);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 2;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1$2$1 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ CollectionViewModel this$0;

            public AnonymousClass1(CollectionViewModel collectionViewModel) {
                this.this$0 = collectionViewModel;
            }

            public static final CollectionState emit$lambda$0(CollectionViewModel collectionViewModel, AsyncCallResult asyncCallResult, CollectionState collectionState) {
                ResolveErrorMessageUseCase resolveErrorMessageUseCase;
                collectionState.getClass();
                resolveErrorMessageUseCase = collectionViewModel.resolveErrorMessageUseCase;
                return CollectionState.copy$default(collectionState, null, false, false, null, false, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, null, null, null, false, false, null, 32701, null);
            }

            public static final CollectionState emit$lambda$1(AsyncCallResult asyncCallResult, CollectionState collectionState) {
                collectionState.getClass();
                CollectionMeta meta = collectionState.getMeta();
                if (meta == null) {
                    meta = ((CollectionData) ((AsyncCallResult.Success) asyncCallResult).getData()).getMeta();
                }
                CollectionMeta collectionMeta = meta;
                AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                return CollectionState.copy$default(collectionState, null, false, false, null, ((CollectionData) success.getData()).getHasMore(), ((CollectionData) success.getData()).getNextCursor(), null, null, collectionMeta, null, ((CollectionData) success.getData()).getItems(), null, false, false, null, 31437, null);
            }

            public final Object emit(AsyncCallResult<CollectionData> asyncCallResult, wn.c<? super sn.z> cVar) {
                if (asyncCallResult instanceof AsyncCallResult.Error) {
                    CollectionViewModel collectionViewModel = this.this$0;
                    collectionViewModel.queueStateUpdate(new d0(collectionViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
                } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                    this.this$0.queueStateUpdate(new e0((AsyncCallResult.Success) asyncCallResult, 0));
                } else {
                    c6.p();
                    return null;
                }
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((AsyncCallResult<CollectionData>) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }
}
