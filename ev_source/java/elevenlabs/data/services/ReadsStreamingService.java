package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.data.api.StreamingAPI;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.BinarySearchList;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.StreamingService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.services.player.Mp3ChunkDurationExtractor;
import io.livekit.android.room.SignalClient;
import ir.j1;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010;R\u0014\u0010<\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020>0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020*0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010C¨\u0006E"}, d2 = {"Lio/elevenlabs/data/services/ReadsStreamingService;", "Lio/elevenlabs/domain/services/StreamingService;", "Landroid/content/Context;", "appContext", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "Lio/elevenlabs/domain/services/player/Mp3ChunkDurationExtractor;", "mp3ChunkDurationExtractor", "Lio/elevenlabs/data/api/StreamingAPI;", "streamingAPI", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lvr/c;", "json", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "playerVisibilityService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "<init>", "(Landroid/content/Context;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;Lio/elevenlabs/domain/services/player/Mp3ChunkDurationExtractor;Lio/elevenlabs/data/api/StreamingAPI;Lio/elevenlabs/domain/Analytics;Lvr/c;Lio/elevenlabs/domain/services/PlayerVisibilityService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/VoicesService;Lio/elevenlabs/domain/services/ConnectivityService;)V", "", "uri", "", "offset", "readId", "Lio/elevenlabs/domain/services/StreamingService$StreamingSession;", "open", "(Ljava/lang/String;JLjava/lang/String;)Lio/elevenlabs/domain/services/StreamingService$StreamingSession;", "playingPosition", "", "findCurrentCharacter", "(J)Ljava/lang/Integer;", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lsn/z;", "setLoadingAllowed", "(Z)V", "Landroid/content/Context;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Lio/elevenlabs/domain/services/player/Mp3ChunkDurationExtractor;", "Lio/elevenlabs/data/api/StreamingAPI;", "Lio/elevenlabs/domain/Analytics;", "Lvr/c;", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/VoicesService;", "Lio/elevenlabs/domain/services/ConnectivityService;", ParameterNames.TAG, "Ljava/lang/String;", "Lio/elevenlabs/domain/model/BinarySearchList;", "emptySearchList", "Lio/elevenlabs/domain/model/BinarySearchList;", "Lir/j1;", "alignments", "Lir/j1;", "isLoadingAllowed", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsStreamingService implements StreamingService {
    private final j1 alignments;
    private final Analytics analytics;
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final AppCheckTokenService appCheckTokenService;
    private final Context appContext;
    private final ConnectivityService connectivityService;
    private final DispatcherFactory dispatcherFactory;
    private final BinarySearchList emptySearchList;
    private final j1 isLoadingAllowed;
    private final vr.c json;
    private final Logger logger;
    private final Mp3ChunkDurationExtractor mp3ChunkDurationExtractor;
    private final PlayerVisibilityService playerVisibilityService;
    private final ReadsService readsService;
    private final StreamingAPI streamingAPI;
    private final String tag;
    private final VoicesService voicesService;

    public ReadsStreamingService(Context context, Logger logger, DispatcherFactory dispatcherFactory, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Mp3ChunkDurationExtractor mp3ChunkDurationExtractor, StreamingAPI streamingAPI, Analytics analytics, vr.c cVar, PlayerVisibilityService playerVisibilityService, ReadsService readsService, VoicesService voicesService, ConnectivityService connectivityService) {
        context.getClass();
        logger.getClass();
        dispatcherFactory.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        mp3ChunkDurationExtractor.getClass();
        streamingAPI.getClass();
        analytics.getClass();
        cVar.getClass();
        playerVisibilityService.getClass();
        readsService.getClass();
        voicesService.getClass();
        connectivityService.getClass();
        this.appContext = context;
        this.logger = logger;
        this.dispatcherFactory = dispatcherFactory;
        this.appCheckTokenService = appCheckTokenService;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.mp3ChunkDurationExtractor = mp3ChunkDurationExtractor;
        this.streamingAPI = streamingAPI;
        this.analytics = analytics;
        this.json = cVar;
        this.playerVisibilityService = playerVisibilityService;
        this.readsService = readsService;
        this.voicesService = voicesService;
        this.connectivityService = connectivityService;
        this.tag = "ReadsStreamingService";
        BinarySearchList binarySearchList = new BinarySearchList(t.f33547a, SignalClient.CLOSE_REASON_NORMAL_CLOSURE);
        this.emptySearchList = binarySearchList;
        this.alignments = r.c(binarySearchList);
        this.isLoadingAllowed = r.c(Boolean.TRUE);
    }

    @Override // io.elevenlabs.domain.services.StreamingService
    public Integer findCurrentCharacter(long playingPosition) {
        return ((BinarySearchList) this.alignments.getValue()).findNearestLeftElementIndex(playingPosition);
    }

    @Override // io.elevenlabs.domain.services.StreamingService
    public StreamingService.StreamingSession open(String uri, long offset, String readId) {
        uri.getClass();
        readId.getClass();
        this.logger.log(this.tag, "open w uri/ ".concat(uri));
        this.alignments.tryEmit(this.emptySearchList);
        return new WssStreamingSession(this.appContext, this.json, uri, this.alignments, this.dispatcherFactory, this.logger, this.isLoadingAllowed, this.appCheckTokenService, this.anonCaptchaTokenService, this.mp3ChunkDurationExtractor, this.streamingAPI, this.analytics, offset, readId, this.playerVisibilityService, this.readsService, this.voicesService, this.connectivityService);
    }

    @Override // io.elevenlabs.domain.services.StreamingService
    public void setLoadingAllowed(boolean state) {
        this.isLoadingAllowed.tryEmit(Boolean.valueOf(state));
    }
}
