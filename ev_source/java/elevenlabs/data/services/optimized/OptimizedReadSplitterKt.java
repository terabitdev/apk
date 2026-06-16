package io.elevenlabs.data.services.optimized;

import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.model.ChapterSlotIndex;
import io.elevenlabs.domain.model.HighlighterPositionConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/ChapterSlotIndex;", "Lio/elevenlabs/data/services/optimized/ChapterSlotIndexBlob;", "", "Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;", "Lio/elevenlabs/domain/model/ChapterContent;", "Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", "buildPositionConverter", "Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OptimizedReadSplitterKt {
    private static final HighlighterPositionConverter buildPositionConverter(ChapterContentBlob chapterContentBlob) {
        String audioFileNumber = chapterContentBlob.getAudioFileNumber();
        if (audioFileNumber != null && !chapterContentBlob.getTsPairs().isEmpty()) {
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            for (TsPairBlob tsPairBlob : chapterContentBlob.getTsPairs()) {
                treeMap.put(Long.valueOf(tsPairBlob.getCharOffset()), Double.valueOf(tsPairBlob.getTs()));
                treeMap2.put(Double.valueOf(tsPairBlob.getTs()), Long.valueOf(tsPairBlob.getCharOffset()));
            }
            Map singletonMap = Collections.singletonMap(audioFileNumber, treeMap2);
            singletonMap.getClass();
            Map singletonMap2 = Collections.singletonMap(audioFileNumber, treeMap);
            singletonMap2.getClass();
            return new HighlighterPositionConverter(singletonMap, singletonMap2);
        }
        return HighlighterPositionConverter.INSTANCE.getEMPTY();
    }

    public static final List<ChapterSlotIndex> toDomain(OptimizedReadIndexBlob optimizedReadIndexBlob) {
        optimizedReadIndexBlob.getClass();
        List<ChapterSlotIndexBlob> chapters = optimizedReadIndexBlob.getChapters();
        ArrayList arrayList = new ArrayList(p.a0(chapters, 10));
        Iterator<T> it = chapters.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((ChapterSlotIndexBlob) it.next()));
        }
        return arrayList;
    }

    public static final ChapterSlotIndex toDomain(ChapterSlotIndexBlob chapterSlotIndexBlob) {
        chapterSlotIndexBlob.getClass();
        return new ChapterSlotIndex(chapterSlotIndexBlob.getChapterIndex(), chapterSlotIndexBlob.getFirstElementIndex(), chapterSlotIndexBlob.getElementCount(), chapterSlotIndexBlob.getCharCount(), chapterSlotIndexBlob.getAudioFileNumber(), chapterSlotIndexBlob.getOffsetKeys());
    }

    public static final ChapterContent toDomain(ChapterContentBlob chapterContentBlob) {
        chapterContentBlob.getClass();
        return new ChapterContent(chapterContentBlob.getChapterIndex(), chapterContentBlob.getElements(), chapterContentBlob.getOffsetsToElementsMap(), buildPositionConverter(chapterContentBlob));
    }
}
