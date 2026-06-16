package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel$toggle$1$1", f = "AddReadToCollectionScreen.kt", l = {116}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AddReadToCollectionViewModel$toggle$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ String $readId;
    final /* synthetic */ String $title;
    final /* synthetic */ boolean $wasAdded;
    int label;
    final /* synthetic */ AddReadToCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReadToCollectionViewModel$toggle$1$1(AddReadToCollectionViewModel addReadToCollectionViewModel, String str, String str2, String str3, boolean z6, wn.c<? super AddReadToCollectionViewModel$toggle$1$1> cVar) {
        super(2, cVar);
        this.this$0 = addReadToCollectionViewModel;
        this.$readId = str;
        this.$collectionId = str2;
        this.$title = str3;
        this.$wasAdded = z6;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AddReadToCollectionViewModel$toggle$1$1(this.this$0, this.$readId, this.$collectionId, this.$title, this.$wasAdded, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AddReadToCollectionViewModel$toggle$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object performToggle;
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
            AddReadToCollectionViewModel addReadToCollectionViewModel = this.this$0;
            String str = this.$readId;
            String str2 = this.$collectionId;
            String str3 = this.$title;
            boolean z6 = this.$wasAdded;
            this.label = 1;
            performToggle = addReadToCollectionViewModel.performToggle(str, str2, str3, z6, this);
            xn.a aVar = xn.a.f37986a;
            if (performToggle == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
