package io.elevenlabs.player;

import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.player.BackgroundPlayerService;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$audioPositionTrackingFlow$3", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerService$AudioPositionData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/player/BackgroundPlayerService$AudioPositionData;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$audioPositionTrackingFlow$3 extends i implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$audioPositionTrackingFlow$3(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$audioPositionTrackingFlow$3> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerService$audioPositionTrackingFlow$3 backgroundPlayerService$audioPositionTrackingFlow$3 = new BackgroundPlayerService$audioPositionTrackingFlow$3(this.this$0, cVar);
        backgroundPlayerService$audioPositionTrackingFlow$3.L$0 = obj;
        return backgroundPlayerService$audioPositionTrackingFlow$3;
    }

    @Override // ho.p
    public final Object invoke(BackgroundPlayerService.AudioPositionData audioPositionData, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$audioPositionTrackingFlow$3) create(audioPositionData, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        BackgroundPlayerService.AudioPositionData audioPositionData = (BackgroundPlayerService.AudioPositionData) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            if (audioPositionData.getAudioFileNumber() != null) {
                this.this$0.getSeekEmitter().updateAudioPositionWithChapter(audioPositionData.getPositionWithinChapterSeconds(), audioPositionData.getCurrentChapter());
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
