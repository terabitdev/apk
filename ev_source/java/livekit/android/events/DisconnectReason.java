package io.livekit.android.events;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lio/livekit/android/events/DisconnectReason;", "", "(Ljava/lang/String;I)V", "UNKNOWN_REASON", "CLIENT_INITIATED", "DUPLICATE_IDENTITY", "SERVER_SHUTDOWN", "PARTICIPANT_REMOVED", "ROOM_DELETED", "STATE_MISMATCH", "JOIN_FAILURE", "MIGRATION", "SIGNAL_CLOSE", "ROOM_CLOSED", "USER_UNAVAILABLE", "USER_REJECTED", "SIP_TRUNK_FAILURE", "CONNECTION_TIMEOUT", "MEDIA_FAILURE", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DisconnectReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DisconnectReason[] $VALUES;
    public static final DisconnectReason UNKNOWN_REASON = new DisconnectReason("UNKNOWN_REASON", 0);
    public static final DisconnectReason CLIENT_INITIATED = new DisconnectReason("CLIENT_INITIATED", 1);
    public static final DisconnectReason DUPLICATE_IDENTITY = new DisconnectReason("DUPLICATE_IDENTITY", 2);
    public static final DisconnectReason SERVER_SHUTDOWN = new DisconnectReason("SERVER_SHUTDOWN", 3);
    public static final DisconnectReason PARTICIPANT_REMOVED = new DisconnectReason("PARTICIPANT_REMOVED", 4);
    public static final DisconnectReason ROOM_DELETED = new DisconnectReason("ROOM_DELETED", 5);
    public static final DisconnectReason STATE_MISMATCH = new DisconnectReason("STATE_MISMATCH", 6);
    public static final DisconnectReason JOIN_FAILURE = new DisconnectReason("JOIN_FAILURE", 7);
    public static final DisconnectReason MIGRATION = new DisconnectReason("MIGRATION", 8);
    public static final DisconnectReason SIGNAL_CLOSE = new DisconnectReason("SIGNAL_CLOSE", 9);
    public static final DisconnectReason ROOM_CLOSED = new DisconnectReason("ROOM_CLOSED", 10);
    public static final DisconnectReason USER_UNAVAILABLE = new DisconnectReason("USER_UNAVAILABLE", 11);
    public static final DisconnectReason USER_REJECTED = new DisconnectReason("USER_REJECTED", 12);
    public static final DisconnectReason SIP_TRUNK_FAILURE = new DisconnectReason("SIP_TRUNK_FAILURE", 13);
    public static final DisconnectReason CONNECTION_TIMEOUT = new DisconnectReason("CONNECTION_TIMEOUT", 14);
    public static final DisconnectReason MEDIA_FAILURE = new DisconnectReason("MEDIA_FAILURE", 15);

    private static final /* synthetic */ DisconnectReason[] $values() {
        return new DisconnectReason[]{UNKNOWN_REASON, CLIENT_INITIATED, DUPLICATE_IDENTITY, SERVER_SHUTDOWN, PARTICIPANT_REMOVED, ROOM_DELETED, STATE_MISMATCH, JOIN_FAILURE, MIGRATION, SIGNAL_CLOSE, ROOM_CLOSED, USER_UNAVAILABLE, USER_REJECTED, SIP_TRUNK_FAILURE, CONNECTION_TIMEOUT, MEDIA_FAILURE};
    }

    static {
        DisconnectReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private DisconnectReason(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DisconnectReason valueOf(String str) {
        return (DisconnectReason) Enum.valueOf(DisconnectReason.class, str);
    }

    public static DisconnectReason[] values() {
        return (DisconnectReason[]) $VALUES.clone();
    }
}
