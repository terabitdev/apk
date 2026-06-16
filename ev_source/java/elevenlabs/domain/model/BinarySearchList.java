package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import io.livekit.android.room.SignalClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import no.i;
import sn.k;
import tn.o;
import vq.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fB!\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001c\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*¨\u0006+"}, d2 = {"Lio/elevenlabs/domain/model/BinarySearchList;", "", "", "", "", "collection", "", "bucketSize", "<init>", "(Ljava/util/Map;I)V", "", "elements", "(Ljava/lang/Iterable;I)V", "Lvq/h;", "(Lvq/h;I)V", "target", "binarySearchNearestLeftTarget", "(Ljava/util/List;J)Ljava/lang/Long;", "binarySearchNearestLeftTargetIndex", "(Ljava/util/List;J)Ljava/lang/Integer;", "component1", "()Ljava/util/Map;", "component2", "()I", "findNearestLeftElement", "(J)Ljava/lang/Long;", "findNearestLeftElementIndex", "(J)Ljava/lang/Integer;", "plus", "(Ljava/lang/Iterable;)Lio/elevenlabs/domain/model/BinarySearchList;", "(Lvq/h;)Lio/elevenlabs/domain/model/BinarySearchList;", "copy", "(Ljava/util/Map;I)Lio/elevenlabs/domain/model/BinarySearchList;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", TokenNames.I, "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class BinarySearchList {
    private final int bucketSize;
    private final Map<Long, List<Long>> collection;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BinarySearchList(h hVar, int i10) {
        this(r0, i10);
        hVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hVar) {
            Long valueOf = Long.valueOf(((Number) obj).longValue() / i10);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
    }

    private final Long binarySearchNearestLeftTarget(List<Long> list, long j4) {
        Integer binarySearchNearestLeftTargetIndex = binarySearchNearestLeftTargetIndex(list, j4);
        if (binarySearchNearestLeftTargetIndex != null) {
            return (Long) o.z0(binarySearchNearestLeftTargetIndex.intValue(), list);
        }
        return null;
    }

    private final Integer binarySearchNearestLeftTargetIndex(List<Long> list, long j4) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size() - 1;
        int i10 = 0;
        if (list.get(0).longValue() > j4) {
            return null;
        }
        while (true) {
            if (i10 >= size) {
                break;
            }
            int i11 = (i10 + size) >>> 1;
            long longValue = list.get(i11).longValue();
            if (longValue > j4) {
                size = i11;
            } else if (longValue < j4) {
                i10 = i11 + 1;
            } else {
                i10 = i11;
                break;
            }
        }
        if (i10 >= list.size()) {
            return null;
        }
        if (j4 < list.get(i10).longValue()) {
            if (i10 <= 0) {
                return null;
            }
            return Integer.valueOf(i10 - 1);
        }
        return Integer.valueOf(i10);
    }

    private final Map<Long, List<Long>> component1() {
        return this.collection;
    }

    /* renamed from: component2, reason: from getter */
    private final int getBucketSize() {
        return this.bucketSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BinarySearchList copy$default(BinarySearchList binarySearchList, Map map, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = binarySearchList.collection;
        }
        if ((i11 & 2) != 0) {
            i10 = binarySearchList.bucketSize;
        }
        return binarySearchList.copy(map, i10);
    }

    public final BinarySearchList copy(Map<Long, ? extends List<Long>> collection, int bucketSize) {
        collection.getClass();
        return new BinarySearchList(collection, bucketSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinarySearchList)) {
            return false;
        }
        BinarySearchList binarySearchList = (BinarySearchList) other;
        if (m.c(this.collection, binarySearchList.collection) && this.bucketSize == binarySearchList.bucketSize) {
            return true;
        }
        return false;
    }

    public final Long findNearestLeftElement(long target) {
        Long l4;
        Long binarySearchNearestLeftTarget;
        long j4 = target / this.bucketSize;
        List<Long> list = this.collection.get(Long.valueOf(j4));
        if (list != null && (binarySearchNearestLeftTarget = binarySearchNearestLeftTarget(list, target)) != null) {
            return binarySearchNearestLeftTarget;
        }
        List<Long> list2 = this.collection.get(Long.valueOf(j4 - 1));
        if (list2 != null) {
            l4 = binarySearchNearestLeftTarget(list2, target);
        } else {
            l4 = null;
        }
        if (l4 == null) {
            List<Long> list3 = this.collection.get(Long.valueOf(j4 + 1));
            if (list3 == null) {
                return null;
            }
            return binarySearchNearestLeftTarget(list3, target);
        }
        return l4;
    }

    public final Integer findNearestLeftElementIndex(long target) {
        k kVar;
        Integer binarySearchNearestLeftTargetIndex;
        Integer binarySearchNearestLeftTargetIndex2;
        i iVar;
        int i10;
        Integer binarySearchNearestLeftTargetIndex3;
        long j4 = target / this.bucketSize;
        List<Long> list = this.collection.get(Long.valueOf(j4));
        if (list != null && (binarySearchNearestLeftTargetIndex3 = binarySearchNearestLeftTargetIndex(list, target)) != null) {
            kVar = new k(Integer.valueOf(binarySearchNearestLeftTargetIndex3.intValue()), Long.valueOf(j4));
        } else {
            long j10 = j4 - 1;
            List<Long> list2 = this.collection.get(Long.valueOf(j10));
            if (list2 != null && (binarySearchNearestLeftTargetIndex2 = binarySearchNearestLeftTargetIndex(list2, target)) != null) {
                kVar = new k(Integer.valueOf(binarySearchNearestLeftTargetIndex2.intValue()), Long.valueOf(j10));
            } else {
                long j11 = j4 + 1;
                List<Long> list3 = this.collection.get(Long.valueOf(j11));
                if (list3 != null && (binarySearchNearestLeftTargetIndex = binarySearchNearestLeftTargetIndex(list3, target)) != null) {
                    kVar = new k(Integer.valueOf(binarySearchNearestLeftTargetIndex.intValue()), Long.valueOf(j11));
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    return null;
                }
            }
        }
        int intValue = ((Number) kVar.f31600a).intValue();
        long longValue = ((Number) kVar.f31601b).longValue();
        if (longValue <= Long.MIN_VALUE) {
            iVar = i.f24568d;
        } else {
            iVar = new i(0, longValue - 1);
        }
        Iterator it = iVar.iterator();
        int i11 = 0;
        while (true) {
            no.h hVar = (no.h) it;
            if (hVar.f24566c) {
                List<Long> list4 = this.collection.get(Long.valueOf(hVar.nextLong()));
                if (list4 != null) {
                    i10 = list4.size();
                } else {
                    i10 = 0;
                }
                i11 += i10;
            } else {
                return Integer.valueOf(i11 + intValue);
            }
        }
    }

    public int hashCode() {
        return Integer.hashCode(this.bucketSize) + (this.collection.hashCode() * 31);
    }

    public final BinarySearchList plus(h elements) {
        elements.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : elements) {
            Long valueOf = Long.valueOf(((Number) obj).longValue() / this.bucketSize);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        HashMap hashMap = new HashMap(this.collection);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            if (!list.isEmpty()) {
                if (this.collection.containsKey(Long.valueOf(longValue))) {
                }
            }
        }
        return copy(hashMap, this.bucketSize);
    }

    public String toString() {
        return "BinarySearchList(collection=" + this.collection + ", bucketSize=" + this.bucketSize + Separators.RPAREN;
    }

    public /* synthetic */ BinarySearchList(Map map, int i10, int i11, f fVar) {
        this((Map<Long, ? extends List<Long>>) map, (i11 & 2) != 0 ? SignalClient.CLOSE_REASON_NORMAL_CLOSURE : i10);
    }

    public /* synthetic */ BinarySearchList(Iterable iterable, int i10, int i11, f fVar) {
        this((Iterable<Long>) iterable, (i11 & 2) != 0 ? SignalClient.CLOSE_REASON_NORMAL_CLOSURE : i10);
    }

    public /* synthetic */ BinarySearchList(h hVar, int i10, int i11, f fVar) {
        this(hVar, (i11 & 2) != 0 ? SignalClient.CLOSE_REASON_NORMAL_CLOSURE : i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BinarySearchList(Map<Long, ? extends List<Long>> map, int i10) {
        map.getClass();
        this.collection = map;
        this.bucketSize = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinarySearchList(Iterable<Long> iterable, int i10) {
        this(new eo.m(iterable, 3), i10);
        iterable.getClass();
    }

    public final BinarySearchList plus(Iterable<Long> elements) {
        elements.getClass();
        return plus(new eo.m(elements, 3));
    }
}
