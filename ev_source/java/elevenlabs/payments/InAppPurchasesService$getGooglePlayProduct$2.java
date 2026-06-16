package io.elevenlabs.payments;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import jd.t;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService$getGooglePlayProduct$2", f = "InAppPurchasesService.kt", l = {216}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljd/b;", "billingClient", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/RawOneTimeProduct;", "<anonymous>", "(Ljd/b;)Lio/elevenlabs/domain/model/AsyncCallResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class InAppPurchasesService$getGooglePlayProduct$2 extends i implements p {
    final /* synthetic */ String $productId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$getGooglePlayProduct$2(InAppPurchasesService inAppPurchasesService, String str, c<? super InAppPurchasesService$getGooglePlayProduct$2> cVar) {
        super(2, cVar);
        this.this$0 = inAppPurchasesService;
        this.$productId = str;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        InAppPurchasesService$getGooglePlayProduct$2 inAppPurchasesService$getGooglePlayProduct$2 = new InAppPurchasesService$getGooglePlayProduct$2(this.this$0, this.$productId, cVar);
        inAppPurchasesService$getGooglePlayProduct$2.L$0 = obj;
        return inAppPurchasesService$getGooglePlayProduct$2;
    }

    @Override // ho.p
    public final Object invoke(jd.b bVar, c<? super AsyncCallResult<RawOneTimeProduct>> cVar) {
        return ((InAppPurchasesService$getGooglePlayProduct$2) create(bVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jd.b bVar = (jd.b) this.L$0;
        int i10 = this.label;
        jd.p pVar = null;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            InAppPurchasesService inAppPurchasesService = this.this$0;
            String str = this.$productId;
            this.L$0 = null;
            this.label = 1;
            obj = inAppPurchasesService.queryProductDetails(bVar, str, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        t tVar = (t) obj;
        if (tVar != null) {
            pVar = tVar.a();
        }
        if (tVar != null && pVar != null) {
            String str2 = tVar.f19508c;
            str2.getClass();
            long j4 = pVar.f19460b / 10000;
            String str3 = pVar.f19461c;
            str3.getClass();
            return new AsyncCallResult.Success(new RawOneTimeProduct(str2, new MoneyPrice(j4, str3)));
        }
        this.this$0.logger.log(this.this$0.tag, "getGooglePlayProduct - no product details or offer details");
        return new AsyncCallResult.Error(new AsyncCallResult.AsyncCallError.ApiError("product_unavailable", "This product is not available"));
    }
}
