package io.elevenlabs.readerapp;

import android.content.Context;
import fr.d0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.AppConfigService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class InstallIntegrityCheck_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f appConfigServiceProvider;
    private final ul.f contextProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f scopeProvider;

    private InstallIntegrityCheck_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.contextProvider = fVar;
        this.appConfigServiceProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.scopeProvider = fVar4;
        this.dispatcherFactoryProvider = fVar5;
    }

    public static InstallIntegrityCheck_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new InstallIntegrityCheck_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static InstallIntegrityCheck newInstance(Context context, AppConfigService appConfigService, Analytics analytics, d0 d0Var, DispatcherFactory dispatcherFactory) {
        return new InstallIntegrityCheck(context, appConfigService, analytics, d0Var, dispatcherFactory);
    }

    @Override // rn.a
    public InstallIntegrityCheck get() {
        return newInstance((Context) this.contextProvider.get(), (AppConfigService) this.appConfigServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (d0) this.scopeProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
