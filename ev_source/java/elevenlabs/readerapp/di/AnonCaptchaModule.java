package io.elevenlabs.readerapp.di;

import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.readerapp.BuildConfig;
import io.elevenlabs.readerapp.usecase.AnonCaptchaTokenServiceImpl;
import io.elevenlabs.readerapp.usecase.CurrentActivityProvider;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/di/AnonCaptchaModule;", "", "bindsAnonCaptchaTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "impl", "Lio/elevenlabs/readerapp/usecase/AnonCaptchaTokenServiceImpl;", "bindsCurrentActivityProvider", "Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;", "Lio/elevenlabs/readerapp/di/CurrentActivityProviderImpl;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AnonCaptchaModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/readerapp/di/AnonCaptchaModule$Companion;", "", "<init>", "()V", "providesAnonCaptchaSiteKey", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final String providesAnonCaptchaSiteKey() {
            return BuildConfig.HCAPTCHA_ANON_SITE_KEY;
        }
    }

    AnonCaptchaTokenService bindsAnonCaptchaTokenService(AnonCaptchaTokenServiceImpl impl);

    CurrentActivityProvider bindsCurrentActivityProvider(CurrentActivityProviderImpl impl);
}
