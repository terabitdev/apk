package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import com.google.protobuf.c6;
import fr.d0;
import java.util.Map;
import ka.j0;
import kotlin.Metadata;
import t1.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreScreenKt$ExploreScreenUI$6$1$1$1$1$1", f = "ExploreScreen.kt", l = {183}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ExploreScreenKt$ExploreScreenUI$6$1$1$1$1$1 extends yn.i implements ho.p {
    final /* synthetic */ z0 $lastFilters$delegate;
    final /* synthetic */ z $lazyListState;
    final /* synthetic */ ExploreState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreScreenKt$ExploreScreenUI$6$1$1$1$1$1(ExploreState exploreState, z zVar, z0 z0Var, wn.c<? super ExploreScreenKt$ExploreScreenUI$6$1$1$1$1$1> cVar) {
        super(2, cVar);
        this.$state = exploreState;
        this.$lazyListState = zVar;
        this.$lastFilters$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ExploreScreenKt$ExploreScreenUI$6$1$1$1$1$1(this.$state, this.$lazyListState, this.$lastFilters$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ExploreScreenKt$ExploreScreenUI$6$1$1$1$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Map ExploreScreenUI$lambda$5$0$0$0$11;
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
            ExploreScreenUI$lambda$5$0$0$0$11 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$11(this.$lastFilters$delegate);
            if (!kotlin.jvm.internal.m.c(ExploreScreenUI$lambda$5$0$0$0$11, this.$state.getActiveFilters())) {
                z zVar = this.$lazyListState;
                this.label = 1;
                j0 j0Var = z.f31871x;
                Object j4 = zVar.j(0, 0, this);
                xn.a aVar = xn.a.f37986a;
                if (j4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
        this.$lastFilters$delegate.setValue(this.$state.getActiveFilters());
        return sn.z.f31622a;
    }
}
