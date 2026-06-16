package io.elevenlabs.data.services.optimized;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import io.elevenlabs.data.model.response.d;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.a;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003¢\u0006\u0004\b#\u0010$JT\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u00069"}, d2 = {"Lio/elevenlabs/data/services/optimized/ChapterSlotIndexBlob;", "", "", "chapterIndex", "firstElementIndex", "elementCount", "", "charCount", "", "audioFileNumber", "", "offsetKeys", "<init>", "(IIIJLjava/lang/String;Ljava/util/List;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IIIIJLjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/services/optimized/ChapterSlotIndexBlob;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "()J", "component5", "()Ljava/lang/String;", "component6", "()Ljava/util/List;", "copy", "(IIIJLjava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/services/optimized/ChapterSlotIndexBlob;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", TokenNames.I, "getChapterIndex", "getFirstElementIndex", "getElementCount", "J", "getCharCount", "Ljava/lang/String;", "getAudioFileNumber", "Ljava/util/List;", "getOffsetKeys", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ChapterSlotIndexBlob {
    private final String audioFileNumber;
    private final int chapterIndex;
    private final long charCount;
    private final int elementCount;
    private final int firstElementIndex;
    private final List<Long> offsetKeys;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, null, a.d(i.f31597b, new d(21))};

    public /* synthetic */ ChapterSlotIndexBlob(int i10, int i11, int i12, int i13, long j4, String str, List list, c1 c1Var) {
        if (63 == (i10 & 63)) {
            this.chapterIndex = i11;
            this.firstElementIndex = i12;
            this.elementCount = i13;
            this.charCount = j4;
            this.audioFileNumber = str;
            this.offsetKeys = list;
            return;
        }
        t0.j(i10, 63, ChapterSlotIndexBlob$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(l0.f34611a, 0);
    }

    public static /* synthetic */ ChapterSlotIndexBlob copy$default(ChapterSlotIndexBlob chapterSlotIndexBlob, int i10, int i11, int i12, long j4, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = chapterSlotIndexBlob.chapterIndex;
        }
        if ((i13 & 2) != 0) {
            i11 = chapterSlotIndexBlob.firstElementIndex;
        }
        if ((i13 & 4) != 0) {
            i12 = chapterSlotIndexBlob.elementCount;
        }
        if ((i13 & 8) != 0) {
            j4 = chapterSlotIndexBlob.charCount;
        }
        if ((i13 & 16) != 0) {
            str = chapterSlotIndexBlob.audioFileNumber;
        }
        if ((i13 & 32) != 0) {
            list = chapterSlotIndexBlob.offsetKeys;
        }
        long j10 = j4;
        int i14 = i12;
        return chapterSlotIndexBlob.copy(i10, i11, i14, j10, str, list);
    }

    public static final /* synthetic */ void write$Self$data_release(ChapterSlotIndexBlob self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.P(0, self.chapterIndex, serialDesc);
        output.P(1, self.firstElementIndex, serialDesc);
        output.P(2, self.elementCount, serialDesc);
        output.h0(serialDesc, 3, self.charCount);
        output.o(serialDesc, 4, g1.f34588a, self.audioFileNumber);
        output.g(serialDesc, 5, (KSerializer) hVarArr[5].getValue(), self.offsetKeys);
    }

    /* renamed from: component1, reason: from getter */
    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFirstElementIndex() {
        return this.firstElementIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final int getElementCount() {
        return this.elementCount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCharCount() {
        return this.charCount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final List<Long> component6() {
        return this.offsetKeys;
    }

    public final ChapterSlotIndexBlob copy(int chapterIndex, int firstElementIndex, int elementCount, long charCount, String audioFileNumber, List<Long> offsetKeys) {
        offsetKeys.getClass();
        return new ChapterSlotIndexBlob(chapterIndex, firstElementIndex, elementCount, charCount, audioFileNumber, offsetKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChapterSlotIndexBlob)) {
            return false;
        }
        ChapterSlotIndexBlob chapterSlotIndexBlob = (ChapterSlotIndexBlob) other;
        if (this.chapterIndex == chapterSlotIndexBlob.chapterIndex && this.firstElementIndex == chapterSlotIndexBlob.firstElementIndex && this.elementCount == chapterSlotIndexBlob.elementCount && this.charCount == chapterSlotIndexBlob.charCount && m.c(this.audioFileNumber, chapterSlotIndexBlob.audioFileNumber) && m.c(this.offsetKeys, chapterSlotIndexBlob.offsetKeys)) {
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

    public final long getCharCount() {
        return this.charCount;
    }

    public final int getElementCount() {
        return this.elementCount;
    }

    public final int getFirstElementIndex() {
        return this.firstElementIndex;
    }

    public final List<Long> getOffsetKeys() {
        return this.offsetKeys;
    }

    public int hashCode() {
        int hashCode;
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.charCount, c.b(this.elementCount, c.b(this.firstElementIndex, Integer.hashCode(this.chapterIndex) * 31, 31), 31), 31);
        String str = this.audioFileNumber;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.offsetKeys.hashCode() + ((g10 + hashCode) * 31);
    }

    public String toString() {
        int i10 = this.chapterIndex;
        int i11 = this.firstElementIndex;
        int i12 = this.elementCount;
        long j4 = this.charCount;
        String str = this.audioFileNumber;
        List<Long> list = this.offsetKeys;
        StringBuilder g10 = z.h.g("ChapterSlotIndexBlob(chapterIndex=", i10, ", firstElementIndex=", i11, ", elementCount=");
        g10.append(i12);
        g10.append(", charCount=");
        g10.append(j4);
        g10.append(", audioFileNumber=");
        g10.append(str);
        g10.append(", offsetKeys=");
        g10.append(list);
        g10.append(Separators.RPAREN);
        return g10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/services/optimized/ChapterSlotIndexBlob$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/services/optimized/ChapterSlotIndexBlob;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ChapterSlotIndexBlob$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ChapterSlotIndexBlob(int i10, int i11, int i12, long j4, String str, List<Long> list) {
        list.getClass();
        this.chapterIndex = i10;
        this.firstElementIndex = i11;
        this.elementCount = i12;
        this.charCount = j4;
        this.audioFileNumber = str;
        this.offsetKeys = list;
    }
}
