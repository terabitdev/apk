package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001f¨\u00068"}, d2 = {"Lio/elevenlabs/ui/components/ButtonSpecs;", "", "Lp3/x;", "backgroundColor", "foregroundColor", "borderColor", "Lp3/b1;", "shape", "Ls4/y0;", "textStyle", "Lh5/f;", "iconSpacing", "", "uppercaseText", "<init>", "(JJJLp3/b1;Ls4/y0;FZLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4", "()Lp3/b1;", "component5", "()Ls4/y0;", "component6-D9Ej5fM", "()F", "component6", "component7", "()Z", "copy-uahJyVk", "(JJJLp3/b1;Ls4/y0;FZ)Lio/elevenlabs/ui/components/ButtonSpecs;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getBackgroundColor-0d7_KjU", "getForegroundColor-0d7_KjU", "getBorderColor-0d7_KjU", "Lp3/b1;", "getShape", "Ls4/y0;", "getTextStyle", TokenNames.F, "getIconSpacing-D9Ej5fM", "Z", "getUppercaseText", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ButtonSpecs {
    private final long backgroundColor;
    private final long borderColor;
    private final long foregroundColor;
    private final float iconSpacing;
    private final p3.b1 shape;
    private final s4.y0 textStyle;
    private final boolean uppercaseText;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ButtonSpecs(long j4, long j10, long j11, p3.b1 b1Var, s4.y0 y0Var, float f10, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
        this(j4, j10, j11, b1Var, y0Var, f10, r11, null);
        boolean z10;
        if ((i10 & 64) != 0) {
            z10 = false;
        } else {
            z10 = z6;
        }
    }

    /* renamed from: copy-uahJyVk$default, reason: not valid java name */
    public static /* synthetic */ ButtonSpecs m1782copyuahJyVk$default(ButtonSpecs buttonSpecs, long j4, long j10, long j11, p3.b1 b1Var, s4.y0 y0Var, float f10, boolean z6, int i10, Object obj) {
        long j12;
        p3.b1 b1Var2;
        s4.y0 y0Var2;
        float f11;
        boolean z10;
        if ((i10 & 1) != 0) {
            j4 = buttonSpecs.backgroundColor;
        }
        long j13 = j4;
        if ((i10 & 2) != 0) {
            j10 = buttonSpecs.foregroundColor;
        }
        long j14 = j10;
        if ((i10 & 4) != 0) {
            j12 = buttonSpecs.borderColor;
        } else {
            j12 = j11;
        }
        if ((i10 & 8) != 0) {
            b1Var2 = buttonSpecs.shape;
        } else {
            b1Var2 = b1Var;
        }
        if ((i10 & 16) != 0) {
            y0Var2 = buttonSpecs.textStyle;
        } else {
            y0Var2 = y0Var;
        }
        if ((i10 & 32) != 0) {
            f11 = buttonSpecs.iconSpacing;
        } else {
            f11 = f10;
        }
        if ((i10 & 64) != 0) {
            z10 = buttonSpecs.uppercaseText;
        } else {
            z10 = z6;
        }
        return buttonSpecs.m1787copyuahJyVk(j13, j14, j12, b1Var2, y0Var2, f11, z10);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component4, reason: from getter */
    public final p3.b1 getShape() {
        return this.shape;
    }

    /* renamed from: component5, reason: from getter */
    public final s4.y0 getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSpacing() {
        return this.iconSpacing;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getUppercaseText() {
        return this.uppercaseText;
    }

    /* renamed from: copy-uahJyVk, reason: not valid java name */
    public final ButtonSpecs m1787copyuahJyVk(long backgroundColor, long foregroundColor, long borderColor, p3.b1 shape, s4.y0 textStyle, float iconSpacing, boolean uppercaseText) {
        shape.getClass();
        textStyle.getClass();
        return new ButtonSpecs(backgroundColor, foregroundColor, borderColor, shape, textStyle, iconSpacing, uppercaseText, null);
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof ButtonSpecs) {
                ButtonSpecs buttonSpecs = (ButtonSpecs) other;
                if (!p3.x.c(this.backgroundColor, buttonSpecs.backgroundColor) || !p3.x.c(this.foregroundColor, buttonSpecs.foregroundColor) || !p3.x.c(this.borderColor, buttonSpecs.borderColor) || !kotlin.jvm.internal.m.c(this.shape, buttonSpecs.shape) || !kotlin.jvm.internal.m.c(this.textStyle, buttonSpecs.textStyle) || !h5.f.b(this.iconSpacing, buttonSpecs.iconSpacing) || this.uppercaseText != buttonSpecs.uppercaseText) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1788getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1789getBorderColor0d7_KjU() {
        return this.borderColor;
    }

    /* renamed from: getForegroundColor-0d7_KjU, reason: not valid java name */
    public final long m1790getForegroundColor0d7_KjU() {
        return this.foregroundColor;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1791getIconSpacingD9Ej5fM() {
        return this.iconSpacing;
    }

    public final p3.b1 getShape() {
        return this.shape;
    }

    public final s4.y0 getTextStyle() {
        return this.textStyle;
    }

    public final boolean getUppercaseText() {
        return this.uppercaseText;
    }

    public int hashCode() {
        long j4 = this.backgroundColor;
        int i10 = p3.x.f26439n;
        return Boolean.hashCode(this.uppercaseText) + com.google.android.gms.internal.play_billing.b.c(this.iconSpacing, j0.c.d((this.shape.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.borderColor, com.google.android.gms.internal.play_billing.b.g(this.foregroundColor, Long.hashCode(j4) * 31, 31), 31)) * 31, 31, this.textStyle), 31);
    }

    public String toString() {
        String i10 = p3.x.i(this.backgroundColor);
        String i11 = p3.x.i(this.foregroundColor);
        String i12 = p3.x.i(this.borderColor);
        p3.b1 b1Var = this.shape;
        s4.y0 y0Var = this.textStyle;
        String c5 = h5.f.c(this.iconSpacing);
        boolean z6 = this.uppercaseText;
        StringBuilder s10 = defpackage.f.s("ButtonSpecs(backgroundColor=", i10, ", foregroundColor=", i11, ", borderColor=");
        s10.append(i12);
        s10.append(", shape=");
        s10.append(b1Var);
        s10.append(", textStyle=");
        s10.append(y0Var);
        s10.append(", iconSpacing=");
        s10.append(c5);
        s10.append(", uppercaseText=");
        return p.n.j(Separators.RPAREN, s10, z6);
    }

    private ButtonSpecs(long j4, long j10, long j11, p3.b1 b1Var, s4.y0 y0Var, float f10, boolean z6) {
        b1Var.getClass();
        y0Var.getClass();
        this.backgroundColor = j4;
        this.foregroundColor = j10;
        this.borderColor = j11;
        this.shape = b1Var;
        this.textStyle = y0Var;
        this.iconSpacing = f10;
        this.uppercaseText = z6;
    }

    public /* synthetic */ ButtonSpecs(long j4, long j10, long j11, p3.b1 b1Var, s4.y0 y0Var, float f10, boolean z6, kotlin.jvm.internal.f fVar) {
        this(j4, j10, j11, b1Var, y0Var, f10, z6);
    }
}
