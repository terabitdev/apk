package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AssistantPreferencesService;
import io.elevenlabs.domain.services.player.AssistantSessionService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AskAssistantViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f assistantPreferencesServiceProvider;
    private final ul.f assistantSessionServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f runtimePermissionsServiceProvider;

    private AskAssistantViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.dispatcherFactoryProvider = fVar;
        this.loggerProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.assistantPreferencesServiceProvider = fVar4;
        this.runtimePermissionsServiceProvider = fVar5;
        this.assistantSessionServiceProvider = fVar6;
    }

    public static AskAssistantViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new AskAssistantViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static AskAssistantViewModel newInstance(DispatcherFactory dispatcherFactory, Logger logger, Analytics analytics, AssistantPreferencesService assistantPreferencesService, jl.a aVar, AssistantSessionService assistantSessionService) {
        return new AskAssistantViewModel(dispatcherFactory, logger, analytics, assistantPreferencesService, aVar, assistantSessionService);
    }

    @Override // rn.a
    public AskAssistantViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get(), (AssistantPreferencesService) this.assistantPreferencesServiceProvider.get(), ul.b.a(this.runtimePermissionsServiceProvider), (AssistantSessionService) this.assistantSessionServiceProvider.get());
    }
}
