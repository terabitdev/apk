package io.elevenlabs.readerapp.di;

import io.elevenlabs.domain.AppFlavor;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.services.player.PlayerConfiguration;
import io.elevenlabs.readerapp.BuildConfig;
import io.elevenlabs.readerapp.MainActivity;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/readerapp/di/ConfigModule;", "", "<init>", "()V", "configuration", "Lio/elevenlabs/domain/Configuration;", "playerConfiguration", "Lio/elevenlabs/domain/services/player/PlayerConfiguration;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConfigModule {
    public static final int $stable = 0;
    public static final ConfigModule INSTANCE = new ConfigModule();

    private ConfigModule() {
    }

    public final Configuration configuration() {
        String str = "";
        boolean z6 = !n.m0("");
        if (n.m0("")) {
            str = null;
        }
        return new Configuration(false, BuildConfig.API_URL, BuildConfig.API_WS, z6, BuildConfig.APPLICATION_ID, BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE, BuildConfig.REVENUECAT_KEY, str, AppFlavor.Production, false);
    }

    public final PlayerConfiguration playerConfiguration() {
        return new PlayerConfiguration(e0.f20562a.b(MainActivity.class), R.string.bookmarking_saved_toast_title, R.string.bookmarking_failed_toast_title, R.string.bookmark_not_supported_this_read);
    }
}
