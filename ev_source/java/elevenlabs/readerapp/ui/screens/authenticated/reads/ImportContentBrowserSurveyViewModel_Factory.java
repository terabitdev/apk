package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ImportContentBrowserSurveyViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;

    private ImportContentBrowserSurveyViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.dispatcherFactoryProvider = fVar;
        this.analyticsProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static ImportContentBrowserSurveyViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new ImportContentBrowserSurveyViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static ImportContentBrowserSurveyViewModel newInstance(DispatcherFactory dispatcherFactory, Analytics analytics, Logger logger) {
        return new ImportContentBrowserSurveyViewModel(dispatcherFactory, analytics, logger);
    }

    @Override // rn.a
    public ImportContentBrowserSurveyViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get());
    }
}
