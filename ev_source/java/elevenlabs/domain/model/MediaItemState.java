package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import ib.i;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lio/elevenlabs/domain/model/MediaItemState;", "", "readId", "", "title", "author", "coverUrl", "readSource", "Lio/elevenlabs/domain/model/ReadSource;", "originalFileType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/ReadSource;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getTitle", "getAuthor", "getCoverUrl", "getReadSource", "()Lio/elevenlabs/domain/model/ReadSource;", "getOriginalFileType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class MediaItemState {
    private final String author;
    private final String coverUrl;
    private final String originalFileType;
    private final String readId;
    private final ReadSource readSource;
    private final String title;

    public MediaItemState(String str, String str2, String str3, String str4, ReadSource readSource, String str5) {
        i.s(str, str2, str3);
        this.readId = str;
        this.title = str2;
        this.author = str3;
        this.coverUrl = str4;
        this.readSource = readSource;
        this.originalFileType = str5;
    }

    public static /* synthetic */ MediaItemState copy$default(MediaItemState mediaItemState, String str, String str2, String str3, String str4, ReadSource readSource, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mediaItemState.readId;
        }
        if ((i10 & 2) != 0) {
            str2 = mediaItemState.title;
        }
        if ((i10 & 4) != 0) {
            str3 = mediaItemState.author;
        }
        if ((i10 & 8) != 0) {
            str4 = mediaItemState.coverUrl;
        }
        if ((i10 & 16) != 0) {
            readSource = mediaItemState.readSource;
        }
        if ((i10 & 32) != 0) {
            str5 = mediaItemState.originalFileType;
        }
        ReadSource readSource2 = readSource;
        String str6 = str5;
        return mediaItemState.copy(str, str2, str3, str4, readSource2, str6);
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
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final ReadSource getReadSource() {
        return this.readSource;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOriginalFileType() {
        return this.originalFileType;
    }

    public final MediaItemState copy(String readId, String title, String author, String coverUrl, ReadSource readSource, String originalFileType) {
        readId.getClass();
        title.getClass();
        author.getClass();
        return new MediaItemState(readId, title, author, coverUrl, readSource, originalFileType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaItemState)) {
            return false;
        }
        MediaItemState mediaItemState = (MediaItemState) other;
        if (m.c(this.readId, mediaItemState.readId) && m.c(this.title, mediaItemState.title) && m.c(this.author, mediaItemState.author) && m.c(this.coverUrl, mediaItemState.coverUrl) && this.readSource == mediaItemState.readSource && m.c(this.originalFileType, mediaItemState.originalFileType)) {
            return true;
        }
        return false;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getOriginalFileType() {
        return this.originalFileType;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final ReadSource getReadSource() {
        return this.readSource;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c5 = c.c(c.c(this.readId.hashCode() * 31, 31, this.title), 31, this.author);
        String str = this.coverUrl;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        ReadSource readSource = this.readSource;
        if (readSource == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = readSource.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str2 = this.originalFileType;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        String str = this.readId;
        String str2 = this.title;
        String str3 = this.author;
        String str4 = this.coverUrl;
        ReadSource readSource = this.readSource;
        String str5 = this.originalFileType;
        StringBuilder s10 = f.s("MediaItemState(readId=", str, ", title=", str2, ", author=");
        f.x(s10, str3, ", coverUrl=", str4, ", readSource=");
        s10.append(readSource);
        s10.append(", originalFileType=");
        s10.append(str5);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
