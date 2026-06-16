package io.elevenlabs.ui.theme;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0013J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0013J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0013J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0013J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0013J\u0092\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b?\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bA\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bB\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bC\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bD\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bE\u0010\u0013R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bF\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bG\u0010\u0013¨\u0006H"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsSpacings;", "", "Lh5/f;", "x05", "x1", "x2", "x3", "x4", "x5", "x6", "x7", "x8", "x9", "x10", "x16", "x25", "<init>", "(FFFFFFFFFFFFFLkotlin/jvm/internal/f;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "component4-D9Ej5fM", "component4", "component5-D9Ej5fM", "component5", "component6-D9Ej5fM", "component6", "component7-D9Ej5fM", "component7", "component8-D9Ej5fM", "component8", "component9-D9Ej5fM", "component9", "component10-D9Ej5fM", "component10", "component11-D9Ej5fM", "component11", "component12-D9Ej5fM", "component12", "component13-D9Ej5fM", "component13", "copy-UucoBsQ", "(FFFFFFFFFFFFF)Lio/elevenlabs/ui/theme/ElevenLabsSpacings;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", TokenNames.F, "getX05-D9Ej5fM", "getX1-D9Ej5fM", "getX2-D9Ej5fM", "getX3-D9Ej5fM", "getX4-D9Ej5fM", "getX5-D9Ej5fM", "getX6-D9Ej5fM", "getX7-D9Ej5fM", "getX8-D9Ej5fM", "getX9-D9Ej5fM", "getX10-D9Ej5fM", "getX16-D9Ej5fM", "getX25-D9Ej5fM", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ElevenLabsSpacings {
    public static final int $stable = 0;
    private final float x05;
    private final float x1;
    private final float x10;
    private final float x16;
    private final float x2;
    private final float x25;
    private final float x3;
    private final float x4;
    private final float x5;
    private final float x6;
    private final float x7;
    private final float x8;
    private final float x9;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ElevenLabsSpacings(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, int i10, f fVar) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r0, null);
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        if ((i10 & 1) != 0) {
            f23 = 2;
        } else {
            f23 = f10;
        }
        if ((i10 & 2) != 0) {
            f24 = 4;
        } else {
            f24 = f11;
        }
        if ((i10 & 4) != 0) {
            f25 = 8;
        } else {
            f25 = f12;
        }
        if ((i10 & 8) != 0) {
            f26 = 12;
        } else {
            f26 = f13;
        }
        if ((i10 & 16) != 0) {
            f27 = 16;
        } else {
            f27 = f14;
        }
        if ((i10 & 32) != 0) {
            f28 = 20;
        } else {
            f28 = f15;
        }
        if ((i10 & 64) != 0) {
            f29 = 24;
        } else {
            f29 = f16;
        }
        if ((i10 & 128) != 0) {
            f30 = 28;
        } else {
            f30 = f17;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            f31 = 32;
        } else {
            f31 = f18;
        }
        if ((i10 & 512) != 0) {
            f32 = 36;
        } else {
            f32 = f19;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            f33 = 40;
        } else {
            f33 = f20;
        }
        if ((i10 & 2048) != 0) {
            f34 = 64;
        } else {
            f34 = f21;
        }
        if ((i10 & 4096) != 0) {
            f35 = 100;
        } else {
            f35 = f22;
        }
    }

    /* renamed from: copy-UucoBsQ$default, reason: not valid java name */
    public static /* synthetic */ ElevenLabsSpacings m2334copyUucoBsQ$default(ElevenLabsSpacings elevenLabsSpacings, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, int i10, Object obj) {
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        if ((i10 & 1) != 0) {
            f10 = elevenLabsSpacings.x05;
        }
        if ((i10 & 2) != 0) {
            f23 = elevenLabsSpacings.x1;
        } else {
            f23 = f11;
        }
        if ((i10 & 4) != 0) {
            f24 = elevenLabsSpacings.x2;
        } else {
            f24 = f12;
        }
        if ((i10 & 8) != 0) {
            f25 = elevenLabsSpacings.x3;
        } else {
            f25 = f13;
        }
        if ((i10 & 16) != 0) {
            f26 = elevenLabsSpacings.x4;
        } else {
            f26 = f14;
        }
        if ((i10 & 32) != 0) {
            f27 = elevenLabsSpacings.x5;
        } else {
            f27 = f15;
        }
        if ((i10 & 64) != 0) {
            f28 = elevenLabsSpacings.x6;
        } else {
            f28 = f16;
        }
        if ((i10 & 128) != 0) {
            f29 = elevenLabsSpacings.x7;
        } else {
            f29 = f17;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            f30 = elevenLabsSpacings.x8;
        } else {
            f30 = f18;
        }
        if ((i10 & 512) != 0) {
            f31 = elevenLabsSpacings.x9;
        } else {
            f31 = f19;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            f32 = elevenLabsSpacings.x10;
        } else {
            f32 = f20;
        }
        if ((i10 & 2048) != 0) {
            f33 = elevenLabsSpacings.x16;
        } else {
            f33 = f21;
        }
        if ((i10 & 4096) != 0) {
            f34 = elevenLabsSpacings.x25;
        } else {
            f34 = f22;
        }
        return elevenLabsSpacings.m2348copyUucoBsQ(f10, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX05() {
        return this.x05;
    }

    /* renamed from: component10-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX9() {
        return this.x9;
    }

    /* renamed from: component11-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX10() {
        return this.x10;
    }

    /* renamed from: component12-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX16() {
        return this.x16;
    }

    /* renamed from: component13-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX25() {
        return this.x25;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX1() {
        return this.x1;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX2() {
        return this.x2;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX3() {
        return this.x3;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX4() {
        return this.x4;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX5() {
        return this.x5;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX6() {
        return this.x6;
    }

    /* renamed from: component8-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX7() {
        return this.x7;
    }

    /* renamed from: component9-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX8() {
        return this.x8;
    }

    /* renamed from: copy-UucoBsQ, reason: not valid java name */
    public final ElevenLabsSpacings m2348copyUucoBsQ(float x05, float x12, float x22, float x32, float x42, float x52, float x62, float x72, float x82, float x92, float x10, float x16, float x25) {
        return new ElevenLabsSpacings(x05, x12, x22, x32, x42, x52, x62, x72, x82, x92, x10, x16, x25, null);
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof ElevenLabsSpacings) {
                ElevenLabsSpacings elevenLabsSpacings = (ElevenLabsSpacings) other;
                if (!h5.f.b(this.x05, elevenLabsSpacings.x05) || !h5.f.b(this.x1, elevenLabsSpacings.x1) || !h5.f.b(this.x2, elevenLabsSpacings.x2) || !h5.f.b(this.x3, elevenLabsSpacings.x3) || !h5.f.b(this.x4, elevenLabsSpacings.x4) || !h5.f.b(this.x5, elevenLabsSpacings.x5) || !h5.f.b(this.x6, elevenLabsSpacings.x6) || !h5.f.b(this.x7, elevenLabsSpacings.x7) || !h5.f.b(this.x8, elevenLabsSpacings.x8) || !h5.f.b(this.x9, elevenLabsSpacings.x9) || !h5.f.b(this.x10, elevenLabsSpacings.x10) || !h5.f.b(this.x16, elevenLabsSpacings.x16) || !h5.f.b(this.x25, elevenLabsSpacings.x25)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: getX05-D9Ej5fM, reason: not valid java name */
    public final float m2349getX05D9Ej5fM() {
        return this.x05;
    }

    /* renamed from: getX1-D9Ej5fM, reason: not valid java name */
    public final float m2350getX1D9Ej5fM() {
        return this.x1;
    }

    /* renamed from: getX10-D9Ej5fM, reason: not valid java name */
    public final float m2351getX10D9Ej5fM() {
        return this.x10;
    }

    /* renamed from: getX16-D9Ej5fM, reason: not valid java name */
    public final float m2352getX16D9Ej5fM() {
        return this.x16;
    }

    /* renamed from: getX2-D9Ej5fM, reason: not valid java name */
    public final float m2353getX2D9Ej5fM() {
        return this.x2;
    }

    /* renamed from: getX25-D9Ej5fM, reason: not valid java name */
    public final float m2354getX25D9Ej5fM() {
        return this.x25;
    }

    /* renamed from: getX3-D9Ej5fM, reason: not valid java name */
    public final float m2355getX3D9Ej5fM() {
        return this.x3;
    }

    /* renamed from: getX4-D9Ej5fM, reason: not valid java name */
    public final float m2356getX4D9Ej5fM() {
        return this.x4;
    }

    /* renamed from: getX5-D9Ej5fM, reason: not valid java name */
    public final float m2357getX5D9Ej5fM() {
        return this.x5;
    }

    /* renamed from: getX6-D9Ej5fM, reason: not valid java name */
    public final float m2358getX6D9Ej5fM() {
        return this.x6;
    }

    /* renamed from: getX7-D9Ej5fM, reason: not valid java name */
    public final float m2359getX7D9Ej5fM() {
        return this.x7;
    }

    /* renamed from: getX8-D9Ej5fM, reason: not valid java name */
    public final float m2360getX8D9Ej5fM() {
        return this.x8;
    }

    /* renamed from: getX9-D9Ej5fM, reason: not valid java name */
    public final float m2361getX9D9Ej5fM() {
        return this.x9;
    }

    public int hashCode() {
        return Float.hashCode(this.x25) + b.c(this.x16, b.c(this.x10, b.c(this.x9, b.c(this.x8, b.c(this.x7, b.c(this.x6, b.c(this.x5, b.c(this.x4, b.c(this.x3, b.c(this.x2, b.c(this.x1, Float.hashCode(this.x05) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        String c5 = h5.f.c(this.x05);
        String c10 = h5.f.c(this.x1);
        String c11 = h5.f.c(this.x2);
        String c12 = h5.f.c(this.x3);
        String c13 = h5.f.c(this.x4);
        String c14 = h5.f.c(this.x5);
        String c15 = h5.f.c(this.x6);
        String c16 = h5.f.c(this.x7);
        String c17 = h5.f.c(this.x8);
        String c18 = h5.f.c(this.x9);
        String c19 = h5.f.c(this.x10);
        String c20 = h5.f.c(this.x16);
        String c21 = h5.f.c(this.x25);
        StringBuilder s10 = defpackage.f.s("ElevenLabsSpacings(x05=", c5, ", x1=", c10, ", x2=");
        defpackage.f.x(s10, c11, ", x3=", c12, ", x4=");
        defpackage.f.x(s10, c13, ", x5=", c14, ", x6=");
        defpackage.f.x(s10, c15, ", x7=", c16, ", x8=");
        defpackage.f.x(s10, c17, ", x9=", c18, ", x10=");
        defpackage.f.x(s10, c19, ", x16=", c20, ", x25=");
        return defpackage.f.l(c21, Separators.RPAREN, s10);
    }

    private ElevenLabsSpacings(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22) {
        this.x05 = f10;
        this.x1 = f11;
        this.x2 = f12;
        this.x3 = f13;
        this.x4 = f14;
        this.x5 = f15;
        this.x6 = f16;
        this.x7 = f17;
        this.x8 = f18;
        this.x9 = f19;
        this.x10 = f20;
        this.x16 = f21;
        this.x25 = f22;
    }

    public /* synthetic */ ElevenLabsSpacings(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, f fVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22);
    }
}
