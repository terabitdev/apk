package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.services.WhatsNewService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/data/services/WhatsNewServiceImpl;", "Lio/elevenlabs/domain/services/WhatsNewService;", "Landroid/content/SharedPreferences;", "userPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "shouldShowWhatsNew", "()Z", "Lsn/z;", "onWhatsNewShown", "()V", "delayUntilNextSession", "onNewSession", "reset", "Landroid/content/SharedPreferences;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class WhatsNewServiceImpl implements WhatsNewService {
    private static final int CURRENT_VERSION = 1;
    private static final String DELAY_KEY = "whatsNewDelayUntilNextSession";
    private static final String KEY = "whatsNewVersion";
    private final SharedPreferences userPreferences;

    public WhatsNewServiceImpl(@UserSharedPreferences SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.userPreferences = sharedPreferences;
    }

    @Override // io.elevenlabs.domain.services.WhatsNewService
    public void delayUntilNextSession() {
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.putBoolean(DELAY_KEY, true);
        edit.apply();
    }

    @Override // io.elevenlabs.domain.services.WhatsNewService
    public void onNewSession() {
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.putBoolean(DELAY_KEY, false);
        edit.apply();
    }

    @Override // io.elevenlabs.domain.services.WhatsNewService
    public void onWhatsNewShown() {
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.putInt(KEY, 1);
        edit.apply();
    }

    @Override // io.elevenlabs.domain.services.WhatsNewService
    public void reset() {
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.remove(KEY);
        edit.remove(DELAY_KEY);
        edit.apply();
    }

    @Override // io.elevenlabs.domain.services.WhatsNewService
    public boolean shouldShowWhatsNew() {
        if (this.userPreferences.getBoolean(DELAY_KEY, false) || this.userPreferences.getInt(KEY, 0) >= 1) {
            return false;
        }
        return true;
    }
}
