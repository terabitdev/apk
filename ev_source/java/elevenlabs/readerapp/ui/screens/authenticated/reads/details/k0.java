package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$loadReadDetails$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16833b;

    public /* synthetic */ k0(String str, int i10) {
        this.f16832a = i10;
        this.f16833b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ReadDetailsState emit$lambda$0;
        ReadDetailsState doInitRegular$lambda$0;
        switch (this.f16832a) {
            case 0:
                emit$lambda$0 = ReadDetailsViewModel.AnonymousClass5.AnonymousClass1.emit$lambda$0(this.f16833b, (ReadDetailsState) obj);
                return emit$lambda$0;
            case 1:
                return ReadDetailsViewModel$doInitRedeemReadCode$2.h(this.f16833b, (ReadDetailsState) obj);
            case 2:
                return ReadDetailsViewModel$loadReadDetails$1.AnonymousClass1.b(this.f16833b, (ReadDetailsState) obj);
            default:
                doInitRegular$lambda$0 = ReadDetailsViewModel.doInitRegular$lambda$0(this.f16833b, (ReadDetailsState) obj);
                return doInitRegular$lambda$0;
        }
    }
}
