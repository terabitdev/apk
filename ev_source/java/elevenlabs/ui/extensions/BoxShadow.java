package io.elevenlabs.ui.extensions;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import h5.g;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import p.n;
import p3.x;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b*\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0018¨\u0006."}, d2 = {"Lio/elevenlabs/ui/extensions/BoxShadow;", "", "Lp3/x;", "color", "Lh5/f;", "blurRadius", "spreadRadius", "Lh5/g;", "offset", "", "inset", "<init>", "(JFFJZLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-D9Ej5fM", "()F", "component2", "component3-D9Ej5fM", "component3", "component4-RKDOV3M", "component4", "component5", "()Z", "copy-vPidWlw", "(JFFJZ)Lio/elevenlabs/ui/extensions/BoxShadow;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getColor-0d7_KjU", TokenNames.F, "getBlurRadius-D9Ej5fM", "getSpreadRadius-D9Ej5fM", "getOffset-RKDOV3M", "Z", "getInset", "Companion", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class BoxShadow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float blurRadius;
    private final long color;
    private final boolean inset;
    private final long offset;
    private final float spreadRadius;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BoxShadow(long j4, float f10, float f11, long j10, boolean z6, int i10, f fVar) {
        this(r0, r2, r4, r5, (i10 & 16) == 0 ? z6 : false, null);
        long j11;
        float f12;
        float f13;
        long j12;
        if ((i10 & 1) != 0) {
            int i11 = x.f26439n;
            j11 = x.f26427b;
        } else {
            j11 = j4;
        }
        if ((i10 & 2) != 0) {
            f12 = 0;
        } else {
            f12 = f10;
        }
        if ((i10 & 4) != 0) {
            f13 = 0;
        } else {
            f13 = f11;
        }
        if ((i10 & 8) != 0) {
            j12 = 0;
        } else {
            j12 = j10;
        }
    }

    /* renamed from: copy-vPidWlw$default, reason: not valid java name */
    public static /* synthetic */ BoxShadow m1965copyvPidWlw$default(BoxShadow boxShadow, long j4, float f10, float f11, long j10, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = boxShadow.color;
        }
        long j11 = j4;
        if ((i10 & 2) != 0) {
            f10 = boxShadow.blurRadius;
        }
        float f12 = f10;
        if ((i10 & 4) != 0) {
            f11 = boxShadow.spreadRadius;
        }
        float f13 = f11;
        if ((i10 & 8) != 0) {
            j10 = boxShadow.offset;
        }
        long j12 = j10;
        if ((i10 & 16) != 0) {
            z6 = boxShadow.inset;
        }
        return boxShadow.m1970copyvPidWlw(j11, f12, f13, j12, z6);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSpreadRadius() {
        return this.spreadRadius;
    }

    /* renamed from: component4-RKDOV3M, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInset() {
        return this.inset;
    }

    /* renamed from: copy-vPidWlw, reason: not valid java name */
    public final BoxShadow m1970copyvPidWlw(long color, float blurRadius, float spreadRadius, long offset, boolean inset) {
        return new BoxShadow(color, blurRadius, spreadRadius, offset, inset, null);
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof BoxShadow) {
                BoxShadow boxShadow = (BoxShadow) other;
                if (x.c(this.color, boxShadow.color) && h5.f.b(this.blurRadius, boxShadow.blurRadius) && h5.f.b(this.spreadRadius, boxShadow.spreadRadius) && this.offset == boxShadow.offset && this.inset == boxShadow.inset) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: getBlurRadius-D9Ej5fM, reason: not valid java name */
    public final float m1971getBlurRadiusD9Ej5fM() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m1972getColor0d7_KjU() {
        return this.color;
    }

    public final boolean getInset() {
        return this.inset;
    }

    /* renamed from: getOffset-RKDOV3M, reason: not valid java name */
    public final long m1973getOffsetRKDOV3M() {
        return this.offset;
    }

    /* renamed from: getSpreadRadius-D9Ej5fM, reason: not valid java name */
    public final float m1974getSpreadRadiusD9Ej5fM() {
        return this.spreadRadius;
    }

    public int hashCode() {
        long j4 = this.color;
        int i10 = x.f26439n;
        return Boolean.hashCode(this.inset) + com.google.android.gms.internal.play_billing.b.g(this.offset, com.google.android.gms.internal.play_billing.b.c(this.spreadRadius, com.google.android.gms.internal.play_billing.b.c(this.blurRadius, Long.hashCode(j4) * 31, 31), 31), 31);
    }

    public String toString() {
        String i10 = x.i(this.color);
        String c5 = h5.f.c(this.blurRadius);
        String c10 = h5.f.c(this.spreadRadius);
        String a10 = g.a(this.offset);
        boolean z6 = this.inset;
        StringBuilder s10 = defpackage.f.s("BoxShadow(color=", i10, ", blurRadius=", c5, ", spreadRadius=");
        defpackage.f.x(s10, c10, ", offset=", a10, ", inset=");
        return n.j(Separators.RPAREN, s10, z6);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/ui/extensions/BoxShadow$Companion;", "", "<init>", "()V", "Lp3/x;", "color", "", "blurRadius", "spreadRadius", "Lo3/b;", "offset", "", "inset", "Lio/elevenlabs/ui/extensions/BoxShadow;", "new-dxg6XEk", "(JFFJZ)Lio/elevenlabs/ui/extensions/BoxShadow;", "new", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* renamed from: new-dxg6XEk$default, reason: not valid java name */
        public static BoxShadow m1975newdxg6XEk$default(Companion companion, long j4, float f10, float f11, long j10, boolean z6, int i10, Object obj) {
            long j11;
            float f12;
            long j12;
            boolean z10;
            if ((i10 & 1) != 0) {
                int i11 = x.f26439n;
                j11 = x.f26427b;
            } else {
                j11 = j4;
            }
            int i12 = i10 & 2;
            float f13 = u.P;
            if (i12 != 0) {
                f12 = 0.0f;
            } else {
                f12 = f10;
            }
            if ((i10 & 4) == 0) {
                f13 = f11;
            }
            if ((i10 & 8) != 0) {
                j12 = 0;
            } else {
                j12 = j10;
            }
            if ((i10 & 16) != 0) {
                z10 = false;
            } else {
                z10 = z6;
            }
            return companion.m1976newdxg6XEk(j11, f12, f13, j12, z10);
        }

        /* renamed from: new-dxg6XEk, reason: not valid java name */
        public final BoxShadow m1976newdxg6XEk(long color, float blurRadius, float spreadRadius, long offset, boolean inset) {
            float intBitsToFloat = Float.intBitsToFloat((int) (offset >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (offset & 4294967295L));
            return new BoxShadow(color, blurRadius, spreadRadius, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), inset, null);
        }

        private Companion() {
        }
    }

    private BoxShadow(long j4, float f10, float f11, long j10, boolean z6) {
        this.color = j4;
        this.blurRadius = f10;
        this.spreadRadius = f11;
        this.offset = j10;
        this.inset = z6;
    }

    public /* synthetic */ BoxShadow(long j4, float f10, float f11, long j10, boolean z6, f fVar) {
        this(j4, f10, f11, j10, z6);
    }
}
