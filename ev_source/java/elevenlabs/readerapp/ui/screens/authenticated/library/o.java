package io.elevenlabs.readerapp.ui.screens.authenticated.library;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15865b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f15864a = i10;
        this.f15865b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z userCollections$lambda$3;
        sn.z userCollections$lambda$3$1;
        switch (this.f15864a) {
            case 0:
                userCollections$lambda$3 = LibraryScreenKt.userCollections$lambda$3((ho.a) this.f15865b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return userCollections$lambda$3;
            default:
                userCollections$lambda$3$1 = LibraryScreenKt.userCollections$lambda$3$1((String) this.f15865b, (r1.s) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return userCollections$lambda$3$1;
        }
    }
}
