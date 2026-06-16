package io.elevenlabs.ocr;

import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import sn.z;
import u2.i0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f14267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f14268c;

    public /* synthetic */ e(z0 z0Var, z0 z0Var2, int i10) {
        this.f14266a = i10;
        this.f14267b = z0Var;
        this.f14268c = z0Var2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z Preview_Thumbnails$lambda$6$0$0;
        switch (this.f14266a) {
            case 0:
                Preview_Thumbnails$lambda$6$0$0 = OcrImportScreenKt.Preview_Thumbnails$lambda$6$0$0(this.f14267b, this.f14268c, ((Integer) obj).intValue());
                return Preview_Thumbnails$lambda$6$0$0;
            default:
                return ComposeExtensionsKt.c(this.f14267b, this.f14268c, (i0) obj);
        }
    }
}
