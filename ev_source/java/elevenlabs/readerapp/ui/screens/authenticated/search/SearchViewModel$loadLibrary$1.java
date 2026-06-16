package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$loadLibrary$1", f = "SearchViewModel.kt", l = {127, 127}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SearchViewModel$loadLibrary$1 extends yn.i implements p {
    final /* synthetic */ SearchState $this_loadLibrary;
    int label;
    final /* synthetic */ SearchViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$loadLibrary$1$1", f = "SearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/elevenlabs/domain/model/ReadMeta;", "result", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel$loadLibrary$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SearchViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchViewModel searchViewModel, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = searchViewModel;
        }

        public static final SearchState invokeSuspend$lambda$0(SearchViewModel searchViewModel, List list, SearchState searchState) {
            Logger logger;
            boolean z6;
            boolean z10;
            logger = searchViewModel.logger;
            if (list.size() >= searchState.getLibraryLimit()) {
                z6 = true;
            } else {
                z6 = false;
            }
            logger.log("SearchScreen", "Library has more: " + z6 + ", limit: " + (list.size() + 10));
            if (list.size() >= searchState.getLibraryLimit()) {
                z10 = true;
            } else {
                z10 = false;
            }
            return SearchState.copy$default(searchState, null, null, false, list, z10, list.size() + 10, false, null, null, false, null, null, null, null, null, 32707, null);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(List<ReadMeta> list, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(list, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                SearchViewModel searchViewModel = this.this$0;
                searchViewModel.queueStateUpdate(new l(searchViewModel, list, 2));
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$loadLibrary$1(SearchViewModel searchViewModel, SearchState searchState, wn.c<? super SearchViewModel$loadLibrary$1> cVar) {
        super(2, cVar);
        this.this$0 = searchViewModel;
        this.$this_loadLibrary = searchState;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SearchViewModel$loadLibrary$1(this.this$0, this.$this_loadLibrary, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SearchViewModel$loadLibrary$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (ir.r.l((ir.i) r6, r0, r5) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
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
        ReadsService readsService;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            readsService = this.this$0.readsService;
            String query = this.$this_loadLibrary.getQuery();
            int libraryLimit = this.$this_loadLibrary.getLibraryLimit();
            this.label = 1;
            obj = readsService.search(query, libraryLimit, this);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
    }
}
