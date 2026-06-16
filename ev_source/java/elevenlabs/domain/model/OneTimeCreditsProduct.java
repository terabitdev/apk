package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "", "id", "", "title", "description", FirebaseAnalytics.Param.PRICE, "Lio/elevenlabs/domain/model/MoneyPrice;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/MoneyPrice;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getPrice", "()Lio/elevenlabs/domain/model/MoneyPrice;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OneTimeCreditsProduct {
    private final String description;
    private final String id;
    private final MoneyPrice price;
    private final String title;

    public OneTimeCreditsProduct(String str, String str2, String str3, MoneyPrice moneyPrice) {
        str.getClass();
        str2.getClass();
        moneyPrice.getClass();
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.price = moneyPrice;
    }

    public static /* synthetic */ OneTimeCreditsProduct copy$default(OneTimeCreditsProduct oneTimeCreditsProduct, String str, String str2, String str3, MoneyPrice moneyPrice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oneTimeCreditsProduct.id;
        }
        if ((i10 & 2) != 0) {
            str2 = oneTimeCreditsProduct.title;
        }
        if ((i10 & 4) != 0) {
            str3 = oneTimeCreditsProduct.description;
        }
        if ((i10 & 8) != 0) {
            moneyPrice = oneTimeCreditsProduct.price;
        }
        return oneTimeCreditsProduct.copy(str, str2, str3, moneyPrice);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final MoneyPrice getPrice() {
        return this.price;
    }

    public final OneTimeCreditsProduct copy(String id2, String title, String description, MoneyPrice r52) {
        id2.getClass();
        title.getClass();
        r52.getClass();
        return new OneTimeCreditsProduct(id2, title, description, r52);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeCreditsProduct)) {
            return false;
        }
        OneTimeCreditsProduct oneTimeCreditsProduct = (OneTimeCreditsProduct) other;
        if (m.c(this.id, oneTimeCreditsProduct.id) && m.c(this.title, oneTimeCreditsProduct.title) && m.c(this.description, oneTimeCreditsProduct.description) && m.c(this.price, oneTimeCreditsProduct.price)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final MoneyPrice getPrice() {
        return this.price;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.price.hashCode() + ((c5 + hashCode) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        MoneyPrice moneyPrice = this.price;
        StringBuilder s10 = f.s("OneTimeCreditsProduct(id=", str, ", title=", str2, ", description=");
        s10.append(str3);
        s10.append(", price=");
        s10.append(moneyPrice);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
