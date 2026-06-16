package io.elevenlabs.readerapp.ui.screens.authenticated;

import q2.i6;
import q2.j6;
import q2.x5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements ho.p {
    public final /* synthetic */ sn.d Y;
    public final /* synthetic */ sn.d Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15944f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f15945x0;

    public /* synthetic */ p0(j6 j6Var, i3.t tVar, boolean z6, x5 x5Var, p1.l lVar, ho.q qVar, c3.j jVar, int i10) {
        this.f15939a = 2;
        this.f15941c = j6Var;
        this.f15942d = tVar;
        this.f15940b = z6;
        this.f15943e = x5Var;
        this.f15944f = lVar;
        this.Y = qVar;
        this.Z = jVar;
        this.f15945x0 = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ImportOptionsBottomSheet$lambda$1;
        sn.z ImportOptionsBottomSheetUI$lambda$1;
        switch (this.f15939a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ImportOptionsBottomSheet$lambda$1 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheet$lambda$1(this.f15940b, (ho.a) this.f15941c, (ho.a) this.f15942d, (ho.a) this.f15943e, (ho.a) this.f15944f, (ho.a) this.Y, (ho.a) this.Z, this.f15945x0, (u2.m) obj, intValue);
                return ImportOptionsBottomSheet$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ImportOptionsBottomSheetUI$lambda$1 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheetUI$lambda$1(this.f15940b, (ho.a) this.f15941c, (ho.a) this.f15942d, (ho.a) this.f15943e, (ho.a) this.f15944f, (ho.a) this.Y, (ho.a) this.Z, this.f15945x0, (u2.m) obj, intValue2);
                return ImportOptionsBottomSheetUI$lambda$1;
            default:
                ((Integer) obj2).getClass();
                i6.b((j6) this.f15941c, (i3.t) this.f15942d, this.f15940b, (x5) this.f15943e, (p1.l) this.f15944f, (ho.q) this.Y, (c3.j) this.Z, (u2.m) obj, u2.r.M(this.f15945x0 | 1));
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ p0(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, int i10, int i11) {
        this.f15939a = i11;
        this.f15940b = z6;
        this.f15941c = aVar;
        this.f15942d = aVar2;
        this.f15943e = aVar3;
        this.f15944f = aVar4;
        this.Y = aVar5;
        this.Z = aVar6;
        this.f15945x0 = i10;
    }
}
