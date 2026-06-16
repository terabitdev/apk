package io.elevenlabs.ocr;

import android.graphics.Bitmap;
import android.net.Uri;
import g0.f0;
import g0.g0;
import g0.j0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"io/elevenlabs/ocr/OcrImportScreenKt$captureImage$1", "Lg0/f0;", "Lg0/g0;", "outputFileResults", "Lsn/z;", "onImageSaved", "(Lg0/g0;)V", "Lg0/j0;", "exception", "onError", "(Lg0/j0;)V", "ocr_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OcrImportScreenKt$captureImage$1 implements f0 {
    final /* synthetic */ ho.l $action;
    final /* synthetic */ String $tag;

    public OcrImportScreenKt$captureImage$1(ho.l lVar, String str) {
        this.$action = lVar;
        this.$tag = str;
    }

    public static final z onError$lambda$3(String str, j0 j0Var, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.getLogger().logError(str, "Can't save picture", j0Var);
        return z.f31622a;
    }

    public static final z onImageSaved$lambda$0(String str, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.getLogger().log(str, "image empty uri");
        return z.f31622a;
    }

    public static final z onImageSaved$lambda$1(String str, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.getLogger().log(str, "image saved");
        return z.f31622a;
    }

    public static final z onImageSaved$lambda$2(Uri uri, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onPicturesSaved(ig.f.H(uri));
        return z.f31622a;
    }

    @Override // g0.f0
    public void onError(j0 exception) {
        exception.getClass();
        this.$action.invoke(new io.elevenlabs.data.database.entities.reads.h(this.$tag, exception, 2));
    }

    @Override // g0.f0
    public void onImageSaved(g0 outputFileResults) {
        outputFileResults.getClass();
        Uri uri = outputFileResults.f10065a;
        ho.l lVar = this.$action;
        final String str = this.$tag;
        if (uri == null) {
            final int i10 = 0;
            lVar.invoke(new ho.l() { // from class: io.elevenlabs.ocr.s
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z onImageSaved$lambda$0;
                    z onImageSaved$lambda$1;
                    switch (i10) {
                        case 0:
                            onImageSaved$lambda$0 = OcrImportScreenKt$captureImage$1.onImageSaved$lambda$0(str, (OcrImportViewModel) obj);
                            return onImageSaved$lambda$0;
                        default:
                            onImageSaved$lambda$1 = OcrImportScreenKt$captureImage$1.onImageSaved$lambda$1(str, (OcrImportViewModel) obj);
                            return onImageSaved$lambda$1;
                    }
                }
            });
        } else {
            final int i11 = 1;
            lVar.invoke(new ho.l() { // from class: io.elevenlabs.ocr.s
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z onImageSaved$lambda$0;
                    z onImageSaved$lambda$1;
                    switch (i11) {
                        case 0:
                            onImageSaved$lambda$0 = OcrImportScreenKt$captureImage$1.onImageSaved$lambda$0(str, (OcrImportViewModel) obj);
                            return onImageSaved$lambda$0;
                        default:
                            onImageSaved$lambda$1 = OcrImportScreenKt$captureImage$1.onImageSaved$lambda$1(str, (OcrImportViewModel) obj);
                            return onImageSaved$lambda$1;
                    }
                }
            });
            this.$action.invoke(new m(uri, 1));
        }
    }

    @Override // g0.f0
    public /* bridge */ /* synthetic */ void onCaptureStarted() {
    }

    @Override // g0.f0
    public /* bridge */ /* synthetic */ void onCaptureProcessProgressed(int i10) {
    }

    @Override // g0.f0
    public /* bridge */ /* synthetic */ void onPostviewBitmapAvailable(Bitmap bitmap) {
    }
}
