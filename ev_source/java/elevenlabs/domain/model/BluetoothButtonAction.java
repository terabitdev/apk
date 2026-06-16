package io.elevenlabs.domain.model;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/domain/model/BluetoothButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP_FORWARD_15", "SKIP_FORWARD_30", "SKIP_FORWARD_60", "SKIP_BACKWARD_15", "SKIP_BACKWARD_30", "SKIP_BACKWARD_60", "NEXT_CHAPTER", "PREVIOUS_CHAPTER", "VOICE_CHAT", "BOOKMARK", "PLAY_PAUSE", "NOTHING", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BluetoothButtonAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BluetoothButtonAction[] $VALUES;
    public static final BluetoothButtonAction SKIP_FORWARD_15 = new BluetoothButtonAction("SKIP_FORWARD_15", 0);
    public static final BluetoothButtonAction SKIP_FORWARD_30 = new BluetoothButtonAction("SKIP_FORWARD_30", 1);
    public static final BluetoothButtonAction SKIP_FORWARD_60 = new BluetoothButtonAction("SKIP_FORWARD_60", 2);
    public static final BluetoothButtonAction SKIP_BACKWARD_15 = new BluetoothButtonAction("SKIP_BACKWARD_15", 3);
    public static final BluetoothButtonAction SKIP_BACKWARD_30 = new BluetoothButtonAction("SKIP_BACKWARD_30", 4);
    public static final BluetoothButtonAction SKIP_BACKWARD_60 = new BluetoothButtonAction("SKIP_BACKWARD_60", 5);
    public static final BluetoothButtonAction NEXT_CHAPTER = new BluetoothButtonAction("NEXT_CHAPTER", 6);
    public static final BluetoothButtonAction PREVIOUS_CHAPTER = new BluetoothButtonAction("PREVIOUS_CHAPTER", 7);
    public static final BluetoothButtonAction VOICE_CHAT = new BluetoothButtonAction("VOICE_CHAT", 8);
    public static final BluetoothButtonAction BOOKMARK = new BluetoothButtonAction("BOOKMARK", 9);
    public static final BluetoothButtonAction PLAY_PAUSE = new BluetoothButtonAction("PLAY_PAUSE", 10);
    public static final BluetoothButtonAction NOTHING = new BluetoothButtonAction("NOTHING", 11);

    private static final /* synthetic */ BluetoothButtonAction[] $values() {
        return new BluetoothButtonAction[]{SKIP_FORWARD_15, SKIP_FORWARD_30, SKIP_FORWARD_60, SKIP_BACKWARD_15, SKIP_BACKWARD_30, SKIP_BACKWARD_60, NEXT_CHAPTER, PREVIOUS_CHAPTER, VOICE_CHAT, BOOKMARK, PLAY_PAUSE, NOTHING};
    }

    static {
        BluetoothButtonAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private BluetoothButtonAction(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static BluetoothButtonAction valueOf(String str) {
        return (BluetoothButtonAction) Enum.valueOf(BluetoothButtonAction.class, str);
    }

    public static BluetoothButtonAction[] values() {
        return (BluetoothButtonAction[]) $VALUES.clone();
    }
}
