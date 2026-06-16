package io.elevenlabs.ocr;

import android.graphics.Path;
import s4.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14316d;

    public /* synthetic */ w(Object obj, int i10, int i11, int i12) {
        this.f14313a = i12;
        this.f14316d = obj;
        this.f14314b = i10;
        this.f14315c = i11;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        OcrImportState onImageSwap$lambda$0;
        switch (this.f14313a) {
            case 0:
                onImageSwap$lambda$0 = OcrImportViewModel.onImageSwap$lambda$0((OcrImportViewModel) this.f14316d, this.f14314b, this.f14315c, (OcrImportState) obj);
                return onImageSwap$lambda$0;
            default:
                p3.i iVar = (p3.i) this.f14316d;
                z zVar = (z) obj;
                s4.b bVar = zVar.f31177a;
                int d10 = zVar.d(this.f14314b);
                int d11 = zVar.d(this.f14315c);
                CharSequence charSequence = bVar.f31007e;
                if (d10 < 0 || d10 > d11 || d11 > charSequence.length()) {
                    StringBuilder g10 = z.h.g("start(", d10, ") or end(", d11, ") is out of range [0..");
                    g10.append(charSequence.length());
                    g10.append("], or start > end!");
                    z4.a.a(g10.toString());
                }
                Path path = new Path();
                t4.h hVar = bVar.f31006d;
                hVar.f32302f.getSelectionPath(d10, d11, path);
                int i10 = hVar.f32304h;
                if (i10 != 0 && !path.isEmpty()) {
                    path.offset(t2.u.P, i10);
                }
                p3.i iVar2 = new p3.i(path);
                float f10 = zVar.f31182f;
                iVar2.i((Float.floatToRawIntBits(t2.u.P) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
                iVar.d(iVar2, 0L);
                return sn.z.f31622a;
        }
    }
}
