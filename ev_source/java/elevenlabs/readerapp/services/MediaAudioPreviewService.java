package io.elevenlabs.readerapp.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.google.protobuf.c6;
import fr.n;
import gg.b;
import ho.l;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.player.PlayerService;
import ir.i;
import ir.w;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/services/MediaAudioPreviewService;", "Lio/elevenlabs/domain/services/AudioPreviewService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/player/PlayerService;", "playerService", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/player/PlayerService;)V", "Lsn/z;", "cleanup", "()V", "", "url", "Lio/elevenlabs/domain/model/AsyncCallResult;", "play", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "stop", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/player/PlayerService;", ParameterNames.TAG, "Ljava/lang/String;", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaAudioPreviewService implements AudioPreviewService {
    public static final int $stable = 8;
    private final Logger logger;
    private final MediaPlayer mediaPlayer;
    private final PlayerService playerService;
    private final String tag;

    public MediaAudioPreviewService(Logger logger, PlayerService playerService) {
        logger.getClass();
        playerService.getClass();
        this.logger = logger;
        this.playerService = playerService;
        this.tag = "MediaAudioPreviewService";
        this.mediaPlayer = new MediaPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanup() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.reset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ed, code lost:
    
        if (r11 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (ir.r.k(r7, r1) != r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r11 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // io.elevenlabs.domain.services.AudioPreviewService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object play(String str, c<? super AsyncCallResult<z>> cVar) {
        MediaAudioPreviewService$play$1 mediaAudioPreviewService$play$1;
        int i10;
        try {
            if (cVar instanceof MediaAudioPreviewService$play$1) {
                mediaAudioPreviewService$play$1 = (MediaAudioPreviewService$play$1) cVar;
                int i11 = mediaAudioPreviewService$play$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    mediaAudioPreviewService$play$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = mediaAudioPreviewService$play$1.result;
                    i10 = mediaAudioPreviewService$play$1.label;
                    xn.a aVar = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    sn.a.g(obj);
                                    return (AsyncCallResult) obj;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = (String) mediaAudioPreviewService$play$1.L$0;
                            sn.a.g(obj);
                            mediaAudioPreviewService$play$1.L$0 = str;
                            mediaAudioPreviewService$play$1.I$0 = 0;
                            mediaAudioPreviewService$play$1.label = 3;
                            final n nVar = new n(1, b.V(mediaAudioPreviewService$play$1));
                            nVar.t();
                            this.logger.log(this.tag, "play url: " + str);
                            nVar.e(new l() { // from class: io.elevenlabs.readerapp.services.MediaAudioPreviewService$play$3$1
                                @Override // ho.l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((Throwable) obj2);
                                    return z.f31622a;
                                }

                                public final void invoke(Throwable th) {
                                    MediaAudioPreviewService.this.cleanup();
                                }
                            });
                            final MediaPlayer mediaPlayer = this.mediaPlayer;
                            cleanup();
                            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: io.elevenlabs.readerapp.services.MediaAudioPreviewService$play$3$2$1
                                @Override // android.media.MediaPlayer.OnErrorListener
                                public final boolean onError(MediaPlayer mediaPlayer2, int i12, int i13) {
                                    MediaAudioPreviewService.this.logger.log(MediaAudioPreviewService.this.tag, android.gov.nist.javax.sip.header.a.j(i12, "Error playing a preview: ", " / ", i13));
                                    if (nVar.isActive()) {
                                        nVar.resumeWith(new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE));
                                        return true;
                                    }
                                    return true;
                                }
                            });
                            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: io.elevenlabs.readerapp.services.MediaAudioPreviewService$play$3$2$2
                                @Override // android.media.MediaPlayer.OnCompletionListener
                                public final void onCompletion(MediaPlayer mediaPlayer2) {
                                    try {
                                        MediaAudioPreviewService.this.logger.log(MediaAudioPreviewService.this.tag, "completed");
                                        if (nVar.isActive()) {
                                            nVar.resumeWith(new AsyncCallResult.Success(z.f31622a));
                                        }
                                    } finally {
                                        MediaAudioPreviewService.this.logger.log(MediaAudioPreviewService.this.tag, "cleaning");
                                        MediaAudioPreviewService.this.cleanup();
                                        MediaAudioPreviewService.this.logger.log(MediaAudioPreviewService.this.tag, "cleaned up");
                                    }
                                }
                            });
                            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: io.elevenlabs.readerapp.services.MediaAudioPreviewService$play$3$2$3
                                @Override // android.media.MediaPlayer.OnPreparedListener
                                public final void onPrepared(MediaPlayer mediaPlayer2) {
                                    MediaAudioPreviewService.this.logger.log(MediaAudioPreviewService.this.tag, "prepared");
                                    mediaPlayer.start();
                                    MediaAudioPreviewService.this.logger.log(MediaAudioPreviewService.this.tag, "started");
                                }
                            });
                            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build());
                            mediaPlayer.setDataSource(str);
                            mediaPlayer.prepareAsync();
                            obj = nVar.s();
                        } else {
                            str = (String) mediaAudioPreviewService$play$1.L$0;
                            sn.a.g(obj);
                        }
                    } else {
                        sn.a.g(obj);
                        this.logger.log(this.tag, "play");
                        PlayerService playerService = this.playerService;
                        mediaAudioPreviewService$play$1.L$0 = str;
                        mediaAudioPreviewService$play$1.label = 1;
                        obj = playerService.connect(mediaAudioPreviewService$play$1);
                    }
                    w wVar = new w((i) obj, new MediaAudioPreviewService$play$2(this, null), 4);
                    mediaAudioPreviewService$play$1.L$0 = str;
                    mediaAudioPreviewService$play$1.label = 2;
                }
            }
            if (i10 == 0) {
            }
            w wVar2 = new w((i) obj, new MediaAudioPreviewService$play$2(this, null), 4);
            mediaAudioPreviewService$play$1.L$0 = str;
            mediaAudioPreviewService$play$1.label = 2;
        } catch (CancellationException unused) {
            return new AsyncCallResult.Success(z.f31622a);
        }
        mediaAudioPreviewService$play$1 = new MediaAudioPreviewService$play$1(this, cVar);
        Object obj2 = mediaAudioPreviewService$play$1.result;
        i10 = mediaAudioPreviewService$play$1.label;
        xn.a aVar2 = xn.a.f37986a;
    }

    @Override // io.elevenlabs.domain.services.AudioPreviewService
    public Object stop(c<? super z> cVar) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.reset();
        return z.f31622a;
    }
}
