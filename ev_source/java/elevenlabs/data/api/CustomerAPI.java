package io.elevenlabs.data.api;

import ct.f;
import ct.o;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BookPurchaseHistoryItem;
import io.elevenlabs.data.model.request.ReadRefundRequest;
import io.elevenlabs.data.model.response.CustomerResponse;
import io.elevenlabs.data.model.response.GetCreditHistoryResponse;
import io.elevenlabs.data.model.response.GetCreditHistorySectionsResponse;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0005J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0005J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/CustomerAPI;", "", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/CustomerResponse;", "getCustomerInfo", "(Lwn/c;)Ljava/lang/Object;", "", "transactionId", "refreshPurchase", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", "pageSize", "lastSortId", "Lio/elevenlabs/data/model/response/GetCreditHistoryResponse;", "getCreditHistory", "(Ljava/lang/Long;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse;", "getCreditHistorySections", "", "Lio/elevenlabs/data/model/BookPurchaseHistoryItem;", "getPurchaseHistory", "Lio/elevenlabs/data/model/request/ReadRefundRequest;", "readRefundRequest", "Lsn/z;", "postRefundRead", "(Lio/elevenlabs/data/model/request/ReadRefundRequest;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface CustomerAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getCreditHistory$default(CustomerAPI customerAPI, Long l4, String str, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                l4 = 50L;
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return customerAPI.getCreditHistory(l4, str, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getCreditHistory");
        return null;
    }

    @f("/v1/reader/customer/credit-history")
    Object getCreditHistory(@t("page_size") Long l4, @t("last_sort_id") String str, c<? super ApiResult<GetCreditHistoryResponse>> cVar);

    @f("/v1/reader/customer/credit-history/sections")
    Object getCreditHistorySections(c<? super ApiResult<GetCreditHistorySectionsResponse>> cVar);

    @f("/v1/reader/customer")
    Object getCustomerInfo(c<? super ApiResult<CustomerResponse>> cVar);

    @f("/v1/reader/customer/purchase-history")
    Object getPurchaseHistory(c<? super ApiResult<List<BookPurchaseHistoryItem>>> cVar);

    @o("/v1/reader/customer/refund-read")
    Object postRefundRead(@ct.a ReadRefundRequest readRefundRequest, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/customer/refresh-purchase")
    Object refreshPurchase(@t("transaction_id") String str, c<? super ApiResult<CustomerResponse>> cVar);
}
