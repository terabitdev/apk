package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.content.Context;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ReadBookmarksViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f bookmarkServiceProvider;
    private final ul.f contextProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readServiceProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private ReadBookmarksViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        this.dispatcherFactoryProvider = fVar;
        this.bookmarkServiceProvider = fVar2;
        this.toastServiceProvider = fVar3;
        this.readServiceProvider = fVar4;
        this.stringProvider = fVar5;
        this.contextProvider = fVar6;
        this.loggerProvider = fVar7;
        this.analyticsProvider = fVar8;
    }

    public static ReadBookmarksViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        return new ReadBookmarksViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8);
    }

    public static ReadBookmarksViewModel newInstance(DispatcherFactory dispatcherFactory, ReadBookmarkService readBookmarkService, ToastService toastService, ReadsService readsService, StringProvider stringProvider, Context context, Logger logger, Analytics analytics) {
        return new ReadBookmarksViewModel(dispatcherFactory, readBookmarkService, toastService, readsService, stringProvider, context, logger, analytics);
    }

    @Override // rn.a
    public ReadBookmarksViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadBookmarkService) this.bookmarkServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (ReadsService) this.readServiceProvider.get(), (StringProvider) this.stringProvider.get(), (Context) this.contextProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
