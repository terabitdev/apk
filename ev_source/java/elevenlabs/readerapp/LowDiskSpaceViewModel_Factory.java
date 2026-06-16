package io.elevenlabs.readerapp;

import android.app.Application;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class LowDiskSpaceViewModel_Factory implements ul.c {
    private final ul.f applicationProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;

    private LowDiskSpaceViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.applicationProvider = fVar;
        this.loggerProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
    }

    public static LowDiskSpaceViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new LowDiskSpaceViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static LowDiskSpaceViewModel newInstance(Application application, Logger logger, DispatcherFactory dispatcherFactory) {
        return new LowDiskSpaceViewModel(application, logger, dispatcherFactory);
    }

    @Override // rn.a
    public LowDiskSpaceViewModel get() {
        return newInstance((Application) this.applicationProvider.get(), (Logger) this.loggerProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
