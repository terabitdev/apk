package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lio/elevenlabs/ui/components/PillButtonColors;", "", "Lp3/x;", "background", ParameterNames.TEXT, "border", "<init>", "(JJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "copy-ysEtTa8", "(JJJ)Lio/elevenlabs/ui/components/PillButtonColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBackground-0d7_KjU", "getText-0d7_KjU", "getBorder-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PillButtonColors {
    private final long background;
    private final long border;
    private final long text;

    private PillButtonColors(long j4, long j10, long j11) {
        this.background = j4;
        this.text = j10;
        this.border = j11;
    }

    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ PillButtonColors m1843copyysEtTa8$default(PillButtonColors pillButtonColors, long j4, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = pillButtonColors.background;
        }
        long j12 = j4;
        if ((i10 & 2) != 0) {
            j10 = pillButtonColors.text;
        }
        long j13 = j10;
        if ((i10 & 4) != 0) {
            j11 = pillButtonColors.border;
        }
        return pillButtonColors.m1847copyysEtTa8(j12, j13, j11);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getText() {
        return this.text;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorder() {
        return this.border;
    }

    /* renamed from: copy-ysEtTa8, reason: not valid java name */
    public final PillButtonColors m1847copyysEtTa8(long background, long text, long border) {
        return new PillButtonColors(background, text, border, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PillButtonColors)) {
            return false;
        }
        PillButtonColors pillButtonColors = (PillButtonColors) other;
        if (p3.x.c(this.background, pillButtonColors.background) && p3.x.c(this.text, pillButtonColors.text) && p3.x.c(this.border, pillButtonColors.border)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1848getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m1849getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getText-0d7_KjU, reason: not valid java name */
    public final long m1850getText0d7_KjU() {
        return this.text;
    }

    public int hashCode() {
        long j4 = this.background;
        int i10 = p3.x.f26439n;
        return Long.hashCode(this.border) + com.google.android.gms.internal.play_billing.b.g(this.text, Long.hashCode(j4) * 31, 31);
    }

    public String toString() {
        return defpackage.f.l(p3.x.i(this.border), Separators.RPAREN, defpackage.f.s("PillButtonColors(background=", p3.x.i(this.background), ", text=", p3.x.i(this.text), ", border="));
    }

    public /* synthetic */ PillButtonColors(long j4, long j10, long j11, kotlin.jvm.internal.f fVar) {
        this(j4, j10, j11);
    }
}
