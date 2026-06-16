package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.PronunciationPreviewState;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerViewModel f16047b;

    public /* synthetic */ e2(int i10, PlayerViewModel playerViewModel) {
        this.f16046a = i10;
        this.f16047b = playerViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z PlayerScreen$lambda$22$0;
        sn.z PlayerScreen$lambda$31$0;
        PlayerState onTogglePlayPause$lambda$0;
        PlayerState onSelectSpeedClick$lambda$0;
        PlayerState onSpeedPickerClose$lambda$0;
        PlayerState signalNavigatedToPaywall$lambda$0;
        PlayerState signalNavigatedToLowCredits$lambda$0;
        PlayerState signalNavigatedToVoiceDesignPaywall$lambda$0;
        PlayerState onGetTheFullReadClick$lambda$0;
        PlayerState onTtsSeek$lambda$0;
        switch (this.f16046a) {
            case 0:
                return PlayerViewModel$onPlayPronunciationPreview$1$1.h(this.f16047b, (PronunciationPreviewState) obj);
            case 1:
                PlayerScreen$lambda$22$0 = PlayerScreenKt.PlayerScreen$lambda$22$0(this.f16047b, (androidx.lifecycle.t) obj);
                return PlayerScreen$lambda$22$0;
            case 2:
                PlayerScreen$lambda$31$0 = PlayerScreenKt.PlayerScreen$lambda$31$0(this.f16047b, (ho.l) obj);
                return PlayerScreen$lambda$31$0;
            case 3:
                onTogglePlayPause$lambda$0 = PlayerViewModel.onTogglePlayPause$lambda$0(this.f16047b, (PlayerState) obj);
                return onTogglePlayPause$lambda$0;
            case 4:
                onSelectSpeedClick$lambda$0 = PlayerViewModel.onSelectSpeedClick$lambda$0(this.f16047b, (PlayerState) obj);
                return onSelectSpeedClick$lambda$0;
            case 5:
                onSpeedPickerClose$lambda$0 = PlayerViewModel.onSpeedPickerClose$lambda$0(this.f16047b, (PlayerState) obj);
                return onSpeedPickerClose$lambda$0;
            case 6:
                signalNavigatedToPaywall$lambda$0 = PlayerViewModel.signalNavigatedToPaywall$lambda$0(this.f16047b, (PlayerState) obj);
                return signalNavigatedToPaywall$lambda$0;
            case 7:
                signalNavigatedToLowCredits$lambda$0 = PlayerViewModel.signalNavigatedToLowCredits$lambda$0(this.f16047b, (PlayerState) obj);
                return signalNavigatedToLowCredits$lambda$0;
            case 8:
                signalNavigatedToVoiceDesignPaywall$lambda$0 = PlayerViewModel.signalNavigatedToVoiceDesignPaywall$lambda$0(this.f16047b, (PlayerState) obj);
                return signalNavigatedToVoiceDesignPaywall$lambda$0;
            case 9:
                onGetTheFullReadClick$lambda$0 = PlayerViewModel.onGetTheFullReadClick$lambda$0(this.f16047b, (PlayerState) obj);
                return onGetTheFullReadClick$lambda$0;
            default:
                onTtsSeek$lambda$0 = PlayerViewModel.onTtsSeek$lambda$0(this.f16047b, (PlayerState) obj);
                return onTtsSeek$lambda$0;
        }
    }
}
