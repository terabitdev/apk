package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadScreenKt$AddSharedReadScreen$1$1", f = "AddSharedReadScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AddSharedReadScreenKt$AddSharedReadScreen$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $ownerId;
    final /* synthetic */ String $readId;
    final /* synthetic */ AddSharedReadViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddSharedReadScreenKt$AddSharedReadScreen$1$1(AddSharedReadViewModel addSharedReadViewModel, String str, String str2, wn.c<? super AddSharedReadScreenKt$AddSharedReadScreen$1$1> cVar) {
        super(2, cVar);
        this.$vm = addSharedReadViewModel;
        this.$ownerId = str;
        this.$readId = str2;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AddSharedReadScreenKt$AddSharedReadScreen$1$1(this.$vm, this.$ownerId, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AddSharedReadScreenKt$AddSharedReadScreen$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.$vm.setOwnerAndRead(this.$ownerId, this.$readId);
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
