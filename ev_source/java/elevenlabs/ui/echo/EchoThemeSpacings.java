package io.elevenlabs.ui.echo;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\bL\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001MBå\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b.\u0010*R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b/\u0010*R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b0\u0010*R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b1\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b2\u0010*R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b3\u0010*R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b4\u0010*R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b5\u0010*R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b6\u0010*R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b7\u0010*R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b8\u0010*R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b9\u0010*R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b:\u0010*R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b;\u0010*R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b<\u0010*R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b=\u0010*R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b>\u0010*R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b?\u0010*R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b@\u0010*R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010(\u001a\u0004\bA\u0010*R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\bB\u0010*R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\bC\u0010*R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\bD\u0010*R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\bE\u0010*R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\bF\u0010*R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\bG\u0010*R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\bH\u0010*R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\bI\u0010*R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\bJ\u0010*R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\bK\u0010*R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\bL\u0010*¨\u0006N"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeSpacings;", "", "Lh5/f;", "x0", "x1", "x2", "x3", "x4", "x5", "x6", "x7", "x8", "x9", "x10", "x11", "x12", "x14", "x16", "x20", "x24", "x28", "x32", "x36", "x40", "x44", "x48", "x52", "x56", "x60", "x64", "x72", "x80", "x96", "xpx", "x0_5", "x1_5", "x2_5", "x3_5", "<init>", "(FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFLkotlin/jvm/internal/f;)V", TokenNames.F, "getX0-D9Ej5fM", "()F", "getX1-D9Ej5fM", "getX2-D9Ej5fM", "getX3-D9Ej5fM", "getX4-D9Ej5fM", "getX5-D9Ej5fM", "getX6-D9Ej5fM", "getX7-D9Ej5fM", "getX8-D9Ej5fM", "getX9-D9Ej5fM", "getX10-D9Ej5fM", "getX11-D9Ej5fM", "getX12-D9Ej5fM", "getX14-D9Ej5fM", "getX16-D9Ej5fM", "getX20-D9Ej5fM", "getX24-D9Ej5fM", "getX28-D9Ej5fM", "getX32-D9Ej5fM", "getX36-D9Ej5fM", "getX40-D9Ej5fM", "getX44-D9Ej5fM", "getX48-D9Ej5fM", "getX52-D9Ej5fM", "getX56-D9Ej5fM", "getX60-D9Ej5fM", "getX64-D9Ej5fM", "getX72-D9Ej5fM", "getX80-D9Ej5fM", "getX96-D9Ej5fM", "getXpx-D9Ej5fM", "getX0_5-D9Ej5fM", "getX1_5-D9Ej5fM", "getX2_5-D9Ej5fM", "getX3_5-D9Ej5fM", "Companion", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoThemeSpacings {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EchoThemeSpacings INSTANCE = new EchoThemeSpacings(u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, -1, 7, null);
    private final float x0;
    private final float x0_5;
    private final float x1;
    private final float x10;
    private final float x11;
    private final float x12;
    private final float x14;
    private final float x16;
    private final float x1_5;
    private final float x2;
    private final float x20;
    private final float x24;
    private final float x28;
    private final float x2_5;
    private final float x3;
    private final float x32;
    private final float x36;
    private final float x3_5;
    private final float x4;
    private final float x40;
    private final float x44;
    private final float x48;
    private final float x5;
    private final float x52;
    private final float x56;
    private final float x6;
    private final float x60;
    private final float x64;
    private final float x7;
    private final float x72;
    private final float x8;
    private final float x80;
    private final float x9;
    private final float x96;
    private final float xpx;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EchoThemeSpacings(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, float f33, float f34, float f35, float f36, float f37, float f38, float f39, float f40, float f41, float f42, float f43, float f44, int i10, int i11, f fVar) {
        this(r19, r20, r21, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r3, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? 80 : f25, (i10 & 65536) != 0 ? 96 : f26, (i10 & 131072) != 0 ? 112 : f27, (i10 & 262144) != 0 ? 128 : f28, (i10 & 524288) != 0 ? 144 : f29, (i10 & 1048576) != 0 ? 160 : f30, (i10 & 2097152) != 0 ? 176 : f31, (i10 & 4194304) != 0 ? 192 : f32, (i10 & 8388608) != 0 ? 208 : f33, (i10 & 16777216) != 0 ? 224 : f34, (i10 & 33554432) != 0 ? 240 : f35, (i10 & 67108864) != 0 ? RpcError.MAX_MESSAGE_BYTES : f36, (i10 & 134217728) != 0 ? 288 : f37, (i10 & 268435456) != 0 ? 320 : f38, (i10 & 536870912) != 0 ? 384 : f39, (i10 & 1073741824) != 0 ? 1 : f40, (i10 & Integer.MIN_VALUE) != 0 ? 2 : f41, (i11 & 1) != 0 ? 6 : f42, (i11 & 2) != 0 ? 10 : f43, (i11 & 4) != 0 ? 14 : f44, null);
        float f45 = (i10 & 1) != 0 ? 0 : f10;
        float f46 = (i10 & 2) != 0 ? 4 : f11;
        float f47 = (i10 & 4) != 0 ? 8 : f12;
        float f48 = (i10 & 8) != 0 ? 12 : f13;
        float f49 = (i10 & 16) != 0 ? 16 : f14;
        float f50 = (i10 & 32) != 0 ? 20 : f15;
        float f51 = (i10 & 64) != 0 ? 24 : f16;
        float f52 = (i10 & 128) != 0 ? 28 : f17;
        float f53 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? 32 : f18;
        float f54 = (i10 & 512) != 0 ? 36 : f19;
        float f55 = (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? 40 : f20;
        float f56 = (i10 & 2048) != 0 ? 44 : f21;
        float f57 = (i10 & 4096) != 0 ? 48 : f22;
        float f58 = (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 56 : f23;
        float f59 = (i10 & 16384) != 0 ? 64 : f24;
        float f60 = f45;
        float f61 = f46;
        float f62 = f47;
    }

    /* renamed from: getX0-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX0() {
        return this.x0;
    }

    /* renamed from: getX0_5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX0_5() {
        return this.x0_5;
    }

    /* renamed from: getX1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX1() {
        return this.x1;
    }

    /* renamed from: getX10-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX10() {
        return this.x10;
    }

    /* renamed from: getX11-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX11() {
        return this.x11;
    }

    /* renamed from: getX12-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX12() {
        return this.x12;
    }

    /* renamed from: getX14-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX14() {
        return this.x14;
    }

    /* renamed from: getX16-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX16() {
        return this.x16;
    }

    /* renamed from: getX1_5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX1_5() {
        return this.x1_5;
    }

    /* renamed from: getX2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX2() {
        return this.x2;
    }

    /* renamed from: getX20-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX20() {
        return this.x20;
    }

    /* renamed from: getX24-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX24() {
        return this.x24;
    }

    /* renamed from: getX28-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX28() {
        return this.x28;
    }

    /* renamed from: getX2_5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX2_5() {
        return this.x2_5;
    }

    /* renamed from: getX3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX3() {
        return this.x3;
    }

    /* renamed from: getX32-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX32() {
        return this.x32;
    }

    /* renamed from: getX36-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX36() {
        return this.x36;
    }

    /* renamed from: getX3_5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX3_5() {
        return this.x3_5;
    }

    /* renamed from: getX4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX4() {
        return this.x4;
    }

    /* renamed from: getX40-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX40() {
        return this.x40;
    }

    /* renamed from: getX44-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX44() {
        return this.x44;
    }

    /* renamed from: getX48-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX48() {
        return this.x48;
    }

    /* renamed from: getX5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX5() {
        return this.x5;
    }

    /* renamed from: getX52-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX52() {
        return this.x52;
    }

    /* renamed from: getX56-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX56() {
        return this.x56;
    }

    /* renamed from: getX6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX6() {
        return this.x6;
    }

    /* renamed from: getX60-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX60() {
        return this.x60;
    }

    /* renamed from: getX64-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX64() {
        return this.x64;
    }

    /* renamed from: getX7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX7() {
        return this.x7;
    }

    /* renamed from: getX72-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX72() {
        return this.x72;
    }

    /* renamed from: getX8-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX8() {
        return this.x8;
    }

    /* renamed from: getX80-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX80() {
        return this.x80;
    }

    /* renamed from: getX9-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX9() {
        return this.x9;
    }

    /* renamed from: getX96-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX96() {
        return this.x96;
    }

    /* renamed from: getXpx-D9Ej5fM, reason: not valid java name and from getter */
    public final float getXpx() {
        return this.xpx;
    }

    private EchoThemeSpacings(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, float f33, float f34, float f35, float f36, float f37, float f38, float f39, float f40, float f41, float f42, float f43, float f44) {
        this.x0 = f10;
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
        this.x11 = f21;
        this.x12 = f22;
        this.x14 = f23;
        this.x16 = f24;
        this.x20 = f25;
        this.x24 = f26;
        this.x28 = f27;
        this.x32 = f28;
        this.x36 = f29;
        this.x40 = f30;
        this.x44 = f31;
        this.x48 = f32;
        this.x52 = f33;
        this.x56 = f34;
        this.x60 = f35;
        this.x64 = f36;
        this.x72 = f37;
        this.x80 = f38;
        this.x96 = f39;
        this.xpx = f40;
        this.x0_5 = f41;
        this.x1_5 = f42;
        this.x2_5 = f43;
        this.x3_5 = f44;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeSpacings$Companion;", "", "<init>", "()V", "INSTANCE", "Lio/elevenlabs/ui/echo/EchoThemeSpacings;", "getINSTANCE", "()Lio/elevenlabs/ui/echo/EchoThemeSpacings;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final EchoThemeSpacings getINSTANCE() {
            return EchoThemeSpacings.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EchoThemeSpacings(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, float f33, float f34, float f35, float f36, float f37, float f38, float f39, float f40, float f41, float f42, float f43, float f44, f fVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, f43, f44);
    }
}
