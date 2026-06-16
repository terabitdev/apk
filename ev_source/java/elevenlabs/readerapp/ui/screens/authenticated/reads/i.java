package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Success f16925b;

    public /* synthetic */ i(AsyncCallResult.Success success, int i10) {
        this.f16924a = i10;
        this.f16925b = success;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f16924a) {
            case 0:
                return AddSharedReadViewModel$load$1$1.h(this.f16925b, (AddSharedReadState) obj);
            default:
                return ReadLinkShareViewModel$setRead$1$1.h(this.f16925b, (ReadLinkShareState) obj);
        }
    }
}
