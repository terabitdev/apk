package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements ho.p {
    public final /* synthetic */ int Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.t f17483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f17484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.q f17486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17487f;

    public /* synthetic */ k2(i3.t tVar, float f10, long j4, ho.q qVar, int i10, int i11, int i12) {
        this.f17482a = i12;
        this.f17483b = tVar;
        this.f17484c = f10;
        this.f17485d = j4;
        this.f17486e = qVar;
        this.f17487f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17482a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return ShadowKt.a(this.f17483b, this.f17484c, this.f17485d, this.f17486e, this.f17487f, this.Y, (u2.m) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return ShadowKt.d(this.f17483b, this.f17484c, this.f17485d, this.f17486e, this.f17487f, this.Y, (u2.m) obj, intValue2);
        }
    }
}
