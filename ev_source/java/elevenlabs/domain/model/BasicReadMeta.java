package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/BasicReadMeta;", "", "readId", "", "title", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getTitle", "getImageUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class BasicReadMeta {
    private final String imageUrl;
    private final String readId;
    private final String title;

    public BasicReadMeta(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.readId = str;
        this.title = str2;
        this.imageUrl = str3;
    }

    public static /* synthetic */ BasicReadMeta copy$default(BasicReadMeta basicReadMeta, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = basicReadMeta.readId;
        }
        if ((i10 & 2) != 0) {
            str2 = basicReadMeta.title;
        }
        if ((i10 & 4) != 0) {
            str3 = basicReadMeta.imageUrl;
        }
        return basicReadMeta.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final BasicReadMeta copy(String readId, String title, String imageUrl) {
        readId.getClass();
        title.getClass();
        return new BasicReadMeta(readId, title, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicReadMeta)) {
            return false;
        }
        BasicReadMeta basicReadMeta = (BasicReadMeta) other;
        if (m.c(this.readId, basicReadMeta.readId) && m.c(this.title, basicReadMeta.title) && m.c(this.imageUrl, basicReadMeta.imageUrl)) {
            return true;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(this.readId.hashCode() * 31, 31, this.title);
        String str = this.imageUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        return f.l(this.imageUrl, Separators.RPAREN, f.s("BasicReadMeta(readId=", this.readId, ", title=", this.title, ", imageUrl="));
    }

    public /* synthetic */ BasicReadMeta(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
