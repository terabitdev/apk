package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/ui/components/PillSize;", "", "<init>", "(Ljava/lang/String;I)V", "Large", "Small", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PillSize {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ PillSize[] $VALUES;
    public static final PillSize Large = new PillSize("Large", 0);
    public static final PillSize Small = new PillSize("Small", 1);

    private static final /* synthetic */ PillSize[] $values() {
        return new PillSize[]{Large, Small};
    }

    static {
        PillSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rd.c1.q($values);
    }

    private PillSize(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static PillSize valueOf(String str) {
        return (PillSize) Enum.valueOf(PillSize.class, str);
    }

    public static PillSize[] values() {
        return (PillSize[]) $VALUES.clone();
    }
}
