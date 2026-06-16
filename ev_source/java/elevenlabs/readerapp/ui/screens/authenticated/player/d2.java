package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16041c;

    public /* synthetic */ d2(UiBookmark uiBookmark, PlayerViewModel playerViewModel) {
        this.f16039a = 13;
        this.f16041c = uiBookmark;
        this.f16040b = playerViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState invokeSuspend$lambda$0;
        sn.z PlayerPreferencesScreenUI$lambda$0$1$0$0;
        sn.z PlayerPreferencesScreenUI$lambda$0$2$0;
        PlayerPreferencesState onFontFamilyChanged$lambda$0;
        PlayerPreferencesState selectTheme$lambda$0;
        sn.z PlayerScreenDialogs$lambda$39$0$0;
        sn.z PlayerScreenDialogs$lambda$39$0;
        sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$25$0$1;
        sn.z PlayerScreenUI$lambda$44$25$0$0;
        sn.z PlayerScreenUI$lambda$44$24$0$0;
        PlayerState onSleepTimerClick$lambda$0;
        PlayerState loadChapterContentForBookmark$lambda$2;
        PlayerState createBookmarkWithToast$lambda$0;
        switch (this.f16039a) {
            case 0:
                invokeSuspend$lambda$0 = PlayerViewModel$load$1$1.AnonymousClass1.invokeSuspend$lambda$0((PlayerViewModel) this.f16040b, (AsyncCallResult.Error) this.f16041c, (PlayerState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                return PlayerViewModel$onShareCurrentClipClick$1.d((String) this.f16040b, (ContentState) this.f16041c, (PlayerState) obj);
            case 2:
                PlayerPreferencesScreenUI$lambda$0$1$0$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreenUI$lambda$0$1$0$0((ho.p) this.f16040b, (BluetoothButton) this.f16041c, (BluetoothButtonAction) obj);
                return PlayerPreferencesScreenUI$lambda$0$1$0$0;
            case 3:
                PlayerPreferencesScreenUI$lambda$0$2$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreenUI$lambda$0$2$0((ho.p) this.f16040b, (InAppSkipDirection) this.f16041c, (SkipDuration) obj);
                return PlayerPreferencesScreenUI$lambda$0$2$0;
            case 4:
                onFontFamilyChanged$lambda$0 = PlayerPreferencesViewModel.onFontFamilyChanged$lambda$0((PlayerPreferencesViewModel) this.f16040b, (PlayerFontFamily) this.f16041c, (PlayerPreferencesState) obj);
                return onFontFamilyChanged$lambda$0;
            case 5:
                selectTheme$lambda$0 = PlayerPreferencesViewModel.selectTheme$lambda$0((PlayerPreferencesViewModel) this.f16040b, (PlayerTheme) this.f16041c, (PlayerPreferencesState) obj);
                return selectTheme$lambda$0;
            case 6:
                PlayerScreenDialogs$lambda$39$0$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$39$0$0((String) this.f16040b, (Pronunciation) this.f16041c, (PlayerViewModel) obj);
                return PlayerScreenDialogs$lambda$39$0$0;
            case 7:
                PlayerScreenDialogs$lambda$39$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$39$0((ho.l) this.f16040b, (Pronunciation) this.f16041c, (String) obj);
                return PlayerScreenDialogs$lambda$39$0;
            case 8:
                PlayerScreenUI$lambda$44$0$18$1$0$2$25$0$1 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$2$25$0$1((ir.z1) this.f16040b, (ho.a) this.f16041c, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$18$1$0$2$25$0$1;
            case 9:
                PlayerScreenUI$lambda$44$25$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$25$0$0((PlayerDisplayMode) this.f16040b, (Analytics.Event.PlayerActionSource) this.f16041c, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$25$0$0;
            case 10:
                PlayerScreenUI$lambda$44$24$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$24$0$0((DownloadAction) this.f16040b, (Analytics.Event.PlayerActionSource) this.f16041c, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$24$0$0;
            case 11:
                onSleepTimerClick$lambda$0 = PlayerViewModel.onSleepTimerClick$lambda$0((PlayerViewModel) this.f16040b, (Analytics.Event.SleepTimerSource) this.f16041c, (PlayerState) obj);
                return onSleepTimerClick$lambda$0;
            case 12:
                loadChapterContentForBookmark$lambda$2 = PlayerViewModel.loadChapterContentForBookmark$lambda$2((PlayerViewModel) this.f16040b, (Exception) this.f16041c, (PlayerState) obj);
                return loadChapterContentForBookmark$lambda$2;
            default:
                createBookmarkWithToast$lambda$0 = PlayerViewModel.createBookmarkWithToast$lambda$0((UiBookmark) this.f16041c, (PlayerViewModel) this.f16040b, (PlayerState) obj);
                return createBookmarkWithToast$lambda$0;
        }
    }

    public /* synthetic */ d2(Object obj, Object obj2, int i10) {
        this.f16039a = i10;
        this.f16040b = obj;
        this.f16041c = obj2;
    }
}
