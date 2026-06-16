package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadBookmarkService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class BookmarkViewModel_Factory implements ul.c {
    private final ul.f bookmarkServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;

    private BookmarkViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.dispatcherFactoryProvider = fVar;
        this.bookmarkServiceProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static BookmarkViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new BookmarkViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static BookmarkViewModel newInstance(DispatcherFactory dispatcherFactory, ReadBookmarkService readBookmarkService, Logger logger) {
        return new BookmarkViewModel(dispatcherFactory, readBookmarkService, logger);
    }

    @Override // rn.a
    public BookmarkViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadBookmarkService) this.bookmarkServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
