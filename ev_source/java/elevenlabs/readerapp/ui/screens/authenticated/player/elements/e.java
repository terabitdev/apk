package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetControl f16077b;

    public /* synthetic */ e(BottomSheetControl bottomSheetControl, int i10) {
        this.f16076a = i10;
        this.f16077b = bottomSheetControl;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z lambda__861251588$lambda$0$0;
        sn.z lambda_2029582497$lambda$0$0;
        int i10 = this.f16076a;
        l2 l2Var = (l2) obj;
        u2.m mVar = (u2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                lambda__861251588$lambda$0$0 = ComposableSingletons$BluetoothActionSelectorSheetKt.lambda__861251588$lambda$0$0(this.f16077b, l2Var, mVar, intValue);
                return lambda__861251588$lambda$0$0;
            default:
                lambda_2029582497$lambda$0$0 = ComposableSingletons$InAppSkipDurationSelectorSheetKt.lambda_2029582497$lambda$0$0(this.f16077b, l2Var, mVar, intValue);
                return lambda_2029582497$lambda$0$0;
        }
    }
}
