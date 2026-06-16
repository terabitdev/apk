package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/model/MoneyPrice;", "", "amount", "", FirebaseAnalytics.Param.CURRENCY, "", "<init>", "(JLjava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class MoneyPrice {
    private final long amount;
    private final String currency;

    public MoneyPrice(long j4, String str) {
        str.getClass();
        this.amount = j4;
        this.currency = str;
    }

    public static /* synthetic */ MoneyPrice copy$default(MoneyPrice moneyPrice, long j4, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = moneyPrice.amount;
        }
        if ((i10 & 2) != 0) {
            str = moneyPrice.currency;
        }
        return moneyPrice.copy(j4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final MoneyPrice copy(long amount, String currency) {
        currency.getClass();
        return new MoneyPrice(amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoneyPrice)) {
            return false;
        }
        MoneyPrice moneyPrice = (MoneyPrice) other;
        if (this.amount == moneyPrice.amount && m.c(this.currency, moneyPrice.currency)) {
            return true;
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
    }

    public String toString() {
        return "MoneyPrice(amount=" + this.amount + ", currency=" + this.currency + Separators.RPAREN;
    }
}
