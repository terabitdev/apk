package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/PaymentConfig;", "", "androidProductId", "", "webUrl", "priceFormatted", "zeroPriceFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidProductId", "()Ljava/lang/String;", "getWebUrl", "getPriceFormatted", "getZeroPriceFormatted", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class PaymentConfig {
    private final String androidProductId;
    private final String priceFormatted;
    private final String webUrl;
    private final String zeroPriceFormatted;

    public /* synthetic */ PaymentConfig(String str, String str2, String str3, String str4, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ PaymentConfig copy$default(PaymentConfig paymentConfig, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentConfig.androidProductId;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentConfig.webUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = paymentConfig.priceFormatted;
        }
        if ((i10 & 8) != 0) {
            str4 = paymentConfig.zeroPriceFormatted;
        }
        return paymentConfig.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPriceFormatted() {
        return this.priceFormatted;
    }

    /* renamed from: component4, reason: from getter */
    public final String getZeroPriceFormatted() {
        return this.zeroPriceFormatted;
    }

    public final PaymentConfig copy(String androidProductId, String webUrl, String priceFormatted, String zeroPriceFormatted) {
        return new PaymentConfig(androidProductId, webUrl, priceFormatted, zeroPriceFormatted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentConfig)) {
            return false;
        }
        PaymentConfig paymentConfig = (PaymentConfig) other;
        if (m.c(this.androidProductId, paymentConfig.androidProductId) && m.c(this.webUrl, paymentConfig.webUrl) && m.c(this.priceFormatted, paymentConfig.priceFormatted) && m.c(this.zeroPriceFormatted, paymentConfig.zeroPriceFormatted)) {
            return true;
        }
        return false;
    }

    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    public final String getPriceFormatted() {
        return this.priceFormatted;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final String getZeroPriceFormatted() {
        return this.zeroPriceFormatted;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.androidProductId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.webUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.priceFormatted;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.zeroPriceFormatted;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        String str = this.androidProductId;
        String str2 = this.webUrl;
        return defpackage.f.n(defpackage.f.s("PaymentConfig(androidProductId=", str, ", webUrl=", str2, ", priceFormatted="), this.priceFormatted, ", zeroPriceFormatted=", this.zeroPriceFormatted, Separators.RPAREN);
    }

    public PaymentConfig(String str, String str2, String str3, String str4) {
        this.androidProductId = str;
        this.webUrl = str2;
        this.priceFormatted = str3;
        this.zeroPriceFormatted = str4;
    }

    public PaymentConfig() {
        this(null, null, null, null, 15, null);
    }
}
