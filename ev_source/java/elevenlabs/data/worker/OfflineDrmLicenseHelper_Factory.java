package io.elevenlabs.data.worker;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.DrmService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OfflineDrmLicenseHelper_Factory implements c {
    private final f drmServiceProvider;
    private final f loggerProvider;

    private OfflineDrmLicenseHelper_Factory(f fVar, f fVar2) {
        this.drmServiceProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static OfflineDrmLicenseHelper_Factory create(f fVar, f fVar2) {
        return new OfflineDrmLicenseHelper_Factory(fVar, fVar2);
    }

    public static OfflineDrmLicenseHelper newInstance(DrmService drmService, Logger logger) {
        return new OfflineDrmLicenseHelper(drmService, logger);
    }

    @Override // rn.a
    public OfflineDrmLicenseHelper get() {
        return newInstance((DrmService) this.drmServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
