package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f4.s1 f17348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17349d;

    public /* synthetic */ e0(int i10, int i11, f4.s1 s1Var) {
        this.f17346a = 0;
        this.f17347b = i10;
        this.f17349d = i11;
        this.f17348c = s1Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z minimumTouchTarget_VpY3zN4$lambda$0$0;
        switch (this.f17346a) {
            case 0:
                minimumTouchTarget_VpY3zN4$lambda$0$0 = ChipKt.minimumTouchTarget_VpY3zN4$lambda$0$0(this.f17347b, this.f17349d, this.f17348c, (f4.r1) obj);
                return minimumTouchTarget_VpY3zN4$lambda$0$0;
            case 1:
                ((f4.r1) obj).k(this.f17348c, jo.a.y((this.f17347b - r0.f8868a) / 2.0f), jo.a.y((this.f17349d - r0.f8869b) / 2.0f), t2.u.P);
                return sn.z.f31622a;
            case 2:
                ((f4.r1) obj).k(this.f17348c, jo.a.y((this.f17347b - r0.f8868a) / 2.0f), jo.a.y((this.f17349d - r0.f8869b) / 2.0f), t2.u.P);
                return sn.z.f31622a;
            case 3:
                ((f4.r1) obj).k(this.f17348c, this.f17347b, this.f17349d, t2.u.P);
                return sn.z.f31622a;
            default:
                ((f4.r1) obj).k(this.f17348c, this.f17347b, this.f17349d, t2.u.P);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ e0(int i10, f4.s1 s1Var, int i11, int i12) {
        this.f17346a = i12;
        this.f17347b = i10;
        this.f17348c = s1Var;
        this.f17349d = i11;
    }

    public /* synthetic */ e0(f4.s1 s1Var, int i10, int i11, int i12) {
        this.f17346a = i12;
        this.f17348c = s1Var;
        this.f17347b = i10;
        this.f17349d = i11;
    }
}
