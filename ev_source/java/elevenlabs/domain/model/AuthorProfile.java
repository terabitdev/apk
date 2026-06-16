package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfile;", "", "sections", "", "Lio/elevenlabs/domain/model/AuthorProfileSection;", "pages", "Lio/elevenlabs/domain/model/AuthorProfilePage;", "isFollowing", "", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "getSections", "()Ljava/util/List;", "getPages", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AuthorProfile {
    private final boolean isFollowing;
    private final List<AuthorProfilePage> pages;
    private final List<AuthorProfileSection> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorProfile(List<? extends AuthorProfileSection> list, List<AuthorProfilePage> list2, boolean z6) {
        list.getClass();
        list2.getClass();
        this.sections = list;
        this.pages = list2;
        this.isFollowing = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorProfile copy$default(AuthorProfile authorProfile, List list, List list2, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = authorProfile.sections;
        }
        if ((i10 & 2) != 0) {
            list2 = authorProfile.pages;
        }
        if ((i10 & 4) != 0) {
            z6 = authorProfile.isFollowing;
        }
        return authorProfile.copy(list, list2, z6);
    }

    public final List<AuthorProfileSection> component1() {
        return this.sections;
    }

    public final List<AuthorProfilePage> component2() {
        return this.pages;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    public final AuthorProfile copy(List<? extends AuthorProfileSection> sections, List<AuthorProfilePage> pages, boolean isFollowing) {
        sections.getClass();
        pages.getClass();
        return new AuthorProfile(sections, pages, isFollowing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorProfile)) {
            return false;
        }
        AuthorProfile authorProfile = (AuthorProfile) other;
        if (m.c(this.sections, authorProfile.sections) && m.c(this.pages, authorProfile.pages) && this.isFollowing == authorProfile.isFollowing) {
            return true;
        }
        return false;
    }

    public final List<AuthorProfilePage> getPages() {
        return this.pages;
    }

    public final List<AuthorProfileSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFollowing) + n.d(this.sections.hashCode() * 31, 31, this.pages);
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public String toString() {
        List<AuthorProfileSection> list = this.sections;
        List<AuthorProfilePage> list2 = this.pages;
        boolean z6 = this.isFollowing;
        StringBuilder sb = new StringBuilder("AuthorProfile(sections=");
        sb.append(list);
        sb.append(", pages=");
        sb.append(list2);
        sb.append(", isFollowing=");
        return n.j(Separators.RPAREN, sb, z6);
    }
}
