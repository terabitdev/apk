package io.elevenlabs.payments;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
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
@e(c = "io.elevenlabs.payments.InAppPurchasesService$purchaseRead$postResult$1", f = "InAppPurchasesService.kt", l = {427}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/AsyncCallResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class InAppPurchasesService$purchaseRead$postResult$1 extends i implements p {
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$purchaseRead$postResult$1(InAppPurchasesService inAppPurchasesService, String str, Purchase purchase, c<? super InAppPurchasesService$purchaseRead$postResult$1> cVar) {
        super(2, cVar);
        this.this$0 = inAppPurchasesService;
        this.$readId = str;
        this.$purchase = purchase;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new InAppPurchasesService$purchaseRead$postResult$1(this.this$0, this.$readId, this.$purchase, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super AsyncCallResult<z>> cVar) {
        return ((InAppPurchasesService$purchaseRead$postResult$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
        String b10 = this.$purchase.b();
        b10.getClass();
        String optString = this.$purchase.f5164c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        if (optString == null) {
            optString = "";
        }
        String str2 = this.$purchase.f5163b;
        str2.getClass();
        this.label = 1;
        Object postPurchaseReadToken = googlePlayService.postPurchaseReadToken(str, b10, optString, str2, this);
        xn.a aVar2 = xn.a.f37986a;
        if (postPurchaseReadToken == aVar2) {
            return aVar2;
        }
        return postPurchaseReadToken;
    }
}
