package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage;", "", "PlayerError", "BookmarkNotSupported", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage$BookmarkNotSupported;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage$PlayerError;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface PlayerToastMessage {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage$BookmarkNotSupported;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class BookmarkNotSupported implements PlayerToastMessage {
        public static final int $stable = 0;
        public static final BookmarkNotSupported INSTANCE = new BookmarkNotSupported();

        private BookmarkNotSupported() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof BookmarkNotSupported)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1729825278;
        }

        public String toString() {
            return "BookmarkNotSupported";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage$PlayerError;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lio/elevenlabs/domain/model/PlayerError;", "<init>", "(Lio/elevenlabs/domain/model/PlayerError;)V", "getError", "()Lio/elevenlabs/domain/model/PlayerError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class PlayerError implements PlayerToastMessage {
        public static final int $stable = 8;
        private final io.elevenlabs.domain.model.PlayerError error;

        public PlayerError(io.elevenlabs.domain.model.PlayerError playerError) {
            playerError.getClass();
            this.error = playerError;
        }

        public static /* synthetic */ PlayerError copy$default(PlayerError playerError, io.elevenlabs.domain.model.PlayerError playerError2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                playerError2 = playerError.error;
            }
            return playerError.copy(playerError2);
        }

        /* renamed from: component1, reason: from getter */
        public final io.elevenlabs.domain.model.PlayerError getError() {
            return this.error;
        }

        public final PlayerError copy(io.elevenlabs.domain.model.PlayerError error) {
            error.getClass();
            return new PlayerError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof PlayerError) && kotlin.jvm.internal.m.c(this.error, ((PlayerError) other).error)) {
                return true;
            }
            return false;
        }

        public final io.elevenlabs.domain.model.PlayerError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "PlayerError(error=" + this.error + Separators.RPAREN;
        }
    }
}
