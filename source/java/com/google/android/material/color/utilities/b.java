package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f4106b;

    public /* synthetic */ b(MaterialDynamicColors materialDynamicColors, int i) {
        this.f4105a = i;
        this.f4106b = materialDynamicColors;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f4105a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$onSecondary$72;
        ToneDeltaPair lambda$secondary$69;
        DynamicColor lambda$onSecondaryFixed$125;
        DynamicColor lambda$onSecondaryFixed$126;
        DynamicColor lambda$inverseOnSurface$41;
        Double lambda$onTertiaryContainer$89;
        DynamicColor lambda$onTertiaryContainer$90;
        Double lambda$onSecondaryContainer$77;
        DynamicColor lambda$onSecondaryContainer$78;
        DynamicColor lambda$onPrimaryFixed$111;
        DynamicColor lambda$onPrimaryFixed$112;
        ToneDeltaPair lambda$error$93;
        DynamicColor lambda$onErrorContainer$102;
        ToneDeltaPair lambda$errorContainer$99;
        ToneDeltaPair lambda$tertiaryFixed$133;
        ToneDeltaPair lambda$primary$54;
        DynamicColor lambda$onSecondaryFixedVariant$129;
        DynamicColor lambda$onSecondaryFixedVariant$130;
        ToneDeltaPair lambda$tertiary$81;
        DynamicColor lambda$onTertiaryFixedVariant$143;
        DynamicColor lambda$onTertiaryFixedVariant$144;
        Double lambda$secondaryContainer$74;
        ToneDeltaPair lambda$secondaryContainer$75;
        DynamicColor lambda$onTertiaryFixed$139;
        DynamicColor lambda$onTertiaryFixed$140;
        Double lambda$primaryContainer$59;
        ToneDeltaPair lambda$primaryContainer$60;
        DynamicColor lambda$onBackground$14;
        DynamicColor lambda$onPrimary$57;
        DynamicColor lambda$inversePrimary$66;
        switch (this.f4105a) {
            case 0:
                lambda$onSecondary$72 = this.f4106b.lambda$onSecondary$72((DynamicScheme) obj);
                return lambda$onSecondary$72;
            case 1:
                lambda$secondary$69 = this.f4106b.lambda$secondary$69((DynamicScheme) obj);
                return lambda$secondary$69;
            case 2:
                lambda$onSecondaryFixed$125 = this.f4106b.lambda$onSecondaryFixed$125((DynamicScheme) obj);
                return lambda$onSecondaryFixed$125;
            case 3:
                lambda$onSecondaryFixed$126 = this.f4106b.lambda$onSecondaryFixed$126((DynamicScheme) obj);
                return lambda$onSecondaryFixed$126;
            case 4:
                lambda$inverseOnSurface$41 = this.f4106b.lambda$inverseOnSurface$41((DynamicScheme) obj);
                return lambda$inverseOnSurface$41;
            case 5:
                lambda$onTertiaryContainer$89 = this.f4106b.lambda$onTertiaryContainer$89((DynamicScheme) obj);
                return lambda$onTertiaryContainer$89;
            case 6:
                lambda$onTertiaryContainer$90 = this.f4106b.lambda$onTertiaryContainer$90((DynamicScheme) obj);
                return lambda$onTertiaryContainer$90;
            case 7:
                lambda$onSecondaryContainer$77 = this.f4106b.lambda$onSecondaryContainer$77((DynamicScheme) obj);
                return lambda$onSecondaryContainer$77;
            case 8:
                lambda$onSecondaryContainer$78 = this.f4106b.lambda$onSecondaryContainer$78((DynamicScheme) obj);
                return lambda$onSecondaryContainer$78;
            case 9:
                lambda$onPrimaryFixed$111 = this.f4106b.lambda$onPrimaryFixed$111((DynamicScheme) obj);
                return lambda$onPrimaryFixed$111;
            case 10:
                lambda$onPrimaryFixed$112 = this.f4106b.lambda$onPrimaryFixed$112((DynamicScheme) obj);
                return lambda$onPrimaryFixed$112;
            case 11:
                lambda$error$93 = this.f4106b.lambda$error$93((DynamicScheme) obj);
                return lambda$error$93;
            case 12:
                lambda$onErrorContainer$102 = this.f4106b.lambda$onErrorContainer$102((DynamicScheme) obj);
                return lambda$onErrorContainer$102;
            case 13:
                lambda$errorContainer$99 = this.f4106b.lambda$errorContainer$99((DynamicScheme) obj);
                return lambda$errorContainer$99;
            case 14:
                lambda$tertiaryFixed$133 = this.f4106b.lambda$tertiaryFixed$133((DynamicScheme) obj);
                return lambda$tertiaryFixed$133;
            case 15:
                lambda$primary$54 = this.f4106b.lambda$primary$54((DynamicScheme) obj);
                return lambda$primary$54;
            case 16:
                lambda$onSecondaryFixedVariant$129 = this.f4106b.lambda$onSecondaryFixedVariant$129((DynamicScheme) obj);
                return lambda$onSecondaryFixedVariant$129;
            case 17:
                lambda$onSecondaryFixedVariant$130 = this.f4106b.lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
                return lambda$onSecondaryFixedVariant$130;
            case 18:
                lambda$tertiary$81 = this.f4106b.lambda$tertiary$81((DynamicScheme) obj);
                return lambda$tertiary$81;
            case 19:
                lambda$onTertiaryFixedVariant$143 = this.f4106b.lambda$onTertiaryFixedVariant$143((DynamicScheme) obj);
                return lambda$onTertiaryFixedVariant$143;
            case 20:
                lambda$onTertiaryFixedVariant$144 = this.f4106b.lambda$onTertiaryFixedVariant$144((DynamicScheme) obj);
                return lambda$onTertiaryFixedVariant$144;
            case 21:
                lambda$secondaryContainer$74 = this.f4106b.lambda$secondaryContainer$74((DynamicScheme) obj);
                return lambda$secondaryContainer$74;
            case 22:
                lambda$secondaryContainer$75 = this.f4106b.lambda$secondaryContainer$75((DynamicScheme) obj);
                return lambda$secondaryContainer$75;
            case 23:
                lambda$onTertiaryFixed$139 = this.f4106b.lambda$onTertiaryFixed$139((DynamicScheme) obj);
                return lambda$onTertiaryFixed$139;
            case 24:
                lambda$onTertiaryFixed$140 = this.f4106b.lambda$onTertiaryFixed$140((DynamicScheme) obj);
                return lambda$onTertiaryFixed$140;
            case 25:
                lambda$primaryContainer$59 = this.f4106b.lambda$primaryContainer$59((DynamicScheme) obj);
                return lambda$primaryContainer$59;
            case 26:
                lambda$primaryContainer$60 = this.f4106b.lambda$primaryContainer$60((DynamicScheme) obj);
                return lambda$primaryContainer$60;
            case 27:
                lambda$onBackground$14 = this.f4106b.lambda$onBackground$14((DynamicScheme) obj);
                return lambda$onBackground$14;
            case 28:
                lambda$onPrimary$57 = this.f4106b.lambda$onPrimary$57((DynamicScheme) obj);
                return lambda$onPrimary$57;
            default:
                lambda$inversePrimary$66 = this.f4106b.lambda$inversePrimary$66((DynamicScheme) obj);
                return lambda$inversePrimary$66;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f4105a;
        return Function$CC.$default$compose(this, function);
    }
}
