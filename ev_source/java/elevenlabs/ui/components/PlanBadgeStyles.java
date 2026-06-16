package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001DB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ~\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b\u0007\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001aR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b>\u0010\u001aR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b?\u0010\u001aR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b@\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bA\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bB\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bC\u0010\u001a¨\u0006E"}, d2 = {"Lio/elevenlabs/ui/components/PlanBadgeStyles;", "", "Lp3/b1;", "shape", "Ls4/y0;", "textStyle", "", "isDark", "Lp3/x;", "backgroundPaidLight", "backgroundPaidDark", "backgroundFreeLight", "backgroundFreeDark", "textPaidLight", "textPaidDark", "textFreeLight", "textFreeDark", "<init>", "(Lp3/b1;Ls4/y0;ZJJJJJJJJLkotlin/jvm/internal/f;)V", "component1", "()Lp3/b1;", "component2", "()Ls4/y0;", "component3", "()Z", "component4-0d7_KjU", "()J", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "component9-0d7_KjU", "component9", "component10-0d7_KjU", "component10", "component11-0d7_KjU", "component11", "copy-fRusVZw", "(Lp3/b1;Ls4/y0;ZJJJJJJJJ)Lio/elevenlabs/ui/components/PlanBadgeStyles;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lp3/b1;", "getShape", "Ls4/y0;", "getTextStyle", "Z", "J", "getBackgroundPaidLight-0d7_KjU", "getBackgroundPaidDark-0d7_KjU", "getBackgroundFreeLight-0d7_KjU", "getBackgroundFreeDark-0d7_KjU", "getTextPaidLight-0d7_KjU", "getTextPaidDark-0d7_KjU", "getTextFreeLight-0d7_KjU", "getTextFreeDark-0d7_KjU", "Companion", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PlanBadgeStyles {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long backgroundFreeDark;
    private final long backgroundFreeLight;
    private final long backgroundPaidDark;
    private final long backgroundPaidLight;
    private final boolean isDark;
    private final p3.b1 shape;
    private final long textFreeDark;
    private final long textFreeLight;
    private final long textPaidDark;
    private final long textPaidLight;
    private final s4.y0 textStyle;

    private PlanBadgeStyles(p3.b1 b1Var, s4.y0 y0Var, boolean z6, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        b1Var.getClass();
        y0Var.getClass();
        this.shape = b1Var;
        this.textStyle = y0Var;
        this.isDark = z6;
        this.backgroundPaidLight = j4;
        this.backgroundPaidDark = j10;
        this.backgroundFreeLight = j11;
        this.backgroundFreeDark = j12;
        this.textPaidLight = j13;
        this.textPaidDark = j14;
        this.textFreeLight = j15;
        this.textFreeDark = j16;
    }

    /* renamed from: copy-fRusVZw$default, reason: not valid java name */
    public static /* synthetic */ PlanBadgeStyles m1851copyfRusVZw$default(PlanBadgeStyles planBadgeStyles, p3.b1 b1Var, s4.y0 y0Var, boolean z6, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i10, Object obj) {
        p3.b1 b1Var2;
        s4.y0 y0Var2;
        boolean z10;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        if ((i10 & 1) != 0) {
            b1Var2 = planBadgeStyles.shape;
        } else {
            b1Var2 = b1Var;
        }
        if ((i10 & 2) != 0) {
            y0Var2 = planBadgeStyles.textStyle;
        } else {
            y0Var2 = y0Var;
        }
        if ((i10 & 4) != 0) {
            z10 = planBadgeStyles.isDark;
        } else {
            z10 = z6;
        }
        if ((i10 & 8) != 0) {
            j17 = planBadgeStyles.backgroundPaidLight;
        } else {
            j17 = j4;
        }
        if ((i10 & 16) != 0) {
            j18 = planBadgeStyles.backgroundPaidDark;
        } else {
            j18 = j10;
        }
        if ((i10 & 32) != 0) {
            j19 = planBadgeStyles.backgroundFreeLight;
        } else {
            j19 = j11;
        }
        if ((i10 & 64) != 0) {
            j20 = planBadgeStyles.backgroundFreeDark;
        } else {
            j20 = j12;
        }
        if ((i10 & 128) != 0) {
            j21 = planBadgeStyles.textPaidLight;
        } else {
            j21 = j13;
        }
        p3.b1 b1Var3 = b1Var2;
        s4.y0 y0Var3 = y0Var2;
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            j22 = planBadgeStyles.textPaidDark;
        } else {
            j22 = j14;
        }
        long j26 = j22;
        if ((i10 & 512) != 0) {
            j23 = planBadgeStyles.textFreeLight;
        } else {
            j23 = j15;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            j25 = j23;
            j24 = planBadgeStyles.textFreeDark;
        } else {
            j24 = j16;
            j25 = j23;
        }
        return planBadgeStyles.m1860copyfRusVZw(b1Var3, y0Var3, z10, j17, j18, j19, j20, j21, j26, j25, j24);
    }

    /* renamed from: component1, reason: from getter */
    public final p3.b1 getShape() {
        return this.shape;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextFreeLight() {
        return this.textFreeLight;
    }

    /* renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextFreeDark() {
        return this.textFreeDark;
    }

    /* renamed from: component2, reason: from getter */
    public final s4.y0 getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDark() {
        return this.isDark;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundPaidLight() {
        return this.backgroundPaidLight;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundPaidDark() {
        return this.backgroundPaidDark;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundFreeLight() {
        return this.backgroundFreeLight;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundFreeDark() {
        return this.backgroundFreeDark;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextPaidLight() {
        return this.textPaidLight;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextPaidDark() {
        return this.textPaidDark;
    }

    /* renamed from: copy-fRusVZw, reason: not valid java name */
    public final PlanBadgeStyles m1860copyfRusVZw(p3.b1 shape, s4.y0 textStyle, boolean isDark, long backgroundPaidLight, long backgroundPaidDark, long backgroundFreeLight, long backgroundFreeDark, long textPaidLight, long textPaidDark, long textFreeLight, long textFreeDark) {
        shape.getClass();
        textStyle.getClass();
        return new PlanBadgeStyles(shape, textStyle, isDark, backgroundPaidLight, backgroundPaidDark, backgroundFreeLight, backgroundFreeDark, textPaidLight, textPaidDark, textFreeLight, textFreeDark, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanBadgeStyles)) {
            return false;
        }
        PlanBadgeStyles planBadgeStyles = (PlanBadgeStyles) other;
        if (kotlin.jvm.internal.m.c(this.shape, planBadgeStyles.shape) && kotlin.jvm.internal.m.c(this.textStyle, planBadgeStyles.textStyle) && this.isDark == planBadgeStyles.isDark && p3.x.c(this.backgroundPaidLight, planBadgeStyles.backgroundPaidLight) && p3.x.c(this.backgroundPaidDark, planBadgeStyles.backgroundPaidDark) && p3.x.c(this.backgroundFreeLight, planBadgeStyles.backgroundFreeLight) && p3.x.c(this.backgroundFreeDark, planBadgeStyles.backgroundFreeDark) && p3.x.c(this.textPaidLight, planBadgeStyles.textPaidLight) && p3.x.c(this.textPaidDark, planBadgeStyles.textPaidDark) && p3.x.c(this.textFreeLight, planBadgeStyles.textFreeLight) && p3.x.c(this.textFreeDark, planBadgeStyles.textFreeDark)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBackgroundFreeDark-0d7_KjU, reason: not valid java name */
    public final long m1861getBackgroundFreeDark0d7_KjU() {
        return this.backgroundFreeDark;
    }

    /* renamed from: getBackgroundFreeLight-0d7_KjU, reason: not valid java name */
    public final long m1862getBackgroundFreeLight0d7_KjU() {
        return this.backgroundFreeLight;
    }

    /* renamed from: getBackgroundPaidDark-0d7_KjU, reason: not valid java name */
    public final long m1863getBackgroundPaidDark0d7_KjU() {
        return this.backgroundPaidDark;
    }

    /* renamed from: getBackgroundPaidLight-0d7_KjU, reason: not valid java name */
    public final long m1864getBackgroundPaidLight0d7_KjU() {
        return this.backgroundPaidLight;
    }

    public final p3.b1 getShape() {
        return this.shape;
    }

    /* renamed from: getTextFreeDark-0d7_KjU, reason: not valid java name */
    public final long m1865getTextFreeDark0d7_KjU() {
        return this.textFreeDark;
    }

    /* renamed from: getTextFreeLight-0d7_KjU, reason: not valid java name */
    public final long m1866getTextFreeLight0d7_KjU() {
        return this.textFreeLight;
    }

    /* renamed from: getTextPaidDark-0d7_KjU, reason: not valid java name */
    public final long m1867getTextPaidDark0d7_KjU() {
        return this.textPaidDark;
    }

    /* renamed from: getTextPaidLight-0d7_KjU, reason: not valid java name */
    public final long m1868getTextPaidLight0d7_KjU() {
        return this.textPaidLight;
    }

    public final s4.y0 getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int f10 = com.google.android.gms.internal.play_billing.b.f(j0.c.d(this.shape.hashCode() * 31, 31, this.textStyle), 31, this.isDark);
        long j4 = this.backgroundPaidLight;
        int i10 = p3.x.f26439n;
        return Long.hashCode(this.textFreeDark) + com.google.android.gms.internal.play_billing.b.g(this.textFreeLight, com.google.android.gms.internal.play_billing.b.g(this.textPaidDark, com.google.android.gms.internal.play_billing.b.g(this.textPaidLight, com.google.android.gms.internal.play_billing.b.g(this.backgroundFreeDark, com.google.android.gms.internal.play_billing.b.g(this.backgroundFreeLight, com.google.android.gms.internal.play_billing.b.g(this.backgroundPaidDark, com.google.android.gms.internal.play_billing.b.g(j4, f10, 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isDark() {
        return this.isDark;
    }

    public String toString() {
        p3.b1 b1Var = this.shape;
        s4.y0 y0Var = this.textStyle;
        boolean z6 = this.isDark;
        String i10 = p3.x.i(this.backgroundPaidLight);
        String i11 = p3.x.i(this.backgroundPaidDark);
        String i12 = p3.x.i(this.backgroundFreeLight);
        String i13 = p3.x.i(this.backgroundFreeDark);
        String i14 = p3.x.i(this.textPaidLight);
        String i15 = p3.x.i(this.textPaidDark);
        String i16 = p3.x.i(this.textFreeLight);
        String i17 = p3.x.i(this.textFreeDark);
        StringBuilder sb = new StringBuilder("PlanBadgeStyles(shape=");
        sb.append(b1Var);
        sb.append(", textStyle=");
        sb.append(y0Var);
        sb.append(", isDark=");
        defpackage.f.z(sb, z6, ", backgroundPaidLight=", i10, ", backgroundPaidDark=");
        defpackage.f.x(sb, i11, ", backgroundFreeLight=", i12, ", backgroundFreeDark=");
        defpackage.f.x(sb, i13, ", textPaidLight=", i14, ", textPaidDark=");
        defpackage.f.x(sb, i15, ", textFreeLight=", i16, ", textFreeDark=");
        return defpackage.f.l(i17, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/components/PlanBadgeStyles$Companion;", "", "<init>", "()V", "Lio/elevenlabs/ui/components/PlanBadgeStyles;", "defaults", "(Lu2/m;I)Lio/elevenlabs/ui/components/PlanBadgeStyles;", "echo", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final PlanBadgeStyles defaults(u2.m mVar, int i10) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            p3.b1 sm = elevenLabsTheme.getShapes(mVar, 6).getSm();
            s4.y0 subtitleSmall700 = elevenLabsTheme.getTypo(mVar, 6).getSubtitleSmall700();
            boolean isDark = elevenLabsTheme.getColors(mVar, 6).getIsDark();
            ReaderColors readerColors = ReaderColors.INSTANCE;
            return new PlanBadgeStyles(sm, subtitleSmall700, isDark, readerColors.m2366getBlack0d7_KjU(), readerColors.m2466getWhite0d7_KjU(), readerColors.m2411getNeutral1000d7_KjU(), readerColors.m2466getWhite0d7_KjU(), readerColors.m2466getWhite0d7_KjU(), readerColors.m2366getBlack0d7_KjU(), readerColors.m2416getNeutral5000d7_KjU(), readerColors.m2413getNeutral3000d7_KjU(), null);
        }

        public final PlanBadgeStyles echo(u2.m mVar, int i10) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            return new PlanBadgeStyles(echoTheme.getShapes(mVar, 6).getSm(mVar, 0), s4.y0.a(echoTheme.getTypography(mVar, 6).getXsCompact600(mVar, 0), 0L, 0L, new w4.g0(700), null, null, 0L, 0, ae.l.K(20), null, new e5.i(e5.f.f8275b, 17, 0), 15597563), echoTheme.isDarkMode(mVar, 6), echoTheme.getColors(mVar, 6).getFill().getPrimary(mVar, 0), echoTheme.getColors(mVar, 6).getFill().getPrimary(mVar, 0), echoTheme.getColors(mVar, 6).getFill().getNonary(mVar, 0), echoTheme.getColors(mVar, 6).getFill().getNonary(mVar, 0), echoTheme.getColors(mVar, 6).getFill().getOnFillPrimary(mVar, 0), echoTheme.getColors(mVar, 6).getFill().getOnFillPrimary(mVar, 0), echoTheme.getColors(mVar, 6).getFill().getTertiary(mVar, 0), echoTheme.getColors(mVar, 6).getFill().getTertiary(mVar, 0), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlanBadgeStyles(p3.b1 b1Var, s4.y0 y0Var, boolean z6, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, kotlin.jvm.internal.f fVar) {
        this(b1Var, y0Var, z6, j4, j10, j11, j12, j13, j14, j15, j16);
    }
}
