package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1.p f17693b;

    public /* synthetic */ w2(n1.p pVar, int i10) {
        this.f17692a = i10;
        this.f17693b = pVar;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f17692a) {
            case 0:
                return SwipeToActionBoxKt$SwipeToActionBox$3$1.d(this.f17693b);
            default:
                return Float.valueOf(SwipeToActionBoxKt$rememberThresholdState$1$1.d(this.f17693b));
        }
    }
}
