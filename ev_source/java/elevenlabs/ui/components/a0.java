package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17244b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f17243a = i10;
        this.f17244b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z ChipGroup$lambda$4$0;
        sn.z DynamicBottomShadowOverlay_sW7UJKQ$lambda$4$0$0;
        u2.h0 ToastContainer$lambda$0$0$0$0;
        switch (this.f17243a) {
            case 0:
                ChipGroup$lambda$4$0 = ChipGroupKt.ChipGroup$lambda$4$0((ho.l) this.f17244b, (t1.t) obj);
                return ChipGroup$lambda$4$0;
            case 1:
                return InteractionsKt.a((j1.d) this.f17244b, (p3.i0) obj);
            case 2:
                DynamicBottomShadowOverlay_sW7UJKQ$lambda$4$0$0 = ShadowKt.DynamicBottomShadowOverlay_sW7UJKQ$lambda$4$0$0((u2.x0) this.f17244b, (h5.l) obj);
                return DynamicBottomShadowOverlay_sW7UJKQ$lambda$4$0$0;
            default:
                ToastContainer$lambda$0$0$0$0 = ToastContainerKt.ToastContainer$lambda$0$0$0$0((ho.a) this.f17244b, (u2.i0) obj);
                return ToastContainer$lambda$0$0$0$0;
        }
    }
}
