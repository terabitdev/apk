package io.elevenlabs.data.services;

import android.content.Context;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AndroidFileService_Factory implements ul.c {
    private final ul.f contextProvider;
    private final ul.f loggerProvider;

    private AndroidFileService_Factory(ul.f fVar, ul.f fVar2) {
        this.contextProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static AndroidFileService_Factory create(ul.f fVar, ul.f fVar2) {
        return new AndroidFileService_Factory(fVar, fVar2);
    }

    public static AndroidFileService newInstance(Context context, Logger logger) {
        return new AndroidFileService(context, logger);
    }

    @Override // rn.a
    public AndroidFileService get() {
        return newInstance((Context) this.contextProvider.get(), (Logger) this.loggerProvider.get());
    }
}
