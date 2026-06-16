package io.elevenlabs.data.services;

import io.elevenlabs.data.api.AuthorApi;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AuthorServiceImpl_Factory implements ul.c {
    private final ul.f authorApiProvider;
    private final ul.f loggerProvider;

    private AuthorServiceImpl_Factory(ul.f fVar, ul.f fVar2) {
        this.authorApiProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static AuthorServiceImpl_Factory create(ul.f fVar, ul.f fVar2) {
        return new AuthorServiceImpl_Factory(fVar, fVar2);
    }

    public static AuthorServiceImpl newInstance(AuthorApi authorApi, Logger logger) {
        return new AuthorServiceImpl(authorApi, logger);
    }

    @Override // rn.a
    public AuthorServiceImpl get() {
        return newInstance((AuthorApi) this.authorApiProvider.get(), (Logger) this.loggerProvider.get());
    }
}
