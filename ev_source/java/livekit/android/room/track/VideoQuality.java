package io.livekit.android.room.track;

import as.p9;
import com.google.protobuf.c6;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/room/track/VideoQuality;", "", "<init>", "(Ljava/lang/String;I)V", "Las/p9;", "toProto", "()Las/p9;", "Companion", "LOW", "MEDIUM", "HIGH", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VideoQuality {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ VideoQuality[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final VideoQuality LOW = new VideoQuality("LOW", 0);
    public static final VideoQuality MEDIUM = new VideoQuality("MEDIUM", 1);
    public static final VideoQuality HIGH = new VideoQuality("HIGH", 2);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoQuality.values().length];
            try {
                iArr[VideoQuality.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoQuality.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoQuality.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ VideoQuality[] $values() {
        return new VideoQuality[]{LOW, MEDIUM, HIGH};
    }

    static {
        VideoQuality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
        INSTANCE = new Companion(null);
    }

    private VideoQuality(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static VideoQuality valueOf(String str) {
        return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
    }

    public static VideoQuality[] values() {
        return (VideoQuality[]) $VALUES.clone();
    }

    public final p9 toProto() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return p9.HIGH;
                }
                c6.p();
                return null;
            }
            return p9.MEDIUM;
        }
        return p9.LOW;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/room/track/VideoQuality$Companion;", "", "<init>", "()V", "Las/p9;", "quality", "Lio/livekit/android/room/track/VideoQuality;", "fromProto", "(Las/p9;)Lio/livekit/android/room/track/VideoQuality;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[p9.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final VideoQuality fromProto(p9 quality) {
            quality.getClass();
            int ordinal = quality.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3 || ordinal == 4) {
                            return null;
                        }
                        c6.p();
                        return null;
                    }
                    return VideoQuality.HIGH;
                }
                return VideoQuality.MEDIUM;
            }
            return VideoQuality.LOW;
        }

        private Companion() {
        }
    }
}
