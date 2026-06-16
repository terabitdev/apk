package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015JB\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010\u0015R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b\n\u0010\u0015¨\u0006&"}, d2 = {"Lio/elevenlabs/ui/components/ActionConfig;", "", "", ParameterNames.ICON, "", ParameterNames.TEXT, "Lp3/x;", "color", "", "isDestructive", "isMenuDestructive", "<init>", "(ILjava/lang/String;JZZLkotlin/jvm/internal/f;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3-0d7_KjU", "()J", "component3", "component4", "()Z", "component5", "copy-XO-JAsU", "(ILjava/lang/String;JZZ)Lio/elevenlabs/ui/components/ActionConfig;", "copy", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", TokenNames.I, "getIcon", "Ljava/lang/String;", "getText", "J", "getColor-0d7_KjU", "Z", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ActionConfig {
    public static final int $stable = 0;
    private final long color;
    private final int icon;
    private final boolean isDestructive;
    private final boolean isMenuDestructive;
    private final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ActionConfig(int i10, String str, long j4, boolean z6, boolean z10, int i11, kotlin.jvm.internal.f fVar) {
        this(i10, str, j4, r7, r8, null);
        boolean z11;
        boolean z12;
        if ((i11 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z6;
        }
        if ((i11 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
    }

    /* renamed from: copy-XO-JAsU$default, reason: not valid java name */
    public static /* synthetic */ ActionConfig m1769copyXOJAsU$default(ActionConfig actionConfig, int i10, String str, long j4, boolean z6, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = actionConfig.icon;
        }
        if ((i11 & 2) != 0) {
            str = actionConfig.text;
        }
        if ((i11 & 4) != 0) {
            j4 = actionConfig.color;
        }
        if ((i11 & 8) != 0) {
            z6 = actionConfig.isDestructive;
        }
        if ((i11 & 16) != 0) {
            z10 = actionConfig.isMenuDestructive;
        }
        long j10 = j4;
        return actionConfig.m1771copyXOJAsU(i10, str, j10, z6, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDestructive() {
        return this.isDestructive;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsMenuDestructive() {
        return this.isMenuDestructive;
    }

    /* renamed from: copy-XO-JAsU, reason: not valid java name */
    public final ActionConfig m1771copyXOJAsU(int icon, String text, long color, boolean isDestructive, boolean isMenuDestructive) {
        text.getClass();
        return new ActionConfig(icon, text, color, isDestructive, isMenuDestructive, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionConfig)) {
            return false;
        }
        ActionConfig actionConfig = (ActionConfig) other;
        if (this.icon == actionConfig.icon && kotlin.jvm.internal.m.c(this.text, actionConfig.text) && p3.x.c(this.color, actionConfig.color) && this.isDestructive == actionConfig.isDestructive && this.isMenuDestructive == actionConfig.isMenuDestructive) {
            return true;
        }
        return false;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m1772getColor0d7_KjU() {
        return this.color;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int c5 = j0.c.c(Integer.hashCode(this.icon) * 31, 31, this.text);
        long j4 = this.color;
        int i10 = p3.x.f26439n;
        return Boolean.hashCode(this.isMenuDestructive) + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.g(j4, c5, 31), 31, this.isDestructive);
    }

    public final boolean isDestructive() {
        return this.isDestructive;
    }

    public final boolean isMenuDestructive() {
        return this.isMenuDestructive;
    }

    public String toString() {
        int i10 = this.icon;
        String str = this.text;
        String i11 = p3.x.i(this.color);
        boolean z6 = this.isDestructive;
        boolean z10 = this.isMenuDestructive;
        StringBuilder sb = new StringBuilder("ActionConfig(icon=");
        sb.append(i10);
        sb.append(", text=");
        sb.append(str);
        sb.append(", color=");
        defpackage.f.y(sb, i11, ", isDestructive=", z6, ", isMenuDestructive=");
        return p.n.j(Separators.RPAREN, sb, z10);
    }

    private ActionConfig(int i10, String str, long j4, boolean z6, boolean z10) {
        str.getClass();
        this.icon = i10;
        this.text = str;
        this.color = j4;
        this.isDestructive = z6;
        this.isMenuDestructive = z10;
    }

    public /* synthetic */ ActionConfig(int i10, String str, long j4, boolean z6, boolean z10, kotlin.jvm.internal.f fVar) {
        this(i10, str, j4, z6, z10);
    }
}
