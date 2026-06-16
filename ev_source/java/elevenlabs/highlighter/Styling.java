package io.elevenlabs.highlighter;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsSpacings;
import io.elevenlabs.ui.theme.ElevenLabsTypography;
import io.elevenlabs.ui.theme.ElevenLabsTypographyKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.a1;
import p3.h0;
import s4.c0;
import s4.p0;
import s4.y0;
import tn.a0;
import w4.b0;
import w4.g0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020&0\u001f8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020)0\u001f8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u00103\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u0017\u00105\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010>\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0017\u0010D\u001a\u0002078\u0006¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\bE\u00100R\u0017\u0010F\u001a\u0002078\u0006¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u00100R\u0017\u0010H\u001a\u0002078\u0006¢\u0006\f\n\u0004\bH\u0010.\u001a\u0004\bI\u00100R\u0017\u0010J\u001a\u0002078\u0006¢\u0006\f\n\u0004\bJ\u0010.\u001a\u0004\bK\u00100¨\u0006L"}, d2 = {"Lio/elevenlabs/highlighter/Styling;", "", "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "config", "Lh5/c;", "density", "Lio/elevenlabs/ui/theme/ElevenLabsTypography;", "typo", "Lio/elevenlabs/ui/theme/ColorScheme;", "colors", "Lio/elevenlabs/ui/theme/ElevenLabsSpacings;", "spacings", "<init>", "(Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;Lh5/c;Lio/elevenlabs/ui/theme/ElevenLabsTypography;Lio/elevenlabs/ui/theme/ColorScheme;Lio/elevenlabs/ui/theme/ElevenLabsSpacings;)V", "Lio/elevenlabs/highlighter/ColorConfig;", "colorConfig", "Lio/elevenlabs/highlighter/ColorConfig;", "getColorConfig", "()Lio/elevenlabs/highlighter/ColorConfig;", "Lw4/u;", "font", "Lw4/u;", "getFont", "()Lw4/u;", "Lh5/o;", "baseSize", "J", "getBaseSize-XSAIIZE", "()J", "baseLineSize", "getBaseLineSize-XSAIIZE", "", "", "Ls4/y0;", "styles", "Ljava/util/Map;", "getStyles", "()Ljava/util/Map;", "Ls4/p0;", "spanStyles", "getSpanStyles", "Ls4/c0;", "paragraphStyles", "getParagraphStyles", "", "highlightRadius", TokenNames.F, "getHighlightRadius", "()F", "highlightHorizontalPadding", "getHighlightHorizontalPadding", "highlightVerticalPadding", "getHighlightVerticalPadding", "activeParagraphBoundExtraGrowth", "getActiveParagraphBoundExtraGrowth", "Lh5/f;", "paragraphVerticalSpacing", "Li3/t;", "textElementModifier", "Li3/t;", "getTextElementModifier", "()Li3/t;", "textStyle", "Ls4/y0;", "getTextStyle", "()Ls4/y0;", "listNumberOrBulletTextStyle", "getListNumberOrBulletTextStyle", "listIndentation", "getListIndentation-D9Ej5fM", "listItemSpacing", "getListItemSpacing-D9Ej5fM", "listVerticalSpacing", "getListVerticalSpacing-D9Ej5fM", "bulletSpacing", "getBulletSpacing-D9Ej5fM", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class Styling {
    public static final int $stable = 8;
    private final float activeParagraphBoundExtraGrowth;
    private final long baseLineSize;
    private final long baseSize;
    private final float bulletSpacing;
    private final ColorConfig colorConfig;
    private final w4.u font;
    private final float highlightHorizontalPadding;
    private final float highlightRadius;
    private final float highlightVerticalPadding;
    private final float listIndentation;
    private final float listItemSpacing;
    private final y0 listNumberOrBulletTextStyle;
    private final float listVerticalSpacing;
    private final Map<String, c0> paragraphStyles;
    private final float paragraphVerticalSpacing;
    private final Map<String, p0> spanStyles;
    private final Map<String, y0> styles;
    private final i3.t textElementModifier;
    private final y0 textStyle;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlayerTheme.values().length];
            try {
                iArr[PlayerTheme.SKY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerTheme.FALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerTheme.HIGHLIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerTheme.CLASSIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlayerFontFamily.values().length];
            try {
                iArr2[PlayerFontFamily.INTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PlayerFontFamily.LIBRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PlayerFontFamily.OPEN_DYSLEXIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Styling(UserConfig.PlayerConfig playerConfig, h5.c cVar, ElevenLabsTypography elevenLabsTypography, ColorScheme colorScheme, ElevenLabsSpacings elevenLabsSpacings) {
        ColorConfig colorConfig;
        ColorConfig colorConfig2;
        w4.u inter;
        playerConfig.getClass();
        cVar.getClass();
        elevenLabsTypography.getClass();
        colorScheme.getClass();
        elevenLabsSpacings.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[playerConfig.getTheme().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        boolean isDark = colorScheme.isDark();
                        if (!isDark) {
                            colorConfig2 = new ColorConfig(h0.e(4285788787L), h0.e(4293132253L), h0.e(4294965213L), h0.e(4293392315L), null);
                        } else if (isDark) {
                            colorConfig = new ColorConfig(h0.e(4281829943L), h0.e(4279709969L), h0.e(4283912507L), h0.e(4285626722L), null);
                            colorConfig2 = colorConfig;
                        } else {
                            c6.p();
                            throw null;
                        }
                    } else {
                        c6.p();
                        throw null;
                    }
                } else {
                    boolean isDark2 = colorScheme.isDark();
                    if (!isDark2) {
                        colorConfig2 = new ColorConfig(h0.e(4294105459L), h0.e(4294309365L), h0.e(4294965213L), h0.e(4294307283L), null);
                    } else if (isDark2) {
                        colorConfig = new ColorConfig(h0.e(4285356038L), h0.e(4282795590L), h0.e(4283912507L), h0.e(4286939505L), null);
                        colorConfig2 = colorConfig;
                    } else {
                        c6.p();
                        throw null;
                    }
                }
            } else {
                boolean isDark3 = colorScheme.isDark();
                if (!isDark3) {
                    colorConfig2 = new ColorConfig(h0.e(4294094963L), h0.e(4294961885L), h0.e(4294965213L), h0.e(4294965213L), null);
                } else if (isDark3) {
                    colorConfig = new ColorConfig(h0.e(4283116559L), h0.e(4284829506L), h0.e(4283912507L), h0.e(4288317294L), null);
                    colorConfig2 = colorConfig;
                } else {
                    c6.p();
                    throw null;
                }
            }
        } else {
            boolean isDark4 = colorScheme.isDark();
            if (!isDark4) {
                colorConfig2 = new ColorConfig(h0.e(4285783026L), h0.e(4292736511L), h0.e(4294965213L), h0.e(4292734429L), null);
            } else if (isDark4) {
                colorConfig = new ColorConfig(h0.e(4278797394L), h0.e(4282474347L), h0.e(4283912507L), h0.e(4284317562L), null);
                colorConfig2 = colorConfig;
            } else {
                c6.p();
                throw null;
            }
        }
        this.colorConfig = colorConfig2;
        int i11 = WhenMappings.$EnumSwitchMapping$1[playerConfig.getFontFamily().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    inter = ElevenLabsTypographyKt.getOpenDyslexic();
                } else {
                    c6.p();
                    throw null;
                }
            } else {
                inter = ElevenLabsTypographyKt.getLibre();
            }
        } else {
            inter = ElevenLabsTypographyKt.getInter();
        }
        this.font = inter;
        long K = ae.l.K((int) playerConfig.getFontSize());
        this.baseSize = K;
        ae.l.j(K);
        long j4 = K & 1095216660480L;
        long T = ae.l.T(h5.o.c(K) * 24.0f, j4);
        ae.l.j(T);
        long T2 = ae.l.T(h5.o.c(T) / 14.0f, T & 1095216660480L);
        this.baseLineSize = T2;
        w4.u uVar = inter;
        sn.k kVar = new sn.k("p", new y0(0L, K, null, uVar, 0L, 0, T2, null, 16646109));
        sn.k kVar2 = new sn.k("li", new y0(0L, K, null, uVar, 0L, 0, T2, null, 16646109));
        ae.l.j(K);
        long T3 = ae.l.T(h5.o.c(K) * 2.0f, j4);
        ae.l.j(K);
        sn.k kVar3 = new sn.k("h1", new y0(0L, T3, new g0(700), uVar, 0L, 0, ae.l.T(h5.o.c(K) * 3.0f, j4), null, 16646105));
        ae.l.j(K);
        long T4 = ae.l.T(h5.o.c(K) * 1.5f, j4);
        ae.l.j(K);
        sn.k kVar4 = new sn.k("h2", new y0(0L, T4, new g0(700), uVar, 0L, 0, ae.l.T(h5.o.c(K) * 3.0f, j4), null, 16646105));
        ae.l.j(K);
        long T5 = ae.l.T(h5.o.c(K) * 1.25f, j4);
        ae.l.j(K);
        sn.k kVar5 = new sn.k("h3", new y0(0L, T5, new g0(700), uVar, 0L, 0, ae.l.T(h5.o.c(K) * 3.0f, j4), null, 16646105));
        ae.l.j(K);
        long T6 = ae.l.T(h5.o.c(K) * 1.0f, j4);
        ae.l.j(K);
        sn.k kVar6 = new sn.k("h4", new y0(0L, T6, new g0(700), uVar, 0L, 0, ae.l.T(h5.o.c(K) * 1.5f, j4), null, 16646105));
        ae.l.j(K);
        long T7 = ae.l.T(h5.o.c(K) * 0.75f, j4);
        ae.l.j(K);
        sn.k kVar7 = new sn.k("h5", new y0(0L, T7, new g0(700), uVar, 0L, 0, ae.l.T(h5.o.c(K) * 1.5f, j4), null, 16646105));
        ae.l.j(K);
        long T8 = ae.l.T(h5.o.c(K) * 0.75f, j4);
        ae.l.j(K);
        Map<String, y0> J = a0.J(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, new sn.k("h6", new y0(0L, T8, new g0(700), uVar, 0L, 0, ae.l.T(h5.o.c(K) * 1.5f, j4), null, 16646105)));
        this.styles = J;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0.H(J.size()));
        Iterator<T> it = J.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((y0) entry.getValue()).f31174a);
        }
        g0 g0Var = g0.B0;
        sn.k kVar8 = new sn.k("b", new p0(0L, 0L, g0Var, (w4.a0) null, (b0) null, (w4.u) null, (String) null, 0L, (e5.a) null, (e5.p) null, (a5.c) null, 0L, (e5.l) null, (a1) null, 65531));
        sn.k kVar9 = new sn.k("strong", new p0(0L, 0L, g0Var, (w4.a0) null, (b0) null, (w4.u) null, (String) null, 0L, (e5.a) null, (e5.p) null, (a5.c) null, 0L, (e5.l) null, (a1) null, 65531));
        sn.k kVar10 = new sn.k("i", new p0(0L, 0L, (g0) null, new w4.a0(1), (b0) null, (w4.u) null, (String) null, 0L, (e5.a) null, (e5.p) null, (a5.c) null, 0L, (e5.l) null, (a1) null, 65527));
        e5.l lVar = e5.l.f8290c;
        this.spanStyles = a0.N(linkedHashMap, a0.J(kVar8, kVar9, kVar10, new sn.k("u", new p0(0L, 0L, (g0) null, (w4.a0) null, (b0) null, (w4.u) null, (String) null, 0L, (e5.a) null, (e5.p) null, (a5.c) null, 0L, lVar, (a1) null, 61439)), new sn.k("a", new p0(0L, 0L, (g0) null, (w4.a0) null, (b0) null, (w4.u) null, (String) null, 0L, (e5.a) null, (e5.p) null, (a5.c) null, 0L, lVar, (a1) null, 61439))));
        Map<String, y0> map = this.styles;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a0.H(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(entry2.getKey(), ((y0) entry2.getValue()).f31175b);
        }
        this.paragraphStyles = linkedHashMap2;
        this.highlightRadius = cVar.d0(5);
        this.highlightHorizontalPadding = cVar.d0(elevenLabsSpacings.m2350getX1D9Ej5fM());
        this.highlightVerticalPadding = -cVar.d0(1);
        this.activeParagraphBoundExtraGrowth = cVar.d0(4);
        float D = cVar.D(this.baseSize) * elevenLabsSpacings.m2356getX4D9Ej5fM() * 0.01f;
        this.paragraphVerticalSpacing = D;
        this.textElementModifier = r1.d.G(i3.q.f13017a, t2.u.P, D, 1);
        y0 a10 = y0.a(elevenLabsTypography.getBody(), 0L, 0L, null, null, null, 0L, 0, 0L, null, new e5.i(e5.f.f8275b, 0, 0), 15728639);
        this.textStyle = a10;
        this.listNumberOrBulletTextStyle = y0.a(a10, 0L, this.baseSize, null, this.font, null, 0L, 6, this.baseLineSize, null, null, 16613341);
        this.listIndentation = cVar.T(h5.o.c(this.baseSize) * 6.5f);
        long j10 = this.baseLineSize;
        ae.l.j(j10);
        this.listItemSpacing = cVar.i(ae.l.T(h5.o.c(j10) * 0.2f, j10 & 1095216660480L));
        this.listVerticalSpacing = D;
        this.bulletSpacing = elevenLabsSpacings.m2353getX2D9Ej5fM();
    }

    public final float getActiveParagraphBoundExtraGrowth() {
        return this.activeParagraphBoundExtraGrowth;
    }

    /* renamed from: getBaseLineSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getBaseLineSize() {
        return this.baseLineSize;
    }

    /* renamed from: getBaseSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getBaseSize() {
        return this.baseSize;
    }

    /* renamed from: getBulletSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBulletSpacing() {
        return this.bulletSpacing;
    }

    public final ColorConfig getColorConfig() {
        return this.colorConfig;
    }

    public final w4.u getFont() {
        return this.font;
    }

    public final float getHighlightHorizontalPadding() {
        return this.highlightHorizontalPadding;
    }

    public final float getHighlightRadius() {
        return this.highlightRadius;
    }

    public final float getHighlightVerticalPadding() {
        return this.highlightVerticalPadding;
    }

    /* renamed from: getListIndentation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getListIndentation() {
        return this.listIndentation;
    }

    /* renamed from: getListItemSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getListItemSpacing() {
        return this.listItemSpacing;
    }

    public final y0 getListNumberOrBulletTextStyle() {
        return this.listNumberOrBulletTextStyle;
    }

    /* renamed from: getListVerticalSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getListVerticalSpacing() {
        return this.listVerticalSpacing;
    }

    public final Map<String, c0> getParagraphStyles() {
        return this.paragraphStyles;
    }

    public final Map<String, p0> getSpanStyles() {
        return this.spanStyles;
    }

    public final Map<String, y0> getStyles() {
        return this.styles;
    }

    public final i3.t getTextElementModifier() {
        return this.textElementModifier;
    }

    public final y0 getTextStyle() {
        return this.textStyle;
    }
}
