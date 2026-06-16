package io.elevenlabs.player;

import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.PlaybackSource;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.player.consumption.ChapterMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.l;
import sn.z;
import tn.o;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$onCreate$3", f = "BackgroundPlayerService.kt", l = {321}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lio/elevenlabs/player/consumption/ChapterMeta;", "readId", "", "windowIndex", ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$onCreate$3 extends i implements q {
    /* synthetic */ int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$onCreate$3(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$onCreate$3> cVar) {
        super(3, cVar);
        this.this$0 = backgroundPlayerService;
    }

    public final Object invoke(String str, int i10, wn.c<? super ChapterMeta> cVar) {
        BackgroundPlayerService$onCreate$3 backgroundPlayerService$onCreate$3 = new BackgroundPlayerService$onCreate$3(this.this$0, cVar);
        backgroundPlayerService$onCreate$3.L$0 = str;
        backgroundPlayerService$onCreate$3.I$0 = i10;
        return backgroundPlayerService$onCreate$3.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object lVar;
        PlaybackSource resolvePlaybackSource;
        String str = (String) this.L$0;
        int i10 = this.I$0;
        int i11 = this.label;
        boolean z6 = false;
        String str2 = null;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                ReadsService readsService = this.this$0.getReadsService();
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i10;
                this.I$1 = 0;
                this.label = 1;
                obj = readsService.getRead(str, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            lVar = (ReadMeta) obj;
        } catch (Throwable th) {
            lVar = new l(th);
        }
        if (lVar instanceof l) {
            lVar = null;
        }
        ReadMeta readMeta = (ReadMeta) lVar;
        if (readMeta == null) {
            return null;
        }
        Chapter chapter = (Chapter) o.z0(i10, readMeta.getChapters());
        if (chapter != null) {
            str2 = chapter.getAudioFileNumber();
        }
        resolvePlaybackSource = this.this$0.resolvePlaybackSource(readMeta, i10);
        if (readMeta.getAudioType() == AudioType.MEDIA) {
            z6 = true;
        }
        return new ChapterMeta(str2, resolvePlaybackSource, z6);
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((String) obj, ((Number) obj2).intValue(), (wn.c<? super ChapterMeta>) obj3);
    }
}
