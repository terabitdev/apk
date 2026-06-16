package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4108a;

    public /* synthetic */ d(int i) {
        this.f4108a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f4108a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$secondaryPaletteKeyColor$3;
        TonalPalette tonalPalette;
        Double lambda$surfaceContainerLow$24;
        TonalPalette tonalPalette2;
        TonalPalette tonalPalette3;
        TonalPalette tonalPalette4;
        Double lambda$onTertiaryFixed$138;
        TonalPalette tonalPalette5;
        Double lambda$tertiaryPaletteKeyColor$5;
        TonalPalette tonalPalette6;
        Double lambda$controlHighlight$150;
        Double lambda$controlHighlight$151;
        Double lambda$textSecondaryAndTertiaryInverseDisabled$159;
        TonalPalette tonalPalette7;
        TonalPalette tonalPalette8;
        Double lambda$background$11;
        TonalPalette tonalPalette9;
        Double lambda$surfaceContainerHigh$28;
        TonalPalette tonalPalette10;
        Double lambda$onBackground$13;
        TonalPalette tonalPalette11;
        TonalPalette tonalPalette12;
        Double lambda$outlineVariant$45;
        TonalPalette tonalPalette13;
        Double lambda$surfaceBright$20;
        TonalPalette tonalPalette14;
        Double lambda$onPrimary$56;
        TonalPalette tonalPalette15;
        Double lambda$inversePrimary$65;
        Double lambda$onTertiary$83;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f4108a) {
            case 0:
                lambda$secondaryPaletteKeyColor$3 = MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3(dynamicScheme);
                return lambda$secondaryPaletteKeyColor$3;
            case 1:
                tonalPalette = dynamicScheme.neutralPalette;
                return tonalPalette;
            case 2:
                lambda$surfaceContainerLow$24 = MaterialDynamicColors.lambda$surfaceContainerLow$24(dynamicScheme);
                return lambda$surfaceContainerLow$24;
            case 3:
                tonalPalette2 = dynamicScheme.secondaryPalette;
                return tonalPalette2;
            case 4:
                tonalPalette3 = dynamicScheme.neutralPalette;
                return tonalPalette3;
            case 5:
                tonalPalette4 = dynamicScheme.tertiaryPalette;
                return tonalPalette4;
            case 6:
                lambda$onTertiaryFixed$138 = MaterialDynamicColors.lambda$onTertiaryFixed$138(dynamicScheme);
                return lambda$onTertiaryFixed$138;
            case 7:
                tonalPalette5 = dynamicScheme.tertiaryPalette;
                return tonalPalette5;
            case 8:
                lambda$tertiaryPaletteKeyColor$5 = MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5(dynamicScheme);
                return lambda$tertiaryPaletteKeyColor$5;
            case 9:
                tonalPalette6 = dynamicScheme.neutralPalette;
                return tonalPalette6;
            case 10:
                lambda$controlHighlight$150 = MaterialDynamicColors.lambda$controlHighlight$150(dynamicScheme);
                return lambda$controlHighlight$150;
            case 11:
                lambda$controlHighlight$151 = MaterialDynamicColors.lambda$controlHighlight$151(dynamicScheme);
                return lambda$controlHighlight$151;
            case 12:
                lambda$textSecondaryAndTertiaryInverseDisabled$159 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159(dynamicScheme);
                return lambda$textSecondaryAndTertiaryInverseDisabled$159;
            case 13:
                tonalPalette7 = dynamicScheme.primaryPalette;
                return tonalPalette7;
            case 14:
                tonalPalette8 = dynamicScheme.neutralPalette;
                return tonalPalette8;
            case 15:
                lambda$background$11 = MaterialDynamicColors.lambda$background$11(dynamicScheme);
                return lambda$background$11;
            case 16:
                tonalPalette9 = dynamicScheme.neutralPalette;
                return tonalPalette9;
            case 17:
                lambda$surfaceContainerHigh$28 = MaterialDynamicColors.lambda$surfaceContainerHigh$28(dynamicScheme);
                return lambda$surfaceContainerHigh$28;
            case 18:
                tonalPalette10 = dynamicScheme.neutralPalette;
                return tonalPalette10;
            case 19:
                lambda$onBackground$13 = MaterialDynamicColors.lambda$onBackground$13(dynamicScheme);
                return lambda$onBackground$13;
            case 20:
                tonalPalette11 = dynamicScheme.tertiaryPalette;
                return tonalPalette11;
            case 21:
                tonalPalette12 = dynamicScheme.neutralVariantPalette;
                return tonalPalette12;
            case 22:
                lambda$outlineVariant$45 = MaterialDynamicColors.lambda$outlineVariant$45(dynamicScheme);
                return lambda$outlineVariant$45;
            case 23:
                tonalPalette13 = dynamicScheme.neutralPalette;
                return tonalPalette13;
            case 24:
                lambda$surfaceBright$20 = MaterialDynamicColors.lambda$surfaceBright$20(dynamicScheme);
                return lambda$surfaceBright$20;
            case 25:
                tonalPalette14 = dynamicScheme.primaryPalette;
                return tonalPalette14;
            case 26:
                lambda$onPrimary$56 = MaterialDynamicColors.lambda$onPrimary$56(dynamicScheme);
                return lambda$onPrimary$56;
            case 27:
                tonalPalette15 = dynamicScheme.primaryPalette;
                return tonalPalette15;
            case 28:
                lambda$inversePrimary$65 = MaterialDynamicColors.lambda$inversePrimary$65(dynamicScheme);
                return lambda$inversePrimary$65;
            default:
                lambda$onTertiary$83 = MaterialDynamicColors.lambda$onTertiary$83(dynamicScheme);
                return lambda$onTertiary$83;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f4108a;
        return Function$CC.$default$compose(this, function);
    }
}
