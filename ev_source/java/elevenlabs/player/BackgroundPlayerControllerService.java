package io.elevenlabs.player;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.player.media.MediaItemCreator;
import io.livekit.android.room.SignalClient;
import ir.i;
import ir.i1;
import ir.j;
import ir.j1;
import ir.r;
import ir.z1;
import ja.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import w7.a1;
import w7.b1;
import w7.d1;
import w7.e1;
import w7.f1;
import w7.f2;
import w7.g1;
import w7.h1;
import w7.o;
import w7.r0;
import w7.r1;
import w7.u0;
import w7.w0;
import w7.w1;
import w7.y1;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\"H\u0096@¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b&\u0010\u001fJ \u0010)\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\u00020\u001a2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\"H\u0096@¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b0\u0010,J\u0010\u00101\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b1\u0010,J\u0010\u00102\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b2\u0010,J\u0010\u00103\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b3\u0010,J\u001f\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107062\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001606H\u0016¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0=H\u0016¢\u0006\u0004\bB\u0010@J\u0017\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0=H\u0016¢\u0006\u0004\bD\u0010@J\u0017\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-06H\u0016¢\u0006\u0004\bE\u0010<J\u0018\u0010G\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020>H\u0096@¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020\u001a2\b\u0010I\u001a\u0004\u0018\u000107H\u0096@¢\u0006\u0004\bJ\u0010KJ \u0010O\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020'H\u0096@¢\u0006\u0004\bO\u0010PJ\u0018\u0010R\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u0014H\u0096@¢\u0006\u0004\bR\u0010SJ \u0010W\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010V\u001a\u00020UH\u0096@¢\u0006\u0004\bW\u0010XJ \u0010[\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020'2\u0006\u0010Z\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b[\u0010\\J,\u0010a\u001a\u00020\u001a2\b\u0010]\u001a\u0004\u0018\u00010\u00182\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010`\u001a\u00020>H\u0096@¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180cH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0cH\u0016¢\u0006\u0004\bf\u0010eJ\u0015\u0010g\u001a\b\u0012\u0004\u0012\u00020>0cH\u0016¢\u0006\u0004\bg\u0010eJ\u0015\u0010i\u001a\b\u0012\u0004\u0012\u00020h06H\u0016¢\u0006\u0004\bi\u0010<J\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020j06H\u0096@¢\u0006\u0004\bk\u0010,J\u0012\u0010m\u001a\u0004\u0018\u00010lH\u0082@¢\u0006\u0004\bm\u0010,J\u000f\u0010n\u001a\u00020\u001aH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020\u001a2\u0006\u0010p\u001a\u00020'H\u0002¢\u0006\u0004\bq\u0010rJ\u0011\u0010s\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bs\u0010tJ\u0011\u0010u\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\bu\u0010vJ\u0011\u0010w\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bw\u0010xR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010yR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010zR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010{R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010|R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010}R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010~R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u00020\u00188\u0002X\u0082D¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001d\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020j0c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u0010\u0086\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R\u001f\u0010\u0087\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001d\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020>0c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0085\u0001R\u001f\u0010\u0089\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0085\u0001R\u001f\u0010\u008a\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0085\u0001R\u001d\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020>0c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0085\u0001R\u001f\u0010\u008c\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0085\u0001R \u0010\u008e\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\u00148\u0002X\u0082D¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\u00148\u0002X\u0082D¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0094\u0001¨\u0006\u0096\u0001"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerControllerService;", "Lio/elevenlabs/domain/services/player/PlayerService;", "Landroid/content/Context;", "context", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/player/media/MediaItemCreator;", "mediaItemCreator", "Lio/elevenlabs/player/AssistantTriggerEmitter;", "assistantTriggerEmitter", "Lio/elevenlabs/player/PlayerErrorHandler;", "errorHandler", "<init>", "(Landroid/content/Context;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/UserConfigService;Lio/elevenlabs/player/media/MediaItemCreator;Lio/elevenlabs/player/AssistantTriggerEmitter;Lio/elevenlabs/player/PlayerErrorHandler;)V", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "", "initialOffset", "", "playWhenReady", "", "voiceId", "Lsn/z;", "initPlayer", "(Lio/elevenlabs/domain/model/ReadMeta;JZLjava/lang/String;Lwn/c;)Ljava/lang/Object;", "readId", "seekToItem", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "addToQueue", "(Lio/elevenlabs/domain/model/ReadMeta;Lwn/c;)Ljava/lang/Object;", "", "readMetas", "addUniqueToQueue", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "removeFromQueue", "", "newIndex", "moveInQueue", "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "clearQueue", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/MediaItemState;", FirebaseAnalytics.Param.ITEMS, "setFutureQueue", "togglePlayPause", "stop", "release", "pause", "Lxq/b;", "interval", "Lir/i;", "Ljava/util/Date;", "sleepTimer-LRDsOJo", "(J)Lir/i;", "sleepTimer", "isPlayingWhenReady", "()Lir/i;", "Lir/z1;", "", "getPlaybackSpeed", "()Lir/z1;", "Lio/elevenlabs/domain/model/PlayerError;", "getPlaybackError", "Lio/elevenlabs/domain/model/MediaQueueState;", "observeQueueState", "observeCurrentItemChange", "speed", "setPlaybackSpeed", "(FLwn/c;)Ljava/lang/Object;", "date", "setSleepTimer", "(Ljava/util/Date;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "source", "durationSeconds", "seekByTime", "(Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;ILwn/c;)Ljava/lang/Object;", "offset", "seekToCharacterOffset", "(JLwn/c;)Ljava/lang/Object;", "audioFileNumber", "", "positionSeconds", "seekToAudioPosition", "(Ljava/lang/String;DLwn/c;)Ljava/lang/Object;", "chapterIndex", "positionMs", "seekToChapter", "(IJLwn/c;)Ljava/lang/Object;", "id", "Ljava/io/File;", "file", "mixingLevel", "setSoundscape", "(Ljava/lang/String;Ljava/io/File;FLwn/c;)Ljava/lang/Object;", "Lir/j1;", "getCurrentSoundscapeId", "()Lir/j1;", "getCurrentSoundscapeFile", "getSoundscapeMixingLevel", "Lio/elevenlabs/domain/services/player/AssistantTriggerEvent;", "observeAssistantTrigger", "Lio/elevenlabs/domain/model/PlayerConnectionState;", "connect", "Lja/z;", "waitForController", "onControllerReady", "()V", "playbackState", "emitPlaybackState", "(I)V", "getSoundscapeIdFromExtras", "()Ljava/lang/String;", "getSoundscapeFileFromExtras", "()Ljava/io/File;", "getSoundscapeMixingLevelFromExtras", "()Ljava/lang/Float;", "Landroid/content/Context;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/player/media/MediaItemCreator;", "Lio/elevenlabs/player/AssistantTriggerEmitter;", "Lio/elevenlabs/player/PlayerErrorHandler;", ParameterNames.TAG, "Ljava/lang/String;", "controller", "Lja/z;", "playerConnectionState", "Lir/j1;", "playWhenReadyState", "playerError", "speedState", "currentSoundscapeIdState", "currentSoundscapeFileState", "currentSoundscapeMixingLevelState", "queueState", "Lir/i1;", "itemChangeFlow", "Lir/i1;", "", "seekedItems", "Ljava/util/Set;", "controllerWaitTimeoutMs", "J", "controllerWaitDelayMs", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService implements PlayerService {
    private final AssistantTriggerEmitter assistantTriggerEmitter;
    private final Context context;
    private z controller;
    private final long controllerWaitDelayMs;
    private final long controllerWaitTimeoutMs;
    private final j1 currentSoundscapeFileState;
    private final j1 currentSoundscapeIdState;
    private final j1 currentSoundscapeMixingLevelState;
    private final DispatcherFactory dispatcherFactory;
    private final PlayerErrorHandler errorHandler;
    private final i1 itemChangeFlow;
    private final Logger logger;
    private final MediaItemCreator mediaItemCreator;
    private final j1 playWhenReadyState;
    private final j1 playerConnectionState;
    private final j1 playerError;
    private final j1 queueState;
    private final Set<String> seekedItems;
    private final j1 speedState;
    private final String tag;
    private final UserConfigService userConfigService;

    public BackgroundPlayerControllerService(Context context, Logger logger, DispatcherFactory dispatcherFactory, UserConfigService userConfigService, MediaItemCreator mediaItemCreator, AssistantTriggerEmitter assistantTriggerEmitter, PlayerErrorHandler playerErrorHandler) {
        context.getClass();
        logger.getClass();
        dispatcherFactory.getClass();
        userConfigService.getClass();
        mediaItemCreator.getClass();
        assistantTriggerEmitter.getClass();
        playerErrorHandler.getClass();
        this.context = context;
        this.logger = logger;
        this.dispatcherFactory = dispatcherFactory;
        this.userConfigService = userConfigService;
        this.mediaItemCreator = mediaItemCreator;
        this.assistantTriggerEmitter = assistantTriggerEmitter;
        this.errorHandler = playerErrorHandler;
        this.tag = "BackgroundPlayerControllerService";
        this.playerConnectionState = r.c(PlayerConnectionState.UNKNOWN);
        this.playWhenReadyState = r.c(null);
        this.playerError = r.c(null);
        this.speedState = r.c(Float.valueOf(1.0f));
        this.currentSoundscapeIdState = r.c(null);
        this.currentSoundscapeFileState = r.c(null);
        this.currentSoundscapeMixingLevelState = r.c(Float.valueOf(0.5f));
        this.queueState = r.c(null);
        this.itemChangeFlow = r.b(0, 1, null, 5);
        this.seekedItems = new LinkedHashSet();
        this.controllerWaitTimeoutMs = 2000L;
        this.controllerWaitDelayMs = 10L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitPlaybackState(int playbackState) {
        PlayerConnectionState playerConnectionState;
        if (playbackState != 1) {
            if (playbackState != 2) {
                if (playbackState != 3) {
                    if (playbackState != 4) {
                        playerConnectionState = null;
                    } else {
                        playerConnectionState = PlayerConnectionState.ENDED;
                    }
                } else {
                    playerConnectionState = PlayerConnectionState.READY;
                }
            } else {
                playerConnectionState = PlayerConnectionState.BUFFERING;
            }
        } else {
            playerConnectionState = PlayerConnectionState.IDLE;
        }
        if (playerConnectionState != null) {
            this.playerConnectionState.tryEmit(playerConnectionState);
        }
    }

    private final File getSoundscapeFileFromExtras() {
        Bundle a10;
        String soundscapeFile;
        z zVar = this.controller;
        if (zVar != null && (a10 = zVar.a()) != null && (soundscapeFile = ExchangeKt.getSoundscapeFile(a10)) != null) {
            return new File(soundscapeFile);
        }
        return null;
    }

    private final String getSoundscapeIdFromExtras() {
        Bundle a10;
        z zVar = this.controller;
        if (zVar != null && (a10 = zVar.a()) != null) {
            return ExchangeKt.getSoundscapeId(a10);
        }
        return null;
    }

    private final Float getSoundscapeMixingLevelFromExtras() {
        Bundle a10;
        z zVar = this.controller;
        if (zVar != null && (a10 = zVar.a()) != null) {
            return ExchangeKt.getSoundscapeMixingLevel(a10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onControllerReady() {
        MediaQueueState playlistState;
        float f10;
        final z zVar = this.controller;
        if (zVar == null) {
            return;
        }
        zVar.addListener(new f1() { // from class: io.elevenlabs.player.BackgroundPlayerControllerService$onControllerReady$1
            @Override // w7.f1
            public void onMediaItemTransition(r0 mediaItem, int reason) {
                j1 j1Var;
                MediaQueueState playlistState2;
                Set set;
                Set set2;
                i1 i1Var;
                MediaItemState mediaItemState;
                zVar.setPlayWhenReady(true);
                j1Var = BackgroundPlayerControllerService.this.queueState;
                playlistState2 = BackgroundPlayerControllerServiceKt.getPlaylistState(zVar);
                j1Var.tryEmit(playlistState2);
                if (mediaItem != null) {
                    String str = mediaItem.f36578a;
                    str.getClass();
                    if (str.length() > 0) {
                        i1Var = BackgroundPlayerControllerService.this.itemChangeFlow;
                        mediaItemState = BackgroundPlayerControllerServiceKt.toMediaItemState(mediaItem);
                        i1Var.tryEmit(mediaItemState);
                    }
                }
                set = BackgroundPlayerControllerService.this.seekedItems;
                if (set.size() > 10) {
                    set2 = BackgroundPlayerControllerService.this.seekedItems;
                    set2.clear();
                }
            }

            @Override // w7.f1
            public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
                j1 j1Var;
                j1Var = BackgroundPlayerControllerService.this.playWhenReadyState;
                j1Var.tryEmit(Boolean.valueOf(playWhenReady));
            }

            @Override // w7.f1
            public void onPlaybackParametersChanged(b1 playbackParameters) {
                j1 j1Var;
                playbackParameters.getClass();
                j1Var = BackgroundPlayerControllerService.this.speedState;
                j1Var.tryEmit(Float.valueOf(playbackParameters.f36278a));
            }

            @Override // w7.f1
            public void onPlaybackStateChanged(int playbackState) {
                j1 j1Var;
                MediaQueueState playlistState2;
                r0 currentMediaItem;
                Set set;
                ArrayList<String> stringArrayList;
                j1 j1Var2;
                BackgroundPlayerControllerService.this.emitPlaybackState(playbackState);
                Double d10 = null;
                boolean z6 = true;
                if (playbackState != 1) {
                    j1Var2 = BackgroundPlayerControllerService.this.playerError;
                    j1Var2.tryEmit(null);
                }
                j1Var = BackgroundPlayerControllerService.this.queueState;
                playlistState2 = BackgroundPlayerControllerServiceKt.getPlaylistState(zVar);
                j1Var.tryEmit(playlistState2);
                if (playbackState == 3 && (currentMediaItem = zVar.getCurrentMediaItem()) != null) {
                    u0 u0Var = currentMediaItem.f36581d;
                    BackgroundPlayerControllerService backgroundPlayerControllerService = BackgroundPlayerControllerService.this;
                    z zVar2 = zVar;
                    Bundle bundle = u0Var.J;
                    if (bundle != null) {
                        d10 = ExchangeKt.getAudioSeekPosition(bundle);
                    }
                    Bundle bundle2 = u0Var.J;
                    if (bundle2 == null || (stringArrayList = bundle2.getStringArrayList(MediaItemCreator.EXTRA_CHAPTER_FILE_NUMBERS)) == null || stringArrayList.size() <= 1) {
                        z6 = false;
                    }
                    if (d10 != null && !z6) {
                        set = backgroundPlayerControllerService.seekedItems;
                        String str = currentMediaItem.f36578a;
                        str.getClass();
                        if (set.add(str)) {
                            zVar2.seekTo((long) (d10.doubleValue() * SignalClient.CLOSE_REASON_NORMAL_CLOSURE));
                        }
                    }
                }
            }

            @Override // w7.f1
            public void onPlayerError(a1 error) {
                j1 j1Var;
                PlayerErrorHandler playerErrorHandler;
                String message;
                error.getClass();
                Throwable cause = error.getCause();
                if (cause == null || (message = cause.getMessage()) == null || !n.a0(message, "Attempt to invoke virtual method 'boolean androidx.media3.datasource.DataSpec.isFlagSet(int)' on a null object reference", false)) {
                    j1Var = BackgroundPlayerControllerService.this.playerError;
                    playerErrorHandler = BackgroundPlayerControllerService.this.errorHandler;
                    j1Var.tryEmit(playerErrorHandler.classifyError(error));
                }
            }

            @Override // w7.f1
            public void onTimelineChanged(r1 timeline, int reason) {
                j1 j1Var;
                MediaQueueState playlistState2;
                timeline.getClass();
                j1Var = BackgroundPlayerControllerService.this.queueState;
                playlistState2 = BackgroundPlayerControllerServiceKt.getPlaylistState(zVar);
                j1Var.tryEmit(playlistState2);
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onCues(y7.c cVar) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(g1 g1Var, g1 g1Var2, int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(w7.d dVar) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(d1 d1Var) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(o oVar) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z6) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(u0 u0Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMetadata(w0 w0Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(a1 a1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(u0 u0Var) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(w1 w1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onTracksChanged(y1 y1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(f2 f2Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onEvents(h1 h1Var, e1 e1Var) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z6, int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            }
        });
        this.playWhenReadyState.tryEmit(Boolean.valueOf(zVar.getPlayWhenReady()));
        emitPlaybackState(zVar.getPlaybackState());
        this.speedState.tryEmit(Float.valueOf(zVar.getPlaybackParameters().f36278a));
        j1 j1Var = this.queueState;
        playlistState = BackgroundPlayerControllerServiceKt.getPlaylistState(zVar);
        j1Var.tryEmit(playlistState);
        this.currentSoundscapeIdState.setValue(getSoundscapeIdFromExtras());
        this.currentSoundscapeFileState.setValue(getSoundscapeFileFromExtras());
        j1 j1Var2 = this.currentSoundscapeMixingLevelState;
        Float soundscapeMixingLevelFromExtras = getSoundscapeMixingLevelFromExtras();
        if (soundscapeMixingLevelFromExtras != null) {
            f10 = soundscapeMixingLevelFromExtras.floatValue();
        } else {
            f10 = 0.5f;
        }
        j1Var2.setValue(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:10:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForController(wn.c<? super z> cVar) {
        BackgroundPlayerControllerService$waitForController$1 backgroundPlayerControllerService$waitForController$1;
        int i10;
        int i11;
        if (cVar instanceof BackgroundPlayerControllerService$waitForController$1) {
            backgroundPlayerControllerService$waitForController$1 = (BackgroundPlayerControllerService$waitForController$1) cVar;
            int i12 = backgroundPlayerControllerService$waitForController$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$waitForController$1.label = i12 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$waitForController$1.result;
                i10 = backgroundPlayerControllerService$waitForController$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        int i13 = backgroundPlayerControllerService$waitForController$1.I$0;
                        sn.a.g(obj);
                        i11 = i13;
                        if (g0.z(backgroundPlayerControllerService$waitForController$1.getContext()) && this.controller == null) {
                            i13 = i11 + 1;
                            long j4 = i11;
                            long j10 = this.controllerWaitTimeoutMs;
                            long j11 = this.controllerWaitDelayMs;
                            if (j4 < j10 / j11) {
                                backgroundPlayerControllerService$waitForController$1.I$0 = i13;
                                backgroundPlayerControllerService$waitForController$1.label = 1;
                                Object m10 = g0.m(j11, backgroundPlayerControllerService$waitForController$1);
                                xn.a aVar = xn.a.f37986a;
                                if (m10 == aVar) {
                                    return aVar;
                                }
                                i11 = i13;
                                if (g0.z(backgroundPlayerControllerService$waitForController$1.getContext())) {
                                    i13 = i11 + 1;
                                    long j42 = i11;
                                    long j102 = this.controllerWaitTimeoutMs;
                                    long j112 = this.controllerWaitDelayMs;
                                    if (j42 < j102 / j112) {
                                    }
                                }
                            }
                        }
                        return this.controller;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                i11 = 0;
                if (g0.z(backgroundPlayerControllerService$waitForController$1.getContext())) {
                }
                return this.controller;
            }
        }
        backgroundPlayerControllerService$waitForController$1 = new BackgroundPlayerControllerService$waitForController$1(this, cVar);
        Object obj2 = backgroundPlayerControllerService$waitForController$1.result;
        i10 = backgroundPlayerControllerService$waitForController$1.label;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addToQueue(ReadMeta readMeta, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$addToQueue$1 backgroundPlayerControllerService$addToQueue$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$addToQueue$1) {
            backgroundPlayerControllerService$addToQueue$1 = (BackgroundPlayerControllerService$addToQueue$1) cVar;
            int i11 = backgroundPlayerControllerService$addToQueue$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$addToQueue$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$addToQueue$1.result;
                i10 = backgroundPlayerControllerService$addToQueue$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    readMeta = (ReadMeta) backgroundPlayerControllerService$addToQueue$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$addToQueue$1.L$0 = readMeta;
                    backgroundPlayerControllerService$addToQueue$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$addToQueue$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$addToQueue$2 backgroundPlayerControllerService$addToQueue$2 = new BackgroundPlayerControllerService$addToQueue$2(zVar, readMeta, this, null);
                backgroundPlayerControllerService$addToQueue$1.L$0 = null;
                backgroundPlayerControllerService$addToQueue$1.L$1 = null;
                backgroundPlayerControllerService$addToQueue$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$addToQueue$2, backgroundPlayerControllerService$addToQueue$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$addToQueue$1 = new BackgroundPlayerControllerService$addToQueue$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$addToQueue$1.result;
        i10 = backgroundPlayerControllerService$addToQueue$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addUniqueToQueue(List<ReadMeta> list, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$addUniqueToQueue$1 backgroundPlayerControllerService$addUniqueToQueue$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$addUniqueToQueue$1) {
            backgroundPlayerControllerService$addUniqueToQueue$1 = (BackgroundPlayerControllerService$addUniqueToQueue$1) cVar;
            int i11 = backgroundPlayerControllerService$addUniqueToQueue$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$addUniqueToQueue$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$addUniqueToQueue$1.result;
                i10 = backgroundPlayerControllerService$addUniqueToQueue$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) backgroundPlayerControllerService$addUniqueToQueue$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$addUniqueToQueue$1.L$0 = list;
                    backgroundPlayerControllerService$addUniqueToQueue$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$addUniqueToQueue$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$addUniqueToQueue$2 backgroundPlayerControllerService$addUniqueToQueue$2 = new BackgroundPlayerControllerService$addUniqueToQueue$2(this, list, zVar, null);
                backgroundPlayerControllerService$addUniqueToQueue$1.L$0 = null;
                backgroundPlayerControllerService$addUniqueToQueue$1.L$1 = null;
                backgroundPlayerControllerService$addUniqueToQueue$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$addUniqueToQueue$2, backgroundPlayerControllerService$addUniqueToQueue$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$addUniqueToQueue$1 = new BackgroundPlayerControllerService$addUniqueToQueue$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$addUniqueToQueue$1.result;
        i10 = backgroundPlayerControllerService$addUniqueToQueue$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearQueue(wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$clearQueue$1 backgroundPlayerControllerService$clearQueue$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$clearQueue$1) {
            backgroundPlayerControllerService$clearQueue$1 = (BackgroundPlayerControllerService$clearQueue$1) cVar;
            int i11 = backgroundPlayerControllerService$clearQueue$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$clearQueue$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$clearQueue$1.result;
                i10 = backgroundPlayerControllerService$clearQueue$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$clearQueue$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$clearQueue$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$clearQueue$2 backgroundPlayerControllerService$clearQueue$2 = new BackgroundPlayerControllerService$clearQueue$2(zVar, null);
                backgroundPlayerControllerService$clearQueue$1.L$0 = null;
                backgroundPlayerControllerService$clearQueue$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$clearQueue$2, backgroundPlayerControllerService$clearQueue$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$clearQueue$1 = new BackgroundPlayerControllerService$clearQueue$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$clearQueue$1.result;
        i10 = backgroundPlayerControllerService$clearQueue$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    public Object connect(wn.c<? super i> cVar) {
        return r.j(new BackgroundPlayerControllerService$connect$2(this, null));
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    public z1 getPlaybackError() {
        return this.playerError;
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    public z1 getPlaybackSpeed() {
        return this.speedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0170, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0186, code lost:
    
        if (stop(r9) != r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0115, code lost:
    
        if (r0 == r12) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
    
        if (r7.emit(r8, r9) != r12) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initPlayer(ReadMeta readMeta, long j4, boolean z6, String str, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$initPlayer$1 backgroundPlayerControllerService$initPlayer$1;
        int i10;
        ReadMeta readMeta2;
        boolean z10;
        String str2;
        long j10;
        UserConfig userConfig;
        ReadMeta readMeta3;
        boolean z11;
        Float playbackSpeedRate;
        z zVar;
        ReadMeta readMeta4;
        String str3;
        r0 r0Var;
        String str4;
        String str5;
        if (cVar instanceof BackgroundPlayerControllerService$initPlayer$1) {
            backgroundPlayerControllerService$initPlayer$1 = (BackgroundPlayerControllerService$initPlayer$1) cVar;
            int i11 = backgroundPlayerControllerService$initPlayer$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$initPlayer$1.label = i11 - Integer.MIN_VALUE;
                BackgroundPlayerControllerService$initPlayer$1 backgroundPlayerControllerService$initPlayer$12 = backgroundPlayerControllerService$initPlayer$1;
                Object obj = backgroundPlayerControllerService$initPlayer$12.result;
                i10 = backgroundPlayerControllerService$initPlayer$12.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                switch (i10) {
                    case 0:
                        sn.a.g(obj);
                        i config = this.userConfigService.getConfig();
                        readMeta2 = readMeta;
                        backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta2;
                        backgroundPlayerControllerService$initPlayer$12.L$1 = str;
                        backgroundPlayerControllerService$initPlayer$12.J$0 = j4;
                        z10 = z6;
                        backgroundPlayerControllerService$initPlayer$12.Z$0 = z10;
                        backgroundPlayerControllerService$initPlayer$12.label = 1;
                        obj = r.w(config, backgroundPlayerControllerService$initPlayer$12);
                        if (obj != obj2) {
                            str2 = str;
                            j10 = j4;
                            userConfig = (UserConfig) obj;
                            if (userConfig != null && (playbackSpeedRate = userConfig.getPlaybackSpeedRate()) != null) {
                                float floatValue = playbackSpeedRate.floatValue();
                                j1 j1Var = this.speedState;
                                Float f10 = new Float(floatValue);
                                backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta2;
                                backgroundPlayerControllerService$initPlayer$12.L$1 = str2;
                                backgroundPlayerControllerService$initPlayer$12.J$0 = j10;
                                backgroundPlayerControllerService$initPlayer$12.Z$0 = z10;
                                backgroundPlayerControllerService$initPlayer$12.F$0 = floatValue;
                                backgroundPlayerControllerService$initPlayer$12.I$0 = 0;
                                backgroundPlayerControllerService$initPlayer$12.label = 2;
                                break;
                            }
                            boolean z12 = z10;
                            readMeta3 = readMeta2;
                            z11 = z12;
                            backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta3;
                            backgroundPlayerControllerService$initPlayer$12.L$1 = str2;
                            backgroundPlayerControllerService$initPlayer$12.J$0 = j10;
                            backgroundPlayerControllerService$initPlayer$12.Z$0 = z11;
                            backgroundPlayerControllerService$initPlayer$12.label = 3;
                            obj = waitForController(backgroundPlayerControllerService$initPlayer$12);
                            break;
                        }
                        return obj2;
                    case 1:
                        boolean z13 = backgroundPlayerControllerService$initPlayer$12.Z$0;
                        j10 = backgroundPlayerControllerService$initPlayer$12.J$0;
                        str2 = (String) backgroundPlayerControllerService$initPlayer$12.L$1;
                        ReadMeta readMeta5 = (ReadMeta) backgroundPlayerControllerService$initPlayer$12.L$0;
                        sn.a.g(obj);
                        z10 = z13;
                        readMeta2 = readMeta5;
                        userConfig = (UserConfig) obj;
                        if (userConfig != null) {
                            float floatValue2 = playbackSpeedRate.floatValue();
                            j1 j1Var2 = this.speedState;
                            Float f102 = new Float(floatValue2);
                            backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta2;
                            backgroundPlayerControllerService$initPlayer$12.L$1 = str2;
                            backgroundPlayerControllerService$initPlayer$12.J$0 = j10;
                            backgroundPlayerControllerService$initPlayer$12.Z$0 = z10;
                            backgroundPlayerControllerService$initPlayer$12.F$0 = floatValue2;
                            backgroundPlayerControllerService$initPlayer$12.I$0 = 0;
                            backgroundPlayerControllerService$initPlayer$12.label = 2;
                            break;
                        }
                        boolean z122 = z10;
                        readMeta3 = readMeta2;
                        z11 = z122;
                        backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta3;
                        backgroundPlayerControllerService$initPlayer$12.L$1 = str2;
                        backgroundPlayerControllerService$initPlayer$12.J$0 = j10;
                        backgroundPlayerControllerService$initPlayer$12.Z$0 = z11;
                        backgroundPlayerControllerService$initPlayer$12.label = 3;
                        obj = waitForController(backgroundPlayerControllerService$initPlayer$12);
                        break;
                    case 2:
                        z11 = backgroundPlayerControllerService$initPlayer$12.Z$0;
                        j10 = backgroundPlayerControllerService$initPlayer$12.J$0;
                        str2 = (String) backgroundPlayerControllerService$initPlayer$12.L$1;
                        readMeta3 = (ReadMeta) backgroundPlayerControllerService$initPlayer$12.L$0;
                        sn.a.g(obj);
                        backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta3;
                        backgroundPlayerControllerService$initPlayer$12.L$1 = str2;
                        backgroundPlayerControllerService$initPlayer$12.J$0 = j10;
                        backgroundPlayerControllerService$initPlayer$12.Z$0 = z11;
                        backgroundPlayerControllerService$initPlayer$12.label = 3;
                        obj = waitForController(backgroundPlayerControllerService$initPlayer$12);
                        break;
                    case 3:
                        z11 = backgroundPlayerControllerService$initPlayer$12.Z$0;
                        j10 = backgroundPlayerControllerService$initPlayer$12.J$0;
                        str2 = (String) backgroundPlayerControllerService$initPlayer$12.L$1;
                        readMeta3 = (ReadMeta) backgroundPlayerControllerService$initPlayer$12.L$0;
                        sn.a.g(obj);
                        z zVar3 = (z) obj;
                        if (zVar3 == null) {
                            this.logger.log(this.tag, "initPlayer: aborted, controller is null");
                            return zVar2;
                        }
                        fr.z main = this.dispatcherFactory.getMain();
                        BackgroundPlayerControllerService$initPlayer$currentReadItem$1 backgroundPlayerControllerService$initPlayer$currentReadItem$1 = new BackgroundPlayerControllerService$initPlayer$currentReadItem$1(zVar3, null);
                        backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta3;
                        backgroundPlayerControllerService$initPlayer$12.L$1 = str2;
                        backgroundPlayerControllerService$initPlayer$12.L$2 = zVar3;
                        backgroundPlayerControllerService$initPlayer$12.J$0 = j10;
                        backgroundPlayerControllerService$initPlayer$12.Z$0 = z11;
                        backgroundPlayerControllerService$initPlayer$12.label = 4;
                        Object Q = g0.Q(main, backgroundPlayerControllerService$initPlayer$currentReadItem$1, backgroundPlayerControllerService$initPlayer$12);
                        if (Q != obj2) {
                            String str6 = str2;
                            zVar = zVar3;
                            obj = Q;
                            readMeta4 = readMeta3;
                            str3 = str6;
                            r0Var = (r0) obj;
                            if (r0Var == null) {
                                str4 = r0Var.f36578a;
                            } else {
                                str4 = null;
                            }
                            if (m.c(str4, readMeta4.getReadId())) {
                                Bundle bundle = r0Var.f36581d.J;
                                if (bundle != null) {
                                    str5 = ExchangeKt.getVoiceId(bundle);
                                } else {
                                    str5 = null;
                                }
                                if (m.c(str5, str3)) {
                                }
                            }
                            backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta4;
                            backgroundPlayerControllerService$initPlayer$12.L$1 = str3;
                            backgroundPlayerControllerService$initPlayer$12.L$2 = zVar;
                            backgroundPlayerControllerService$initPlayer$12.L$3 = null;
                            backgroundPlayerControllerService$initPlayer$12.J$0 = j10;
                            backgroundPlayerControllerService$initPlayer$12.Z$0 = z11;
                            backgroundPlayerControllerService$initPlayer$12.label = 5;
                            break;
                        }
                        return obj2;
                    case 4:
                        z11 = backgroundPlayerControllerService$initPlayer$12.Z$0;
                        j10 = backgroundPlayerControllerService$initPlayer$12.J$0;
                        zVar = (z) backgroundPlayerControllerService$initPlayer$12.L$2;
                        str3 = (String) backgroundPlayerControllerService$initPlayer$12.L$1;
                        readMeta4 = (ReadMeta) backgroundPlayerControllerService$initPlayer$12.L$0;
                        sn.a.g(obj);
                        r0Var = (r0) obj;
                        if (r0Var == null) {
                        }
                        if (m.c(str4, readMeta4.getReadId())) {
                        }
                        backgroundPlayerControllerService$initPlayer$12.L$0 = readMeta4;
                        backgroundPlayerControllerService$initPlayer$12.L$1 = str3;
                        backgroundPlayerControllerService$initPlayer$12.L$2 = zVar;
                        backgroundPlayerControllerService$initPlayer$12.L$3 = null;
                        backgroundPlayerControllerService$initPlayer$12.J$0 = j10;
                        backgroundPlayerControllerService$initPlayer$12.Z$0 = z11;
                        backgroundPlayerControllerService$initPlayer$12.label = 5;
                        break;
                    case 5:
                        z11 = backgroundPlayerControllerService$initPlayer$12.Z$0;
                        j10 = backgroundPlayerControllerService$initPlayer$12.J$0;
                        zVar = (z) backgroundPlayerControllerService$initPlayer$12.L$2;
                        str3 = (String) backgroundPlayerControllerService$initPlayer$12.L$1;
                        readMeta4 = (ReadMeta) backgroundPlayerControllerService$initPlayer$12.L$0;
                        sn.a.g(obj);
                        ReadMeta readMeta6 = readMeta4;
                        boolean z14 = z11;
                        z zVar4 = zVar;
                        long j11 = j10;
                        String str7 = str3;
                        fr.z main2 = this.dispatcherFactory.getMain();
                        BackgroundPlayerControllerService$initPlayer$3 backgroundPlayerControllerService$initPlayer$3 = new BackgroundPlayerControllerService$initPlayer$3(zVar4, this, readMeta6, str7, j11, z14, null);
                        backgroundPlayerControllerService$initPlayer$12.L$0 = null;
                        backgroundPlayerControllerService$initPlayer$12.L$1 = null;
                        backgroundPlayerControllerService$initPlayer$12.L$2 = null;
                        backgroundPlayerControllerService$initPlayer$12.L$3 = null;
                        backgroundPlayerControllerService$initPlayer$12.J$0 = j11;
                        backgroundPlayerControllerService$initPlayer$12.Z$0 = z14;
                        backgroundPlayerControllerService$initPlayer$12.label = 6;
                        if (g0.Q(main2, backgroundPlayerControllerService$initPlayer$3, backgroundPlayerControllerService$initPlayer$12) == obj2) {
                            return obj2;
                        }
                        return zVar2;
                    case 6:
                        sn.a.g(obj);
                        return zVar2;
                    default:
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        backgroundPlayerControllerService$initPlayer$1 = new BackgroundPlayerControllerService$initPlayer$1(this, cVar);
        BackgroundPlayerControllerService$initPlayer$1 backgroundPlayerControllerService$initPlayer$122 = backgroundPlayerControllerService$initPlayer$1;
        Object obj3 = backgroundPlayerControllerService$initPlayer$122.result;
        i10 = backgroundPlayerControllerService$initPlayer$122.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        switch (i10) {
        }
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    public i isPlayingWhenReady() {
        final j1 j1Var = this.playWhenReadyState;
        return new i() { // from class: io.elevenlabs.player.BackgroundPlayerControllerService$isPlayingWhenReady$$inlined$mapNotNull$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.player.BackgroundPlayerControllerService$isPlayingWhenReady$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$isPlayingWhenReady$$inlined$mapNotNull$1$2", f = "BackgroundPlayerControllerService.kt", l = {52}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.player.BackgroundPlayerControllerService$isPlayingWhenReady$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                Boolean bool = (Boolean) obj;
                                if (bool != null) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(bool, anonymousClass1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return sn.z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r10 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object moveInQueue(String str, int i10, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$moveInQueue$1 backgroundPlayerControllerService$moveInQueue$1;
        int i11;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$moveInQueue$1) {
            backgroundPlayerControllerService$moveInQueue$1 = (BackgroundPlayerControllerService$moveInQueue$1) cVar;
            int i12 = backgroundPlayerControllerService$moveInQueue$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$moveInQueue$1.label = i12 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$moveInQueue$1.result;
                i11 = backgroundPlayerControllerService$moveInQueue$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i10 = backgroundPlayerControllerService$moveInQueue$1.I$0;
                    str = (String) backgroundPlayerControllerService$moveInQueue$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$moveInQueue$1.L$0 = str;
                    backgroundPlayerControllerService$moveInQueue$1.I$0 = i10;
                    backgroundPlayerControllerService$moveInQueue$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$moveInQueue$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$moveInQueue$2 backgroundPlayerControllerService$moveInQueue$2 = new BackgroundPlayerControllerService$moveInQueue$2(zVar, str, i10, null);
                backgroundPlayerControllerService$moveInQueue$1.L$0 = null;
                backgroundPlayerControllerService$moveInQueue$1.L$1 = null;
                backgroundPlayerControllerService$moveInQueue$1.I$0 = i10;
                backgroundPlayerControllerService$moveInQueue$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$moveInQueue$2, backgroundPlayerControllerService$moveInQueue$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$moveInQueue$1 = new BackgroundPlayerControllerService$moveInQueue$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$moveInQueue$1.result;
        i11 = backgroundPlayerControllerService$moveInQueue$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i11 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    public i observeAssistantTrigger() {
        return this.assistantTriggerEmitter.getTriggerFlow();
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    public i observeCurrentItemChange() {
        return this.itemChangeFlow;
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    public z1 observeQueueState() {
        return this.queueState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object pause(wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$pause$1 backgroundPlayerControllerService$pause$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$pause$1) {
            backgroundPlayerControllerService$pause$1 = (BackgroundPlayerControllerService$pause$1) cVar;
            int i11 = backgroundPlayerControllerService$pause$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$pause$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$pause$1.result;
                i10 = backgroundPlayerControllerService$pause$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$pause$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$pause$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$pause$2 backgroundPlayerControllerService$pause$2 = new BackgroundPlayerControllerService$pause$2(zVar, null);
                backgroundPlayerControllerService$pause$1.L$0 = null;
                backgroundPlayerControllerService$pause$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$pause$2, backgroundPlayerControllerService$pause$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$pause$1 = new BackgroundPlayerControllerService$pause$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$pause$1.result;
        i10 = backgroundPlayerControllerService$pause$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object release(wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$release$1 backgroundPlayerControllerService$release$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$release$1) {
            backgroundPlayerControllerService$release$1 = (BackgroundPlayerControllerService$release$1) cVar;
            int i11 = backgroundPlayerControllerService$release$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$release$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$release$1.result;
                i10 = backgroundPlayerControllerService$release$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$release$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$release$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$release$2 backgroundPlayerControllerService$release$2 = new BackgroundPlayerControllerService$release$2(zVar, null);
                backgroundPlayerControllerService$release$1.L$0 = null;
                backgroundPlayerControllerService$release$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$release$2, backgroundPlayerControllerService$release$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$release$1 = new BackgroundPlayerControllerService$release$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$release$1.result;
        i10 = backgroundPlayerControllerService$release$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeFromQueue(String str, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$removeFromQueue$1 backgroundPlayerControllerService$removeFromQueue$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$removeFromQueue$1) {
            backgroundPlayerControllerService$removeFromQueue$1 = (BackgroundPlayerControllerService$removeFromQueue$1) cVar;
            int i11 = backgroundPlayerControllerService$removeFromQueue$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$removeFromQueue$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$removeFromQueue$1.result;
                i10 = backgroundPlayerControllerService$removeFromQueue$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) backgroundPlayerControllerService$removeFromQueue$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$removeFromQueue$1.L$0 = str;
                    backgroundPlayerControllerService$removeFromQueue$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$removeFromQueue$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$removeFromQueue$2 backgroundPlayerControllerService$removeFromQueue$2 = new BackgroundPlayerControllerService$removeFromQueue$2(zVar, str, null);
                backgroundPlayerControllerService$removeFromQueue$1.L$0 = null;
                backgroundPlayerControllerService$removeFromQueue$1.L$1 = null;
                backgroundPlayerControllerService$removeFromQueue$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$removeFromQueue$2, backgroundPlayerControllerService$removeFromQueue$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$removeFromQueue$1 = new BackgroundPlayerControllerService$removeFromQueue$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$removeFromQueue$1.result;
        i10 = backgroundPlayerControllerService$removeFromQueue$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r15 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object seekByTime(Analytics.Event.PlayerControlEventSource playerControlEventSource, int i10, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$seekByTime$1 backgroundPlayerControllerService$seekByTime$1;
        int i11;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$seekByTime$1) {
            backgroundPlayerControllerService$seekByTime$1 = (BackgroundPlayerControllerService$seekByTime$1) cVar;
            int i12 = backgroundPlayerControllerService$seekByTime$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$seekByTime$1.label = i12 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$seekByTime$1.result;
                i11 = backgroundPlayerControllerService$seekByTime$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i10 = backgroundPlayerControllerService$seekByTime$1.I$0;
                    playerControlEventSource = (Analytics.Event.PlayerControlEventSource) backgroundPlayerControllerService$seekByTime$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$seekByTime$1.L$0 = playerControlEventSource;
                    backgroundPlayerControllerService$seekByTime$1.I$0 = i10;
                    backgroundPlayerControllerService$seekByTime$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$seekByTime$1);
                }
                Analytics.Event.PlayerControlEventSource playerControlEventSource2 = playerControlEventSource;
                int i13 = i10;
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$seekByTime$2 backgroundPlayerControllerService$seekByTime$2 = new BackgroundPlayerControllerService$seekByTime$2(i13, zVar, this, playerControlEventSource2, null);
                backgroundPlayerControllerService$seekByTime$1.L$0 = null;
                backgroundPlayerControllerService$seekByTime$1.L$1 = null;
                backgroundPlayerControllerService$seekByTime$1.I$0 = i13;
                backgroundPlayerControllerService$seekByTime$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$seekByTime$2, backgroundPlayerControllerService$seekByTime$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$seekByTime$1 = new BackgroundPlayerControllerService$seekByTime$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$seekByTime$1.result;
        i11 = backgroundPlayerControllerService$seekByTime$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i11 == 0) {
        }
        Analytics.Event.PlayerControlEventSource playerControlEventSource22 = playerControlEventSource;
        int i132 = i10;
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object seekToAudioPosition(String str, double d10, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$seekToAudioPosition$1 backgroundPlayerControllerService$seekToAudioPosition$1;
        int i10;
        double d11;
        String str2;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$seekToAudioPosition$1) {
            backgroundPlayerControllerService$seekToAudioPosition$1 = (BackgroundPlayerControllerService$seekToAudioPosition$1) cVar;
            int i11 = backgroundPlayerControllerService$seekToAudioPosition$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$seekToAudioPosition$1.label = i11 - Integer.MIN_VALUE;
                BackgroundPlayerControllerService$seekToAudioPosition$1 backgroundPlayerControllerService$seekToAudioPosition$12 = backgroundPlayerControllerService$seekToAudioPosition$1;
                Object obj = backgroundPlayerControllerService$seekToAudioPosition$12.result;
                i10 = backgroundPlayerControllerService$seekToAudioPosition$12.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d11 = backgroundPlayerControllerService$seekToAudioPosition$12.D$0;
                    String str3 = (String) backgroundPlayerControllerService$seekToAudioPosition$12.L$0;
                    sn.a.g(obj);
                    str2 = str3;
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$seekToAudioPosition$12.L$0 = str;
                    backgroundPlayerControllerService$seekToAudioPosition$12.D$0 = d10;
                    backgroundPlayerControllerService$seekToAudioPosition$12.label = 1;
                    Object waitForController = waitForController(backgroundPlayerControllerService$seekToAudioPosition$12);
                    if (waitForController != obj2) {
                        obj = waitForController;
                        d11 = d10;
                        str2 = str;
                    }
                    return obj2;
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$seekToAudioPosition$2 backgroundPlayerControllerService$seekToAudioPosition$2 = new BackgroundPlayerControllerService$seekToAudioPosition$2(d11, zVar, this, str2, null);
                backgroundPlayerControllerService$seekToAudioPosition$12.L$0 = null;
                backgroundPlayerControllerService$seekToAudioPosition$12.L$1 = null;
                backgroundPlayerControllerService$seekToAudioPosition$12.D$0 = d11;
                backgroundPlayerControllerService$seekToAudioPosition$12.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$seekToAudioPosition$2, backgroundPlayerControllerService$seekToAudioPosition$12) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$seekToAudioPosition$1 = new BackgroundPlayerControllerService$seekToAudioPosition$1(this, cVar);
        BackgroundPlayerControllerService$seekToAudioPosition$1 backgroundPlayerControllerService$seekToAudioPosition$122 = backgroundPlayerControllerService$seekToAudioPosition$1;
        Object obj3 = backgroundPlayerControllerService$seekToAudioPosition$122.result;
        i10 = backgroundPlayerControllerService$seekToAudioPosition$122.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r0 == r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object seekToChapter(int i10, long j4, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$seekToChapter$1 backgroundPlayerControllerService$seekToChapter$1;
        int i11;
        long j10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$seekToChapter$1) {
            backgroundPlayerControllerService$seekToChapter$1 = (BackgroundPlayerControllerService$seekToChapter$1) cVar;
            int i12 = backgroundPlayerControllerService$seekToChapter$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$seekToChapter$1.label = i12 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$seekToChapter$1.result;
                i11 = backgroundPlayerControllerService$seekToChapter$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j10 = backgroundPlayerControllerService$seekToChapter$1.J$0;
                    i10 = backgroundPlayerControllerService$seekToChapter$1.I$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$seekToChapter$1.I$0 = i10;
                    j10 = j4;
                    backgroundPlayerControllerService$seekToChapter$1.J$0 = j10;
                    backgroundPlayerControllerService$seekToChapter$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$seekToChapter$1);
                }
                int i13 = i10;
                long j11 = j10;
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$seekToChapter$2 backgroundPlayerControllerService$seekToChapter$2 = new BackgroundPlayerControllerService$seekToChapter$2(zVar, i13, j11, this, null);
                backgroundPlayerControllerService$seekToChapter$1.L$0 = null;
                backgroundPlayerControllerService$seekToChapter$1.I$0 = i13;
                backgroundPlayerControllerService$seekToChapter$1.J$0 = j11;
                backgroundPlayerControllerService$seekToChapter$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$seekToChapter$2, backgroundPlayerControllerService$seekToChapter$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$seekToChapter$1 = new BackgroundPlayerControllerService$seekToChapter$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$seekToChapter$1.result;
        i11 = backgroundPlayerControllerService$seekToChapter$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i11 == 0) {
        }
        int i132 = i10;
        long j112 = j10;
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r15 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object seekToCharacterOffset(long j4, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$seekToCharacterOffset$1 backgroundPlayerControllerService$seekToCharacterOffset$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$seekToCharacterOffset$1) {
            backgroundPlayerControllerService$seekToCharacterOffset$1 = (BackgroundPlayerControllerService$seekToCharacterOffset$1) cVar;
            int i11 = backgroundPlayerControllerService$seekToCharacterOffset$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$seekToCharacterOffset$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$seekToCharacterOffset$1.result;
                i10 = backgroundPlayerControllerService$seekToCharacterOffset$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = backgroundPlayerControllerService$seekToCharacterOffset$1.J$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$seekToCharacterOffset$1.J$0 = j4;
                    backgroundPlayerControllerService$seekToCharacterOffset$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$seekToCharacterOffset$1);
                }
                long j10 = j4;
                zVar = (z) obj;
                Logger logger = this.logger;
                if (zVar != null) {
                    logger.log(this.tag, "seekToCharacterOffset: aborted, no controller / offset=" + j10);
                    return zVar2;
                }
                logger.log(this.tag, "seekToCharacterOffset: dispatching custom command / offset=" + j10);
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$seekToCharacterOffset$2 backgroundPlayerControllerService$seekToCharacterOffset$2 = new BackgroundPlayerControllerService$seekToCharacterOffset$2(zVar, this, j10, null);
                backgroundPlayerControllerService$seekToCharacterOffset$1.L$0 = null;
                backgroundPlayerControllerService$seekToCharacterOffset$1.J$0 = j10;
                backgroundPlayerControllerService$seekToCharacterOffset$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$seekToCharacterOffset$2, backgroundPlayerControllerService$seekToCharacterOffset$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$seekToCharacterOffset$1 = new BackgroundPlayerControllerService$seekToCharacterOffset$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$seekToCharacterOffset$1.result;
        i10 = backgroundPlayerControllerService$seekToCharacterOffset$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        long j102 = j4;
        zVar = (z) obj3;
        Logger logger2 = this.logger;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object seekToItem(String str, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$seekToItem$1 backgroundPlayerControllerService$seekToItem$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$seekToItem$1) {
            backgroundPlayerControllerService$seekToItem$1 = (BackgroundPlayerControllerService$seekToItem$1) cVar;
            int i11 = backgroundPlayerControllerService$seekToItem$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$seekToItem$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$seekToItem$1.result;
                i10 = backgroundPlayerControllerService$seekToItem$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) backgroundPlayerControllerService$seekToItem$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$seekToItem$1.L$0 = str;
                    backgroundPlayerControllerService$seekToItem$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$seekToItem$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$seekToItem$2 backgroundPlayerControllerService$seekToItem$2 = new BackgroundPlayerControllerService$seekToItem$2(zVar, str, null);
                backgroundPlayerControllerService$seekToItem$1.L$0 = null;
                backgroundPlayerControllerService$seekToItem$1.L$1 = null;
                backgroundPlayerControllerService$seekToItem$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$seekToItem$2, backgroundPlayerControllerService$seekToItem$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$seekToItem$1 = new BackgroundPlayerControllerService$seekToItem$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$seekToItem$1.result;
        i10 = backgroundPlayerControllerService$seekToItem$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setFutureQueue(List<MediaItemState> list, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$setFutureQueue$1 backgroundPlayerControllerService$setFutureQueue$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$setFutureQueue$1) {
            backgroundPlayerControllerService$setFutureQueue$1 = (BackgroundPlayerControllerService$setFutureQueue$1) cVar;
            int i11 = backgroundPlayerControllerService$setFutureQueue$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$setFutureQueue$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$setFutureQueue$1.result;
                i10 = backgroundPlayerControllerService$setFutureQueue$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) backgroundPlayerControllerService$setFutureQueue$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$setFutureQueue$1.L$0 = list;
                    backgroundPlayerControllerService$setFutureQueue$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$setFutureQueue$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$setFutureQueue$2 backgroundPlayerControllerService$setFutureQueue$2 = new BackgroundPlayerControllerService$setFutureQueue$2(list, zVar, null);
                backgroundPlayerControllerService$setFutureQueue$1.L$0 = null;
                backgroundPlayerControllerService$setFutureQueue$1.L$1 = null;
                backgroundPlayerControllerService$setFutureQueue$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$setFutureQueue$2, backgroundPlayerControllerService$setFutureQueue$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$setFutureQueue$1 = new BackgroundPlayerControllerService$setFutureQueue$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$setFutureQueue$1.result;
        i10 = backgroundPlayerControllerService$setFutureQueue$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setPlaybackSpeed(float f10, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$setPlaybackSpeed$1 backgroundPlayerControllerService$setPlaybackSpeed$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$setPlaybackSpeed$1) {
            backgroundPlayerControllerService$setPlaybackSpeed$1 = (BackgroundPlayerControllerService$setPlaybackSpeed$1) cVar;
            int i11 = backgroundPlayerControllerService$setPlaybackSpeed$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$setPlaybackSpeed$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$setPlaybackSpeed$1.result;
                i10 = backgroundPlayerControllerService$setPlaybackSpeed$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f10 = backgroundPlayerControllerService$setPlaybackSpeed$1.F$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$setPlaybackSpeed$1.F$0 = f10;
                    backgroundPlayerControllerService$setPlaybackSpeed$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$setPlaybackSpeed$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$setPlaybackSpeed$2 backgroundPlayerControllerService$setPlaybackSpeed$2 = new BackgroundPlayerControllerService$setPlaybackSpeed$2(zVar, f10, null);
                backgroundPlayerControllerService$setPlaybackSpeed$1.L$0 = null;
                backgroundPlayerControllerService$setPlaybackSpeed$1.F$0 = f10;
                backgroundPlayerControllerService$setPlaybackSpeed$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$setPlaybackSpeed$2, backgroundPlayerControllerService$setPlaybackSpeed$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$setPlaybackSpeed$1 = new BackgroundPlayerControllerService$setPlaybackSpeed$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$setPlaybackSpeed$1.result;
        i10 = backgroundPlayerControllerService$setPlaybackSpeed$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setSleepTimer(Date date, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$setSleepTimer$1 backgroundPlayerControllerService$setSleepTimer$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$setSleepTimer$1) {
            backgroundPlayerControllerService$setSleepTimer$1 = (BackgroundPlayerControllerService$setSleepTimer$1) cVar;
            int i11 = backgroundPlayerControllerService$setSleepTimer$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$setSleepTimer$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$setSleepTimer$1.result;
                i10 = backgroundPlayerControllerService$setSleepTimer$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    date = (Date) backgroundPlayerControllerService$setSleepTimer$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$setSleepTimer$1.L$0 = date;
                    backgroundPlayerControllerService$setSleepTimer$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$setSleepTimer$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$setSleepTimer$2 backgroundPlayerControllerService$setSleepTimer$2 = new BackgroundPlayerControllerService$setSleepTimer$2(zVar, this, date, null);
                backgroundPlayerControllerService$setSleepTimer$1.L$0 = null;
                backgroundPlayerControllerService$setSleepTimer$1.L$1 = null;
                backgroundPlayerControllerService$setSleepTimer$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$setSleepTimer$2, backgroundPlayerControllerService$setSleepTimer$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$setSleepTimer$1 = new BackgroundPlayerControllerService$setSleepTimer$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$setSleepTimer$1.result;
        i10 = backgroundPlayerControllerService$setSleepTimer$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setSoundscape(String str, File file, float f10, wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$setSoundscape$1 backgroundPlayerControllerService$setSoundscape$1;
        int i10;
        File file2;
        float f11;
        String str2;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$setSoundscape$1) {
            backgroundPlayerControllerService$setSoundscape$1 = (BackgroundPlayerControllerService$setSoundscape$1) cVar;
            int i11 = backgroundPlayerControllerService$setSoundscape$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$setSoundscape$1.label = i11 - Integer.MIN_VALUE;
                BackgroundPlayerControllerService$setSoundscape$1 backgroundPlayerControllerService$setSoundscape$12 = backgroundPlayerControllerService$setSoundscape$1;
                Object obj = backgroundPlayerControllerService$setSoundscape$12.result;
                i10 = backgroundPlayerControllerService$setSoundscape$12.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f12 = backgroundPlayerControllerService$setSoundscape$12.F$0;
                    File file3 = (File) backgroundPlayerControllerService$setSoundscape$12.L$1;
                    String str3 = (String) backgroundPlayerControllerService$setSoundscape$12.L$0;
                    sn.a.g(obj);
                    file2 = file3;
                    str2 = str3;
                    f11 = f12;
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$setSoundscape$12.L$0 = str;
                    backgroundPlayerControllerService$setSoundscape$12.L$1 = file;
                    backgroundPlayerControllerService$setSoundscape$12.F$0 = f10;
                    backgroundPlayerControllerService$setSoundscape$12.label = 1;
                    Object waitForController = waitForController(backgroundPlayerControllerService$setSoundscape$12);
                    if (waitForController != obj2) {
                        file2 = file;
                        f11 = f10;
                        obj = waitForController;
                        str2 = str;
                    }
                    return obj2;
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$setSoundscape$2 backgroundPlayerControllerService$setSoundscape$2 = new BackgroundPlayerControllerService$setSoundscape$2(zVar, this, str2, file2, f11, null);
                backgroundPlayerControllerService$setSoundscape$12.L$0 = null;
                backgroundPlayerControllerService$setSoundscape$12.L$1 = null;
                backgroundPlayerControllerService$setSoundscape$12.L$2 = null;
                backgroundPlayerControllerService$setSoundscape$12.F$0 = f11;
                backgroundPlayerControllerService$setSoundscape$12.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$setSoundscape$2, backgroundPlayerControllerService$setSoundscape$12) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$setSoundscape$1 = new BackgroundPlayerControllerService$setSoundscape$1(this, cVar);
        BackgroundPlayerControllerService$setSoundscape$1 backgroundPlayerControllerService$setSoundscape$122 = backgroundPlayerControllerService$setSoundscape$1;
        Object obj3 = backgroundPlayerControllerService$setSoundscape$122.result;
        i10 = backgroundPlayerControllerService$setSoundscape$122.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    /* renamed from: sleepTimer-LRDsOJo */
    public i mo957sleepTimerLRDsOJo(long interval) {
        return r.o(r.j(new BackgroundPlayerControllerService$sleepTimer$1(this, interval, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$stop$1 backgroundPlayerControllerService$stop$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$stop$1) {
            backgroundPlayerControllerService$stop$1 = (BackgroundPlayerControllerService$stop$1) cVar;
            int i11 = backgroundPlayerControllerService$stop$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$stop$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$stop$1.result;
                i10 = backgroundPlayerControllerService$stop$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$stop$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$stop$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$stop$2 backgroundPlayerControllerService$stop$2 = new BackgroundPlayerControllerService$stop$2(zVar, this, null);
                backgroundPlayerControllerService$stop$1.L$0 = null;
                backgroundPlayerControllerService$stop$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$stop$2, backgroundPlayerControllerService$stop$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$stop$1 = new BackgroundPlayerControllerService$stop$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$stop$1.result;
        i10 = backgroundPlayerControllerService$stop$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r8 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.player.PlayerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object togglePlayPause(wn.c<? super sn.z> cVar) {
        BackgroundPlayerControllerService$togglePlayPause$1 backgroundPlayerControllerService$togglePlayPause$1;
        int i10;
        z zVar;
        if (cVar instanceof BackgroundPlayerControllerService$togglePlayPause$1) {
            backgroundPlayerControllerService$togglePlayPause$1 = (BackgroundPlayerControllerService$togglePlayPause$1) cVar;
            int i11 = backgroundPlayerControllerService$togglePlayPause$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                backgroundPlayerControllerService$togglePlayPause$1.label = i11 - Integer.MIN_VALUE;
                Object obj = backgroundPlayerControllerService$togglePlayPause$1.result;
                i10 = backgroundPlayerControllerService$togglePlayPause$1.label;
                sn.z zVar2 = sn.z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    backgroundPlayerControllerService$togglePlayPause$1.label = 1;
                    obj = waitForController(backgroundPlayerControllerService$togglePlayPause$1);
                }
                zVar = (z) obj;
                if (zVar != null) {
                    return zVar2;
                }
                fr.z main = this.dispatcherFactory.getMain();
                BackgroundPlayerControllerService$togglePlayPause$2 backgroundPlayerControllerService$togglePlayPause$2 = new BackgroundPlayerControllerService$togglePlayPause$2(zVar, this, null);
                backgroundPlayerControllerService$togglePlayPause$1.L$0 = null;
                backgroundPlayerControllerService$togglePlayPause$1.label = 2;
                if (g0.Q(main, backgroundPlayerControllerService$togglePlayPause$2, backgroundPlayerControllerService$togglePlayPause$1) == obj2) {
                    return obj2;
                }
                return zVar2;
            }
        }
        backgroundPlayerControllerService$togglePlayPause$1 = new BackgroundPlayerControllerService$togglePlayPause$1(this, cVar);
        Object obj3 = backgroundPlayerControllerService$togglePlayPause$1.result;
        i10 = backgroundPlayerControllerService$togglePlayPause$1.label;
        sn.z zVar22 = sn.z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        zVar = (z) obj3;
        if (zVar != null) {
        }
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    /* renamed from: getCurrentSoundscapeFile, reason: from getter */
    public j1 getCurrentSoundscapeFileState() {
        return this.currentSoundscapeFileState;
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    /* renamed from: getCurrentSoundscapeId, reason: from getter */
    public j1 getCurrentSoundscapeIdState() {
        return this.currentSoundscapeIdState;
    }

    @Override // io.elevenlabs.domain.services.player.PlayerService
    /* renamed from: getSoundscapeMixingLevel, reason: from getter */
    public j1 getCurrentSoundscapeMixingLevelState() {
        return this.currentSoundscapeMixingLevelState;
    }
}
