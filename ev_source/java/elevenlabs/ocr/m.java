package io.elevenlabs.ocr;

import android.net.Uri;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f14286b;

    public /* synthetic */ m(Uri uri, int i10) {
        this.f14285a = i10;
        this.f14286b = uri;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z CameraView$lambda$22$0$10$0$5$2$0$0;
        OcrImportState onPictureClick$lambda$0;
        switch (this.f14285a) {
            case 0:
                CameraView$lambda$22$0$10$0$5$2$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$2$0$0(this.f14286b, (OcrImportViewModel) obj);
                return CameraView$lambda$22$0$10$0$5$2$0$0;
            case 1:
                return OcrImportScreenKt$captureImage$1.a(this.f14286b, (OcrImportViewModel) obj);
            default:
                onPictureClick$lambda$0 = OcrImportViewModel.onPictureClick$lambda$0(this.f14286b, (OcrImportState) obj);
                return onPictureClick$lambda$0;
        }
    }
}
