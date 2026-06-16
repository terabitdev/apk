package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4104b;

    public /* synthetic */ a(Object obj, int i) {
        this.f4103a = i;
        this.f4104b = obj;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f4103a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette lambda$fromArgb$0;
        Double lambda$fromArgb$1;
        switch (this.f4103a) {
            case 0:
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0((TonalPalette) this.f4104b, (DynamicScheme) obj);
                return lambda$fromArgb$0;
            case 1:
                lambda$fromArgb$1 = DynamicColor.lambda$fromArgb$1((Hct) this.f4104b, (DynamicScheme) obj);
                return lambda$fromArgb$1;
            default:
                return TemperatureCache.a((TemperatureCache) this.f4104b, (Hct) obj);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f4103a;
        return Function$CC.$default$compose(this, function);
    }
}
