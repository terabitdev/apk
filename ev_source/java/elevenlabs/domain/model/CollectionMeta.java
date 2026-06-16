package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u00029:Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"J\t\u00100\u001a\u00020\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0096\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0014\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u000207HÖ\u0081\u0004J\n\u00108\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006;"}, d2 = {"Lio/elevenlabs/domain/model/CollectionMeta;", "", "id", "", "title", "subtitle", "description", "imageUrl", "hasUnread", "", "lastOpenedAt", "Ljava/util/Date;", "updatedAt", "category", "itemCount", "", "isOwner", ParameterNames.ICON, "Lio/elevenlabs/domain/model/CollectionMeta$Icon;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Long;ZLio/elevenlabs/domain/model/CollectionMeta$Icon;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDescription", "getImageUrl", "getHasUnread", "()Z", "getLastOpenedAt", "()Ljava/util/Date;", "getUpdatedAt", "getCategory", "getItemCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIcon", "()Lio/elevenlabs/domain/model/CollectionMeta$Icon;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Long;ZLio/elevenlabs/domain/model/CollectionMeta$Icon;)Lio/elevenlabs/domain/model/CollectionMeta;", "equals", "other", "hashCode", "", "toString", "Icon", "Companion", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class CollectionMeta {
    public static final String READ_LATER_ID = "read_later";
    private final String category;
    private final String description;
    private final boolean hasUnread;
    private final Icon icon;
    private final String id;
    private final String imageUrl;
    private final boolean isOwner;
    private final Long itemCount;
    private final Date lastOpenedAt;
    private final String subtitle;
    private final String title;
    private final Date updatedAt;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/domain/model/CollectionMeta$Icon;", "", "<init>", "(Ljava/lang/String;I)V", "Folder", "Bookmark", "Book", "BookOpen", "Pencil", "Newspaper", "Microphone", "Robot", "Star", "PencilSparkle", "Audio", "ForkKnife", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Icon extends Enum<Icon> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Icon[] $VALUES;
        public static final Icon Folder = new Icon("Folder", 0);
        public static final Icon Bookmark = new Icon("Bookmark", 1);
        public static final Icon Book = new Icon("Book", 2);
        public static final Icon BookOpen = new Icon("BookOpen", 3);
        public static final Icon Pencil = new Icon("Pencil", 4);
        public static final Icon Newspaper = new Icon("Newspaper", 5);
        public static final Icon Microphone = new Icon("Microphone", 6);
        public static final Icon Robot = new Icon("Robot", 7);
        public static final Icon Star = new Icon("Star", 8);
        public static final Icon PencilSparkle = new Icon("PencilSparkle", 9);
        public static final Icon Audio = new Icon("Audio", 10);
        public static final Icon ForkKnife = new Icon("ForkKnife", 11);

        private static final /* synthetic */ Icon[] $values() {
            return new Icon[]{Folder, Bookmark, Book, BookOpen, Pencil, Newspaper, Microphone, Robot, Star, PencilSparkle, Audio, ForkKnife};
        }

        static {
            Icon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private Icon(String str, int i10) {
            super(str, i10);
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    public CollectionMeta(String str, String str2, String str3, String str4, String str5, boolean z6, Date date, Date date2, String str6, Long l4, boolean z10, Icon icon) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.description = str4;
        this.imageUrl = str5;
        this.hasUnread = z6;
        this.lastOpenedAt = date;
        this.updatedAt = date2;
        this.category = str6;
        this.itemCount = l4;
        this.isOwner = z10;
        this.icon = icon;
    }

    public static /* synthetic */ CollectionMeta copy$default(CollectionMeta collectionMeta, String str, String str2, String str3, String str4, String str5, boolean z6, Date date, Date date2, String str6, Long l4, boolean z10, Icon icon, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collectionMeta.id;
        }
        if ((i10 & 2) != 0) {
            str2 = collectionMeta.title;
        }
        if ((i10 & 4) != 0) {
            str3 = collectionMeta.subtitle;
        }
        if ((i10 & 8) != 0) {
            str4 = collectionMeta.description;
        }
        if ((i10 & 16) != 0) {
            str5 = collectionMeta.imageUrl;
        }
        if ((i10 & 32) != 0) {
            z6 = collectionMeta.hasUnread;
        }
        if ((i10 & 64) != 0) {
            date = collectionMeta.lastOpenedAt;
        }
        if ((i10 & 128) != 0) {
            date2 = collectionMeta.updatedAt;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str6 = collectionMeta.category;
        }
        if ((i10 & 512) != 0) {
            l4 = collectionMeta.itemCount;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z10 = collectionMeta.isOwner;
        }
        if ((i10 & 2048) != 0) {
            icon = collectionMeta.icon;
        }
        boolean z11 = z10;
        Icon icon2 = icon;
        String str7 = str6;
        Long l7 = l4;
        Date date3 = date;
        Date date4 = date2;
        String str8 = str5;
        boolean z12 = z6;
        return collectionMeta.copy(str, str2, str3, str4, str8, z12, date3, date4, str7, l7, z11, icon2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getItemCount() {
        return this.itemCount;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsOwner() {
        return this.isOwner;
    }

    /* renamed from: component12, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasUnread() {
        return this.hasUnread;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getLastOpenedAt() {
        return this.lastOpenedAt;
    }

    /* renamed from: component8, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final CollectionMeta copy(String id2, String title, String subtitle, String description, String imageUrl, boolean hasUnread, Date lastOpenedAt, Date updatedAt, String category, Long itemCount, boolean isOwner, Icon r25) {
        id2.getClass();
        title.getClass();
        return new CollectionMeta(id2, title, subtitle, description, imageUrl, hasUnread, lastOpenedAt, updatedAt, category, itemCount, isOwner, r25);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionMeta)) {
            return false;
        }
        CollectionMeta collectionMeta = (CollectionMeta) other;
        if (m.c(this.id, collectionMeta.id) && m.c(this.title, collectionMeta.title) && m.c(this.subtitle, collectionMeta.subtitle) && m.c(this.description, collectionMeta.description) && m.c(this.imageUrl, collectionMeta.imageUrl) && this.hasUnread == collectionMeta.hasUnread && m.c(this.lastOpenedAt, collectionMeta.lastOpenedAt) && m.c(this.updatedAt, collectionMeta.updatedAt) && m.c(this.category, collectionMeta.category) && m.c(this.itemCount, collectionMeta.itemCount) && this.isOwner == collectionMeta.isOwner && this.icon == collectionMeta.icon) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getHasUnread() {
        return this.hasUnread;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Long getItemCount() {
        return this.itemCount;
    }

    public final Date getLastOpenedAt() {
        return this.lastOpenedAt;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int c5 = c.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.imageUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int f10 = b.f((i12 + hashCode3) * 31, 31, this.hasUnread);
        Date date = this.lastOpenedAt;
        if (date == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date.hashCode();
        }
        int i13 = (f10 + hashCode4) * 31;
        Date date2 = this.updatedAt;
        if (date2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date2.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str4 = this.category;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Long l4 = this.itemCount;
        if (l4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l4.hashCode();
        }
        int f11 = b.f((i15 + hashCode7) * 31, 31, this.isOwner);
        Icon icon = this.icon;
        if (icon != null) {
            i10 = icon.hashCode();
        }
        return f11 + i10;
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.description;
        String str5 = this.imageUrl;
        boolean z6 = this.hasUnread;
        Date date = this.lastOpenedAt;
        Date date2 = this.updatedAt;
        String str6 = this.category;
        Long l4 = this.itemCount;
        boolean z10 = this.isOwner;
        Icon icon = this.icon;
        StringBuilder s10 = f.s("CollectionMeta(id=", str, ", title=", str2, ", subtitle=");
        f.x(s10, str3, ", description=", str4, ", imageUrl=");
        f.y(s10, str5, ", hasUnread=", z6, ", lastOpenedAt=");
        s10.append(date);
        s10.append(", updatedAt=");
        s10.append(date2);
        s10.append(", category=");
        s10.append(str6);
        s10.append(", itemCount=");
        s10.append(l4);
        s10.append(", isOwner=");
        s10.append(z10);
        s10.append(", icon=");
        s10.append(icon);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
