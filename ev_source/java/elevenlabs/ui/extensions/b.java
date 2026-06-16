package io.elevenlabs.ui.extensions;

import ho.l;
import p3.i0;
import r3.e;
import sn.z;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f17771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17772c;

    public /* synthetic */ b(float f10, int i10, long j4) {
        this.f17770a = i10;
        this.f17771b = f10;
        this.f17772c = j4;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z scaleWidth$lambda$0$0$0;
        switch (this.f17770a) {
            case 0:
                scaleWidth$lambda$0$0$0 = ComposeExtensionsKt.scaleWidth$lambda$0$0$0(this.f17771b, this.f17772c, (i0) obj);
                return scaleWidth$lambda$0$0$0;
            case 1:
                e eVar = (e) obj;
                float f10 = this.f17771b;
                float d02 = eVar.d0(f10);
                long floatToRawIntBits = (Float.floatToRawIntBits(eVar.d0(f10) / r3) << 32) | (Float.floatToRawIntBits(u.P) & 4294967295L);
                float d03 = eVar.d0(f10) / 2;
                float intBitsToFloat = Float.intBitsToFloat((int) (eVar.b() & 4294967295L));
                eVar.J(d02, this.f17772c, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(d03) << 32));
                return z.f31622a;
            default:
                e eVar2 = (e) obj;
                float f11 = this.f17771b;
                float d04 = eVar2.d0(f11);
                float f12 = 2;
                float d05 = eVar2.d0(f11) / f12;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (eVar2.b() >> 32));
                float d06 = eVar2.d0(f11) / f12;
                eVar2.J(d04, this.f17772c, (Float.floatToRawIntBits(u.P) << 32) | (Float.floatToRawIntBits(d05) & 4294967295L), (Float.floatToRawIntBits(d06) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32));
                return z.f31622a;
        }
    }
}
