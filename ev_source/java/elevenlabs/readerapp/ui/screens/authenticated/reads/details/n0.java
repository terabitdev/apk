package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Success f16847b;

    public /* synthetic */ n0(AsyncCallResult.Success success, int i10) {
        this.f16846a = i10;
        this.f16847b = success;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f16846a) {
            case 0:
                return ReadDetailsViewModel$loadReadDetails$2.d(this.f16847b, (ReadDetailsState) obj);
            default:
                return ReadDetailsViewModel$refreshReadLaterMembership$1.d(this.f16847b, (ReadDetailsState) obj);
        }
    }
}
