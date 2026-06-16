package io.elevenlabs.ocr;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14280a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f14281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OcrImportState f14282c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f14283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14284e;

    public /* synthetic */ l(ho.l lVar, OcrImportState ocrImportState, ho.a aVar, int i10) {
        this.f14281b = lVar;
        this.f14282c = ocrImportState;
        this.f14283d = aVar;
        this.f14284e = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z OcrImportScreenUI$lambda$1;
        z CameraView$lambda$23;
        switch (this.f14280a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ho.l lVar = this.f14281b;
                OcrImportScreenUI$lambda$1 = OcrImportScreenKt.OcrImportScreenUI$lambda$1(this.f14282c, lVar, this.f14283d, this.f14284e, (u2.m) obj, intValue);
                return OcrImportScreenUI$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                CameraView$lambda$23 = OcrImportScreenKt.CameraView$lambda$23(this.f14281b, this.f14282c, this.f14283d, this.f14284e, (u2.m) obj, intValue2);
                return CameraView$lambda$23;
        }
    }

    public /* synthetic */ l(OcrImportState ocrImportState, ho.l lVar, ho.a aVar, int i10) {
        this.f14282c = ocrImportState;
        this.f14281b = lVar;
        this.f14283d = aVar;
        this.f14284e = i10;
    }
}
