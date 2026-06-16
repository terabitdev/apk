package io.elevenlabs.player;

import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerErrorHandler_Factory implements ul.c {
    private final ul.f loggerProvider;

    private PlayerErrorHandler_Factory(ul.f fVar) {
        this.loggerProvider = fVar;
    }

    public static PlayerErrorHandler_Factory create(ul.f fVar) {
        return new PlayerErrorHandler_Factory(fVar);
    }

    public static PlayerErrorHandler newInstance(Logger logger) {
        return new PlayerErrorHandler(logger);
    }

    @Override // rn.a
    public PlayerErrorHandler get() {
        return newInstance((Logger) this.loggerProvider.get());
    }
}
