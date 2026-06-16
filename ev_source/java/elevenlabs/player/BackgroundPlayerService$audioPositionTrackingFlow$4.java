package io.elevenlabs.player;

import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.player.BackgroundPlayerService;
import kotlin.Metadata;
import sn.z;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$audioPositionTrackingFlow$4", f = "BackgroundPlayerService.kt", l = {567}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerService$AudioPositionData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/player/BackgroundPlayerService$AudioPositionData;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$audioPositionTrackingFlow$4 extends i implements p {
    final /* synthetic */ r0 $item;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$audioPositionTrackingFlow$4(BackgroundPlayerService backgroundPlayerService, r0 r0Var, wn.c<? super BackgroundPlayerService$audioPositionTrackingFlow$4> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$item = r0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerService$audioPositionTrackingFlow$4 backgroundPlayerService$audioPositionTrackingFlow$4 = new BackgroundPlayerService$audioPositionTrackingFlow$4(this.this$0, this.$item, cVar);
        backgroundPlayerService$audioPositionTrackingFlow$4.L$0 = obj;
        return backgroundPlayerService$audioPositionTrackingFlow$4;
    }

    @Override // ho.p
    public final Object invoke(BackgroundPlayerService.AudioPositionData audioPositionData, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$audioPositionTrackingFlow$4) create(audioPositionData, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        BackgroundPlayerService$audioPositionTrackingFlow$4 backgroundPlayerService$audioPositionTrackingFlow$4;
        Exception exc;
        ReadsService readsService;
        String str;
        String audioFileNumber;
        double positionWithinChapterSeconds;
        BackgroundPlayerService.AudioPositionData audioPositionData = (BackgroundPlayerService.AudioPositionData) this.L$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                try {
                    sn.a.g(obj);
                } catch (Exception e10) {
                    exc = e10;
                    backgroundPlayerService$audioPositionTrackingFlow$4 = this;
                    ib.i.r("Error saving audio position: ", exc.getMessage(), backgroundPlayerService$audioPositionTrackingFlow$4.this$0.getLogger(), backgroundPlayerService$audioPositionTrackingFlow$4.this$0.tag);
                    return z.f31622a;
                }
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            if (audioPositionData.getAudioFileNumber() != null && audioPositionData.getPositionWithinChapterSeconds() > 0.5d) {
                try {
                    readsService = this.this$0.getReadsService();
                    str = this.$item.f36578a;
                    str.getClass();
                    audioFileNumber = audioPositionData.getAudioFileNumber();
                    positionWithinChapterSeconds = audioPositionData.getPositionWithinChapterSeconds();
                    this.L$0 = null;
                    this.label = 1;
                    backgroundPlayerService$audioPositionTrackingFlow$4 = this;
                } catch (Exception e11) {
                    e = e11;
                    backgroundPlayerService$audioPositionTrackingFlow$4 = this;
                }
                try {
                    Object updateAudioPosition = readsService.updateAudioPosition(str, audioFileNumber, positionWithinChapterSeconds, backgroundPlayerService$audioPositionTrackingFlow$4);
                    xn.a aVar = xn.a.f37986a;
                    if (updateAudioPosition == aVar) {
                        return aVar;
                    }
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    ib.i.r("Error saving audio position: ", exc.getMessage(), backgroundPlayerService$audioPositionTrackingFlow$4.this$0.getLogger(), backgroundPlayerService$audioPositionTrackingFlow$4.this$0.tag);
                    return z.f31622a;
                }
                return z.f31622a;
            }
        }
        return z.f31622a;
    }
}
