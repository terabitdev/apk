package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.InterestsQuestion;
import io.elevenlabs.domain.services.InterestsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsViewModel$submitInterests$1$1", f = "ManageContentInterestsViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ManageContentInterestsViewModel$submitInterests$1$1 extends yn.i implements ho.p {
    final /* synthetic */ InterestsQuestion $question;
    int label;
    final /* synthetic */ ManageContentInterestsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageContentInterestsViewModel$submitInterests$1$1(ManageContentInterestsViewModel manageContentInterestsViewModel, InterestsQuestion interestsQuestion, wn.c<? super ManageContentInterestsViewModel$submitInterests$1$1> cVar) {
        super(2, cVar);
        this.this$0 = manageContentInterestsViewModel;
        this.$question = interestsQuestion;
    }

    public static final ManageContentInterestsState invokeSuspend$lambda$1(ManageContentInterestsViewModel manageContentInterestsViewModel, AsyncCallResult asyncCallResult, ManageContentInterestsState manageContentInterestsState) {
        ToastService toastService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        toastService = manageContentInterestsViewModel.toastService;
        resolveErrorMessageUseCase = manageContentInterestsViewModel.resolveErrorMessage;
        ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
        return ManageContentInterestsState.copy$default(manageContentInterestsState, false, false, null, false, null, false, 61, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ManageContentInterestsViewModel$submitInterests$1$1(this.this$0, this.$question, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((ManageContentInterestsViewModel$submitInterests$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        InterestsService interestsService;
        Logger logger;
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
            interestsService = this.this$0.interestsService;
            InterestsQuestion interestsQuestion = this.$question;
            this.label = 1;
            obj = interestsService.saveInterests(interestsQuestion, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        logger = this.this$0.logger;
        logger.log(ManageContentInterestsViewModel.TAG, "Interest save request returned " + asyncCallResult);
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            ManageContentInterestsViewModel manageContentInterestsViewModel = this.this$0;
            manageContentInterestsViewModel.queueStateUpdate(new v(manageContentInterestsViewModel, (AsyncCallResult.Error) asyncCallResult, 1));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new j(3));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
