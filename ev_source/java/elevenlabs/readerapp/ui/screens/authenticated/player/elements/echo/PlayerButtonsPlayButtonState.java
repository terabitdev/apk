package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/PlayerButtonsPlayButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "RequiresRestart", "Playing", "Paused", "Loading", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerButtonsPlayButtonState {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ PlayerButtonsPlayButtonState[] $VALUES;
    public static final PlayerButtonsPlayButtonState RequiresRestart = new PlayerButtonsPlayButtonState("RequiresRestart", 0);
    public static final PlayerButtonsPlayButtonState Playing = new PlayerButtonsPlayButtonState("Playing", 1);
    public static final PlayerButtonsPlayButtonState Paused = new PlayerButtonsPlayButtonState("Paused", 2);
    public static final PlayerButtonsPlayButtonState Loading = new PlayerButtonsPlayButtonState("Loading", 3);

    private static final /* synthetic */ PlayerButtonsPlayButtonState[] $values() {
        return new PlayerButtonsPlayButtonState[]{RequiresRestart, Playing, Paused, Loading};
    }

    static {
        PlayerButtonsPlayButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private PlayerButtonsPlayButtonState(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static PlayerButtonsPlayButtonState valueOf(String str) {
        return (PlayerButtonsPlayButtonState) Enum.valueOf(PlayerButtonsPlayButtonState.class, str);
    }

    public static PlayerButtonsPlayButtonState[] values() {
        return (PlayerButtonsPlayButtonState[]) $VALUES.clone();
    }
}
