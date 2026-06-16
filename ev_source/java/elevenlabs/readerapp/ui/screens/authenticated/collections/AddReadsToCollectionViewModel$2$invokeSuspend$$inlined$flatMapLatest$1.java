package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1", f = "AddReadsToCollectionScreen.kt", l = {191, 193, 189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 extends yn.i implements ho.q {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AddReadsToCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(wn.c cVar, AddReadsToCollectionViewModel addReadsToCollectionViewModel) {
        super(3, cVar);
        this.this$0 = addReadsToCollectionViewModel;
    }

    public final Object invoke(ir.j jVar, sn.k kVar, wn.c<? super sn.z> cVar) {
        AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 = new AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(cVar, this.this$0);
        addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = kVar;
        return addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a8, code lost:
    
        if (ir.r.r(r0, (ir.i) r15, r14) == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r15 == r5) goto L21;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ir.j jVar;
        AddReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = (ir.j) this.L$2;
            sn.a.g(obj);
            addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 = this;
        } else {
            sn.a.g(obj);
            jVar = (ir.j) this.L$0;
            sn.k kVar = (sn.k) this.L$1;
            int intValue = ((Number) kVar.f31600a).intValue();
            String str = (String) kVar.f31601b;
            int length = str.length();
            AddReadsToCollectionViewModel addReadsToCollectionViewModel = this.this$0;
            if (length == 0) {
                ReadsService readsService = addReadsToCollectionViewModel.readsService;
                Boolean bool = Boolean.FALSE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = jVar;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 0;
                this.I$1 = intValue;
                this.label = 1;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 = this;
                obj = ReadsService.getReads$default(readsService, intValue, bool, null, addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1, 4, null);
            } else {
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 = this;
                ReadsService readsService2 = addReadsToCollectionViewModel.readsService;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = null;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = null;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$2 = jVar;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$3 = null;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$4 = null;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.I$0 = 0;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.I$1 = intValue;
                addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.label = 2;
                obj = readsService2.search(str, intValue, this);
            }
            return sn.z.f31622a;
        }
        addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = null;
        addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = null;
        addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$2 = null;
        addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$3 = null;
        addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$4 = null;
        addReadsToCollectionViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.label = 3;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ir.j) obj, (sn.k) obj2, (wn.c<? super sn.z>) obj3);
    }
}
