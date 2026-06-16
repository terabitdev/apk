package io.elevenlabs.player;

import android.content.Context;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.player.media.MediaItemCreator;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService_Factory implements ul.c {
    private final ul.f assistantTriggerEmitterProvider;
    private final ul.f contextProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f errorHandlerProvider;
    private final ul.f loggerProvider;
    private final ul.f mediaItemCreatorProvider;
    private final ul.f userConfigServiceProvider;

    private BackgroundPlayerControllerService_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.contextProvider = fVar;
        this.loggerProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
        this.userConfigServiceProvider = fVar4;
        this.mediaItemCreatorProvider = fVar5;
        this.assistantTriggerEmitterProvider = fVar6;
        this.errorHandlerProvider = fVar7;
    }

    public static BackgroundPlayerControllerService_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new BackgroundPlayerControllerService_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static BackgroundPlayerControllerService newInstance(Context context, Logger logger, DispatcherFactory dispatcherFactory, UserConfigService userConfigService, MediaItemCreator mediaItemCreator, AssistantTriggerEmitter assistantTriggerEmitter, PlayerErrorHandler playerErrorHandler) {
        return new BackgroundPlayerControllerService(context, logger, dispatcherFactory, userConfigService, mediaItemCreator, assistantTriggerEmitter, playerErrorHandler);
    }

    @Override // rn.a
    public BackgroundPlayerControllerService get() {
        return newInstance((Context) this.contextProvider.get(), (Logger) this.loggerProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (UserConfigService) this.userConfigServiceProvider.get(), (MediaItemCreator) this.mediaItemCreatorProvider.get(), (AssistantTriggerEmitter) this.assistantTriggerEmitterProvider.get(), (PlayerErrorHandler) this.errorHandlerProvider.get());
    }
}
