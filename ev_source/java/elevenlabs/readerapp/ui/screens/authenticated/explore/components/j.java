package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import io.elevenlabs.domain.model.KeyLabel;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyLabel f15441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f15442c;

    public /* synthetic */ j(KeyLabel keyLabel, z0 z0Var, int i10) {
        this.f15440a = i10;
        this.f15441b = keyLabel;
        this.f15442c = z0Var;
    }

    @Override // ho.a
    public final Object invoke() {
        z MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$2$0;
        z SingleOptionFilterBottomSheet$lambda$3$0$0$0$0$0;
        switch (this.f15440a) {
            case 0:
                MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$2$0 = MultiOptionFilterBottomSheetKt.MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$2$0(this.f15441b, this.f15442c);
                return MultiOptionFilterBottomSheet$lambda$3$0$4$1$0$2$0;
            default:
                SingleOptionFilterBottomSheet$lambda$3$0$0$0$0$0 = SingleOptionFilterBottomSheetKt.SingleOptionFilterBottomSheet$lambda$3$0$0$0$0$0(this.f15441b, this.f15442c);
                return SingleOptionFilterBottomSheet$lambda$3$0$0$0$0$0;
        }
    }
}
