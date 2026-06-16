package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16102a;

    public /* synthetic */ f(int i10) {
        this.f16102a = i10;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z lambda__861251588$lambda$0;
        sn.z lambda_2029582497$lambda$0;
        switch (this.f16102a) {
            case 0:
                lambda__861251588$lambda$0 = ComposableSingletons$BluetoothActionSelectorSheetKt.lambda__861251588$lambda$0((BottomSheetControl) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return lambda__861251588$lambda$0;
            case 1:
                return ComposableSingletons$BookmarksSheetKt.a((t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
            default:
                lambda_2029582497$lambda$0 = ComposableSingletons$InAppSkipDurationSelectorSheetKt.lambda_2029582497$lambda$0((BottomSheetControl) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return lambda_2029582497$lambda$0;
        }
    }
}
