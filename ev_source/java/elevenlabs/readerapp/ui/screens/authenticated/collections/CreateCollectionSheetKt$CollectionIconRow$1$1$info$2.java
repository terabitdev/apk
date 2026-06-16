package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt$CollectionIconRow$1$1$info$2", f = "CreateCollectionSheet.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt1/o;", "it", "", "<anonymous>", "(Lt1/o;)Z"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class CreateCollectionSheetKt$CollectionIconRow$1$1$info$2 extends yn.i implements ho.p {
    /* synthetic */ Object L$0;
    int label;

    public CreateCollectionSheetKt$CollectionIconRow$1$1$info$2(wn.c<? super CreateCollectionSheetKt$CollectionIconRow$1$1$info$2> cVar) {
        super(2, cVar);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        CreateCollectionSheetKt$CollectionIconRow$1$1$info$2 createCollectionSheetKt$CollectionIconRow$1$1$info$2 = new CreateCollectionSheetKt$CollectionIconRow$1$1$info$2(cVar);
        createCollectionSheetKt$CollectionIconRow$1$1$info$2.L$0 = obj;
        return createCollectionSheetKt$CollectionIconRow$1$1$info$2;
    }

    @Override // ho.p
    public final Object invoke(t1.o oVar, wn.c<? super Boolean> cVar) {
        return ((CreateCollectionSheetKt$CollectionIconRow$1$1$info$2) create(oVar, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Collection, java.lang.Object] */
    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        t1.o oVar = (t1.o) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            return Boolean.valueOf(!((t1.q) oVar).f31820k.isEmpty());
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
