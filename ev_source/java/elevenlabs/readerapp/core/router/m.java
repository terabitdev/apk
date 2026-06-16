package io.elevenlabs.readerapp.core.router;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14447b;

    public /* synthetic */ m(String str, int i10) {
        this.f14446a = i10;
        this.f14447b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z Router$lambda$20$0$4$0$0$26$1$0$0;
        RouterState onTextShare$lambda$0;
        switch (this.f14446a) {
            case 0:
                Router$lambda$20$0$4$0$0$26$1$0$0 = RouterKt.Router$lambda$20$0$4$0$0$26$1$0$0(this.f14447b, (na.g0) obj);
                return Router$lambda$20$0$4$0$0$26$1$0$0;
            default:
                onTextShare$lambda$0 = RouterViewModel.onTextShare$lambda$0(this.f14447b, (RouterState) obj);
                return onTextShare$lambda$0;
        }
    }
}
