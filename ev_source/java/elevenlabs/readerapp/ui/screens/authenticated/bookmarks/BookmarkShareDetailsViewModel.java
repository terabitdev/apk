package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import a2.o0;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import fr.g0;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareDetailsViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareDetailsState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "bookmarkService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadBookmarkService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;)V", "", "bookmarkId", "voiceId", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "loadVideo", "(Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lfr/k1;", "checkReadImportStatus", "(Ljava/lang/String;)Lfr/k1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareAction;", "action", "showDisclaimer", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareAction;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "hideDisclaimer", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/Logger;", "getLogger", "()Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookmarkShareDetailsViewModel extends MviViewModel<BookmarkShareDetailsState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final ReadBookmarkService bookmarkService;
    private final Logger logger;
    private final ReadsService readsService;
    private final String tag;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BookmarkShareDetailsViewModel(DispatcherFactory dispatcherFactory, ReadBookmarkService readBookmarkService, ReadsService readsService, Logger logger, Analytics analytics) {
        super(new BookmarkShareDetailsState(false, null, null, false, false, null, 63, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        readBookmarkService.getClass();
        readsService.getClass();
        logger.getClass();
        analytics.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.bookmarkService = readBookmarkService;
        this.readsService = readsService;
        this.logger = logger;
        this.analytics = analytics;
        this.tag = "BookmarkShareDetailsViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookmarkShareDetailsState hideDisclaimer$lambda$0(BookmarkShareDetailsState bookmarkShareDetailsState) {
        bookmarkShareDetailsState.getClass();
        return BookmarkShareDetailsState.copy$default(bookmarkShareDetailsState, false, null, null, false, false, null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookmarkShareDetailsState loadVideo$lambda$0(BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, String str, String str2, BookmarkShareDetailsState bookmarkShareDetailsState) {
        bookmarkShareDetailsState.getClass();
        if (bookmarkShareDetailsState.isLoading()) {
            return bookmarkShareDetailsState;
        }
        g0.D(c1.h(bookmarkShareDetailsViewModel), bookmarkShareDetailsViewModel.getDispatcherFactory().getDefault(), null, new BookmarkShareDetailsViewModel$loadVideo$1$1(bookmarkShareDetailsViewModel, str, str2, null), 2);
        return BookmarkShareDetailsState.copy$default(bookmarkShareDetailsState, true, null, null, false, false, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookmarkShareDetailsState showDisclaimer$lambda$0(BookmarkShareAction bookmarkShareAction, BookmarkShareDetailsState bookmarkShareDetailsState) {
        bookmarkShareDetailsState.getClass();
        return BookmarkShareDetailsState.copy$default(bookmarkShareDetailsState, false, null, null, false, true, bookmarkShareAction, 15, null);
    }

    public final k1 checkReadImportStatus(String bookmarkId) {
        bookmarkId.getClass();
        return g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new BookmarkShareDetailsViewModel$checkReadImportStatus$1(this, bookmarkId, null), 2);
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final MviViewModel.StateUpdate hideDisclaimer() {
        return queueStateUpdate(new i(2));
    }

    public final MviViewModel.StateUpdate loadVideo(String bookmarkId, String voiceId) {
        bookmarkId.getClass();
        voiceId.getClass();
        return queueStateUpdate(new o0(this, bookmarkId, voiceId, 17));
    }

    public final MviViewModel.StateUpdate showDisclaimer(BookmarkShareAction action) {
        action.getClass();
        return queueStateUpdate(new h(action, 3));
    }
}
