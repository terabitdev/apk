package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16839c;

    public /* synthetic */ l0(String str, String str2) {
        this.f16837a = 3;
        this.f16839c = str;
        this.f16838b = str2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ReadDetailsState emit$lambda$0;
        sn.z ReadDetailsScreenUi$lambda$19$3$0$0;
        ReadDetailsState doInitRedeemReadCode$lambda$0;
        switch (this.f16837a) {
            case 0:
                emit$lambda$0 = ReadDetailsViewModel.AnonymousClass7.AnonymousClass1.emit$lambda$0((MediaQueueState) this.f16838b, (String) this.f16839c, (ReadDetailsState) obj);
                return emit$lambda$0;
            case 1:
                return ReadDetailsViewModel$loadStoreProduct$1$1.d((ReadDetailsViewModel) this.f16838b, (AsyncCallResult.Error) this.f16839c, (ReadDetailsState) obj);
            case 2:
                ReadDetailsScreenUi$lambda$19$3$0$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$3$0$0((ho.l) this.f16838b, (z0) this.f16839c, (String) obj);
                return ReadDetailsScreenUi$lambda$19$3$0$0;
            default:
                doInitRedeemReadCode$lambda$0 = ReadDetailsViewModel.doInitRedeemReadCode$lambda$0((String) this.f16839c, (String) this.f16838b, (ReadDetailsState) obj);
                return doInitRedeemReadCode$lambda$0;
        }
    }

    public /* synthetic */ l0(Object obj, Object obj2, int i10) {
        this.f16837a = i10;
        this.f16838b = obj;
        this.f16839c = obj2;
    }
}
