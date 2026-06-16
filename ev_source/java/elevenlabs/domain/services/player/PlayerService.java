package io.elevenlabs.domain.services.player;

import a9.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadMeta;
import ir.i;
import ir.z1;
import java.io.File;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH¦@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\nH¦@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\nH¦@¢\u0006\u0004\b\u0011\u0010\u000eJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00122\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001dH&¢\u0006\u0004\b\"\u0010 J\u0018\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001eH¦@¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0017H¦@¢\u0006\u0004\b'\u0010(J\"\u0010-\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+H¦@¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0004H¦@¢\u0006\u0004\b0\u00101J \u00105\u001a\u00020\n2\u0006\u00102\u001a\u00020\b2\u0006\u00104\u001a\u000203H¦@¢\u0006\u0004\b5\u00106J \u00109\u001a\u00020\n2\u0006\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u0004H¦@¢\u0006\u0004\b9\u0010:J.\u0010?\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010>\u001a\u00020\u001eH¦@¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001dH&¢\u0006\u0004\bA\u0010 J\u0017\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u001dH&¢\u0006\u0004\bB\u0010 J\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&¢\u0006\u0004\bC\u0010 J\u0017\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u001dH&¢\u0006\u0004\bE\u0010 J\u0017\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u0012H&¢\u0006\u0004\bG\u0010\u001cJ\u0018\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u00020\bH¦@¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\bK\u0010LJ\u001e\u0010O\u001a\u00020\n2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020MH¦@¢\u0006\u0004\bO\u0010PJ\u0018\u0010Q\u001a\u00020\n2\u0006\u0010H\u001a\u00020\bH¦@¢\u0006\u0004\bQ\u0010JJ \u0010S\u001a\u00020\n2\u0006\u0010H\u001a\u00020\b2\u0006\u0010R\u001a\u00020+H¦@¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\nH¦@¢\u0006\u0004\bU\u0010\u000eJ\u001e\u0010W\u001a\u00020\n2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020F0MH¦@¢\u0006\u0004\bW\u0010PJ\u0015\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u0012H&¢\u0006\u0004\bY\u0010\u001c¨\u0006ZÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/player/PlayerService;", "", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "", "initialOffset", "", "playWhenReady", "", "voiceId", "Lsn/z;", "initPlayer", "(Lio/elevenlabs/domain/model/ReadMeta;JZLjava/lang/String;Lwn/c;)Ljava/lang/Object;", "togglePlayPause", "(Lwn/c;)Ljava/lang/Object;", "stop", "release", "pause", "Lir/i;", "Lio/elevenlabs/domain/model/PlayerConnectionState;", "connect", "Lxq/b;", "interval", "Ljava/util/Date;", "sleepTimer-LRDsOJo", "(J)Lir/i;", "sleepTimer", "isPlayingWhenReady", "()Lir/i;", "Lir/z1;", "", "getPlaybackSpeed", "()Lir/z1;", "Lio/elevenlabs/domain/model/PlayerError;", "getPlaybackError", "speed", "setPlaybackSpeed", "(FLwn/c;)Ljava/lang/Object;", "date", "setSleepTimer", "(Ljava/util/Date;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "source", "", "durationSeconds", "seekByTime", "(Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;ILwn/c;)Ljava/lang/Object;", "offset", "seekToCharacterOffset", "(JLwn/c;)Ljava/lang/Object;", "audioFileNumber", "", "positionSeconds", "seekToAudioPosition", "(Ljava/lang/String;DLwn/c;)Ljava/lang/Object;", "chapterIndex", "positionMs", "seekToChapter", "(IJLwn/c;)Ljava/lang/Object;", "id", "Ljava/io/File;", "file", "mixingLevel", "setSoundscape", "(Ljava/lang/String;Ljava/io/File;FLwn/c;)Ljava/lang/Object;", "getCurrentSoundscapeId", "getCurrentSoundscapeFile", "getSoundscapeMixingLevel", "Lio/elevenlabs/domain/model/MediaQueueState;", "observeQueueState", "Lio/elevenlabs/domain/model/MediaItemState;", "observeCurrentItemChange", "readId", "seekToItem", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "addToQueue", "(Lio/elevenlabs/domain/model/ReadMeta;Lwn/c;)Ljava/lang/Object;", "", "readMetas", "addUniqueToQueue", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "removeFromQueue", "newIndex", "moveInQueue", "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "clearQueue", FirebaseAnalytics.Param.ITEMS, "setFutureQueue", "Lio/elevenlabs/domain/services/player/AssistantTriggerEvent;", "observeAssistantTrigger", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PlayerService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object initPlayer$default(PlayerService playerService, ReadMeta readMeta, long j4, boolean z6, String str, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                str = null;
            }
            return playerService.initPlayer(readMeta, j4, z6, str, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: initPlayer");
        return null;
    }

    static /* synthetic */ Object seekByTime$default(PlayerService playerService, Analytics.Event.PlayerControlEventSource playerControlEventSource, int i10, c cVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 15;
            }
            return playerService.seekByTime(playerControlEventSource, i10, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: seekByTime");
        return null;
    }

    static /* synthetic */ Object setSoundscape$default(PlayerService playerService, String str, File file, float f10, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                file = null;
            }
            return playerService.setSoundscape(str, file, f10, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: setSoundscape");
        return null;
    }

    Object addToQueue(ReadMeta readMeta, c<? super z> cVar);

    Object addUniqueToQueue(List<ReadMeta> list, c<? super z> cVar);

    Object clearQueue(c<? super z> cVar);

    Object connect(c<? super i> cVar);

    z1 getCurrentSoundscapeFile();

    z1 getCurrentSoundscapeId();

    z1 getPlaybackError();

    z1 getPlaybackSpeed();

    z1 getSoundscapeMixingLevel();

    Object initPlayer(ReadMeta readMeta, long j4, boolean z6, String str, c<? super z> cVar);

    i isPlayingWhenReady();

    Object moveInQueue(String str, int i10, c<? super z> cVar);

    i observeAssistantTrigger();

    i observeCurrentItemChange();

    z1 observeQueueState();

    Object pause(c<? super z> cVar);

    Object release(c<? super z> cVar);

    Object removeFromQueue(String str, c<? super z> cVar);

    Object seekByTime(Analytics.Event.PlayerControlEventSource playerControlEventSource, int i10, c<? super z> cVar);

    Object seekToAudioPosition(String str, double d10, c<? super z> cVar);

    Object seekToChapter(int i10, long j4, c<? super z> cVar);

    Object seekToCharacterOffset(long j4, c<? super z> cVar);

    Object seekToItem(String str, c<? super z> cVar);

    Object setFutureQueue(List<MediaItemState> list, c<? super z> cVar);

    Object setPlaybackSpeed(float f10, c<? super z> cVar);

    Object setSleepTimer(Date date, c<? super z> cVar);

    Object setSoundscape(String str, File file, float f10, c<? super z> cVar);

    /* renamed from: sleepTimer-LRDsOJo, reason: not valid java name */
    i mo957sleepTimerLRDsOJo(long interval);

    Object stop(c<? super z> cVar);

    Object togglePlayPause(c<? super z> cVar);
}
