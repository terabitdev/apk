package io.elevenlabs.data.services.optimized;

import eo.m;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterContentKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import tn.a0;
import tn.c0;
import tn.n;
import tn.o;
import tn.p;
import tn.t;
import vq.h;
import vq.k;
import wq.i;
import wq.l;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ=\u0010\u0018\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/data/services/optimized/OptimizedReadSplitter;", "", "<init>", "()V", "Lvq/h;", "", "lines", "preChunkLongLines", "(Lvq/h;)Lvq/h;", "line", "", "exceedsSpanBudget", "(Ljava/lang/String;)Z", "chunkBySpanClose", "(Ljava/lang/String;)Lvq/h;", "mergeIntoTopLevelElements", "", "Lio/elevenlabs/domain/model/Chapter;", "chapters", "Lkotlin/Function1;", "Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", "Lsn/z;", "emit", "Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;", "splitStreaming", "(Lvq/h;Ljava/util/List;Lho/l;)Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;", "Companion", "ChapterAccumulator", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OptimizedReadSplitter {
    public static final int MAX_SPANS_PER_ELEMENT = 30;
    private static final int PRECHUNK_LINE_LENGTH_THRESHOLD = 4000;
    private static final String SPAN_CLOSE = "</span>";
    private static final String SPAN_OPEN = "<span";
    private static final l SPAN_REGEX = new l("<span c=\"(\\d+)\"(?:\\s+ts=\"([\\d.]+)\")?");
    private static final l TAG_REGEX = new l("<(/?)([a-zA-Z][a-zA-Z0-9]*)[^>]*?(/?)>");
    private static final Set<String> VOID_TAGS = n.f1(new String[]{"area", "base", "br", "col", "embed", "hr", "img", "input", "link", "meta", "param", "source", "track", "wbr"});

    /* JADX INFO: Access modifiers changed from: private */
    public final h chunkBySpanClose(String line) {
        return new m(new OptimizedReadSplitter$chunkBySpanClose$1(line, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean exceedsSpanBudget(String line) {
        int k02;
        int i10 = 0;
        int i11 = 0;
        while (i10 < line.length() && (k02 = wq.n.k0(line, SPAN_OPEN, i10, false, 4)) >= 0) {
            i11++;
            if (i11 > 30) {
                return true;
            }
            i10 = k02 + 5;
        }
        return false;
    }

    private final h mergeIntoTopLevelElements(h lines) {
        return new m(new OptimizedReadSplitter$mergeIntoTopLevelElements$1(lines, null));
    }

    private final h preChunkLongLines(h lines) {
        return new m(new OptimizedReadSplitter$preChunkLongLines$1(lines, this, null));
    }

    private static final void splitStreaming$flushCurrent(d0 d0Var, Map<Integer, Chapter> map, ho.l lVar, List<ChapterSlotIndexBlob> list) {
        Chapter chapter;
        ChapterAccumulator chapterAccumulator = (ChapterAccumulator) d0Var.f20559a;
        if (chapterAccumulator == null || (chapter = map.get(Integer.valueOf(chapterAccumulator.getChapterIndex()))) == null) {
            return;
        }
        lVar.invoke(new ChapterContentBlob(0, chapterAccumulator.getChapterIndex(), chapterAccumulator.getElements(), chapterAccumulator.getOffsetsToElements(), chapter.getAudioFileNumber(), chapterAccumulator.getTsPairs(), 1, (f) null));
        list.add(new ChapterSlotIndexBlob(chapterAccumulator.getChapterIndex(), chapterAccumulator.getFirstElementIndex(), chapterAccumulator.getElements().size(), chapter.getCharCount(), chapter.getAudioFileNumber(), chapterAccumulator.getOffsetKeys()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [io.elevenlabs.domain.model.Chapter] */
    /* JADX WARN: Type inference failed for: r11v16, types: [io.elevenlabs.domain.model.Chapter] */
    /* JADX WARN: Type inference failed for: r11v26, types: [io.elevenlabs.domain.model.Chapter] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    public final OptimizedReadIndexBlob splitStreaming(h lines, List<Chapter> chapters, ho.l emit) {
        ?? r11;
        ?? r112;
        String str;
        Double M;
        String str2;
        List<Chapter> list = chapters;
        lines.getClass();
        list.getClass();
        emit.getClass();
        int i10 = 0;
        f fVar = null;
        int i11 = 1;
        if (list.isEmpty()) {
            return new OptimizedReadIndexBlob(i10, t.f33547a, i11, fVar);
        }
        int H = a0.H(p.a0(list, 10));
        if (H < 16) {
            H = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((Chapter) obj).getIndex()), obj);
        }
        ArrayList arrayList = new ArrayList();
        ?? obj2 = new Object();
        int i12 = 0;
        for (String str3 : mergeIntoTopLevelElements(preChunkLongLines(lines))) {
            List u02 = k.u0(l.b(SPAN_REGEX, str3));
            wq.h hVar = (wq.h) o.y0(u02);
            if (hVar != null && (str2 = (String) ((c0) ((i) hVar).a()).get(i11)) != null) {
                r11 = u.Z(str2);
            } else {
                r11 = fVar;
            }
            if (r11 == 0 || (r112 = ChapterContentKt.chapterFor(list, r11.longValue())) == 0) {
                ChapterAccumulator chapterAccumulator = (ChapterAccumulator) obj2.f20559a;
                if (chapterAccumulator != null) {
                    r112 = (Chapter) linkedHashMap.get(Integer.valueOf(chapterAccumulator.getChapterIndex()));
                } else {
                    r112 = fVar;
                }
                if (r112 == 0) {
                    r112 = (Chapter) o.w0(list);
                }
            }
            ChapterAccumulator chapterAccumulator2 = (ChapterAccumulator) obj2.f20559a;
            if (chapterAccumulator2 != null && chapterAccumulator2.getChapterIndex() == r112.getIndex()) {
                str = str3;
            } else {
                splitStreaming$flushCurrent(obj2, linkedHashMap, emit, arrayList);
                str = str3;
                ChapterAccumulator chapterAccumulator3 = new ChapterAccumulator(r112.getIndex(), i12, null, null, null, null, 60, null);
                obj2.f20559a = chapterAccumulator3;
                chapterAccumulator2 = chapterAccumulator3;
            }
            int size = chapterAccumulator2.getElements().size();
            chapterAccumulator2.getElements().add(str);
            i12++;
            Iterator it = u02.iterator();
            while (it.hasNext()) {
                i iVar = (i) ((wq.h) it.next());
                Long Z = u.Z((String) ((c0) iVar.a()).get(i11));
                if (Z != null) {
                    long longValue = Z.longValue();
                    chapterAccumulator2.getOffsetsToElements().putIfAbsent(Z, Integer.valueOf(size));
                    chapterAccumulator2.getOffsetKeys().add(Z);
                    String str4 = (String) o.z0(2, iVar.a());
                    if (str4 != null && str4.length() != 0 && (M = wq.t.M(str4)) != null) {
                        chapterAccumulator2.getTsPairs().add(new TsPairBlob(longValue, M.doubleValue()));
                    }
                    fVar = null;
                    i11 = 1;
                }
            }
            list = chapters;
        }
        splitStreaming$flushCurrent(obj2, linkedHashMap, emit, arrayList);
        return new OptimizedReadIndexBlob(0, arrayList, 1, (f) null);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/data/services/optimized/OptimizedReadSplitter$ChapterAccumulator;", "", "chapterIndex", "", "firstElementIndex", "elements", "", "", "offsetsToElements", "", "", "offsetKeys", "tsPairs", "Lio/elevenlabs/data/services/optimized/TsPairBlob;", "<init>", "(IILjava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "getChapterIndex", "()I", "getFirstElementIndex", "getElements", "()Ljava/util/List;", "getOffsetsToElements", "()Ljava/util/Map;", "getOffsetKeys", "getTsPairs", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class ChapterAccumulator {
        private final int chapterIndex;
        private final List<String> elements;
        private final int firstElementIndex;
        private final List<Long> offsetKeys;
        private final Map<Long, Integer> offsetsToElements;
        private final List<TsPairBlob> tsPairs;

        public /* synthetic */ ChapterAccumulator(int i10, int i11, List list, Map map, List list2, List list3, int i12, f fVar) {
            this(i10, i11, (i12 & 4) != 0 ? new ArrayList() : list, (i12 & 8) != 0 ? new LinkedHashMap() : map, (i12 & 16) != 0 ? new ArrayList() : list2, (i12 & 32) != 0 ? new ArrayList() : list3);
        }

        public final int getChapterIndex() {
            return this.chapterIndex;
        }

        public final List<String> getElements() {
            return this.elements;
        }

        public final int getFirstElementIndex() {
            return this.firstElementIndex;
        }

        public final List<Long> getOffsetKeys() {
            return this.offsetKeys;
        }

        public final Map<Long, Integer> getOffsetsToElements() {
            return this.offsetsToElements;
        }

        public final List<TsPairBlob> getTsPairs() {
            return this.tsPairs;
        }

        public ChapterAccumulator(int i10, int i11, List<String> list, Map<Long, Integer> map, List<Long> list2, List<TsPairBlob> list3) {
            list.getClass();
            map.getClass();
            list2.getClass();
            list3.getClass();
            this.chapterIndex = i10;
            this.firstElementIndex = i11;
            this.elements = list;
            this.offsetsToElements = map;
            this.offsetKeys = list2;
            this.tsPairs = list3;
        }
    }
}
