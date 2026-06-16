package io.elevenlabs.payments;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.l;
import ho.p;
import ho.q;
import io.elevenlabs.domain.model.AsyncCallResult;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService$withBillingClient$8", f = "InAppPurchasesService.kt", l = {530}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {TokenNames.T, "Ljd/b;", "billingClient", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "send", "<anonymous>", "(Ljd/b;Lho/l;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class InAppPurchasesService$withBillingClient$8 extends i implements q {
    final /* synthetic */ p $operation;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$withBillingClient$8(p pVar, c<? super InAppPurchasesService$withBillingClient$8> cVar) {
        super(3, cVar);
        this.$operation = pVar;
    }

    @Override // ho.q
    public final Object invoke(jd.b bVar, l lVar, c<? super z> cVar) {
        InAppPurchasesService$withBillingClient$8 inAppPurchasesService$withBillingClient$8 = new InAppPurchasesService$withBillingClient$8(this.$operation, cVar);
        inAppPurchasesService$withBillingClient$8.L$0 = bVar;
        inAppPurchasesService$withBillingClient$8.L$1 = lVar;
        return inAppPurchasesService$withBillingClient$8.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jd.b bVar = (jd.b) this.L$0;
        l lVar = (l) this.L$1;
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
            p pVar = this.$operation;
            this.L$0 = null;
            this.L$1 = lVar;
            this.label = 1;
            obj = pVar.invoke(bVar, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        lVar.invoke((AsyncCallResult) obj);
        return z.f31622a;
    }
}
