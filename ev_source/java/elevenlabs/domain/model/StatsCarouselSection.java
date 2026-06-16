package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import j0.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/StatsCarouselSection;", "", "daysInStreak", "", "minutesListenedToday", "<init>", "(II)V", "getDaysInStreak", "()I", "getMinutesListenedToday", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class StatsCarouselSection {
    private final int daysInStreak;
    private final int minutesListenedToday;

    public StatsCarouselSection(int i10, int i11) {
        this.daysInStreak = i10;
        this.minutesListenedToday = i11;
    }

    public static /* synthetic */ StatsCarouselSection copy$default(StatsCarouselSection statsCarouselSection, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = statsCarouselSection.daysInStreak;
        }
        if ((i12 & 2) != 0) {
            i11 = statsCarouselSection.minutesListenedToday;
        }
        return statsCarouselSection.copy(i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDaysInStreak() {
        return this.daysInStreak;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutesListenedToday() {
        return this.minutesListenedToday;
    }

    public final StatsCarouselSection copy(int daysInStreak, int minutesListenedToday) {
        return new StatsCarouselSection(daysInStreak, minutesListenedToday);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsCarouselSection)) {
            return false;
        }
        StatsCarouselSection statsCarouselSection = (StatsCarouselSection) other;
        if (this.daysInStreak == statsCarouselSection.daysInStreak && this.minutesListenedToday == statsCarouselSection.minutesListenedToday) {
            return true;
        }
        return false;
    }

    public final int getDaysInStreak() {
        return this.daysInStreak;
    }

    public final int getMinutesListenedToday() {
        return this.minutesListenedToday;
    }

    public int hashCode() {
        return Integer.hashCode(this.minutesListenedToday) + (Integer.hashCode(this.daysInStreak) * 31);
    }

    public String toString() {
        return c.l("StatsCarouselSection(daysInStreak=", this.daysInStreak, ", minutesListenedToday=", this.minutesListenedToday, Separators.RPAREN);
    }
}
