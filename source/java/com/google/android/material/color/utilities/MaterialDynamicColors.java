package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class MaterialDynamicColors {
    private final boolean isExtendedFidelity;

    public MaterialDynamicColors() {
        this.isExtendedFidelity = false;
    }

    public static double findDesiredChromaByTone(double d10, double d11, double d12, boolean z10) {
        double d13;
        Hct from = Hct.from(d10, d11, d12);
        if (from.getChroma() < d11) {
            double chroma = from.getChroma();
            while (from.getChroma() < d11) {
                if (z10) {
                    d13 = -1.0d;
                } else {
                    d13 = 1.0d;
                }
                d12 += d13;
                Hct from2 = Hct.from(d10, d11, d12);
                if (chroma > from2.getChroma() || Math.abs(from2.getChroma() - d11) < 0.4d) {
                    return d12;
                }
                if (Math.abs(from2.getChroma() - d11) < Math.abs(from.getChroma() - d11)) {
                    from = from2;
                }
                chroma = Math.max(chroma, from2.getChroma());
            }
        }
        return d12;
    }

    private boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant;
        Variant variant2;
        if ((this.isExtendedFidelity && (variant2 = dynamicScheme.variant) != Variant.MONOCHROME && variant2 != Variant.NEUTRAL) || (variant = dynamicScheme.variant) == Variant.FIDELITY || variant == Variant.CONTENT) {
            return true;
        }
        return false;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        if (dynamicScheme.variant == Variant.MONOCHROME) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 6.0d;
        } else {
            d10 = 98.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlActivated$146(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 30.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$150(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 100.0d;
        } else {
            d10 = 0.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$151(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 0.2d;
        } else {
            d10 = 0.12d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlNormal$148(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 80.0d;
        } else {
            d10 = 30.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$error$92(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 80.0d;
        } else {
            d10 = 40.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$error$93(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$errorContainer$98(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 30.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$errorContainer$99(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(errorContainer(), error(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseOnSurface$40(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 20.0d;
        } else {
            d10 = 95.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inverseOnSurface$41(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inversePrimary$65(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 40.0d;
        } else {
            d10 = 80.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inversePrimary$66(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseSurface$38(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 90.0d;
        } else {
            d10 = 20.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 90.0d;
        } else {
            d10 = 10.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return background();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onError$95(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 20.0d;
        } else {
            d10 = 100.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onError$96(DynamicScheme dynamicScheme) {
        return error();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onErrorContainer$101(DynamicScheme dynamicScheme) {
        double d10 = 90.0d;
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d10 = 10.0d;
            }
            return Double.valueOf(d10);
        }
        if (!dynamicScheme.isDark) {
            d10 = 30.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onErrorContainer$102(DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimary$56(DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 10.0d;
            } else {
                d11 = 90.0d;
            }
            return Double.valueOf(d11);
        }
        if (dynamicScheme.isDark) {
            d10 = 20.0d;
        } else {
            d10 = 100.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimary$57(DynamicScheme dynamicScheme) {
        return primary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onPrimaryContainer$62(DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.foregroundTone(primaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 0.0d;
            } else {
                d11 = 100.0d;
            }
            return Double.valueOf(d11);
        }
        if (dynamicScheme.isDark) {
            d10 = 90.0d;
        } else {
            d10 = 30.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryContainer$63(DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixed$110(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 100.0d;
        } else {
            d10 = 10.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$111(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$112(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixedVariant$114(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 90.0d;
        } else {
            d10 = 30.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$115(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$116(DynamicScheme dynamicScheme) {
        return primaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondary$71(DynamicScheme dynamicScheme) {
        double d10 = 100.0d;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d10 = 10.0d;
            }
            return Double.valueOf(d10);
        }
        if (dynamicScheme.isDark) {
            d10 = 20.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondary$72(DynamicScheme dynamicScheme) {
        return secondary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onSecondaryContainer$77(DynamicScheme dynamicScheme) {
        double d10 = 90.0d;
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d10 = 10.0d;
            }
            return Double.valueOf(d10);
        }
        if (!isFidelity(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d10 = 30.0d;
            }
            return Double.valueOf(d10);
        }
        return Double.valueOf(DynamicColor.foregroundTone(secondaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryContainer$78(DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixed$124(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$125(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$126(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixedVariant$128(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 25.0d;
        } else {
            d10 = 30.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$130(DynamicScheme dynamicScheme) {
        return secondaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurface$32(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 90.0d;
        } else {
            d10 = 10.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurfaceVariant$36(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 80.0d;
        } else {
            d10 = 30.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiary$83(DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 10.0d;
            } else {
                d11 = 90.0d;
            }
            return Double.valueOf(d11);
        }
        if (dynamicScheme.isDark) {
            d10 = 20.0d;
        } else {
            d10 = 100.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiary$84(DynamicScheme dynamicScheme) {
        return tertiary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onTertiaryContainer$89(DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 0.0d;
            } else {
                d11 = 100.0d;
            }
            return Double.valueOf(d11);
        }
        if (!isFidelity(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d10 = 90.0d;
            } else {
                d10 = 30.0d;
            }
            return Double.valueOf(d10);
        }
        return Double.valueOf(DynamicColor.foregroundTone(tertiaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryContainer$90(DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixed$138(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 100.0d;
        } else {
            d10 = 10.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$139(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$140(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixedVariant$142(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 90.0d;
        } else {
            d10 = 30.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$143(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$144(DynamicScheme dynamicScheme) {
        return tertiaryFixed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outline$43(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 60.0d;
        } else {
            d10 = 50.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outlineVariant$45(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 30.0d;
        } else {
            d10 = 80.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primary$53(DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 100.0d;
            } else {
                d11 = 0.0d;
            }
            return Double.valueOf(d11);
        }
        if (dynamicScheme.isDark) {
            d10 = 80.0d;
        } else {
            d10 = 40.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primary$54(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$primaryContainer$59(DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.sourceColorHct.getTone());
        }
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 85.0d;
            } else {
                d11 = 25.0d;
            }
            return Double.valueOf(d11);
        }
        if (dynamicScheme.isDark) {
            d10 = 30.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryContainer$60(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryContainer(), primary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixed$104(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 40.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixed$105(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixedDim$107(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 30.0d;
        } else {
            d10 = 80.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$primaryFixedDim$108(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(primaryFixed(), primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$scrim$49(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondary$68(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 80.0d;
        } else {
            d10 = 40.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondary$69(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$secondaryContainer$74(DynamicScheme dynamicScheme) {
        double d10;
        double d11 = 30.0d;
        if (dynamicScheme.isDark) {
            d10 = 30.0d;
        } else {
            d10 = 90.0d;
        }
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d11 = 85.0d;
            }
            return Double.valueOf(d11);
        }
        if (!isFidelity(dynamicScheme)) {
            return Double.valueOf(d10);
        }
        return Double.valueOf(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d10, !dynamicScheme.isDark));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryContainer$75(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryContainer(), secondary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixed$118(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 80.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixed$119(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixedDim$121(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 70.0d;
        } else {
            d10 = 80.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$secondaryFixedDim$122(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(secondaryFixed(), secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.secondaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$shadow$47(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 6.0d;
        } else {
            d10 = 98.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = new ContrastCurve(24.0d, 24.0d, 29.0d, 34.0d).get(dynamicScheme.contrastLevel);
        } else {
            d10 = 98.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainer$26(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = new ContrastCurve(12.0d, 12.0d, 16.0d, 20.0d).get(dynamicScheme.contrastLevel);
        } else {
            d10 = new ContrastCurve(94.0d, 94.0d, 92.0d, 90.0d).get(dynamicScheme.contrastLevel);
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHigh$28(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = new ContrastCurve(17.0d, 17.0d, 21.0d, 25.0d).get(dynamicScheme.contrastLevel);
        } else {
            d10 = new ContrastCurve(92.0d, 92.0d, 88.0d, 85.0d).get(dynamicScheme.contrastLevel);
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHighest$30(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = new ContrastCurve(22.0d, 22.0d, 26.0d, 30.0d).get(dynamicScheme.contrastLevel);
        } else {
            d10 = new ContrastCurve(90.0d, 90.0d, 84.0d, 80.0d).get(dynamicScheme.contrastLevel);
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLow$24(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = new ContrastCurve(10.0d, 10.0d, 11.0d, 12.0d).get(dynamicScheme.contrastLevel);
        } else {
            d10 = new ContrastCurve(96.0d, 96.0d, 96.0d, 95.0d).get(dynamicScheme.contrastLevel);
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLowest$22(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = new ContrastCurve(4.0d, 4.0d, 2.0d, 0.0d).get(dynamicScheme.contrastLevel);
        } else {
            d10 = 100.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceDim$18(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 6.0d;
        } else {
            d10 = new ContrastCurve(87.0d, 87.0d, 80.0d, 75.0d).get(dynamicScheme.contrastLevel);
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceTint$51(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 80.0d;
        } else {
            d10 = 40.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceVariant$34(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 30.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiary$80(DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 90.0d;
            } else {
                d11 = 25.0d;
            }
            return Double.valueOf(d11);
        }
        if (dynamicScheme.isDark) {
            d10 = 80.0d;
        } else {
            d10 = 40.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiary$81(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$tertiaryContainer$86(DynamicScheme dynamicScheme) {
        double d10;
        double d11;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d11 = 60.0d;
            } else {
                d11 = 49.0d;
            }
            return Double.valueOf(d11);
        }
        if (!isFidelity(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d10 = 30.0d;
            } else {
                d10 = 90.0d;
            }
            return Double.valueOf(d10);
        }
        return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone())).getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryContainer$87(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryContainer(), tertiary(), 10.0d, TonePolarity.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixed$132(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 40.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixed$133(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixedDim$135(DynamicScheme dynamicScheme) {
        double d10;
        if (isMonochrome(dynamicScheme)) {
            d10 = 30.0d;
        } else {
            d10 = 80.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaPair lambda$tertiaryFixedDim$136(DynamicScheme dynamicScheme) {
        return new ToneDeltaPair(tertiaryFixed(), tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textHintInverse$161(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 10.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverse$153(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 10.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$157(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 10.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$155(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 30.0d;
        } else {
            d10 = 80.0d;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$159(DynamicScheme dynamicScheme) {
        double d10;
        if (dynamicScheme.isDark) {
            d10 = 10.0d;
        } else {
            d10 = 90.0d;
        }
        return Double.valueOf(d10);
    }

    @NonNull
    public DynamicColor background() {
        return new DynamicColor("background", new d(14), new d(15), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette("control_activated", new c(22), new c(23));
    }

    @NonNull
    public DynamicColor controlHighlight() {
        return new DynamicColor("control_highlight", new d(9), new d(10), false, null, null, null, null, new d(11));
    }

    @NonNull
    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette("control_normal", new c(12), new c(19));
    }

    @NonNull
    public DynamicColor error() {
        return new DynamicColor("error", new a4.a(22), new a4.a(24), true, new f(this, 13), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new b(this, 11));
    }

    @NonNull
    public DynamicColor errorContainer() {
        int i = 13;
        return new DynamicColor("error_container", new c(8), new c(9), true, new f(this, i), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new b(this, i));
    }

    @NonNull
    public DynamicColor highestSurface(@NonNull DynamicScheme dynamicScheme) {
        if (dynamicScheme.isDark) {
            return surfaceBright();
        }
        return surfaceDim();
    }

    @NonNull
    public DynamicColor inverseOnSurface() {
        return new DynamicColor("inverse_on_surface", new a4.a(15), new a4.a(16), false, new b(this, 4), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor inversePrimary() {
        return new DynamicColor("inverse_primary", new d(27), new d(28), false, new b(this, 29), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), null);
    }

    @NonNull
    public DynamicColor inverseSurface() {
        return new DynamicColor("inverse_surface", new c(1), new c(2), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_palette_key_color", new a4.a(10), new a4.a(18));
    }

    @NonNull
    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette("neutral_variant_palette_key_color", new e(16), new e(17));
    }

    @NonNull
    public DynamicColor onBackground() {
        return new DynamicColor("on_background", new d(18), new d(19), false, new b(this, 27), null, new ContrastCurve(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public DynamicColor onError() {
        return new DynamicColor("on_error", new e(6), new e(7), false, new f(this, 5), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onErrorContainer() {
        return new DynamicColor("on_error_container", new c(4), new c(5), false, new b(this, 12), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onPrimary() {
        return new DynamicColor("on_primary", new d(25), new d(26), false, new b(this, 28), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryContainer() {
        return new DynamicColor("on_primary_container", new e(10), new f(this, 6), false, new f(this, 7), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixed() {
        return new DynamicColor("on_primary_fixed", new a4.a(20), new a4.a(21), false, new b(this, 9), new b(this, 10), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onPrimaryFixedVariant() {
        return new DynamicColor("on_primary_fixed_variant", new e(2), new e(3), false, new f(this, 1), new f(this, 2), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSecondary() {
        return new DynamicColor("on_secondary", new a4.a(2), new a4.a(3), false, new b(this, 0), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryContainer() {
        return new DynamicColor("on_secondary_container", new a4.a(19), new b(this, 7), false, new b(this, 8), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixed() {
        return new DynamicColor("on_secondary_fixed", new a4.a(13), new a4.a(14), false, new b(this, 2), new b(this, 3), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSecondaryFixedVariant() {
        return new DynamicColor("on_secondary_fixed_variant", new c(17), new c(18), false, new b(this, 16), new b(this, 17), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onSurface() {
        return new DynamicColor("on_surface", new e(13), new e(23), false, new f(this, 13), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onSurfaceVariant() {
        return new DynamicColor("on_surface_variant", new a4.a(29), new c(0), false, new f(this, 13), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onTertiary() {
        return new DynamicColor("on_tertiary", new d(20), new d(29), false, new f(this, 4), null, new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryContainer() {
        return new DynamicColor("on_tertiary_container", new a4.a(17), new b(this, 5), false, new b(this, 6), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixed() {
        return new DynamicColor("on_tertiary_fixed", new d(5), new d(6), false, new b(this, 23), new b(this, 24), new ContrastCurve(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public DynamicColor onTertiaryFixedVariant() {
        return new DynamicColor("on_tertiary_fixed_variant", new c(27), new c(28), false, new b(this, 19), new b(this, 20), new ContrastCurve(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public DynamicColor outline() {
        return new DynamicColor("outline", new a4.a(8), new a4.a(9), false, new f(this, 13), null, new ContrastCurve(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public DynamicColor outlineVariant() {
        return new DynamicColor("outline_variant", new d(21), new d(22), false, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), null);
    }

    @NonNull
    public DynamicColor primary() {
        return new DynamicColor("primary", new c(13), new c(14), true, new f(this, 13), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new b(this, 15));
    }

    @NonNull
    public DynamicColor primaryContainer() {
        return new DynamicColor("primary_container", new d(13), new b(this, 25), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new b(this, 26));
    }

    @NonNull
    public DynamicColor primaryFixed() {
        return new DynamicColor("primary_fixed", new e(25), new e(26), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new f(this, 9));
    }

    @NonNull
    public DynamicColor primaryFixedDim() {
        return new DynamicColor("primary_fixed_dim", new e(27), new e(28), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new f(this, 10));
    }

    @NonNull
    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette("primary_palette_key_color", new c(24), new c(25));
    }

    @NonNull
    public DynamicColor scrim() {
        return new DynamicColor("scrim", new c(15), new c(16), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor secondary() {
        return new DynamicColor("secondary", new a4.a(4), new a4.a(5), true, new f(this, 13), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new b(this, 1));
    }

    @NonNull
    public DynamicColor secondaryContainer() {
        return new DynamicColor("secondary_container", new d(3), new b(this, 21), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new b(this, 22));
    }

    @NonNull
    public DynamicColor secondaryFixed() {
        return new DynamicColor("secondary_fixed", new e(0), new e(1), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new f(this, 0));
    }

    @NonNull
    public DynamicColor secondaryFixedDim() {
        return new DynamicColor("secondary_fixed_dim", new e(11), new e(12), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new f(this, 8));
    }

    @NonNull
    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette("secondary_palette_key_color", new c(29), new d(0));
    }

    @NonNull
    public DynamicColor shadow() {
        return new DynamicColor("shadow", new e(20), new e(21), false, null, null, null, null);
    }

    @NonNull
    public DynamicColor surface() {
        return new DynamicColor("surface", new a4.a(1), new c(26), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceBright() {
        return new DynamicColor("surface_bright", new d(23), new d(24), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainer() {
        return new DynamicColor("surface_container", new a4.a(27), new a4.a(28), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHigh() {
        return new DynamicColor("surface_container_high", new d(16), new d(17), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerHighest() {
        return new DynamicColor("surface_container_highest", new e(22), new e(24), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLow() {
        return new DynamicColor("surface_container_low", new d(1), new d(2), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceContainerLowest() {
        return new DynamicColor("surface_container_lowest", new a4.a(6), new a4.a(7), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceDim() {
        return new DynamicColor("surface_dim", new a4.a(23), new c(3), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceTint() {
        return new DynamicColor("surface_tint", new a4.a(11), new a4.a(12), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor surfaceVariant() {
        return new DynamicColor("surface_variant", new e(14), new e(15), true, null, null, null, null);
    }

    @NonNull
    public DynamicColor tertiary() {
        return new DynamicColor("tertiary", new c(20), new c(21), true, new f(this, 13), null, new ContrastCurve(3.0d, 4.5d, 7.0d, 7.0d), new b(this, 18));
    }

    @NonNull
    public DynamicColor tertiaryContainer() {
        return new DynamicColor("tertiary_container", new e(29), new f(this, 11), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new f(this, 12));
    }

    @NonNull
    public DynamicColor tertiaryFixed() {
        return new DynamicColor("tertiary_fixed", new c(10), new c(11), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new b(this, 14));
    }

    @NonNull
    public DynamicColor tertiaryFixedDim() {
        return new DynamicColor("tertiary_fixed_dim", new e(4), new e(5), true, new f(this, 13), null, new ContrastCurve(1.0d, 1.0d, 3.0d, 4.5d), new f(this, 3));
    }

    @NonNull
    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette("tertiary_palette_key_color", new d(7), new d(8));
    }

    @NonNull
    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette("text_hint_inverse", new e(18), new e(19));
    }

    @NonNull
    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette("text_primary_inverse", new a4.a(25), new a4.a(26));
    }

    @NonNull
    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette("text_primary_inverse_disable_only", new e(8), new e(9));
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse", new c(6), new c(7));
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette("text_secondary_and_tertiary_inverse_disabled", new d(4), new d(12));
    }

    public MaterialDynamicColors(boolean z10) {
        this.isExtendedFidelity = z10;
    }
}
