package io.elevenlabs.ocr;

import android.content.Context;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14261b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f14260a = i10;
        this.f14261b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z CameraView$lambda$22$1$0$0;
        z CameraView$lambda$22$0$9$0$0;
        switch (this.f14260a) {
            case 0:
                return ComposableSingletons$OcrImportScreenKt.b((Context) this.f14261b);
            case 1:
                CameraView$lambda$22$1$0$0 = OcrImportScreenKt.CameraView$lambda$22$1$0$0((j.j) this.f14261b);
                return CameraView$lambda$22$1$0$0;
            default:
                CameraView$lambda$22$0$9$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$9$0$0((z0) this.f14261b);
                return CameraView$lambda$22$0$9$0$0;
        }
    }
}
