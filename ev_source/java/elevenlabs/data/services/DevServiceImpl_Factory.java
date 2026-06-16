package io.elevenlabs.data.services;

import io.elevenlabs.data.api.NotificationsApi;
import io.elevenlabs.domain.services.DeviceUuidService;
import io.elevenlabs.domain.services.FileService;
import okhttp3.Cache;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DevServiceImpl_Factory implements ul.c {
    private final ul.f cacheProvider;
    private final ul.f deviceUuidServiceProvider;
    private final ul.f fileServiceProvider;
    private final ul.f notificationsApiProvider;
    private final ul.f onboardingServiceProvider;

    private DevServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.cacheProvider = fVar;
        this.notificationsApiProvider = fVar2;
        this.fileServiceProvider = fVar3;
        this.deviceUuidServiceProvider = fVar4;
        this.onboardingServiceProvider = fVar5;
    }

    public static DevServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new DevServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static DevServiceImpl newInstance(Cache cache, NotificationsApi notificationsApi, FileService fileService, DeviceUuidService deviceUuidService, OnboardingServiceImpl onboardingServiceImpl) {
        return new DevServiceImpl(cache, notificationsApi, fileService, deviceUuidService, onboardingServiceImpl);
    }

    @Override // rn.a
    public DevServiceImpl get() {
        return newInstance((Cache) this.cacheProvider.get(), (NotificationsApi) this.notificationsApiProvider.get(), (FileService) this.fileServiceProvider.get(), (DeviceUuidService) this.deviceUuidServiceProvider.get(), (OnboardingServiceImpl) this.onboardingServiceProvider.get());
    }
}
