package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import io.elevenlabs.data.model.ResourceTag;
import io.elevenlabs.data.model.ResourceTag$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJn\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010\u0015R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010\u001aR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010\u001cR \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010\u001cR \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bD\u00104\u001a\u0004\bC\u0010\u001c¨\u0006G"}, d2 = {"Lio/elevenlabs/data/model/response/AuthorHeaderSection;", "Lio/elevenlabs/data/model/response/AuthorProfileSection;", "", DiagnosticsEntry.NAME_KEY, "bio", "avatarUrl", "penName", "", "Lio/elevenlabs/data/model/ResourceTag;", "resourceTags", "", "bookCount", "seriesCount", "followersCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;III)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIILur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()I", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;III)Lio/elevenlabs/data/model/response/AuthorHeaderSection;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/AuthorHeaderSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getBio", "getBio$annotations", "getAvatarUrl", "getAvatarUrl$annotations", "getPenName", "getPenName$annotations", "Ljava/util/List;", "getResourceTags", "getResourceTags$annotations", TokenNames.I, "getBookCount", "getBookCount$annotations", "getSeriesCount", "getSeriesCount$annotations", "getFollowersCount", "getFollowersCount$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class AuthorHeaderSection implements AuthorProfileSection {
    private final String avatarUrl;
    private final String bio;
    private final int bookCount;
    private final int followersCount;
    private final String name;
    private final String penName;
    private final List<ResourceTag> resourceTags;
    private final int seriesCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, sn.a.d(i.f31597b, new io.elevenlabs.data.model.a(8)), null, null, null};

    public /* synthetic */ AuthorHeaderSection(int i10, String str, String str2, String str3, String str4, List list, int i11, int i12, int i13, c1 c1Var) {
        if (225 == (i10 & 225)) {
            this.name = str;
            if ((i10 & 2) == 0) {
                this.bio = null;
            } else {
                this.bio = str2;
            }
            if ((i10 & 4) == 0) {
                this.avatarUrl = null;
            } else {
                this.avatarUrl = str3;
            }
            if ((i10 & 8) == 0) {
                this.penName = null;
            } else {
                this.penName = str4;
            }
            if ((i10 & 16) == 0) {
                this.resourceTags = null;
            } else {
                this.resourceTags = list;
            }
            this.bookCount = i11;
            this.seriesCount = i12;
            this.followersCount = i13;
            return;
        }
        t0.j(i10, 225, AuthorHeaderSection$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(ResourceTag$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ AuthorHeaderSection copy$default(AuthorHeaderSection authorHeaderSection, String str, String str2, String str3, String str4, List list, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = authorHeaderSection.name;
        }
        if ((i13 & 2) != 0) {
            str2 = authorHeaderSection.bio;
        }
        if ((i13 & 4) != 0) {
            str3 = authorHeaderSection.avatarUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = authorHeaderSection.penName;
        }
        if ((i13 & 16) != 0) {
            list = authorHeaderSection.resourceTags;
        }
        if ((i13 & 32) != 0) {
            i10 = authorHeaderSection.bookCount;
        }
        if ((i13 & 64) != 0) {
            i11 = authorHeaderSection.seriesCount;
        }
        if ((i13 & 128) != 0) {
            i12 = authorHeaderSection.followersCount;
        }
        int i14 = i11;
        int i15 = i12;
        List list2 = list;
        int i16 = i10;
        return authorHeaderSection.copy(str, str2, str3, str4, list2, i16, i14, i15);
    }

    public static final /* synthetic */ void write$Self$data_release(AuthorHeaderSection self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.name);
        if (output.C(serialDesc) || self.bio != null) {
            output.o(serialDesc, 1, g1.f34588a, self.bio);
        }
        if (output.C(serialDesc) || self.avatarUrl != null) {
            output.o(serialDesc, 2, g1.f34588a, self.avatarUrl);
        }
        if (output.C(serialDesc) || self.penName != null) {
            output.o(serialDesc, 3, g1.f34588a, self.penName);
        }
        if (output.C(serialDesc) || self.resourceTags != null) {
            output.o(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.resourceTags);
        }
        output.P(5, self.bookCount, serialDesc);
        output.P(6, self.seriesCount, serialDesc);
        output.P(7, self.followersCount, serialDesc);
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

    public final List<ResourceTag> component5() {
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

    public final AuthorHeaderSection copy(String r10, String bio, String avatarUrl, String penName, List<ResourceTag> resourceTags, int bookCount, int seriesCount, int followersCount) {
        r10.getClass();
        return new AuthorHeaderSection(r10, bio, avatarUrl, penName, resourceTags, bookCount, seriesCount, followersCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorHeaderSection)) {
            return false;
        }
        AuthorHeaderSection authorHeaderSection = (AuthorHeaderSection) other;
        if (m.c(this.name, authorHeaderSection.name) && m.c(this.bio, authorHeaderSection.bio) && m.c(this.avatarUrl, authorHeaderSection.avatarUrl) && m.c(this.penName, authorHeaderSection.penName) && m.c(this.resourceTags, authorHeaderSection.resourceTags) && this.bookCount == authorHeaderSection.bookCount && this.seriesCount == authorHeaderSection.seriesCount && this.followersCount == authorHeaderSection.followersCount) {
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

    public final List<ResourceTag> getResourceTags() {
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
        List<ResourceTag> list = this.resourceTags;
        if (list != null) {
            i10 = list.hashCode();
        }
        return Integer.hashCode(this.followersCount) + j0.c.b(this.seriesCount, j0.c.b(this.bookCount, (i13 + i10) * 31, 31), 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.bio;
        String str3 = this.avatarUrl;
        String str4 = this.penName;
        List<ResourceTag> list = this.resourceTags;
        int i10 = this.bookCount;
        int i11 = this.seriesCount;
        int i12 = this.followersCount;
        StringBuilder s10 = f.s("AuthorHeaderSection(name=", str, ", bio=", str2, ", avatarUrl=");
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

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/AuthorHeaderSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/AuthorHeaderSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AuthorHeaderSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAvatarUrl$annotations() {
    }

    public static /* synthetic */ void getBio$annotations() {
    }

    public static /* synthetic */ void getBookCount$annotations() {
    }

    public static /* synthetic */ void getFollowersCount$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getPenName$annotations() {
    }

    public static /* synthetic */ void getResourceTags$annotations() {
    }

    public static /* synthetic */ void getSeriesCount$annotations() {
    }

    public AuthorHeaderSection(String str, String str2, String str3, String str4, List<ResourceTag> list, int i10, int i11, int i12) {
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AuthorHeaderSection(String str, String str2, String str3, String str4, List list, int i10, int i11, int i12, int i13, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, str4, r7, r8, r9, r10);
        int i14;
        int i15;
        int i16;
        List list2;
        str2 = (i13 & 2) != 0 ? null : str2;
        str3 = (i13 & 4) != 0 ? null : str3;
        str4 = (i13 & 8) != 0 ? null : str4;
        if ((i13 & 16) != 0) {
            i14 = i12;
            i15 = i11;
            i16 = i10;
            list2 = null;
        } else {
            i14 = i12;
            i15 = i11;
            i16 = i10;
            list2 = list;
        }
    }
}
