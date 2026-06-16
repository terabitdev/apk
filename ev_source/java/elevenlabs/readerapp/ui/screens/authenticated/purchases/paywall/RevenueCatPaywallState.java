package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.ProductsService;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u007f\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\u0014\u00101\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00103\u001a\u000204HÖ\u0081\u0004J\n\u00105\u001a\u00020\u000bHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019¨\u00066"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/paywall/RevenueCatPaywallState;", "", "productsSource", "Lio/elevenlabs/domain/services/ProductsService$PaywallSource;", "analyticsSource", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "isLoading", "", "offering", "Lcom/revenuecat/purchases/Offering;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "purchaseCompleted", "currentPlan", "dismiss", "currentPackage", "Lcom/revenuecat/purchases/Package;", "purchaseInProgress", "purchaseRefreshing", "<init>", "(Lio/elevenlabs/domain/services/ProductsService$PaywallSource;Lio/elevenlabs/domain/Analytics$Event$PaywallSource;ZLcom/revenuecat/purchases/Offering;Ljava/lang/String;ZLjava/lang/String;ZLcom/revenuecat/purchases/Package;ZZ)V", "getProductsSource", "()Lio/elevenlabs/domain/services/ProductsService$PaywallSource;", "getAnalyticsSource", "()Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "()Z", "getOffering", "()Lcom/revenuecat/purchases/Offering;", "getError", "()Ljava/lang/String;", "getPurchaseCompleted", "getCurrentPlan", "getDismiss", "getCurrentPackage", "()Lcom/revenuecat/purchases/Package;", "getPurchaseInProgress", "getPurchaseRefreshing", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class RevenueCatPaywallState {
    public static final int $stable = 8;
    private final Analytics.Event.PaywallSource analyticsSource;
    private final Package currentPackage;
    private final String currentPlan;
    private final boolean dismiss;
    private final String error;
    private final boolean isLoading;
    private final Offering offering;
    private final ProductsService.PaywallSource productsSource;
    private final boolean purchaseCompleted;
    private final boolean purchaseInProgress;
    private final boolean purchaseRefreshing;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RevenueCatPaywallState(ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2, boolean z6, Offering offering, String str, boolean z10, String str2, boolean z11, Package r18, boolean z12, boolean z13, int i10, kotlin.jvm.internal.f fVar) {
        this(paywallSource, paywallSource2, z6, r1, r4, r6, r5, r7, r2, r8, r21);
        Offering offering2;
        String str3;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        paywallSource = (i10 & 1) != 0 ? null : paywallSource;
        paywallSource2 = (i10 & 2) != 0 ? null : paywallSource2;
        z6 = (i10 & 4) != 0 ? false : z6;
        if ((i10 & 8) != 0) {
            offering2 = null;
        } else {
            offering2 = offering;
        }
        if ((i10 & 16) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i10 & 32) != 0) {
            z14 = false;
        } else {
            z14 = z10;
        }
        String str4 = (i10 & 64) == 0 ? str2 : "";
        if ((i10 & 128) != 0) {
            z15 = false;
        } else {
            z15 = z11;
        }
        Package r22 = (i10 & RpcError.MAX_MESSAGE_BYTES) == 0 ? r18 : null;
        if ((i10 & 512) != 0) {
            z16 = false;
        } else {
            z16 = z12;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z17 = false;
        } else {
            z17 = z13;
        }
    }

    public static /* synthetic */ RevenueCatPaywallState copy$default(RevenueCatPaywallState revenueCatPaywallState, ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2, boolean z6, Offering offering, String str, boolean z10, String str2, boolean z11, Package r92, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallSource = revenueCatPaywallState.productsSource;
        }
        if ((i10 & 2) != 0) {
            paywallSource2 = revenueCatPaywallState.analyticsSource;
        }
        if ((i10 & 4) != 0) {
            z6 = revenueCatPaywallState.isLoading;
        }
        if ((i10 & 8) != 0) {
            offering = revenueCatPaywallState.offering;
        }
        if ((i10 & 16) != 0) {
            str = revenueCatPaywallState.error;
        }
        if ((i10 & 32) != 0) {
            z10 = revenueCatPaywallState.purchaseCompleted;
        }
        if ((i10 & 64) != 0) {
            str2 = revenueCatPaywallState.currentPlan;
        }
        if ((i10 & 128) != 0) {
            z11 = revenueCatPaywallState.dismiss;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            r92 = revenueCatPaywallState.currentPackage;
        }
        if ((i10 & 512) != 0) {
            z12 = revenueCatPaywallState.purchaseInProgress;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z13 = revenueCatPaywallState.purchaseRefreshing;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        boolean z16 = z11;
        Package r11 = r92;
        boolean z17 = z10;
        String str3 = str2;
        String str4 = str;
        boolean z18 = z6;
        return revenueCatPaywallState.copy(paywallSource, paywallSource2, z18, offering, str4, z17, str3, z16, r11, z14, z15);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductsService.PaywallSource getProductsSource() {
        return this.productsSource;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getPurchaseInProgress() {
        return this.purchaseInProgress;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getPurchaseRefreshing() {
        return this.purchaseRefreshing;
    }

    /* renamed from: component2, reason: from getter */
    public final Analytics.Event.PaywallSource getAnalyticsSource() {
        return this.analyticsSource;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final Offering getOffering() {
        return this.offering;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPurchaseCompleted() {
        return this.purchaseCompleted;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCurrentPlan() {
        return this.currentPlan;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDismiss() {
        return this.dismiss;
    }

    /* renamed from: component9, reason: from getter */
    public final Package getCurrentPackage() {
        return this.currentPackage;
    }

    public final RevenueCatPaywallState copy(ProductsService.PaywallSource productsSource, Analytics.Event.PaywallSource analyticsSource, boolean isLoading, Offering offering, String error, boolean purchaseCompleted, String currentPlan, boolean dismiss, Package currentPackage, boolean purchaseInProgress, boolean purchaseRefreshing) {
        error.getClass();
        currentPlan.getClass();
        return new RevenueCatPaywallState(productsSource, analyticsSource, isLoading, offering, error, purchaseCompleted, currentPlan, dismiss, currentPackage, purchaseInProgress, purchaseRefreshing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RevenueCatPaywallState)) {
            return false;
        }
        RevenueCatPaywallState revenueCatPaywallState = (RevenueCatPaywallState) other;
        if (this.productsSource == revenueCatPaywallState.productsSource && this.analyticsSource == revenueCatPaywallState.analyticsSource && this.isLoading == revenueCatPaywallState.isLoading && m.c(this.offering, revenueCatPaywallState.offering) && m.c(this.error, revenueCatPaywallState.error) && this.purchaseCompleted == revenueCatPaywallState.purchaseCompleted && m.c(this.currentPlan, revenueCatPaywallState.currentPlan) && this.dismiss == revenueCatPaywallState.dismiss && m.c(this.currentPackage, revenueCatPaywallState.currentPackage) && this.purchaseInProgress == revenueCatPaywallState.purchaseInProgress && this.purchaseRefreshing == revenueCatPaywallState.purchaseRefreshing) {
            return true;
        }
        return false;
    }

    public final Analytics.Event.PaywallSource getAnalyticsSource() {
        return this.analyticsSource;
    }

    public final Package getCurrentPackage() {
        return this.currentPackage;
    }

    public final String getCurrentPlan() {
        return this.currentPlan;
    }

    public final boolean getDismiss() {
        return this.dismiss;
    }

    public final String getError() {
        return this.error;
    }

    public final Offering getOffering() {
        return this.offering;
    }

    public final ProductsService.PaywallSource getProductsSource() {
        return this.productsSource;
    }

    public final boolean getPurchaseCompleted() {
        return this.purchaseCompleted;
    }

    public final boolean getPurchaseInProgress() {
        return this.purchaseInProgress;
    }

    public final boolean getPurchaseRefreshing() {
        return this.purchaseRefreshing;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        ProductsService.PaywallSource paywallSource = this.productsSource;
        int i10 = 0;
        if (paywallSource == null) {
            hashCode = 0;
        } else {
            hashCode = paywallSource.hashCode();
        }
        int i11 = hashCode * 31;
        Analytics.Event.PaywallSource paywallSource2 = this.analyticsSource;
        if (paywallSource2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = paywallSource2.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f((i11 + hashCode2) * 31, 31, this.isLoading);
        Offering offering = this.offering;
        if (offering == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = offering.hashCode();
        }
        int f11 = com.google.android.gms.internal.play_billing.b.f(j0.c.c(com.google.android.gms.internal.play_billing.b.f(j0.c.c((f10 + hashCode3) * 31, 31, this.error), 31, this.purchaseCompleted), 31, this.currentPlan), 31, this.dismiss);
        Package r32 = this.currentPackage;
        if (r32 != null) {
            i10 = r32.hashCode();
        }
        return Boolean.hashCode(this.purchaseRefreshing) + com.google.android.gms.internal.play_billing.b.f((f11 + i10) * 31, 31, this.purchaseInProgress);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        ProductsService.PaywallSource paywallSource = this.productsSource;
        Analytics.Event.PaywallSource paywallSource2 = this.analyticsSource;
        boolean z6 = this.isLoading;
        Offering offering = this.offering;
        String str = this.error;
        boolean z10 = this.purchaseCompleted;
        String str2 = this.currentPlan;
        boolean z11 = this.dismiss;
        Package r82 = this.currentPackage;
        boolean z12 = this.purchaseInProgress;
        boolean z13 = this.purchaseRefreshing;
        StringBuilder sb = new StringBuilder("RevenueCatPaywallState(productsSource=");
        sb.append(paywallSource);
        sb.append(", analyticsSource=");
        sb.append(paywallSource2);
        sb.append(", isLoading=");
        sb.append(z6);
        sb.append(", offering=");
        sb.append(offering);
        sb.append(", error=");
        defpackage.f.y(sb, str, ", purchaseCompleted=", z10, ", currentPlan=");
        defpackage.f.y(sb, str2, ", dismiss=", z11, ", currentPackage=");
        sb.append(r82);
        sb.append(", purchaseInProgress=");
        sb.append(z12);
        sb.append(", purchaseRefreshing=");
        return n.j(Separators.RPAREN, sb, z13);
    }

    public RevenueCatPaywallState(ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2, boolean z6, Offering offering, String str, boolean z10, String str2, boolean z11, Package r92, boolean z12, boolean z13) {
        str.getClass();
        str2.getClass();
        this.productsSource = paywallSource;
        this.analyticsSource = paywallSource2;
        this.isLoading = z6;
        this.offering = offering;
        this.error = str;
        this.purchaseCompleted = z10;
        this.currentPlan = str2;
        this.dismiss = z11;
        this.currentPackage = r92;
        this.purchaseInProgress = z12;
        this.purchaseRefreshing = z13;
    }

    public RevenueCatPaywallState() {
        this(null, null, false, null, null, false, null, false, null, false, false, 2047, null);
    }
}
