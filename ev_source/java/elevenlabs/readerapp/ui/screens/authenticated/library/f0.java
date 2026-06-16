package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SyncStatus f15835b;

    public /* synthetic */ f0(SyncStatus syncStatus, int i10) {
        this.f15834a = i10;
        this.f15835b = syncStatus;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        LibraryState invokeSuspend$lambda$0;
        LibraryState invokeSuspend$lambda$02;
        switch (this.f15834a) {
            case 0:
                invokeSuspend$lambda$0 = LibraryViewModel.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$0(this.f15835b, (LibraryState) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = LibraryViewModel.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(this.f15835b, (LibraryState) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
