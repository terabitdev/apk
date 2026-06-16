package io.elevenlabs.readerapp.ui.screens.authenticated.home.elements;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/home/elements/DailyStreakSettingsState;", "", "goalMinutes", "", "isLoading", "", "close", "<init>", "(JZZ)V", "getGoalMinutes", "()J", "()Z", "getClose", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class DailyStreakSettingsState {
    public static final int $stable = 0;
    private final boolean close;
    private final long goalMinutes;
    private final boolean isLoading;

    public /* synthetic */ DailyStreakSettingsState(long j4, boolean z6, boolean z10, int i10, f fVar) {
        this((i10 & 1) != 0 ? 0L : j4, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? false : z10);
    }

    public static /* synthetic */ DailyStreakSettingsState copy$default(DailyStreakSettingsState dailyStreakSettingsState, long j4, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = dailyStreakSettingsState.goalMinutes;
        }
        if ((i10 & 2) != 0) {
            z6 = dailyStreakSettingsState.isLoading;
        }
        if ((i10 & 4) != 0) {
            z10 = dailyStreakSettingsState.close;
        }
        return dailyStreakSettingsState.copy(j4, z6, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final long getGoalMinutes() {
        return this.goalMinutes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClose() {
        return this.close;
    }

    public final DailyStreakSettingsState copy(long goalMinutes, boolean isLoading, boolean close) {
        return new DailyStreakSettingsState(goalMinutes, isLoading, close);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyStreakSettingsState)) {
            return false;
        }
        DailyStreakSettingsState dailyStreakSettingsState = (DailyStreakSettingsState) other;
        if (this.goalMinutes == dailyStreakSettingsState.goalMinutes && this.isLoading == dailyStreakSettingsState.isLoading && this.close == dailyStreakSettingsState.close) {
            return true;
        }
        return false;
    }

    public final boolean getClose() {
        return this.close;
    }

    public final long getGoalMinutes() {
        return this.goalMinutes;
    }

    public int hashCode() {
        return Boolean.hashCode(this.close) + com.google.android.gms.internal.play_billing.b.f(Long.hashCode(this.goalMinutes) * 31, 31, this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "DailyStreakSettingsState(goalMinutes=" + this.goalMinutes + ", isLoading=" + this.isLoading + ", close=" + this.close + Separators.RPAREN;
    }

    public DailyStreakSettingsState(long j4, boolean z6, boolean z10) {
        this.goalMinutes = j4;
        this.isLoading = z6;
        this.close = z10;
    }

    public DailyStreakSettingsState() {
        this(0L, false, false, 7, null);
    }
}
