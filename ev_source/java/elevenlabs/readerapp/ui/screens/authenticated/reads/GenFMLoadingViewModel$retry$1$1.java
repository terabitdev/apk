package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$retry$1$1", f = "GenFMLoadingScreen.kt", l = {132}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class GenFMLoadingViewModel$retry$1$1 extends yn.i implements ho.p {
    final /* synthetic */ GenFMLoadingState $this_queueStateUpdate;
    int label;
    final /* synthetic */ GenFMLoadingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenFMLoadingViewModel$retry$1$1(GenFMLoadingViewModel genFMLoadingViewModel, GenFMLoadingState genFMLoadingState, wn.c<? super GenFMLoadingViewModel$retry$1$1> cVar) {
        super(2, cVar);
        this.this$0 = genFMLoadingViewModel;
        this.$this_queueStateUpdate = genFMLoadingState;
    }

    public static final GenFMLoadingState invokeSuspend$lambda$0(GenFMLoadingViewModel genFMLoadingViewModel, AsyncCallResult asyncCallResult, GenFMLoadingState genFMLoadingState) {
        return GenFMLoadingState.copy$default(genFMLoadingState, null, false, false, ResolveErrorMessageUseCase.invoke$default(genFMLoadingViewModel.resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), false, 7, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new GenFMLoadingViewModel$retry$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((GenFMLoadingViewModel$retry$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            ReadsService readsService = this.this$0.readsService;
            String readId = this.$this_queueStateUpdate.getReadId();
            this.label = 1;
            obj = readsService.retryPodcast(readId, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            GenFMLoadingViewModel genFMLoadingViewModel = this.this$0;
            genFMLoadingViewModel.queueStateUpdate(new s(genFMLoadingViewModel, (AsyncCallResult.Error) asyncCallResult, 1));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new j(2));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
