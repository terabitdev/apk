package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z10, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z10;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public static double enableLightForeground(double d10) {
        if (tonePrefersLightForeground(d10) && !toneAllowsLightForeground(d10)) {
            return 49.0d;
        }
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double foregroundTone(double d10, double d11) {
        boolean z10;
        double lighterUnsafe = Contrast.lighterUnsafe(d10, d11);
        double darkerUnsafe = Contrast.darkerUnsafe(d10, d11);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d10);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d10);
        if (tonePrefersLightForeground(d10)) {
            if (Math.abs(ratioOfTones - ratioOfTones2) < 0.1d && ratioOfTones < d11 && ratioOfTones2 < d11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ratioOfTones >= d11 || ratioOfTones >= ratioOfTones2 || z10) {
                return lighterUnsafe;
            }
            return darkerUnsafe;
        }
        if (ratioOfTones2 >= d11 || ratioOfTones2 >= ratioOfTones) {
        }
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String str, int i) {
        return fromPalette(str, new a(TonalPalette.fromInt(i), 0), new a(Hct.fromInt(i), 1));
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public static boolean toneAllowsLightForeground(double d10) {
        if (Math.round(d10) <= 49) {
            return true;
        }
        return false;
    }

    public static boolean tonePrefersLightForeground(double d10) {
        if (Math.round(d10) < 60) {
            return true;
        }
        return false;
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme) {
        int i = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = this.palette.apply(dynamicScheme).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(@NonNull DynamicScheme dynamicScheme) {
        boolean z10;
        double d10;
        DynamicColor dynamicColor;
        DynamicColor dynamicColor2;
        double d11;
        double d12;
        double min;
        boolean z11 = false;
        if (dynamicScheme.contrastLevel < 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        Function<DynamicScheme, ToneDeltaPair> function = this.toneDeltaPair;
        if (function != null) {
            ToneDeltaPair apply = function.apply(dynamicScheme);
            DynamicColor roleA = apply.getRoleA();
            DynamicColor roleB = apply.getRoleB();
            double delta = apply.getDelta();
            TonePolarity polarity = apply.getPolarity();
            boolean stayTogether = apply.getStayTogether();
            double tone = this.background.apply(dynamicScheme).getTone(dynamicScheme);
            if (polarity == TonePolarity.NEARER || ((polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark))) {
                z11 = true;
            }
            if (z11) {
                dynamicColor = roleA;
            } else {
                dynamicColor = roleB;
            }
            if (z11) {
                dynamicColor2 = roleB;
            } else {
                dynamicColor2 = roleA;
            }
            boolean equals = this.name.equals(dynamicColor.name);
            if (dynamicScheme.isDark) {
                d11 = 1.0d;
            } else {
                d11 = -1.0d;
            }
            double d13 = dynamicColor.contrastCurve.get(dynamicScheme.contrastLevel);
            double d14 = dynamicColor2.contrastCurve.get(dynamicScheme.contrastLevel);
            double doubleValue = dynamicColor.tone.apply(dynamicScheme).doubleValue();
            if (Contrast.ratioOfTones(tone, doubleValue) < d13) {
                doubleValue = foregroundTone(tone, d13);
            }
            boolean z12 = z10;
            double doubleValue2 = dynamicColor2.tone.apply(dynamicScheme).doubleValue();
            if (Contrast.ratioOfTones(tone, doubleValue2) < d14) {
                doubleValue2 = foregroundTone(tone, d14);
            }
            if (z12) {
                doubleValue = foregroundTone(tone, d13);
                doubleValue2 = foregroundTone(tone, d14);
            }
            if ((doubleValue2 - doubleValue) * d11 < delta) {
                double d15 = delta * d11;
                double clampDouble = MathUtils.clampDouble(0.0d, 100.0d, doubleValue + d15);
                if ((clampDouble - doubleValue) * d11 < delta) {
                    doubleValue = MathUtils.clampDouble(0.0d, 100.0d, clampDouble - d15);
                }
                doubleValue2 = clampDouble;
            }
            if (50.0d <= doubleValue && doubleValue < 60.0d) {
                if (d11 > 0.0d) {
                    d12 = Math.max(doubleValue2, (delta * d11) + 60.0d);
                    doubleValue = 60.0d;
                } else {
                    min = Math.min(doubleValue2, (delta * d11) + 49.0d);
                    d12 = min;
                    doubleValue = 49.0d;
                }
            } else if (50.0d <= doubleValue2 && doubleValue2 < 60.0d) {
                if (stayTogether) {
                    if (d11 > 0.0d) {
                        d12 = Math.max(doubleValue2, (delta * d11) + 60.0d);
                        doubleValue = 60.0d;
                    } else {
                        min = Math.min(doubleValue2, (delta * d11) + 49.0d);
                        d12 = min;
                        doubleValue = 49.0d;
                    }
                } else if (d11 > 0.0d) {
                    d12 = 60.0d;
                } else {
                    d12 = 49.0d;
                }
            } else {
                d12 = doubleValue2;
            }
            if (equals) {
                return doubleValue;
            }
            return d12;
        }
        boolean z13 = z10;
        double doubleValue3 = this.tone.apply(dynamicScheme).doubleValue();
        Function<DynamicScheme, DynamicColor> function2 = this.background;
        if (function2 == null) {
            return doubleValue3;
        }
        double tone2 = function2.apply(dynamicScheme).getTone(dynamicScheme);
        double d16 = this.contrastCurve.get(dynamicScheme.contrastLevel);
        if (Contrast.ratioOfTones(tone2, doubleValue3) < d16) {
            doubleValue3 = foregroundTone(tone2, d16);
        }
        if (z13) {
            doubleValue3 = foregroundTone(tone2, d16);
        }
        if (this.isBackground && 50.0d <= doubleValue3 && doubleValue3 < 60.0d) {
            d10 = 49.0d;
            if (Contrast.ratioOfTones(49.0d, tone2) < d16) {
                d10 = 60.0d;
            }
        } else {
            d10 = doubleValue3;
        }
        if (this.secondBackground != null) {
            double tone3 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
            double tone4 = this.secondBackground.apply(dynamicScheme).getTone(dynamicScheme);
            double max = Math.max(tone3, tone4);
            double min2 = Math.min(tone3, tone4);
            if (Contrast.ratioOfTones(max, d10) < d16 || Contrast.ratioOfTones(min2, d10) < d16) {
                double lighter = Contrast.lighter(max, d16);
                double darker = Contrast.darker(min2, d16);
                ArrayList arrayList = new ArrayList();
                if (lighter != -1.0d) {
                    arrayList.add(Double.valueOf(lighter));
                }
                if (darker != -1.0d) {
                    arrayList.add(Double.valueOf(darker));
                }
                if (!tonePrefersLightForeground(tone3) && !tonePrefersLightForeground(tone4)) {
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (darker == -1.0d) {
                        return 0.0d;
                    }
                    return darker;
                }
                if (lighter == -1.0d) {
                    return 100.0d;
                }
                return lighter;
            }
        }
        return d10;
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z10) {
        return new DynamicColor(str, function, function2, z10, null, null, null, null);
    }

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z10, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5, @Nullable Function<DynamicScheme, Double> function6) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z10;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }
}
