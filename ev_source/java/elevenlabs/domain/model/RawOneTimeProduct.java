package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/model/RawOneTimeProduct;", "", "id", "", FirebaseAnalytics.Param.PRICE, "Lio/elevenlabs/domain/model/MoneyPrice;", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/MoneyPrice;)V", "getId", "()Ljava/lang/String;", "getPrice", "()Lio/elevenlabs/domain/model/MoneyPrice;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class RawOneTimeProduct {
    private final String id;
    private final MoneyPrice price;

    public RawOneTimeProduct(String str, MoneyPrice moneyPrice) {
        str.getClass();
        moneyPrice.getClass();
        this.id = str;
        this.price = moneyPrice;
    }

    public static /* synthetic */ RawOneTimeProduct copy$default(RawOneTimeProduct rawOneTimeProduct, String str, MoneyPrice moneyPrice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rawOneTimeProduct.id;
        }
        if ((i10 & 2) != 0) {
            moneyPrice = rawOneTimeProduct.price;
        }
        return rawOneTimeProduct.copy(str, moneyPrice);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyPrice getPrice() {
        return this.price;
    }

    public final RawOneTimeProduct copy(String id2, MoneyPrice price) {
        id2.getClass();
        price.getClass();
        return new RawOneTimeProduct(id2, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawOneTimeProduct)) {
            return false;
        }
        RawOneTimeProduct rawOneTimeProduct = (RawOneTimeProduct) other;
        if (m.c(this.id, rawOneTimeProduct.id) && m.c(this.price, rawOneTimeProduct.price)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final MoneyPrice getPrice() {
        return this.price;
    }

    public int hashCode() {
        return this.price.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "RawOneTimeProduct(id=" + this.id + ", price=" + this.price + Separators.RPAREN;
    }
}
