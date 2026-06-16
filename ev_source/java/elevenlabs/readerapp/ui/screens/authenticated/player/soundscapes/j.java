package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SoundscapesViewModel f16335b;

    public /* synthetic */ j(SoundscapesViewModel soundscapesViewModel, int i10) {
        this.f16334a = i10;
        this.f16335b = soundscapesViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        SoundscapesContract.State resetAndClose$lambda$0;
        SoundscapesContract.State saveAndClose$lambda$0;
        SoundscapesContract.State stopPreview$lambda$0;
        switch (this.f16334a) {
            case 0:
                resetAndClose$lambda$0 = SoundscapesViewModel.resetAndClose$lambda$0(this.f16335b, (SoundscapesContract.State) obj);
                return resetAndClose$lambda$0;
            case 1:
                saveAndClose$lambda$0 = SoundscapesViewModel.saveAndClose$lambda$0(this.f16335b, (SoundscapesContract.State) obj);
                return saveAndClose$lambda$0;
            default:
                stopPreview$lambda$0 = SoundscapesViewModel.stopPreview$lambda$0(this.f16335b, (SoundscapesContract.State) obj);
                return stopPreview$lambda$0;
        }
    }
}
