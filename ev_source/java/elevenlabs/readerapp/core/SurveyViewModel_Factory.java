package io.elevenlabs.readerapp.core;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class SurveyViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;

    private SurveyViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.dispatcherFactoryProvider = fVar;
        this.analyticsProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static SurveyViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new SurveyViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static SurveyViewModel newInstance(DispatcherFactory dispatcherFactory, Analytics analytics, Logger logger) {
        return new SurveyViewModel(dispatcherFactory, analytics, logger);
    }

    @Override // rn.a
    public SurveyViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get());
    }
}
