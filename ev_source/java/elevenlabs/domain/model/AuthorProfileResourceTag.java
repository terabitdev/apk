package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import defpackage.f;
import ib.i;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileResourceTag;", "", ParameterNames.ICON, "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AuthorProfileResourceTag {
    private final String icon;
    private final String title;
    private final String url;

    public AuthorProfileResourceTag(String str, String str2, String str3) {
        i.s(str, str2, str3);
        this.icon = str;
        this.title = str2;
        this.url = str3;
    }

    public static /* synthetic */ AuthorProfileResourceTag copy$default(AuthorProfileResourceTag authorProfileResourceTag, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authorProfileResourceTag.icon;
        }
        if ((i10 & 2) != 0) {
            str2 = authorProfileResourceTag.title;
        }
        if ((i10 & 4) != 0) {
            str3 = authorProfileResourceTag.url;
        }
        return authorProfileResourceTag.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final AuthorProfileResourceTag copy(String icon, String title, String url) {
        icon.getClass();
        title.getClass();
        url.getClass();
        return new AuthorProfileResourceTag(icon, title, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorProfileResourceTag)) {
            return false;
        }
        AuthorProfileResourceTag authorProfileResourceTag = (AuthorProfileResourceTag) other;
        if (m.c(this.icon, authorProfileResourceTag.icon) && m.c(this.title, authorProfileResourceTag.title) && m.c(this.url, authorProfileResourceTag.url)) {
            return true;
        }
        return false;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + c.c(this.icon.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        return f.l(this.url, Separators.RPAREN, f.s("AuthorProfileResourceTag(icon=", this.icon, ", title=", this.title, ", url="));
    }
}
