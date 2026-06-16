package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadSource;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract;", "", "DomainState", "UiState", "PlayButtonState", SIPHeaderNames.EVENT, "ControlEvent", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface MiniPlayerContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$ControlEvent;", "", "NavigateToPlayer", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$ControlEvent$NavigateToPlayer;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface ControlEvent {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$ControlEvent$NavigateToPlayer;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$ControlEvent;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class NavigateToPlayer implements ControlEvent {
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
                if ((other instanceof NavigateToPlayer) && m.c(this.readId, ((NavigateToPlayer) other).readId)) {
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

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;", "", "LifecycleResume", "LifecyclePause", "ClickPlayPause", "ClickSeekBackward", "ClickContainer", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$ClickContainer;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$ClickPlayPause;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$ClickSeekBackward;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$LifecyclePause;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$LifecycleResume;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$ClickContainer;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ClickContainer implements Event {
            public static final int $stable = 0;
            public static final ClickContainer INSTANCE = new ClickContainer();

            private ClickContainer() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ClickContainer)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1863959990;
            }

            public String toString() {
                return "ClickContainer";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$ClickPlayPause;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ClickPlayPause implements Event {
            public static final int $stable = 0;
            public static final ClickPlayPause INSTANCE = new ClickPlayPause();

            private ClickPlayPause() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ClickPlayPause)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 382993495;
            }

            public String toString() {
                return "ClickPlayPause";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$ClickSeekBackward;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class ClickSeekBackward implements Event {
            public static final int $stable = 0;
            public static final ClickSeekBackward INSTANCE = new ClickSeekBackward();

            private ClickSeekBackward() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ClickSeekBackward)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2003961126;
            }

            public String toString() {
                return "ClickSeekBackward";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$LifecyclePause;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class LifecyclePause implements Event {
            public static final int $stable = 0;
            public static final LifecyclePause INSTANCE = new LifecyclePause();

            private LifecyclePause() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof LifecyclePause)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -397490551;
            }

            public String toString() {
                return "LifecyclePause";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event$LifecycleResume;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class LifecycleResume implements Event {
            public static final int $stable = 0;
            public static final LifecycleResume INSTANCE = new LifecycleResume();

            private LifecycleResume() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof LifecycleResume)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 623589882;
            }

            public String toString() {
                return "LifecycleResume";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState;", "", "Loading", "Active", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState$Active;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState$Loading;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface PlayButtonState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState$Active;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState;", "isPlaying", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Active implements PlayButtonState {
            public static final int $stable = 0;
            private final boolean isPlaying;

            public Active(boolean z6) {
                this.isPlaying = z6;
            }

            public static /* synthetic */ Active copy$default(Active active, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z6 = active.isPlaying;
                }
                return active.copy(z6);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsPlaying() {
                return this.isPlaying;
            }

            public final Active copy(boolean isPlaying) {
                return new Active(isPlaying);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Active) && this.isPlaying == ((Active) other).isPlaying) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isPlaying);
            }

            public final boolean isPlaying() {
                return this.isPlaying;
            }

            public String toString() {
                return "Active(isPlaying=" + this.isPlaying + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Loading implements PlayButtonState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Loading)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1845481904;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState;", "", "Hidden", "Shown", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState$Shown;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface UiState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState$Hidden;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Hidden implements UiState {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Hidden)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -26961628;
            }

            public String toString() {
                return "Hidden";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState$Shown;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$UiState;", "title", "", "author", "coverImageUrl", "source", "Lio/elevenlabs/domain/model/ReadSource;", "originalFileType", "playButtonState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/ReadSource;Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState;)V", "getTitle", "()Ljava/lang/String;", "getAuthor", "getCoverImageUrl", "getSource", "()Lio/elevenlabs/domain/model/ReadSource;", "getOriginalFileType", "getPlayButtonState", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$PlayButtonState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Shown implements UiState {
            public static final int $stable = 8;
            private final String author;
            private final String coverImageUrl;
            private final String originalFileType;
            private final PlayButtonState playButtonState;
            private final ReadSource source;
            private final String title;

            public Shown(String str, String str2, String str3, ReadSource readSource, String str4, PlayButtonState playButtonState) {
                str.getClass();
                str2.getClass();
                playButtonState.getClass();
                this.title = str;
                this.author = str2;
                this.coverImageUrl = str3;
                this.source = readSource;
                this.originalFileType = str4;
                this.playButtonState = playButtonState;
            }

            public static /* synthetic */ Shown copy$default(Shown shown, String str, String str2, String str3, ReadSource readSource, String str4, PlayButtonState playButtonState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = shown.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = shown.author;
                }
                if ((i10 & 4) != 0) {
                    str3 = shown.coverImageUrl;
                }
                if ((i10 & 8) != 0) {
                    readSource = shown.source;
                }
                if ((i10 & 16) != 0) {
                    str4 = shown.originalFileType;
                }
                if ((i10 & 32) != 0) {
                    playButtonState = shown.playButtonState;
                }
                String str5 = str4;
                PlayButtonState playButtonState2 = playButtonState;
                return shown.copy(str, str2, str3, readSource, str5, playButtonState2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAuthor() {
                return this.author;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCoverImageUrl() {
                return this.coverImageUrl;
            }

            /* renamed from: component4, reason: from getter */
            public final ReadSource getSource() {
                return this.source;
            }

            /* renamed from: component5, reason: from getter */
            public final String getOriginalFileType() {
                return this.originalFileType;
            }

            /* renamed from: component6, reason: from getter */
            public final PlayButtonState getPlayButtonState() {
                return this.playButtonState;
            }

            public final Shown copy(String title, String author, String coverImageUrl, ReadSource source, String originalFileType, PlayButtonState playButtonState) {
                title.getClass();
                author.getClass();
                playButtonState.getClass();
                return new Shown(title, author, coverImageUrl, source, originalFileType, playButtonState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Shown)) {
                    return false;
                }
                Shown shown = (Shown) other;
                if (m.c(this.title, shown.title) && m.c(this.author, shown.author) && m.c(this.coverImageUrl, shown.coverImageUrl) && this.source == shown.source && m.c(this.originalFileType, shown.originalFileType) && m.c(this.playButtonState, shown.playButtonState)) {
                    return true;
                }
                return false;
            }

            public final String getAuthor() {
                return this.author;
            }

            public final String getCoverImageUrl() {
                return this.coverImageUrl;
            }

            public final String getOriginalFileType() {
                return this.originalFileType;
            }

            public final PlayButtonState getPlayButtonState() {
                return this.playButtonState;
            }

            public final ReadSource getSource() {
                return this.source;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int c5 = j0.c.c(this.title.hashCode() * 31, 31, this.author);
                String str = this.coverImageUrl;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (c5 + hashCode) * 31;
                ReadSource readSource = this.source;
                if (readSource == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = readSource.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str2 = this.originalFileType;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return this.playButtonState.hashCode() + ((i12 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.author;
                String str3 = this.coverImageUrl;
                ReadSource readSource = this.source;
                String str4 = this.originalFileType;
                PlayButtonState playButtonState = this.playButtonState;
                StringBuilder s10 = defpackage.f.s("Shown(title=", str, ", author=", str2, ", coverImageUrl=");
                s10.append(str3);
                s10.append(", source=");
                s10.append(readSource);
                s10.append(", originalFileType=");
                s10.append(str4);
                s10.append(", playButtonState=");
                s10.append(playButtonState);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/mini/MiniPlayerContract$DomainState;", "", "item", "Lio/elevenlabs/domain/model/ReadMeta;", "playerConnectionState", "Lio/elevenlabs/domain/model/PlayerConnectionState;", "isPlayingWhenReady", "", "isAppInForeground", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/PlayerConnectionState;ZZ)V", "getItem", "()Lio/elevenlabs/domain/model/ReadMeta;", "getPlayerConnectionState", "()Lio/elevenlabs/domain/model/PlayerConnectionState;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class DomainState {
        public static final int $stable = 8;
        private final boolean isAppInForeground;
        private final boolean isPlayingWhenReady;
        private final ReadMeta item;
        private final PlayerConnectionState playerConnectionState;

        public /* synthetic */ DomainState(ReadMeta readMeta, PlayerConnectionState playerConnectionState, boolean z6, boolean z10, int i10, kotlin.jvm.internal.f fVar) {
            this((i10 & 1) != 0 ? null : readMeta, (i10 & 2) != 0 ? PlayerConnectionState.UNKNOWN : playerConnectionState, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? true : z10);
        }

        public static /* synthetic */ DomainState copy$default(DomainState domainState, ReadMeta readMeta, PlayerConnectionState playerConnectionState, boolean z6, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readMeta = domainState.item;
            }
            if ((i10 & 2) != 0) {
                playerConnectionState = domainState.playerConnectionState;
            }
            if ((i10 & 4) != 0) {
                z6 = domainState.isPlayingWhenReady;
            }
            if ((i10 & 8) != 0) {
                z10 = domainState.isAppInForeground;
            }
            return domainState.copy(readMeta, playerConnectionState, z6, z10);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadMeta getItem() {
            return this.item;
        }

        /* renamed from: component2, reason: from getter */
        public final PlayerConnectionState getPlayerConnectionState() {
            return this.playerConnectionState;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPlayingWhenReady() {
            return this.isPlayingWhenReady;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsAppInForeground() {
            return this.isAppInForeground;
        }

        public final DomainState copy(ReadMeta item, PlayerConnectionState playerConnectionState, boolean isPlayingWhenReady, boolean isAppInForeground) {
            playerConnectionState.getClass();
            return new DomainState(item, playerConnectionState, isPlayingWhenReady, isAppInForeground);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DomainState)) {
                return false;
            }
            DomainState domainState = (DomainState) other;
            if (m.c(this.item, domainState.item) && this.playerConnectionState == domainState.playerConnectionState && this.isPlayingWhenReady == domainState.isPlayingWhenReady && this.isAppInForeground == domainState.isAppInForeground) {
                return true;
            }
            return false;
        }

        public final ReadMeta getItem() {
            return this.item;
        }

        public final PlayerConnectionState getPlayerConnectionState() {
            return this.playerConnectionState;
        }

        public int hashCode() {
            int hashCode;
            ReadMeta readMeta = this.item;
            if (readMeta == null) {
                hashCode = 0;
            } else {
                hashCode = readMeta.hashCode();
            }
            return Boolean.hashCode(this.isAppInForeground) + com.google.android.gms.internal.play_billing.b.f((this.playerConnectionState.hashCode() + (hashCode * 31)) * 31, 31, this.isPlayingWhenReady);
        }

        public final boolean isAppInForeground() {
            return this.isAppInForeground;
        }

        public final boolean isPlayingWhenReady() {
            return this.isPlayingWhenReady;
        }

        public String toString() {
            return "DomainState(item=" + this.item + ", playerConnectionState=" + this.playerConnectionState + ", isPlayingWhenReady=" + this.isPlayingWhenReady + ", isAppInForeground=" + this.isAppInForeground + Separators.RPAREN;
        }

        public DomainState(ReadMeta readMeta, PlayerConnectionState playerConnectionState, boolean z6, boolean z10) {
            playerConnectionState.getClass();
            this.item = readMeta;
            this.playerConnectionState = playerConnectionState;
            this.isPlayingWhenReady = z6;
            this.isAppInForeground = z10;
        }

        public DomainState() {
            this(null, null, false, false, 15, null);
        }
    }
}
