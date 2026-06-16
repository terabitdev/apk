package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.domain.model.SkipDuration;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.PlayerPreferencesServiceImpl$getPreferences$1", f = "PlayerPreferencesServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/domain/model/PlayerPreferences;", "Landroid/content/SharedPreferences;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerPreferencesServiceImpl$getPreferences$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlayerPreferencesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerPreferencesServiceImpl$getPreferences$1(PlayerPreferencesServiceImpl playerPreferencesServiceImpl, wn.c<? super PlayerPreferencesServiceImpl$getPreferences$1> cVar) {
        super(2, cVar);
        this.this$0 = playerPreferencesServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        PlayerPreferencesServiceImpl$getPreferences$1 playerPreferencesServiceImpl$getPreferences$1 = new PlayerPreferencesServiceImpl$getPreferences$1(this.this$0, cVar);
        playerPreferencesServiceImpl$getPreferences$1.L$0 = obj;
        return playerPreferencesServiceImpl$getPreferences$1;
    }

    @Override // ho.p
    public final Object invoke(SharedPreferences sharedPreferences, wn.c<? super PlayerPreferences> cVar) {
        return ((PlayerPreferencesServiceImpl$getPreferences$1) create(sharedPreferences, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        BluetoothButtonAction buttonAction;
        BluetoothButtonAction buttonAction2;
        BluetoothButtonAction buttonAction3;
        BluetoothButtonAction buttonAction4;
        SkipDuration skipDuration;
        SkipDuration skipDuration2;
        SharedPreferences sharedPreferences = (SharedPreferences) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            PlayerPreferencesServiceImpl playerPreferencesServiceImpl = this.this$0;
            PlayerPreferences.Defaults defaults = PlayerPreferences.Defaults.INSTANCE;
            buttonAction = playerPreferencesServiceImpl.getButtonAction(sharedPreferences, "player_bluetooth_next_button", defaults.getNEXT_BUTTON_ACTION());
            buttonAction2 = this.this$0.getButtonAction(sharedPreferences, "player_bluetooth_previous_button", defaults.getPREVIOUS_BUTTON_ACTION());
            buttonAction3 = this.this$0.getButtonAction(sharedPreferences, "player_bluetooth_forward_button", defaults.getFORWARD_BUTTON_ACTION());
            buttonAction4 = this.this$0.getButtonAction(sharedPreferences, "player_bluetooth_back_button", defaults.getBACK_BUTTON_ACTION());
            skipDuration = this.this$0.getSkipDuration(sharedPreferences, "player_in_app_forward_seek_duration", defaults.getIN_APP_FORWARD_SEEK_DURATION());
            skipDuration2 = this.this$0.getSkipDuration(sharedPreferences, "player_in_app_backward_seek_duration", defaults.getIN_APP_BACKWARD_SEEK_DURATION());
            return new PlayerPreferences(buttonAction, buttonAction2, buttonAction3, buttonAction4, skipDuration, skipDuration2, sharedPreferences.getBoolean("player_auto_fullscreen_enabled", true), sharedPreferences.getBoolean("player_tap_to_show_controls_enabled", false));
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
