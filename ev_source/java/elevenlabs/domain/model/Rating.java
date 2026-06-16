package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/Rating;", "", "average", "", "count", "", "<init>", "(FJ)V", "getAverage", "()F", "getCount", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Rating {
    private final float average;
    private final long count;

    public Rating(float f10, long j4) {
        this.average = f10;
        this.count = j4;
    }

    public static /* synthetic */ Rating copy$default(Rating rating, float f10, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = rating.average;
        }
        if ((i10 & 2) != 0) {
            j4 = rating.count;
        }
        return rating.copy(f10, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAverage() {
        return this.average;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    public final Rating copy(float average, long count) {
        return new Rating(average, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rating)) {
            return false;
        }
        Rating rating = (Rating) other;
        if (Float.compare(this.average, rating.average) == 0 && this.count == rating.count) {
            return true;
        }
        return false;
    }

    public final float getAverage() {
        return this.average;
    }

    public final long getCount() {
        return this.count;
    }

    public int hashCode() {
        return Long.hashCode(this.count) + (Float.hashCode(this.average) * 31);
    }

    public String toString() {
        return "Rating(average=" + this.average + ", count=" + this.count + Separators.RPAREN;
    }
}
