package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16575b;

    public /* synthetic */ z1(long j4, int i10) {
        this.f16574a = i10;
        this.f16575b = j4;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState invokeSuspend$lambda$0;
        PlayerState invokeSuspend$lambda$02;
        PlayerState invokeSuspend$lambda$03;
        PlayerState emit$lambda$0;
        switch (this.f16574a) {
            case 0:
                invokeSuspend$lambda$0 = PlayerViewModel.AnonymousClass21.AnonymousClass3.invokeSuspend$lambda$0(this.f16575b, (PlayerState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = PlayerViewModel.AnonymousClass24.AnonymousClass1.invokeSuspend$lambda$0(this.f16575b, (PlayerState) obj);
                return invokeSuspend$lambda$02;
            case 2:
                invokeSuspend$lambda$03 = PlayerViewModel.AnonymousClass25.AnonymousClass3.invokeSuspend$lambda$0(this.f16575b, (PlayerState) obj);
                return invokeSuspend$lambda$03;
            default:
                emit$lambda$0 = PlayerViewModel.AnonymousClass4.AnonymousClass1.emit$lambda$0(this.f16575b, (PlayerState) obj);
                return emit$lambda$0;
        }
    }
}
