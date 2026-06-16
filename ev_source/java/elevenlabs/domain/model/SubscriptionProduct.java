package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lio/elevenlabs/domain/model/SubscriptionProduct;", "", "id", "", "title", "description", "badgeText", "billingPeriod", "Lio/elevenlabs/domain/model/SubscriptionPeriod;", "pricePerMonth", "Lio/elevenlabs/domain/model/MoneyPrice;", "pricePerYear", "freeTrialDuration", "Lio/elevenlabs/domain/model/FreeTrialDuration;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/SubscriptionPeriod;Lio/elevenlabs/domain/model/MoneyPrice;Lio/elevenlabs/domain/model/MoneyPrice;Lio/elevenlabs/domain/model/FreeTrialDuration;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getBadgeText", "getBillingPeriod", "()Lio/elevenlabs/domain/model/SubscriptionPeriod;", "getPricePerMonth", "()Lio/elevenlabs/domain/model/MoneyPrice;", "getPricePerYear", "getFreeTrialDuration", "()Lio/elevenlabs/domain/model/FreeTrialDuration;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionProduct {
    private final String badgeText;
    private final SubscriptionPeriod billingPeriod;
    private final String description;
    private final FreeTrialDuration freeTrialDuration;
    private final String id;
    private final MoneyPrice pricePerMonth;
    private final MoneyPrice pricePerYear;
    private final String title;

    public SubscriptionProduct(String str, String str2, String str3, String str4, SubscriptionPeriod subscriptionPeriod, MoneyPrice moneyPrice, MoneyPrice moneyPrice2, FreeTrialDuration freeTrialDuration) {
        str.getClass();
        str2.getClass();
        subscriptionPeriod.getClass();
        moneyPrice.getClass();
        moneyPrice2.getClass();
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.badgeText = str4;
        this.billingPeriod = subscriptionPeriod;
        this.pricePerMonth = moneyPrice;
        this.pricePerYear = moneyPrice2;
        this.freeTrialDuration = freeTrialDuration;
    }

    public static /* synthetic */ SubscriptionProduct copy$default(SubscriptionProduct subscriptionProduct, String str, String str2, String str3, String str4, SubscriptionPeriod subscriptionPeriod, MoneyPrice moneyPrice, MoneyPrice moneyPrice2, FreeTrialDuration freeTrialDuration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionProduct.id;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriptionProduct.title;
        }
        if ((i10 & 4) != 0) {
            str3 = subscriptionProduct.description;
        }
        if ((i10 & 8) != 0) {
            str4 = subscriptionProduct.badgeText;
        }
        if ((i10 & 16) != 0) {
            subscriptionPeriod = subscriptionProduct.billingPeriod;
        }
        if ((i10 & 32) != 0) {
            moneyPrice = subscriptionProduct.pricePerMonth;
        }
        if ((i10 & 64) != 0) {
            moneyPrice2 = subscriptionProduct.pricePerYear;
        }
        if ((i10 & 128) != 0) {
            freeTrialDuration = subscriptionProduct.freeTrialDuration;
        }
        MoneyPrice moneyPrice3 = moneyPrice2;
        FreeTrialDuration freeTrialDuration2 = freeTrialDuration;
        SubscriptionPeriod subscriptionPeriod2 = subscriptionPeriod;
        MoneyPrice moneyPrice4 = moneyPrice;
        return subscriptionProduct.copy(str, str2, str3, str4, subscriptionPeriod2, moneyPrice4, moneyPrice3, freeTrialDuration2);
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
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component5, reason: from getter */
    public final SubscriptionPeriod getBillingPeriod() {
        return this.billingPeriod;
    }

    /* renamed from: component6, reason: from getter */
    public final MoneyPrice getPricePerMonth() {
        return this.pricePerMonth;
    }

    /* renamed from: component7, reason: from getter */
    public final MoneyPrice getPricePerYear() {
        return this.pricePerYear;
    }

    /* renamed from: component8, reason: from getter */
    public final FreeTrialDuration getFreeTrialDuration() {
        return this.freeTrialDuration;
    }

    public final SubscriptionProduct copy(String id2, String title, String description, String badgeText, SubscriptionPeriod billingPeriod, MoneyPrice pricePerMonth, MoneyPrice pricePerYear, FreeTrialDuration freeTrialDuration) {
        id2.getClass();
        title.getClass();
        billingPeriod.getClass();
        pricePerMonth.getClass();
        pricePerYear.getClass();
        return new SubscriptionProduct(id2, title, description, badgeText, billingPeriod, pricePerMonth, pricePerYear, freeTrialDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionProduct)) {
            return false;
        }
        SubscriptionProduct subscriptionProduct = (SubscriptionProduct) other;
        if (m.c(this.id, subscriptionProduct.id) && m.c(this.title, subscriptionProduct.title) && m.c(this.description, subscriptionProduct.description) && m.c(this.badgeText, subscriptionProduct.badgeText) && this.billingPeriod == subscriptionProduct.billingPeriod && m.c(this.pricePerMonth, subscriptionProduct.pricePerMonth) && m.c(this.pricePerYear, subscriptionProduct.pricePerYear) && m.c(this.freeTrialDuration, subscriptionProduct.freeTrialDuration)) {
            return true;
        }
        return false;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final SubscriptionPeriod getBillingPeriod() {
        return this.billingPeriod;
    }

    public final String getDescription() {
        return this.description;
    }

    public final FreeTrialDuration getFreeTrialDuration() {
        return this.freeTrialDuration;
    }

    public final String getId() {
        return this.id;
    }

    public final MoneyPrice getPricePerMonth() {
        return this.pricePerMonth;
    }

    public final MoneyPrice getPricePerYear() {
        return this.pricePerYear;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c5 = c.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.badgeText;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode3 = (this.pricePerYear.hashCode() + ((this.pricePerMonth.hashCode() + ((this.billingPeriod.hashCode() + ((i11 + hashCode2) * 31)) * 31)) * 31)) * 31;
        FreeTrialDuration freeTrialDuration = this.freeTrialDuration;
        if (freeTrialDuration != null) {
            i10 = freeTrialDuration.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.badgeText;
        SubscriptionPeriod subscriptionPeriod = this.billingPeriod;
        MoneyPrice moneyPrice = this.pricePerMonth;
        MoneyPrice moneyPrice2 = this.pricePerYear;
        FreeTrialDuration freeTrialDuration = this.freeTrialDuration;
        StringBuilder s10 = f.s("SubscriptionProduct(id=", str, ", title=", str2, ", description=");
        f.x(s10, str3, ", badgeText=", str4, ", billingPeriod=");
        s10.append(subscriptionPeriod);
        s10.append(", pricePerMonth=");
        s10.append(moneyPrice);
        s10.append(", pricePerYear=");
        s10.append(moneyPrice2);
        s10.append(", freeTrialDuration=");
        s10.append(freeTrialDuration);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
