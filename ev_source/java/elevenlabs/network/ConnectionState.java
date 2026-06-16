package io.elevenlabs.network;

import io.elevenlabs.models.Status;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/network/ConnectionState;", "Lio/elevenlabs/models/Status;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "CONNECTING", "CONNECTED", "RECONNECTING", "DISCONNECTED", "ERROR", "isActive", "", "()Z", "isTransitioning", "hasError", "getHasError", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConnectionState implements Status {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConnectionState[] $VALUES;
    public static final ConnectionState IDLE = new ConnectionState("IDLE", 0);
    public static final ConnectionState CONNECTING = new ConnectionState("CONNECTING", 1);
    public static final ConnectionState CONNECTED = new ConnectionState("CONNECTED", 2);
    public static final ConnectionState RECONNECTING = new ConnectionState("RECONNECTING", 3);
    public static final ConnectionState DISCONNECTED = new ConnectionState("DISCONNECTED", 4);
    public static final ConnectionState ERROR = new ConnectionState("ERROR", 5);

    private static final /* synthetic */ ConnectionState[] $values() {
        return new ConnectionState[]{IDLE, CONNECTING, CONNECTED, RECONNECTING, DISCONNECTED, ERROR};
    }

    static {
        ConnectionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private ConnectionState(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ConnectionState valueOf(String str) {
        return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
    }

    public static ConnectionState[] values() {
        return (ConnectionState[]) $VALUES.clone();
    }

    @Override // io.elevenlabs.models.Status
    public boolean getHasError() {
        if (this == ERROR) {
            return true;
        }
        return false;
    }

    @Override // io.elevenlabs.models.Status
    public boolean isActive() {
        if (this == CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // io.elevenlabs.models.Status
    public boolean isTransitioning() {
        if (this != CONNECTING && this != RECONNECTING) {
            return false;
        }
        return true;
    }
}
