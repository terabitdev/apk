package io.elevenlabs.payments;

import android.content.Context;
import fr.d0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.UserConfigService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class StoreCountryCodeRecordingServiceImpl_Factory implements c {
    private final f contextProvider;
    private final f coroutineScopeProvider;
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;
    private final f userConfigServiceProvider;

    private StoreCountryCodeRecordingServiceImpl_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        this.contextProvider = fVar;
        this.userConfigServiceProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
        this.loggerProvider = fVar4;
        this.coroutineScopeProvider = fVar5;
    }

    public static StoreCountryCodeRecordingServiceImpl_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        return new StoreCountryCodeRecordingServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static StoreCountryCodeRecordingServiceImpl newInstance(Context context, UserConfigService userConfigService, DispatcherFactory dispatcherFactory, Logger logger, d0 d0Var) {
        return new StoreCountryCodeRecordingServiceImpl(context, userConfigService, dispatcherFactory, logger, d0Var);
    }

    @Override // rn.a
    public StoreCountryCodeRecordingServiceImpl get() {
        return newInstance((Context) this.contextProvider.get(), (UserConfigService) this.userConfigServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), (d0) this.coroutineScopeProvider.get());
    }
}
