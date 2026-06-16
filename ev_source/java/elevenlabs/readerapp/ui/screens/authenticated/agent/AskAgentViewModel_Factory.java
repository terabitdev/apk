package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AgentContextService;
import io.elevenlabs.domain.services.SupportAgentService;
import io.elevenlabs.domain.services.SupportToolEvents;
import io.elevenlabs.domain.services.player.AssistantSessionService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AskAgentViewModel_Factory implements ul.c {
    private final ul.f agentContextServiceProvider;
    private final ul.f analyticsProvider;
    private final ul.f assistantSessionServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f supportAgentServiceProvider;
    private final ul.f supportToolEventsProvider;

    private AskAgentViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.dispatcherFactoryProvider = fVar;
        this.loggerProvider = fVar2;
        this.assistantSessionServiceProvider = fVar3;
        this.agentContextServiceProvider = fVar4;
        this.supportAgentServiceProvider = fVar5;
        this.supportToolEventsProvider = fVar6;
        this.analyticsProvider = fVar7;
    }

    public static AskAgentViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new AskAgentViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static AskAgentViewModel newInstance(DispatcherFactory dispatcherFactory, Logger logger, AssistantSessionService assistantSessionService, AgentContextService agentContextService, SupportAgentService supportAgentService, SupportToolEvents supportToolEvents, Analytics analytics) {
        return new AskAgentViewModel(dispatcherFactory, logger, assistantSessionService, agentContextService, supportAgentService, supportToolEvents, analytics);
    }

    @Override // rn.a
    public AskAgentViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), (AssistantSessionService) this.assistantSessionServiceProvider.get(), (AgentContextService) this.agentContextServiceProvider.get(), (SupportAgentService) this.supportAgentServiceProvider.get(), (SupportToolEvents) this.supportToolEventsProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
