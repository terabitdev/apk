package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import ho.l;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f15433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetControl f15434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f15435d;

    public /* synthetic */ h(l lVar, BottomSheetControl bottomSheetControl, z0 z0Var, int i10) {
        this.f15432a = i10;
        this.f15433b = lVar;
        this.f15434c = bottomSheetControl;
        this.f15435d = z0Var;
    }

    @Override // ho.a
    public final Object invoke() {
        z MultiOptionFilterBottomSheet$lambda$3$0$5$1$0;
        z SingleOptionFilterBottomSheet$lambda$3$0$1$1$0;
        switch (this.f15432a) {
            case 0:
                MultiOptionFilterBottomSheet$lambda$3$0$5$1$0 = MultiOptionFilterBottomSheetKt.MultiOptionFilterBottomSheet$lambda$3$0$5$1$0(this.f15433b, this.f15434c, this.f15435d);
                return MultiOptionFilterBottomSheet$lambda$3$0$5$1$0;
            default:
                SingleOptionFilterBottomSheet$lambda$3$0$1$1$0 = SingleOptionFilterBottomSheetKt.SingleOptionFilterBottomSheet$lambda$3$0$1$1$0(this.f15433b, this.f15434c, this.f15435d);
                return SingleOptionFilterBottomSheet$lambda$3$0$1$1$0;
        }
    }
}
