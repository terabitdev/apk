package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$submit$1$1", f = "AddReadsToCollectionScreen.kt", l = {143}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AddReadsToCollectionViewModel$submit$1$1 extends yn.i implements ho.p {
    final /* synthetic */ AddReadsToCollectionState $this_queueStateUpdate;
    int label;
    final /* synthetic */ AddReadsToCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReadsToCollectionViewModel$submit$1$1(AddReadsToCollectionViewModel addReadsToCollectionViewModel, AddReadsToCollectionState addReadsToCollectionState, wn.c<? super AddReadsToCollectionViewModel$submit$1$1> cVar) {
        super(2, cVar);
        this.this$0 = addReadsToCollectionViewModel;
        this.$this_queueStateUpdate = addReadsToCollectionState;
    }

    public static final AddReadsToCollectionState invokeSuspend$lambda$1(AddReadsToCollectionState addReadsToCollectionState) {
        return AddReadsToCollectionState.copy$default(addReadsToCollectionState, null, null, null, false, null, false, addReadsToCollectionState.getCollectionId(), 0, null, false, 927, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AddReadsToCollectionViewModel$submit$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AddReadsToCollectionViewModel$submit$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        CollectionsService collectionsService;
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
            collectionsService = this.this$0.collectionsService;
            String collectionId = this.$this_queueStateUpdate.getCollectionId();
            Set<String> selectedItemsIds = this.$this_queueStateUpdate.getSelectedItemsIds();
            this.label = 1;
            obj = collectionsService.addReadsToCollection(collectionId, selectedItemsIds, this);
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
            this.this$0.queueStateUpdate(new o(1));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new o(2));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
