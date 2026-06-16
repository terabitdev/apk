package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.player.media.MediaItemCreator;
import ir.j1;
import ja.z;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$initPlayer$3", f = "BackgroundPlayerControllerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$initPlayer$3 extends i implements p {
    final /* synthetic */ z $controller;
    final /* synthetic */ long $initialOffset;
    final /* synthetic */ boolean $playWhenReady;
    final /* synthetic */ ReadMeta $readMeta;
    final /* synthetic */ String $voiceId;
    int label;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$initPlayer$3(z zVar, BackgroundPlayerControllerService backgroundPlayerControllerService, ReadMeta readMeta, String str, long j4, boolean z6, wn.c<? super BackgroundPlayerControllerService$initPlayer$3> cVar) {
        super(2, cVar);
        this.$controller = zVar;
        this.this$0 = backgroundPlayerControllerService;
        this.$readMeta = readMeta;
        this.$voiceId = str;
        this.$initialOffset = j4;
        this.$playWhenReady = z6;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerControllerService$initPlayer$3(this.$controller, this.this$0, this.$readMeta, this.$voiceId, this.$initialOffset, this.$playWhenReady, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((BackgroundPlayerControllerService$initPlayer$3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        j1 j1Var;
        Integer indexOfMediaId;
        MediaItemCreator mediaItemCreator;
        MediaItemCreator mediaItemCreator2;
        Bundle bundle;
        if (this.label == 0) {
            sn.a.g(obj);
            z zVar = this.$controller;
            j1Var = this.this$0.speedState;
            zVar.setPlaybackSpeed(((Number) j1Var.getValue()).floatValue());
            indexOfMediaId = BackgroundPlayerControllerServiceKt.indexOfMediaId(this.$controller, this.$readMeta.getReadId());
            z zVar2 = this.$controller;
            if (indexOfMediaId == null) {
                mediaItemCreator = this.this$0.mediaItemCreator;
                zVar2.setMediaItems(mediaItemCreator.createMediaItems(ig.f.H(this.$readMeta), this.$voiceId, 0, this.$initialOffset));
                this.$controller.prepare();
                this.$controller.setPlayWhenReady(this.$playWhenReady);
            } else {
                r0 mediaItemAt = zVar2.getMediaItemAt(indexOfMediaId.intValue());
                mediaItemAt.getClass();
                mediaItemCreator2 = this.this$0.mediaItemCreator;
                String str = this.$voiceId;
                String str2 = null;
                if (str == null) {
                    if (m.c(mediaItemAt.f36578a, this.$readMeta.getReadId()) && (bundle = mediaItemAt.f36581d.J) != null) {
                        str = ExchangeKt.getVoiceId(bundle);
                    } else {
                        str = null;
                    }
                }
                r0 createMediaItem = mediaItemCreator2.createMediaItem(this.$readMeta, str, this.$initialOffset);
                this.$controller.replaceMediaItem(indexOfMediaId.intValue(), createMediaItem);
                this.$controller.prepare();
                this.$controller.setPlayWhenReady(this.$playWhenReady);
                Bundle bundle2 = createMediaItem.f36581d.J;
                if (bundle2 != null) {
                    str2 = ExchangeKt.getVoiceId(bundle2);
                }
                boolean c5 = m.c(str2, EffectivePlaybackModeKt.ORIGINAL_AUDIO);
                if (ReadMetaKt.isMediaType(this.$readMeta) && c5) {
                    this.$controller.seekTo(indexOfMediaId.intValue(), 0L);
                }
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
