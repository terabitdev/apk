package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.ReadsExploreService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$onExploreGenericItemClicked$1$1", f = "SearchViewModel.kt", l = {236}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SearchViewModel$onExploreGenericItemClicked$1$1 extends yn.i implements p {
    final /* synthetic */ String $deeplink;
    final /* synthetic */ SearchState $this_queueStateUpdate;
    int label;
    final /* synthetic */ SearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$onExploreGenericItemClicked$1$1(SearchViewModel searchViewModel, SearchState searchState, String str, wn.c<? super SearchViewModel$onExploreGenericItemClicked$1$1> cVar) {
        super(2, cVar);
        this.this$0 = searchViewModel;
        this.$this_queueStateUpdate = searchState;
        this.$deeplink = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SearchViewModel$onExploreGenericItemClicked$1$1(this.this$0, this.$this_queueStateUpdate, this.$deeplink, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SearchViewModel$onExploreGenericItemClicked$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsExploreService readsExploreService;
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
            readsExploreService = this.this$0.readsExploreService;
            String exploreSearchId = this.$this_queueStateUpdate.getExploreSearchId();
            String str = this.$deeplink;
            this.label = 1;
            Object postSearchItemClick = readsExploreService.postSearchItemClick(exploreSearchId, str, "generic", this);
            xn.a aVar = xn.a.f37986a;
            if (postSearchItemClick == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
