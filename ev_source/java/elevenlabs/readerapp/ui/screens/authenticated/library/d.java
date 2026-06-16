package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.ui.extensions.LazyListExtensionsKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15820b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f15819a = i10;
        this.f15820b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        Boolean userConfirmed;
        sn.z DeleteReadConfirmationDialog$lambda$0$0;
        boolean reachedEnd$default;
        switch (this.f15819a) {
            case 0:
                userConfirmed = ((DeleteConfirmationState) this.f15820b).getUserConfirmed();
                return userConfirmed;
            case 1:
                DeleteReadConfirmationDialog$lambda$0$0 = LibraryScreenKt.DeleteReadConfirmationDialog$lambda$0$0((DeleteConfirmationState) this.f15820b);
                return DeleteReadConfirmationDialog$lambda$0$0;
            default:
                reachedEnd$default = LazyListExtensionsKt.reachedEnd$default((t1.z) this.f15820b, 0, 1, null);
                return Boolean.valueOf(reachedEnd$default);
        }
    }
}
