package io.elevenlabs.ui.echo;

import ae.l;
import ib.i;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import s4.y0;
import u2.m;
import w4.g0;
import w4.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b{\b\u0007\u0018\u0000 ~2\u00020\u0001:\u0001~B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010!\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0011\u0010#\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0011\u0010%\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b$\u0010\u0006R\u0011\u0010'\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0011\u0010+\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0011\u0010-\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0011\u0010/\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u0011\u00101\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0011\u00103\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b2\u0010\u0006R\u0011\u00105\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b4\u0010\u0006R\u0011\u00107\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b6\u0010\u0006R\u0011\u00109\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0011\u0010;\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b:\u0010\u0006R\u0011\u0010=\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b<\u0010\u0006R\u0011\u0010?\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b>\u0010\u0006R\u0011\u0010A\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b@\u0010\u0006R\u0011\u0010C\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0011\u0010E\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bD\u0010\u0006R\u0011\u0010G\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bF\u0010\u0006R\u0011\u0010I\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bH\u0010\u0006R\u0011\u0010K\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bJ\u0010\u0006R\u0011\u0010M\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bL\u0010\u0006R\u0011\u0010O\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bN\u0010\u0006R\u0011\u0010Q\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bP\u0010\u0006R\u0011\u0010S\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bR\u0010\u0006R\u0011\u0010U\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bT\u0010\u0006R\u0011\u0010W\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bV\u0010\u0006R\u0011\u0010Y\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bX\u0010\u0006R\u0011\u0010[\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bZ\u0010\u0006R\u0011\u0010]\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\\\u0010\u0006R\u0011\u0010_\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b^\u0010\u0006R\u0011\u0010a\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b`\u0010\u0006R\u0011\u0010c\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bb\u0010\u0006R\u0011\u0010e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bd\u0010\u0006R\u0011\u0010g\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bf\u0010\u0006R\u0011\u0010i\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bh\u0010\u0006R\u0011\u0010k\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bj\u0010\u0006R\u0011\u0010m\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bl\u0010\u0006R\u0011\u0010o\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bn\u0010\u0006R\u0011\u0010q\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bp\u0010\u0006R\u0011\u0010s\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\br\u0010\u0006R\u0011\u0010u\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bt\u0010\u0006R\u0011\u0010w\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bv\u0010\u0006R\u0011\u0010y\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bx\u0010\u0006R\u0011\u0010{\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bz\u0010\u0006R\u0011\u0010}\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b|\u0010\u0006¨\u0006\u007f"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeTypography;", "", "<init>", "()V", "Ls4/y0;", "getXsRegular400", "(Lu2/m;I)Ls4/y0;", "xsRegular400", "getXsRegular500", "xsRegular500", "getXsRegular600", "xsRegular600", "getXsCompact400", "xsCompact400", "getXsCompact500", "xsCompact500", "getXsCompact600", "xsCompact600", "getSmRegular400", "smRegular400", "getSmRegular500", "smRegular500", "getSmRegular600", "smRegular600", "getSmCompact500", "smCompact500", "getSmCompact600", "smCompact600", "getSmCompact400", "smCompact400", "getBaseRegular400", "baseRegular400", "getBaseRegular500", "baseRegular500", "getBaseRegular600", "baseRegular600", "getBaseCompact400", "baseCompact400", "getBaseCompact500", "baseCompact500", "getBaseCompact600", "baseCompact600", "getLgRegular400", "lgRegular400", "getLgRegular500", "lgRegular500", "getLgRegular600", "lgRegular600", "getLgCompact400", "lgCompact400", "getLgCompact500", "lgCompact500", "getLgCompact600", "lgCompact600", "getXlRegular400", "xlRegular400", "getXlRegular500", "xlRegular500", "getXlRegular600", "xlRegular600", "getXlCompact400", "xlCompact400", "getXlCompact500", "xlCompact500", "getXlCompact600", "xlCompact600", "getTwoXlRegular400", "twoXlRegular400", "getTwoXlRegular500", "twoXlRegular500", "getTwoXlRegular600", "twoXlRegular600", "getTwoXlCompact400", "twoXlCompact400", "getTwoXlCompact500", "twoXlCompact500", "getTwoXlCompact600", "twoXlCompact600", "getThreeXlRegular400", "threeXlRegular400", "getThreeXlRegular500", "threeXlRegular500", "getThreeXlRegular600", "threeXlRegular600", "getThreeXlCompact400", "threeXlCompact400", "getThreeXlCompact500", "threeXlCompact500", "getThreeXlCompact600", "threeXlCompact600", "getFourXlRegular400", "fourXlRegular400", "getFourXlRegular500", "fourXlRegular500", "getFourXlRegular600", "fourXlRegular600", "getFourXlCompact400", "fourXlCompact400", "getFourXlCompact500", "fourXlCompact500", "getFourXlCompact600", "fourXlCompact600", "getFiveXlRegular400", "fiveXlRegular400", "getFiveXlRegular500", "fiveXlRegular500", "getFiveXlRegular600", "fiveXlRegular600", "getFiveXlCompact400", "fiveXlCompact400", "getFiveXlCompact500", "fiveXlCompact500", "getFiveXlCompact600", "fiveXlCompact600", "getSixXlRegular400", "sixXlRegular400", "getSixXlRegular500", "sixXlRegular500", "getSixXlRegular600", "sixXlRegular600", "getSixXlCompact400", "sixXlCompact400", "getSixXlCompact500", "sixXlCompact500", "getSixXlCompact600", "sixXlCompact600", "Companion", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoThemeTypography {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EchoThemeTypography INSTANCE = new EchoThemeTypography();

    public final y0 getBaseCompact400(m mVar, int i10) {
        long K = l.K(16);
        long K2 = l.K(20);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getBaseCompact500(m mVar, int i10) {
        long K = l.K(16);
        long K2 = l.K(20);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getBaseCompact600(m mVar, int i10) {
        long K = l.K(16);
        long K2 = l.K(20);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getBaseRegular400(m mVar, int i10) {
        long K = l.K(16);
        long K2 = l.K(24);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getBaseRegular500(m mVar, int i10) {
        long K = l.K(16);
        long K2 = l.K(24);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getBaseRegular600(m mVar, int i10) {
        long K = l.K(16);
        long K2 = l.K(24);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFiveXlCompact400(m mVar, int i10) {
        long K = l.K(64);
        long K2 = l.K(72);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFiveXlCompact500(m mVar, int i10) {
        long K = l.K(64);
        long K2 = l.K(72);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFiveXlCompact600(m mVar, int i10) {
        long K = l.K(64);
        long K2 = l.K(72);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFiveXlRegular400(m mVar, int i10) {
        long K = l.K(64);
        long K2 = l.K(72);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFiveXlRegular500(m mVar, int i10) {
        long K = l.K(64);
        long K2 = l.K(72);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFiveXlRegular600(m mVar, int i10) {
        long K = l.K(64);
        long K2 = l.K(72);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFourXlCompact400(m mVar, int i10) {
        long K = l.K(48);
        long K2 = l.K(64);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFourXlCompact500(m mVar, int i10) {
        long K = l.K(48);
        long K2 = l.K(64);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFourXlCompact600(m mVar, int i10) {
        long K = l.K(48);
        long K2 = l.K(64);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFourXlRegular400(m mVar, int i10) {
        long K = l.K(48);
        long K2 = l.K(64);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFourXlRegular500(m mVar, int i10) {
        long K = l.K(48);
        long K2 = l.K(64);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getFourXlRegular600(m mVar, int i10) {
        long K = l.K(48);
        long K2 = l.K(64);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getLgCompact400(m mVar, int i10) {
        long K = l.K(20);
        long K2 = l.K(28);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getLgCompact500(m mVar, int i10) {
        long K = l.K(20);
        long K2 = l.K(28);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getLgCompact600(m mVar, int i10) {
        long K = l.K(20);
        long K2 = l.K(28);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getLgRegular400(m mVar, int i10) {
        long K = l.K(20);
        long K2 = l.K(32);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getLgRegular500(m mVar, int i10) {
        long K = l.K(20);
        long K2 = l.K(32);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getLgRegular600(m mVar, int i10) {
        long K = l.K(20);
        long K2 = l.K(32);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSixXlCompact400(m mVar, int i10) {
        long K = l.K(80);
        long K2 = l.K(122);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSixXlCompact500(m mVar, int i10) {
        long K = l.K(80);
        long K2 = l.K(122);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSixXlCompact600(m mVar, int i10) {
        long K = l.K(80);
        long K2 = l.K(122);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSixXlRegular400(m mVar, int i10) {
        long K = l.K(80);
        long K2 = l.K(122);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSixXlRegular500(m mVar, int i10) {
        long K = l.K(80);
        long K2 = l.K(122);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSixXlRegular600(m mVar, int i10) {
        long K = l.K(80);
        long K2 = l.K(122);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSmCompact400(m mVar, int i10) {
        long K = l.K(14);
        long K2 = l.K(18);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSmCompact500(m mVar, int i10) {
        long K = l.K(14);
        long K2 = l.K(18);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSmCompact600(m mVar, int i10) {
        long K = l.K(14);
        long K2 = l.K(18);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSmRegular400(m mVar, int i10) {
        long K = l.K(14);
        long K2 = l.K(20);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSmRegular500(m mVar, int i10) {
        long K = l.K(14);
        long K2 = l.K(20);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getSmRegular600(m mVar, int i10) {
        long K = l.K(14);
        long K2 = l.K(20);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getThreeXlCompact400(m mVar, int i10) {
        long K = l.K(40);
        long K2 = l.K(48);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getThreeXlCompact500(m mVar, int i10) {
        long K = l.K(40);
        long K2 = l.K(48);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getThreeXlCompact600(m mVar, int i10) {
        long K = l.K(40);
        long K2 = l.K(48);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getThreeXlRegular400(m mVar, int i10) {
        long K = l.K(40);
        long K2 = l.K(56);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getThreeXlRegular500(m mVar, int i10) {
        long K = l.K(40);
        long K2 = l.K(56);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getThreeXlRegular600(m mVar, int i10) {
        long K = l.K(40);
        long K2 = l.K(56);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getTwoXlCompact400(m mVar, int i10) {
        long K = l.K(32);
        long K2 = l.K(40);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getTwoXlCompact500(m mVar, int i10) {
        long K = l.K(32);
        long K2 = l.K(40);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getTwoXlCompact600(m mVar, int i10) {
        long K = l.K(32);
        long K2 = l.K(40);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getTwoXlRegular400(m mVar, int i10) {
        long K = l.K(32);
        long K2 = l.K(48);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getTwoXlRegular500(m mVar, int i10) {
        long K = l.K(32);
        long K2 = l.K(48);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getTwoXlRegular600(m mVar, int i10) {
        long K = l.K(32);
        long K2 = l.K(48);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXlCompact400(m mVar, int i10) {
        long K = l.K(24);
        long K2 = l.K(32);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXlCompact500(m mVar, int i10) {
        long K = l.K(24);
        long K2 = l.K(32);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXlCompact600(m mVar, int i10) {
        long K = l.K(24);
        long K2 = l.K(32);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXlRegular400(m mVar, int i10) {
        long K = l.K(24);
        long K2 = l.K(38);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXlRegular500(m mVar, int i10) {
        long K = l.K(24);
        long K2 = l.K(38);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXlRegular600(m mVar, int i10) {
        long K = l.K(24);
        long K2 = l.K(38);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXsCompact400(m mVar, int i10) {
        long K = l.K(12);
        long K2 = l.K(14);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXsCompact500(m mVar, int i10) {
        long K = l.K(12);
        long K2 = l.K(14);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXsCompact600(m mVar, int i10) {
        long K = l.K(12);
        long K2 = l.K(14);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXsRegular400(m mVar, int i10) {
        long K = l.K(12);
        long K2 = l.K(16);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(400), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXsRegular500(m mVar, int i10) {
        long K = l.K(12);
        long K2 = l.K(16);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(500), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    public final y0 getXsRegular600(m mVar, int i10) {
        long K = l.K(12);
        long K2 = l.K(16);
        u access$getInter$p = EchoThemeTypographyKt.access$getInter$p();
        return new y0(i.c(EchoTheme.INSTANCE, mVar, 6, mVar, 0), K, new g0(600), access$getInter$p, 0L, 0, K2, e5.i.a(e5.i.f8281d), 15597528);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/echo/EchoThemeTypography$Companion;", "", "<init>", "()V", "INSTANCE", "Lio/elevenlabs/ui/echo/EchoThemeTypography;", "getINSTANCE", "()Lio/elevenlabs/ui/echo/EchoThemeTypography;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final EchoThemeTypography getINSTANCE() {
            return EchoThemeTypography.INSTANCE;
        }

        private Companion() {
        }
    }
}
