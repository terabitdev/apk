package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import ib.i;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/AuthorActionsSection;", "", "authorId", "", "authorName", "shareLink", "isFollowing", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAuthorId", "()Ljava/lang/String;", "getAuthorName", "getShareLink", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AuthorActionsSection {
    private final String authorId;
    private final String authorName;
    private final boolean isFollowing;
    private final String shareLink;

    public AuthorActionsSection(String str, String str2, String str3, boolean z6) {
        i.s(str, str2, str3);
        this.authorId = str;
        this.authorName = str2;
        this.shareLink = str3;
        this.isFollowing = z6;
    }

    public static /* synthetic */ AuthorActionsSection copy$default(AuthorActionsSection authorActionsSection, String str, String str2, String str3, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authorActionsSection.authorId;
        }
        if ((i10 & 2) != 0) {
            str2 = authorActionsSection.authorName;
        }
        if ((i10 & 4) != 0) {
            str3 = authorActionsSection.shareLink;
        }
        if ((i10 & 8) != 0) {
            z6 = authorActionsSection.isFollowing;
        }
        return authorActionsSection.copy(str, str2, str3, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShareLink() {
        return this.shareLink;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    public final AuthorActionsSection copy(String authorId, String authorName, String shareLink, boolean isFollowing) {
        authorId.getClass();
        authorName.getClass();
        shareLink.getClass();
        return new AuthorActionsSection(authorId, authorName, shareLink, isFollowing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorActionsSection)) {
            return false;
        }
        AuthorActionsSection authorActionsSection = (AuthorActionsSection) other;
        if (m.c(this.authorId, authorActionsSection.authorId) && m.c(this.authorName, authorActionsSection.authorName) && m.c(this.shareLink, authorActionsSection.shareLink) && this.isFollowing == authorActionsSection.isFollowing) {
            return true;
        }
        return false;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getShareLink() {
        return this.shareLink;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFollowing) + c.c(c.c(this.authorId.hashCode() * 31, 31, this.authorName), 31, this.shareLink);
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public String toString() {
        String str = this.authorId;
        String str2 = this.authorName;
        String str3 = this.shareLink;
        boolean z6 = this.isFollowing;
        StringBuilder s10 = f.s("AuthorActionsSection(authorId=", str, ", authorName=", str2, ", shareLink=");
        s10.append(str3);
        s10.append(", isFollowing=");
        s10.append(z6);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
