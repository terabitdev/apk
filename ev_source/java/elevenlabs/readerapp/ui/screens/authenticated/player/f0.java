package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerPreferences f16157b;

    public /* synthetic */ f0(PlayerPreferences playerPreferences, int i10) {
        this.f16156a = i10;
        this.f16157b = playerPreferences;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerPreferencesState invokeSuspend$lambda$0;
        PlayerState invokeSuspend$lambda$02;
        switch (this.f16156a) {
            case 0:
                invokeSuspend$lambda$0 = PlayerPreferencesViewModel.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(this.f16157b, (PlayerPreferencesState) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = PlayerViewModel.AnonymousClass32.AnonymousClass1.invokeSuspend$lambda$0(this.f16157b, (PlayerState) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
