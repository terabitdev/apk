package io.elevenlabs.readerapp.ui.delegates;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.services.PurchasesService;
import ir.j1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import sn.a;
import sn.z;
import tn.a0;
import tn.u;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.delegates.PriceFetcher$fetchPrices$1", f = "PriceFetcher.kt", l = {43}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class PriceFetcher$fetchPrices$1 extends i implements p {
    final /* synthetic */ List<String> $newIds;
    int label;
    final /* synthetic */ PriceFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceFetcher$fetchPrices$1(PriceFetcher priceFetcher, List<String> list, c<? super PriceFetcher$fetchPrices$1> cVar) {
        super(2, cVar);
        this.this$0 = priceFetcher;
        this.$newIds = list;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new PriceFetcher$fetchPrices$1(this.this$0, this.$newIds, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((PriceFetcher$fetchPrices$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        PurchasesService purchasesService;
        Logger logger2;
        j1 j1Var;
        Object value;
        Map map;
        j1 j1Var2;
        Object value2;
        Map map2;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            logger = this.this$0.logger;
            ib.i.q("Fetching localised prices for ", this.$newIds.size(), " products", logger, "PriceFetcher");
            purchasesService = this.this$0.purchasesService;
            List<String> list = this.$newIds;
            this.label = 1;
            obj = purchasesService.getProducts(list, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        boolean z6 = asyncCallResult instanceof AsyncCallResult.Success;
        u uVar = u.f33548a;
        if (z6) {
            Iterable<RawOneTimeProduct> iterable = (Iterable) ((AsyncCallResult.Success) asyncCallResult).getData();
            int H = a0.H(tn.p.a0(iterable, 10));
            if (H < 16) {
                H = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(H);
            for (RawOneTimeProduct rawOneTimeProduct : iterable) {
                linkedHashMap.put(rawOneTimeProduct.getId(), rawOneTimeProduct.getPrice());
            }
            j1Var2 = this.this$0._prices;
            do {
                value2 = j1Var2.getValue();
                map2 = (Map) value2;
                if (map2 == null) {
                    map2 = uVar;
                }
            } while (!j1Var2.compareAndSet(value2, a0.N(map2, linkedHashMap)));
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            logger2 = this.this$0.logger;
            Logger.logWarning$default(logger2, "PriceFetcher", "Failed to fetch localised prices from RevenueCat", null, 4, null);
            j1Var = this.this$0._prices;
            do {
                value = j1Var.getValue();
                map = (Map) value;
                if (map == null) {
                    map = uVar;
                }
            } while (!j1Var.compareAndSet(value, map));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
