package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/model/ChapterContent;", "", "chapterIndex", "", "elements", "", "", "offsetsToElementsMap", "", "", "positionConverter", "Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "<init>", "(ILjava/util/List;Ljava/util/Map;Lio/elevenlabs/domain/model/HighlighterPositionConverter;)V", "getChapterIndex", "()I", "getElements", "()Ljava/util/List;", "getOffsetsToElementsMap", "()Ljava/util/Map;", "getPositionConverter", "()Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ChapterContent {
    private final int chapterIndex;
    private final List<String> elements;
    private final Map<Long, Integer> offsetsToElementsMap;
    private final HighlighterPositionConverter positionConverter;

    public ChapterContent(int i10, List<String> list, Map<Long, Integer> map, HighlighterPositionConverter highlighterPositionConverter) {
        list.getClass();
        map.getClass();
        highlighterPositionConverter.getClass();
        this.chapterIndex = i10;
        this.elements = list;
        this.offsetsToElementsMap = map;
        this.positionConverter = highlighterPositionConverter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChapterContent copy$default(ChapterContent chapterContent, int i10, List list, Map map, HighlighterPositionConverter highlighterPositionConverter, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = chapterContent.chapterIndex;
        }
        if ((i11 & 2) != 0) {
            list = chapterContent.elements;
        }
        if ((i11 & 4) != 0) {
            map = chapterContent.offsetsToElementsMap;
        }
        if ((i11 & 8) != 0) {
            highlighterPositionConverter = chapterContent.positionConverter;
        }
        return chapterContent.copy(i10, list, map, highlighterPositionConverter);
    }

    /* renamed from: component1, reason: from getter */
    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    public final List<String> component2() {
        return this.elements;
    }

    public final Map<Long, Integer> component3() {
        return this.offsetsToElementsMap;
    }

    /* renamed from: component4, reason: from getter */
    public final HighlighterPositionConverter getPositionConverter() {
        return this.positionConverter;
    }

    public final ChapterContent copy(int chapterIndex, List<String> elements, Map<Long, Integer> offsetsToElementsMap, HighlighterPositionConverter positionConverter) {
        elements.getClass();
        offsetsToElementsMap.getClass();
        positionConverter.getClass();
        return new ChapterContent(chapterIndex, elements, offsetsToElementsMap, positionConverter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChapterContent)) {
            return false;
        }
        ChapterContent chapterContent = (ChapterContent) other;
        if (this.chapterIndex == chapterContent.chapterIndex && m.c(this.elements, chapterContent.elements) && m.c(this.offsetsToElementsMap, chapterContent.offsetsToElementsMap) && m.c(this.positionConverter, chapterContent.positionConverter)) {
            return true;
        }
        return false;
    }

    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    public final List<String> getElements() {
        return this.elements;
    }

    public final Map<Long, Integer> getOffsetsToElementsMap() {
        return this.offsetsToElementsMap;
    }

    public final HighlighterPositionConverter getPositionConverter() {
        return this.positionConverter;
    }

    public int hashCode() {
        return this.positionConverter.hashCode() + f.a(this.offsetsToElementsMap, n.d(Integer.hashCode(this.chapterIndex) * 31, 31, this.elements), 31);
    }

    public String toString() {
        return "ChapterContent(chapterIndex=" + this.chapterIndex + ", elements=" + this.elements + ", offsetsToElementsMap=" + this.offsetsToElementsMap + ", positionConverter=" + this.positionConverter + Separators.RPAREN;
    }
}
