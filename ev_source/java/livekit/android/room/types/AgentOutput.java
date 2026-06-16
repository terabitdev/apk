package io.livekit.android.room.types;

import com.google.protobuf.c6;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lio/livekit/android/room/types/AgentOutput;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Audio", "Transcription", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentOutput {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AgentOutput[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final AgentOutput Audio = new AgentOutput("Audio", 0, "audio");
    public static final AgentOutput Transcription = new AgentOutput("Transcription", 1, "transcription");

    private static final /* synthetic */ AgentOutput[] $values() {
        return new AgentOutput[]{Audio, Transcription};
    }

    static {
        AgentOutput[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
        INSTANCE = new Companion(null);
    }

    private AgentOutput(String str, int i10, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AgentOutput valueOf(String str) {
        return (AgentOutput) Enum.valueOf(AgentOutput.class, str);
    }

    public static AgentOutput[] values() {
        return (AgentOutput[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/types/AgentOutput$Companion;", "", "()V", "fromValue", "Lio/livekit/android/room/types/AgentOutput;", "value", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AgentOutput fromValue(String value) {
            value.getClass();
            if (value.equals("audio")) {
                return AgentOutput.Audio;
            }
            if (value.equals("transcription")) {
                return AgentOutput.Transcription;
            }
            c6.y();
            return null;
        }

        private Companion() {
        }
    }
}
