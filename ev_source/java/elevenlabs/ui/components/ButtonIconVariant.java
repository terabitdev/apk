package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/ui/components/ButtonIconVariant;", "", "<init>", "(Ljava/lang/String;I)V", "Primary", "Secondary", "Tertiary", "Quaternary", "Square", "Menu", "Transparent", "TransparentInverted", "ShareDetails", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ButtonIconVariant {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ ButtonIconVariant[] $VALUES;
    public static final ButtonIconVariant Primary = new ButtonIconVariant("Primary", 0);
    public static final ButtonIconVariant Secondary = new ButtonIconVariant("Secondary", 1);
    public static final ButtonIconVariant Tertiary = new ButtonIconVariant("Tertiary", 2);
    public static final ButtonIconVariant Quaternary = new ButtonIconVariant("Quaternary", 3);
    public static final ButtonIconVariant Square = new ButtonIconVariant("Square", 4);
    public static final ButtonIconVariant Menu = new ButtonIconVariant("Menu", 5);
    public static final ButtonIconVariant Transparent = new ButtonIconVariant("Transparent", 6);
    public static final ButtonIconVariant TransparentInverted = new ButtonIconVariant("TransparentInverted", 7);
    public static final ButtonIconVariant ShareDetails = new ButtonIconVariant("ShareDetails", 8);

    private static final /* synthetic */ ButtonIconVariant[] $values() {
        return new ButtonIconVariant[]{Primary, Secondary, Tertiary, Quaternary, Square, Menu, Transparent, TransparentInverted, ShareDetails};
    }

    static {
        ButtonIconVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rd.c1.q($values);
    }

    private ButtonIconVariant(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static ButtonIconVariant valueOf(String str) {
        return (ButtonIconVariant) Enum.valueOf(ButtonIconVariant.class, str);
    }

    public static ButtonIconVariant[] values() {
        return (ButtonIconVariant[]) $VALUES.clone();
    }
}
