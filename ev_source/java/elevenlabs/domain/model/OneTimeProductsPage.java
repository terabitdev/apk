package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lio/elevenlabs/domain/model/OneTimeProductsPage;", "", "currentMinutes", "", "oneTimeProducts", "", "Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "subscriptionProducts", "Lio/elevenlabs/domain/model/SubscriptionProduct;", "title", "", "subtitle", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentMinutes", "()J", "getOneTimeProducts", "()Ljava/util/List;", "getSubscriptionProducts", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OneTimeProductsPage {
    private final long currentMinutes;
    private final List<OneTimeCreditsProduct> oneTimeProducts;
    private final List<SubscriptionProduct> subscriptionProducts;
    private final String subtitle;
    private final String title;

    public OneTimeProductsPage(long j4, List<OneTimeCreditsProduct> list, List<SubscriptionProduct> list2, String str, String str2) {
        list.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        this.currentMinutes = j4;
        this.oneTimeProducts = list;
        this.subscriptionProducts = list2;
        this.title = str;
        this.subtitle = str2;
    }

    public static /* synthetic */ OneTimeProductsPage copy$default(OneTimeProductsPage oneTimeProductsPage, long j4, List list, List list2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = oneTimeProductsPage.currentMinutes;
        }
        long j10 = j4;
        if ((i10 & 2) != 0) {
            list = oneTimeProductsPage.oneTimeProducts;
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = oneTimeProductsPage.subscriptionProducts;
        }
        List list4 = list2;
        if ((i10 & 8) != 0) {
            str = oneTimeProductsPage.title;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = oneTimeProductsPage.subtitle;
        }
        return oneTimeProductsPage.copy(j10, list3, list4, str3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCurrentMinutes() {
        return this.currentMinutes;
    }

    public final List<OneTimeCreditsProduct> component2() {
        return this.oneTimeProducts;
    }

    public final List<SubscriptionProduct> component3() {
        return this.subscriptionProducts;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final OneTimeProductsPage copy(long currentMinutes, List<OneTimeCreditsProduct> oneTimeProducts, List<SubscriptionProduct> subscriptionProducts, String title, String subtitle) {
        oneTimeProducts.getClass();
        subscriptionProducts.getClass();
        title.getClass();
        subtitle.getClass();
        return new OneTimeProductsPage(currentMinutes, oneTimeProducts, subscriptionProducts, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeProductsPage)) {
            return false;
        }
        OneTimeProductsPage oneTimeProductsPage = (OneTimeProductsPage) other;
        if (this.currentMinutes == oneTimeProductsPage.currentMinutes && m.c(this.oneTimeProducts, oneTimeProductsPage.oneTimeProducts) && m.c(this.subscriptionProducts, oneTimeProductsPage.subscriptionProducts) && m.c(this.title, oneTimeProductsPage.title) && m.c(this.subtitle, oneTimeProductsPage.subtitle)) {
            return true;
        }
        return false;
    }

    public final long getCurrentMinutes() {
        return this.currentMinutes;
    }

    public final List<OneTimeCreditsProduct> getOneTimeProducts() {
        return this.oneTimeProducts;
    }

    public final List<SubscriptionProduct> getSubscriptionProducts() {
        return this.subscriptionProducts;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + c.c(n.d(n.d(Long.hashCode(this.currentMinutes) * 31, 31, this.oneTimeProducts), 31, this.subscriptionProducts), 31, this.title);
    }

    public String toString() {
        long j4 = this.currentMinutes;
        List<OneTimeCreditsProduct> list = this.oneTimeProducts;
        List<SubscriptionProduct> list2 = this.subscriptionProducts;
        String str = this.title;
        String str2 = this.subtitle;
        StringBuilder sb = new StringBuilder("OneTimeProductsPage(currentMinutes=");
        sb.append(j4);
        sb.append(", oneTimeProducts=");
        sb.append(list);
        sb.append(", subscriptionProducts=");
        sb.append(list2);
        sb.append(", title=");
        sb.append(str);
        return h.d(sb, ", subtitle=", str2, Separators.RPAREN);
    }
}
