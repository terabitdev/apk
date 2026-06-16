package io.elevenlabs.ui.components;

import io.elevenlabs.ui.echo.components.UpsellTitleKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17452e;

    public /* synthetic */ i1(String str, String str2, int i10, int i11, int i12) {
        this.f17448a = i12;
        this.f17449b = str;
        this.f17450c = str2;
        this.f17451d = i10;
        this.f17452e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17448a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return InputLabelHintContainerKt.a(this.f17449b, this.f17450c, this.f17451d, this.f17452e, (u2.m) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return UpsellTitleKt.a(this.f17449b, this.f17450c, this.f17451d, this.f17452e, (u2.m) obj, intValue2);
        }
    }
}
