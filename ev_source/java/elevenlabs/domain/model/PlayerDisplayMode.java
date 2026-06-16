package io.elevenlabs.domain.model;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/domain/model/PlayerDisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "Text", "Audio", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerDisplayMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlayerDisplayMode[] $VALUES;
    public static final PlayerDisplayMode Text = new PlayerDisplayMode("Text", 0);
    public static final PlayerDisplayMode Audio = new PlayerDisplayMode("Audio", 1);

    private static final /* synthetic */ PlayerDisplayMode[] $values() {
        return new PlayerDisplayMode[]{Text, Audio};
    }

    static {
        PlayerDisplayMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private PlayerDisplayMode(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PlayerDisplayMode valueOf(String str) {
        return (PlayerDisplayMode) Enum.valueOf(PlayerDisplayMode.class, str);
    }

    public static PlayerDisplayMode[] values() {
        return (PlayerDisplayMode[]) $VALUES.clone();
    }
}
