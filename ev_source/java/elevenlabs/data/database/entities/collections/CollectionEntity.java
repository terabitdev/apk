package io.elevenlabs.data.database.entities.collections;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0098\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\u0014\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u000205HÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u000f\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u00067"}, d2 = {"Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "", "id", "", "title", "subtitle", "has_unread", "", "description", "image_url", "last_opened_at_unix", "", "updated_at_unix", "category", "item_count", "is_owner", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getHas_unread", "()Z", "getDescription", "getImage_url", "getLast_opened_at_unix", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUpdated_at_unix", "getCategory", "getItem_count", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class CollectionEntity {
    private final String category;
    private final String description;
    private final boolean has_unread;
    private final String icon;
    private final String id;
    private final String image_url;
    private final Boolean is_owner;
    private final Long item_count;
    private final Long last_opened_at_unix;
    private final String subtitle;
    private final String title;
    private final Long updated_at_unix;

    public CollectionEntity(String str, String str2, String str3, boolean z6, String str4, String str5, Long l4, Long l7, String str6, Long l10, Boolean bool, String str7) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.has_unread = z6;
        this.description = str4;
        this.image_url = str5;
        this.last_opened_at_unix = l4;
        this.updated_at_unix = l7;
        this.category = str6;
        this.item_count = l10;
        this.is_owner = bool;
        this.icon = str7;
    }

    public static /* synthetic */ CollectionEntity copy$default(CollectionEntity collectionEntity, String str, String str2, String str3, boolean z6, String str4, String str5, Long l4, Long l7, String str6, Long l10, Boolean bool, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collectionEntity.id;
        }
        if ((i10 & 2) != 0) {
            str2 = collectionEntity.title;
        }
        if ((i10 & 4) != 0) {
            str3 = collectionEntity.subtitle;
        }
        if ((i10 & 8) != 0) {
            z6 = collectionEntity.has_unread;
        }
        if ((i10 & 16) != 0) {
            str4 = collectionEntity.description;
        }
        if ((i10 & 32) != 0) {
            str5 = collectionEntity.image_url;
        }
        if ((i10 & 64) != 0) {
            l4 = collectionEntity.last_opened_at_unix;
        }
        if ((i10 & 128) != 0) {
            l7 = collectionEntity.updated_at_unix;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str6 = collectionEntity.category;
        }
        if ((i10 & 512) != 0) {
            l10 = collectionEntity.item_count;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            bool = collectionEntity.is_owner;
        }
        if ((i10 & 2048) != 0) {
            str7 = collectionEntity.icon;
        }
        Boolean bool2 = bool;
        String str8 = str7;
        String str9 = str6;
        Long l11 = l10;
        Long l12 = l4;
        Long l13 = l7;
        String str10 = str4;
        String str11 = str5;
        return collectionEntity.copy(str, str2, str3, z6, str10, str11, l12, l13, str9, l11, bool2, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getItem_count() {
        return this.item_count;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIs_owner() {
        return this.is_owner;
    }

    /* renamed from: component12, reason: from getter */
    public final String getIcon() {
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
    public final boolean getHas_unread() {
        return this.has_unread;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImage_url() {
        return this.image_url;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getLast_opened_at_unix() {
        return this.last_opened_at_unix;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getUpdated_at_unix() {
        return this.updated_at_unix;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final CollectionEntity copy(String id2, String title, String subtitle, boolean has_unread, String description, String image_url, Long last_opened_at_unix, Long updated_at_unix, String category, Long item_count, Boolean is_owner, String icon) {
        id2.getClass();
        title.getClass();
        return new CollectionEntity(id2, title, subtitle, has_unread, description, image_url, last_opened_at_unix, updated_at_unix, category, item_count, is_owner, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionEntity)) {
            return false;
        }
        CollectionEntity collectionEntity = (CollectionEntity) other;
        if (m.c(this.id, collectionEntity.id) && m.c(this.title, collectionEntity.title) && m.c(this.subtitle, collectionEntity.subtitle) && this.has_unread == collectionEntity.has_unread && m.c(this.description, collectionEntity.description) && m.c(this.image_url, collectionEntity.image_url) && m.c(this.last_opened_at_unix, collectionEntity.last_opened_at_unix) && m.c(this.updated_at_unix, collectionEntity.updated_at_unix) && m.c(this.category, collectionEntity.category) && m.c(this.item_count, collectionEntity.item_count) && m.c(this.is_owner, collectionEntity.is_owner) && m.c(this.icon, collectionEntity.icon)) {
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

    public final boolean getHas_unread() {
        return this.has_unread;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final Long getItem_count() {
        return this.item_count;
    }

    public final Long getLast_opened_at_unix() {
        return this.last_opened_at_unix;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUpdated_at_unix() {
        return this.updated_at_unix;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int c5 = c.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = b.f((c5 + hashCode) * 31, 31, this.has_unread);
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        String str3 = this.image_url;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Long l4 = this.last_opened_at_unix;
        if (l4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Long l7 = this.updated_at_unix;
        if (l7 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l7.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str4 = this.category;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Long l10 = this.item_count;
        if (l10 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l10.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        Boolean bool = this.is_owner;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str5 = this.icon;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return i17 + i10;
    }

    public final Boolean is_owner() {
        return this.is_owner;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        boolean z6 = this.has_unread;
        String str4 = this.description;
        String str5 = this.image_url;
        Long l4 = this.last_opened_at_unix;
        Long l7 = this.updated_at_unix;
        String str6 = this.category;
        Long l10 = this.item_count;
        Boolean bool = this.is_owner;
        String str7 = this.icon;
        StringBuilder s10 = f.s("CollectionEntity(id=", str, ", title=", str2, ", subtitle=");
        f.y(s10, str3, ", has_unread=", z6, ", description=");
        f.x(s10, str4, ", image_url=", str5, ", last_opened_at_unix=");
        s10.append(l4);
        s10.append(", updated_at_unix=");
        s10.append(l7);
        s10.append(", category=");
        s10.append(str6);
        s10.append(", item_count=");
        s10.append(l10);
        s10.append(", is_owner=");
        s10.append(bool);
        s10.append(", icon=");
        s10.append(str7);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
