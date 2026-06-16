package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HoursLowViewModel f16664b;

    public /* synthetic */ o(HoursLowViewModel hoursLowViewModel, int i10) {
        this.f16663a = i10;
        this.f16664b = hoursLowViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z HoursLowScreen$lambda$1$0;
        HoursLowState load$lambda$0;
        switch (this.f16663a) {
            case 0:
                HoursLowScreen$lambda$1$0 = HoursLowScreenKt.HoursLowScreen$lambda$1$0(this.f16664b, (ho.l) obj);
                return HoursLowScreen$lambda$1$0;
            default:
                load$lambda$0 = HoursLowViewModel.load$lambda$0(this.f16664b, (HoursLowState) obj);
                return load$lambda$0;
        }
    }
}
