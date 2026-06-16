package io.elevenlabs.player;

import android.content.Context;
import fr.d0;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AssistantService;
import io.elevenlabs.domain.services.VibrationService;
import io.elevenlabs.player.tools.SupportClientToolsFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AssistantSessionManager_Factory implements ul.c {
    private final ul.f assistantServiceProvider;
    private final ul.f contextProvider;
    private final ul.f loggerProvider;
    private final ul.f scopeProvider;
    private final ul.f supportClientToolsFactoryProvider;
    private final ul.f vibrationServiceProvider;

    private AssistantSessionManager_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.assistantServiceProvider = fVar;
        this.vibrationServiceProvider = fVar2;
        this.loggerProvider = fVar3;
        this.contextProvider = fVar4;
        this.scopeProvider = fVar5;
        this.supportClientToolsFactoryProvider = fVar6;
    }

    public static AssistantSessionManager_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new AssistantSessionManager_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static AssistantSessionManager newInstance(AssistantService assistantService, VibrationService vibrationService, Logger logger, Context context, d0 d0Var, SupportClientToolsFactory supportClientToolsFactory) {
        return new AssistantSessionManager(assistantService, vibrationService, logger, context, d0Var, supportClientToolsFactory);
    }

    @Override // rn.a
    public AssistantSessionManager get() {
        return newInstance((AssistantService) this.assistantServiceProvider.get(), (VibrationService) this.vibrationServiceProvider.get(), (Logger) this.loggerProvider.get(), (Context) this.contextProvider.get(), (d0) this.scopeProvider.get(), (SupportClientToolsFactory) this.supportClientToolsFactoryProvider.get());
    }
}
