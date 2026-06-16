package io.elevenlabs.data.services;

import android.content.Context;
import fr.d0;
import io.elevenlabs.data.api.ReadBookmarksAPI;
import io.elevenlabs.data.api.ReadBookmarksVideoAPI;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReadBookmarkServiceImpl_Factory implements ul.c {
    private final ul.f anonCaptchaTokenServiceProvider;
    private final ul.f apiProvider;
    private final ul.f apiVideoProvider;
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f appContextProvider;
    private final ul.f bookmarksDaoProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f coroutineScopeProvider;
    private final ul.f currentTimeUseCaseProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f fileServiceProvider;
    private final ul.f loggerProvider;

    private ReadBookmarkServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12) {
        this.loggerProvider = fVar;
        this.fileServiceProvider = fVar2;
        this.apiProvider = fVar3;
        this.apiVideoProvider = fVar4;
        this.bookmarksDaoProvider = fVar5;
        this.currentTimeUseCaseProvider = fVar6;
        this.dispatcherFactoryProvider = fVar7;
        this.coroutineScopeProvider = fVar8;
        this.appCheckTokenServiceProvider = fVar9;
        this.anonCaptchaTokenServiceProvider = fVar10;
        this.connectivityServiceProvider = fVar11;
        this.appContextProvider = fVar12;
    }

    public static ReadBookmarkServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12) {
        return new ReadBookmarkServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    public static ReadBookmarkServiceImpl newInstance(Logger logger, FileService fileService, ReadBookmarksAPI readBookmarksAPI, ReadBookmarksVideoAPI readBookmarksVideoAPI, BookmarksDao bookmarksDao, GetCurrentTimeUseCase getCurrentTimeUseCase, DispatcherFactory dispatcherFactory, d0 d0Var, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, ConnectivityService connectivityService, Context context) {
        return new ReadBookmarkServiceImpl(logger, fileService, readBookmarksAPI, readBookmarksVideoAPI, bookmarksDao, getCurrentTimeUseCase, dispatcherFactory, d0Var, appCheckTokenService, anonCaptchaTokenService, connectivityService, context);
    }

    @Override // rn.a
    public ReadBookmarkServiceImpl get() {
        return newInstance((Logger) this.loggerProvider.get(), (FileService) this.fileServiceProvider.get(), (ReadBookmarksAPI) this.apiProvider.get(), (ReadBookmarksVideoAPI) this.apiVideoProvider.get(), (BookmarksDao) this.bookmarksDaoProvider.get(), (GetCurrentTimeUseCase) this.currentTimeUseCaseProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (d0) this.coroutineScopeProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (Context) this.appContextProvider.get());
    }
}
