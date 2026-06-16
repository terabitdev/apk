package io.elevenlabs.data.api.adapter;

import io.elevenlabs.domain.Logger;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ResultCallAdapterFactory_Factory implements c {
    private final f jsonProvider;
    private final f loggerProvider;

    private ResultCallAdapterFactory_Factory(f fVar, f fVar2) {
        this.jsonProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static ResultCallAdapterFactory_Factory create(f fVar, f fVar2) {
        return new ResultCallAdapterFactory_Factory(fVar, fVar2);
    }

    public static ResultCallAdapterFactory newInstance(vr.c cVar, Logger logger) {
        return new ResultCallAdapterFactory(cVar, logger);
    }

    @Override // rn.a
    public ResultCallAdapterFactory get() {
        return newInstance((vr.c) this.jsonProvider.get(), (Logger) this.loggerProvider.get());
    }
}
