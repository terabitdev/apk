package io.elevenlabs.ocr;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcrImportViewModel f14288b;

    public /* synthetic */ n(int i10, OcrImportViewModel ocrImportViewModel) {
        this.f14287a = i10;
        this.f14288b = ocrImportViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z OcrImportScreen$lambda$8$0;
        OcrImportState listen$lambda$0;
        switch (this.f14287a) {
            case 0:
                OcrImportScreen$lambda$8$0 = OcrImportScreenKt.OcrImportScreen$lambda$8$0(this.f14288b, (ho.l) obj);
                return OcrImportScreen$lambda$8$0;
            default:
                listen$lambda$0 = OcrImportViewModel.listen$lambda$0(this.f14288b, (OcrImportState) obj);
                return listen$lambda$0;
        }
    }
}
