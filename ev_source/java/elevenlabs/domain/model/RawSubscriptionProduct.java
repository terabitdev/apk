package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/model/RawSubscriptionProduct;", "", "id", "", "title", "pricePerMonth", "Lio/elevenlabs/domain/model/MoneyPrice;", "pricePerYear", "freeTrialDuration", "Lio/elevenlabs/domain/model/FreeTrialDuration;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/MoneyPrice;Lio/elevenlabs/domain/model/MoneyPrice;Lio/elevenlabs/domain/model/FreeTrialDuration;)V", "getId", "()Ljava/lang/String;", "getTitle", "getPricePerMonth", "()Lio/elevenlabs/domain/model/MoneyPrice;", "getPricePerYear", "getFreeTrialDuration", "()Lio/elevenlabs/domain/model/FreeTrialDuration;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class RawSubscriptionProduct {
    private final FreeTrialDuration freeTrialDuration;
    private final String id;
    private final MoneyPrice pricePerMonth;
    private final MoneyPrice pricePerYear;
    private final String title;

    public RawSubscriptionProduct(String str, String str2, MoneyPrice moneyPrice, MoneyPrice moneyPrice2, FreeTrialDuration freeTrialDuration) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.pricePerMonth = moneyPrice;
        this.pricePerYear = moneyPrice2;
        this.freeTrialDuration = freeTrialDuration;
    }

    public static /* synthetic */ RawSubscriptionProduct copy$default(RawSubscriptionProduct rawSubscriptionProduct, String str, String str2, MoneyPrice moneyPrice, MoneyPrice moneyPrice2, FreeTrialDuration freeTrialDuration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rawSubscriptionProduct.id;
        }
        if ((i10 & 2) != 0) {
            str2 = rawSubscriptionProduct.title;
        }
        if ((i10 & 4) != 0) {
            moneyPrice = rawSubscriptionProduct.pricePerMonth;
        }
        if ((i10 & 8) != 0) {
            moneyPrice2 = rawSubscriptionProduct.pricePerYear;
        }
        if ((i10 & 16) != 0) {
            freeTrialDuration = rawSubscriptionProduct.freeTrialDuration;
        }
        FreeTrialDuration freeTrialDuration2 = freeTrialDuration;
        MoneyPrice moneyPrice3 = moneyPrice;
        return rawSubscriptionProduct.copy(str, str2, moneyPrice3, moneyPrice2, freeTrialDuration2);
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
    public final MoneyPrice getPricePerMonth() {
        return this.pricePerMonth;
    }

    /* renamed from: component4, reason: from getter */
    public final MoneyPrice getPricePerYear() {
        return this.pricePerYear;
    }

    /* renamed from: component5, reason: from getter */
    public final FreeTrialDuration getFreeTrialDuration() {
        return this.freeTrialDuration;
    }

    public final RawSubscriptionProduct copy(String id2, String title, MoneyPrice pricePerMonth, MoneyPrice pricePerYear, FreeTrialDuration freeTrialDuration) {
        id2.getClass();
        title.getClass();
        return new RawSubscriptionProduct(id2, title, pricePerMonth, pricePerYear, freeTrialDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawSubscriptionProduct)) {
            return false;
        }
        RawSubscriptionProduct rawSubscriptionProduct = (RawSubscriptionProduct) other;
        if (m.c(this.id, rawSubscriptionProduct.id) && m.c(this.title, rawSubscriptionProduct.title) && m.c(this.pricePerMonth, rawSubscriptionProduct.pricePerMonth) && m.c(this.pricePerYear, rawSubscriptionProduct.pricePerYear) && m.c(this.freeTrialDuration, rawSubscriptionProduct.freeTrialDuration)) {
            return true;
        }
        return false;
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
        MoneyPrice moneyPrice = this.pricePerMonth;
        int i10 = 0;
        if (moneyPrice == null) {
            hashCode = 0;
        } else {
            hashCode = moneyPrice.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        MoneyPrice moneyPrice2 = this.pricePerYear;
        if (moneyPrice2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = moneyPrice2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        FreeTrialDuration freeTrialDuration = this.freeTrialDuration;
        if (freeTrialDuration != null) {
            i10 = freeTrialDuration.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        MoneyPrice moneyPrice = this.pricePerMonth;
        MoneyPrice moneyPrice2 = this.pricePerYear;
        FreeTrialDuration freeTrialDuration = this.freeTrialDuration;
        StringBuilder s10 = f.s("RawSubscriptionProduct(id=", str, ", title=", str2, ", pricePerMonth=");
        s10.append(moneyPrice);
        s10.append(", pricePerYear=");
        s10.append(moneyPrice2);
        s10.append(", freeTrialDuration=");
        s10.append(freeTrialDuration);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
