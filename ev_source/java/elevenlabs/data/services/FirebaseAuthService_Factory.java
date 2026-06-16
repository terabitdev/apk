package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.firebase.auth.FirebaseAuth;
import io.elevenlabs.di.AppDatabase;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.MfaService;
import io.elevenlabs.domain.usecase.firebase.DetermineMfaTypeUseCase;
import io.elevenlabs.domain.usecase.firebase.ResolveMultiFactorAuthUseCase;
import io.elevenlabs.domain.usecase.firebase.ResolveTotpMfaUseCase;
import okhttp3.Cache;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class FirebaseAuthService_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f appDatabaseProvider;
    private final ul.f authProvider;
    private final ul.f cacheProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f deleteAccountAPIProvider;
    private final ul.f determineMfaTypeUseCaseProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f fileServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f mfaServiceProvider;
    private final ul.f resolveMultiFactorAuthUseCaseProvider;
    private final ul.f resolveTotpMfaUseCaseProvider;
    private final ul.f userSharedPreferencesProvider;

    private FirebaseAuthService_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14) {
        this.authProvider = fVar;
        this.loggerProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.cacheProvider = fVar4;
        this.appDatabaseProvider = fVar5;
        this.fileServiceProvider = fVar6;
        this.userSharedPreferencesProvider = fVar7;
        this.deleteAccountAPIProvider = fVar8;
        this.dispatcherFactoryProvider = fVar9;
        this.connectivityServiceProvider = fVar10;
        this.mfaServiceProvider = fVar11;
        this.determineMfaTypeUseCaseProvider = fVar12;
        this.resolveMultiFactorAuthUseCaseProvider = fVar13;
        this.resolveTotpMfaUseCaseProvider = fVar14;
    }

    public static FirebaseAuthService_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14) {
        return new FirebaseAuthService_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14);
    }

    public static FirebaseAuthService newInstance(FirebaseAuth firebaseAuth, Logger logger, jl.a aVar, Cache cache, AppDatabase appDatabase, FileService fileService, SharedPreferences sharedPreferences, jl.a aVar2, DispatcherFactory dispatcherFactory, ConnectivityService connectivityService, MfaService mfaService, DetermineMfaTypeUseCase determineMfaTypeUseCase, ResolveMultiFactorAuthUseCase resolveMultiFactorAuthUseCase, ResolveTotpMfaUseCase resolveTotpMfaUseCase) {
        return new FirebaseAuthService(firebaseAuth, logger, aVar, cache, appDatabase, fileService, sharedPreferences, aVar2, dispatcherFactory, connectivityService, mfaService, determineMfaTypeUseCase, resolveMultiFactorAuthUseCase, resolveTotpMfaUseCase);
    }

    @Override // rn.a
    public FirebaseAuthService get() {
        return newInstance((FirebaseAuth) this.authProvider.get(), (Logger) this.loggerProvider.get(), ul.b.a(this.analyticsProvider), (Cache) this.cacheProvider.get(), (AppDatabase) this.appDatabaseProvider.get(), (FileService) this.fileServiceProvider.get(), (SharedPreferences) this.userSharedPreferencesProvider.get(), ul.b.a(this.deleteAccountAPIProvider), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (MfaService) this.mfaServiceProvider.get(), (DetermineMfaTypeUseCase) this.determineMfaTypeUseCaseProvider.get(), (ResolveMultiFactorAuthUseCase) this.resolveMultiFactorAuthUseCaseProvider.get(), (ResolveTotpMfaUseCase) this.resolveTotpMfaUseCaseProvider.get());
    }
}
