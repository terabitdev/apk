package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.player.media.MediaItemCreator;
import ja.z;
import java.util.List;
import kotlin.Metadata;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$addUniqueToQueue$2", f = "BackgroundPlayerControllerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$addUniqueToQueue$2 extends i implements p {
    final /* synthetic */ z $controller;
    final /* synthetic */ List<ReadMeta> $readMetas;
    int label;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$addUniqueToQueue$2(BackgroundPlayerControllerService backgroundPlayerControllerService, List<ReadMeta> list, z zVar, wn.c<? super BackgroundPlayerControllerService$addUniqueToQueue$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerControllerService;
        this.$readMetas = list;
        this.$controller = zVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerControllerService$addUniqueToQueue$2(this.this$0, this.$readMetas, this.$controller, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((BackgroundPlayerControllerService$addUniqueToQueue$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        boolean z6;
        Integer indexOfMediaId;
        long j4;
        MediaItemCreator mediaItemCreator;
        if (this.label == 0) {
            sn.a.g(obj);
            logger = this.this$0.logger;
            str = this.this$0.tag;
            logger.log(str, android.gov.nist.javax.sip.header.a.j(this.$readMetas.size(), "Calling addUniqueToQueue with ", " items. Current item count: ", this.$controller.getMediaItemCount()));
            int i10 = 0;
            if (this.$controller.getMediaItemCount() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            for (ReadMeta readMeta : this.$readMetas) {
                int i11 = i10 + 1;
                indexOfMediaId = BackgroundPlayerControllerServiceKt.indexOfMediaId(this.$controller, readMeta.getReadId());
                if (indexOfMediaId == null) {
                    if (z6 && i10 == 0) {
                        if (ReadMetaKt.isMediaType(readMeta)) {
                            j4 = -1;
                        } else {
                            j4 = readMeta.getLastListenedCharOffset();
                        }
                    } else {
                        j4 = 0;
                    }
                    z zVar = this.$controller;
                    mediaItemCreator = this.this$0.mediaItemCreator;
                    zVar.addMediaItem(mediaItemCreator.createMediaItem(readMeta, null, j4));
                }
                i10 = i11;
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
