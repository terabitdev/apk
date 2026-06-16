package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.g1;
import ur.h0;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001cR,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001e¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/ReadRatingMap;", "", "Lio/elevenlabs/data/model/BigDecimalJson;", "averageRating", "", "totalRatingCount", "", "", "ratingCountMap", "<init>", "(Lio/elevenlabs/data/model/BigDecimalJson;JLjava/util/Map;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/BigDecimalJson;JLjava/util/Map;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/ReadRatingMap;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/BigDecimalJson;", "component2", "()J", "component3", "()Ljava/util/Map;", "copy", "(Lio/elevenlabs/data/model/BigDecimalJson;JLjava/util/Map;)Lio/elevenlabs/data/model/ReadRatingMap;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/BigDecimalJson;", "getAverageRating", "getAverageRating$annotations", "()V", "J", "getTotalRatingCount", "getTotalRatingCount$annotations", "Ljava/util/Map;", "getRatingCountMap", "getRatingCountMap$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadRatingMap {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BigDecimalJson averageRating;
    private final Map<String, Long> ratingCountMap;
    private final long totalRatingCount;

    static {
        io.elevenlabs.data.database.entities.reads.a aVar = new io.elevenlabs.data.database.entities.reads.a(18);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), null, sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(19))};
    }

    public /* synthetic */ ReadRatingMap(int i10, BigDecimalJson bigDecimalJson, long j4, Map map, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.averageRating = bigDecimalJson;
            this.totalRatingCount = j4;
            this.ratingCountMap = map;
            return;
        }
        t0.j(i10, 7, ReadRatingMap$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final KSerializer _childSerializers$_anonymous_() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), BigDecimalJson.INSTANCE.serializer(), new KSerializer[0]);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new h0(g1.f34588a, l0.f34611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadRatingMap copy$default(ReadRatingMap readRatingMap, BigDecimalJson bigDecimalJson, long j4, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bigDecimalJson = readRatingMap.averageRating;
        }
        if ((i10 & 2) != 0) {
            j4 = readRatingMap.totalRatingCount;
        }
        if ((i10 & 4) != 0) {
            map = readRatingMap.ratingCountMap;
        }
        return readRatingMap.copy(bigDecimalJson, j4, map);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadRatingMap self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.averageRating);
        output.h0(serialDesc, 1, self.totalRatingCount);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.ratingCountMap);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimalJson getAverageRating() {
        return this.averageRating;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalRatingCount() {
        return this.totalRatingCount;
    }

    public final Map<String, Long> component3() {
        return this.ratingCountMap;
    }

    public final ReadRatingMap copy(BigDecimalJson averageRating, long totalRatingCount, Map<String, Long> ratingCountMap) {
        averageRating.getClass();
        ratingCountMap.getClass();
        return new ReadRatingMap(averageRating, totalRatingCount, ratingCountMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadRatingMap)) {
            return false;
        }
        ReadRatingMap readRatingMap = (ReadRatingMap) other;
        if (m.c(this.averageRating, readRatingMap.averageRating) && this.totalRatingCount == readRatingMap.totalRatingCount && m.c(this.ratingCountMap, readRatingMap.ratingCountMap)) {
            return true;
        }
        return false;
    }

    public final BigDecimalJson getAverageRating() {
        return this.averageRating;
    }

    public final Map<String, Long> getRatingCountMap() {
        return this.ratingCountMap;
    }

    public final long getTotalRatingCount() {
        return this.totalRatingCount;
    }

    public int hashCode() {
        return this.ratingCountMap.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.totalRatingCount, this.averageRating.hashCode() * 31, 31);
    }

    public String toString() {
        return "ReadRatingMap(averageRating=" + this.averageRating + ", totalRatingCount=" + this.totalRatingCount + ", ratingCountMap=" + this.ratingCountMap + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/ReadRatingMap$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/ReadRatingMap;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadRatingMap$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAverageRating$annotations() {
    }

    public static /* synthetic */ void getRatingCountMap$annotations() {
    }

    public static /* synthetic */ void getTotalRatingCount$annotations() {
    }

    public ReadRatingMap(BigDecimalJson bigDecimalJson, long j4, Map<String, Long> map) {
        bigDecimalJson.getClass();
        map.getClass();
        this.averageRating = bigDecimalJson;
        this.totalRatingCount = j4;
        this.ratingCountMap = map;
    }
}
