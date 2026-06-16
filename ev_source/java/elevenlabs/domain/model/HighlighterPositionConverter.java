package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BG\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016JT\u0010\u0018\u001a\u00020\u00002 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00022 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R/\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0016R/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006'"}, d2 = {"Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "", "", "", "Ljava/util/TreeMap;", "", "", "tsToOffset", "offsetToTs", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "audioFileNumber", "charOffset", "toTime", "(Ljava/lang/String;J)Ljava/lang/Double;", "seconds", "toOffset", "(Ljava/lang/String;D)Ljava/lang/Long;", "Lsn/k;", "locateWordForOffset", "(J)Lsn/k;", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getTsToOffset", "getOffsetToTs", "Companion", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class HighlighterPositionConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HighlighterPositionConverter EMPTY;
    private final Map<String, TreeMap<Long, Double>> offsetToTs;
    private final Map<String, TreeMap<Double, Long>> tsToOffset;

    static {
        u uVar = u.f33548a;
        EMPTY = new HighlighterPositionConverter(uVar, uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HighlighterPositionConverter(Map<String, ? extends TreeMap<Double, Long>> map, Map<String, ? extends TreeMap<Long, Double>> map2) {
        map.getClass();
        map2.getClass();
        this.tsToOffset = map;
        this.offsetToTs = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlighterPositionConverter copy$default(HighlighterPositionConverter highlighterPositionConverter, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = highlighterPositionConverter.tsToOffset;
        }
        if ((i10 & 2) != 0) {
            map2 = highlighterPositionConverter.offsetToTs;
        }
        return highlighterPositionConverter.copy(map, map2);
    }

    public final Map<String, TreeMap<Double, Long>> component1() {
        return this.tsToOffset;
    }

    public final Map<String, TreeMap<Long, Double>> component2() {
        return this.offsetToTs;
    }

    public final HighlighterPositionConverter copy(Map<String, ? extends TreeMap<Double, Long>> tsToOffset, Map<String, ? extends TreeMap<Long, Double>> offsetToTs) {
        tsToOffset.getClass();
        offsetToTs.getClass();
        return new HighlighterPositionConverter(tsToOffset, offsetToTs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlighterPositionConverter)) {
            return false;
        }
        HighlighterPositionConverter highlighterPositionConverter = (HighlighterPositionConverter) other;
        if (m.c(this.tsToOffset, highlighterPositionConverter.tsToOffset) && m.c(this.offsetToTs, highlighterPositionConverter.offsetToTs)) {
            return true;
        }
        return false;
    }

    public final Map<String, TreeMap<Long, Double>> getOffsetToTs() {
        return this.offsetToTs;
    }

    public final Map<String, TreeMap<Double, Long>> getTsToOffset() {
        return this.tsToOffset;
    }

    public int hashCode() {
        return this.offsetToTs.hashCode() + (this.tsToOffset.hashCode() * 31);
    }

    public final k locateWordForOffset(long charOffset) {
        k kVar = null;
        long j4 = Long.MIN_VALUE;
        for (Map.Entry<String, TreeMap<Long, Double>> entry : this.offsetToTs.entrySet()) {
            String key = entry.getKey();
            Map.Entry<Long, Double> floorEntry = entry.getValue().floorEntry(Long.valueOf(charOffset));
            if (floorEntry != null && floorEntry.getKey().longValue() > j4) {
                Long key2 = floorEntry.getKey();
                key2.getClass();
                j4 = key2.longValue();
                kVar = new k(key, floorEntry.getValue());
            }
        }
        return kVar;
    }

    public final Long toOffset(String audioFileNumber, double seconds) {
        Map.Entry<Double, Long> floorEntry;
        audioFileNumber.getClass();
        TreeMap<Double, Long> treeMap = this.tsToOffset.get(audioFileNumber);
        if (treeMap != null && (floorEntry = treeMap.floorEntry(Double.valueOf(seconds))) != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    public String toString() {
        return "HighlighterPositionConverter(tsToOffset=" + this.tsToOffset + ", offsetToTs=" + this.offsetToTs + Separators.RPAREN;
    }

    public final Double toTime(String audioFileNumber, long charOffset) {
        Map.Entry<Long, Double> floorEntry;
        audioFileNumber.getClass();
        TreeMap<Long, Double> treeMap = this.offsetToTs.get(audioFileNumber);
        if (treeMap != null && (floorEntry = treeMap.floorEntry(Long.valueOf(charOffset))) != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/model/HighlighterPositionConverter$Companion;", "", "<init>", "()V", "EMPTY", "Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "getEMPTY", "()Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "merge", "parts", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final HighlighterPositionConverter getEMPTY() {
            return HighlighterPositionConverter.EMPTY;
        }

        public final HighlighterPositionConverter merge(List<HighlighterPositionConverter> parts) {
            parts.getClass();
            if (parts.isEmpty()) {
                return getEMPTY();
            }
            if (parts.size() == 1) {
                return parts.get(0);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (HighlighterPositionConverter highlighterPositionConverter : parts) {
                for (Map.Entry<String, TreeMap<Long, Double>> entry : highlighterPositionConverter.getOffsetToTs().entrySet()) {
                    String key = entry.getKey();
                    TreeMap<Long, Double> value = entry.getValue();
                    Object obj = linkedHashMap.get(key);
                    if (obj == null) {
                        obj = new TreeMap();
                        linkedHashMap.put(key, obj);
                    }
                    ((TreeMap) obj).putAll(value);
                }
                for (Map.Entry<String, TreeMap<Double, Long>> entry2 : highlighterPositionConverter.getTsToOffset().entrySet()) {
                    String key2 = entry2.getKey();
                    TreeMap<Double, Long> value2 = entry2.getValue();
                    Object obj2 = linkedHashMap2.get(key2);
                    if (obj2 == null) {
                        obj2 = new TreeMap();
                        linkedHashMap2.put(key2, obj2);
                    }
                    ((TreeMap) obj2).putAll(value2);
                }
            }
            return new HighlighterPositionConverter(linkedHashMap2, linkedHashMap);
        }

        private Companion() {
        }
    }
}
