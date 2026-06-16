package io.elevenlabs.data.services;

import android.content.Context;
import android.content.SharedPreferences;
import fr.d0;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.api.ReadsUploadAPI;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.services.optimized.ChapterContentMemoryCache;
import io.elevenlabs.data.services.optimized.OptimizedReadCache;
import io.elevenlabs.data.services.optimized.OptimizedReadSplitter;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.FileService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReadsServiceImpl_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f anonCaptchaTokenServiceProvider;
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f appContextProvider;
    private final ul.f chapterMemoryCacheProvider;
    private final ul.f configurationProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f coroutineScopeProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f fileServiceProvider;
    private final ul.f jsonProvider;
    private final ul.f loggerProvider;
    private final ul.f optimizedReadCacheProvider;
    private final ul.f optimizedReadSplitterProvider;
    private final ul.f readMetadataSaverProvider;
    private final ul.f readsAPIProvider;
    private final ul.f readsDaoProvider;
    private final ul.f readsUploadAPIProvider;
    private final ul.f userSharedPreferencesProvider;

    private ReadsServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14, ul.f fVar15, ul.f fVar16, ul.f fVar17, ul.f fVar18, ul.f fVar19) {
        this.fileServiceProvider = fVar;
        this.readsUploadAPIProvider = fVar2;
        this.readsDaoProvider = fVar3;
        this.loggerProvider = fVar4;
        this.readsAPIProvider = fVar5;
        this.dispatcherFactoryProvider = fVar6;
        this.jsonProvider = fVar7;
        this.coroutineScopeProvider = fVar8;
        this.userSharedPreferencesProvider = fVar9;
        this.configurationProvider = fVar10;
        this.appCheckTokenServiceProvider = fVar11;
        this.anonCaptchaTokenServiceProvider = fVar12;
        this.appContextProvider = fVar13;
        this.connectivityServiceProvider = fVar14;
        this.analyticsProvider = fVar15;
        this.readMetadataSaverProvider = fVar16;
        this.optimizedReadCacheProvider = fVar17;
        this.optimizedReadSplitterProvider = fVar18;
        this.chapterMemoryCacheProvider = fVar19;
    }

    public static ReadsServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14, ul.f fVar15, ul.f fVar16, ul.f fVar17, ul.f fVar18, ul.f fVar19) {
        return new ReadsServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18, fVar19);
    }

    public static ReadsServiceImpl newInstance(FileService fileService, ReadsUploadAPI readsUploadAPI, ReadsDao readsDao, Logger logger, ReadsAPI readsAPI, DispatcherFactory dispatcherFactory, vr.c cVar, d0 d0Var, SharedPreferences sharedPreferences, Configuration configuration, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Context context, ConnectivityService connectivityService, Analytics analytics, ReadMetadataSaver readMetadataSaver, OptimizedReadCache optimizedReadCache, OptimizedReadSplitter optimizedReadSplitter, ChapterContentMemoryCache chapterContentMemoryCache) {
        return new ReadsServiceImpl(fileService, readsUploadAPI, readsDao, logger, readsAPI, dispatcherFactory, cVar, d0Var, sharedPreferences, configuration, appCheckTokenService, anonCaptchaTokenService, context, connectivityService, analytics, readMetadataSaver, optimizedReadCache, optimizedReadSplitter, chapterContentMemoryCache);
    }

    @Override // rn.a
    public ReadsServiceImpl get() {
        return newInstance((FileService) this.fileServiceProvider.get(), (ReadsUploadAPI) this.readsUploadAPIProvider.get(), (ReadsDao) this.readsDaoProvider.get(), (Logger) this.loggerProvider.get(), (ReadsAPI) this.readsAPIProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (vr.c) this.jsonProvider.get(), (d0) this.coroutineScopeProvider.get(), (SharedPreferences) this.userSharedPreferencesProvider.get(), (Configuration) this.configurationProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceProvider.get(), (Context) this.appContextProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (ReadMetadataSaver) this.readMetadataSaverProvider.get(), (OptimizedReadCache) this.optimizedReadCacheProvider.get(), (OptimizedReadSplitter) this.optimizedReadSplitterProvider.get(), (ChapterContentMemoryCache) this.chapterMemoryCacheProvider.get());
    }
}
