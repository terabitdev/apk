package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.ui.extensions.LazyListExtensionsKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.z f15336b;

    public /* synthetic */ l0(t1.z zVar, int i10) {
        this.f15335a = i10;
        this.f15336b = zVar;
    }

    @Override // ho.a
    public final Object invoke() {
        boolean reachedEnd$default;
        boolean reachedEnd$default2;
        switch (this.f15335a) {
            case 0:
                return CreateCollectionSheetKt$CollectionIconRow$1$1.d(this.f15336b);
            case 1:
                reachedEnd$default = LazyListExtensionsKt.reachedEnd$default(this.f15336b, 0, 1, null);
                return Boolean.valueOf(reachedEnd$default);
            default:
                reachedEnd$default2 = LazyListExtensionsKt.reachedEnd$default(this.f15336b, 0, 1, null);
                return Boolean.valueOf(reachedEnd$default2);
        }
    }
}
