package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetControl f15314b;

    public /* synthetic */ g0(BottomSheetControl bottomSheetControl, int i10) {
        this.f15313a = i10;
        this.f15314b = bottomSheetControl;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f15313a) {
            case 0:
                return ComposableSingletons$AddReadToCollectionScreenKt.c(this.f15314b);
            default:
                return ComposableSingletons$CreateCollectionSheetKt.b(this.f15314b);
        }
    }
}
