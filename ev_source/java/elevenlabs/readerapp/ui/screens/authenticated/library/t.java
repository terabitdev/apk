package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.services.ReadsService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadsService.SortBy f15891b;

    public /* synthetic */ t(ReadsService.SortBy sortBy, int i10) {
        this.f15890a = i10;
        this.f15891b = sortBy;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0$0;
        LibraryState sortBy$lambda$0;
        switch (this.f15890a) {
            case 0:
                LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0$0 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0$0(this.f15891b, (LibraryViewModel) obj);
                return LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0$0;
            default:
                sortBy$lambda$0 = LibraryViewModel.sortBy$lambda$0(this.f15891b, (LibraryState) obj);
                return sortBy$lambda$0;
        }
    }
}
