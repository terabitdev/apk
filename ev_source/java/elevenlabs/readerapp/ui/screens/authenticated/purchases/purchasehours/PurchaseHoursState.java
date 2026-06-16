package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0014\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/purchasehours/PurchaseHoursState;", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "purchaseError", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/OneTimeProductsPage;", "isLoadingPurchase", "purchasedProduct", "Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "customer", "Lio/elevenlabs/domain/model/Customer;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/OneTimeProductsPage;ZLio/elevenlabs/domain/model/OneTimeCreditsProduct;Lio/elevenlabs/domain/model/Customer;)V", "()Z", "getError", "()Ljava/lang/String;", "getPurchaseError", "getData", "()Lio/elevenlabs/domain/model/OneTimeProductsPage;", "getPurchasedProduct", "()Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "getCustomer", "()Lio/elevenlabs/domain/model/Customer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PurchaseHoursState {
    public static final int $stable = 8;
    private final Customer customer;
    private final OneTimeProductsPage data;
    private final String error;
    private final boolean isLoading;
    private final boolean isLoadingPurchase;
    private final String purchaseError;
    private final OneTimeCreditsProduct purchasedProduct;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PurchaseHoursState(boolean z6, String str, String str2, OneTimeProductsPage oneTimeProductsPage, boolean z10, OneTimeCreditsProduct oneTimeCreditsProduct, Customer customer, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, str, str2, oneTimeProductsPage, z10, oneTimeCreditsProduct, r10);
        Customer customer2;
        z6 = (i10 & 1) != 0 ? false : z6;
        str = (i10 & 2) != 0 ? "" : str;
        str2 = (i10 & 4) != 0 ? "" : str2;
        oneTimeProductsPage = (i10 & 8) != 0 ? null : oneTimeProductsPage;
        z10 = (i10 & 16) != 0 ? false : z10;
        oneTimeCreditsProduct = (i10 & 32) != 0 ? null : oneTimeCreditsProduct;
        if ((i10 & 64) != 0) {
            customer2 = null;
        } else {
            customer2 = customer;
        }
    }

    public static /* synthetic */ PurchaseHoursState copy$default(PurchaseHoursState purchaseHoursState, boolean z6, String str, String str2, OneTimeProductsPage oneTimeProductsPage, boolean z10, OneTimeCreditsProduct oneTimeCreditsProduct, Customer customer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = purchaseHoursState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = purchaseHoursState.error;
        }
        if ((i10 & 4) != 0) {
            str2 = purchaseHoursState.purchaseError;
        }
        if ((i10 & 8) != 0) {
            oneTimeProductsPage = purchaseHoursState.data;
        }
        if ((i10 & 16) != 0) {
            z10 = purchaseHoursState.isLoadingPurchase;
        }
        if ((i10 & 32) != 0) {
            oneTimeCreditsProduct = purchaseHoursState.purchasedProduct;
        }
        if ((i10 & 64) != 0) {
            customer = purchaseHoursState.customer;
        }
        OneTimeCreditsProduct oneTimeCreditsProduct2 = oneTimeCreditsProduct;
        Customer customer2 = customer;
        boolean z11 = z10;
        String str3 = str2;
        return purchaseHoursState.copy(z6, str, str3, oneTimeProductsPage, z11, oneTimeCreditsProduct2, customer2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPurchaseError() {
        return this.purchaseError;
    }

    /* renamed from: component4, reason: from getter */
    public final OneTimeProductsPage getData() {
        return this.data;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoadingPurchase() {
        return this.isLoadingPurchase;
    }

    /* renamed from: component6, reason: from getter */
    public final OneTimeCreditsProduct getPurchasedProduct() {
        return this.purchasedProduct;
    }

    /* renamed from: component7, reason: from getter */
    public final Customer getCustomer() {
        return this.customer;
    }

    public final PurchaseHoursState copy(boolean isLoading, String error, String purchaseError, OneTimeProductsPage data, boolean isLoadingPurchase, OneTimeCreditsProduct purchasedProduct, Customer customer) {
        error.getClass();
        purchaseError.getClass();
        return new PurchaseHoursState(isLoading, error, purchaseError, data, isLoadingPurchase, purchasedProduct, customer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHoursState)) {
            return false;
        }
        PurchaseHoursState purchaseHoursState = (PurchaseHoursState) other;
        if (this.isLoading == purchaseHoursState.isLoading && kotlin.jvm.internal.m.c(this.error, purchaseHoursState.error) && kotlin.jvm.internal.m.c(this.purchaseError, purchaseHoursState.purchaseError) && kotlin.jvm.internal.m.c(this.data, purchaseHoursState.data) && this.isLoadingPurchase == purchaseHoursState.isLoadingPurchase && kotlin.jvm.internal.m.c(this.purchasedProduct, purchaseHoursState.purchasedProduct) && kotlin.jvm.internal.m.c(this.customer, purchaseHoursState.customer)) {
            return true;
        }
        return false;
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final OneTimeProductsPage getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public final String getPurchaseError() {
        return this.purchaseError;
    }

    public final OneTimeCreditsProduct getPurchasedProduct() {
        return this.purchasedProduct;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c5 = j0.c.c(j0.c.c(Boolean.hashCode(this.isLoading) * 31, 31, this.error), 31, this.purchaseError);
        OneTimeProductsPage oneTimeProductsPage = this.data;
        int i10 = 0;
        if (oneTimeProductsPage == null) {
            hashCode = 0;
        } else {
            hashCode = oneTimeProductsPage.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f((c5 + hashCode) * 31, 31, this.isLoadingPurchase);
        OneTimeCreditsProduct oneTimeCreditsProduct = this.purchasedProduct;
        if (oneTimeCreditsProduct == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = oneTimeCreditsProduct.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        Customer customer = this.customer;
        if (customer != null) {
            i10 = customer.hashCode();
        }
        return i11 + i10;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingPurchase() {
        return this.isLoadingPurchase;
    }

    public String toString() {
        return "PurchaseHoursState(isLoading=" + this.isLoading + ", error=" + this.error + ", purchaseError=" + this.purchaseError + ", data=" + this.data + ", isLoadingPurchase=" + this.isLoadingPurchase + ", purchasedProduct=" + this.purchasedProduct + ", customer=" + this.customer + Separators.RPAREN;
    }

    public PurchaseHoursState(boolean z6, String str, String str2, OneTimeProductsPage oneTimeProductsPage, boolean z10, OneTimeCreditsProduct oneTimeCreditsProduct, Customer customer) {
        str.getClass();
        str2.getClass();
        this.isLoading = z6;
        this.error = str;
        this.purchaseError = str2;
        this.data = oneTimeProductsPage;
        this.isLoadingPurchase = z10;
        this.purchasedProduct = oneTimeCreditsProduct;
        this.customer = customer;
    }

    public PurchaseHoursState() {
        this(false, null, null, null, false, null, null, 127, null);
    }
}
