package io.elevenlabs.ocr;

import android.net.Uri;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f14270b;

    public /* synthetic */ f(z0 z0Var, int i10) {
        this.f14269a = i10;
        this.f14270b = z0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z Preview_Thumbnails$lambda$6$2$0;
        z CameraView$lambda$22$0$8$0;
        switch (this.f14269a) {
            case 0:
                Preview_Thumbnails$lambda$6$2$0 = OcrImportScreenKt.Preview_Thumbnails$lambda$6$2$0(this.f14270b, (Uri) obj);
                return Preview_Thumbnails$lambda$6$2$0;
            default:
                CameraView$lambda$22$0$8$0 = OcrImportScreenKt.CameraView$lambda$22$0$8$0(this.f14270b, (h5.l) obj);
                return CameraView$lambda$22$0$8$0;
        }
    }
}
