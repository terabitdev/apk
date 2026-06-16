package io.elevenlabs.data.services;

import io.elevenlabs.data.api.DrmAPI;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.DeviceUuidService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DrmServiceImpl_Factory implements ul.c {
    private final ul.f deviceUuidServiceProvider;
    private final ul.f drmAPIProvider;
    private final ul.f loggerProvider;

    private DrmServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.drmAPIProvider = fVar;
        this.deviceUuidServiceProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static DrmServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new DrmServiceImpl_Factory(fVar, fVar2, fVar3);
    }

    public static DrmServiceImpl newInstance(DrmAPI drmAPI, DeviceUuidService deviceUuidService, Logger logger) {
        return new DrmServiceImpl(drmAPI, deviceUuidService, logger);
    }

    @Override // rn.a
    public DrmServiceImpl get() {
        return newInstance((DrmAPI) this.drmAPIProvider.get(), (DeviceUuidService) this.deviceUuidServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
