package io.elevenlabs.domain.model;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/domain/model/PlayerConnectionState;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "IDLE", "BUFFERING", "READY", "ENDED", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerConnectionState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlayerConnectionState[] $VALUES;
    public static final PlayerConnectionState UNKNOWN = new PlayerConnectionState("UNKNOWN", 0);
    public static final PlayerConnectionState IDLE = new PlayerConnectionState("IDLE", 1);
    public static final PlayerConnectionState BUFFERING = new PlayerConnectionState("BUFFERING", 2);
    public static final PlayerConnectionState READY = new PlayerConnectionState("READY", 3);
    public static final PlayerConnectionState ENDED = new PlayerConnectionState("ENDED", 4);

    private static final /* synthetic */ PlayerConnectionState[] $values() {
        return new PlayerConnectionState[]{UNKNOWN, IDLE, BUFFERING, READY, ENDED};
    }

    static {
        PlayerConnectionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private PlayerConnectionState(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PlayerConnectionState valueOf(String str) {
        return (PlayerConnectionState) Enum.valueOf(PlayerConnectionState.class, str);
    }

    public static PlayerConnectionState[] values() {
        return (PlayerConnectionState[]) $VALUES.clone();
    }
}
