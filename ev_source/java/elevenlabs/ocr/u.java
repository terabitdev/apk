package io.elevenlabs.ocr;

import t1.z;
import u1.b0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14310b;

    public /* synthetic */ u(int i10, int i11) {
        this.f14309a = i11;
        this.f14310b = i10;
    }

    @Override // ho.a
    public final Object invoke() {
        String e10;
        Object valueOf;
        switch (this.f14309a) {
            case 0:
                e10 = defpackage.f.e(this.f14310b, "onDragStarted ");
                return e10;
            case 1:
                valueOf = Integer.valueOf(this.f14310b);
                return valueOf;
            case 2:
                return new z(this.f14310b, 0);
            default:
                return new b0(this.f14310b, 0);
        }
    }
}
