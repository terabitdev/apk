package io.elevenlabs.data.services;

import io.elevenlabs.data.api.NotificationsApi;
import io.elevenlabs.data.model.request.NotificationNewDeviceModel;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.elevenlabs.domain.services.DevService;
import io.elevenlabs.domain.services.DeviceUuidService;
import io.elevenlabs.domain.services.FileService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Cache;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/data/services/DevServiceImpl;", "Lio/elevenlabs/domain/services/DevService;", "Lokhttp3/Cache;", "cache", "Lio/elevenlabs/data/api/NotificationsApi;", "notificationsApi", "Lio/elevenlabs/domain/services/FileService;", "fileService", "Lio/elevenlabs/domain/services/DeviceUuidService;", "deviceUuidService", "Lio/elevenlabs/data/services/OnboardingServiceImpl;", "onboardingService", "<init>", "(Lokhttp3/Cache;Lio/elevenlabs/data/api/NotificationsApi;Lio/elevenlabs/domain/services/FileService;Lio/elevenlabs/domain/services/DeviceUuidService;Lio/elevenlabs/data/services/OnboardingServiceImpl;)V", "Lsn/z;", "clearCache", "()V", "clearFileCache", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "resendNotificationToken", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "clearWinBackCooldown", "Lokhttp3/Cache;", "Lio/elevenlabs/data/api/NotificationsApi;", "Lio/elevenlabs/domain/services/FileService;", "Lio/elevenlabs/domain/services/DeviceUuidService;", "Lio/elevenlabs/data/services/OnboardingServiceImpl;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DevServiceImpl implements DevService {
    private final Cache cache;
    private final DeviceUuidService deviceUuidService;
    private final FileService fileService;
    private final NotificationsApi notificationsApi;
    private final OnboardingServiceImpl onboardingService;

    public DevServiceImpl(Cache cache, NotificationsApi notificationsApi, FileService fileService, DeviceUuidService deviceUuidService, OnboardingServiceImpl onboardingServiceImpl) {
        cache.getClass();
        notificationsApi.getClass();
        fileService.getClass();
        deviceUuidService.getClass();
        onboardingServiceImpl.getClass();
        this.cache = cache;
        this.notificationsApi = notificationsApi;
        this.fileService = fileService;
        this.deviceUuidService = deviceUuidService;
        this.onboardingService = onboardingServiceImpl;
    }

    @Override // io.elevenlabs.domain.services.DevService
    public void clearCache() {
        this.cache.a();
    }

    @Override // io.elevenlabs.domain.services.DevService
    public void clearFileCache() {
        eo.k.h0(this.fileService.getCacheDirectory());
    }

    @Override // io.elevenlabs.domain.services.DevService
    public void clearWinBackCooldown() {
        this.onboardingService.setLastWinBackPaywallTimestamp$data_release(0L);
    }

    @Override // io.elevenlabs.domain.services.DevService
    public Object resendNotificationToken(String str, wn.c<? super z> cVar) {
        Object register = this.notificationsApi.register(new NotificationNewDeviceModel(str, this.deviceUuidService.getUuid()), cVar);
        if (register == xn.a.f37986a) {
            return register;
        }
        return z.f31622a;
    }
}
