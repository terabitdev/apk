package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.CollectionMeta;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15863c;

    public /* synthetic */ n(Object obj, Object obj2, int i10) {
        this.f15861a = i10;
        this.f15862b = obj;
        this.f15863c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z DeleteReadConfirmationDialog$lambda$1$0;
        sn.z userCollections$lambda$2$0$0;
        sn.z LibraryScreen$lambda$9$1$0;
        switch (this.f15861a) {
            case 0:
                DeleteReadConfirmationDialog$lambda$1$0 = LibraryScreenKt.DeleteReadConfirmationDialog$lambda$1$0((ho.a) this.f15862b, (DeleteConfirmationState) this.f15863c);
                return DeleteReadConfirmationDialog$lambda$1$0;
            case 1:
                return DownloadActionHelper.a((ho.l) this.f15862b, (DownloadAction) this.f15863c);
            case 2:
                userCollections$lambda$2$0$0 = LibraryScreenKt.userCollections$lambda$2$0$0((ho.l) this.f15862b, (CollectionMeta) this.f15863c);
                return userCollections$lambda$2$0$0;
            default:
                LibraryScreen$lambda$9$1$0 = LibraryScreenKt.LibraryScreen$lambda$9$1$0((String) this.f15862b, (z0) this.f15863c);
                return LibraryScreen$lambda$9$1$0;
        }
    }
}
