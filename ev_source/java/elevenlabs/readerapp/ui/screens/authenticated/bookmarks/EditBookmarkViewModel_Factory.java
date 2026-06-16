package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadBookmarkService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class EditBookmarkViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f bookmarkServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;

    private EditBookmarkViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.bookmarkServiceProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.loggerProvider = fVar4;
    }

    public static EditBookmarkViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new EditBookmarkViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static EditBookmarkViewModel newInstance(DispatcherFactory dispatcherFactory, ReadBookmarkService readBookmarkService, Analytics analytics, Logger logger) {
        return new EditBookmarkViewModel(dispatcherFactory, readBookmarkService, analytics, logger);
    }

    @Override // rn.a
    public EditBookmarkViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadBookmarkService) this.bookmarkServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get());
    }
}
