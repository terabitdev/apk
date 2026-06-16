package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16526a;

    public /* synthetic */ j(int i10) {
        this.f16526a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z Preview_VoicePickerSharedDeleteConfirmationDialog$lambda$0$0;
        z Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0;
        VoicePickerSharedContract.State onEvent$lambda$3;
        VoicePickerSharedContract.State onEvent$lambda$4;
        VoicePickerSharedContract.State onEvent$lambda$6;
        VoicePickerSharedContract.State onEvent$lambda$7;
        VoicePickerSharedContract.State onEvent$lambda$9;
        VoicePickerSharedContract.State initialise$lambda$1;
        VoicePickerSharedContract.State onEvent$lambda$10;
        VoicePickerSharedContract.State onEvent$lambda$14;
        switch (this.f16526a) {
            case 0:
                return VoicePickerSharedRepository$toggleVoicePreview$1.d((VoicePickerSharedContract.State) obj);
            case 1:
                Preview_VoicePickerSharedDeleteConfirmationDialog$lambda$0$0 = VoicePickerSharedDeleteConfirmationDialogKt.Preview_VoicePickerSharedDeleteConfirmationDialog$lambda$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoicePickerSharedDeleteConfirmationDialog$lambda$0$0;
            case 2:
                Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0 = VoicePickerSharedFavoriteRemoveConfirmationDialogKt.Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0((VoicePickerSharedContract.Event) obj);
                return Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0;
            case 3:
                onEvent$lambda$3 = VoicePickerSharedRepository.onEvent$lambda$3((VoicePickerSharedContract.State) obj);
                return onEvent$lambda$3;
            case 4:
                onEvent$lambda$4 = VoicePickerSharedRepository.onEvent$lambda$4((VoicePickerSharedContract.State) obj);
                return onEvent$lambda$4;
            case 5:
                onEvent$lambda$6 = VoicePickerSharedRepository.onEvent$lambda$6((VoicePickerSharedContract.State) obj);
                return onEvent$lambda$6;
            case 6:
                onEvent$lambda$7 = VoicePickerSharedRepository.onEvent$lambda$7((VoicePickerSharedContract.State) obj);
                return onEvent$lambda$7;
            case 7:
                onEvent$lambda$9 = VoicePickerSharedRepository.onEvent$lambda$9((VoicePickerSharedContract.State) obj);
                return onEvent$lambda$9;
            case 8:
                initialise$lambda$1 = VoicePickerSharedRepository.initialise$lambda$1((VoicePickerSharedContract.State) obj);
                return initialise$lambda$1;
            case 9:
                onEvent$lambda$10 = VoicePickerSharedRepository.onEvent$lambda$10((VoicePickerSharedContract.State) obj);
                return onEvent$lambda$10;
            default:
                onEvent$lambda$14 = VoicePickerSharedRepository.onEvent$lambda$14((VoicePickerSharedContract.State) obj);
                return onEvent$lambda$14;
        }
    }
}
