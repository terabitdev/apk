package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption;", "", "Off", "Time", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption$Off;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption$Time;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface SleepTimerOption {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption$Off;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Off implements SleepTimerOption {
        public static final int $stable = 0;
        public static final Off INSTANCE = new Off();

        private Off() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption$Time;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption;", "timerMinutes", "", "<init>", "(I)V", "getTimerMinutes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Time implements SleepTimerOption {
        public static final int $stable = 0;
        private final int timerMinutes;

        public Time(int i10) {
            this.timerMinutes = i10;
        }

        public static /* synthetic */ Time copy$default(Time time, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = time.timerMinutes;
            }
            return time.copy(i10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTimerMinutes() {
            return this.timerMinutes;
        }

        public final Time copy(int timerMinutes) {
            return new Time(timerMinutes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Time) && this.timerMinutes == ((Time) other).timerMinutes) {
                return true;
            }
            return false;
        }

        public final int getTimerMinutes() {
            return this.timerMinutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.timerMinutes);
        }

        public String toString() {
            return com.google.android.gms.internal.play_billing.b.j(this.timerMinutes, "Time(timerMinutes=", Separators.RPAREN);
        }
    }
}
