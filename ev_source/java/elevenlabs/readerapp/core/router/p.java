package io.elevenlabs.readerapp.core.router;

import i1.j2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.o f14457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f14458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na.c0 f14459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RouterViewModel f14460e;

    public /* synthetic */ p(i1.o oVar, j2 j2Var, na.c0 c0Var, RouterViewModel routerViewModel, int i10) {
        this.f14456a = i10;
        this.f14457b = oVar;
        this.f14458c = j2Var;
        this.f14459d = c0Var;
        this.f14460e = routerViewModel;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Router$lambda$20$0$4$0$0$21$4;
        sn.z Router$lambda$20$0$4$0$0$14$6;
        sn.z Router$lambda$20$0$4$0$0$7$1;
        sn.z Router$lambda$20$0$4$0$0$117$5;
        switch (this.f14456a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Router$lambda$20$0$4$0$0$21$4 = RouterKt.Router$lambda$20$0$4$0$0$21$4(this.f14457b, this.f14458c, this.f14459d, this.f14460e, (u2.m) obj, intValue);
                return Router$lambda$20$0$4$0$0$21$4;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Router$lambda$20$0$4$0$0$14$6 = RouterKt.Router$lambda$20$0$4$0$0$14$6(this.f14457b, this.f14458c, this.f14459d, this.f14460e, (u2.m) obj, intValue2);
                return Router$lambda$20$0$4$0$0$14$6;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                Router$lambda$20$0$4$0$0$7$1 = RouterKt.Router$lambda$20$0$4$0$0$7$1(this.f14457b, this.f14458c, this.f14459d, this.f14460e, (u2.m) obj, intValue3);
                return Router$lambda$20$0$4$0$0$7$1;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                Router$lambda$20$0$4$0$0$117$5 = RouterKt.Router$lambda$20$0$4$0$0$117$5(this.f14457b, this.f14458c, this.f14459d, this.f14460e, (u2.m) obj, intValue4);
                return Router$lambda$20$0$4$0$0$117$5;
        }
    }
}
