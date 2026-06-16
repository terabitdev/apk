package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionScreenKt$ExploreCollectionScreen$1$1", f = "ExploreCollectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ExploreCollectionScreenKt$ExploreCollectionScreen$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ ExploreCollectionViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreCollectionScreenKt$ExploreCollectionScreen$1$1(ExploreCollectionViewModel exploreCollectionViewModel, String str, wn.c<? super ExploreCollectionScreenKt$ExploreCollectionScreen$1$1> cVar) {
        super(2, cVar);
        this.$vm = exploreCollectionViewModel;
        this.$collectionId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ExploreCollectionScreenKt$ExploreCollectionScreen$1$1(this.$vm, this.$collectionId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ExploreCollectionScreenKt$ExploreCollectionScreen$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.$vm.init(this.$collectionId);
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
