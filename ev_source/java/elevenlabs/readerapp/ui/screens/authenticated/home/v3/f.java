package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import i1.j2;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeStateV4;
import io.elevenlabs.ui.components.LandscapistImageKt;
import io.elevenlabs.ui.components.ReorderableRowKt;
import java.util.List;
import r1.z1;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.p {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ Object B0;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15653a = 4;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15658f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f15659x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f15660y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f15661z0;

    public /* synthetic */ f(ho.a aVar, i3.t tVar, ho.p pVar, xk.a aVar2, ho.a aVar3, vk.i iVar, ho.l lVar, ho.r rVar, ho.s sVar, ho.r rVar2, int i10, int i11) {
        this.f15655c = aVar;
        this.f15661z0 = tVar;
        this.f15656d = pVar;
        this.A0 = aVar2;
        this.f15658f = aVar3;
        this.f15657e = iVar;
        this.f15654b = lVar;
        this.B0 = rVar;
        this.Y = sVar;
        this.Z = rVar2;
        this.f15659x0 = i10;
        this.f15660y0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z HomeScreenV3$lambda$12;
        z HomeScreenV4UI$lambda$5;
        z LandscapistCoilImage$lambda$3;
        z ReorderableRow$lambda$7;
        switch (this.f15653a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                HomeScreenV3$lambda$12 = HomeScreenV3Kt.HomeScreenV3$lambda$12((ho.a) this.f15655c, (HomeViewModelV3) this.A0, (ho.p) this.f15656d, (ho.p) this.f15657e, (ho.p) this.B0, this.f15654b, (ho.a) this.f15658f, (ho.a) this.f15661z0, (j2) this.Y, (i1.o) this.Z, this.f15659x0, this.f15660y0, (u2.m) obj, intValue);
                return HomeScreenV3$lambda$12;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                HomeScreenV4UI$lambda$5 = HomeScreenV4Kt.HomeScreenV4UI$lambda$5((HomeStateV4) this.f15661z0, this.f15654b, (ho.a) this.f15655c, (ho.p) this.f15656d, (ho.p) this.f15657e, (ho.l) this.A0, (ho.l) this.B0, (ho.a) this.f15658f, (j2) this.Y, (i1.o) this.Z, this.f15659x0, this.f15660y0, (u2.m) obj, intValue2);
                return HomeScreenV4UI$lambda$5;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                LandscapistCoilImage$lambda$3 = LandscapistImageKt.LandscapistCoilImage$lambda$3((ho.a) this.f15655c, (i3.t) this.f15661z0, (xk.a) this.A0, (ho.a) this.f15658f, (vk.i) this.f15656d, this.f15654b, (u3.c) this.f15657e, (ho.r) this.B0, (ho.s) this.Y, (ho.r) this.Z, this.f15659x0, this.f15660y0, (u2.m) obj, intValue3);
                return LandscapistCoilImage$lambda$3;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                ReorderableRow$lambda$7 = ReorderableRowKt.ReorderableRow$lambda$7((List) this.f15655c, (ho.p) this.f15656d, (i3.t) this.f15658f, (ho.r) this.f15661z0, this.f15654b, (t1.z) this.A0, (ho.r) this.f15657e, (r1.g) this.B0, (z1) this.Y, (i3.f) this.Z, this.f15659x0, this.f15660y0, (u2.m) obj, intValue4);
                return ReorderableRow$lambda$7;
            default:
                ((Integer) obj2).getClass();
                int M = u2.r.M(this.f15659x0 | 1);
                int M2 = u2.r.M(this.f15660y0);
                ig.f.a((ho.a) this.f15655c, (i3.t) this.f15661z0, (ho.p) this.f15656d, (xk.a) this.A0, (ho.a) this.f15658f, (vk.i) this.f15657e, this.f15654b, (ho.r) this.B0, (ho.s) this.Y, (ho.r) this.Z, (u2.m) obj, M, M2);
                return z.f31622a;
        }
    }

    public /* synthetic */ f(ho.a aVar, i3.t tVar, xk.a aVar2, ho.a aVar3, vk.i iVar, ho.l lVar, u3.c cVar, ho.r rVar, ho.s sVar, ho.r rVar2, int i10, int i11) {
        this.f15655c = aVar;
        this.f15661z0 = tVar;
        this.A0 = aVar2;
        this.f15658f = aVar3;
        this.f15656d = iVar;
        this.f15654b = lVar;
        this.f15657e = cVar;
        this.B0 = rVar;
        this.Y = sVar;
        this.Z = rVar2;
        this.f15659x0 = i10;
        this.f15660y0 = i11;
    }

    public /* synthetic */ f(ho.a aVar, HomeViewModelV3 homeViewModelV3, ho.p pVar, ho.p pVar2, ho.p pVar3, ho.l lVar, ho.a aVar2, ho.a aVar3, j2 j2Var, i1.o oVar, int i10, int i11) {
        this.f15655c = aVar;
        this.A0 = homeViewModelV3;
        this.f15656d = pVar;
        this.f15657e = pVar2;
        this.B0 = pVar3;
        this.f15654b = lVar;
        this.f15658f = aVar2;
        this.f15661z0 = aVar3;
        this.Y = j2Var;
        this.Z = oVar;
        this.f15659x0 = i10;
        this.f15660y0 = i11;
    }

    public /* synthetic */ f(HomeStateV4 homeStateV4, ho.l lVar, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar2, ho.l lVar3, ho.a aVar2, j2 j2Var, i1.o oVar, int i10, int i11) {
        this.f15661z0 = homeStateV4;
        this.f15654b = lVar;
        this.f15655c = aVar;
        this.f15656d = pVar;
        this.f15657e = pVar2;
        this.A0 = lVar2;
        this.B0 = lVar3;
        this.f15658f = aVar2;
        this.Y = j2Var;
        this.Z = oVar;
        this.f15659x0 = i10;
        this.f15660y0 = i11;
    }

    public /* synthetic */ f(List list, ho.p pVar, i3.t tVar, ho.r rVar, ho.l lVar, t1.z zVar, ho.r rVar2, r1.g gVar, z1 z1Var, i3.f fVar, int i10, int i11) {
        this.f15655c = list;
        this.f15656d = pVar;
        this.f15658f = tVar;
        this.f15661z0 = rVar;
        this.f15654b = lVar;
        this.A0 = zVar;
        this.f15657e = rVar2;
        this.B0 = gVar;
        this.Y = z1Var;
        this.Z = fVar;
        this.f15659x0 = i10;
        this.f15660y0 = i11;
    }
}
