package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsControlEvent;", "", "NavigateToPlayer", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsControlEvent$NavigateToPlayer;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface ReadDetailsControlEvent {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsControlEvent$NavigateToPlayer;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsControlEvent;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class NavigateToPlayer implements ReadDetailsControlEvent {
        public static final int $stable = 0;
        private final String readId;

        public NavigateToPlayer(String str) {
            str.getClass();
            this.readId = str;
        }

        public static /* synthetic */ NavigateToPlayer copy$default(NavigateToPlayer navigateToPlayer, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToPlayer.readId;
            }
            return navigateToPlayer.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReadId() {
            return this.readId;
        }

        public final NavigateToPlayer copy(String readId) {
            readId.getClass();
            return new NavigateToPlayer(readId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof NavigateToPlayer) && kotlin.jvm.internal.m.c(this.readId, ((NavigateToPlayer) other).readId)) {
                return true;
            }
            return false;
        }

        public final String getReadId() {
            return this.readId;
        }

        public int hashCode() {
            return this.readId.hashCode();
        }

        public String toString() {
            return defpackage.f.C("NavigateToPlayer(readId=", this.readId, Separators.RPAREN);
        }
    }
}
