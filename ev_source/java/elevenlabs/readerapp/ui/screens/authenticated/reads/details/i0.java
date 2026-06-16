package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16823b;

    public /* synthetic */ i0(boolean z6, int i10) {
        this.f16822a = i10;
        this.f16823b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ReadDetailsState emit$lambda$0;
        ReadDetailsState emit$lambda$02;
        ReadDetailsState emit$lambda$03;
        ReadDetailsState emit$lambda$04;
        sn.z ReadDetailsScreenUi$lambda$28$0$0;
        switch (this.f16822a) {
            case 0:
                emit$lambda$0 = ReadDetailsViewModel.AnonymousClass1.AnonymousClass3.emit$lambda$0(this.f16823b, (ReadDetailsState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = ReadDetailsViewModel.AnonymousClass2.C00482.emit$lambda$0(this.f16823b, (ReadDetailsState) obj);
                return emit$lambda$02;
            case 2:
                emit$lambda$03 = ReadDetailsViewModel.AnonymousClass3.AnonymousClass1.emit$lambda$0(this.f16823b, (ReadDetailsState) obj);
                return emit$lambda$03;
            case 3:
                emit$lambda$04 = ReadDetailsViewModel.AnonymousClass8.AnonymousClass1.emit$lambda$0(this.f16823b, (ReadDetailsState) obj);
                return emit$lambda$04;
            default:
                ReadDetailsScreenUi$lambda$28$0$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$28$0$0(this.f16823b, (ReadDetailsViewModel) obj);
                return ReadDetailsScreenUi$lambda$28$0$0;
        }
    }
}
