package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4109a;

    public /* synthetic */ e(int i) {
        this.f4109a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f4109a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette tonalPalette;
        Double lambda$secondaryFixed$118;
        TonalPalette tonalPalette2;
        Double lambda$onPrimaryFixedVariant$114;
        TonalPalette tonalPalette3;
        Double lambda$tertiaryFixedDim$135;
        TonalPalette tonalPalette4;
        Double lambda$onError$95;
        TonalPalette tonalPalette5;
        Double lambda$textPrimaryInverseDisableOnly$157;
        TonalPalette tonalPalette6;
        TonalPalette tonalPalette7;
        Double lambda$secondaryFixedDim$121;
        TonalPalette tonalPalette8;
        TonalPalette tonalPalette9;
        Double lambda$surfaceVariant$34;
        TonalPalette tonalPalette10;
        Double lambda$neutralVariantPaletteKeyColor$9;
        TonalPalette tonalPalette11;
        Double lambda$textHintInverse$161;
        TonalPalette tonalPalette12;
        Double lambda$shadow$47;
        TonalPalette tonalPalette13;
        Double lambda$onSurface$32;
        Double lambda$surfaceContainerHighest$30;
        TonalPalette tonalPalette14;
        Double lambda$primaryFixed$104;
        TonalPalette tonalPalette15;
        Double lambda$primaryFixedDim$107;
        TonalPalette tonalPalette16;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f4109a) {
            case 0:
                tonalPalette = dynamicScheme.secondaryPalette;
                return tonalPalette;
            case 1:
                lambda$secondaryFixed$118 = MaterialDynamicColors.lambda$secondaryFixed$118(dynamicScheme);
                return lambda$secondaryFixed$118;
            case 2:
                tonalPalette2 = dynamicScheme.primaryPalette;
                return tonalPalette2;
            case 3:
                lambda$onPrimaryFixedVariant$114 = MaterialDynamicColors.lambda$onPrimaryFixedVariant$114(dynamicScheme);
                return lambda$onPrimaryFixedVariant$114;
            case 4:
                tonalPalette3 = dynamicScheme.tertiaryPalette;
                return tonalPalette3;
            case 5:
                lambda$tertiaryFixedDim$135 = MaterialDynamicColors.lambda$tertiaryFixedDim$135(dynamicScheme);
                return lambda$tertiaryFixedDim$135;
            case 6:
                tonalPalette4 = dynamicScheme.errorPalette;
                return tonalPalette4;
            case 7:
                lambda$onError$95 = MaterialDynamicColors.lambda$onError$95(dynamicScheme);
                return lambda$onError$95;
            case 8:
                tonalPalette5 = dynamicScheme.neutralPalette;
                return tonalPalette5;
            case 9:
                lambda$textPrimaryInverseDisableOnly$157 = MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157(dynamicScheme);
                return lambda$textPrimaryInverseDisableOnly$157;
            case 10:
                tonalPalette6 = dynamicScheme.primaryPalette;
                return tonalPalette6;
            case 11:
                tonalPalette7 = dynamicScheme.secondaryPalette;
                return tonalPalette7;
            case 12:
                lambda$secondaryFixedDim$121 = MaterialDynamicColors.lambda$secondaryFixedDim$121(dynamicScheme);
                return lambda$secondaryFixedDim$121;
            case 13:
                tonalPalette8 = dynamicScheme.neutralPalette;
                return tonalPalette8;
            case 14:
                tonalPalette9 = dynamicScheme.neutralVariantPalette;
                return tonalPalette9;
            case 15:
                lambda$surfaceVariant$34 = MaterialDynamicColors.lambda$surfaceVariant$34(dynamicScheme);
                return lambda$surfaceVariant$34;
            case 16:
                tonalPalette10 = dynamicScheme.neutralVariantPalette;
                return tonalPalette10;
            case 17:
                lambda$neutralVariantPaletteKeyColor$9 = MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9(dynamicScheme);
                return lambda$neutralVariantPaletteKeyColor$9;
            case 18:
                tonalPalette11 = dynamicScheme.neutralPalette;
                return tonalPalette11;
            case 19:
                lambda$textHintInverse$161 = MaterialDynamicColors.lambda$textHintInverse$161(dynamicScheme);
                return lambda$textHintInverse$161;
            case 20:
                tonalPalette12 = dynamicScheme.neutralPalette;
                return tonalPalette12;
            case 21:
                lambda$shadow$47 = MaterialDynamicColors.lambda$shadow$47(dynamicScheme);
                return lambda$shadow$47;
            case 22:
                tonalPalette13 = dynamicScheme.neutralPalette;
                return tonalPalette13;
            case 23:
                lambda$onSurface$32 = MaterialDynamicColors.lambda$onSurface$32(dynamicScheme);
                return lambda$onSurface$32;
            case 24:
                lambda$surfaceContainerHighest$30 = MaterialDynamicColors.lambda$surfaceContainerHighest$30(dynamicScheme);
                return lambda$surfaceContainerHighest$30;
            case 25:
                tonalPalette14 = dynamicScheme.primaryPalette;
                return tonalPalette14;
            case 26:
                lambda$primaryFixed$104 = MaterialDynamicColors.lambda$primaryFixed$104(dynamicScheme);
                return lambda$primaryFixed$104;
            case 27:
                tonalPalette15 = dynamicScheme.primaryPalette;
                return tonalPalette15;
            case 28:
                lambda$primaryFixedDim$107 = MaterialDynamicColors.lambda$primaryFixedDim$107(dynamicScheme);
                return lambda$primaryFixedDim$107;
            default:
                tonalPalette16 = dynamicScheme.tertiaryPalette;
                return tonalPalette16;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f4109a;
        return Function$CC.$default$compose(this, function);
    }
}
