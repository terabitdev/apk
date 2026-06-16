package io.elevenlabs.data.database.entities.reads;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/SyncState;", "", "<init>", "(Ljava/lang/String;I)V", "UPDATED", "PENDING_DELETE", "PENDING_UPDATE_PUSH", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SyncState {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ SyncState[] $VALUES;
    public static final SyncState UPDATED = new SyncState("UPDATED", 0);
    public static final SyncState PENDING_DELETE = new SyncState("PENDING_DELETE", 1);
    public static final SyncState PENDING_UPDATE_PUSH = new SyncState("PENDING_UPDATE_PUSH", 2);

    private static final /* synthetic */ SyncState[] $values() {
        return new SyncState[]{UPDATED, PENDING_DELETE, PENDING_UPDATE_PUSH};
    }

    static {
        SyncState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private SyncState(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static SyncState valueOf(String str) {
        return (SyncState) Enum.valueOf(SyncState.class, str);
    }

    public static SyncState[] values() {
        return (SyncState[]) $VALUES.clone();
    }
}
