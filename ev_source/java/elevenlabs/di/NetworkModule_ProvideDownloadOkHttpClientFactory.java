package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.domain.CertificateMismatchReporter;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.AuthTokenService;
import io.elevenlabs.domain.services.DeviceUuidService;
import io.elevenlabs.domain.services.LocaleService;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ProvideDownloadOkHttpClientFactory implements ul.c {
    private final f authServiceProvider;
    private final f authTokenServiceProvider;
    private final f cacheProvider;
    private final f certReporterProvider;
    private final f configurationProvider;
    private final f deviceUuidServiceProvider;
    private final f jsonProvider;
    private final f localeServiceProvider;
    private final f loggerProvider;

    private NetworkModule_ProvideDownloadOkHttpClientFactory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8, f fVar9) {
        this.authTokenServiceProvider = fVar;
        this.authServiceProvider = fVar2;
        this.configurationProvider = fVar3;
        this.cacheProvider = fVar4;
        this.localeServiceProvider = fVar5;
        this.deviceUuidServiceProvider = fVar6;
        this.loggerProvider = fVar7;
        this.jsonProvider = fVar8;
        this.certReporterProvider = fVar9;
    }

    public static NetworkModule_ProvideDownloadOkHttpClientFactory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8, f fVar9) {
        return new NetworkModule_ProvideDownloadOkHttpClientFactory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
    }

    public static OkHttpClient provideDownloadOkHttpClient(AuthTokenService authTokenService, AuthService authService, Configuration configuration, Cache cache, LocaleService localeService, DeviceUuidService deviceUuidService, Logger logger, vr.c cVar, CertificateMismatchReporter certificateMismatchReporter) {
        OkHttpClient provideDownloadOkHttpClient = NetworkModule.INSTANCE.provideDownloadOkHttpClient(authTokenService, authService, configuration, cache, localeService, deviceUuidService, logger, cVar, certificateMismatchReporter);
        m0.n(provideDownloadOkHttpClient);
        return provideDownloadOkHttpClient;
    }

    @Override // rn.a
    public OkHttpClient get() {
        return provideDownloadOkHttpClient((AuthTokenService) this.authTokenServiceProvider.get(), (AuthService) this.authServiceProvider.get(), (Configuration) this.configurationProvider.get(), (Cache) this.cacheProvider.get(), (LocaleService) this.localeServiceProvider.get(), (DeviceUuidService) this.deviceUuidServiceProvider.get(), (Logger) this.loggerProvider.get(), (vr.c) this.jsonProvider.get(), (CertificateMismatchReporter) this.certReporterProvider.get());
    }
}
