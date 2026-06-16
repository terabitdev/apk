package io.elevenlabs.readerapp.usecase;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/usecase/CharacterOffset;", "", "start", "", "endExclusive", "<init>", "(JJ)V", "getStart", "()J", "getEndExclusive", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class CharacterOffset {
    public static final int $stable = 0;
    private final long endExclusive;
    private final long start;

    public CharacterOffset(long j4, long j10) {
        this.start = j4;
        this.endExclusive = j10;
    }

    public static /* synthetic */ CharacterOffset copy$default(CharacterOffset characterOffset, long j4, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = characterOffset.start;
        }
        if ((i10 & 2) != 0) {
            j10 = characterOffset.endExclusive;
        }
        return characterOffset.copy(j4, j10);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndExclusive() {
        return this.endExclusive;
    }

    public final CharacterOffset copy(long start, long endExclusive) {
        return new CharacterOffset(start, endExclusive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacterOffset)) {
            return false;
        }
        CharacterOffset characterOffset = (CharacterOffset) other;
        if (this.start == characterOffset.start && this.endExclusive == characterOffset.endExclusive) {
            return true;
        }
        return false;
    }

    public final long getEndExclusive() {
        return this.endExclusive;
    }

    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        return Long.hashCode(this.endExclusive) + (Long.hashCode(this.start) * 31);
    }

    public String toString() {
        return f.h(this.endExclusive, Separators.RPAREN, com.google.android.gms.internal.play_billing.b.q("CharacterOffset(start=", this.start, ", endExclusive="));
    }
}
