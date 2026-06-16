package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003Jg\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u0006)"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileHeaderSection;", "", DiagnosticsEntry.NAME_KEY, "", "bio", "avatarUrl", "penName", "resourceTags", "", "Lio/elevenlabs/domain/model/AuthorProfileResourceTag;", "bookCount", "", "seriesCount", "followersCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;III)V", "getName", "()Ljava/lang/String;", "getBio", "getAvatarUrl", "getPenName", "getResourceTags", "()Ljava/util/List;", "getBookCount", "()I", "getSeriesCount", "getFollowersCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AuthorProfileHeaderSection {
    private final String avatarUrl;
    private final String bio;
    private final int bookCount;
    private final int followersCount;
    private final String name;
    private final String penName;
    private final List<AuthorProfileResourceTag> resourceTags;
    private final int seriesCount;

    public AuthorProfileHeaderSection(String str, String str2, String str3, String str4, List<AuthorProfileResourceTag> list, int i10, int i11, int i12) {
        str.getClass();
        this.name = str;
        this.bio = str2;
        this.avatarUrl = str3;
        this.penName = str4;
        this.resourceTags = list;
        this.bookCount = i10;
        this.seriesCount = i11;
        this.followersCount = i12;
    }

    public static /* synthetic */ AuthorProfileHeaderSection copy$default(AuthorProfileHeaderSection authorProfileHeaderSection, String str, String str2, String str3, String str4, List list, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = authorProfileHeaderSection.name;
        }
        if ((i13 & 2) != 0) {
            str2 = authorProfileHeaderSection.bio;
        }
        if ((i13 & 4) != 0) {
            str3 = authorProfileHeaderSection.avatarUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = authorProfileHeaderSection.penName;
        }
        if ((i13 & 16) != 0) {
            list = authorProfileHeaderSection.resourceTags;
        }
        if ((i13 & 32) != 0) {
            i10 = authorProfileHeaderSection.bookCount;
        }
        if ((i13 & 64) != 0) {
            i11 = authorProfileHeaderSection.seriesCount;
        }
        if ((i13 & 128) != 0) {
            i12 = authorProfileHeaderSection.followersCount;
        }
        int i14 = i11;
        int i15 = i12;
        List list2 = list;
        int i16 = i10;
        return authorProfileHeaderSection.copy(str, str2, str3, str4, list2, i16, i14, i15);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPenName() {
        return this.penName;
    }

    public final List<AuthorProfileResourceTag> component5() {
        return this.resourceTags;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBookCount() {
        return this.bookCount;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSeriesCount() {
        return this.seriesCount;
    }

    /* renamed from: component8, reason: from getter */
    public final int getFollowersCount() {
        return this.followersCount;
    }

    public final AuthorProfileHeaderSection copy(String name, String bio, String avatarUrl, String penName, List<AuthorProfileResourceTag> resourceTags, int bookCount, int seriesCount, int followersCount) {
        name.getClass();
        return new AuthorProfileHeaderSection(name, bio, avatarUrl, penName, resourceTags, bookCount, seriesCount, followersCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorProfileHeaderSection)) {
            return false;
        }
        AuthorProfileHeaderSection authorProfileHeaderSection = (AuthorProfileHeaderSection) other;
        if (m.c(this.name, authorProfileHeaderSection.name) && m.c(this.bio, authorProfileHeaderSection.bio) && m.c(this.avatarUrl, authorProfileHeaderSection.avatarUrl) && m.c(this.penName, authorProfileHeaderSection.penName) && m.c(this.resourceTags, authorProfileHeaderSection.resourceTags) && this.bookCount == authorProfileHeaderSection.bookCount && this.seriesCount == authorProfileHeaderSection.seriesCount && this.followersCount == authorProfileHeaderSection.followersCount) {
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

    public final int getBookCount() {
        return this.bookCount;
    }

    public final int getFollowersCount() {
        return this.followersCount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPenName() {
        return this.penName;
    }

    public final List<AuthorProfileResourceTag> getResourceTags() {
        return this.resourceTags;
    }

    public final int getSeriesCount() {
        return this.seriesCount;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.name.hashCode() * 31;
        String str = this.bio;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.avatarUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.penName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        List<AuthorProfileResourceTag> list = this.resourceTags;
        if (list != null) {
            i10 = list.hashCode();
        }
        return Integer.hashCode(this.followersCount) + c.b(this.seriesCount, c.b(this.bookCount, (i13 + i10) * 31, 31), 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.bio;
        String str3 = this.avatarUrl;
        String str4 = this.penName;
        List<AuthorProfileResourceTag> list = this.resourceTags;
        int i10 = this.bookCount;
        int i11 = this.seriesCount;
        int i12 = this.followersCount;
        StringBuilder s10 = f.s("AuthorProfileHeaderSection(name=", str, ", bio=", str2, ", avatarUrl=");
        f.x(s10, str3, ", penName=", str4, ", resourceTags=");
        s10.append(list);
        s10.append(", bookCount=");
        s10.append(i10);
        s10.append(", seriesCount=");
        s10.append(i11);
        s10.append(", followersCount=");
        s10.append(i12);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
