package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel$1$2$1", f = "GenFMLoadingScreen.kt", l = {92, 93}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class GenFMLoadingViewModel$1$2$1 extends yn.i implements ho.p {
    final /* synthetic */ fr.d0 $$this$launch;
    final /* synthetic */ String $readId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenFMLoadingViewModel$1$2$1(fr.d0 d0Var, String str, wn.c<? super GenFMLoadingViewModel$1$2$1> cVar) {
        super(2, cVar);
        this.$$this$launch = d0Var;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        GenFMLoadingViewModel$1$2$1 genFMLoadingViewModel$1$2$1 = new GenFMLoadingViewModel$1$2$1(this.$$this$launch, this.$readId, cVar);
        genFMLoadingViewModel$1$2$1.L$0 = obj;
        return genFMLoadingViewModel$1$2$1;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super sn.z> cVar) {
        return ((GenFMLoadingViewModel$1$2$1) create(jVar, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (fr.g0.n(r5, r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0.emit(r8, r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0046 -> B:11:0x001f). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                xq.a aVar2 = xq.b.f38124b;
                long n2 = xq.g.n(10, xq.d.SECONDS);
                this.L$0 = jVar;
                this.label = 2;
            }
        }
        sn.a.g(obj);
        if (fr.g0.y(this.$$this$launch)) {
            String str = this.$readId;
            this.L$0 = jVar;
            this.label = 1;
        } else {
            return sn.z.f31622a;
        }
    }
}
