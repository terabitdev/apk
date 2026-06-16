package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsAuthorSection;", "", "avatarUrl", "", DiagnosticsEntry.NAME_KEY, "penName", "bio", "authorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getName", "getPenName", "getBio", "getAuthorId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadDetailsAuthorSection {
    private final String authorId;
    private final String avatarUrl;
    private final String bio;
    private final String name;
    private final String penName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReadDetailsAuthorSection(String str, String str2, String str3, String str4, String str5, int i10, f fVar) {
        this(str, str2, str3, r6, r7);
        String str6;
        String str7;
        str = (i10 & 1) != 0 ? null : str;
        str3 = (i10 & 4) != 0 ? null : str3;
        if ((i10 & 8) != 0) {
            str6 = str5;
            str7 = null;
        } else {
            str6 = str5;
            str7 = str4;
        }
    }

    public static /* synthetic */ ReadDetailsAuthorSection copy$default(ReadDetailsAuthorSection readDetailsAuthorSection, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readDetailsAuthorSection.avatarUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = readDetailsAuthorSection.name;
        }
        if ((i10 & 4) != 0) {
            str3 = readDetailsAuthorSection.penName;
        }
        if ((i10 & 8) != 0) {
            str4 = readDetailsAuthorSection.bio;
        }
        if ((i10 & 16) != 0) {
            str5 = readDetailsAuthorSection.authorId;
        }
        String str6 = str5;
        String str7 = str3;
        return readDetailsAuthorSection.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPenName() {
        return this.penName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    public final ReadDetailsAuthorSection copy(String avatarUrl, String name, String penName, String bio, String authorId) {
        name.getClass();
        authorId.getClass();
        return new ReadDetailsAuthorSection(avatarUrl, name, penName, bio, authorId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadDetailsAuthorSection)) {
            return false;
        }
        ReadDetailsAuthorSection readDetailsAuthorSection = (ReadDetailsAuthorSection) other;
        if (m.c(this.avatarUrl, readDetailsAuthorSection.avatarUrl) && m.c(this.name, readDetailsAuthorSection.name) && m.c(this.penName, readDetailsAuthorSection.penName) && m.c(this.bio, readDetailsAuthorSection.bio) && m.c(this.authorId, readDetailsAuthorSection.authorId)) {
            return true;
        }
        return false;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPenName() {
        return this.penName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.avatarUrl;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c5 = c.c(hashCode * 31, 31, this.name);
        String str2 = this.penName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (c5 + hashCode2) * 31;
        String str3 = this.bio;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return this.authorId.hashCode() + ((i11 + i10) * 31);
    }

    public String toString() {
        String str = this.avatarUrl;
        String str2 = this.name;
        String str3 = this.penName;
        String str4 = this.bio;
        String str5 = this.authorId;
        StringBuilder s10 = defpackage.f.s("ReadDetailsAuthorSection(avatarUrl=", str, ", name=", str2, ", penName=");
        defpackage.f.x(s10, str3, ", bio=", str4, ", authorId=");
        return defpackage.f.l(str5, Separators.RPAREN, s10);
    }

    public ReadDetailsAuthorSection(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        str5.getClass();
        this.avatarUrl = str;
        this.name = str2;
        this.penName = str3;
        this.bio = str4;
        this.authorId = str5;
    }
}
