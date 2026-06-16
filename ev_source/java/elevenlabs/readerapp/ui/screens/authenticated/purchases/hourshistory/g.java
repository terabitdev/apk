package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HoursHistoryViewModel f16649b;

    public /* synthetic */ g(HoursHistoryViewModel hoursHistoryViewModel, int i10) {
        this.f16648a = i10;
        this.f16649b = hoursHistoryViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z HoursHistoryScreen$lambda$0$0;
        HoursHistoryState refresh$lambda$0;
        switch (this.f16648a) {
            case 0:
                HoursHistoryScreen$lambda$0$0 = HoursHistoryScreenKt.HoursHistoryScreen$lambda$0$0(this.f16649b, (l) obj);
                return HoursHistoryScreen$lambda$0$0;
            default:
                refresh$lambda$0 = HoursHistoryViewModel.refresh$lambda$0(this.f16649b, (HoursHistoryState) obj);
                return refresh$lambda$0;
        }
    }
}
