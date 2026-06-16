package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GenFMLoadingViewModel f16974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Error f16975c;

    public /* synthetic */ s(GenFMLoadingViewModel genFMLoadingViewModel, AsyncCallResult.Error error, int i10) {
        this.f16973a = i10;
        this.f16974b = genFMLoadingViewModel;
        this.f16975c = error;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        GenFMLoadingState invokeSuspend$lambda$0;
        switch (this.f16973a) {
            case 0:
                invokeSuspend$lambda$0 = GenFMLoadingViewModel.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$0(this.f16974b, this.f16975c, (GenFMLoadingState) obj);
                return invokeSuspend$lambda$0;
            default:
                return GenFMLoadingViewModel$retry$1$1.d(this.f16974b, this.f16975c, (GenFMLoadingState) obj);
        }
    }
}
