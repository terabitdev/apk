package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001)BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0014\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006*"}, d2 = {"Lio/elevenlabs/domain/model/PlayerPreferences;", "", "nextButtonAction", "Lio/elevenlabs/domain/model/BluetoothButtonAction;", "previousButtonAction", "forwardButtonAction", "backButtonAction", "inAppForwardSeekDuration", "Lio/elevenlabs/domain/model/SkipDuration;", "inAppBackwardSeekDuration", "autoFullscreenEnabled", "", "tapToShowControlsEnabled", "<init>", "(Lio/elevenlabs/domain/model/BluetoothButtonAction;Lio/elevenlabs/domain/model/BluetoothButtonAction;Lio/elevenlabs/domain/model/BluetoothButtonAction;Lio/elevenlabs/domain/model/BluetoothButtonAction;Lio/elevenlabs/domain/model/SkipDuration;Lio/elevenlabs/domain/model/SkipDuration;ZZ)V", "getNextButtonAction", "()Lio/elevenlabs/domain/model/BluetoothButtonAction;", "getPreviousButtonAction", "getForwardButtonAction", "getBackButtonAction", "getInAppForwardSeekDuration", "()Lio/elevenlabs/domain/model/SkipDuration;", "getInAppBackwardSeekDuration", "getAutoFullscreenEnabled", "()Z", "getTapToShowControlsEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "Defaults", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class PlayerPreferences {
    private final boolean autoFullscreenEnabled;
    private final BluetoothButtonAction backButtonAction;
    private final BluetoothButtonAction forwardButtonAction;
    private final SkipDuration inAppBackwardSeekDuration;
    private final SkipDuration inAppForwardSeekDuration;
    private final BluetoothButtonAction nextButtonAction;
    private final BluetoothButtonAction previousButtonAction;
    private final boolean tapToShowControlsEnabled;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/model/PlayerPreferences$Defaults;", "", "<init>", "()V", "NEXT_BUTTON_ACTION", "Lio/elevenlabs/domain/model/BluetoothButtonAction;", "getNEXT_BUTTON_ACTION", "()Lio/elevenlabs/domain/model/BluetoothButtonAction;", "PREVIOUS_BUTTON_ACTION", "getPREVIOUS_BUTTON_ACTION", "FORWARD_BUTTON_ACTION", "getFORWARD_BUTTON_ACTION", "BACK_BUTTON_ACTION", "getBACK_BUTTON_ACTION", "IN_APP_FORWARD_SEEK_DURATION", "Lio/elevenlabs/domain/model/SkipDuration;", "getIN_APP_FORWARD_SEEK_DURATION", "()Lio/elevenlabs/domain/model/SkipDuration;", "IN_APP_BACKWARD_SEEK_DURATION", "getIN_APP_BACKWARD_SEEK_DURATION", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Defaults {
        private static final BluetoothButtonAction BACK_BUTTON_ACTION;
        private static final BluetoothButtonAction FORWARD_BUTTON_ACTION;
        public static final Defaults INSTANCE = new Defaults();
        private static final SkipDuration IN_APP_BACKWARD_SEEK_DURATION;
        private static final SkipDuration IN_APP_FORWARD_SEEK_DURATION;
        private static final BluetoothButtonAction NEXT_BUTTON_ACTION;
        private static final BluetoothButtonAction PREVIOUS_BUTTON_ACTION;

        static {
            BluetoothButtonAction bluetoothButtonAction = BluetoothButtonAction.SKIP_FORWARD_30;
            NEXT_BUTTON_ACTION = bluetoothButtonAction;
            BluetoothButtonAction bluetoothButtonAction2 = BluetoothButtonAction.SKIP_BACKWARD_15;
            PREVIOUS_BUTTON_ACTION = bluetoothButtonAction2;
            FORWARD_BUTTON_ACTION = bluetoothButtonAction;
            BACK_BUTTON_ACTION = bluetoothButtonAction2;
            IN_APP_FORWARD_SEEK_DURATION = SkipDuration.SECONDS_30;
            IN_APP_BACKWARD_SEEK_DURATION = SkipDuration.SECONDS_15;
        }

        private Defaults() {
        }

        public final BluetoothButtonAction getBACK_BUTTON_ACTION() {
            return BACK_BUTTON_ACTION;
        }

        public final BluetoothButtonAction getFORWARD_BUTTON_ACTION() {
            return FORWARD_BUTTON_ACTION;
        }

        public final SkipDuration getIN_APP_BACKWARD_SEEK_DURATION() {
            return IN_APP_BACKWARD_SEEK_DURATION;
        }

        public final SkipDuration getIN_APP_FORWARD_SEEK_DURATION() {
            return IN_APP_FORWARD_SEEK_DURATION;
        }

        public final BluetoothButtonAction getNEXT_BUTTON_ACTION() {
            return NEXT_BUTTON_ACTION;
        }

        public final BluetoothButtonAction getPREVIOUS_BUTTON_ACTION() {
            return PREVIOUS_BUTTON_ACTION;
        }
    }

    public /* synthetic */ PlayerPreferences(BluetoothButtonAction bluetoothButtonAction, BluetoothButtonAction bluetoothButtonAction2, BluetoothButtonAction bluetoothButtonAction3, BluetoothButtonAction bluetoothButtonAction4, SkipDuration skipDuration, SkipDuration skipDuration2, boolean z6, boolean z10, int i10, f fVar) {
        this((i10 & 1) != 0 ? Defaults.INSTANCE.getNEXT_BUTTON_ACTION() : bluetoothButtonAction, (i10 & 2) != 0 ? Defaults.INSTANCE.getPREVIOUS_BUTTON_ACTION() : bluetoothButtonAction2, (i10 & 4) != 0 ? Defaults.INSTANCE.getFORWARD_BUTTON_ACTION() : bluetoothButtonAction3, (i10 & 8) != 0 ? Defaults.INSTANCE.getBACK_BUTTON_ACTION() : bluetoothButtonAction4, (i10 & 16) != 0 ? Defaults.INSTANCE.getIN_APP_FORWARD_SEEK_DURATION() : skipDuration, (i10 & 32) != 0 ? Defaults.INSTANCE.getIN_APP_BACKWARD_SEEK_DURATION() : skipDuration2, (i10 & 64) != 0 ? true : z6, (i10 & 128) != 0 ? false : z10);
    }

    public static /* synthetic */ PlayerPreferences copy$default(PlayerPreferences playerPreferences, BluetoothButtonAction bluetoothButtonAction, BluetoothButtonAction bluetoothButtonAction2, BluetoothButtonAction bluetoothButtonAction3, BluetoothButtonAction bluetoothButtonAction4, SkipDuration skipDuration, SkipDuration skipDuration2, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bluetoothButtonAction = playerPreferences.nextButtonAction;
        }
        if ((i10 & 2) != 0) {
            bluetoothButtonAction2 = playerPreferences.previousButtonAction;
        }
        if ((i10 & 4) != 0) {
            bluetoothButtonAction3 = playerPreferences.forwardButtonAction;
        }
        if ((i10 & 8) != 0) {
            bluetoothButtonAction4 = playerPreferences.backButtonAction;
        }
        if ((i10 & 16) != 0) {
            skipDuration = playerPreferences.inAppForwardSeekDuration;
        }
        if ((i10 & 32) != 0) {
            skipDuration2 = playerPreferences.inAppBackwardSeekDuration;
        }
        if ((i10 & 64) != 0) {
            z6 = playerPreferences.autoFullscreenEnabled;
        }
        if ((i10 & 128) != 0) {
            z10 = playerPreferences.tapToShowControlsEnabled;
        }
        boolean z11 = z6;
        boolean z12 = z10;
        SkipDuration skipDuration3 = skipDuration;
        SkipDuration skipDuration4 = skipDuration2;
        return playerPreferences.copy(bluetoothButtonAction, bluetoothButtonAction2, bluetoothButtonAction3, bluetoothButtonAction4, skipDuration3, skipDuration4, z11, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final BluetoothButtonAction getNextButtonAction() {
        return this.nextButtonAction;
    }

    /* renamed from: component2, reason: from getter */
    public final BluetoothButtonAction getPreviousButtonAction() {
        return this.previousButtonAction;
    }

    /* renamed from: component3, reason: from getter */
    public final BluetoothButtonAction getForwardButtonAction() {
        return this.forwardButtonAction;
    }

    /* renamed from: component4, reason: from getter */
    public final BluetoothButtonAction getBackButtonAction() {
        return this.backButtonAction;
    }

    /* renamed from: component5, reason: from getter */
    public final SkipDuration getInAppForwardSeekDuration() {
        return this.inAppForwardSeekDuration;
    }

    /* renamed from: component6, reason: from getter */
    public final SkipDuration getInAppBackwardSeekDuration() {
        return this.inAppBackwardSeekDuration;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAutoFullscreenEnabled() {
        return this.autoFullscreenEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getTapToShowControlsEnabled() {
        return this.tapToShowControlsEnabled;
    }

    public final PlayerPreferences copy(BluetoothButtonAction nextButtonAction, BluetoothButtonAction previousButtonAction, BluetoothButtonAction forwardButtonAction, BluetoothButtonAction backButtonAction, SkipDuration inAppForwardSeekDuration, SkipDuration inAppBackwardSeekDuration, boolean autoFullscreenEnabled, boolean tapToShowControlsEnabled) {
        nextButtonAction.getClass();
        previousButtonAction.getClass();
        forwardButtonAction.getClass();
        backButtonAction.getClass();
        inAppForwardSeekDuration.getClass();
        inAppBackwardSeekDuration.getClass();
        return new PlayerPreferences(nextButtonAction, previousButtonAction, forwardButtonAction, backButtonAction, inAppForwardSeekDuration, inAppBackwardSeekDuration, autoFullscreenEnabled, tapToShowControlsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerPreferences)) {
            return false;
        }
        PlayerPreferences playerPreferences = (PlayerPreferences) other;
        if (this.nextButtonAction == playerPreferences.nextButtonAction && this.previousButtonAction == playerPreferences.previousButtonAction && this.forwardButtonAction == playerPreferences.forwardButtonAction && this.backButtonAction == playerPreferences.backButtonAction && this.inAppForwardSeekDuration == playerPreferences.inAppForwardSeekDuration && this.inAppBackwardSeekDuration == playerPreferences.inAppBackwardSeekDuration && this.autoFullscreenEnabled == playerPreferences.autoFullscreenEnabled && this.tapToShowControlsEnabled == playerPreferences.tapToShowControlsEnabled) {
            return true;
        }
        return false;
    }

    public final boolean getAutoFullscreenEnabled() {
        return this.autoFullscreenEnabled;
    }

    public final BluetoothButtonAction getBackButtonAction() {
        return this.backButtonAction;
    }

    public final BluetoothButtonAction getForwardButtonAction() {
        return this.forwardButtonAction;
    }

    public final SkipDuration getInAppBackwardSeekDuration() {
        return this.inAppBackwardSeekDuration;
    }

    public final SkipDuration getInAppForwardSeekDuration() {
        return this.inAppForwardSeekDuration;
    }

    public final BluetoothButtonAction getNextButtonAction() {
        return this.nextButtonAction;
    }

    public final BluetoothButtonAction getPreviousButtonAction() {
        return this.previousButtonAction;
    }

    public final boolean getTapToShowControlsEnabled() {
        return this.tapToShowControlsEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.tapToShowControlsEnabled) + b.f((this.inAppBackwardSeekDuration.hashCode() + ((this.inAppForwardSeekDuration.hashCode() + ((this.backButtonAction.hashCode() + ((this.forwardButtonAction.hashCode() + ((this.previousButtonAction.hashCode() + (this.nextButtonAction.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.autoFullscreenEnabled);
    }

    public String toString() {
        return "PlayerPreferences(nextButtonAction=" + this.nextButtonAction + ", previousButtonAction=" + this.previousButtonAction + ", forwardButtonAction=" + this.forwardButtonAction + ", backButtonAction=" + this.backButtonAction + ", inAppForwardSeekDuration=" + this.inAppForwardSeekDuration + ", inAppBackwardSeekDuration=" + this.inAppBackwardSeekDuration + ", autoFullscreenEnabled=" + this.autoFullscreenEnabled + ", tapToShowControlsEnabled=" + this.tapToShowControlsEnabled + Separators.RPAREN;
    }

    public PlayerPreferences(BluetoothButtonAction bluetoothButtonAction, BluetoothButtonAction bluetoothButtonAction2, BluetoothButtonAction bluetoothButtonAction3, BluetoothButtonAction bluetoothButtonAction4, SkipDuration skipDuration, SkipDuration skipDuration2, boolean z6, boolean z10) {
        bluetoothButtonAction.getClass();
        bluetoothButtonAction2.getClass();
        bluetoothButtonAction3.getClass();
        bluetoothButtonAction4.getClass();
        skipDuration.getClass();
        skipDuration2.getClass();
        this.nextButtonAction = bluetoothButtonAction;
        this.previousButtonAction = bluetoothButtonAction2;
        this.forwardButtonAction = bluetoothButtonAction3;
        this.backButtonAction = bluetoothButtonAction4;
        this.inAppForwardSeekDuration = skipDuration;
        this.inAppBackwardSeekDuration = skipDuration2;
        this.autoFullscreenEnabled = z6;
        this.tapToShowControlsEnabled = z10;
    }

    public PlayerPreferences() {
        this(null, null, null, null, null, null, false, false, 255, null);
    }
}
