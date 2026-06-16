package io.elevenlabs.readerapp.ui.previews;

import ig.f;
import io.elevenlabs.domain.model.BookPurchaseHistoryItem;
import io.elevenlabs.domain.model.CreditHistory;
import io.elevenlabs.domain.model.Customer;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¨\u0006\u0007"}, d2 = {"stubCustomer", "Lio/elevenlabs/domain/model/Customer;", "stubCreditHistoryItems", "", "Lio/elevenlabs/domain/model/CreditHistory$Item$CreditHistoryItemResponse;", "stubBookPurchaseHistoryItems", "Lio/elevenlabs/domain/model/BookPurchaseHistoryItem;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CustomerFactoryKt {
    public static final List<BookPurchaseHistoryItem> stubBookPurchaseHistoryItems() {
        return f.I(new BookPurchaseHistoryItem("The Dark Side One", new Date(1234L), "$5.99", true, "John Doe", "read_1234"), new BookPurchaseHistoryItem("The Dark Side Two", new Date(1234L), "$2.99", false, null, "read_1234", 16, null), new BookPurchaseHistoryItem("Book with super long title that won't fit single line. It can take two lines, more - we don't know.", new Date(1234L), "$2.99", false, null, "read_1234", 16, null));
    }

    public static final List<CreditHistory.Item.CreditHistoryItemResponse> stubCreditHistoryItems() {
        return f.I(new CreditHistory.Item.CreditHistoryItemResponse("Hours refilled", "ultra", 7L, new Date(12345L), new Date(123456L)), new CreditHistory.Item.CreditHistoryItemResponse("Hours expired", null, -7L, new Date(12345L), null, 16, null));
    }

    public static final Customer stubCustomer() {
        return new Customer("test-id", "free", "weekly", 6L, true, false, false, true, null, 352, null);
    }
}
