package io.elevenlabs.player;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CharacterReportingService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class TriggerAssistantFromMediaButtonUseCase_Factory implements ul.c {
    private final ul.f assistantSessionManagerProvider;
    private final ul.f assistantTriggerEmitterProvider;
    private final ul.f characterReportingServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;

    private TriggerAssistantFromMediaButtonUseCase_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.assistantSessionManagerProvider = fVar;
        this.assistantTriggerEmitterProvider = fVar2;
        this.characterReportingServiceProvider = fVar3;
        this.dispatcherFactoryProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static TriggerAssistantFromMediaButtonUseCase_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new TriggerAssistantFromMediaButtonUseCase_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static TriggerAssistantFromMediaButtonUseCase newInstance(AssistantSessionManager assistantSessionManager, AssistantTriggerEmitter assistantTriggerEmitter, CharacterReportingService characterReportingService, DispatcherFactory dispatcherFactory, Logger logger) {
        return new TriggerAssistantFromMediaButtonUseCase(assistantSessionManager, assistantTriggerEmitter, characterReportingService, dispatcherFactory, logger);
    }

    @Override // rn.a
    public TriggerAssistantFromMediaButtonUseCase get() {
        return newInstance((AssistantSessionManager) this.assistantSessionManagerProvider.get(), (AssistantTriggerEmitter) this.assistantTriggerEmitterProvider.get(), (CharacterReportingService) this.characterReportingServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get());
    }
}
