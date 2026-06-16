package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.domain.model.UserConfig;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0014\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerPreferencesState;", "", "playerConfig", "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "playerPreferences", "Lio/elevenlabs/domain/model/PlayerPreferences;", "configHasChanged", "", "preferencesHasChanged", "showFontsDialog", "showActionSelectorFor", "Lio/elevenlabs/domain/model/BluetoothButton;", "showInAppSkipDurationSelectorFor", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;", "<init>", "(Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;Lio/elevenlabs/domain/model/PlayerPreferences;ZZZLio/elevenlabs/domain/model/BluetoothButton;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;)V", "getPlayerConfig", "()Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "getPlayerPreferences", "()Lio/elevenlabs/domain/model/PlayerPreferences;", "getConfigHasChanged", "()Z", "getPreferencesHasChanged", "getShowFontsDialog", "getShowActionSelectorFor", "()Lio/elevenlabs/domain/model/BluetoothButton;", "getShowInAppSkipDurationSelectorFor", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PlayerPreferencesState {
    public static final int $stable = 8;
    private final boolean configHasChanged;
    private final UserConfig.PlayerConfig playerConfig;
    private final PlayerPreferences playerPreferences;
    private final boolean preferencesHasChanged;
    private final BluetoothButton showActionSelectorFor;
    private final boolean showFontsDialog;
    private final InAppSkipDirection showInAppSkipDurationSelectorFor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PlayerPreferencesState(UserConfig.PlayerConfig playerConfig, PlayerPreferences playerPreferences, boolean z6, boolean z10, boolean z11, BluetoothButton bluetoothButton, InAppSkipDirection inAppSkipDirection, int i10, kotlin.jvm.internal.f fVar) {
        this(playerConfig, playerPreferences, z6, z10, z11, bluetoothButton, r10);
        InAppSkipDirection inAppSkipDirection2;
        playerConfig = (i10 & 1) != 0 ? null : playerConfig;
        playerPreferences = (i10 & 2) != 0 ? null : playerPreferences;
        z6 = (i10 & 4) != 0 ? false : z6;
        z10 = (i10 & 8) != 0 ? false : z10;
        z11 = (i10 & 16) != 0 ? false : z11;
        bluetoothButton = (i10 & 32) != 0 ? null : bluetoothButton;
        if ((i10 & 64) != 0) {
            inAppSkipDirection2 = null;
        } else {
            inAppSkipDirection2 = inAppSkipDirection;
        }
    }

    public static /* synthetic */ PlayerPreferencesState copy$default(PlayerPreferencesState playerPreferencesState, UserConfig.PlayerConfig playerConfig, PlayerPreferences playerPreferences, boolean z6, boolean z10, boolean z11, BluetoothButton bluetoothButton, InAppSkipDirection inAppSkipDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            playerConfig = playerPreferencesState.playerConfig;
        }
        if ((i10 & 2) != 0) {
            playerPreferences = playerPreferencesState.playerPreferences;
        }
        if ((i10 & 4) != 0) {
            z6 = playerPreferencesState.configHasChanged;
        }
        if ((i10 & 8) != 0) {
            z10 = playerPreferencesState.preferencesHasChanged;
        }
        if ((i10 & 16) != 0) {
            z11 = playerPreferencesState.showFontsDialog;
        }
        if ((i10 & 32) != 0) {
            bluetoothButton = playerPreferencesState.showActionSelectorFor;
        }
        if ((i10 & 64) != 0) {
            inAppSkipDirection = playerPreferencesState.showInAppSkipDurationSelectorFor;
        }
        BluetoothButton bluetoothButton2 = bluetoothButton;
        InAppSkipDirection inAppSkipDirection2 = inAppSkipDirection;
        boolean z12 = z11;
        boolean z13 = z6;
        return playerPreferencesState.copy(playerConfig, playerPreferences, z13, z10, z12, bluetoothButton2, inAppSkipDirection2);
    }

    /* renamed from: component1, reason: from getter */
    public final UserConfig.PlayerConfig getPlayerConfig() {
        return this.playerConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final PlayerPreferences getPlayerPreferences() {
        return this.playerPreferences;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getConfigHasChanged() {
        return this.configHasChanged;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPreferencesHasChanged() {
        return this.preferencesHasChanged;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowFontsDialog() {
        return this.showFontsDialog;
    }

    /* renamed from: component6, reason: from getter */
    public final BluetoothButton getShowActionSelectorFor() {
        return this.showActionSelectorFor;
    }

    /* renamed from: component7, reason: from getter */
    public final InAppSkipDirection getShowInAppSkipDurationSelectorFor() {
        return this.showInAppSkipDurationSelectorFor;
    }

    public final PlayerPreferencesState copy(UserConfig.PlayerConfig playerConfig, PlayerPreferences playerPreferences, boolean configHasChanged, boolean preferencesHasChanged, boolean showFontsDialog, BluetoothButton showActionSelectorFor, InAppSkipDirection showInAppSkipDurationSelectorFor) {
        return new PlayerPreferencesState(playerConfig, playerPreferences, configHasChanged, preferencesHasChanged, showFontsDialog, showActionSelectorFor, showInAppSkipDurationSelectorFor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerPreferencesState)) {
            return false;
        }
        PlayerPreferencesState playerPreferencesState = (PlayerPreferencesState) other;
        if (kotlin.jvm.internal.m.c(this.playerConfig, playerPreferencesState.playerConfig) && kotlin.jvm.internal.m.c(this.playerPreferences, playerPreferencesState.playerPreferences) && this.configHasChanged == playerPreferencesState.configHasChanged && this.preferencesHasChanged == playerPreferencesState.preferencesHasChanged && this.showFontsDialog == playerPreferencesState.showFontsDialog && this.showActionSelectorFor == playerPreferencesState.showActionSelectorFor && this.showInAppSkipDurationSelectorFor == playerPreferencesState.showInAppSkipDurationSelectorFor) {
            return true;
        }
        return false;
    }

    public final boolean getConfigHasChanged() {
        return this.configHasChanged;
    }

    public final UserConfig.PlayerConfig getPlayerConfig() {
        return this.playerConfig;
    }

    public final PlayerPreferences getPlayerPreferences() {
        return this.playerPreferences;
    }

    public final boolean getPreferencesHasChanged() {
        return this.preferencesHasChanged;
    }

    public final BluetoothButton getShowActionSelectorFor() {
        return this.showActionSelectorFor;
    }

    public final boolean getShowFontsDialog() {
        return this.showFontsDialog;
    }

    public final InAppSkipDirection getShowInAppSkipDurationSelectorFor() {
        return this.showInAppSkipDurationSelectorFor;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        UserConfig.PlayerConfig playerConfig = this.playerConfig;
        int i10 = 0;
        if (playerConfig == null) {
            hashCode = 0;
        } else {
            hashCode = playerConfig.hashCode();
        }
        int i11 = hashCode * 31;
        PlayerPreferences playerPreferences = this.playerPreferences;
        if (playerPreferences == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = playerPreferences.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i11 + hashCode2) * 31, 31, this.configHasChanged), 31, this.preferencesHasChanged), 31, this.showFontsDialog);
        BluetoothButton bluetoothButton = this.showActionSelectorFor;
        if (bluetoothButton == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bluetoothButton.hashCode();
        }
        int i12 = (f10 + hashCode3) * 31;
        InAppSkipDirection inAppSkipDirection = this.showInAppSkipDurationSelectorFor;
        if (inAppSkipDirection != null) {
            i10 = inAppSkipDirection.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        UserConfig.PlayerConfig playerConfig = this.playerConfig;
        PlayerPreferences playerPreferences = this.playerPreferences;
        boolean z6 = this.configHasChanged;
        boolean z10 = this.preferencesHasChanged;
        boolean z11 = this.showFontsDialog;
        BluetoothButton bluetoothButton = this.showActionSelectorFor;
        InAppSkipDirection inAppSkipDirection = this.showInAppSkipDurationSelectorFor;
        StringBuilder sb = new StringBuilder("PlayerPreferencesState(playerConfig=");
        sb.append(playerConfig);
        sb.append(", playerPreferences=");
        sb.append(playerPreferences);
        sb.append(", configHasChanged=");
        ib.i.t(sb, z6, ", preferencesHasChanged=", z10, ", showFontsDialog=");
        sb.append(z11);
        sb.append(", showActionSelectorFor=");
        sb.append(bluetoothButton);
        sb.append(", showInAppSkipDurationSelectorFor=");
        sb.append(inAppSkipDirection);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public PlayerPreferencesState(UserConfig.PlayerConfig playerConfig, PlayerPreferences playerPreferences, boolean z6, boolean z10, boolean z11, BluetoothButton bluetoothButton, InAppSkipDirection inAppSkipDirection) {
        this.playerConfig = playerConfig;
        this.playerPreferences = playerPreferences;
        this.configHasChanged = z6;
        this.preferencesHasChanged = z10;
        this.showFontsDialog = z11;
        this.showActionSelectorFor = bluetoothButton;
        this.showInAppSkipDurationSelectorFor = inAppSkipDirection;
    }

    public PlayerPreferencesState() {
        this(null, null, false, false, false, null, null, 127, null);
    }
}
