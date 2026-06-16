package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt$SearchScreenUI$7$2$1$1", f = "SearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SearchScreenKt$SearchScreenUI$7$2$1$1 extends yn.i implements p {
    final /* synthetic */ ho.l $action;
    final /* synthetic */ s2 $hasReachedEnd$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchScreenKt$SearchScreenUI$7$2$1$1(ho.l lVar, s2 s2Var, wn.c<? super SearchScreenKt$SearchScreenUI$7$2$1$1> cVar) {
        super(2, cVar);
        this.$action = lVar;
        this.$hasReachedEnd$delegate = s2Var;
    }

    public static final z invokeSuspend$lambda$0(SearchViewModel searchViewModel) {
        searchViewModel.load();
        return z.f31622a;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SearchScreenKt$SearchScreenUI$7$2$1$1(this.$action, this.$hasReachedEnd$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SearchScreenKt$SearchScreenUI$7$2$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean SearchScreenUI$lambda$9$1$1;
        if (this.label == 0) {
            sn.a.g(obj);
            SearchScreenUI$lambda$9$1$1 = SearchScreenKt.SearchScreenUI$lambda$9$1$1(this.$hasReachedEnd$delegate);
            if (SearchScreenUI$lambda$9$1$1) {
                this.$action.invoke(new i(0));
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
