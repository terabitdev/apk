package io.elevenlabs.readerapp.core.router;

import i1.j2;
import i4.q2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14432a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na.c0 f14433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr.d0 f14434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouterViewModel f14435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f14436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j2 f14437f;

    public /* synthetic */ i(RouterViewModel routerViewModel, na.c0 c0Var, fr.d0 d0Var, q2 q2Var, j2 j2Var) {
        this.f14435d = routerViewModel;
        this.f14433b = c0Var;
        this.f14434c = d0Var;
        this.f14436e = q2Var;
        this.f14437f = j2Var;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z Router$lambda$20$0$4$0$0$7;
        sn.z Router$lambda$20$0$4$0$0$17;
        switch (this.f14432a) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                Router$lambda$20$0$4$0$0$7 = RouterKt.Router$lambda$20$0$4$0$0$7(this.f14435d, this.f14433b, this.f14434c, this.f14436e, this.f14437f, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                return Router$lambda$20$0$4$0$0$7;
            default:
                int intValue2 = ((Integer) obj4).intValue();
                RouterViewModel routerViewModel = this.f14435d;
                Router$lambda$20$0$4$0$0$17 = RouterKt.Router$lambda$20$0$4$0$0$17(this.f14433b, this.f14434c, routerViewModel, this.f14436e, this.f14437f, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                return Router$lambda$20$0$4$0$0$17;
        }
    }

    public /* synthetic */ i(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, q2 q2Var, j2 j2Var) {
        this.f14433b = c0Var;
        this.f14434c = d0Var;
        this.f14435d = routerViewModel;
        this.f14436e = q2Var;
        this.f14437f = j2Var;
    }
}
