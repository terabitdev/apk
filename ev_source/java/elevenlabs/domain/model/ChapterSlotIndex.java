package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010#\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lio/elevenlabs/domain/model/ChapterSlotIndex;", "", "chapterIndex", "", "firstElementIndex", "elementCount", "charCount", "", "audioFileNumber", "", "offsetKeys", "", "<init>", "(IIIJLjava/lang/String;Ljava/util/List;)V", "getChapterIndex", "()I", "getFirstElementIndex", "getElementCount", "getCharCount", "()J", "getAudioFileNumber", "()Ljava/lang/String;", "getOffsetKeys", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ChapterSlotIndex {
    private final String audioFileNumber;
    private final int chapterIndex;
    private final long charCount;
    private final int elementCount;
    private final int firstElementIndex;
    private final List<Long> offsetKeys;

    public ChapterSlotIndex(int i10, int i11, int i12, long j4, String str, List<Long> list) {
        list.getClass();
        this.chapterIndex = i10;
        this.firstElementIndex = i11;
        this.elementCount = i12;
        this.charCount = j4;
        this.audioFileNumber = str;
        this.offsetKeys = list;
    }

    public static /* synthetic */ ChapterSlotIndex copy$default(ChapterSlotIndex chapterSlotIndex, int i10, int i11, int i12, long j4, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = chapterSlotIndex.chapterIndex;
        }
        if ((i13 & 2) != 0) {
            i11 = chapterSlotIndex.firstElementIndex;
        }
        if ((i13 & 4) != 0) {
            i12 = chapterSlotIndex.elementCount;
        }
        if ((i13 & 8) != 0) {
            j4 = chapterSlotIndex.charCount;
        }
        if ((i13 & 16) != 0) {
            str = chapterSlotIndex.audioFileNumber;
        }
        if ((i13 & 32) != 0) {
            list = chapterSlotIndex.offsetKeys;
        }
        long j10 = j4;
        int i14 = i12;
        return chapterSlotIndex.copy(i10, i11, i14, j10, str, list);
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

    public final ChapterSlotIndex copy(int chapterIndex, int firstElementIndex, int elementCount, long charCount, String audioFileNumber, List<Long> offsetKeys) {
        offsetKeys.getClass();
        return new ChapterSlotIndex(chapterIndex, firstElementIndex, elementCount, charCount, audioFileNumber, offsetKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChapterSlotIndex)) {
            return false;
        }
        ChapterSlotIndex chapterSlotIndex = (ChapterSlotIndex) other;
        if (this.chapterIndex == chapterSlotIndex.chapterIndex && this.firstElementIndex == chapterSlotIndex.firstElementIndex && this.elementCount == chapterSlotIndex.elementCount && this.charCount == chapterSlotIndex.charCount && m.c(this.audioFileNumber, chapterSlotIndex.audioFileNumber) && m.c(this.offsetKeys, chapterSlotIndex.offsetKeys)) {
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
        int g10 = b.g(this.charCount, c.b(this.elementCount, c.b(this.firstElementIndex, Integer.hashCode(this.chapterIndex) * 31, 31), 31), 31);
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
        StringBuilder g10 = h.g("ChapterSlotIndex(chapterIndex=", i10, ", firstElementIndex=", i11, ", elementCount=");
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
}
