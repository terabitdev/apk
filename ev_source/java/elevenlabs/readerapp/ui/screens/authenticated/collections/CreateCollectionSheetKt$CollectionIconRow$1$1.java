package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.CollectionMeta;
import ir.m1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt$CollectionIconRow$1$1", f = "CreateCollectionSheet.kt", l = {390, 393}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class CreateCollectionSheetKt$CollectionIconRow$1$1 extends yn.i implements ho.p {
    final /* synthetic */ CollectionMeta.Icon $selected;
    final /* synthetic */ t1.z $state;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCollectionSheetKt$CollectionIconRow$1$1(t1.z zVar, CollectionMeta.Icon icon, wn.c<? super CreateCollectionSheetKt$CollectionIconRow$1$1> cVar) {
        super(2, cVar);
        this.$state = zVar;
        this.$selected = icon;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new CreateCollectionSheetKt$CollectionIconRow$1$1(this.$state, this.$selected, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((CreateCollectionSheetKt$CollectionIconRow$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (r8.j(r5.indexOf(r7.$selected), (r0 / 2) - r2, r7) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r8 == r4) goto L33;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            m1 K = u2.r.K(new l0(this.$state, 0));
            CreateCollectionSheetKt$CollectionIconRow$1$1$info$2 createCollectionSheetKt$CollectionIconRow$1$1$info$2 = new CreateCollectionSheetKt$CollectionIconRow$1$1$info$2(null);
            this.label = 1;
            obj = ir.r.t(K, createCollectionSheetKt$CollectionIconRow$1$1$info$2, this);
        }
        t1.q qVar = (t1.q) ((t1.o) obj);
        int i11 = ((t1.r) ((t1.j) tn.o.w0(qVar.f31820k))).q;
        int i12 = (qVar.f31821l + qVar.f31822m) / 2;
        t1.z zVar = this.$state;
        list = CreateCollectionSheetKt.IconRowOrder;
        this.L$0 = null;
        this.I$0 = i11;
        this.I$1 = i12;
        this.label = 2;
    }
}
