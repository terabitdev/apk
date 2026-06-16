package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.w0 f17530b;

    public /* synthetic */ n2(u2.w0 w0Var, int i10) {
        this.f17529a = i10;
        this.f17530b = w0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z Preview_Slider$lambda$3$0;
        sn.z SwipeToActionBox$lambda$18$0;
        sn.z SwipeToActionBox$lambda$19$0;
        h5.j SwipeToActionBox$lambda$21$0$0;
        switch (this.f17529a) {
            case 0:
                Preview_Slider$lambda$3$0 = SliderKt.Preview_Slider$lambda$3$0(this.f17530b, ((Float) obj).floatValue());
                return Preview_Slider$lambda$3$0;
            case 1:
                SwipeToActionBox$lambda$18$0 = SwipeToActionBoxKt.SwipeToActionBox$lambda$18$0(this.f17530b, ((Float) obj).floatValue());
                return SwipeToActionBox$lambda$18$0;
            case 2:
                SwipeToActionBox$lambda$19$0 = SwipeToActionBoxKt.SwipeToActionBox$lambda$19$0(this.f17530b, (h5.l) obj);
                return SwipeToActionBox$lambda$19$0;
            default:
                SwipeToActionBox$lambda$21$0$0 = SwipeToActionBoxKt.SwipeToActionBox$lambda$21$0$0(this.f17530b, (h5.c) obj);
                return SwipeToActionBox$lambda$21$0$0;
        }
    }
}
