package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionDetailsWithFirstPage;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.services.ExploreCollectionsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$loadCollectionDetails$1", f = "ExploreCollectionViewModel.kt", l = {109, 110}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ExploreCollectionViewModel$loadCollectionDetails$1 extends yn.i implements ho.p {
    final /* synthetic */ String $collectionId;
    int label;
    final /* synthetic */ ExploreCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreCollectionViewModel$loadCollectionDetails$1(ExploreCollectionViewModel exploreCollectionViewModel, String str, wn.c<? super ExploreCollectionViewModel$loadCollectionDetails$1> cVar) {
        super(2, cVar);
        this.this$0 = exploreCollectionViewModel;
        this.$collectionId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ExploreCollectionViewModel$loadCollectionDetails$1(this.this$0, this.$collectionId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ExploreCollectionViewModel$loadCollectionDetails$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (((ir.i) r6).collect(r0, r5) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r6 == r3) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ExploreCollectionsService exploreCollectionsService;
        String str;
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
            exploreCollectionsService = this.this$0.exploreCollectionsService;
            String str2 = this.$collectionId;
            str = this.this$0.language;
            this.label = 1;
            obj = exploreCollectionsService.getCollectionDetails(str2, str, this);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$collectionId);
        this.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$loadCollectionDetails$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ String $collectionId;
        final /* synthetic */ ExploreCollectionViewModel this$0;

        public AnonymousClass1(ExploreCollectionViewModel exploreCollectionViewModel, String str) {
            this.this$0 = exploreCollectionViewModel;
            this.$collectionId = str;
        }

        public static final ExploreCollectionState emit$lambda$0(CollectionDetailsWithFirstPage collectionDetailsWithFirstPage, ExploreCollectionState exploreCollectionState) {
            exploreCollectionState.getClass();
            return ExploreCollectionState.copy$default(exploreCollectionState, null, collectionDetailsWithFirstPage.getDetails(), false, null, null, null, null, null, 241, null);
        }

        public static final ExploreCollectionState emit$lambda$1(String str, ExploreCollectionState exploreCollectionState) {
            exploreCollectionState.getClass();
            return ExploreCollectionState.copy$default(exploreCollectionState, null, null, false, str, null, null, null, null, 241, null);
        }

        public final Object emit(AsyncCallResult<CollectionDetailsWithFirstPage> asyncCallResult, wn.c<? super sn.z> cVar) {
            ResolveErrorMessageUseCase resolveErrorMessageUseCase;
            ir.i iVar;
            String str = null;
            if (asyncCallResult instanceof AsyncCallResult.Success) {
                CollectionDetailsWithFirstPage collectionDetailsWithFirstPage = (CollectionDetailsWithFirstPage) ((AsyncCallResult.Success) asyncCallResult).getData();
                this.this$0.queueStateUpdate(new l0(collectionDetailsWithFirstPage, 1));
                this.this$0.fetchPricesFromItems(collectionDetailsWithFirstPage.getItems());
                iVar = this.this$0._itemsPagingData;
                if (iVar == null) {
                    ExploreCollectionViewModel exploreCollectionViewModel = this.this$0;
                    String str2 = this.$collectionId;
                    List<ExploreRead> items = collectionDetailsWithFirstPage.getItems();
                    if (collectionDetailsWithFirstPage.getHasMore()) {
                        str = collectionDetailsWithFirstPage.getNextCursor();
                    }
                    exploreCollectionViewModel.initItemsPagingData(str2, items, str);
                }
            } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
                this.this$0.queueStateUpdate(new k0(ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), 1));
            } else {
                c6.p();
                return null;
            }
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AsyncCallResult<CollectionDetailsWithFirstPage>) obj, (wn.c<? super sn.z>) cVar);
        }
    }
}
