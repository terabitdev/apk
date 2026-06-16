package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$onClickAddFullCollectionToQueue$1$1", f = "CollectionViewModel.kt", l = {285, 316}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class CollectionViewModel$onClickAddFullCollectionToQueue$1$1 extends yn.i implements ho.p {
    final /* synthetic */ CollectionState $this_queueStateUpdate;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$onClickAddFullCollectionToQueue$1$1(CollectionState collectionState, CollectionViewModel collectionViewModel, wn.c<? super CollectionViewModel$onClickAddFullCollectionToQueue$1$1> cVar) {
        super(2, cVar);
        this.$this_queueStateUpdate = collectionState;
        this.this$0 = collectionViewModel;
    }

    public static final CollectionState invokeSuspend$lambda$0(CollectionViewModel collectionViewModel, AsyncCallResult asyncCallResult, CollectionState collectionState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = collectionViewModel.resolveErrorMessageUseCase;
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, null, null, false, false, null, 32635, null);
    }

    public static final CollectionState invokeSuspend$lambda$1(List list, CollectionState collectionState) {
        return CollectionState.copy$default(collectionState, null, false, false, null, false, null, null, null, null, null, list, null, false, false, null, 31691, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new CollectionViewModel$onClickAddFullCollectionToQueue$1$1(this.$this_queueStateUpdate, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((CollectionViewModel$onClickAddFullCollectionToQueue$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e5, code lost:
    
        if (r1.addUniqueToQueue(r0, r14) == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e7, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r15 == r5) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:12:0x0076). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        List<ReadMeta> list;
        String nextCursor;
        int i11;
        CollectionsService collectionsService;
        List<ReadMeta> list2;
        ToastService toastService;
        StringProvider stringProvider;
        ToastService toastService2;
        StringProvider stringProvider2;
        Analytics analytics;
        int i12 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    list2 = (List) this.L$0;
                    sn.a.g(obj);
                    toastService2 = this.this$0.toastService;
                    stringProvider2 = this.this$0.stringProvider;
                    ToastService.showToast$default(toastService2, stringProvider2.getString(R.string.player_queue_result_toast_added_to_queue), null, ToastService.ToastVariant.SUCCESS, 2, null);
                    analytics = this.this$0.analytics;
                    analytics.log(new Analytics.Event.PlayerAddToQueueClicked(Analytics.Event.PlayerAddToQueueClicked.Source.CollectionDetailsMoreActions, null, this.$this_queueStateUpdate.getCollectionId()));
                    this.this$0.queueStateUpdate(new h(list2, 3));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = this.I$0;
            list = (List) this.L$0;
            sn.a.g(obj);
            i11 = i13;
            AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                toastService = this.this$0.toastService;
                stringProvider = this.this$0.stringProvider;
                ToastService.showToast$default(toastService, stringProvider.getString(R.string.error_unknown_error), null, ToastService.ToastVariant.ERROR, 2, null);
                CollectionViewModel collectionViewModel = this.this$0;
                collectionViewModel.queueStateUpdate(new d0(collectionViewModel, (AsyncCallResult.Error) asyncCallResult, 2));
                int i14 = i11;
                list2 = list;
                PlayerService playerService = this.this$0.playerService;
                this.L$0 = list2;
                this.L$1 = null;
                this.I$0 = i14;
                this.label = 2;
            } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                list.addAll(((CollectionData) success.getData()).getItems());
                boolean hasMore = ((CollectionData) success.getData()).getHasMore();
                nextCursor = ((CollectionData) success.getData()).getNextCursor();
                i11 = hasMore;
                if (i11 != 0) {
                    collectionsService = this.this$0.collectionsService;
                    String collectionId = this.$this_queueStateUpdate.getCollectionId();
                    this.L$0 = list;
                    this.L$1 = null;
                    this.I$0 = i11;
                    this.label = 1;
                    obj = collectionsService.getCollectionDataAndCacheReads(collectionId, nextCursor, false, this);
                    i11 = i11;
                }
                int i142 = i11;
                list2 = list;
                PlayerService playerService2 = this.this$0.playerService;
                this.L$0 = list2;
                this.L$1 = null;
                this.I$0 = i142;
                this.label = 2;
            } else {
                c6.p();
                return null;
            }
        } else {
            sn.a.g(obj);
            ArrayList i15 = tn.o.i1(this.$this_queueStateUpdate.getNetworkReads());
            if (this.$this_queueStateUpdate.getHasMore() && this.$this_queueStateUpdate.getNextCursor() != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            list = i15;
            nextCursor = this.$this_queueStateUpdate.getNextCursor();
            i11 = i10;
            if (i11 != 0) {
            }
            int i1422 = i11;
            list2 = list;
            PlayerService playerService22 = this.this$0.playerService;
            this.L$0 = list2;
            this.L$1 = null;
            this.I$0 = i1422;
            this.label = 2;
        }
    }
}
