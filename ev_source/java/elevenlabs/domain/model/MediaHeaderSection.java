package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J_\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006'"}, d2 = {"Lio/elevenlabs/domain/model/MediaHeaderSection;", "", "image", "Lio/elevenlabs/domain/model/SizeableHeaderImage;", "title", "", "author", "authorId", "tags", "", "Lio/elevenlabs/domain/model/Tag;", "subtitle", "metaLabel", "<init>", "(Lio/elevenlabs/domain/model/SizeableHeaderImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Lio/elevenlabs/domain/model/SizeableHeaderImage;", "getTitle", "()Ljava/lang/String;", "getAuthor", "getAuthorId", "getTags", "()Ljava/util/List;", "getSubtitle", "getMetaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class MediaHeaderSection {
    private final String author;
    private final String authorId;
    private final SizeableHeaderImage image;
    private final String metaLabel;
    private final String subtitle;
    private final List<Tag> tags;
    private final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MediaHeaderSection(SizeableHeaderImage sizeableHeaderImage, String str, String str2, String str3, List list, String str4, String str5, int i10, f fVar) {
        this(sizeableHeaderImage, str, str2, str3, list, str4, r9);
        String str6;
        sizeableHeaderImage = (i10 & 1) != 0 ? null : sizeableHeaderImage;
        str2 = (i10 & 4) != 0 ? null : str2;
        str3 = (i10 & 8) != 0 ? null : str3;
        list = (i10 & 16) != 0 ? t.f33547a : list;
        str4 = (i10 & 32) != 0 ? null : str4;
        if ((i10 & 64) != 0) {
            str6 = null;
        } else {
            str6 = str5;
        }
    }

    public static /* synthetic */ MediaHeaderSection copy$default(MediaHeaderSection mediaHeaderSection, SizeableHeaderImage sizeableHeaderImage, String str, String str2, String str3, List list, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sizeableHeaderImage = mediaHeaderSection.image;
        }
        if ((i10 & 2) != 0) {
            str = mediaHeaderSection.title;
        }
        if ((i10 & 4) != 0) {
            str2 = mediaHeaderSection.author;
        }
        if ((i10 & 8) != 0) {
            str3 = mediaHeaderSection.authorId;
        }
        if ((i10 & 16) != 0) {
            list = mediaHeaderSection.tags;
        }
        if ((i10 & 32) != 0) {
            str4 = mediaHeaderSection.subtitle;
        }
        if ((i10 & 64) != 0) {
            str5 = mediaHeaderSection.metaLabel;
        }
        String str6 = str4;
        String str7 = str5;
        List list2 = list;
        String str8 = str2;
        return mediaHeaderSection.copy(sizeableHeaderImage, str, str8, str3, list2, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final SizeableHeaderImage getImage() {
        return this.image;
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
    public final String getAuthorId() {
        return this.authorId;
    }

    public final List<Tag> component5() {
        return this.tags;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetaLabel() {
        return this.metaLabel;
    }

    public final MediaHeaderSection copy(SizeableHeaderImage image, String title, String author, String authorId, List<Tag> tags, String subtitle, String metaLabel) {
        title.getClass();
        tags.getClass();
        return new MediaHeaderSection(image, title, author, authorId, tags, subtitle, metaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaHeaderSection)) {
            return false;
        }
        MediaHeaderSection mediaHeaderSection = (MediaHeaderSection) other;
        if (m.c(this.image, mediaHeaderSection.image) && m.c(this.title, mediaHeaderSection.title) && m.c(this.author, mediaHeaderSection.author) && m.c(this.authorId, mediaHeaderSection.authorId) && m.c(this.tags, mediaHeaderSection.tags) && m.c(this.subtitle, mediaHeaderSection.subtitle) && m.c(this.metaLabel, mediaHeaderSection.metaLabel)) {
            return true;
        }
        return false;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final SizeableHeaderImage getImage() {
        return this.image;
    }

    public final String getMetaLabel() {
        return this.metaLabel;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Tag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        SizeableHeaderImage sizeableHeaderImage = this.image;
        int i10 = 0;
        if (sizeableHeaderImage == null) {
            hashCode = 0;
        } else {
            hashCode = sizeableHeaderImage.hashCode();
        }
        int c5 = c.c(hashCode * 31, 31, this.title);
        String str = this.author;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (c5 + hashCode2) * 31;
        String str2 = this.authorId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int d10 = n.d((i11 + hashCode3) * 31, 31, this.tags);
        String str3 = this.subtitle;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (d10 + hashCode4) * 31;
        String str4 = this.metaLabel;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        SizeableHeaderImage sizeableHeaderImage = this.image;
        String str = this.title;
        String str2 = this.author;
        String str3 = this.authorId;
        List<Tag> list = this.tags;
        String str4 = this.subtitle;
        String str5 = this.metaLabel;
        StringBuilder sb = new StringBuilder("MediaHeaderSection(image=");
        sb.append(sizeableHeaderImage);
        sb.append(", title=");
        sb.append(str);
        sb.append(", author=");
        defpackage.f.x(sb, str2, ", authorId=", str3, ", tags=");
        sb.append(list);
        sb.append(", subtitle=");
        sb.append(str4);
        sb.append(", metaLabel=");
        return defpackage.f.l(str5, Separators.RPAREN, sb);
    }

    public MediaHeaderSection(SizeableHeaderImage sizeableHeaderImage, String str, String str2, String str3, List<Tag> list, String str4, String str5) {
        str.getClass();
        list.getClass();
        this.image = sizeableHeaderImage;
        this.title = str;
        this.author = str2;
        this.authorId = str3;
        this.tags = list;
        this.subtitle = str4;
        this.metaLabel = str5;
    }
}
