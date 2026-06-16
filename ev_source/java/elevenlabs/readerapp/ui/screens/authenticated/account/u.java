package io.elevenlabs.readerapp.ui.screens.authenticated.account;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageContentInterestsViewModel f15039b;

    public /* synthetic */ u(ManageContentInterestsViewModel manageContentInterestsViewModel, int i10) {
        this.f15038a = i10;
        this.f15039b = manageContentInterestsViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ManageContentInterestsState onSaveClick$lambda$0;
        ManageContentInterestsState loadInterests$lambda$0;
        switch (this.f15038a) {
            case 0:
                onSaveClick$lambda$0 = ManageContentInterestsViewModel.onSaveClick$lambda$0(this.f15039b, (ManageContentInterestsState) obj);
                return onSaveClick$lambda$0;
            default:
                loadInterests$lambda$0 = ManageContentInterestsViewModel.loadInterests$lambda$0(this.f15039b, (ManageContentInterestsState) obj);
                return loadInterests$lambda$0;
        }
    }
}
