package io.elevenlabs.domain.usecase;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.PurchasesService;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/usecase/PurchaseAndRefreshCreditsUseCase;", "", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "<init>", "(Lio/elevenlabs/domain/services/PurchasesService;Lio/elevenlabs/domain/services/CustomerService;)V", "", "productId", "activity", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/services/PurchasesService$PurchaseResult;", "invoke", "(Ljava/lang/String;Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/PurchasesService;", "Lio/elevenlabs/domain/services/CustomerService;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PurchaseAndRefreshCreditsUseCase {
    private final CustomerService customerService;
    private final PurchasesService purchasesService;

    public PurchaseAndRefreshCreditsUseCase(PurchasesService purchasesService, CustomerService customerService) {
        purchasesService.getClass();
        customerService.getClass();
        this.purchasesService = purchasesService;
        this.customerService = customerService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r8.refreshPurchase(r9, r0) == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        if (r9 == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Object obj, c<? super AsyncCallResult<PurchasesService.PurchaseResult>> cVar) {
        PurchaseAndRefreshCreditsUseCase$invoke$1 purchaseAndRefreshCreditsUseCase$invoke$1;
        int i10;
        AsyncCallResult asyncCallResult;
        if (cVar instanceof PurchaseAndRefreshCreditsUseCase$invoke$1) {
            purchaseAndRefreshCreditsUseCase$invoke$1 = (PurchaseAndRefreshCreditsUseCase$invoke$1) cVar;
            int i11 = purchaseAndRefreshCreditsUseCase$invoke$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                purchaseAndRefreshCreditsUseCase$invoke$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = purchaseAndRefreshCreditsUseCase$invoke$1.result;
                i10 = purchaseAndRefreshCreditsUseCase$invoke$1.label;
                a aVar = a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            asyncCallResult = (AsyncCallResult) purchaseAndRefreshCreditsUseCase$invoke$1.L$2;
                            sn.a.g(obj2);
                            return (AsyncCallResult.Success) asyncCallResult;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj2);
                } else {
                    sn.a.g(obj2);
                    PurchasesService purchasesService = this.purchasesService;
                    purchaseAndRefreshCreditsUseCase$invoke$1.L$0 = null;
                    purchaseAndRefreshCreditsUseCase$invoke$1.L$1 = null;
                    purchaseAndRefreshCreditsUseCase$invoke$1.label = 1;
                    obj2 = purchasesService.purchase(str, obj, purchaseAndRefreshCreditsUseCase$invoke$1);
                }
                asyncCallResult = (AsyncCallResult) obj2;
                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                    return ((AsyncCallResult.Error) asyncCallResult).cast();
                }
                if (asyncCallResult instanceof AsyncCallResult.Success) {
                    AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                    PurchasesService.PurchaseResult purchaseResult = (PurchasesService.PurchaseResult) success.getData();
                    if (m.c(purchaseResult, PurchasesService.PurchaseResult.Cancelled.INSTANCE)) {
                        return success;
                    }
                    if (purchaseResult instanceof PurchasesService.PurchaseResult.Purchased) {
                        CustomerService customerService = this.customerService;
                        String transactionId = ((PurchasesService.PurchaseResult.Purchased) purchaseResult).getTransactionId();
                        purchaseAndRefreshCreditsUseCase$invoke$1.L$0 = null;
                        purchaseAndRefreshCreditsUseCase$invoke$1.L$1 = null;
                        purchaseAndRefreshCreditsUseCase$invoke$1.L$2 = asyncCallResult;
                        purchaseAndRefreshCreditsUseCase$invoke$1.L$3 = null;
                        purchaseAndRefreshCreditsUseCase$invoke$1.label = 2;
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    c6.p();
                    return null;
                }
            }
        }
        purchaseAndRefreshCreditsUseCase$invoke$1 = new PurchaseAndRefreshCreditsUseCase$invoke$1(this, cVar);
        Object obj22 = purchaseAndRefreshCreditsUseCase$invoke$1.result;
        i10 = purchaseAndRefreshCreditsUseCase$invoke$1.label;
        a aVar2 = a.f37986a;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj22;
        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
        }
    }
}
