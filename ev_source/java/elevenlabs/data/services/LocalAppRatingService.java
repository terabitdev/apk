package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.services.AppRatingService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/data/services/LocalAppRatingService;", "Lio/elevenlabs/domain/services/AppRatingService;", "Landroid/content/SharedPreferences;", "userPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "getListenedCount", "()I", "", "canRateApp", "()Z", "Lsn/z;", "onAppRated", "()V", "onListenedToContent", "Landroid/content/SharedPreferences;", "", "prefHasRatedApp", "Ljava/lang/String;", "prefListenedToContentCounter", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class LocalAppRatingService implements AppRatingService {
    private final String prefHasRatedApp;
    private final String prefListenedToContentCounter;
    private final SharedPreferences userPreferences;

    public LocalAppRatingService(@UserSharedPreferences SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.userPreferences = sharedPreferences;
        this.prefHasRatedApp = "hasRatedApp";
        this.prefListenedToContentCounter = "listenedToContentCounter";
    }

    private final int getListenedCount() {
        return this.userPreferences.getInt(this.prefListenedToContentCounter, 0);
    }

    @Override // io.elevenlabs.domain.services.AppRatingService
    public boolean canRateApp() {
        if (this.userPreferences.getBoolean(this.prefHasRatedApp, false) || getListenedCount() < 5) {
            return false;
        }
        return true;
    }

    @Override // io.elevenlabs.domain.services.AppRatingService
    public void onAppRated() {
        this.userPreferences.getBoolean(this.prefHasRatedApp, true);
    }

    @Override // io.elevenlabs.domain.services.AppRatingService
    public void onListenedToContent() {
        this.userPreferences.edit().putInt(this.prefListenedToContentCounter, getListenedCount() + 1).apply();
    }
}
