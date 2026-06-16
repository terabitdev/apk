package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/VoiceCollection;", "", "id", "", "title", "coverImageUrl", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getCoverImageUrl", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class VoiceCollection {
    private final String backgroundColor;
    private final String coverImageUrl;
    private final String id;
    private final String title;

    public VoiceCollection(String str, String str2, String str3, String str4) {
        c.u(str, str2, str3, str4);
        this.id = str;
        this.title = str2;
        this.coverImageUrl = str3;
        this.backgroundColor = str4;
    }

    public static /* synthetic */ VoiceCollection copy$default(VoiceCollection voiceCollection, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voiceCollection.id;
        }
        if ((i10 & 2) != 0) {
            str2 = voiceCollection.title;
        }
        if ((i10 & 4) != 0) {
            str3 = voiceCollection.coverImageUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = voiceCollection.backgroundColor;
        }
        return voiceCollection.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final VoiceCollection copy(String id2, String title, String coverImageUrl, String backgroundColor) {
        id2.getClass();
        title.getClass();
        coverImageUrl.getClass();
        backgroundColor.getClass();
        return new VoiceCollection(id2, title, coverImageUrl, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceCollection)) {
            return false;
        }
        VoiceCollection voiceCollection = (VoiceCollection) other;
        if (m.c(this.id, voiceCollection.id) && m.c(this.title, voiceCollection.title) && m.c(this.coverImageUrl, voiceCollection.coverImageUrl) && m.c(this.backgroundColor, voiceCollection.backgroundColor)) {
            return true;
        }
        return false;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + c.c(c.c(this.id.hashCode() * 31, 31, this.title), 31, this.coverImageUrl);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        return f.n(f.s("VoiceCollection(id=", str, ", title=", str2, ", coverImageUrl="), this.coverImageUrl, ", backgroundColor=", this.backgroundColor, Separators.RPAREN);
    }
}
