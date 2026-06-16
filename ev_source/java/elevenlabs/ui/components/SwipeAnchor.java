package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/ui/components/SwipeAnchor;", "", "<init>", "(Ljava/lang/String;I)V", "StartFullyOpen", "StartPeeking", "SettledAtCenter", "EndPeeking", "EndFullyOpen", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SwipeAnchor {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ SwipeAnchor[] $VALUES;
    public static final SwipeAnchor StartFullyOpen = new SwipeAnchor("StartFullyOpen", 0);
    public static final SwipeAnchor StartPeeking = new SwipeAnchor("StartPeeking", 1);
    public static final SwipeAnchor SettledAtCenter = new SwipeAnchor("SettledAtCenter", 2);
    public static final SwipeAnchor EndPeeking = new SwipeAnchor("EndPeeking", 3);
    public static final SwipeAnchor EndFullyOpen = new SwipeAnchor("EndFullyOpen", 4);

    private static final /* synthetic */ SwipeAnchor[] $values() {
        return new SwipeAnchor[]{StartFullyOpen, StartPeeking, SettledAtCenter, EndPeeking, EndFullyOpen};
    }

    static {
        SwipeAnchor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rd.c1.q($values);
    }

    private SwipeAnchor(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static SwipeAnchor valueOf(String str) {
        return (SwipeAnchor) Enum.valueOf(SwipeAnchor.class, str);
    }

    public static SwipeAnchor[] values() {
        return (SwipeAnchor[]) $VALUES.clone();
    }
}
