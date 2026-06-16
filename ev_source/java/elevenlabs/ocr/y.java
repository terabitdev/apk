package io.elevenlabs.ocr;

import android.content.Context;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AddPodcastResult;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14319b;

    public /* synthetic */ y(Object obj, int i10) {
        this.f14318a = i10;
        this.f14319b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        OcrImportState invokeSuspend$lambda$3;
        OcrImportState invokeSuspend$lambda$4;
        OcrImportState invokeSuspend$lambda$6;
        z CameraView$lambda$16$0$1;
        c1.k CameraView$lambda$22$0$7$0;
        switch (this.f14318a) {
            case 0:
                invokeSuspend$lambda$3 = OcrImportViewModel$listen$1$1.invokeSuspend$lambda$3((AddPodcastResult.Success) this.f14319b, (OcrImportState) obj);
                return invokeSuspend$lambda$3;
            case 1:
                invokeSuspend$lambda$4 = OcrImportViewModel$listen$1$1.invokeSuspend$lambda$4((AddPodcastResult.LimitReached) this.f14319b, (OcrImportState) obj);
                return invokeSuspend$lambda$4;
            case 2:
                invokeSuspend$lambda$6 = OcrImportViewModel$listen$1$1.invokeSuspend$lambda$6((AsyncCallResult.Success) this.f14319b, (OcrImportState) obj);
                return invokeSuspend$lambda$6;
            case 3:
                CameraView$lambda$16$0$1 = OcrImportScreenKt.CameraView$lambda$16$0$1((IllegalArgumentException) this.f14319b, (OcrImportViewModel) obj);
                return CameraView$lambda$16$0$1;
            default:
                CameraView$lambda$22$0$7$0 = OcrImportScreenKt.CameraView$lambda$22$0$7$0((c1.k) this.f14319b, (Context) obj);
                return CameraView$lambda$22$0$7$0;
        }
    }
}
