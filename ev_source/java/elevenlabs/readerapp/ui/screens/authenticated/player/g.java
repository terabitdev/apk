package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16171b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f16170a = i10;
        this.f16171b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z lambda__824779134$lambda$0$0;
        sn.z PlayerPreferencesScreenUI$lambda$0$0$0$0;
        switch (this.f16170a) {
            case 0:
                lambda__824779134$lambda$0$0 = ComposableSingletons$PlayerPreferencesScreenKt.lambda__824779134$lambda$0$0((BottomSheetControl) this.f16171b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return lambda__824779134$lambda$0$0;
            default:
                PlayerPreferencesScreenUI$lambda$0$0$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreenUI$lambda$0$0$0$0((ho.a) this.f16171b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return PlayerPreferencesScreenUI$lambda$0$0$0$0;
        }
    }
}
