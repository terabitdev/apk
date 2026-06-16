package io.elevenlabs.ui.theme;

import android.gov.nist.core.Separators;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p3.b1;
import z1.g;
import z1.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jt\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u0011R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b3\u0010\u0011¨\u00064"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsShapes;", "", "Lp3/b1;", "none", "xs", "sm", "md", "mx", "lg", "lg2", "xl", "Lz1/g;", "xlTop", "full", "<init>", "(Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lz1/g;Lp3/b1;)V", "component1", "()Lp3/b1;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lz1/g;", "component10", "copy", "(Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lp3/b1;Lz1/g;Lp3/b1;)Lio/elevenlabs/ui/theme/ElevenLabsShapes;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp3/b1;", "getNone", "getXs", "getSm", "getMd", "getMx", "getLg", "getLg2", "getXl", "Lz1/g;", "getXlTop", "getFull", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ElevenLabsShapes {
    public static final int $stable = 0;
    private final b1 full;
    private final b1 lg;
    private final b1 lg2;
    private final b1 md;
    private final b1 mx;
    private final b1 none;
    private final b1 sm;
    private final b1 xl;
    private final g xlTop;
    private final b1 xs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ElevenLabsShapes(b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, g gVar, b1 b1Var9, int i10, f fVar) {
        this(b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7, b1Var8, gVar, (i10 & 512) != 0 ? h.a() : b1Var9);
        b1Var = (i10 & 1) != 0 ? h.b(0) : b1Var;
        b1Var2 = (i10 & 2) != 0 ? h.b(2) : b1Var2;
        b1Var3 = (i10 & 4) != 0 ? h.b(4) : b1Var3;
        b1Var4 = (i10 & 8) != 0 ? h.b(8) : b1Var4;
        b1Var5 = (i10 & 16) != 0 ? h.b(12) : b1Var5;
        b1Var6 = (i10 & 32) != 0 ? h.b(16) : b1Var6;
        b1Var7 = (i10 & 64) != 0 ? h.b(20) : b1Var7;
        b1Var8 = (i10 & 128) != 0 ? h.b(28) : b1Var8;
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            float f10 = 28;
            gVar = h.d(f10, f10);
        }
    }

    public static /* synthetic */ ElevenLabsShapes copy$default(ElevenLabsShapes elevenLabsShapes, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, g gVar, b1 b1Var9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b1Var = elevenLabsShapes.none;
        }
        if ((i10 & 2) != 0) {
            b1Var2 = elevenLabsShapes.xs;
        }
        if ((i10 & 4) != 0) {
            b1Var3 = elevenLabsShapes.sm;
        }
        if ((i10 & 8) != 0) {
            b1Var4 = elevenLabsShapes.md;
        }
        if ((i10 & 16) != 0) {
            b1Var5 = elevenLabsShapes.mx;
        }
        if ((i10 & 32) != 0) {
            b1Var6 = elevenLabsShapes.lg;
        }
        if ((i10 & 64) != 0) {
            b1Var7 = elevenLabsShapes.lg2;
        }
        if ((i10 & 128) != 0) {
            b1Var8 = elevenLabsShapes.xl;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            gVar = elevenLabsShapes.xlTop;
        }
        if ((i10 & 512) != 0) {
            b1Var9 = elevenLabsShapes.full;
        }
        g gVar2 = gVar;
        b1 b1Var10 = b1Var9;
        b1 b1Var11 = b1Var7;
        b1 b1Var12 = b1Var8;
        b1 b1Var13 = b1Var5;
        b1 b1Var14 = b1Var6;
        return elevenLabsShapes.copy(b1Var, b1Var2, b1Var3, b1Var4, b1Var13, b1Var14, b1Var11, b1Var12, gVar2, b1Var10);
    }

    /* renamed from: component1, reason: from getter */
    public final b1 getNone() {
        return this.none;
    }

    /* renamed from: component10, reason: from getter */
    public final b1 getFull() {
        return this.full;
    }

    /* renamed from: component2, reason: from getter */
    public final b1 getXs() {
        return this.xs;
    }

    /* renamed from: component3, reason: from getter */
    public final b1 getSm() {
        return this.sm;
    }

    /* renamed from: component4, reason: from getter */
    public final b1 getMd() {
        return this.md;
    }

    /* renamed from: component5, reason: from getter */
    public final b1 getMx() {
        return this.mx;
    }

    /* renamed from: component6, reason: from getter */
    public final b1 getLg() {
        return this.lg;
    }

    /* renamed from: component7, reason: from getter */
    public final b1 getLg2() {
        return this.lg2;
    }

    /* renamed from: component8, reason: from getter */
    public final b1 getXl() {
        return this.xl;
    }

    /* renamed from: component9, reason: from getter */
    public final g getXlTop() {
        return this.xlTop;
    }

    public final ElevenLabsShapes copy(b1 none, b1 xs2, b1 sm, b1 md, b1 mx, b1 lg2, b1 lg22, b1 xl2, g xlTop, b1 full) {
        none.getClass();
        xs2.getClass();
        sm.getClass();
        md.getClass();
        mx.getClass();
        lg2.getClass();
        lg22.getClass();
        xl2.getClass();
        xlTop.getClass();
        full.getClass();
        return new ElevenLabsShapes(none, xs2, sm, md, mx, lg2, lg22, xl2, xlTop, full);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElevenLabsShapes)) {
            return false;
        }
        ElevenLabsShapes elevenLabsShapes = (ElevenLabsShapes) other;
        if (m.c(this.none, elevenLabsShapes.none) && m.c(this.xs, elevenLabsShapes.xs) && m.c(this.sm, elevenLabsShapes.sm) && m.c(this.md, elevenLabsShapes.md) && m.c(this.mx, elevenLabsShapes.mx) && m.c(this.lg, elevenLabsShapes.lg) && m.c(this.lg2, elevenLabsShapes.lg2) && m.c(this.xl, elevenLabsShapes.xl) && m.c(this.xlTop, elevenLabsShapes.xlTop) && m.c(this.full, elevenLabsShapes.full)) {
            return true;
        }
        return false;
    }

    public final b1 getFull() {
        return this.full;
    }

    public final b1 getLg() {
        return this.lg;
    }

    public final b1 getLg2() {
        return this.lg2;
    }

    public final b1 getMd() {
        return this.md;
    }

    public final b1 getMx() {
        return this.mx;
    }

    public final b1 getNone() {
        return this.none;
    }

    public final b1 getSm() {
        return this.sm;
    }

    public final b1 getXl() {
        return this.xl;
    }

    public final g getXlTop() {
        return this.xlTop;
    }

    public final b1 getXs() {
        return this.xs;
    }

    public int hashCode() {
        return this.full.hashCode() + ((this.xlTop.hashCode() + ((this.xl.hashCode() + ((this.lg2.hashCode() + ((this.lg.hashCode() + ((this.mx.hashCode() + ((this.md.hashCode() + ((this.sm.hashCode() + ((this.xs.hashCode() + (this.none.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ElevenLabsShapes(none=" + this.none + ", xs=" + this.xs + ", sm=" + this.sm + ", md=" + this.md + ", mx=" + this.mx + ", lg=" + this.lg + ", lg2=" + this.lg2 + ", xl=" + this.xl + ", xlTop=" + this.xlTop + ", full=" + this.full + Separators.RPAREN;
    }

    public ElevenLabsShapes(b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, b1 b1Var6, b1 b1Var7, b1 b1Var8, g gVar, b1 b1Var9) {
        b1Var.getClass();
        b1Var2.getClass();
        b1Var3.getClass();
        b1Var4.getClass();
        b1Var5.getClass();
        b1Var6.getClass();
        b1Var7.getClass();
        b1Var8.getClass();
        gVar.getClass();
        b1Var9.getClass();
        this.none = b1Var;
        this.xs = b1Var2;
        this.sm = b1Var3;
        this.md = b1Var4;
        this.mx = b1Var5;
        this.lg = b1Var6;
        this.lg2 = b1Var7;
        this.xl = b1Var8;
        this.xlTop = gVar;
        this.full = b1Var9;
    }

    public ElevenLabsShapes() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
