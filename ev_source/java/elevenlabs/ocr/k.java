package io.elevenlabs.ocr;

import java.util.List;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14279b;

    public /* synthetic */ k(List list, int i10) {
        this.f14278a = i10;
        this.f14279b = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z CameraView$lambda$14$0$0;
        OcrImportState initialImages$lambda$0;
        OcrImportState onPicturesSaved$lambda$0;
        switch (this.f14278a) {
            case 0:
                CameraView$lambda$14$0$0 = OcrImportScreenKt.CameraView$lambda$14$0$0(this.f14279b, (OcrImportViewModel) obj);
                return CameraView$lambda$14$0$0;
            case 1:
                initialImages$lambda$0 = OcrImportViewModel.setInitialImages$lambda$0(this.f14279b, (OcrImportState) obj);
                return initialImages$lambda$0;
            default:
                onPicturesSaved$lambda$0 = OcrImportViewModel.onPicturesSaved$lambda$0(this.f14279b, (OcrImportState) obj);
                return onPicturesSaved$lambda$0;
        }
    }
}
