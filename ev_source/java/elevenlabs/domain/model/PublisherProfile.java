package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010*\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0097\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R%\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00063"}, d2 = {"Lio/elevenlabs/domain/model/PublisherProfile;", "", "profileId", "", DiagnosticsEntry.NAME_KEY, "createdAt", "Ljava/util/Date;", "updatedAt", "bio", "avatarUrl", "dateOfBirth", FirebaseAnalytics.Param.ORIGIN, "websiteLink", "socialLinks", "", "", "penName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getProfileId", "()Ljava/lang/String;", "getName", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getBio", "getAvatarUrl", "getDateOfBirth", "getOrigin", "getWebsiteLink", "getSocialLinks", "()Ljava/util/List;", "getPenName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class PublisherProfile {
    private final String avatarUrl;
    private final String bio;
    private final Date createdAt;
    private final String dateOfBirth;
    private final String name;
    private final String origin;
    private final String penName;
    private final String profileId;
    private final List<Map<String, String>> socialLinks;
    private final Date updatedAt;
    private final String websiteLink;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PublisherProfile(String str, String str2, Date date, Date date2, String str3, String str4, String str5, String str6, String str7, List list, String str8, int i10, f fVar) {
        this(str, str2, date, date2, str3, str4, str5, str6, str7, list, r13);
        String str9;
        str3 = (i10 & 16) != 0 ? null : str3;
        str4 = (i10 & 32) != 0 ? null : str4;
        str5 = (i10 & 64) != 0 ? null : str5;
        str6 = (i10 & 128) != 0 ? null : str6;
        str7 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : str7;
        list = (i10 & 512) != 0 ? null : list;
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str9 = null;
        } else {
            str9 = str8;
        }
    }

    public static /* synthetic */ PublisherProfile copy$default(PublisherProfile publisherProfile, String str, String str2, Date date, Date date2, String str3, String str4, String str5, String str6, String str7, List list, String str8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = publisherProfile.profileId;
        }
        if ((i10 & 2) != 0) {
            str2 = publisherProfile.name;
        }
        if ((i10 & 4) != 0) {
            date = publisherProfile.createdAt;
        }
        if ((i10 & 8) != 0) {
            date2 = publisherProfile.updatedAt;
        }
        if ((i10 & 16) != 0) {
            str3 = publisherProfile.bio;
        }
        if ((i10 & 32) != 0) {
            str4 = publisherProfile.avatarUrl;
        }
        if ((i10 & 64) != 0) {
            str5 = publisherProfile.dateOfBirth;
        }
        if ((i10 & 128) != 0) {
            str6 = publisherProfile.origin;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str7 = publisherProfile.websiteLink;
        }
        if ((i10 & 512) != 0) {
            list = publisherProfile.socialLinks;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str8 = publisherProfile.penName;
        }
        List list2 = list;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        String str14 = str3;
        Date date3 = date;
        return publisherProfile.copy(str, str2, date3, date2, str14, str12, str13, str10, str11, list2, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProfileId() {
        return this.profileId;
    }

    public final List<Map<String, String>> component10() {
        return this.socialLinks;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPenName() {
        return this.penName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWebsiteLink() {
        return this.websiteLink;
    }

    public final PublisherProfile copy(String profileId, String name, Date createdAt, Date updatedAt, String bio, String avatarUrl, String dateOfBirth, String origin, String websiteLink, List<? extends Map<String, String>> socialLinks, String penName) {
        profileId.getClass();
        name.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        return new PublisherProfile(profileId, name, createdAt, updatedAt, bio, avatarUrl, dateOfBirth, origin, websiteLink, socialLinks, penName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublisherProfile)) {
            return false;
        }
        PublisherProfile publisherProfile = (PublisherProfile) other;
        if (m.c(this.profileId, publisherProfile.profileId) && m.c(this.name, publisherProfile.name) && m.c(this.createdAt, publisherProfile.createdAt) && m.c(this.updatedAt, publisherProfile.updatedAt) && m.c(this.bio, publisherProfile.bio) && m.c(this.avatarUrl, publisherProfile.avatarUrl) && m.c(this.dateOfBirth, publisherProfile.dateOfBirth) && m.c(this.origin, publisherProfile.origin) && m.c(this.websiteLink, publisherProfile.websiteLink) && m.c(this.socialLinks, publisherProfile.socialLinks) && m.c(this.penName, publisherProfile.penName)) {
            return true;
        }
        return false;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBio() {
        return this.bio;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getPenName() {
        return this.penName;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final List<Map<String, String>> getSocialLinks() {
        return this.socialLinks;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getWebsiteLink() {
        return this.websiteLink;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = (this.updatedAt.hashCode() + ((this.createdAt.hashCode() + c.c(this.profileId.hashCode() * 31, 31, this.name)) * 31)) * 31;
        String str = this.bio;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode7 + hashCode) * 31;
        String str2 = this.avatarUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.dateOfBirth;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.origin;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.websiteLink;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        List<Map<String, String>> list = this.socialLinks;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str6 = this.penName;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return i16 + i10;
    }

    public String toString() {
        String str = this.profileId;
        String str2 = this.name;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        String str3 = this.bio;
        String str4 = this.avatarUrl;
        String str5 = this.dateOfBirth;
        String str6 = this.origin;
        String str7 = this.websiteLink;
        List<Map<String, String>> list = this.socialLinks;
        String str8 = this.penName;
        StringBuilder s10 = defpackage.f.s("PublisherProfile(profileId=", str, ", name=", str2, ", createdAt=");
        s10.append(date);
        s10.append(", updatedAt=");
        s10.append(date2);
        s10.append(", bio=");
        defpackage.f.x(s10, str3, ", avatarUrl=", str4, ", dateOfBirth=");
        defpackage.f.x(s10, str5, ", origin=", str6, ", websiteLink=");
        s10.append(str7);
        s10.append(", socialLinks=");
        s10.append(list);
        s10.append(", penName=");
        return defpackage.f.l(str8, Separators.RPAREN, s10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PublisherProfile(String str, String str2, Date date, Date date2, String str3, String str4, String str5, String str6, String str7, List<? extends Map<String, String>> list, String str8) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        this.profileId = str;
        this.name = str2;
        this.createdAt = date;
        this.updatedAt = date2;
        this.bio = str3;
        this.avatarUrl = str4;
        this.dateOfBirth = str5;
        this.origin = str6;
        this.websiteLink = str7;
        this.socialLinks = list;
        this.penName = str8;
    }
}
