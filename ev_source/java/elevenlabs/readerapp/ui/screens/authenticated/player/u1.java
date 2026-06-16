package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OptimizedReadPreparation;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerError;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.player.AudioPositionUpdate;
import io.elevenlabs.highlighter.WordTapTarget;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16355b;

    public /* synthetic */ u1(Object obj, int i10) {
        this.f16354a = i10;
        this.f16355b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState emit$lambda$0;
        PlayerState emit$lambda$02;
        PlayerState emit$lambda$03;
        PlayerState emit$lambda$04;
        PlayerState invokeSuspend$lambda$0;
        PlayerState emit$lambda$05;
        PlayerState invokeSuspend$lambda$0$0;
        PlayerPreferencesState onInAppSkipDurationButtonClick$lambda$0;
        PlayerPreferencesState onBluetoothButtonClick$lambda$0;
        sn.z PlayerScreenDialogs$lambda$40$0$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$3$0$0;
        PlayerState seekToAudioChapter$lambda$2;
        PlayerState onChangeDisplayMode$lambda$0;
        switch (this.f16354a) {
            case 0:
                emit$lambda$0 = PlayerViewModel.AnonymousClass1.C00421.emit$lambda$0((Customer) this.f16355b, (PlayerState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = PlayerViewModel.AnonymousClass16.AnonymousClass4.emit$lambda$0((OfflineReadData) this.f16355b, (PlayerState) obj);
                return emit$lambda$02;
            case 2:
                emit$lambda$03 = PlayerViewModel.AnonymousClass19.AnonymousClass4.emit$lambda$0((PlayerConnectionState) this.f16355b, (PlayerState) obj);
                return emit$lambda$03;
            case 3:
                emit$lambda$04 = PlayerViewModel.AnonymousClass22.AnonymousClass1.emit$lambda$0((PlayerError) this.f16355b, (PlayerState) obj);
                return emit$lambda$04;
            case 4:
                invokeSuspend$lambda$0 = PlayerViewModel.AnonymousClass30.AnonymousClass5.invokeSuspend$lambda$0((Voice) this.f16355b, (PlayerState) obj);
                return invokeSuspend$lambda$0;
            case 5:
                emit$lambda$05 = PlayerViewModel.AnonymousClass5.AnonymousClass1.emit$lambda$0((AudioPositionUpdate) this.f16355b, (PlayerState) obj);
                return emit$lambda$05;
            case 6:
                return PlayerViewModel$loadHtmlContent$2.a((OptimizedReadPreparation.Downloading) this.f16355b, (PlayerState) obj);
            case 7:
                invokeSuspend$lambda$0$0 = PlayerViewModel$onPlayPronunciationPreview$1$1.invokeSuspend$lambda$0$0((PronunciationPreviewState) this.f16355b, (PlayerState) obj);
                return invokeSuspend$lambda$0$0;
            case 8:
                return PlayerViewModel$seekToBookmark$1.d((BookmarkSeekTarget) this.f16355b, (PlayerState) obj);
            case 9:
                onInAppSkipDurationButtonClick$lambda$0 = PlayerPreferencesViewModel.onInAppSkipDurationButtonClick$lambda$0((InAppSkipDirection) this.f16355b, (PlayerPreferencesState) obj);
                return onInAppSkipDurationButtonClick$lambda$0;
            case 10:
                onBluetoothButtonClick$lambda$0 = PlayerPreferencesViewModel.onBluetoothButtonClick$lambda$0((BluetoothButton) this.f16355b, (PlayerPreferencesState) obj);
                return onBluetoothButtonClick$lambda$0;
            case 11:
                PlayerScreenDialogs$lambda$40$0$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$40$0$0((Pronunciation) this.f16355b, (PlayerViewModel) obj);
                return PlayerScreenDialogs$lambda$40$0$0;
            case 12:
                PlayerScreenUI$lambda$44$0$4$1$3$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$3$0$0((WordTapTarget) this.f16355b, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$4$1$3$0$0;
            case 13:
                seekToAudioChapter$lambda$2 = PlayerViewModel.seekToAudioChapter$lambda$2((Chapter) this.f16355b, (PlayerState) obj);
                return seekToAudioChapter$lambda$2;
            default:
                onChangeDisplayMode$lambda$0 = PlayerViewModel.onChangeDisplayMode$lambda$0((PlayerDisplayMode) this.f16355b, (PlayerState) obj);
                return onChangeDisplayMode$lambda$0;
        }
    }
}
