package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJP\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b6\u0010/\u001a\u0004\b\b\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b:\u0010/\u001a\u0004\b9\u0010\u001c¨\u0006="}, d2 = {"Lio/elevenlabs/data/model/BookPurchaseHistoryItem;", "", "", "title", "", "dateUnix", FirebaseAnalytics.Param.PRICE, "", "isRefundable", "author", "readId", "<init>", "(Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/BookPurchaseHistoryItem;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/BookPurchaseHistoryItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "J", "getDateUnix", "getDateUnix$annotations", "getPrice", "getPrice$annotations", "Z", "isRefundable$annotations", "getAuthor", "getAuthor$annotations", "getReadId", "getReadId$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BookPurchaseHistoryItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String author;
    private final long dateUnix;
    private final boolean isRefundable;
    private final String price;
    private final String readId;
    private final String title;

    public /* synthetic */ BookPurchaseHistoryItem(int i10, String str, long j4, String str2, boolean z6, String str3, String str4, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.title = str;
            this.dateUnix = j4;
            this.price = str2;
            this.isRefundable = z6;
            if ((i10 & 16) == 0) {
                this.author = null;
            } else {
                this.author = str3;
            }
            if ((i10 & 32) == 0) {
                this.readId = null;
                return;
            } else {
                this.readId = str4;
                return;
            }
        }
        t0.j(i10, 15, BookPurchaseHistoryItem$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ BookPurchaseHistoryItem copy$default(BookPurchaseHistoryItem bookPurchaseHistoryItem, String str, long j4, String str2, boolean z6, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bookPurchaseHistoryItem.title;
        }
        if ((i10 & 2) != 0) {
            j4 = bookPurchaseHistoryItem.dateUnix;
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
        return bookPurchaseHistoryItem.copy(str, j4, str2, z6, str3, str4);
    }

    public static final /* synthetic */ void write$Self$data_release(BookPurchaseHistoryItem self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.title);
        output.h0(serialDesc, 1, self.dateUnix);
        output.V(serialDesc, 2, self.price);
        output.T(serialDesc, 3, self.isRefundable);
        if (output.C(serialDesc) || self.author != null) {
            output.o(serialDesc, 4, g1.f34588a, self.author);
        }
        if (output.C(serialDesc) || self.readId != null) {
            output.o(serialDesc, 5, g1.f34588a, self.readId);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDateUnix() {
        return this.dateUnix;
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

    public final BookPurchaseHistoryItem copy(String title, long dateUnix, String price, boolean isRefundable, String author, String readId) {
        title.getClass();
        price.getClass();
        return new BookPurchaseHistoryItem(title, dateUnix, price, isRefundable, author, readId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookPurchaseHistoryItem)) {
            return false;
        }
        BookPurchaseHistoryItem bookPurchaseHistoryItem = (BookPurchaseHistoryItem) other;
        if (m.c(this.title, bookPurchaseHistoryItem.title) && this.dateUnix == bookPurchaseHistoryItem.dateUnix && m.c(this.price, bookPurchaseHistoryItem.price) && this.isRefundable == bookPurchaseHistoryItem.isRefundable && m.c(this.author, bookPurchaseHistoryItem.author) && m.c(this.readId, bookPurchaseHistoryItem.readId)) {
            return true;
        }
        return false;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final long getDateUnix() {
        return this.dateUnix;
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
        int f10 = com.google.android.gms.internal.play_billing.b.f(c.c(com.google.android.gms.internal.play_billing.b.g(this.dateUnix, this.title.hashCode() * 31, 31), 31, this.price), 31, this.isRefundable);
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
        long j4 = this.dateUnix;
        String str2 = this.price;
        boolean z6 = this.isRefundable;
        String str3 = this.author;
        String str4 = this.readId;
        StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("BookPurchaseHistoryItem(title=", str, j4, ", dateUnix=");
        r10.append(", price=");
        r10.append(str2);
        r10.append(", isRefundable=");
        r10.append(z6);
        f.x(r10, ", author=", str3, ", readId=", str4);
        r10.append(Separators.RPAREN);
        return r10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BookPurchaseHistoryItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BookPurchaseHistoryItem;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BookPurchaseHistoryItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAuthor$annotations() {
    }

    public static /* synthetic */ void getDateUnix$annotations() {
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    public static /* synthetic */ void getReadId$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void isRefundable$annotations() {
    }

    public BookPurchaseHistoryItem(String str, long j4, String str2, boolean z6, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.dateUnix = j4;
        this.price = str2;
        this.isRefundable = z6;
        this.author = str3;
        this.readId = str4;
    }

    public /* synthetic */ BookPurchaseHistoryItem(String str, long j4, String str2, boolean z6, String str3, String str4, int i10, kotlin.jvm.internal.f fVar) {
        this(str, j4, str2, z6, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4);
    }
}
