package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageContentInterestsViewModel f15041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Error f15042c;

    public /* synthetic */ v(ManageContentInterestsViewModel manageContentInterestsViewModel, AsyncCallResult.Error error, int i10) {
        this.f15040a = i10;
        this.f15041b = manageContentInterestsViewModel;
        this.f15042c = error;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ManageContentInterestsState invokeSuspend$lambda$1;
        switch (this.f15040a) {
            case 0:
                return ManageContentInterestsViewModel$loadInterests$1$1.h(this.f15041b, this.f15042c, (ManageContentInterestsState) obj);
            default:
                invokeSuspend$lambda$1 = ManageContentInterestsViewModel$submitInterests$1$1.invokeSuspend$lambda$1(this.f15041b, this.f15042c, (ManageContentInterestsState) obj);
                return invokeSuspend$lambda$1;
        }
    }
}
