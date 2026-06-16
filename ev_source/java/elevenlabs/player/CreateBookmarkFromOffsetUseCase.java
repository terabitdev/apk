package io.elevenlabs.player;

import android.gov.nist.core.Separators;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.MediaAudioPositionResolver;
import io.elevenlabs.player.CreateBookmarkResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0086B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006!"}, d2 = {"Lio/elevenlabs/player/CreateBookmarkFromOffsetUseCase;", "", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "bookmarkService", "Lio/elevenlabs/domain/usecase/MediaAudioPositionResolver;", "mediaAudioPositionResolver", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/ReadBookmarkService;Lio/elevenlabs/domain/usecase/MediaAudioPositionResolver;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/player/CreateBookmarkResult$FailureReason;", "reason", "", "logMessage", "Lio/elevenlabs/player/CreateBookmarkResult$Failed;", "failed", "(Lio/elevenlabs/player/CreateBookmarkResult$FailureReason;Ljava/lang/String;)Lio/elevenlabs/player/CreateBookmarkResult$Failed;", "readId", "", "characterOffset", "Lio/elevenlabs/player/CreateBookmarkResult;", "invoke", "(Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "Lio/elevenlabs/domain/usecase/MediaAudioPositionResolver;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/Logger;", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CreateBookmarkFromOffsetUseCase {
    private static final String TAG = "CreateBookmarkFromOffsetUseCase";
    private final ReadBookmarkService bookmarkService;
    private final DispatcherFactory dispatcherFactory;
    private final Logger logger;
    private final MediaAudioPositionResolver mediaAudioPositionResolver;
    private final ReadsService readsService;

    public CreateBookmarkFromOffsetUseCase(ReadsService readsService, ReadBookmarkService readBookmarkService, MediaAudioPositionResolver mediaAudioPositionResolver, DispatcherFactory dispatcherFactory, Logger logger) {
        readsService.getClass();
        readBookmarkService.getClass();
        mediaAudioPositionResolver.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        this.readsService = readsService;
        this.bookmarkService = readBookmarkService;
        this.mediaAudioPositionResolver = mediaAudioPositionResolver;
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateBookmarkResult.Failed failed(CreateBookmarkResult.FailureReason reason, String logMessage) {
        Logger.logWarning$default(this.logger, TAG, logMessage + " (reason=" + reason + Separators.RPAREN, null, 4, null);
        return new CreateBookmarkResult.Failed(reason);
    }

    public final Object invoke(String str, long j4, wn.c<? super CreateBookmarkResult> cVar) {
        return g0.Q(this.dispatcherFactory.getDefault(), new CreateBookmarkFromOffsetUseCase$invoke$2(this, str, j4, null), cVar);
    }
}
