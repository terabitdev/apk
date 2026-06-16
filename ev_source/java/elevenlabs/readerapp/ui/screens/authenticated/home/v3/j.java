package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import i1.j2;
import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15670c;

    public /* synthetic */ j(Object obj, Object obj2, int i10) {
        this.f15668a = i10;
        this.f15669b = obj;
        this.f15670c = obj2;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z HomeScreenV3UI$lambda$5$0$12$1;
        z homeItems$lambda$3;
        switch (this.f15668a) {
            case 0:
                HomeScreenV3UI$lambda$5$0$12$1 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$12$1((j2) this.f15669b, (i1.o) this.f15670c, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return HomeScreenV3UI$lambda$5$0$12$1;
            default:
                homeItems$lambda$3 = HomeScreenV3Kt.homeItems$lambda$3((HomeStateV3) this.f15669b, (ho.l) this.f15670c, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return homeItems$lambda$3;
        }
    }
}
