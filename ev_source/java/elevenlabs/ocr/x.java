package io.elevenlabs.ocr;

import android.content.Context;
import io.elevenlabs.domain.model.LimitReachedData;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14317a;

    public /* synthetic */ x(int i10) {
        this.f14317a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z CameraView$lambda$22$0$10$0$4$0$1$0$0;
        z Preview_OcrImportScreen_Idle$lambda$0$0;
        z CameraView$lambda$22$0$10$0$4$0$2$0$0;
        z Preview_OcrImportScreen_PermissionsGranted$lambda$0$0;
        z CameraView$lambda$22$1$1$0$0;
        z Preview_OcrImportScreen_WithImages_Selected$lambda$1$0;
        z OcrImportScreen$lambda$0$0;
        boolean OcrImportScreen$lambda$3$0;
        z CameraView$lambda$22$0$10$0$5$3$0$0;
        z Preview_OcrImportScreen_WithImages$lambda$1$0;
        z CameraView$lambda$22$0$10$0$4$0$3$0$0$0;
        z Preview_OcrImportScreen_Loading$lambda$1$0;
        z Preview_OcrImportScreen_PermissionsNotGranted$lambda$0$0;
        OcrImportState onPictureRemove$lambda$0;
        OcrImportState onPictureClose$lambda$0;
        OcrImportState signalNavigatedToAddPodcastLimitReached$lambda$0;
        switch (this.f14317a) {
            case 0:
                return OcrImportViewModel$listen$1$1.m((OcrImportState) obj);
            case 1:
                return OcrImportViewModel$listen$1$1.d((OcrImportState) obj);
            case 2:
                return OcrImportViewModel$listen$1$1.h((OcrImportState) obj);
            case 3:
                CameraView$lambda$22$0$10$0$4$0$1$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$4$0$1$0$0((OcrImportViewModel) obj);
                return CameraView$lambda$22$0$10$0$4$0$1$0$0;
            case 4:
                Preview_OcrImportScreen_Idle$lambda$0$0 = OcrImportScreenKt.Preview_OcrImportScreen_Idle$lambda$0$0((ho.l) obj);
                return Preview_OcrImportScreen_Idle$lambda$0$0;
            case 5:
                CameraView$lambda$22$0$10$0$4$0$2$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$4$0$2$0$0((OcrImportViewModel) obj);
                return CameraView$lambda$22$0$10$0$4$0$2$0$0;
            case 6:
                Preview_OcrImportScreen_PermissionsGranted$lambda$0$0 = OcrImportScreenKt.Preview_OcrImportScreen_PermissionsGranted$lambda$0$0((ho.l) obj);
                return Preview_OcrImportScreen_PermissionsGranted$lambda$0$0;
            case 7:
                CameraView$lambda$22$1$1$0$0 = OcrImportScreenKt.CameraView$lambda$22$1$1$0$0((OcrImportViewModel) obj);
                return CameraView$lambda$22$1$1$0$0;
            case 8:
                Preview_OcrImportScreen_WithImages_Selected$lambda$1$0 = OcrImportScreenKt.Preview_OcrImportScreen_WithImages_Selected$lambda$1$0((ho.l) obj);
                return Preview_OcrImportScreen_WithImages_Selected$lambda$1$0;
            case 9:
                OcrImportScreen$lambda$0$0 = OcrImportScreenKt.OcrImportScreen$lambda$0$0((LimitReachedData) obj);
                return OcrImportScreen$lambda$0$0;
            case 10:
                OcrImportScreen$lambda$3$0 = OcrImportScreenKt.OcrImportScreen$lambda$3$0((Context) obj);
                return Boolean.valueOf(OcrImportScreen$lambda$3$0);
            case 11:
                CameraView$lambda$22$0$10$0$5$3$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$3$0$0((OcrImportViewModel) obj);
                return CameraView$lambda$22$0$10$0$5$3$0$0;
            case 12:
                Preview_OcrImportScreen_WithImages$lambda$1$0 = OcrImportScreenKt.Preview_OcrImportScreen_WithImages$lambda$1$0((ho.l) obj);
                return Preview_OcrImportScreen_WithImages$lambda$1$0;
            case 13:
                CameraView$lambda$22$0$10$0$4$0$3$0$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$4$0$3$0$0$0((OcrImportViewModel) obj);
                return CameraView$lambda$22$0$10$0$4$0$3$0$0$0;
            case 14:
                Preview_OcrImportScreen_Loading$lambda$1$0 = OcrImportScreenKt.Preview_OcrImportScreen_Loading$lambda$1$0((ho.l) obj);
                return Preview_OcrImportScreen_Loading$lambda$1$0;
            case 15:
                Preview_OcrImportScreen_PermissionsNotGranted$lambda$0$0 = OcrImportScreenKt.Preview_OcrImportScreen_PermissionsNotGranted$lambda$0$0((ho.l) obj);
                return Preview_OcrImportScreen_PermissionsNotGranted$lambda$0$0;
            case 16:
                onPictureRemove$lambda$0 = OcrImportViewModel.onPictureRemove$lambda$0((OcrImportState) obj);
                return onPictureRemove$lambda$0;
            case 17:
                onPictureClose$lambda$0 = OcrImportViewModel.onPictureClose$lambda$0((OcrImportState) obj);
                return onPictureClose$lambda$0;
            default:
                signalNavigatedToAddPodcastLimitReached$lambda$0 = OcrImportViewModel.signalNavigatedToAddPodcastLimitReached$lambda$0((OcrImportState) obj);
                return signalNavigatedToAddPodcastLimitReached$lambda$0;
        }
    }
}
