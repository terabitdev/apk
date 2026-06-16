package io.elevenlabs.readerapp.ui.previews;

import io.elevenlabs.domain.model.PlayerActionButton;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.UserConfig;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"stubPlayerConfig", "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class UserConfigFactoryKt {
    public static final UserConfig.PlayerConfig stubPlayerConfig() {
        return new UserConfig.PlayerConfig(14L, PlayerFontFamily.LIBRE, PlayerTheme.SKY, PlayerActionButton.SLEEP_TIMER, PlayerDisplayMode.Text);
    }
}
