package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterContentKt;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.BookmarkSeekTarget;
import io.elevenlabs.readerapp.usecase.CharacterOffset;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a(\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"createBookmarkFromSelection", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/UiBookmark;", "offsets", "", "Lio/elevenlabs/readerapp/usecase/CharacterOffset;", ParameterNames.TEXT, "", "selection", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/StringRange;", "resolveBookmarkSeekTarget", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/BookmarkSeekTarget;", BackgroundPlayerAction.Bookmark.ACTION_ID, "Lio/elevenlabs/domain/model/Bookmark;", "readMeta", "Lio/elevenlabs/domain/model/ReadMeta;", "DP_PER_CHAR", "", "MIN_PLACEHOLDER_HEIGHT_DP", "", "MAX_PLACEHOLDER_HEIGHT_DP", "PREFETCH_PARALLELISM", "PREFETCH_RADIUS", "CHAPTER_WINDOW_RADIUS", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerViewModelKt {
    private static final int CHAPTER_WINDOW_RADIUS = 1;
    private static final float DP_PER_CHAR = 0.5f;
    private static final int MAX_PLACEHOLDER_HEIGHT_DP = 10000;
    private static final int MIN_PLACEHOLDER_HEIGHT_DP = 800;
    private static final int PREFETCH_PARALLELISM = 1;
    private static final int PREFETCH_RADIUS = 5;

    public static final UiBookmark createBookmarkFromSelection(List<CharacterOffset> list, String str, StringRange stringRange) {
        Object obj;
        list.getClass();
        str.getClass();
        stringRange.getClass();
        if (!list.isEmpty() && str.length() != 0) {
            int startIndex = stringRange.getStartIndex();
            int endIndexInclusive = stringRange.getEndIndexInclusive();
            if (startIndex >= 0 && endIndexInclusive >= startIndex && endIndexInclusive < str.length()) {
                long start = ((CharacterOffset) tn.o.w0(list)).getStart();
                long j4 = startIndex + start;
                long j10 = endIndexInclusive + start;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        CharacterOffset characterOffset = (CharacterOffset) obj;
                        if (j10 >= characterOffset.getStart() && j4 <= characterOffset.getEndExclusive() - 1) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                CharacterOffset characterOffset2 = (CharacterOffset) obj;
                if (characterOffset2 == null) {
                    return null;
                }
                ListIterator<CharacterOffset> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    CharacterOffset previous = listIterator.previous();
                    if (j10 >= previous.getStart() && j4 <= previous.getEndExclusive() - 1) {
                        long start2 = characterOffset2.getStart();
                        long endExclusive = previous.getEndExclusive() - 1;
                        return new UiBookmark(start2, endExclusive, str.substring((int) (start2 - start), Math.min((int) ((endExclusive - start) + 1), str.length())));
                    }
                }
                wq.a.h("List contains no element matching the predicate.");
                return null;
            }
        }
        return null;
    }

    public static final BookmarkSeekTarget resolveBookmarkSeekTarget(Bookmark bookmark, ReadMeta readMeta) {
        Double startTimeSeconds;
        bookmark.getClass();
        readMeta.getClass();
        if (ReadMetaKt.isMediaType(readMeta) && (startTimeSeconds = bookmark.getStartTimeSeconds()) != null) {
            Integer chapterIndex = bookmark.getChapterIndex();
            if (chapterIndex == null) {
                Chapter chapterFor = ChapterContentKt.chapterFor(readMeta.getChapters(), bookmark.getStartOffsetInclusive());
                if (chapterFor != null) {
                    chapterIndex = Integer.valueOf(chapterFor.getIndex());
                } else {
                    chapterIndex = null;
                }
            }
            if (chapterIndex != null) {
                int size = readMeta.getChapters().size();
                int intValue = chapterIndex.intValue();
                if (intValue >= 0 && intValue < size) {
                    return new BookmarkSeekTarget.ChapterRelative(chapterIndex.intValue(), startTimeSeconds.doubleValue());
                }
            }
        }
        return new BookmarkSeekTarget.CharOffset(bookmark.getStartOffsetInclusive());
    }
}
