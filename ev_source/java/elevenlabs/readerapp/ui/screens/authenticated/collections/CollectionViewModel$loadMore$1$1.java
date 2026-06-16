package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionData;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$loadMore$1$1", f = "CollectionViewModel.kt", l = {122, 122, 127, 128}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class CollectionViewModel$loadMore$1$1 extends yn.i implements ho.p {
    final /* synthetic */ CollectionState $this_queueStateUpdate;
    Object L$0;
    int label;
    final /* synthetic */ CollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$loadMore$1$1(CollectionViewModel collectionViewModel, CollectionState collectionState, wn.c<? super CollectionViewModel$loadMore$1$1> cVar) {
        super(2, cVar);
        this.this$0 = collectionViewModel;
        this.$this_queueStateUpdate = collectionState;
    }

    public static final CollectionState invokeSuspend$lambda$0$0(CollectionMeta collectionMeta, CollectionState collectionState) {
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, collectionMeta, null, null, null, false, false, null, 32511, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new CollectionViewModel$loadMore$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((CollectionViewModel$loadMore$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (((ir.i) r7).collect(r2, r6) == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r7 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7 == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r7 == r5) goto L59;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CollectionsService collectionsService;
        List<ReadMeta> networkReads;
        CollectionsService collectionsService2;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            sn.a.g(obj);
                            return sn.z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    networkReads = (List) this.L$0;
                    sn.a.g(obj);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, networkReads);
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    sn.a.g(obj);
                    CollectionMeta collectionMeta = (CollectionMeta) obj;
                    if (collectionMeta != null) {
                        this.this$0.queueStateUpdate(new c0(collectionMeta, 1));
                    }
                    networkReads = this.$this_queueStateUpdate.getNetworkReads();
                    collectionsService2 = this.this$0.collectionsService;
                    String collectionId = this.$this_queueStateUpdate.getCollectionId();
                    String nextCursor = this.$this_queueStateUpdate.getNextCursor();
                    this.L$0 = networkReads;
                    this.label = 3;
                    obj = collectionsService2.observeCollectionData(collectionId, nextCursor, this);
                }
            } else {
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            collectionsService = this.this$0.collectionsService;
            String collectionId2 = this.$this_queueStateUpdate.getCollectionId();
            this.label = 1;
            obj = collectionsService.getCollection(collectionId2, this);
        }
        this.label = 2;
        obj = ir.r.u((ir.i) obj, this);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$loadMore$1$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2<T> implements ir.j {
        final /* synthetic */ List<ReadMeta> $previousReads;
        final /* synthetic */ CollectionViewModel this$0;

        public AnonymousClass2(CollectionViewModel collectionViewModel, List<ReadMeta> list) {
            this.this$0 = collectionViewModel;
            this.$previousReads = list;
        }

        public static final CollectionState emit$lambda$0(CollectionViewModel collectionViewModel, AsyncCallResult asyncCallResult, CollectionState collectionState) {
            ResolveErrorMessageUseCase resolveErrorMessageUseCase;
            collectionState.getClass();
            resolveErrorMessageUseCase = collectionViewModel.resolveErrorMessageUseCase;
            return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, null, null, false, false, null, 32635, null);
        }

        public static final CollectionState emit$lambda$1(List list, AsyncCallResult asyncCallResult, CollectionState collectionState) {
            collectionState.getClass();
            AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
            return CollectionState.copy$default(collectionState, null, false, false, null, ((CollectionData) success.getData()).getHasMore(), ((CollectionData) success.getData()).getNextCursor(), null, null, null, null, tn.o.O0(((CollectionData) success.getData()).getItems(), list), null, false, false, null, 31691, null);
        }

        public final Object emit(AsyncCallResult<CollectionData> asyncCallResult, wn.c<? super sn.z> cVar) {
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                CollectionViewModel collectionViewModel = this.this$0;
                collectionViewModel.queueStateUpdate(new d0(collectionViewModel, (AsyncCallResult.Error) asyncCallResult, 1));
            } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                this.this$0.queueStateUpdate(new f0(this.$previousReads, (AsyncCallResult.Success) asyncCallResult, 0));
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
