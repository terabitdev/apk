package io.elevenlabs.data.services;

import android.content.Context;
import io.elevenlabs.data.api.StreamingAPI;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.services.player.Mp3ChunkDurationExtractor;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReadsStreamingService_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f anonCaptchaTokenServiceProvider;
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f appContextProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f jsonProvider;
    private final ul.f loggerProvider;
    private final ul.f mp3ChunkDurationExtractorProvider;
    private final ul.f playerVisibilityServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f streamingAPIProvider;
    private final ul.f voicesServiceProvider;

    private ReadsStreamingService_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13) {
        this.appContextProvider = fVar;
        this.loggerProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
        this.appCheckTokenServiceProvider = fVar4;
        this.anonCaptchaTokenServiceProvider = fVar5;
        this.mp3ChunkDurationExtractorProvider = fVar6;
        this.streamingAPIProvider = fVar7;
        this.analyticsProvider = fVar8;
        this.jsonProvider = fVar9;
        this.playerVisibilityServiceProvider = fVar10;
        this.readsServiceProvider = fVar11;
        this.voicesServiceProvider = fVar12;
        this.connectivityServiceProvider = fVar13;
    }

    public static ReadsStreamingService_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13) {
        return new ReadsStreamingService_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13);
    }

    public static ReadsStreamingService newInstance(Context context, Logger logger, DispatcherFactory dispatcherFactory, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Mp3ChunkDurationExtractor mp3ChunkDurationExtractor, StreamingAPI streamingAPI, Analytics analytics, vr.c cVar, PlayerVisibilityService playerVisibilityService, ReadsService readsService, VoicesService voicesService, ConnectivityService connectivityService) {
        return new ReadsStreamingService(context, logger, dispatcherFactory, appCheckTokenService, anonCaptchaTokenService, mp3ChunkDurationExtractor, streamingAPI, analytics, cVar, playerVisibilityService, readsService, voicesService, connectivityService);
    }

    @Override // rn.a
    public ReadsStreamingService get() {
        return newInstance((Context) this.appContextProvider.get(), (Logger) this.loggerProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceProvider.get(), (Mp3ChunkDurationExtractor) this.mp3ChunkDurationExtractorProvider.get(), (StreamingAPI) this.streamingAPIProvider.get(), (Analytics) this.analyticsProvider.get(), (vr.c) this.jsonProvider.get(), (PlayerVisibilityService) this.playerVisibilityServiceProvider.get(), (ReadsService) this.readsServiceProvider.get(), (VoicesService) this.voicesServiceProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get());
    }
}
