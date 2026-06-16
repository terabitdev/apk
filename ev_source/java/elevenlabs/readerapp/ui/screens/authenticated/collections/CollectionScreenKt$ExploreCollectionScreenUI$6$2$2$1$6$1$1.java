package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$6$1$1", f = "CollectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$6$1$1 extends yn.i implements ho.p {
    final /* synthetic */ ho.l $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$6$1$1(ho.l lVar, wn.c<? super CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$6$1$1> cVar) {
        super(2, cVar);
        this.$action = lVar;
    }

    public static /* synthetic */ sn.z d(CollectionViewModel collectionViewModel) {
        return invokeSuspend$lambda$0(collectionViewModel);
    }

    public static final sn.z invokeSuspend$lambda$0(CollectionViewModel collectionViewModel) {
        collectionViewModel.loadMore();
        return sn.z.f31622a;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$6$1$1(this.$action, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$6$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.$action.invoke(new o(5));
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
