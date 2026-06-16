package io.elevenlabs.domain.services;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.l;
import ho.q;
import ir.h;
import ir.j;
import kotlin.Metadata;
import sn.z;
import wn.c;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.domain.services.ConnectivityServiceKt$whenConnected$$inlined$flatMapLatest$1", f = "ConnectivityService.kt", l = {190, 189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ConnectivityServiceKt$whenConnected$$inlined$flatMapLatest$1 extends i implements q {
    final /* synthetic */ l $operation$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityServiceKt$whenConnected$$inlined$flatMapLatest$1(c cVar, l lVar) {
        super(3, cVar);
        this.$operation$inlined = lVar;
    }

    public final Object invoke(j jVar, Boolean bool, c<? super z> cVar) {
        ConnectivityServiceKt$whenConnected$$inlined$flatMapLatest$1 connectivityServiceKt$whenConnected$$inlined$flatMapLatest$1 = new ConnectivityServiceKt$whenConnected$$inlined$flatMapLatest$1(cVar, this.$operation$inlined);
        connectivityServiceKt$whenConnected$$inlined$flatMapLatest$1.L$0 = jVar;
        connectivityServiceKt$whenConnected$$inlined$flatMapLatest$1.L$1 = bool;
        return connectivityServiceKt$whenConnected$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (ir.r.r(r0, (ir.i) r7, r6) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r7 == r4) goto L18;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar;
        int i10 = this.label;
        a aVar = a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = (j) this.L$2;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            jVar = (j) this.L$0;
            boolean booleanValue = ((Boolean) this.L$1).booleanValue();
            if (booleanValue) {
                l lVar = this.$operation$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = jVar;
                this.L$3 = null;
                this.Z$0 = booleanValue;
                this.I$0 = 0;
                this.label = 1;
                obj = lVar.invoke(this);
            } else {
                obj = h.f17943a;
            }
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((j) obj, (Boolean) obj2, (c<? super z>) obj3);
    }
}
