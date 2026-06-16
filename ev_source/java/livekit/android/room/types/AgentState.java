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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/livekit/android/room/types/AgentState;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Idle", "Initializing", "Listening", "Speaking", "Thinking", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AgentState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AgentState Idle = new AgentState("Idle", 0, "idle");
    public static final AgentState Initializing = new AgentState("Initializing", 1, "initializing");
    public static final AgentState Listening = new AgentState("Listening", 2, "listening");
    public static final AgentState Speaking = new AgentState("Speaking", 3, "speaking");
    public static final AgentState Thinking = new AgentState("Thinking", 4, "thinking");
    private final String value;

    private static final /* synthetic */ AgentState[] $values() {
        return new AgentState[]{Idle, Initializing, Listening, Speaking, Thinking};
    }

    static {
        AgentState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
        INSTANCE = new Companion(null);
    }

    private AgentState(String str, int i10, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AgentState valueOf(String str) {
        return (AgentState) Enum.valueOf(AgentState.class, str);
    }

    public static AgentState[] values() {
        return (AgentState[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/types/AgentState$Companion;", "", "()V", "fromValue", "Lio/livekit/android/room/types/AgentState;", "value", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AgentState fromValue(String value) {
            value.getClass();
            switch (value.hashCode()) {
                case -2134659376:
                    if (value.equals("speaking")) {
                        return AgentState.Speaking;
                    }
                    break;
                case -1218715461:
                    if (value.equals("listening")) {
                        return AgentState.Listening;
                    }
                    break;
                case -400079795:
                    if (value.equals("initializing")) {
                        return AgentState.Initializing;
                    }
                    break;
                case 3227604:
                    if (value.equals("idle")) {
                        return AgentState.Idle;
                    }
                    break;
                case 1224578480:
                    if (value.equals("thinking")) {
                        return AgentState.Thinking;
                    }
                    break;
            }
            c6.y();
            return null;
        }

        private Companion() {
        }
    }
}
