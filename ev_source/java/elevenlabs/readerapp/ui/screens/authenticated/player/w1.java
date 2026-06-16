package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16535b;

    public /* synthetic */ w1(boolean z6, int i10) {
        this.f16534a = i10;
        this.f16535b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState emit$lambda$0;
        PlayerState emit$lambda$02;
        PlayerState emit$lambda$03;
        PlayerState emit$lambda$04;
        PlayerState emit$lambda$05;
        PlayerState invokeSuspend$lambda$0;
        boolean PlayerScreenUI$lambda$44$0$18$1$0$0$1$0;
        PlayerState onBackgroundTap$lambda$0;
        switch (this.f16534a) {
            case 0:
                emit$lambda$0 = PlayerViewModel.AnonymousClass11.AnonymousClass4.emit$lambda$0(this.f16535b, (PlayerState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = PlayerViewModel.AnonymousClass12.AnonymousClass1.emit$lambda$0(this.f16535b, (PlayerState) obj);
                return emit$lambda$02;
            case 2:
                emit$lambda$03 = PlayerViewModel.AnonymousClass13.AnonymousClass1.emit$lambda$0(this.f16535b, (PlayerState) obj);
                return emit$lambda$03;
            case 3:
                emit$lambda$04 = PlayerViewModel.AnonymousClass14.AnonymousClass1.emit$lambda$0(this.f16535b, (PlayerState) obj);
                return emit$lambda$04;
            case 4:
                emit$lambda$05 = PlayerViewModel.AnonymousClass26.AnonymousClass1.emit$lambda$0(this.f16535b, (PlayerState) obj);
                return emit$lambda$05;
            case 5:
                invokeSuspend$lambda$0 = PlayerViewModel.AnonymousClass33.AnonymousClass3.invokeSuspend$lambda$0(this.f16535b, (PlayerState) obj);
                return invokeSuspend$lambda$0;
            case 6:
                PlayerScreenUI$lambda$44$0$18$1$0$0$1$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$0$1$0(this.f16535b, (PlayerState) obj);
                return Boolean.valueOf(PlayerScreenUI$lambda$44$0$18$1$0$0$1$0);
            default:
                onBackgroundTap$lambda$0 = PlayerViewModel.onBackgroundTap$lambda$0(this.f16535b, (PlayerState) obj);
                return onBackgroundTap$lambda$0;
        }
    }
}
