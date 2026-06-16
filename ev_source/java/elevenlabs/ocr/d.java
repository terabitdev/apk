package io.elevenlabs.ocr;

import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14265b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f14264a = i10;
        this.f14265b = obj;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z CameraView$lambda$22$0$10$0$5$1$0;
        z Preview_Thumbnails$lambda$6$1$0;
        switch (this.f14264a) {
            case 0:
                CameraView$lambda$22$0$10$0$5$1$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$1$0((ho.l) this.f14265b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return CameraView$lambda$22$0$10$0$5$1$0;
            default:
                Preview_Thumbnails$lambda$6$1$0 = OcrImportScreenKt.Preview_Thumbnails$lambda$6$1$0((z0) this.f14265b, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return Preview_Thumbnails$lambda$6$1$0;
        }
    }
}
