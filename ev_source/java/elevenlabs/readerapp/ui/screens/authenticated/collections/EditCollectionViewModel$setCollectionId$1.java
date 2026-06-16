package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.services.CollectionsService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.EditCollectionViewModel$setCollectionId$1", f = "EditCollectionScreen.kt", l = {115, 115}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class EditCollectionViewModel$setCollectionId$1 extends yn.i implements ho.p {
    final /* synthetic */ String $collectionId;
    int label;
    final /* synthetic */ EditCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCollectionViewModel$setCollectionId$1(EditCollectionViewModel editCollectionViewModel, String str, wn.c<? super EditCollectionViewModel$setCollectionId$1> cVar) {
        super(2, cVar);
        this.this$0 = editCollectionViewModel;
        this.$collectionId = str;
    }

    public static final EditCollectionState invokeSuspend$lambda$0$0(CollectionMeta collectionMeta, String str, EditCollectionState editCollectionState) {
        String title = collectionMeta.getTitle();
        CollectionMeta.Icon icon = collectionMeta.getIcon();
        if (icon == null) {
            icon = editCollectionState.getIcon();
        }
        return EditCollectionState.copy$default(editCollectionState, str, icon, title, false, false, 24, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new EditCollectionViewModel$setCollectionId$1(this.this$0, this.$collectionId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((EditCollectionViewModel$setCollectionId$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r5 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r5 == r3) goto L36;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CollectionsService collectionsService;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    CollectionMeta collectionMeta = (CollectionMeta) obj;
                    if (collectionMeta != null) {
                        this.this$0.queueStateUpdate(new f0(collectionMeta, this.$collectionId, 1));
                    }
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            collectionsService = this.this$0.collectionsService;
            String str = this.$collectionId;
            this.label = 1;
            obj = collectionsService.getCollection(str, this);
        }
        this.label = 2;
        obj = ir.r.w((ir.i) obj, this);
    }
}
