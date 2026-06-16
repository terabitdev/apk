package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadsExploreSearchResults;
import io.elevenlabs.domain.model.SearchResult;
import io.elevenlabs.domain.model.SearchSection;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import sn.z;
import tn.o;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$loadExplore$1", f = "SearchViewModel.kt", l = {151, 160}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SearchViewModel$loadExplore$1 extends yn.i implements p {
    final /* synthetic */ SearchState $this_loadExplore;
    Object L$0;
    int label;
    final /* synthetic */ SearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$loadExplore$1(SearchViewModel searchViewModel, SearchState searchState, wn.c<? super SearchViewModel$loadExplore$1> cVar) {
        super(2, cVar);
        this.this$0 = searchViewModel;
        this.$this_loadExplore = searchState;
    }

    public static final SearchState invokeSuspend$lambda$0(SearchViewModel searchViewModel, AsyncCallResult asyncCallResult, SearchState searchState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = searchViewModel.resolveErrorMessageUseCase;
        return SearchState.copy$default(searchState, null, null, false, null, false, 0, false, null, null, false, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, null, 30655, null);
    }

    public static final SearchState invokeSuspend$lambda$2(AsyncCallResult asyncCallResult, Set set, SearchState searchState) {
        AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
        return SearchState.copy$default(searchState, null, null, false, null, false, 0, false, o.O0(((ReadsExploreSearchResults) success.getData()).getItems(), searchState.getExploreResults()), ((ReadsExploreSearchResults) success.getData()).getNextCursor(), ((ReadsExploreSearchResults) success.getData()).getHasMore(), ((ReadsExploreSearchResults) success.getData()).getSearchId(), null, kd.a.N(searchState.getExploreReadsInLibrary(), set), null, null, 26687, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SearchViewModel$loadExplore$1(this.this$0, this.$this_loadExplore, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SearchViewModel$loadExplore$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (r10 == r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003b, code lost:
    
        if (r10 == r3) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [tn.t] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadsExploreService readsExploreService;
        AsyncCallResult asyncCallResult;
        ReadsService readsService;
        String readId;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    asyncCallResult = (AsyncCallResult) this.L$0;
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new l(asyncCallResult, o.l1((Iterable) obj), 1));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            readsExploreService = this.this$0.readsExploreService;
            String query = this.$this_loadExplore.getQuery();
            String exploreCursor = this.$this_loadExplore.getExploreCursor();
            this.label = 1;
            obj = readsExploreService.search(query, exploreCursor, this);
        }
        asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            SearchViewModel searchViewModel = this.this$0;
            searchViewModel.queueStateUpdate(new l(searchViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
            return z.f31622a;
        }
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            readsService = this.this$0.readsService;
            List<SearchSection> items = ((ReadsExploreSearchResults) ((AsyncCallResult.Success) asyncCallResult).getData()).getItems();
            ArrayList arrayList = new ArrayList();
            for (SearchSection searchSection : items) {
                boolean z6 = searchSection instanceof SearchSection.Collection;
                ?? r72 = t.f33547a;
                if (!z6 && !(searchSection instanceof SearchSection.GenericItem)) {
                    if (searchSection instanceof SearchSection.GlobalRead) {
                        r72 = ig.f.H(((SearchSection.GlobalRead) searchSection).getRead().getReadId());
                    } else if (searchSection instanceof SearchSection.SearchList) {
                        List<SearchResult> searches = ((SearchSection.SearchList) searchSection).getSearches();
                        r72 = new ArrayList();
                        for (SearchResult searchResult : searches) {
                            if (searchResult instanceof SearchResult.Collection) {
                                readId = null;
                            } else if (searchResult instanceof SearchResult.GlobalRead) {
                                readId = ((SearchResult.GlobalRead) searchResult).getRead().getReadId();
                            } else {
                                c6.p();
                                return null;
                            }
                            if (readId != null) {
                                r72.add(readId);
                            }
                        }
                    } else {
                        c6.p();
                        return null;
                    }
                }
                o.g0(r72, arrayList);
            }
            this.L$0 = asyncCallResult;
            this.label = 2;
            obj = readsService.filterReadsInLibrary(arrayList, this);
        } else {
            c6.p();
            return null;
        }
    }
}
