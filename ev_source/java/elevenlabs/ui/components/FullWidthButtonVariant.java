package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/ui/components/FullWidthButtonVariant;", "", "<init>", "(Ljava/lang/String;I)V", "Primary", "Secondary", "Tertiary", "Border", "Destructive", "Subscriptions", "Text", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FullWidthButtonVariant {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ FullWidthButtonVariant[] $VALUES;
    public static final FullWidthButtonVariant Primary = new FullWidthButtonVariant("Primary", 0);
    public static final FullWidthButtonVariant Secondary = new FullWidthButtonVariant("Secondary", 1);
    public static final FullWidthButtonVariant Tertiary = new FullWidthButtonVariant("Tertiary", 2);
    public static final FullWidthButtonVariant Border = new FullWidthButtonVariant("Border", 3);
    public static final FullWidthButtonVariant Destructive = new FullWidthButtonVariant("Destructive", 4);
    public static final FullWidthButtonVariant Subscriptions = new FullWidthButtonVariant("Subscriptions", 5);
    public static final FullWidthButtonVariant Text = new FullWidthButtonVariant("Text", 6);

    private static final /* synthetic */ FullWidthButtonVariant[] $values() {
        return new FullWidthButtonVariant[]{Primary, Secondary, Tertiary, Border, Destructive, Subscriptions, Text};
    }

    static {
        FullWidthButtonVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rd.c1.q($values);
    }

    private FullWidthButtonVariant(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static FullWidthButtonVariant valueOf(String str) {
        return (FullWidthButtonVariant) Enum.valueOf(FullWidthButtonVariant.class, str);
    }

    public static FullWidthButtonVariant[] values() {
        return (FullWidthButtonVariant[]) $VALUES.clone();
    }
}
