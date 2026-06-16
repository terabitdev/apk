package io.elevenlabs.readerapp.services;

import android.content.Context;
import io.elevenlabs.domain.Logger;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AndroidConnectivityService_Factory implements c {
    private final f contextProvider;
    private final f loggerProvider;

    private AndroidConnectivityService_Factory(f fVar, f fVar2) {
        this.contextProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static AndroidConnectivityService_Factory create(f fVar, f fVar2) {
        return new AndroidConnectivityService_Factory(fVar, fVar2);
    }

    public static AndroidConnectivityService newInstance(Context context, Logger logger) {
        return new AndroidConnectivityService(context, logger);
    }

    @Override // rn.a
    public AndroidConnectivityService get() {
        return newInstance((Context) this.contextProvider.get(), (Logger) this.loggerProvider.get());
    }
}
