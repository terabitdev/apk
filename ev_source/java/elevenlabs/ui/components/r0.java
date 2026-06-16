package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.t f17604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17605c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17607e;

    public /* synthetic */ r0(i3.t tVar, long j4, int i10, int i11, int i12) {
        this.f17603a = i12;
        this.f17604b = tVar;
        this.f17605c = j4;
        this.f17606d = i10;
        this.f17607e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17603a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return DividerKt.a(this.f17604b, this.f17605c, this.f17606d, this.f17607e, (u2.m) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return DividerKt.b(this.f17604b, this.f17605c, this.f17606d, this.f17607e, (u2.m) obj, intValue2);
        }
    }
}
