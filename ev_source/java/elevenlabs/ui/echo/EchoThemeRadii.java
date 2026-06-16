package io.elevenlabs.ui.echo;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b \u0010\u0014¨\u0006\""}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeRadii;", "", "Lh5/f;", "none", "xs", "sm", "md", "lg", "xl", "twoXl", "threeXl", "fourXl", "full", "fiveXl", "sixXl", "sevenXl", "<init>", "(FFFFFFFFFFFFFLkotlin/jvm/internal/f;)V", TokenNames.F, "getNone-D9Ej5fM", "()F", "getXs-D9Ej5fM", "getSm-D9Ej5fM", "getMd-D9Ej5fM", "getLg-D9Ej5fM", "getXl-D9Ej5fM", "getTwoXl-D9Ej5fM", "getThreeXl-D9Ej5fM", "getFourXl-D9Ej5fM", "getFull-D9Ej5fM", "getFiveXl-D9Ej5fM", "getSixXl-D9Ej5fM", "getSevenXl-D9Ej5fM", "Companion", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoThemeRadii {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EchoThemeRadii INSTANCE = new EchoThemeRadii(u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, 8191, null);
    private final float fiveXl;
    private final float fourXl;
    private final float full;
    private final float lg;
    private final float md;
    private final float none;
    private final float sevenXl;
    private final float sixXl;
    private final float sm;
    private final float threeXl;
    private final float twoXl;
    private final float xl;
    private final float xs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EchoThemeRadii(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, int i10, f fVar) {
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
            f23 = 0;
        } else {
            f23 = f10;
        }
        if ((i10 & 2) != 0) {
            f24 = 2;
        } else {
            f24 = f11;
        }
        if ((i10 & 4) != 0) {
            f25 = 4;
        } else {
            f25 = f12;
        }
        if ((i10 & 8) != 0) {
            f26 = 6;
        } else {
            f26 = f13;
        }
        if ((i10 & 16) != 0) {
            f27 = 8;
        } else {
            f27 = f14;
        }
        if ((i10 & 32) != 0) {
            f28 = 12;
        } else {
            f28 = f15;
        }
        if ((i10 & 64) != 0) {
            f29 = 16;
        } else {
            f29 = f16;
        }
        if ((i10 & 128) != 0) {
            f30 = 24;
        } else {
            f30 = f17;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            f31 = 32;
        } else {
            f31 = f18;
        }
        if ((i10 & 512) != 0) {
            f32 = 9999;
        } else {
            f32 = f19;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            f33 = 40;
        } else {
            f33 = f20;
        }
        if ((i10 & 2048) != 0) {
            f34 = 48;
        } else {
            f34 = f21;
        }
        if ((i10 & 4096) != 0) {
            f35 = 56;
        } else {
            f35 = f22;
        }
    }

    /* renamed from: getFiveXl-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFiveXl() {
        return this.fiveXl;
    }

    /* renamed from: getFourXl-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFourXl() {
        return this.fourXl;
    }

    /* renamed from: getFull-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFull() {
        return this.full;
    }

    /* renamed from: getLg-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLg() {
        return this.lg;
    }

    /* renamed from: getMd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMd() {
        return this.md;
    }

    /* renamed from: getNone-D9Ej5fM, reason: not valid java name and from getter */
    public final float getNone() {
        return this.none;
    }

    /* renamed from: getSevenXl-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSevenXl() {
        return this.sevenXl;
    }

    /* renamed from: getSixXl-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSixXl() {
        return this.sixXl;
    }

    /* renamed from: getSm-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSm() {
        return this.sm;
    }

    /* renamed from: getThreeXl-D9Ej5fM, reason: not valid java name and from getter */
    public final float getThreeXl() {
        return this.threeXl;
    }

    /* renamed from: getTwoXl-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTwoXl() {
        return this.twoXl;
    }

    /* renamed from: getXl-D9Ej5fM, reason: not valid java name and from getter */
    public final float getXl() {
        return this.xl;
    }

    /* renamed from: getXs-D9Ej5fM, reason: not valid java name and from getter */
    public final float getXs() {
        return this.xs;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeRadii$Companion;", "", "<init>", "()V", "INSTANCE", "Lio/elevenlabs/ui/echo/EchoThemeRadii;", "getINSTANCE", "()Lio/elevenlabs/ui/echo/EchoThemeRadii;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final EchoThemeRadii getINSTANCE() {
            return EchoThemeRadii.INSTANCE;
        }

        private Companion() {
        }
    }

    private EchoThemeRadii(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22) {
        this.none = f10;
        this.xs = f11;
        this.sm = f12;
        this.md = f13;
        this.lg = f14;
        this.xl = f15;
        this.twoXl = f16;
        this.threeXl = f17;
        this.fourXl = f18;
        this.full = f19;
        this.fiveXl = f20;
        this.sixXl = f21;
        this.sevenXl = f22;
    }

    public /* synthetic */ EchoThemeRadii(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, f fVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22);
    }
}
