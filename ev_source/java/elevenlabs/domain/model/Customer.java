package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import ib.i;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003Je\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0014\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lio/elevenlabs/domain/model/Customer;", "", "id", "", "plan", "billingPeriod", "currentCredits", "", "canUpgrade", "", "canTrial", "isWinBackEligible", "isFreeUser", "nextCreditDate", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZZZLjava/util/Date;)V", "getId", "()Ljava/lang/String;", "getPlan", "getBillingPeriod", "getCurrentCredits", "()J", "getCanUpgrade", "()Z", "getCanTrial", "getNextCreditDate", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Customer {
    private final String billingPeriod;
    private final boolean canTrial;
    private final boolean canUpgrade;
    private final long currentCredits;
    private final String id;
    private final boolean isFreeUser;
    private final boolean isWinBackEligible;
    private final Date nextCreditDate;
    private final String plan;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Customer(String str, String str2, String str3, long j4, boolean z6, boolean z10, boolean z11, boolean z12, Date date, int i10, f fVar) {
        this(str, str2, str3, j4, z6, r9, r10, z12, r12);
        boolean z13;
        boolean z14;
        Date date2;
        if ((i10 & 32) != 0) {
            z13 = true;
        } else {
            z13 = z10;
        }
        if ((i10 & 64) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            date2 = null;
        } else {
            date2 = date;
        }
    }

    public static /* synthetic */ Customer copy$default(Customer customer, String str, String str2, String str3, long j4, boolean z6, boolean z10, boolean z11, boolean z12, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customer.id;
        }
        if ((i10 & 2) != 0) {
            str2 = customer.plan;
        }
        if ((i10 & 4) != 0) {
            str3 = customer.billingPeriod;
        }
        if ((i10 & 8) != 0) {
            j4 = customer.currentCredits;
        }
        if ((i10 & 16) != 0) {
            z6 = customer.canUpgrade;
        }
        if ((i10 & 32) != 0) {
            z10 = customer.canTrial;
        }
        if ((i10 & 64) != 0) {
            z11 = customer.isWinBackEligible;
        }
        if ((i10 & 128) != 0) {
            z12 = customer.isFreeUser;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            date = customer.nextCreditDate;
        }
        Date date2 = date;
        boolean z13 = z11;
        boolean z14 = z6;
        long j10 = j4;
        String str4 = str3;
        return customer.copy(str, str2, str4, j10, z14, z10, z13, z12, date2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlan() {
        return this.plan;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCurrentCredits() {
        return this.currentCredits;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCanTrial() {
        return this.canTrial;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsWinBackEligible() {
        return this.isWinBackEligible;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsFreeUser() {
        return this.isFreeUser;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getNextCreditDate() {
        return this.nextCreditDate;
    }

    public final Customer copy(String id2, String plan, String billingPeriod, long currentCredits, boolean canUpgrade, boolean canTrial, boolean isWinBackEligible, boolean isFreeUser, Date nextCreditDate) {
        id2.getClass();
        plan.getClass();
        billingPeriod.getClass();
        return new Customer(id2, plan, billingPeriod, currentCredits, canUpgrade, canTrial, isWinBackEligible, isFreeUser, nextCreditDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) other;
        if (m.c(this.id, customer.id) && m.c(this.plan, customer.plan) && m.c(this.billingPeriod, customer.billingPeriod) && this.currentCredits == customer.currentCredits && this.canUpgrade == customer.canUpgrade && this.canTrial == customer.canTrial && this.isWinBackEligible == customer.isWinBackEligible && this.isFreeUser == customer.isFreeUser && m.c(this.nextCreditDate, customer.nextCreditDate)) {
            return true;
        }
        return false;
    }

    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    public final boolean getCanTrial() {
        return this.canTrial;
    }

    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final long getCurrentCredits() {
        return this.currentCredits;
    }

    public final String getId() {
        return this.id;
    }

    public final Date getNextCreditDate() {
        return this.nextCreditDate;
    }

    public final String getPlan() {
        return this.plan;
    }

    public int hashCode() {
        int hashCode;
        int f10 = b.f(b.f(b.f(b.f(b.g(this.currentCredits, c.c(c.c(this.id.hashCode() * 31, 31, this.plan), 31, this.billingPeriod), 31), 31, this.canUpgrade), 31, this.canTrial), 31, this.isWinBackEligible), 31, this.isFreeUser);
        Date date = this.nextCreditDate;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return f10 + hashCode;
    }

    public final boolean isFreeUser() {
        return this.isFreeUser;
    }

    public final boolean isWinBackEligible() {
        return this.isWinBackEligible;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.plan;
        String str3 = this.billingPeriod;
        long j4 = this.currentCredits;
        boolean z6 = this.canUpgrade;
        boolean z10 = this.canTrial;
        boolean z11 = this.isWinBackEligible;
        boolean z12 = this.isFreeUser;
        Date date = this.nextCreditDate;
        StringBuilder s10 = defpackage.f.s("Customer(id=", str, ", plan=", str2, ", billingPeriod=");
        s10.append(str3);
        s10.append(", currentCredits=");
        s10.append(j4);
        s10.append(", canUpgrade=");
        s10.append(z6);
        s10.append(", canTrial=");
        s10.append(z10);
        s10.append(", isWinBackEligible=");
        s10.append(z11);
        s10.append(", isFreeUser=");
        s10.append(z12);
        s10.append(", nextCreditDate=");
        s10.append(date);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public Customer(String str, String str2, String str3, long j4, boolean z6, boolean z10, boolean z11, boolean z12, Date date) {
        i.s(str, str2, str3);
        this.id = str;
        this.plan = str2;
        this.billingPeriod = str3;
        this.currentCredits = j4;
        this.canUpgrade = z6;
        this.canTrial = z10;
        this.isWinBackEligible = z11;
        this.isFreeUser = z12;
        this.nextCreditDate = date;
    }
}
