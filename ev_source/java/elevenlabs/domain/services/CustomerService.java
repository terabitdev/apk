package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.BookPurchaseHistoryItem;
import io.elevenlabs.domain.model.BookRefundReason;
import io.elevenlabs.domain.model.CreditHistory;
import io.elevenlabs.domain.model.UsageSectionsPage;
import ir.i;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002H&¢\u0006\u0004\b\n\u0010\u0005J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H&¢\u0006\u0004\b\u000b\u0010\u0005J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH¦@¢\u0006\u0004\b\u0013\u0010\bJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u0015\u0010\u0011J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000eH¦@¢\u0006\u0004\b\u0018\u0010\bJ0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/CustomerService;", "", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "()Lir/i;", "Lsn/z;", "invalidateAndSync", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/Customer;", "getCustomerOrNull", "getCustomer", "", "lastSortId", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/CreditHistory;", "getCreditHistory", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/UsageSectionsPage;", "getCreditHistorySections", "transactionId", "refreshPurchase", "", "Lio/elevenlabs/domain/model/BookPurchaseHistoryItem;", "getPurchaseHistory", "readId", "Lio/elevenlabs/domain/model/BookRefundReason;", "reason", "reasonOtherText", "postBookRefund", "(Ljava/lang/String;Lio/elevenlabs/domain/model/BookRefundReason;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface CustomerService {
    Object getCreditHistory(String str, c<? super AsyncCallResult<CreditHistory>> cVar);

    Object getCreditHistorySections(c<? super AsyncCallResult<UsageSectionsPage>> cVar);

    i getCustomer();

    i getCustomerOrNull();

    Object getPurchaseHistory(c<? super AsyncCallResult<List<BookPurchaseHistoryItem>>> cVar);

    Object invalidateAndSync(c<? super z> cVar);

    Object postBookRefund(String str, BookRefundReason bookRefundReason, String str2, c<? super AsyncCallResult<z>> cVar);

    Object refreshPurchase(String str, c<? super AsyncCallResult<z>> cVar);

    i sync();
}
