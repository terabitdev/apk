package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.models.UiAction;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationViewModel$onSaveClick$1$1", f = "PronunciationScreen.kt", l = {154, 156}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PronunciationViewModel$onSaveClick$1$1 extends yn.i implements ho.p {
    final /* synthetic */ PronunciationState $this_queueStateUpdate;
    int label;
    final /* synthetic */ PronunciationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationViewModel$onSaveClick$1$1(PronunciationState pronunciationState, PronunciationViewModel pronunciationViewModel, wn.c<? super PronunciationViewModel$onSaveClick$1$1> cVar) {
        super(2, cVar);
        this.$this_queueStateUpdate = pronunciationState;
        this.this$0 = pronunciationViewModel;
    }

    public static final PronunciationState invokeSuspend$lambda$0(PronunciationState pronunciationState) {
        return PronunciationState.copy$default(pronunciationState, null, null, null, null, false, false, new UiAction.Pending(z.f31622a), null, null, 431, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PronunciationViewModel$onSaveClick$1$1(this.$this_queueStateUpdate, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PronunciationViewModel$onSaveClick$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
    
        if (r11 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r11 == r3) goto L58;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AsyncCallResult asyncCallResult;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        Logger logger;
        ToastService toastService;
        Logger logger2;
        String str;
        ToastService toastService2;
        StringProvider stringProvider;
        StringProvider stringProvider2;
        int i10 = this.label;
        boolean z6 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    asyncCallResult = (AsyncCallResult) obj;
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                asyncCallResult = (AsyncCallResult) obj;
            }
        } else {
            sn.a.g(obj);
            String editingPronunciationId = this.$this_queueStateUpdate.getEditingPronunciationId();
            PronunciationViewModel pronunciationViewModel = this.this$0;
            xn.a aVar = xn.a.f37986a;
            if (editingPronunciationId != null) {
                PronunciationsService pronunciationsService = pronunciationViewModel.pronunciationsService;
                String editingPronunciationId2 = this.$this_queueStateUpdate.getEditingPronunciationId();
                String spokenText = this.$this_queueStateUpdate.getSpokenText();
                this.label = 1;
                obj = pronunciationsService.updatePronunciation(editingPronunciationId2, spokenText, this);
            } else {
                PronunciationsService pronunciationsService2 = pronunciationViewModel.pronunciationsService;
                String originalText = this.$this_queueStateUpdate.getOriginalText();
                String spokenText2 = this.$this_queueStateUpdate.getSpokenText();
                this.label = 2;
                obj = pronunciationsService2.createPronunciation(originalText, spokenText2, this);
            }
            return aVar;
        }
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            if (this.$this_queueStateUpdate.getEditingPronunciationId() == null) {
                z6 = false;
            }
            logger2 = this.this$0.logger;
            if (z6) {
                str = "updated";
            } else {
                str = "created";
            }
            logger2.log("PronunciationScreen", "Successfully " + str + " pronunciation");
            toastService2 = this.this$0.toastService;
            stringProvider = this.this$0.stringProvider;
            String string = stringProvider.getString(R.string.pronunciations_add_success_toast_title);
            stringProvider2 = this.this$0.stringProvider;
            toastService2.showToast(new ToastService.Toast.Action(string, stringProvider2.getString(R.string.pronunciations_add_success_toast_message), null, 4, null));
            this.this$0.queueStateUpdate(new m(0));
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            String invoke$default = ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null);
            logger = this.this$0.logger;
            ib.i.r("Pronunciation save failed: ", invoke$default, logger, "PronunciationScreen");
            toastService = this.this$0.toastService;
            ToastService.showToast$default(toastService, invoke$default, null, ToastService.ToastVariant.ERROR, 2, null);
            this.this$0.queueStateUpdate(new m(1));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
