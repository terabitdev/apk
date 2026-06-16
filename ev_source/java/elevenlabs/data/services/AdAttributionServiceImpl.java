package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.di.GlobalSharedPreferences;
import io.elevenlabs.domain.services.AdAttributionService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/elevenlabs/data/services/AdAttributionServiceImpl;", "Lio/elevenlabs/domain/services/AdAttributionService;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "recordArrivedFromAd", "", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AdAttributionServiceImpl implements AdAttributionService {
    private static final String ARRIVED_FROM_AD_KEY = "arrived_from_ad";
    private final SharedPreferences sharedPreferences;

    public AdAttributionServiceImpl(@GlobalSharedPreferences SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
    }

    @Override // io.elevenlabs.domain.services.AdAttributionService
    public boolean recordArrivedFromAd() {
        if (this.sharedPreferences.getBoolean(ARRIVED_FROM_AD_KEY, false)) {
            return false;
        }
        this.sharedPreferences.edit().putBoolean(ARRIVED_FROM_AD_KEY, true).apply();
        return true;
    }
}
