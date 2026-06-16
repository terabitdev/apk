package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadViewModel$load$1$1", f = "AddSharedReadScreen.kt", l = {66}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AddSharedReadViewModel$load$1$1 extends yn.i implements ho.p {
    final /* synthetic */ AddSharedReadState $this_queueStateUpdate;
    int label;
    final /* synthetic */ AddSharedReadViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddSharedReadViewModel$load$1$1(AddSharedReadViewModel addSharedReadViewModel, AddSharedReadState addSharedReadState, wn.c<? super AddSharedReadViewModel$load$1$1> cVar) {
        super(2, cVar);
        this.this$0 = addSharedReadViewModel;
        this.$this_queueStateUpdate = addSharedReadState;
    }

    public static /* synthetic */ AddSharedReadState i(AddSharedReadState addSharedReadState) {
        return AddSharedReadState.copy$default(addSharedReadState, false, null, null, null, null, 30, null);
    }

    public static final AddSharedReadState invokeSuspend$lambda$0(AddSharedReadViewModel addSharedReadViewModel, AsyncCallResult asyncCallResult, AddSharedReadState addSharedReadState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = addSharedReadViewModel.resolveErrorMessageUseCase;
        return AddSharedReadState.copy$default(addSharedReadState, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, null, 29, null);
    }

    public static final AddSharedReadState invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, AddSharedReadState addSharedReadState) {
        return AddSharedReadState.copy$default(addSharedReadState, false, null, null, null, ((ReadMeta) ((AsyncCallResult.Success) asyncCallResult).getData()).getReadId(), 15, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AddSharedReadViewModel$load$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AddSharedReadViewModel$load$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsService readsService;
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
            readsService = this.this$0.readsService;
            String ownerId = this.$this_queueStateUpdate.getOwnerId();
            String readId = this.$this_queueStateUpdate.getReadId();
            this.label = 1;
            obj = readsService.addSharedRead(ownerId, readId, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            AddSharedReadViewModel addSharedReadViewModel = this.this$0;
            addSharedReadViewModel.queueStateUpdate(new h(addSharedReadViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new i((AsyncCallResult.Success) asyncCallResult, 0));
        } else {
            c6.p();
            return null;
        }
        this.this$0.queueStateUpdate(new j(0));
        return sn.z.f31622a;
    }
}
