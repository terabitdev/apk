package io.elevenlabs.payments;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzbj;
import com.google.protobuf.c6;
import h4.u;
import ho.l;
import ho.q;
import ig.f;
import io.elevenlabs.payments.InAppPurchasesService;
import java.util.ArrayList;
import java.util.List;
import jd.h;
import jd.j;
import jd.p;
import jd.t;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService$purchaseRead$5", f = "InAppPurchasesService.kt", l = {388}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljd/b;", "billingClient", "Lkotlin/Function1;", "Lio/elevenlabs/payments/InAppPurchasesService$BillingClientResult;", "Lsn/z;", "send", "<anonymous>", "(Ljd/b;Lho/l;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class InAppPurchasesService$purchaseRead$5 extends i implements q {
    final /* synthetic */ Object $activity;
    final /* synthetic */ String $productId;
    final /* synthetic */ String $userId;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$purchaseRead$5(InAppPurchasesService inAppPurchasesService, String str, String str2, Object obj, c<? super InAppPurchasesService$purchaseRead$5> cVar) {
        super(3, cVar);
        this.this$0 = inAppPurchasesService;
        this.$productId = str;
        this.$userId = str2;
        this.$activity = obj;
    }

    @Override // ho.q
    public final Object invoke(jd.b bVar, l lVar, c<? super z> cVar) {
        InAppPurchasesService$purchaseRead$5 inAppPurchasesService$purchaseRead$5 = new InAppPurchasesService$purchaseRead$5(this.this$0, this.$productId, this.$userId, this.$activity, cVar);
        inAppPurchasesService$purchaseRead$5.L$0 = bVar;
        inAppPurchasesService$purchaseRead$5.L$1 = lVar;
        return inAppPurchasesService$purchaseRead$5.invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [jd.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, c8.k] */
    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            this.this$0.logger.log(this.this$0.tag, "purchaseRead - getting product");
            InAppPurchasesService inAppPurchasesService = this.this$0;
            String str2 = this.$productId;
            this.L$0 = bVar;
            this.L$1 = lVar;
            this.label = 1;
            obj = inAppPurchasesService.queryProductDetails(bVar, str2, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        t tVar = (t) obj;
        z zVar = z.f31622a;
        if (tVar == null) {
            this.this$0.logger.log(this.this$0.tag, "purchaseRead - no product");
            lVar.invoke(new InAppPurchasesService.BillingClientResult(4, null, 2, null));
            return zVar;
        }
        p a10 = tVar.a();
        if (a10 != null) {
            str = a10.f19462d;
        } else {
            str = null;
        }
        if (str == null) {
            this.this$0.logger.log(this.this$0.tag, "purchaseRead - no offer token");
            lVar.invoke(new InAppPurchasesService.BillingClientResult(4, null, 2, null));
            return zVar;
        }
        u uVar = new u(8, false);
        uVar.E(tVar);
        if (!TextUtils.isEmpty(str)) {
            uVar.f12040c = str;
            zzbj.zzc((t) uVar.f12039b, "ProductDetails is required for constructing ProductDetailsParams.");
            List H = f.H(new h(uVar));
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            obj3.f4857b = 0;
            obj3.f4856a = true;
            obj2.f19413d = obj3;
            obj2.f19411b = new ArrayList(H);
            obj2.f19410a = this.$userId;
            j a11 = obj2.a();
            this.this$0.logger.log(this.this$0.tag, "purchaseRead - launching billing flow");
            Object obj4 = this.$activity;
            obj4.getClass();
            bVar.f((Activity) obj4, a11);
            this.this$0.logger.log(this.this$0.tag, "purchaseRead - launched billing flow");
            return zVar;
        }
        c6.t("offerToken can not be empty");
        return null;
    }
}
