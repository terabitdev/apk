package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17525c;

    public /* synthetic */ n(Object obj, Object obj2, int i10) {
        this.f17523a = i10;
        this.f17524b = obj;
        this.f17525c = obj2;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z BottomSheetList$lambda$1;
        sn.z ZoomableBox$lambda$9$0;
        switch (this.f17523a) {
            case 0:
                BottomSheetList$lambda$1 = BottomSheetListKt.BottomSheetList$lambda$1((String) this.f17524b, (ho.q) this.f17525c, (r1.s) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return BottomSheetList$lambda$1;
            default:
                ZoomableBox$lambda$9$0 = ZoomableBoxKt.ZoomableBox$lambda$9$0((u2.w0) this.f17524b, (u2.z0) this.f17525c, ((Float) obj).floatValue(), (o3.b) obj2, ((Float) obj3).floatValue());
                return ZoomableBox$lambda$9$0;
        }
    }
}
