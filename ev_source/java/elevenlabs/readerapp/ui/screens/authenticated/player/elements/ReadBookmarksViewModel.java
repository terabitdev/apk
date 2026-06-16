package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.readerapp.core.MviViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0014\u0010(\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ReadBookmarksViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ReadBookmarksState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "bookmarkService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/services/ReadsService;", "readService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Landroid/content/Context;", "context", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadBookmarkService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/StringProvider;Landroid/content/Context;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;)V", "", "readId", "Lsn/z;", "initialize", "(Ljava/lang/String;)V", "Lio/elevenlabs/domain/model/Bookmark;", BackgroundPlayerAction.Bookmark.ACTION_ID, "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "deleteBookmark", "(Lio/elevenlabs/domain/model/Bookmark;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "downloadBookmarks", "()V", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/StringProvider;", "Landroid/content/Context;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadBookmarksViewModel extends MviViewModel<ReadBookmarksState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final ReadBookmarkService bookmarkService;
    private final Context context;
    private final Logger logger;
    private ReadsService readService;
    private final StringProvider stringProvider;
    private final String tag;
    private final ToastService toastService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadBookmarksViewModel(DispatcherFactory dispatcherFactory, ReadBookmarkService readBookmarkService, ToastService toastService, ReadsService readsService, StringProvider stringProvider, Context context, Logger logger, Analytics analytics) {
        super(new ReadBookmarksState(null, null, null, false, 15, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        readBookmarkService.getClass();
        toastService.getClass();
        readsService.getClass();
        stringProvider.getClass();
        context.getClass();
        logger.getClass();
        analytics.getClass();
        this.bookmarkService = readBookmarkService;
        this.toastService = toastService;
        this.readService = readsService;
        this.stringProvider = stringProvider;
        this.context = context;
        this.logger = logger;
        this.analytics = analytics;
        this.tag = "ReadBookmarksViewModel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadBookmarksState deleteBookmark$lambda$0(ReadBookmarksViewModel readBookmarksViewModel, Bookmark bookmark, ReadBookmarksState readBookmarksState) {
        readBookmarksState.getClass();
        g0.D(c1.h(readBookmarksViewModel), readBookmarksViewModel.getDispatcherFactory().getDefault(), null, new ReadBookmarksViewModel$deleteBookmark$1$1(readBookmarksViewModel, readBookmarksState, bookmark, null), 2);
        List<Bookmark> bookmarks = ((ReadBookmarksState) readBookmarksViewModel.getStateFlow().getValue()).getBookmarks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : bookmarks) {
            if (!kotlin.jvm.internal.m.c(((Bookmark) obj).getBookmarkId(), bookmark.getBookmarkId())) {
                arrayList.add(obj);
            }
        }
        return ReadBookmarksState.copy$default(readBookmarksState, null, null, arrayList, false, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadBookmarksState initialize$lambda$0(String str, ReadBookmarksState readBookmarksState) {
        readBookmarksState.getClass();
        return ReadBookmarksState.copy$default(readBookmarksState, str, null, null, false, 14, null);
    }

    public final MviViewModel.StateUpdate deleteBookmark(Bookmark bookmark) {
        bookmark.getClass();
        return queueStateUpdate(new io.elevenlabs.data.database.entities.reads.h(this, bookmark, 11));
    }

    public final void downloadBookmarks() {
        g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new ReadBookmarksViewModel$downloadBookmarks$1(this, null), 2);
    }

    public final void initialize(String readId) {
        readId.getClass();
        queueStateUpdate(new k(readId, 1));
        g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new ReadBookmarksViewModel$initialize$2(this, readId, null), 2);
        g0.D(c1.h(this), getDispatcherFactory().getDefault(), null, new ReadBookmarksViewModel$initialize$3(this, readId, null), 2);
    }
}
