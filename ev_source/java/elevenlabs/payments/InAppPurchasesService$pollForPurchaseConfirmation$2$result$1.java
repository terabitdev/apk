package io.elevenlabs.payments;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.GooglePlayService;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService$pollForPurchaseConfirmation$2$result$1", f = "InAppPurchasesService.kt", l = {588}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/AsyncCallResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class InAppPurchasesService$pollForPurchaseConfirmation$2$result$1 extends i implements p {
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$pollForPurchaseConfirmation$2$result$1(InAppPurchasesService inAppPurchasesService, String str, String str2, c<? super InAppPurchasesService$pollForPurchaseConfirmation$2$result$1> cVar) {
        super(2, cVar);
        this.this$0 = inAppPurchasesService;
        this.$readId = str;
        this.$purchaseToken = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new InAppPurchasesService$pollForPurchaseConfirmation$2$result$1(this.this$0, this.$readId, this.$purchaseToken, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super AsyncCallResult<z>> cVar) {
        return ((InAppPurchasesService$pollForPurchaseConfirmation$2$result$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        aVar = this.this$0.googlePlayService;
        GooglePlayService googlePlayService = (GooglePlayService) aVar.get();
        String str = this.$readId;
        String str2 = this.$purchaseToken;
        this.label = 1;
        Object confirmPurchaseReadToken = googlePlayService.confirmPurchaseReadToken(str, str2, this);
        xn.a aVar2 = xn.a.f37986a;
        if (confirmPurchaseReadToken == aVar2) {
            return aVar2;
        }
        return confirmPurchaseReadToken;
    }
}
