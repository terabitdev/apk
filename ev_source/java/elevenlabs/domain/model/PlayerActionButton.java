package io.elevenlabs.domain.model;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/domain/model/PlayerActionButton;", "", "<init>", "(Ljava/lang/String;I)V", "SLEEP_TIMER", "VOICE_PICKER", "BOOKMARK", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerActionButton {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlayerActionButton[] $VALUES;
    public static final PlayerActionButton SLEEP_TIMER = new PlayerActionButton("SLEEP_TIMER", 0);
    public static final PlayerActionButton VOICE_PICKER = new PlayerActionButton("VOICE_PICKER", 1);
    public static final PlayerActionButton BOOKMARK = new PlayerActionButton("BOOKMARK", 2);

    private static final /* synthetic */ PlayerActionButton[] $values() {
        return new PlayerActionButton[]{SLEEP_TIMER, VOICE_PICKER, BOOKMARK};
    }

    static {
        PlayerActionButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private PlayerActionButton(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PlayerActionButton valueOf(String str) {
        return (PlayerActionButton) Enum.valueOf(PlayerActionButton.class, str);
    }

    public static PlayerActionButton[] values() {
        return (PlayerActionButton[]) $VALUES.clone();
    }
}
