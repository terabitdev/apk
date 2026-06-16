package io.elevenlabs.ui.echo;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeBlurs;", "", "Lh5/f;", "none", "xs", "sm", "md", "lg", "xl", "twoXl", "threeXl", "<init>", "(FFFFFFFFLkotlin/jvm/internal/f;)V", TokenNames.F, "getNone-D9Ej5fM", "()F", "getXs-D9Ej5fM", "getSm-D9Ej5fM", "getMd-D9Ej5fM", "getLg-D9Ej5fM", "getXl-D9Ej5fM", "getTwoXl-D9Ej5fM", "getThreeXl-D9Ej5fM", "Companion", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoThemeBlurs {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EchoThemeBlurs INSTANCE = new EchoThemeBlurs(u.P, u.P, u.P, u.P, u.P, u.P, u.P, u.P, 255, null);
    private final float lg;
    private final float md;
    private final float none;
    private final float sm;
    private final float threeXl;
    private final float twoXl;
    private final float xl;
    private final float xs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EchoThemeBlurs(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10, f fVar) {
        this(r1, r2, r3, r4, r5, r6, r7, r0, null);
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        if ((i10 & 1) != 0) {
            f18 = 0;
        } else {
            f18 = f10;
        }
        if ((i10 & 2) != 0) {
            f19 = 4;
        } else {
            f19 = f11;
        }
        if ((i10 & 4) != 0) {
            f20 = 8;
        } else {
            f20 = f12;
        }
        if ((i10 & 8) != 0) {
            f21 = 12;
        } else {
            f21 = f13;
        }
        if ((i10 & 16) != 0) {
            f22 = 16;
        } else {
            f22 = f14;
        }
        if ((i10 & 32) != 0) {
            f23 = 24;
        } else {
            f23 = f15;
        }
        if ((i10 & 64) != 0) {
            f24 = 40;
        } else {
            f24 = f16;
        }
        if ((i10 & 128) != 0) {
            f25 = 64;
        } else {
            f25 = f17;
        }
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeBlurs$Companion;", "", "<init>", "()V", "INSTANCE", "Lio/elevenlabs/ui/echo/EchoThemeBlurs;", "getINSTANCE", "()Lio/elevenlabs/ui/echo/EchoThemeBlurs;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final EchoThemeBlurs getINSTANCE() {
            return EchoThemeBlurs.INSTANCE;
        }

        private Companion() {
        }
    }

    private EchoThemeBlurs(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.none = f10;
        this.xs = f11;
        this.sm = f12;
        this.md = f13;
        this.lg = f14;
        this.xl = f15;
        this.twoXl = f16;
        this.threeXl = f17;
    }

    public /* synthetic */ EchoThemeBlurs(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, f fVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17);
    }
}
