package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B=\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003JA\u0010\u0010\u001a\u00020\u00002 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0004HÖ\u0081\u0004R)\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/highlighter/HighlighterDocumentIndex;", "", "timestampsByChapter", "", "", "Ljava/util/TreeMap;", "", "", "elementLastTs", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getTimestampsByChapter", "()Ljava/util/Map;", "getElementLastTs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class HighlighterDocumentIndex {
    private static final HighlighterDocumentIndex EMPTY;
    private final Map<Integer, Double> elementLastTs;
    private final Map<String, TreeMap<Double, Integer>> timestampsByChapter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        tn.u uVar = tn.u.f33548a;
        EMPTY = new HighlighterDocumentIndex(uVar, uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HighlighterDocumentIndex(Map<String, ? extends TreeMap<Double, Integer>> map, Map<Integer, Double> map2) {
        map.getClass();
        map2.getClass();
        this.timestampsByChapter = map;
        this.elementLastTs = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlighterDocumentIndex copy$default(HighlighterDocumentIndex highlighterDocumentIndex, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = highlighterDocumentIndex.timestampsByChapter;
        }
        if ((i10 & 2) != 0) {
            map2 = highlighterDocumentIndex.elementLastTs;
        }
        return highlighterDocumentIndex.copy(map, map2);
    }

    public final Map<String, TreeMap<Double, Integer>> component1() {
        return this.timestampsByChapter;
    }

    public final Map<Integer, Double> component2() {
        return this.elementLastTs;
    }

    public final HighlighterDocumentIndex copy(Map<String, ? extends TreeMap<Double, Integer>> timestampsByChapter, Map<Integer, Double> elementLastTs) {
        timestampsByChapter.getClass();
        elementLastTs.getClass();
        return new HighlighterDocumentIndex(timestampsByChapter, elementLastTs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlighterDocumentIndex)) {
            return false;
        }
        HighlighterDocumentIndex highlighterDocumentIndex = (HighlighterDocumentIndex) other;
        if (kotlin.jvm.internal.m.c(this.timestampsByChapter, highlighterDocumentIndex.timestampsByChapter) && kotlin.jvm.internal.m.c(this.elementLastTs, highlighterDocumentIndex.elementLastTs)) {
            return true;
        }
        return false;
    }

    public final Map<Integer, Double> getElementLastTs() {
        return this.elementLastTs;
    }

    public final Map<String, TreeMap<Double, Integer>> getTimestampsByChapter() {
        return this.timestampsByChapter;
    }

    public int hashCode() {
        return this.elementLastTs.hashCode() + (this.timestampsByChapter.hashCode() * 31);
    }

    public String toString() {
        return "HighlighterDocumentIndex(timestampsByChapter=" + this.timestampsByChapter + ", elementLastTs=" + this.elementLastTs + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/highlighter/HighlighterDocumentIndex$Companion;", "", "<init>", "()V", "EMPTY", "Lio/elevenlabs/highlighter/HighlighterDocumentIndex;", "getEMPTY", "()Lio/elevenlabs/highlighter/HighlighterDocumentIndex;", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final HighlighterDocumentIndex getEMPTY() {
            return HighlighterDocumentIndex.EMPTY;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HighlighterDocumentIndex(Map map, Map map2, int i10, kotlin.jvm.internal.f fVar) {
        this(map, (i10 & 2) != 0 ? tn.u.f33548a : map2);
    }
}
