package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lio/elevenlabs/domain/model/ChapterSlot;", "", "chapter", "Lio/elevenlabs/domain/model/Chapter;", "firstElementIndex", "", "elementCount", "offsetKeys", "", "", "estimatedHeightDp", FirebaseAnalytics.Param.CONTENT, "Lio/elevenlabs/domain/model/ChapterContent;", "<init>", "(Lio/elevenlabs/domain/model/Chapter;IILjava/util/List;ILio/elevenlabs/domain/model/ChapterContent;)V", "getChapter", "()Lio/elevenlabs/domain/model/Chapter;", "getFirstElementIndex", "()I", "getElementCount", "getOffsetKeys", "()Ljava/util/List;", "getEstimatedHeightDp", "getContent", "()Lio/elevenlabs/domain/model/ChapterContent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ChapterSlot {
    private final Chapter chapter;
    private final ChapterContent content;
    private final int elementCount;
    private final int estimatedHeightDp;
    private final int firstElementIndex;
    private final List<Long> offsetKeys;

    public ChapterSlot(Chapter chapter, int i10, int i11, List<Long> list, int i12, ChapterContent chapterContent) {
        chapter.getClass();
        list.getClass();
        this.chapter = chapter;
        this.firstElementIndex = i10;
        this.elementCount = i11;
        this.offsetKeys = list;
        this.estimatedHeightDp = i12;
        this.content = chapterContent;
    }

    public static /* synthetic */ ChapterSlot copy$default(ChapterSlot chapterSlot, Chapter chapter, int i10, int i11, List list, int i12, ChapterContent chapterContent, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            chapter = chapterSlot.chapter;
        }
        if ((i13 & 2) != 0) {
            i10 = chapterSlot.firstElementIndex;
        }
        if ((i13 & 4) != 0) {
            i11 = chapterSlot.elementCount;
        }
        if ((i13 & 8) != 0) {
            list = chapterSlot.offsetKeys;
        }
        if ((i13 & 16) != 0) {
            i12 = chapterSlot.estimatedHeightDp;
        }
        if ((i13 & 32) != 0) {
            chapterContent = chapterSlot.content;
        }
        int i14 = i12;
        ChapterContent chapterContent2 = chapterContent;
        return chapterSlot.copy(chapter, i10, i11, list, i14, chapterContent2);
    }

    /* renamed from: component1, reason: from getter */
    public final Chapter getChapter() {
        return this.chapter;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFirstElementIndex() {
        return this.firstElementIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final int getElementCount() {
        return this.elementCount;
    }

    public final List<Long> component4() {
        return this.offsetKeys;
    }

    /* renamed from: component5, reason: from getter */
    public final int getEstimatedHeightDp() {
        return this.estimatedHeightDp;
    }

    /* renamed from: component6, reason: from getter */
    public final ChapterContent getContent() {
        return this.content;
    }

    public final ChapterSlot copy(Chapter chapter, int firstElementIndex, int elementCount, List<Long> offsetKeys, int estimatedHeightDp, ChapterContent content) {
        chapter.getClass();
        offsetKeys.getClass();
        return new ChapterSlot(chapter, firstElementIndex, elementCount, offsetKeys, estimatedHeightDp, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChapterSlot)) {
            return false;
        }
        ChapterSlot chapterSlot = (ChapterSlot) other;
        if (m.c(this.chapter, chapterSlot.chapter) && this.firstElementIndex == chapterSlot.firstElementIndex && this.elementCount == chapterSlot.elementCount && m.c(this.offsetKeys, chapterSlot.offsetKeys) && this.estimatedHeightDp == chapterSlot.estimatedHeightDp && m.c(this.content, chapterSlot.content)) {
            return true;
        }
        return false;
    }

    public final Chapter getChapter() {
        return this.chapter;
    }

    public final ChapterContent getContent() {
        return this.content;
    }

    public final int getElementCount() {
        return this.elementCount;
    }

    public final int getEstimatedHeightDp() {
        return this.estimatedHeightDp;
    }

    public final int getFirstElementIndex() {
        return this.firstElementIndex;
    }

    public final List<Long> getOffsetKeys() {
        return this.offsetKeys;
    }

    public int hashCode() {
        int hashCode;
        int b10 = c.b(this.estimatedHeightDp, n.d(c.b(this.elementCount, c.b(this.firstElementIndex, this.chapter.hashCode() * 31, 31), 31), 31, this.offsetKeys), 31);
        ChapterContent chapterContent = this.content;
        if (chapterContent == null) {
            hashCode = 0;
        } else {
            hashCode = chapterContent.hashCode();
        }
        return b10 + hashCode;
    }

    public String toString() {
        return "ChapterSlot(chapter=" + this.chapter + ", firstElementIndex=" + this.firstElementIndex + ", elementCount=" + this.elementCount + ", offsetKeys=" + this.offsetKeys + ", estimatedHeightDp=" + this.estimatedHeightDp + ", content=" + this.content + Separators.RPAREN;
    }

    public /* synthetic */ ChapterSlot(Chapter chapter, int i10, int i11, List list, int i12, ChapterContent chapterContent, int i13, f fVar) {
        this(chapter, i10, i11, list, i12, (i13 & 32) != 0 ? null : chapterContent);
    }
}
