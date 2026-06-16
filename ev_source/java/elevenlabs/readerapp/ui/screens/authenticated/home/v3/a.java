package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15617b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f15616a = i10;
        this.f15617b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z lambda__1087910177$lambda$0$0$0;
        z lambda__1064061713$lambda$0$0$0;
        z HomeScreenV3$lambda$10$0;
        switch (this.f15616a) {
            case 0:
                lambda__1087910177$lambda$0$0$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1087910177$lambda$0$0$0((BottomSheetControl) this.f15617b);
                return lambda__1087910177$lambda$0$0$0;
            case 1:
                lambda__1064061713$lambda$0$0$0 = ComposableSingletons$HomeScreenV3Kt.lambda__1064061713$lambda$0$0$0((BottomSheetControl) this.f15617b);
                return lambda__1064061713$lambda$0$0$0;
            default:
                HomeScreenV3$lambda$10$0 = HomeScreenV3Kt.HomeScreenV3$lambda$10$0((HomeViewModelV3) this.f15617b);
                return HomeScreenV3$lambda$10$0;
        }
    }
}
