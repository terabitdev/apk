package io.elevenlabs.ui.extensions;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.l;
import ho.p;
import ir.j;
import ir.z1;
import kotlin.Metadata;
import sn.z;
import u2.o1;
import u2.p1;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ui.extensions.ComposeExtensionsKt$selectAsState$1$1", f = "ComposeExtensions.kt", l = {163}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.R, "Lu2/o1;", "Lsn/z;", "<anonymous>", "(Lu2/o1;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ComposeExtensionsKt$selectAsState$1$1 extends i implements p {
    final /* synthetic */ l $selector;
    final /* synthetic */ z1 $this_selectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeExtensionsKt$selectAsState$1$1(z1 z1Var, l lVar, wn.c<? super ComposeExtensionsKt$selectAsState$1$1> cVar) {
        super(2, cVar);
        this.$this_selectAsState = z1Var;
        this.$selector = lVar;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ComposeExtensionsKt$selectAsState$1$1 composeExtensionsKt$selectAsState$1$1 = new ComposeExtensionsKt$selectAsState$1$1(this.$this_selectAsState, this.$selector, cVar);
        composeExtensionsKt$selectAsState$1$1.L$0 = obj;
        return composeExtensionsKt$selectAsState$1$1;
    }

    @Override // ho.p
    public final Object invoke(o1 o1Var, wn.c<? super z> cVar) {
        return ((ComposeExtensionsKt$selectAsState$1$1) create(o1Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        final o1 o1Var = (o1) this.L$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            z1 z1Var = this.$this_selectAsState;
            final l lVar = this.$selector;
            j jVar = new j() { // from class: io.elevenlabs.ui.extensions.ComposeExtensionsKt$selectAsState$1$1.1
                @Override // ir.j
                public final Object emit(T t10, wn.c<? super z> cVar) {
                    ((p1) o1.this).setValue(lVar.invoke(t10));
                    return z.f31622a;
                }
            };
            this.L$0 = null;
            this.label = 1;
            Object collect = z1Var.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        c6.u();
        return null;
    }
}
