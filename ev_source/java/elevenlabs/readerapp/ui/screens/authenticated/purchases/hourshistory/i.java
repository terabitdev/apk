package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory;

import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16653b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f16652a = i10;
        this.f16653b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z HoursHistoryScreenUI$lambda$7$0$1$0;
        switch (this.f16652a) {
            case 0:
                return HoursHistoryViewModel$refresh$1$2.d((AsyncCallResult.Success) this.f16653b, (HoursHistoryState) obj);
            default:
                HoursHistoryScreenUI$lambda$7$0$1$0 = HoursHistoryScreenKt.HoursHistoryScreenUI$lambda$7$0$1$0((z0) this.f16653b, (String) obj);
                return HoursHistoryScreenUI$lambda$7$0$1$0;
        }
    }
}
