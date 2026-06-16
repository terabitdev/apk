package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionViewModel$submit$1$1", f = "CreateCollectionSheet.kt", l = {119, 130}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class CreateCollectionViewModel$submit$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    final /* synthetic */ CreateCollectionState $this_queueStateUpdate;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CreateCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCollectionViewModel$submit$1$1(CreateCollectionViewModel createCollectionViewModel, CreateCollectionState createCollectionState, String str, wn.c<? super CreateCollectionViewModel$submit$1$1> cVar) {
        super(2, cVar);
        this.this$0 = createCollectionViewModel;
        this.$this_queueStateUpdate = createCollectionState;
        this.$readId = str;
    }

    public static final CreateCollectionState invokeSuspend$lambda$1(CollectionMeta collectionMeta, CreateCollectionState createCollectionState) {
        return CreateCollectionState.copy$default(createCollectionState, null, null, false, collectionMeta.getId(), 3, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new CreateCollectionViewModel$submit$1$1(this.this$0, this.$this_queueStateUpdate, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((CreateCollectionViewModel$submit$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        if (r10 == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r10 == r3) goto L52;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CollectionsService collectionsService;
        CollectionMeta collectionMeta;
        Object addReadToNewCollection;
        ToastService toastService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    collectionMeta = (CollectionMeta) this.L$1;
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new c0(collectionMeta, 2));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            collectionsService = this.this$0.collectionsService;
            String name = this.$this_queueStateUpdate.getName();
            CollectionMeta.Icon icon = this.$this_queueStateUpdate.getIcon();
            this.label = 1;
            obj = collectionsService.addCollection(name, icon, this);
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            toastService = this.this$0.toastService;
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
            this.this$0.queueStateUpdate(new o(8));
            return sn.z.f31622a;
        }
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            collectionMeta = (CollectionMeta) ((AsyncCallResult.Success) asyncCallResult).getData();
            if (this.$readId != null) {
                CreateCollectionViewModel createCollectionViewModel = this.this$0;
                String id2 = collectionMeta.getId();
                String title = collectionMeta.getTitle();
                String str = this.$readId;
                this.L$0 = null;
                this.L$1 = collectionMeta;
                this.label = 2;
                addReadToNewCollection = createCollectionViewModel.addReadToNewCollection(id2, title, str, this);
            }
            this.this$0.queueStateUpdate(new c0(collectionMeta, 2));
            return sn.z.f31622a;
        }
        c6.p();
        return null;
    }
}
