package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class BookmarkShareDetailsViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f bookmarkServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;

    private BookmarkShareDetailsViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.bookmarkServiceProvider = fVar2;
        this.readsServiceProvider = fVar3;
        this.loggerProvider = fVar4;
        this.analyticsProvider = fVar5;
    }

    public static BookmarkShareDetailsViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new BookmarkShareDetailsViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static BookmarkShareDetailsViewModel newInstance(DispatcherFactory dispatcherFactory, ReadBookmarkService readBookmarkService, ReadsService readsService, Logger logger, Analytics analytics) {
        return new BookmarkShareDetailsViewModel(dispatcherFactory, readBookmarkService, readsService, logger, analytics);
    }

    @Override // rn.a
    public BookmarkShareDetailsViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadBookmarkService) this.bookmarkServiceProvider.get(), (ReadsService) this.readsServiceProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
