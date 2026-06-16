package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003Je\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0014\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/HoursLowState;", "", "isLoading", "", "readId", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "purchaseError", "products", "", "Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "isLoadingPurchase", "purchasedProduct", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/OneTimeProductsPage;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLio/elevenlabs/domain/model/OneTimeCreditsProduct;Lio/elevenlabs/domain/model/OneTimeProductsPage;)V", "()Z", "getReadId", "()Ljava/lang/String;", "getError", "getPurchaseError", "getProducts", "()Ljava/util/List;", "getPurchasedProduct", "()Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "getData", "()Lio/elevenlabs/domain/model/OneTimeProductsPage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class HoursLowState {
    public static final int $stable = 8;
    private final OneTimeProductsPage data;
    private final String error;
    private final boolean isLoading;
    private final boolean isLoadingPurchase;
    private final List<OneTimeCreditsProduct> products;
    private final String purchaseError;
    private final OneTimeCreditsProduct purchasedProduct;
    private final String readId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HoursLowState(boolean z6, String str, String str2, String str3, List list, boolean z10, OneTimeCreditsProduct oneTimeCreditsProduct, OneTimeProductsPage oneTimeProductsPage, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, str, str2, str3, list, z10, oneTimeCreditsProduct, r12);
        OneTimeProductsPage oneTimeProductsPage2;
        z6 = (i10 & 1) != 0 ? false : z6;
        str = (i10 & 2) != 0 ? null : str;
        str2 = (i10 & 4) != 0 ? "" : str2;
        str3 = (i10 & 8) != 0 ? "" : str3;
        list = (i10 & 16) != 0 ? tn.t.f33547a : list;
        z10 = (i10 & 32) != 0 ? false : z10;
        oneTimeCreditsProduct = (i10 & 64) != 0 ? null : oneTimeCreditsProduct;
        if ((i10 & 128) != 0) {
            oneTimeProductsPage2 = null;
        } else {
            oneTimeProductsPage2 = oneTimeProductsPage;
        }
    }

    public static /* synthetic */ HoursLowState copy$default(HoursLowState hoursLowState, boolean z6, String str, String str2, String str3, List list, boolean z10, OneTimeCreditsProduct oneTimeCreditsProduct, OneTimeProductsPage oneTimeProductsPage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = hoursLowState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = hoursLowState.readId;
        }
        if ((i10 & 4) != 0) {
            str2 = hoursLowState.error;
        }
        if ((i10 & 8) != 0) {
            str3 = hoursLowState.purchaseError;
        }
        if ((i10 & 16) != 0) {
            list = hoursLowState.products;
        }
        if ((i10 & 32) != 0) {
            z10 = hoursLowState.isLoadingPurchase;
        }
        if ((i10 & 64) != 0) {
            oneTimeCreditsProduct = hoursLowState.purchasedProduct;
        }
        if ((i10 & 128) != 0) {
            oneTimeProductsPage = hoursLowState.data;
        }
        OneTimeCreditsProduct oneTimeCreditsProduct2 = oneTimeCreditsProduct;
        OneTimeProductsPage oneTimeProductsPage2 = oneTimeProductsPage;
        List list2 = list;
        boolean z11 = z10;
        return hoursLowState.copy(z6, str, str2, str3, list2, z11, oneTimeCreditsProduct2, oneTimeProductsPage2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPurchaseError() {
        return this.purchaseError;
    }

    public final List<OneTimeCreditsProduct> component5() {
        return this.products;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoadingPurchase() {
        return this.isLoadingPurchase;
    }

    /* renamed from: component7, reason: from getter */
    public final OneTimeCreditsProduct getPurchasedProduct() {
        return this.purchasedProduct;
    }

    /* renamed from: component8, reason: from getter */
    public final OneTimeProductsPage getData() {
        return this.data;
    }

    public final HoursLowState copy(boolean isLoading, String readId, String error, String purchaseError, List<OneTimeCreditsProduct> products, boolean isLoadingPurchase, OneTimeCreditsProduct purchasedProduct, OneTimeProductsPage data) {
        error.getClass();
        purchaseError.getClass();
        products.getClass();
        return new HoursLowState(isLoading, readId, error, purchaseError, products, isLoadingPurchase, purchasedProduct, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoursLowState)) {
            return false;
        }
        HoursLowState hoursLowState = (HoursLowState) other;
        if (this.isLoading == hoursLowState.isLoading && kotlin.jvm.internal.m.c(this.readId, hoursLowState.readId) && kotlin.jvm.internal.m.c(this.error, hoursLowState.error) && kotlin.jvm.internal.m.c(this.purchaseError, hoursLowState.purchaseError) && kotlin.jvm.internal.m.c(this.products, hoursLowState.products) && this.isLoadingPurchase == hoursLowState.isLoadingPurchase && kotlin.jvm.internal.m.c(this.purchasedProduct, hoursLowState.purchasedProduct) && kotlin.jvm.internal.m.c(this.data, hoursLowState.data)) {
            return true;
        }
        return false;
    }

    public final OneTimeProductsPage getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public final List<OneTimeCreditsProduct> getProducts() {
        return this.products;
    }

    public final String getPurchaseError() {
        return this.purchaseError;
    }

    public final OneTimeCreditsProduct getPurchasedProduct() {
        return this.purchasedProduct;
    }

    public final String getReadId() {
        return this.readId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Boolean.hashCode(this.isLoading) * 31;
        String str = this.readId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(p.n.d(j0.c.c(j0.c.c((hashCode3 + hashCode) * 31, 31, this.error), 31, this.purchaseError), 31, this.products), 31, this.isLoadingPurchase);
        OneTimeCreditsProduct oneTimeCreditsProduct = this.purchasedProduct;
        if (oneTimeCreditsProduct == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = oneTimeCreditsProduct.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        OneTimeProductsPage oneTimeProductsPage = this.data;
        if (oneTimeProductsPage != null) {
            i10 = oneTimeProductsPage.hashCode();
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
        boolean z6 = this.isLoading;
        String str = this.readId;
        String str2 = this.error;
        String str3 = this.purchaseError;
        List<OneTimeCreditsProduct> list = this.products;
        boolean z10 = this.isLoadingPurchase;
        OneTimeCreditsProduct oneTimeCreditsProduct = this.purchasedProduct;
        OneTimeProductsPage oneTimeProductsPage = this.data;
        StringBuilder sb = new StringBuilder("HoursLowState(isLoading=");
        sb.append(z6);
        sb.append(", readId=");
        sb.append(str);
        sb.append(", error=");
        defpackage.f.x(sb, str2, ", purchaseError=", str3, ", products=");
        sb.append(list);
        sb.append(", isLoadingPurchase=");
        sb.append(z10);
        sb.append(", purchasedProduct=");
        sb.append(oneTimeCreditsProduct);
        sb.append(", data=");
        sb.append(oneTimeProductsPage);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public HoursLowState(boolean z6, String str, String str2, String str3, List<OneTimeCreditsProduct> list, boolean z10, OneTimeCreditsProduct oneTimeCreditsProduct, OneTimeProductsPage oneTimeProductsPage) {
        j0.c.w(str2, str3, list);
        this.isLoading = z6;
        this.readId = str;
        this.error = str2;
        this.purchaseError = str3;
        this.products = list;
        this.isLoadingPurchase = z10;
        this.purchasedProduct = oneTimeCreditsProduct;
        this.data = oneTimeProductsPage;
    }

    public HoursLowState() {
        this(false, null, null, null, null, false, null, null, 255, null);
    }
}
