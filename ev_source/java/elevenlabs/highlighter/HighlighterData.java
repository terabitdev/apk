package io.elevenlabs.highlighter;

import io.elevenlabs.domain.model.ChapterSlot;
import io.elevenlabs.domain.model.HighlighterPositionConverter;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J:\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/highlighter/HighlighterData;", "", "slots", "", "Lio/elevenlabs/domain/model/ChapterSlot;", "followingContent", "", "bookmarks", "Lio/elevenlabs/highlighter/BookmarkHighlight;", "mergedPositionConverter", "Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "<init>", "(Ljava/util/List;ZLjava/util/List;Lio/elevenlabs/domain/model/HighlighterPositionConverter;)V", "getSlots", "()Ljava/util/List;", "getFollowingContent", "()Z", "getBookmarks", "getMergedPositionConverter", "()Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "equals", "other", "hashCode", "", "copy", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HighlighterData {
    public static final int $stable = 8;
    private final List<BookmarkHighlight> bookmarks;
    private final boolean followingContent;
    private final HighlighterPositionConverter mergedPositionConverter;
    private final List<ChapterSlot> slots;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HighlighterData(List list, boolean z6, List list2, HighlighterPositionConverter highlighterPositionConverter, int i10, kotlin.jvm.internal.f fVar) {
        this(r7 != 0 ? r0 : list, (i10 & 2) != 0 ? true : z6, (i10 & 4) != 0 ? r0 : list2, (i10 & 8) != 0 ? HighlighterPositionConverter.INSTANCE.getEMPTY() : highlighterPositionConverter);
        int i11 = i10 & 1;
        tn.t tVar = tn.t.f33547a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlighterData copy$default(HighlighterData highlighterData, List list, boolean z6, List list2, HighlighterPositionConverter highlighterPositionConverter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = highlighterData.slots;
        }
        if ((i10 & 2) != 0) {
            z6 = highlighterData.followingContent;
        }
        if ((i10 & 4) != 0) {
            list2 = highlighterData.bookmarks;
        }
        if ((i10 & 8) != 0) {
            highlighterPositionConverter = highlighterData.mergedPositionConverter;
        }
        return highlighterData.copy(list, z6, list2, highlighterPositionConverter);
    }

    public final HighlighterData copy(List<ChapterSlot> slots, boolean followingContent, List<BookmarkHighlight> bookmarks, HighlighterPositionConverter mergedPositionConverter) {
        slots.getClass();
        bookmarks.getClass();
        mergedPositionConverter.getClass();
        return new HighlighterData(slots, followingContent, bookmarks, mergedPositionConverter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return false;
    }

    public final List<BookmarkHighlight> getBookmarks() {
        return this.bookmarks;
    }

    public final boolean getFollowingContent() {
        return this.followingContent;
    }

    public final HighlighterPositionConverter getMergedPositionConverter() {
        return this.mergedPositionConverter;
    }

    public final List<ChapterSlot> getSlots() {
        return this.slots;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public HighlighterData(List<ChapterSlot> list, boolean z6, List<BookmarkHighlight> list2, HighlighterPositionConverter highlighterPositionConverter) {
        list.getClass();
        list2.getClass();
        highlighterPositionConverter.getClass();
        this.slots = list;
        this.followingContent = z6;
        this.bookmarks = list2;
        this.mergedPositionConverter = highlighterPositionConverter;
    }

    public HighlighterData() {
        this(null, false, null, null, 15, null);
    }
}
