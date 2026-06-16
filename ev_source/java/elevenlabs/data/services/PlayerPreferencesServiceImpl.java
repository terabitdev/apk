package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.domain.services.PlayerPreferencesService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import sn.z;
import tn.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/data/services/PlayerPreferencesServiceImpl;", "Lio/elevenlabs/domain/services/PlayerPreferencesService;", "Landroid/content/SharedPreferences;", "userPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", SubscriberAttributeKt.JSON_NAME_KEY, "Lio/elevenlabs/domain/model/BluetoothButtonAction;", "default", "getButtonAction", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lio/elevenlabs/domain/model/BluetoothButtonAction;)Lio/elevenlabs/domain/model/BluetoothButtonAction;", "Lio/elevenlabs/domain/model/SkipDuration;", "getSkipDuration", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lio/elevenlabs/domain/model/SkipDuration;)Lio/elevenlabs/domain/model/SkipDuration;", "Lir/i;", "Lio/elevenlabs/domain/model/PlayerPreferences;", "getPreferences", "()Lir/i;", "preferences", "Lsn/z;", "updatePreferences", "(Lio/elevenlabs/domain/model/PlayerPreferences;Lwn/c;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerPreferencesServiceImpl implements PlayerPreferencesService {
    private static final boolean DEFAULT_AUTO_FULLSCREEN = true;
    private static final boolean DEFAULT_TAP_TO_SHOW_CONTROLS = false;
    private static final String KEY_AUTO_FULLSCREEN = "player_auto_fullscreen_enabled";
    private static final String KEY_BACK_BUTTON = "player_bluetooth_back_button";
    private static final String KEY_FORWARD_BUTTON = "player_bluetooth_forward_button";
    private static final String KEY_IN_APP_BACKWARD_SEEK_DURATION = "player_in_app_backward_seek_duration";
    private static final String KEY_IN_APP_FORWARD_SEEK_DURATION = "player_in_app_forward_seek_duration";
    private static final String KEY_NEXT_BUTTON = "player_bluetooth_next_button";
    private static final String KEY_PREVIOUS_BUTTON = "player_bluetooth_previous_button";
    private static final String KEY_TAP_TO_SHOW_CONTROLS = "player_tap_to_show_controls_enabled";
    private final SharedPreferences userPreferences;

    public PlayerPreferencesServiceImpl(@UserSharedPreferences SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.userPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [sn.l] */
    public final BluetoothButtonAction getButtonAction(SharedPreferences sharedPreferences, String str, BluetoothButtonAction bluetoothButtonAction) {
        BluetoothButtonAction lVar;
        String string = sharedPreferences.getString(str, bluetoothButtonAction.name());
        if (string == null) {
            string = bluetoothButtonAction.name();
        }
        try {
            lVar = BluetoothButtonAction.valueOf(string);
        } catch (Throwable th) {
            lVar = new sn.l(th);
        }
        if (m.a(lVar) == null) {
            bluetoothButtonAction = lVar;
        }
        return bluetoothButtonAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [sn.l] */
    public final SkipDuration getSkipDuration(SharedPreferences sharedPreferences, String str, SkipDuration skipDuration) {
        SkipDuration lVar;
        String string = sharedPreferences.getString(str, skipDuration.name());
        if (string == null) {
            string = skipDuration.name();
        }
        try {
            lVar = SkipDuration.valueOf(string);
        } catch (Throwable th) {
            lVar = new sn.l(th);
        }
        if (m.a(lVar) == null) {
            skipDuration = lVar;
        }
        return skipDuration;
    }

    @Override // io.elevenlabs.domain.services.PlayerPreferencesService
    public ir.i getPreferences() {
        return SharedPreferencesExtensionsKt.observeKeys(this.userPreferences, n.f1(new String[]{KEY_NEXT_BUTTON, KEY_PREVIOUS_BUTTON, KEY_FORWARD_BUTTON, KEY_BACK_BUTTON, KEY_IN_APP_FORWARD_SEEK_DURATION, KEY_IN_APP_BACKWARD_SEEK_DURATION, KEY_AUTO_FULLSCREEN, KEY_TAP_TO_SHOW_CONTROLS}), new PlayerPreferencesServiceImpl$getPreferences$1(this, null));
    }

    @Override // io.elevenlabs.domain.services.PlayerPreferencesService
    public Object updatePreferences(PlayerPreferences playerPreferences, wn.c<? super z> cVar) {
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.putString(KEY_NEXT_BUTTON, playerPreferences.getNextButtonAction().name());
        edit.putString(KEY_PREVIOUS_BUTTON, playerPreferences.getPreviousButtonAction().name());
        edit.putString(KEY_FORWARD_BUTTON, playerPreferences.getForwardButtonAction().name());
        edit.putString(KEY_BACK_BUTTON, playerPreferences.getBackButtonAction().name());
        edit.putString(KEY_IN_APP_FORWARD_SEEK_DURATION, playerPreferences.getInAppForwardSeekDuration().name());
        edit.putString(KEY_IN_APP_BACKWARD_SEEK_DURATION, playerPreferences.getInAppBackwardSeekDuration().name());
        edit.putBoolean(KEY_AUTO_FULLSCREEN, playerPreferences.getAutoFullscreenEnabled());
        edit.putBoolean(KEY_TAP_TO_SHOW_CONTROLS, playerPreferences.getTapToShowControlsEnabled());
        edit.apply();
        return z.f31622a;
    }
}
