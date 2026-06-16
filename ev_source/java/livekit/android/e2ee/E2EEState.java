package io.livekit.android.e2ee;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/livekit/android/e2ee/E2EEState;", "", "(Ljava/lang/String;I)V", "NEW", "OK", "KEY_RATCHETED", "MISSING_KEY", "ENCRYPTION_FAILED", "DECRYPTION_FAILED", "INTERNAL_ERROR", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class E2EEState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ E2EEState[] $VALUES;
    public static final E2EEState NEW = new E2EEState("NEW", 0);
    public static final E2EEState OK = new E2EEState("OK", 1);
    public static final E2EEState KEY_RATCHETED = new E2EEState("KEY_RATCHETED", 2);
    public static final E2EEState MISSING_KEY = new E2EEState("MISSING_KEY", 3);
    public static final E2EEState ENCRYPTION_FAILED = new E2EEState("ENCRYPTION_FAILED", 4);
    public static final E2EEState DECRYPTION_FAILED = new E2EEState("DECRYPTION_FAILED", 5);
    public static final E2EEState INTERNAL_ERROR = new E2EEState("INTERNAL_ERROR", 6);

    private static final /* synthetic */ E2EEState[] $values() {
        return new E2EEState[]{NEW, OK, KEY_RATCHETED, MISSING_KEY, ENCRYPTION_FAILED, DECRYPTION_FAILED, INTERNAL_ERROR};
    }

    static {
        E2EEState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private E2EEState(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static E2EEState valueOf(String str) {
        return (E2EEState) Enum.valueOf(E2EEState.class, str);
    }

    public static E2EEState[] values() {
        return (E2EEState[]) $VALUES.clone();
    }
}
