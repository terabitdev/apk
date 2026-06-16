package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J6\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\bHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/CreditHistory;", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/CreditHistory$Item;", "hasMore", "", "lastSortId", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastSortId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lio/elevenlabs/domain/model/CreditHistory;", "equals", "other", "hashCode", "", "toString", "Item", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class CreditHistory {
    private final Boolean hasMore;
    private final List<Item> items;
    private final String lastSortId;

    public /* synthetic */ CreditHistory(List list, Boolean bool, String str, int i10, f fVar) {
        this(list, (i10 & 2) != 0 ? Boolean.FALSE : bool, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditHistory copy$default(CreditHistory creditHistory, List list, Boolean bool, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = creditHistory.items;
        }
        if ((i10 & 2) != 0) {
            bool = creditHistory.hasMore;
        }
        if ((i10 & 4) != 0) {
            str = creditHistory.lastSortId;
        }
        return creditHistory.copy(list, bool, str);
    }

    public final List<Item> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastSortId() {
        return this.lastSortId;
    }

    public final CreditHistory copy(List<? extends Item> items, Boolean hasMore, String lastSortId) {
        items.getClass();
        return new CreditHistory(items, hasMore, lastSortId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditHistory)) {
            return false;
        }
        CreditHistory creditHistory = (CreditHistory) other;
        if (m.c(this.items, creditHistory.items) && m.c(this.hasMore, creditHistory.hasMore) && m.c(this.lastSortId, creditHistory.lastSortId)) {
            return true;
        }
        return false;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final String getLastSortId() {
        return this.lastSortId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.items.hashCode() * 31;
        Boolean bool = this.hasMore;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        String str = this.lastSortId;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        List<Item> list = this.items;
        Boolean bool = this.hasMore;
        String str = this.lastSortId;
        StringBuilder sb = new StringBuilder("CreditHistory(items=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(bool);
        sb.append(", lastSortId=");
        return defpackage.f.l(str, Separators.RPAREN, sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreditHistory(List<? extends Item> list, Boolean bool, String str) {
        list.getClass();
        this.items = list;
        this.hasMore = bool;
        this.lastSortId = str;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/CreditHistory$Item;", "", "CreditHistoryItemResponse", "Lio/elevenlabs/domain/model/CreditHistory$Item$CreditHistoryItemResponse;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Item {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003JF\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006#"}, d2 = {"Lio/elevenlabs/domain/model/CreditHistory$Item$CreditHistoryItemResponse;", "Lio/elevenlabs/domain/model/CreditHistory$Item;", "title", "", "badge", "hours", "", "date", "Ljava/util/Date;", "expirationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;)V", "getTitle", "()Ljava/lang/String;", "getBadge", "getHours", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDate", "()Ljava/util/Date;", "getExpirationDate", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;)Lio/elevenlabs/domain/model/CreditHistory$Item$CreditHistoryItemResponse;", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CreditHistoryItemResponse implements Item {
            private final String badge;
            private final Date date;
            private final Date expirationDate;
            private final Long hours;
            private final String title;

            public CreditHistoryItemResponse(String str, String str2, Long l4, Date date, Date date2) {
                str.getClass();
                date.getClass();
                this.title = str;
                this.badge = str2;
                this.hours = l4;
                this.date = date;
                this.expirationDate = date2;
            }

            public static /* synthetic */ CreditHistoryItemResponse copy$default(CreditHistoryItemResponse creditHistoryItemResponse, String str, String str2, Long l4, Date date, Date date2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = creditHistoryItemResponse.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = creditHistoryItemResponse.badge;
                }
                if ((i10 & 4) != 0) {
                    l4 = creditHistoryItemResponse.hours;
                }
                if ((i10 & 8) != 0) {
                    date = creditHistoryItemResponse.date;
                }
                if ((i10 & 16) != 0) {
                    date2 = creditHistoryItemResponse.expirationDate;
                }
                Date date3 = date2;
                Long l7 = l4;
                return creditHistoryItemResponse.copy(str, str2, l7, date, date3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBadge() {
                return this.badge;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getHours() {
                return this.hours;
            }

            /* renamed from: component4, reason: from getter */
            public final Date getDate() {
                return this.date;
            }

            /* renamed from: component5, reason: from getter */
            public final Date getExpirationDate() {
                return this.expirationDate;
            }

            public final CreditHistoryItemResponse copy(String title, String badge, Long hours, Date date, Date expirationDate) {
                title.getClass();
                date.getClass();
                return new CreditHistoryItemResponse(title, badge, hours, date, expirationDate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreditHistoryItemResponse)) {
                    return false;
                }
                CreditHistoryItemResponse creditHistoryItemResponse = (CreditHistoryItemResponse) other;
                if (m.c(this.title, creditHistoryItemResponse.title) && m.c(this.badge, creditHistoryItemResponse.badge) && m.c(this.hours, creditHistoryItemResponse.hours) && m.c(this.date, creditHistoryItemResponse.date) && m.c(this.expirationDate, creditHistoryItemResponse.expirationDate)) {
                    return true;
                }
                return false;
            }

            public final String getBadge() {
                return this.badge;
            }

            public final Date getDate() {
                return this.date;
            }

            public final Date getExpirationDate() {
                return this.expirationDate;
            }

            public final Long getHours() {
                return this.hours;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3 = this.title.hashCode() * 31;
                String str = this.badge;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (hashCode3 + hashCode) * 31;
                Long l4 = this.hours;
                if (l4 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = l4.hashCode();
                }
                int hashCode4 = (this.date.hashCode() + ((i11 + hashCode2) * 31)) * 31;
                Date date = this.expirationDate;
                if (date != null) {
                    i10 = date.hashCode();
                }
                return hashCode4 + i10;
            }

            public String toString() {
                String str = this.title;
                String str2 = this.badge;
                Long l4 = this.hours;
                Date date = this.date;
                Date date2 = this.expirationDate;
                StringBuilder s10 = defpackage.f.s("CreditHistoryItemResponse(title=", str, ", badge=", str2, ", hours=");
                s10.append(l4);
                s10.append(", date=");
                s10.append(date);
                s10.append(", expirationDate=");
                s10.append(date2);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            public /* synthetic */ CreditHistoryItemResponse(String str, String str2, Long l4, Date date, Date date2, int i10, f fVar) {
                this(str, str2, l4, date, (i10 & 16) != 0 ? null : date2);
            }
        }
    }
}
