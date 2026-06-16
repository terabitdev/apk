package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$onDeletePronunciation$1", f = "PronunciationsListScreen.kt", l = {136}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PronunciationsListViewModel$onDeletePronunciation$1 extends yn.i implements ho.p {
    final /* synthetic */ Pronunciation $pronunciation;
    int label;
    final /* synthetic */ PronunciationsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationsListViewModel$onDeletePronunciation$1(PronunciationsListViewModel pronunciationsListViewModel, Pronunciation pronunciation, wn.c<? super PronunciationsListViewModel$onDeletePronunciation$1> cVar) {
        super(2, cVar);
        this.this$0 = pronunciationsListViewModel;
        this.$pronunciation = pronunciation;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PronunciationsListViewModel$onDeletePronunciation$1(this.this$0, this.$pronunciation, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PronunciationsListViewModel$onDeletePronunciation$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        Logger logger;
        ToastService toastService;
        Logger logger2;
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
            PronunciationsService pronunciationsService = this.this$0.pronunciationsService;
            String id2 = this.$pronunciation.getId();
            this.label = 1;
            obj = pronunciationsService.deletePronunciation(id2, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            logger2 = this.this$0.logger;
            logger2.log("PronunciationsListScreen", "Successfully deleted pronunciation");
            this.this$0.observePronunciations();
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            String invoke$default = ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null);
            logger = this.this$0.logger;
            ib.i.r("Failed to delete pronunciation: ", invoke$default, logger, "PronunciationsListScreen");
            toastService = this.this$0.toastService;
            ToastService.showToast$default(toastService, invoke$default, null, ToastService.ToastVariant.ERROR, 2, null);
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
