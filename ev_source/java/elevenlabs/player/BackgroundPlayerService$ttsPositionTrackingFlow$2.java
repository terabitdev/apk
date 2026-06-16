package io.elevenlabs.player;

import com.google.protobuf.c6;
import ho.q;
import kotlin.Metadata;
import sn.k;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$ttsPositionTrackingFlow$2", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "subs", "playing", "Lsn/k;", "<anonymous>", "(ZZ)Lsn/k;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$ttsPositionTrackingFlow$2 extends i implements q {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    public BackgroundPlayerService$ttsPositionTrackingFlow$2(wn.c<? super BackgroundPlayerService$ttsPositionTrackingFlow$2> cVar) {
        super(3, cVar);
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (wn.c<? super k>) obj3);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean z6 = this.Z$0;
        boolean z10 = this.Z$1;
        if (this.label == 0) {
            sn.a.g(obj);
            return new k(Boolean.valueOf(z6), Boolean.valueOf(z10));
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(boolean z6, boolean z10, wn.c<? super k> cVar) {
        BackgroundPlayerService$ttsPositionTrackingFlow$2 backgroundPlayerService$ttsPositionTrackingFlow$2 = new BackgroundPlayerService$ttsPositionTrackingFlow$2(cVar);
        backgroundPlayerService$ttsPositionTrackingFlow$2.Z$0 = z6;
        backgroundPlayerService$ttsPositionTrackingFlow$2.Z$1 = z10;
        return backgroundPlayerService$ttsPositionTrackingFlow$2.invokeSuspend(z.f31622a);
    }
}
