package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapeCategory;
import io.livekit.android.rpc.RpcError;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.o;
import tn.t;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract;", "", "<init>", "()V", SIPHeaderNames.EVENT, "State", "ControlEvent", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SoundscapesContract {
    public static final int $stable = 0;
    public static final SoundscapesContract INSTANCE = new SoundscapesContract();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$ControlEvent;", "", "CloseScreen", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$ControlEvent$CloseScreen;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface ControlEvent {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$ControlEvent$CloseScreen;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$ControlEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class CloseScreen implements ControlEvent {
            public static final int $stable = 0;
            public static final CloseScreen INSTANCE = new CloseScreen();

            private CloseScreen() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CloseScreen)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 175616705;
            }

            public String toString() {
                return "CloseScreen";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "", "Close", "SelectTab", "UpdateMixerLevel", "SelectSoundscape", "Reset", "Save", "PlayPreview", "StopPreview", "Retry", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$PlayPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$Reset;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$Retry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$Save;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$SelectSoundscape;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$SelectTab;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$StopPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$UpdateMixerLevel;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Event {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$Close;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Close implements Event {
            public static final int $stable = 0;
            public static final Close INSTANCE = new Close();

            private Close() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Close)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 7936822;
            }

            public String toString() {
                return "Close";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$PlayPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "soundscape", "Lio/elevenlabs/domain/model/Soundscape;", "<init>", "(Lio/elevenlabs/domain/model/Soundscape;)V", "getSoundscape", "()Lio/elevenlabs/domain/model/Soundscape;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class PlayPreview implements Event {
            public static final int $stable = 8;
            private final Soundscape soundscape;

            public PlayPreview(Soundscape soundscape) {
                soundscape.getClass();
                this.soundscape = soundscape;
            }

            public static /* synthetic */ PlayPreview copy$default(PlayPreview playPreview, Soundscape soundscape, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    soundscape = playPreview.soundscape;
                }
                return playPreview.copy(soundscape);
            }

            /* renamed from: component1, reason: from getter */
            public final Soundscape getSoundscape() {
                return this.soundscape;
            }

            public final PlayPreview copy(Soundscape soundscape) {
                soundscape.getClass();
                return new PlayPreview(soundscape);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayPreview) && kotlin.jvm.internal.m.c(this.soundscape, ((PlayPreview) other).soundscape)) {
                    return true;
                }
                return false;
            }

            public final Soundscape getSoundscape() {
                return this.soundscape;
            }

            public int hashCode() {
                return this.soundscape.hashCode();
            }

            public String toString() {
                return "PlayPreview(soundscape=" + this.soundscape + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$Reset;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Reset implements Event {
            public static final int $stable = 0;
            public static final Reset INSTANCE = new Reset();

            private Reset() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Reset)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 21584525;
            }

            public String toString() {
                return "Reset";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$Retry;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Retry implements Event {
            public static final int $stable = 0;
            public static final Retry INSTANCE = new Retry();

            private Retry() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Retry)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 21585894;
            }

            public String toString() {
                return "Retry";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$Save;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Save implements Event {
            public static final int $stable = 0;
            public static final Save INSTANCE = new Save();

            private Save() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Save)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -276372353;
            }

            public String toString() {
                return "Save";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$SelectSoundscape;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "soundscape", "Lio/elevenlabs/domain/model/Soundscape;", "<init>", "(Lio/elevenlabs/domain/model/Soundscape;)V", "getSoundscape", "()Lio/elevenlabs/domain/model/Soundscape;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SelectSoundscape implements Event {
            public static final int $stable = 8;
            private final Soundscape soundscape;

            public SelectSoundscape(Soundscape soundscape) {
                this.soundscape = soundscape;
            }

            public static /* synthetic */ SelectSoundscape copy$default(SelectSoundscape selectSoundscape, Soundscape soundscape, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    soundscape = selectSoundscape.soundscape;
                }
                return selectSoundscape.copy(soundscape);
            }

            /* renamed from: component1, reason: from getter */
            public final Soundscape getSoundscape() {
                return this.soundscape;
            }

            public final SelectSoundscape copy(Soundscape soundscape) {
                return new SelectSoundscape(soundscape);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SelectSoundscape) && kotlin.jvm.internal.m.c(this.soundscape, ((SelectSoundscape) other).soundscape)) {
                    return true;
                }
                return false;
            }

            public final Soundscape getSoundscape() {
                return this.soundscape;
            }

            public int hashCode() {
                Soundscape soundscape = this.soundscape;
                if (soundscape == null) {
                    return 0;
                }
                return soundscape.hashCode();
            }

            public String toString() {
                return "SelectSoundscape(soundscape=" + this.soundscape + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$SelectTab;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "tab", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;)V", "getTab", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class SelectTab implements Event {
            public static final int $stable = 0;
            private final SoundscapeCategory tab;

            public SelectTab(SoundscapeCategory soundscapeCategory) {
                soundscapeCategory.getClass();
                this.tab = soundscapeCategory;
            }

            public static /* synthetic */ SelectTab copy$default(SelectTab selectTab, SoundscapeCategory soundscapeCategory, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    soundscapeCategory = selectTab.tab;
                }
                return selectTab.copy(soundscapeCategory);
            }

            /* renamed from: component1, reason: from getter */
            public final SoundscapeCategory getTab() {
                return this.tab;
            }

            public final SelectTab copy(SoundscapeCategory tab) {
                tab.getClass();
                return new SelectTab(tab);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SelectTab) && kotlin.jvm.internal.m.c(this.tab, ((SelectTab) other).tab)) {
                    return true;
                }
                return false;
            }

            public final SoundscapeCategory getTab() {
                return this.tab;
            }

            public int hashCode() {
                return this.tab.hashCode();
            }

            public String toString() {
                return "SelectTab(tab=" + this.tab + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$StopPreview;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class StopPreview implements Event {
            public static final int $stable = 0;
            public static final StopPreview INSTANCE = new StopPreview();

            private StopPreview() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof StopPreview)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1662475228;
            }

            public String toString() {
                return "StopPreview";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event$UpdateMixerLevel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", FirebaseAnalytics.Param.LEVEL, "", "<init>", "(F)V", "getLevel", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class UpdateMixerLevel implements Event {
            public static final int $stable = 0;
            private final float level;

            public UpdateMixerLevel(float f10) {
                this.level = f10;
            }

            public static /* synthetic */ UpdateMixerLevel copy$default(UpdateMixerLevel updateMixerLevel, float f10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = updateMixerLevel.level;
                }
                return updateMixerLevel.copy(f10);
            }

            /* renamed from: component1, reason: from getter */
            public final float getLevel() {
                return this.level;
            }

            public final UpdateMixerLevel copy(float level) {
                return new UpdateMixerLevel(level);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof UpdateMixerLevel) && Float.compare(this.level, ((UpdateMixerLevel) other).level) == 0) {
                    return true;
                }
                return false;
            }

            public final float getLevel() {
                return this.level;
            }

            public int hashCode() {
                return Float.hashCode(this.level);
            }

            public String toString() {
                return "UpdateMixerLevel(level=" + this.level + Separators.RPAREN;
            }
        }
    }

    private SoundscapesContract() {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u00101\u001a\u0004\u0018\u00010\r2\u0006\u00102\u001a\u00020\u0005¢\u0006\u0002\u00103J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0016HÆ\u0003J¶\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0016HÆ\u0001¢\u0006\u0002\u0010BJ\u0014\u0010C\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010E\u001a\u00020FHÖ\u0081\u0004J\n\u0010G\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b0\u0010\u001d¨\u0006H"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$State;", "", "isLoading", "", "errorMessage", "", "allSoundscapes", "", "Lio/elevenlabs/domain/model/Soundscape;", "categories", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "selectedCategory", "mixerLevel", "", "selectedSoundscape", "selectedSoundscapeFile", "Ljava/io/File;", "originalSoundscape", "originalSoundscapeFile", "originalMixerLevel", "playingPreviewId", "downloadProgress", "", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;FLio/elevenlabs/domain/model/Soundscape;Ljava/io/File;Lio/elevenlabs/domain/model/Soundscape;Ljava/io/File;Ljava/lang/Float;Ljava/lang/String;Ljava/util/Map;)V", "()Z", "getErrorMessage", "()Ljava/lang/String;", "getAllSoundscapes", "()Ljava/util/List;", "getCategories", "getSelectedCategory", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "getMixerLevel", "()F", "getSelectedSoundscape", "()Lio/elevenlabs/domain/model/Soundscape;", "getSelectedSoundscapeFile", "()Ljava/io/File;", "getOriginalSoundscape", "getOriginalSoundscapeFile", "getOriginalMixerLevel", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPlayingPreviewId", "getDownloadProgress", "()Ljava/util/Map;", "filteredSoundscapes", "getFilteredSoundscapes", "soundscapeProgress", "id", "(Ljava/lang/String;)Ljava/lang/Float;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;FLio/elevenlabs/domain/model/Soundscape;Ljava/io/File;Lio/elevenlabs/domain/model/Soundscape;Ljava/io/File;Ljava/lang/Float;Ljava/lang/String;Ljava/util/Map;)Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$State;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final List<Soundscape> allSoundscapes;
        private final List<SoundscapeCategory> categories;
        private final Map<String, Float> downloadProgress;
        private final String errorMessage;
        private final boolean isLoading;
        private final float mixerLevel;
        private final Float originalMixerLevel;
        private final Soundscape originalSoundscape;
        private final File originalSoundscapeFile;
        private final String playingPreviewId;
        private final SoundscapeCategory selectedCategory;
        private final Soundscape selectedSoundscape;
        private final File selectedSoundscapeFile;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ State(boolean z6, String str, List list, List list2, SoundscapeCategory soundscapeCategory, float f10, Soundscape soundscape, File file, Soundscape soundscape2, File file2, Float f11, String str2, Map map, int i10, kotlin.jvm.internal.f fVar) {
            this(z6, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r2, r28);
            String str3;
            List list3;
            List list4;
            SoundscapeCategory soundscapeCategory2;
            float f12;
            Soundscape soundscape3;
            File file3;
            Soundscape soundscape4;
            File file4;
            Float f13;
            Map map2;
            z6 = (i10 & 1) != 0 ? true : z6;
            if ((i10 & 2) != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if ((i10 & 4) != 0) {
                list3 = t.f33547a;
            } else {
                list3 = list;
            }
            if ((i10 & 8) != 0) {
                list4 = o.O0(SoundscapeCategory.INSTANCE.getPresets(), ig.f.H(SoundscapeCategory.All.INSTANCE));
            } else {
                list4 = list2;
            }
            if ((i10 & 16) != 0) {
                soundscapeCategory2 = SoundscapeCategory.All.INSTANCE;
            } else {
                soundscapeCategory2 = soundscapeCategory;
            }
            if ((i10 & 32) != 0) {
                f12 = 0.5f;
            } else {
                f12 = f10;
            }
            if ((i10 & 64) != 0) {
                soundscape3 = null;
            } else {
                soundscape3 = soundscape;
            }
            if ((i10 & 128) != 0) {
                file3 = null;
            } else {
                file3 = file;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                soundscape4 = null;
            } else {
                soundscape4 = soundscape2;
            }
            if ((i10 & 512) != 0) {
                file4 = null;
            } else {
                file4 = file2;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                f13 = null;
            } else {
                f13 = f11;
            }
            String str4 = (i10 & 2048) == 0 ? str2 : null;
            if ((i10 & 4096) != 0) {
                map2 = u.f33548a;
            } else {
                map2 = map;
            }
        }

        public static /* synthetic */ State copy$default(State state, boolean z6, String str, List list, List list2, SoundscapeCategory soundscapeCategory, float f10, Soundscape soundscape, File file, Soundscape soundscape2, File file2, Float f11, String str2, Map map, int i10, Object obj) {
            String str3;
            List list3;
            List list4;
            SoundscapeCategory soundscapeCategory2;
            float f12;
            Soundscape soundscape3;
            File file3;
            Soundscape soundscape4;
            File file4;
            Float f13;
            String str4;
            Map map2;
            if ((i10 & 1) != 0) {
                z6 = state.isLoading;
            }
            if ((i10 & 2) != 0) {
                str3 = state.errorMessage;
            } else {
                str3 = str;
            }
            if ((i10 & 4) != 0) {
                list3 = state.allSoundscapes;
            } else {
                list3 = list;
            }
            if ((i10 & 8) != 0) {
                list4 = state.categories;
            } else {
                list4 = list2;
            }
            if ((i10 & 16) != 0) {
                soundscapeCategory2 = state.selectedCategory;
            } else {
                soundscapeCategory2 = soundscapeCategory;
            }
            if ((i10 & 32) != 0) {
                f12 = state.mixerLevel;
            } else {
                f12 = f10;
            }
            if ((i10 & 64) != 0) {
                soundscape3 = state.selectedSoundscape;
            } else {
                soundscape3 = soundscape;
            }
            if ((i10 & 128) != 0) {
                file3 = state.selectedSoundscapeFile;
            } else {
                file3 = file;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                soundscape4 = state.originalSoundscape;
            } else {
                soundscape4 = soundscape2;
            }
            if ((i10 & 512) != 0) {
                file4 = state.originalSoundscapeFile;
            } else {
                file4 = file2;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                f13 = state.originalMixerLevel;
            } else {
                f13 = f11;
            }
            if ((i10 & 2048) != 0) {
                str4 = state.playingPreviewId;
            } else {
                str4 = str2;
            }
            if ((i10 & 4096) != 0) {
                map2 = state.downloadProgress;
            } else {
                map2 = map;
            }
            return state.copy(z6, str3, list3, list4, soundscapeCategory2, f12, soundscape3, file3, soundscape4, file4, f13, str4, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component10, reason: from getter */
        public final File getOriginalSoundscapeFile() {
            return this.originalSoundscapeFile;
        }

        /* renamed from: component11, reason: from getter */
        public final Float getOriginalMixerLevel() {
            return this.originalMixerLevel;
        }

        /* renamed from: component12, reason: from getter */
        public final String getPlayingPreviewId() {
            return this.playingPreviewId;
        }

        public final Map<String, Float> component13() {
            return this.downloadProgress;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final List<Soundscape> component3() {
            return this.allSoundscapes;
        }

        public final List<SoundscapeCategory> component4() {
            return this.categories;
        }

        /* renamed from: component5, reason: from getter */
        public final SoundscapeCategory getSelectedCategory() {
            return this.selectedCategory;
        }

        /* renamed from: component6, reason: from getter */
        public final float getMixerLevel() {
            return this.mixerLevel;
        }

        /* renamed from: component7, reason: from getter */
        public final Soundscape getSelectedSoundscape() {
            return this.selectedSoundscape;
        }

        /* renamed from: component8, reason: from getter */
        public final File getSelectedSoundscapeFile() {
            return this.selectedSoundscapeFile;
        }

        /* renamed from: component9, reason: from getter */
        public final Soundscape getOriginalSoundscape() {
            return this.originalSoundscape;
        }

        public final State copy(boolean isLoading, String errorMessage, List<Soundscape> allSoundscapes, List<? extends SoundscapeCategory> categories, SoundscapeCategory selectedCategory, float mixerLevel, Soundscape selectedSoundscape, File selectedSoundscapeFile, Soundscape originalSoundscape, File originalSoundscapeFile, Float originalMixerLevel, String playingPreviewId, Map<String, Float> downloadProgress) {
            allSoundscapes.getClass();
            categories.getClass();
            selectedCategory.getClass();
            downloadProgress.getClass();
            return new State(isLoading, errorMessage, allSoundscapes, categories, selectedCategory, mixerLevel, selectedSoundscape, selectedSoundscapeFile, originalSoundscape, originalSoundscapeFile, originalMixerLevel, playingPreviewId, downloadProgress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            if (this.isLoading == state.isLoading && kotlin.jvm.internal.m.c(this.errorMessage, state.errorMessage) && kotlin.jvm.internal.m.c(this.allSoundscapes, state.allSoundscapes) && kotlin.jvm.internal.m.c(this.categories, state.categories) && kotlin.jvm.internal.m.c(this.selectedCategory, state.selectedCategory) && Float.compare(this.mixerLevel, state.mixerLevel) == 0 && kotlin.jvm.internal.m.c(this.selectedSoundscape, state.selectedSoundscape) && kotlin.jvm.internal.m.c(this.selectedSoundscapeFile, state.selectedSoundscapeFile) && kotlin.jvm.internal.m.c(this.originalSoundscape, state.originalSoundscape) && kotlin.jvm.internal.m.c(this.originalSoundscapeFile, state.originalSoundscapeFile) && kotlin.jvm.internal.m.c(this.originalMixerLevel, state.originalMixerLevel) && kotlin.jvm.internal.m.c(this.playingPreviewId, state.playingPreviewId) && kotlin.jvm.internal.m.c(this.downloadProgress, state.downloadProgress)) {
                return true;
            }
            return false;
        }

        public final List<Soundscape> getAllSoundscapes() {
            return this.allSoundscapes;
        }

        public final List<SoundscapeCategory> getCategories() {
            return this.categories;
        }

        public final Map<String, Float> getDownloadProgress() {
            return this.downloadProgress;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final List<Soundscape> getFilteredSoundscapes() {
            boolean c5 = kotlin.jvm.internal.m.c(this.selectedCategory, SoundscapeCategory.All.INSTANCE);
            List<Soundscape> list = this.allSoundscapes;
            if (c5) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.selectedCategory.matches(((Soundscape) obj).getCategory())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final float getMixerLevel() {
            return this.mixerLevel;
        }

        public final Float getOriginalMixerLevel() {
            return this.originalMixerLevel;
        }

        public final Soundscape getOriginalSoundscape() {
            return this.originalSoundscape;
        }

        public final File getOriginalSoundscapeFile() {
            return this.originalSoundscapeFile;
        }

        public final String getPlayingPreviewId() {
            return this.playingPreviewId;
        }

        public final SoundscapeCategory getSelectedCategory() {
            return this.selectedCategory;
        }

        public final Soundscape getSelectedSoundscape() {
            return this.selectedSoundscape;
        }

        public final File getSelectedSoundscapeFile() {
            return this.selectedSoundscapeFile;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7 = Boolean.hashCode(this.isLoading) * 31;
            String str = this.errorMessage;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int c5 = com.google.android.gms.internal.play_billing.b.c(this.mixerLevel, (this.selectedCategory.hashCode() + n.d(n.d((hashCode7 + hashCode) * 31, 31, this.allSoundscapes), 31, this.categories)) * 31, 31);
            Soundscape soundscape = this.selectedSoundscape;
            if (soundscape == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = soundscape.hashCode();
            }
            int i11 = (c5 + hashCode2) * 31;
            File file = this.selectedSoundscapeFile;
            if (file == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = file.hashCode();
            }
            int i12 = (i11 + hashCode3) * 31;
            Soundscape soundscape2 = this.originalSoundscape;
            if (soundscape2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = soundscape2.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            File file2 = this.originalSoundscapeFile;
            if (file2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = file2.hashCode();
            }
            int i14 = (i13 + hashCode5) * 31;
            Float f10 = this.originalMixerLevel;
            if (f10 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = f10.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str2 = this.playingPreviewId;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return this.downloadProgress.hashCode() + ((i15 + i10) * 31);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final Float soundscapeProgress(String id2) {
            id2.getClass();
            return this.downloadProgress.get(id2);
        }

        public String toString() {
            return "State(isLoading=" + this.isLoading + ", errorMessage=" + this.errorMessage + ", allSoundscapes=" + this.allSoundscapes + ", categories=" + this.categories + ", selectedCategory=" + this.selectedCategory + ", mixerLevel=" + this.mixerLevel + ", selectedSoundscape=" + this.selectedSoundscape + ", selectedSoundscapeFile=" + this.selectedSoundscapeFile + ", originalSoundscape=" + this.originalSoundscape + ", originalSoundscapeFile=" + this.originalSoundscapeFile + ", originalMixerLevel=" + this.originalMixerLevel + ", playingPreviewId=" + this.playingPreviewId + ", downloadProgress=" + this.downloadProgress + Separators.RPAREN;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(boolean z6, String str, List<Soundscape> list, List<? extends SoundscapeCategory> list2, SoundscapeCategory soundscapeCategory, float f10, Soundscape soundscape, File file, Soundscape soundscape2, File file2, Float f11, String str2, Map<String, Float> map) {
            list.getClass();
            list2.getClass();
            soundscapeCategory.getClass();
            map.getClass();
            this.isLoading = z6;
            this.errorMessage = str;
            this.allSoundscapes = list;
            this.categories = list2;
            this.selectedCategory = soundscapeCategory;
            this.mixerLevel = f10;
            this.selectedSoundscape = soundscape;
            this.selectedSoundscapeFile = file;
            this.originalSoundscape = soundscape2;
            this.originalSoundscapeFile = file2;
            this.originalMixerLevel = f11;
            this.playingPreviewId = str2;
            this.downloadProgress = map;
        }

        public State() {
            this(false, null, null, null, null, t2.u.P, null, null, null, null, null, null, null, 8191, null);
        }
    }
}
