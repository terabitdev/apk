package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15699b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f15698a = i10;
        this.f15699b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z lambda__802376801$lambda$0$0$0;
        z lambda_368859567$lambda$0$0$0;
        z HomeScreenV4$lambda$11$0;
        switch (this.f15698a) {
            case 0:
                lambda__802376801$lambda$0$0$0 = ComposableSingletons$HomeScreenV4Kt.lambda__802376801$lambda$0$0$0((BottomSheetControl) this.f15699b);
                return lambda__802376801$lambda$0$0$0;
            case 1:
                lambda_368859567$lambda$0$0$0 = ComposableSingletons$HomeScreenV4Kt.lambda_368859567$lambda$0$0$0((BottomSheetControl) this.f15699b);
                return lambda_368859567$lambda$0$0$0;
            default:
                HomeScreenV4$lambda$11$0 = HomeScreenV4Kt.HomeScreenV4$lambda$11$0((HomeViewModelV4) this.f15699b);
                return HomeScreenV4$lambda$11$0;
        }
    }
}
