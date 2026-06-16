package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/EmptyStateSection;", "", "title", "", "subtitle", "buttonText", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getButtonText", "getDeeplink", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class EmptyStateSection {
    private final String buttonText;
    private final String deeplink;
    private final String subtitle;
    private final String title;

    public EmptyStateSection(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
        this.buttonText = str3;
        this.deeplink = str4;
    }

    public static /* synthetic */ EmptyStateSection copy$default(EmptyStateSection emptyStateSection, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emptyStateSection.title;
        }
        if ((i10 & 2) != 0) {
            str2 = emptyStateSection.subtitle;
        }
        if ((i10 & 4) != 0) {
            str3 = emptyStateSection.buttonText;
        }
        if ((i10 & 8) != 0) {
            str4 = emptyStateSection.deeplink;
        }
        return emptyStateSection.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final EmptyStateSection copy(String title, String subtitle, String buttonText, String deeplink) {
        title.getClass();
        subtitle.getClass();
        return new EmptyStateSection(title, subtitle, buttonText, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateSection)) {
            return false;
        }
        EmptyStateSection emptyStateSection = (EmptyStateSection) other;
        if (m.c(this.title, emptyStateSection.title) && m.c(this.subtitle, emptyStateSection.subtitle) && m.c(this.buttonText, emptyStateSection.buttonText) && m.c(this.deeplink, emptyStateSection.deeplink)) {
            return true;
        }
        return false;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.buttonText;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.deeplink;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return f.n(f.s("EmptyStateSection(title=", str, ", subtitle=", str2, ", buttonText="), this.buttonText, ", deeplink=", this.deeplink, Separators.RPAREN);
    }
}
