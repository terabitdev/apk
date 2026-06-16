package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/ui/components/ButtonVariant;", "", "<init>", "(Ljava/lang/String;I)V", "Primary", "Secondary", "Tertiary", "Quaternary", "Fifthernary", "DangerLight", "DangerConfirm", "Dark", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ButtonVariant {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ ButtonVariant[] $VALUES;
    public static final ButtonVariant Primary = new ButtonVariant("Primary", 0);
    public static final ButtonVariant Secondary = new ButtonVariant("Secondary", 1);
    public static final ButtonVariant Tertiary = new ButtonVariant("Tertiary", 2);
    public static final ButtonVariant Quaternary = new ButtonVariant("Quaternary", 3);
    public static final ButtonVariant Fifthernary = new ButtonVariant("Fifthernary", 4);
    public static final ButtonVariant DangerLight = new ButtonVariant("DangerLight", 5);
    public static final ButtonVariant DangerConfirm = new ButtonVariant("DangerConfirm", 6);
    public static final ButtonVariant Dark = new ButtonVariant("Dark", 7);

    private static final /* synthetic */ ButtonVariant[] $values() {
        return new ButtonVariant[]{Primary, Secondary, Tertiary, Quaternary, Fifthernary, DangerLight, DangerConfirm, Dark};
    }

    static {
        ButtonVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rd.c1.q($values);
    }

    private ButtonVariant(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static ButtonVariant valueOf(String str) {
        return (ButtonVariant) Enum.valueOf(ButtonVariant.class, str);
    }

    public static ButtonVariant[] values() {
        return (ButtonVariant[]) $VALUES.clone();
    }
}
