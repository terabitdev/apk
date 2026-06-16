package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HoursLowViewModel f16702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Error f16703c;

    public /* synthetic */ q(HoursLowViewModel hoursLowViewModel, AsyncCallResult.Error error, int i10) {
        this.f16701a = i10;
        this.f16702b = hoursLowViewModel;
        this.f16703c = error;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HoursLowState invokeSuspend$lambda$0;
        HoursLowState invokeSuspend$lambda$02;
        switch (this.f16701a) {
            case 0:
                invokeSuspend$lambda$0 = HoursLowViewModel$load$1$1.invokeSuspend$lambda$0(this.f16702b, this.f16703c, (HoursLowState) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = HoursLowViewModel$purchaseProduct$1$1.invokeSuspend$lambda$0(this.f16702b, this.f16703c, (HoursLowState) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
