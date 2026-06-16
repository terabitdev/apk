package io.elevenlabs.data.services.optimized;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import defpackage.f;
import io.elevenlabs.data.model.response.d;
import j0.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.a;
import sn.h;
import sn.i;
import tn.t;
import tr.b;
import ur.c1;
import ur.f0;
import ur.g1;
import ur.h0;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00029:BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003¢\u0006\u0004\b&\u0010!Jf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b8\u0010!¨\u0006;"}, d2 = {"Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", "", "", "schemaVersion", "chapterIndex", "", "", "elements", "", "", "offsetsToElementsMap", "audioFileNumber", "Lio/elevenlabs/data/services/optimized/TsPairBlob;", "tsPairs", "<init>", "(IILjava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IIILjava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/services/optimized/ChapterContentBlob;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/util/Map;", "component5", "()Ljava/lang/String;", "component6", "copy", "(IILjava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", TokenNames.I, "getSchemaVersion", "getChapterIndex", "Ljava/util/List;", "getElements", "Ljava/util/Map;", "getOffsetsToElementsMap", "Ljava/lang/String;", "getAudioFileNumber", "getTsPairs", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ChapterContentBlob {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int SCHEMA_VERSION = 1;
    private final String audioFileNumber;
    private final int chapterIndex;
    private final List<String> elements;
    private final Map<Long, Integer> offsetsToElementsMap;
    private final int schemaVersion;
    private final List<TsPairBlob> tsPairs;

    static {
        d dVar = new d(18);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, null, a.d(iVar, dVar), a.d(iVar, new d(19)), null, a.d(iVar, new d(20))};
    }

    public /* synthetic */ ChapterContentBlob(int i10, int i11, int i12, List list, Map map, String str, List list2, c1 c1Var) {
        if (30 == (i10 & 30)) {
            this.schemaVersion = (i10 & 1) == 0 ? 1 : i11;
            this.chapterIndex = i12;
            this.elements = list;
            this.offsetsToElementsMap = map;
            this.audioFileNumber = str;
            if ((i10 & 32) == 0) {
                this.tsPairs = t.f33547a;
                return;
            } else {
                this.tsPairs = list2;
                return;
            }
        }
        t0.j(i10, 30, ChapterContentBlob$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(g1.f34588a, 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new h0(l0.f34611a, f0.f34579a);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new ur.d(TsPairBlob$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ ChapterContentBlob copy$default(ChapterContentBlob chapterContentBlob, int i10, int i11, List list, Map map, String str, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = chapterContentBlob.schemaVersion;
        }
        if ((i12 & 2) != 0) {
            i11 = chapterContentBlob.chapterIndex;
        }
        if ((i12 & 4) != 0) {
            list = chapterContentBlob.elements;
        }
        if ((i12 & 8) != 0) {
            map = chapterContentBlob.offsetsToElementsMap;
        }
        if ((i12 & 16) != 0) {
            str = chapterContentBlob.audioFileNumber;
        }
        if ((i12 & 32) != 0) {
            list2 = chapterContentBlob.tsPairs;
        }
        String str2 = str;
        List list3 = list2;
        return chapterContentBlob.copy(i10, i11, list, map, str2, list3);
    }

    public static final /* synthetic */ void write$Self$data_release(ChapterContentBlob self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        if (output.C(serialDesc) || self.schemaVersion != 1) {
            output.P(0, self.schemaVersion, serialDesc);
        }
        output.P(1, self.chapterIndex, serialDesc);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.elements);
        output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.offsetsToElementsMap);
        output.o(serialDesc, 4, g1.f34588a, self.audioFileNumber);
        if (output.C(serialDesc) || !m.c(self.tsPairs, t.f33547a)) {
            output.g(serialDesc, 5, (KSerializer) hVarArr[5].getValue(), self.tsPairs);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    public final List<String> component3() {
        return this.elements;
    }

    public final Map<Long, Integer> component4() {
        return this.offsetsToElementsMap;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final List<TsPairBlob> component6() {
        return this.tsPairs;
    }

    public final ChapterContentBlob copy(int schemaVersion, int chapterIndex, List<String> elements, Map<Long, Integer> offsetsToElementsMap, String audioFileNumber, List<TsPairBlob> tsPairs) {
        elements.getClass();
        offsetsToElementsMap.getClass();
        tsPairs.getClass();
        return new ChapterContentBlob(schemaVersion, chapterIndex, elements, offsetsToElementsMap, audioFileNumber, tsPairs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChapterContentBlob)) {
            return false;
        }
        ChapterContentBlob chapterContentBlob = (ChapterContentBlob) other;
        if (this.schemaVersion == chapterContentBlob.schemaVersion && this.chapterIndex == chapterContentBlob.chapterIndex && m.c(this.elements, chapterContentBlob.elements) && m.c(this.offsetsToElementsMap, chapterContentBlob.offsetsToElementsMap) && m.c(this.audioFileNumber, chapterContentBlob.audioFileNumber) && m.c(this.tsPairs, chapterContentBlob.tsPairs)) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
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

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public final List<TsPairBlob> getTsPairs() {
        return this.tsPairs;
    }

    public int hashCode() {
        int hashCode;
        int a10 = f.a(this.offsetsToElementsMap, n.d(c.b(this.chapterIndex, Integer.hashCode(this.schemaVersion) * 31, 31), 31, this.elements), 31);
        String str = this.audioFileNumber;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.tsPairs.hashCode() + ((a10 + hashCode) * 31);
    }

    public String toString() {
        int i10 = this.schemaVersion;
        int i11 = this.chapterIndex;
        List<String> list = this.elements;
        Map<Long, Integer> map = this.offsetsToElementsMap;
        String str = this.audioFileNumber;
        List<TsPairBlob> list2 = this.tsPairs;
        StringBuilder g10 = z.h.g("ChapterContentBlob(schemaVersion=", i10, ", chapterIndex=", i11, ", elements=");
        g10.append(list);
        g10.append(", offsetsToElementsMap=");
        g10.append(map);
        g10.append(", audioFileNumber=");
        g10.append(str);
        g10.append(", tsPairs=");
        g10.append(list2);
        g10.append(Separators.RPAREN);
        return g10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/elevenlabs/data/services/optimized/ChapterContentBlob$Companion;", "", "<init>", "()V", "SCHEMA_VERSION", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ChapterContentBlob$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ChapterContentBlob(int i10, int i11, List<String> list, Map<Long, Integer> map, String str, List<TsPairBlob> list2) {
        list.getClass();
        map.getClass();
        list2.getClass();
        this.schemaVersion = i10;
        this.chapterIndex = i11;
        this.elements = list;
        this.offsetsToElementsMap = map;
        this.audioFileNumber = str;
        this.tsPairs = list2;
    }

    public /* synthetic */ ChapterContentBlob(int i10, int i11, List list, Map map, String str, List list2, int i12, kotlin.jvm.internal.f fVar) {
        this((i12 & 1) != 0 ? 1 : i10, i11, list, map, str, (i12 & 32) != 0 ? t.f33547a : list2);
    }
}
