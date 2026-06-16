package io.livekit.android.room.types;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/livekit/android/room/types/AgentInput;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Audio", "Text", "Video", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentInput {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AgentInput[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final AgentInput Audio = new AgentInput("Audio", 0, "audio");
    public static final AgentInput Text = new AgentInput("Text", 1, ParameterNames.TEXT);
    public static final AgentInput Video = new AgentInput("Video", 2, "video");

    private static final /* synthetic */ AgentInput[] $values() {
        return new AgentInput[]{Audio, Text, Video};
    }

    static {
        AgentInput[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
        INSTANCE = new Companion(null);
    }

    private AgentInput(String str, int i10, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AgentInput valueOf(String str) {
        return (AgentInput) Enum.valueOf(AgentInput.class, str);
    }

    public static AgentInput[] values() {
        return (AgentInput[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/types/AgentInput$Companion;", "", "()V", "fromValue", "Lio/livekit/android/room/types/AgentInput;", "value", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AgentInput fromValue(String value) {
            value.getClass();
            int hashCode = value.hashCode();
            if (hashCode != 3556653) {
                if (hashCode != 93166550) {
                    if (hashCode == 112202875 && value.equals("video")) {
                        return AgentInput.Video;
                    }
                } else if (value.equals("audio")) {
                    return AgentInput.Audio;
                }
            } else if (value.equals(ParameterNames.TEXT)) {
                return AgentInput.Text;
            }
            c6.y();
            return null;
        }

        private Companion() {
        }
    }
}
