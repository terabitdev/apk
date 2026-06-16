package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsSpeedState;", "", "speed", "", "isActive", "", "<init>", "(FZ)V", "getSpeed", "()F", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PlayerButtonsSpeedState {
    public static final int $stable = 0;
    private final boolean isActive;
    private final float speed;

    public PlayerButtonsSpeedState(float f10, boolean z6) {
        this.speed = f10;
        this.isActive = z6;
    }

    public static /* synthetic */ PlayerButtonsSpeedState copy$default(PlayerButtonsSpeedState playerButtonsSpeedState, float f10, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = playerButtonsSpeedState.speed;
        }
        if ((i10 & 2) != 0) {
            z6 = playerButtonsSpeedState.isActive;
        }
        return playerButtonsSpeedState.copy(f10, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final PlayerButtonsSpeedState copy(float speed, boolean isActive) {
        return new PlayerButtonsSpeedState(speed, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerButtonsSpeedState)) {
            return false;
        }
        PlayerButtonsSpeedState playerButtonsSpeedState = (PlayerButtonsSpeedState) other;
        if (Float.compare(this.speed, playerButtonsSpeedState.speed) == 0 && this.isActive == playerButtonsSpeedState.isActive) {
            return true;
        }
        return false;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isActive) + (Float.hashCode(this.speed) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "PlayerButtonsSpeedState(speed=" + this.speed + ", isActive=" + this.isActive + Separators.RPAREN;
    }
}
