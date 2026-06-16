package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.services.PlayerPagerTeaserService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/data/services/PlayerPagerTeaserServiceImpl;", "Lio/elevenlabs/domain/services/PlayerPagerTeaserService;", "Landroid/content/SharedPreferences;", "userPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "shouldShowTeaser", "()Z", "Lsn/z;", "onTeaserShown", "()V", "Landroid/content/SharedPreferences;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerPagerTeaserServiceImpl implements PlayerPagerTeaserService {
    private static final String KEY = "hasShownPlayerPagerTeaser";
    private final SharedPreferences userPreferences;

    public PlayerPagerTeaserServiceImpl(@UserSharedPreferences SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.userPreferences = sharedPreferences;
    }

    @Override // io.elevenlabs.domain.services.PlayerPagerTeaserService
    public void onTeaserShown() {
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.putBoolean(KEY, true);
        edit.apply();
    }

    @Override // io.elevenlabs.domain.services.PlayerPagerTeaserService
    public boolean shouldShowTeaser() {
        return !this.userPreferences.getBoolean(KEY, false);
    }
}
