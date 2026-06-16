package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GenFMLoadingViewModel f16955b;

    public /* synthetic */ o(GenFMLoadingViewModel genFMLoadingViewModel, int i10) {
        this.f16954a = i10;
        this.f16955b = genFMLoadingViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z GenFMLoadingScreen$lambda$3$0;
        GenFMLoadingState retry$lambda$0;
        switch (this.f16954a) {
            case 0:
                GenFMLoadingScreen$lambda$3$0 = GenFMLoadingScreenKt.GenFMLoadingScreen$lambda$3$0(this.f16955b, (ho.l) obj);
                return GenFMLoadingScreen$lambda$3$0;
            default:
                retry$lambda$0 = GenFMLoadingViewModel.retry$lambda$0(this.f16955b, (GenFMLoadingState) obj);
                return retry$lambda$0;
        }
    }
}
