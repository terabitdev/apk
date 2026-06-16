package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;", "", "productId", "", "product", "Lio/elevenlabs/domain/model/RawOneTimeProduct;", "isLoading", "", "isLoadingPurchase", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/RawOneTimeProduct;ZZLjava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getProduct", "()Lio/elevenlabs/domain/model/RawOneTimeProduct;", "()Z", "getError", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PurchaseState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isLoading;
    private final boolean isLoadingPurchase;
    private final RawOneTimeProduct product;
    private final String productId;

    public /* synthetic */ PurchaseState(String str, RawOneTimeProduct rawOneTimeProduct, boolean z6, boolean z10, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : rawOneTimeProduct, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? "" : str2);
    }

    public static /* synthetic */ PurchaseState copy$default(PurchaseState purchaseState, String str, RawOneTimeProduct rawOneTimeProduct, boolean z6, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = purchaseState.productId;
        }
        if ((i10 & 2) != 0) {
            rawOneTimeProduct = purchaseState.product;
        }
        if ((i10 & 4) != 0) {
            z6 = purchaseState.isLoading;
        }
        if ((i10 & 8) != 0) {
            z10 = purchaseState.isLoadingPurchase;
        }
        if ((i10 & 16) != 0) {
            str2 = purchaseState.error;
        }
        String str3 = str2;
        boolean z11 = z6;
        return purchaseState.copy(str, rawOneTimeProduct, z11, z10, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final RawOneTimeProduct getProduct() {
        return this.product;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoadingPurchase() {
        return this.isLoadingPurchase;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final PurchaseState copy(String productId, RawOneTimeProduct product, boolean isLoading, boolean isLoadingPurchase, String r11) {
        r11.getClass();
        return new PurchaseState(productId, product, isLoading, isLoadingPurchase, r11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseState)) {
            return false;
        }
        PurchaseState purchaseState = (PurchaseState) other;
        if (kotlin.jvm.internal.m.c(this.productId, purchaseState.productId) && kotlin.jvm.internal.m.c(this.product, purchaseState.product) && this.isLoading == purchaseState.isLoading && this.isLoadingPurchase == purchaseState.isLoadingPurchase && kotlin.jvm.internal.m.c(this.error, purchaseState.error)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final RawOneTimeProduct getProduct() {
        return this.product;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        int hashCode;
        String str = this.productId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        RawOneTimeProduct rawOneTimeProduct = this.product;
        if (rawOneTimeProduct != null) {
            i10 = rawOneTimeProduct.hashCode();
        }
        return this.error.hashCode() + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i11 + i10) * 31, 31, this.isLoading), 31, this.isLoadingPurchase);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingPurchase() {
        return this.isLoadingPurchase;
    }

    public String toString() {
        String str = this.productId;
        RawOneTimeProduct rawOneTimeProduct = this.product;
        boolean z6 = this.isLoading;
        boolean z10 = this.isLoadingPurchase;
        String str2 = this.error;
        StringBuilder sb = new StringBuilder("PurchaseState(productId=");
        sb.append(str);
        sb.append(", product=");
        sb.append(rawOneTimeProduct);
        sb.append(", isLoading=");
        ib.i.t(sb, z6, ", isLoadingPurchase=", z10, ", error=");
        return defpackage.f.l(str2, Separators.RPAREN, sb);
    }

    public PurchaseState(String str, RawOneTimeProduct rawOneTimeProduct, boolean z6, boolean z10, String str2) {
        str2.getClass();
        this.productId = str;
        this.product = rawOneTimeProduct;
        this.isLoading = z6;
        this.isLoadingPurchase = z10;
        this.error = str2;
    }

    public PurchaseState() {
        this(null, null, false, false, null, 31, null);
    }
}
