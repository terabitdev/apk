package io.elevenlabs.readerapp.core.router;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na.c0 f14411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14412c;

    public /* synthetic */ f(na.c0 c0Var, String str, int i10) {
        this.f14410a = i10;
        this.f14411b = c0Var;
        this.f14412c = str;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f14410a) {
            case 0:
                return RouterKt.h3(this.f14411b, this.f14412c);
            case 1:
                return RouterKt.U2(this.f14411b, this.f14412c);
            case 2:
                return RouterKt.u(this.f14411b, this.f14412c);
            default:
                return RouterKt.P3(this.f14411b, this.f14412c);
        }
    }
}
