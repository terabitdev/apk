package io.elevenlabs.payments;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.PurchasesService;
import ir.i1;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService$2$onCustomActionSelected$1", f = "InAppPurchasesService.kt", l = {158}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class InAppPurchasesService$2$onCustomActionSelected$1 extends i implements p {
    final /* synthetic */ String $actionIdentifier;
    final /* synthetic */ String $purchaseIdentifier;
    int label;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$2$onCustomActionSelected$1(InAppPurchasesService inAppPurchasesService, String str, String str2, c<? super InAppPurchasesService$2$onCustomActionSelected$1> cVar) {
        super(2, cVar);
        this.this$0 = inAppPurchasesService;
        this.$actionIdentifier = str;
        this.$purchaseIdentifier = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new InAppPurchasesService$2$onCustomActionSelected$1(this.this$0, this.$actionIdentifier, this.$purchaseIdentifier, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((InAppPurchasesService$2$onCustomActionSelected$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        i1 i1Var;
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
            i1Var = this.this$0._customerCenterEvents;
            PurchasesService.CustomerCenterEvent.CustomAction customAction = new PurchasesService.CustomerCenterEvent.CustomAction(this.$actionIdentifier, this.$purchaseIdentifier);
            this.label = 1;
            Object emit = i1Var.emit(customAction, this);
            xn.a aVar = xn.a.f37986a;
            if (emit == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
