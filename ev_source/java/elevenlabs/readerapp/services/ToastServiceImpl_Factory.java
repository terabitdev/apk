package io.elevenlabs.readerapp.services;

import io.elevenlabs.domain.Logger;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ToastServiceImpl_Factory implements c {
    private final f loggerProvider;

    private ToastServiceImpl_Factory(f fVar) {
        this.loggerProvider = fVar;
    }

    public static ToastServiceImpl_Factory create(f fVar) {
        return new ToastServiceImpl_Factory(fVar);
    }

    public static ToastServiceImpl newInstance(Logger logger) {
        return new ToastServiceImpl(logger);
    }

    @Override // rn.a
    public ToastServiceImpl get() {
        return newInstance((Logger) this.loggerProvider.get());
    }
}
