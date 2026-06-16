package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4107a;

    public /* synthetic */ c(int i) {
        this.f4107a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f4107a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$onSurfaceVariant$36;
        TonalPalette tonalPalette;
        Double lambda$inverseSurface$38;
        Double lambda$surfaceDim$18;
        TonalPalette tonalPalette2;
        Double lambda$onErrorContainer$101;
        TonalPalette tonalPalette3;
        Double lambda$textSecondaryAndTertiaryInverse$155;
        TonalPalette tonalPalette4;
        Double lambda$errorContainer$98;
        TonalPalette tonalPalette5;
        Double lambda$tertiaryFixed$132;
        TonalPalette tonalPalette6;
        TonalPalette tonalPalette7;
        Double lambda$primary$53;
        TonalPalette tonalPalette8;
        Double lambda$scrim$49;
        TonalPalette tonalPalette9;
        Double lambda$onSecondaryFixedVariant$128;
        Double lambda$controlNormal$148;
        TonalPalette tonalPalette10;
        Double lambda$tertiary$80;
        TonalPalette tonalPalette11;
        Double lambda$controlActivated$146;
        TonalPalette tonalPalette12;
        Double lambda$primaryPaletteKeyColor$1;
        Double lambda$surface$16;
        TonalPalette tonalPalette13;
        Double lambda$onTertiaryFixedVariant$142;
        TonalPalette tonalPalette14;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f4107a) {
            case 0:
                lambda$onSurfaceVariant$36 = MaterialDynamicColors.lambda$onSurfaceVariant$36(dynamicScheme);
                return lambda$onSurfaceVariant$36;
            case 1:
                tonalPalette = dynamicScheme.neutralPalette;
                return tonalPalette;
            case 2:
                lambda$inverseSurface$38 = MaterialDynamicColors.lambda$inverseSurface$38(dynamicScheme);
                return lambda$inverseSurface$38;
            case 3:
                lambda$surfaceDim$18 = MaterialDynamicColors.lambda$surfaceDim$18(dynamicScheme);
                return lambda$surfaceDim$18;
            case 4:
                tonalPalette2 = dynamicScheme.errorPalette;
                return tonalPalette2;
            case 5:
                lambda$onErrorContainer$101 = MaterialDynamicColors.lambda$onErrorContainer$101(dynamicScheme);
                return lambda$onErrorContainer$101;
            case 6:
                tonalPalette3 = dynamicScheme.neutralVariantPalette;
                return tonalPalette3;
            case 7:
                lambda$textSecondaryAndTertiaryInverse$155 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155(dynamicScheme);
                return lambda$textSecondaryAndTertiaryInverse$155;
            case 8:
                tonalPalette4 = dynamicScheme.errorPalette;
                return tonalPalette4;
            case 9:
                lambda$errorContainer$98 = MaterialDynamicColors.lambda$errorContainer$98(dynamicScheme);
                return lambda$errorContainer$98;
            case 10:
                tonalPalette5 = dynamicScheme.tertiaryPalette;
                return tonalPalette5;
            case 11:
                lambda$tertiaryFixed$132 = MaterialDynamicColors.lambda$tertiaryFixed$132(dynamicScheme);
                return lambda$tertiaryFixed$132;
            case 12:
                tonalPalette6 = dynamicScheme.neutralVariantPalette;
                return tonalPalette6;
            case 13:
                tonalPalette7 = dynamicScheme.primaryPalette;
                return tonalPalette7;
            case 14:
                lambda$primary$53 = MaterialDynamicColors.lambda$primary$53(dynamicScheme);
                return lambda$primary$53;
            case 15:
                tonalPalette8 = dynamicScheme.neutralPalette;
                return tonalPalette8;
            case 16:
                lambda$scrim$49 = MaterialDynamicColors.lambda$scrim$49(dynamicScheme);
                return lambda$scrim$49;
            case 17:
                tonalPalette9 = dynamicScheme.secondaryPalette;
                return tonalPalette9;
            case 18:
                lambda$onSecondaryFixedVariant$128 = MaterialDynamicColors.lambda$onSecondaryFixedVariant$128(dynamicScheme);
                return lambda$onSecondaryFixedVariant$128;
            case 19:
                lambda$controlNormal$148 = MaterialDynamicColors.lambda$controlNormal$148(dynamicScheme);
                return lambda$controlNormal$148;
            case 20:
                tonalPalette10 = dynamicScheme.tertiaryPalette;
                return tonalPalette10;
            case 21:
                lambda$tertiary$80 = MaterialDynamicColors.lambda$tertiary$80(dynamicScheme);
                return lambda$tertiary$80;
            case 22:
                tonalPalette11 = dynamicScheme.primaryPalette;
                return tonalPalette11;
            case 23:
                lambda$controlActivated$146 = MaterialDynamicColors.lambda$controlActivated$146(dynamicScheme);
                return lambda$controlActivated$146;
            case 24:
                tonalPalette12 = dynamicScheme.primaryPalette;
                return tonalPalette12;
            case 25:
                lambda$primaryPaletteKeyColor$1 = MaterialDynamicColors.lambda$primaryPaletteKeyColor$1(dynamicScheme);
                return lambda$primaryPaletteKeyColor$1;
            case 26:
                lambda$surface$16 = MaterialDynamicColors.lambda$surface$16(dynamicScheme);
                return lambda$surface$16;
            case 27:
                tonalPalette13 = dynamicScheme.tertiaryPalette;
                return tonalPalette13;
            case 28:
                lambda$onTertiaryFixedVariant$142 = MaterialDynamicColors.lambda$onTertiaryFixedVariant$142(dynamicScheme);
                return lambda$onTertiaryFixedVariant$142;
            default:
                tonalPalette14 = dynamicScheme.secondaryPalette;
                return tonalPalette14;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f4107a;
        return Function$CC.$default$compose(this, function);
    }
}
