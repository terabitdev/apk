package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.PlayerError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerControllerState;", "", "connectionState", "Lio/elevenlabs/domain/model/PlayerConnectionState;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lio/elevenlabs/domain/model/PlayerError;", "isPlayingWhenReady", "", "playbackSpeed", "", "<init>", "(Lio/elevenlabs/domain/model/PlayerConnectionState;Lio/elevenlabs/domain/model/PlayerError;ZLjava/lang/Float;)V", "getConnectionState", "()Lio/elevenlabs/domain/model/PlayerConnectionState;", "getError", "()Lio/elevenlabs/domain/model/PlayerError;", "()Z", "getPlaybackSpeed", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "copy", "(Lio/elevenlabs/domain/model/PlayerConnectionState;Lio/elevenlabs/domain/model/PlayerError;ZLjava/lang/Float;)Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerControllerState;", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PlayerControllerState {
    public static final int $stable = 8;
    private final PlayerConnectionState connectionState;
    private final PlayerError error;
    private final boolean isPlayingWhenReady;
    private final Float playbackSpeed;

    public /* synthetic */ PlayerControllerState(PlayerConnectionState playerConnectionState, PlayerError playerError, boolean z6, Float f10, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? PlayerConnectionState.UNKNOWN : playerConnectionState, (i10 & 2) != 0 ? null : playerError, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? null : f10);
    }

    public static /* synthetic */ PlayerControllerState copy$default(PlayerControllerState playerControllerState, PlayerConnectionState playerConnectionState, PlayerError playerError, boolean z6, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            playerConnectionState = playerControllerState.connectionState;
        }
        if ((i10 & 2) != 0) {
            playerError = playerControllerState.error;
        }
        if ((i10 & 4) != 0) {
            z6 = playerControllerState.isPlayingWhenReady;
        }
        if ((i10 & 8) != 0) {
            f10 = playerControllerState.playbackSpeed;
        }
        return playerControllerState.copy(playerConnectionState, playerError, z6, f10);
    }

    /* renamed from: component1, reason: from getter */
    public final PlayerConnectionState getConnectionState() {
        return this.connectionState;
    }

    /* renamed from: component2, reason: from getter */
    public final PlayerError getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPlayingWhenReady() {
        return this.isPlayingWhenReady;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public final PlayerControllerState copy(PlayerConnectionState connectionState, PlayerError r32, boolean isPlayingWhenReady, Float playbackSpeed) {
        connectionState.getClass();
        return new PlayerControllerState(connectionState, r32, isPlayingWhenReady, playbackSpeed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerControllerState)) {
            return false;
        }
        PlayerControllerState playerControllerState = (PlayerControllerState) other;
        if (this.connectionState == playerControllerState.connectionState && kotlin.jvm.internal.m.c(this.error, playerControllerState.error) && this.isPlayingWhenReady == playerControllerState.isPlayingWhenReady && kotlin.jvm.internal.m.c(this.playbackSpeed, playerControllerState.playbackSpeed)) {
            return true;
        }
        return false;
    }

    public final PlayerConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final PlayerError getError() {
        return this.error;
    }

    public final Float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.connectionState.hashCode() * 31;
        PlayerError playerError = this.error;
        int i10 = 0;
        if (playerError == null) {
            hashCode = 0;
        } else {
            hashCode = playerError.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f((hashCode2 + hashCode) * 31, 31, this.isPlayingWhenReady);
        Float f11 = this.playbackSpeed;
        if (f11 != null) {
            i10 = f11.hashCode();
        }
        return f10 + i10;
    }

    public final boolean isPlayingWhenReady() {
        return this.isPlayingWhenReady;
    }

    public String toString() {
        return "PlayerControllerState(connectionState=" + this.connectionState + ", error=" + this.error + ", isPlayingWhenReady=" + this.isPlayingWhenReady + ", playbackSpeed=" + this.playbackSpeed + Separators.RPAREN;
    }

    public PlayerControllerState(PlayerConnectionState playerConnectionState, PlayerError playerError, boolean z6, Float f10) {
        playerConnectionState.getClass();
        this.connectionState = playerConnectionState;
        this.error = playerError;
        this.isPlayingWhenReady = z6;
        this.playbackSpeed = f10;
    }

    public PlayerControllerState() {
        this(null, null, false, null, 15, null);
    }
}
