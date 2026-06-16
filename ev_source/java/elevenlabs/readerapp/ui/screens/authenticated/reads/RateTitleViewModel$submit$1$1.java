package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleViewModel$submit$1$1", f = "RateTitleSheet.kt", l = {73}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class RateTitleViewModel$submit$1$1 extends yn.i implements ho.p {
    final /* synthetic */ long $newRate;
    final /* synthetic */ RateTitleState $this_queueStateUpdate;
    int label;
    final /* synthetic */ RateTitleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateTitleViewModel$submit$1$1(RateTitleViewModel rateTitleViewModel, RateTitleState rateTitleState, long j4, wn.c<? super RateTitleViewModel$submit$1$1> cVar) {
        super(2, cVar);
        this.this$0 = rateTitleViewModel;
        this.$this_queueStateUpdate = rateTitleState;
        this.$newRate = j4;
    }

    public static /* synthetic */ RateTitleState d(RateTitleState rateTitleState) {
        return RateTitleState.copy$default(rateTitleState, null, null, false, false, 11, null);
    }

    public static /* synthetic */ RateTitleState h(RateTitleState rateTitleState) {
        return RateTitleState.copy$default(rateTitleState, null, null, false, true, 3, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RateTitleViewModel$submit$1$1(this.this$0, this.$this_queueStateUpdate, this.$newRate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RateTitleViewModel$submit$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsService readsService;
        ToastService toastService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
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
            String readId = this.$this_queueStateUpdate.getReadId();
            long j4 = this.$newRate;
            this.label = 1;
            obj = readsService.rateRead(readId, j4, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            toastService = this.this$0.toastService;
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new j(5));
        } else {
            c6.p();
            return null;
        }
        this.this$0.queueStateUpdate(new j(6));
        return sn.z.f31622a;
    }
}
