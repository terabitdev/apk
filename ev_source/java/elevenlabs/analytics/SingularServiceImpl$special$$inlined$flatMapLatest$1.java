package io.elevenlabs.analytics;

import a7.u;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.services.CustomerService;
import ir.j;
import ir.r;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.analytics.SingularServiceImpl$special$$inlined$flatMapLatest$1", f = "SingularServiceImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class SingularServiceImpl$special$$inlined$flatMapLatest$1 extends i implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SingularServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingularServiceImpl$special$$inlined$flatMapLatest$1(c cVar, SingularServiceImpl singularServiceImpl) {
        super(3, cVar);
        this.this$0 = singularServiceImpl;
    }

    public final Object invoke(j jVar, Boolean bool, c<? super z> cVar) {
        SingularServiceImpl$special$$inlined$flatMapLatest$1 singularServiceImpl$special$$inlined$flatMapLatest$1 = new SingularServiceImpl$special$$inlined$flatMapLatest$1(cVar, this.this$0);
        singularServiceImpl$special$$inlined$flatMapLatest$1.L$0 = jVar;
        singularServiceImpl$special$$inlined$flatMapLatest$1.L$1 = bool;
        return singularServiceImpl$special$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i uVar;
        CustomerService customerService;
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
            j jVar = (j) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                customerService = this.this$0.customerService;
                uVar = customerService.getCustomer();
            } else {
                uVar = new u(null, 3);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object r10 = r.r(jVar, uVar, this);
            xn.a aVar = xn.a.f37986a;
            if (r10 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((j) obj, (Boolean) obj2, (c<? super z>) obj3);
    }
}
