package io.elevenlabs.readerapp.core;

import android.content.Context;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppConfigService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NotificationViewModel_Factory implements ul.c {
    private final ul.f appConfigServiceProvider;
    private final ul.f applicationContextProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f notificationServiceProvider;

    private NotificationViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.applicationContextProvider = fVar;
        this.notificationServiceProvider = fVar2;
        this.appConfigServiceProvider = fVar3;
        this.dispatcherFactoryProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static NotificationViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new NotificationViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static NotificationViewModel newInstance(Context context, jl.a aVar, AppConfigService appConfigService, DispatcherFactory dispatcherFactory, Logger logger) {
        return new NotificationViewModel(context, aVar, appConfigService, dispatcherFactory, logger);
    }

    @Override // rn.a
    public NotificationViewModel get() {
        return newInstance((Context) this.applicationContextProvider.get(), ul.b.a(this.notificationServiceProvider), (AppConfigService) this.appConfigServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get());
    }
}
