package io.elevenlabs.data.services;

import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CharacterReportingServiceImpl_Factory implements ul.c {
    private final ul.f loggerProvider;

    private CharacterReportingServiceImpl_Factory(ul.f fVar) {
        this.loggerProvider = fVar;
    }

    public static CharacterReportingServiceImpl_Factory create(ul.f fVar) {
        return new CharacterReportingServiceImpl_Factory(fVar);
    }

    public static CharacterReportingServiceImpl newInstance(Logger logger) {
        return new CharacterReportingServiceImpl(logger);
    }

    @Override // rn.a
    public CharacterReportingServiceImpl get() {
        return newInstance((Logger) this.loggerProvider.get());
    }
}
