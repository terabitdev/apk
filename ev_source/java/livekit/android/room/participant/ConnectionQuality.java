package io.livekit.android.room.participant;

import as.b7;
import com.google.protobuf.c6;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lio/livekit/android/room/participant/ConnectionQuality;", "", "(Ljava/lang/String;I)V", "EXCELLENT", "GOOD", "POOR", "UNKNOWN", "LOST", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ConnectionQuality {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConnectionQuality[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ConnectionQuality EXCELLENT = new ConnectionQuality("EXCELLENT", 0);
    public static final ConnectionQuality GOOD = new ConnectionQuality("GOOD", 1);
    public static final ConnectionQuality POOR = new ConnectionQuality("POOR", 2);
    public static final ConnectionQuality UNKNOWN = new ConnectionQuality("UNKNOWN", 3);
    public static final ConnectionQuality LOST = new ConnectionQuality("LOST", 4);

    private static final /* synthetic */ ConnectionQuality[] $values() {
        return new ConnectionQuality[]{EXCELLENT, GOOD, POOR, UNKNOWN, LOST};
    }

    static {
        ConnectionQuality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
        INSTANCE = new Companion(null);
    }

    private ConnectionQuality(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ConnectionQuality valueOf(String str) {
        return (ConnectionQuality) Enum.valueOf(ConnectionQuality.class, str);
    }

    public static ConnectionQuality[] values() {
        return (ConnectionQuality[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/room/participant/ConnectionQuality$Companion;", "", "<init>", "()V", "Las/b7;", "proto", "Lio/livekit/android/room/participant/ConnectionQuality;", "fromProto", "(Las/b7;)Lio/livekit/android/room/participant/ConnectionQuality;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b7.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[0] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[4] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[3] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ConnectionQuality fromProto(b7 proto) {
            proto.getClass();
            int ordinal = proto.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                return ConnectionQuality.UNKNOWN;
                            }
                            c6.p();
                            return null;
                        }
                        return ConnectionQuality.LOST;
                    }
                    return ConnectionQuality.EXCELLENT;
                }
                return ConnectionQuality.GOOD;
            }
            return ConnectionQuality.POOR;
        }

        private Companion() {
        }
    }
}
