package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.ReadsService;
import io.livekit.android.room.SignalClient;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$prepareInitialChapterSeek$1", f = "BackgroundPlayerService.kt", l = {979}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$prepareInitialChapterSeek$1 extends i implements p {
    final /* synthetic */ r0 $mediaItem;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$prepareInitialChapterSeek$1(BackgroundPlayerService backgroundPlayerService, r0 r0Var, wn.c<? super BackgroundPlayerService$prepareInitialChapterSeek$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$mediaItem = r0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$prepareInitialChapterSeek$1(this.this$0, this.$mediaItem, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$prepareInitialChapterSeek$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadMeta readMeta;
        boolean isAudioTransport;
        double d10;
        String str;
        int i10 = this.label;
        Integer num = null;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                ReadsService readsService = this.this$0.getReadsService();
                String str2 = this.$mediaItem.f36578a;
                str2.getClass();
                this.label = 1;
                obj = readsService.getRead(str2, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            readMeta = (ReadMeta) obj;
        } catch (Exception e10) {
            ib.i.r("Failed to load read metadata for initial seek: ", e10.getMessage(), this.this$0.getLogger(), this.this$0.tag);
            readMeta = null;
        }
        if (readMeta != null && ReadMetaKt.isMediaType(readMeta)) {
            isAudioTransport = BackgroundPlayerServiceKt.isAudioTransport(this.$mediaItem);
            if (isAudioTransport && readMeta.getChapters().size() > 1) {
                Iterator<Chapter> it = readMeta.getChapters().iterator();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (m.c(it.next().getAudioFileNumber(), readMeta.getLastListenedAudioFileNumber())) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                Integer num2 = new Integer(i12);
                if (num2.intValue() >= 0) {
                    num = num2;
                }
                if (num != null) {
                    i11 = num.intValue();
                }
                Double lastListenedAudioSeconds = readMeta.getLastListenedAudioSeconds();
                if (lastListenedAudioSeconds != null) {
                    d10 = lastListenedAudioSeconds.doubleValue();
                } else {
                    d10 = 0.0d;
                }
                long j4 = (long) (d10 * SignalClient.CLOSE_REASON_NORMAL_CLOSURE);
                if (i11 > 0 || j4 > 0) {
                    str = this.this$0.currentReadId;
                    if (m.c(str, this.$mediaItem.f36578a)) {
                        this.this$0.pendingSeekChapterIndex = i11;
                        this.this$0.pendingSeekPositionMs = j4;
                        this.this$0.seekPositionReady.set(true);
                        this.this$0.needsInitialSeek.set(true);
                        this.this$0.getLogger().log(this.this$0.tag, "Will seek to chapter " + i11 + " at " + j4 + "ms once READY");
                    }
                }
            }
        }
        return z.f31622a;
    }
}
