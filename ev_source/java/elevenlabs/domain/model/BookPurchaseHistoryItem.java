package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import j0.c;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006!"}, d2 = {"Lio/elevenlabs/domain/model/BookPurchaseHistoryItem;", "", "title", "", "date", "Ljava/util/Date;", FirebaseAnalytics.Param.PRICE, "isRefundable", "", "author", "readId", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDate", "()Ljava/util/Date;", "getPrice", "()Z", "getAuthor", "getReadId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class BookPurchaseHistoryItem {
    private final String author;
    private final Date date;
    private final boolean isRefundable;
    private final String price;
    private final String readId;
    private final String title;

    public BookPurchaseHistoryItem(String str, Date date, String str2, boolean z6, String str3, String str4) {
        str.getClass();
        date.getClass();
        str2.getClass();
        this.title = str;
        this.date = date;
        this.price = str2;
        this.isRefundable = z6;
        this.author = str3;
        this.readId = str4;
    }

    public static /* synthetic */ BookPurchaseHistoryItem copy$default(BookPurchaseHistoryItem bookPurchaseHistoryItem, String str, Date date, String str2, boolean z6, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bookPurchaseHistoryItem.title;
        }
        if ((i10 & 2) != 0) {
            date = bookPurchaseHistoryItem.date;
        }
        if ((i10 & 4) != 0) {
            str2 = bookPurchaseHistoryItem.price;
        }
        if ((i10 & 8) != 0) {
            z6 = bookPurchaseHistoryItem.isRefundable;
        }
        if ((i10 & 16) != 0) {
            str3 = bookPurchaseHistoryItem.author;
        }
        if ((i10 & 32) != 0) {
            str4 = bookPurchaseHistoryItem.readId;
        }
        String str5 = str3;
        String str6 = str4;
        return bookPurchaseHistoryItem.copy(str, date, str2, z6, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRefundable() {
        return this.isRefundable;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    public final BookPurchaseHistoryItem copy(String title, Date date, String price, boolean isRefundable, String author, String readId) {
        title.getClass();
        date.getClass();
        price.getClass();
        return new BookPurchaseHistoryItem(title, date, price, isRefundable, author, readId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookPurchaseHistoryItem)) {
            return false;
        }
        BookPurchaseHistoryItem bookPurchaseHistoryItem = (BookPurchaseHistoryItem) other;
        if (m.c(this.title, bookPurchaseHistoryItem.title) && m.c(this.date, bookPurchaseHistoryItem.date) && m.c(this.price, bookPurchaseHistoryItem.price) && this.isRefundable == bookPurchaseHistoryItem.isRefundable && m.c(this.author, bookPurchaseHistoryItem.author) && m.c(this.readId, bookPurchaseHistoryItem.readId)) {
            return true;
        }
        return false;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final Date getDate() {
        return this.date;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int f10 = b.f(c.c((this.date.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.price), 31, this.isRefundable);
        String str = this.author;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (f10 + hashCode) * 31;
        String str2 = this.readId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public final boolean isRefundable() {
        return this.isRefundable;
    }

    public String toString() {
        String str = this.title;
        Date date = this.date;
        String str2 = this.price;
        boolean z6 = this.isRefundable;
        String str3 = this.author;
        String str4 = this.readId;
        StringBuilder sb = new StringBuilder("BookPurchaseHistoryItem(title=");
        sb.append(str);
        sb.append(", date=");
        sb.append(date);
        sb.append(", price=");
        f.y(sb, str2, ", isRefundable=", z6, ", author=");
        return f.n(sb, str3, ", readId=", str4, Separators.RPAREN);
    }

    public /* synthetic */ BookPurchaseHistoryItem(String str, Date date, String str2, boolean z6, String str3, String str4, int i10, kotlin.jvm.internal.f fVar) {
        this(str, date, str2, z6, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4);
    }
}
