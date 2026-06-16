package io.elevenlabs.player;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import ho.q;
import kotlin.Metadata;
import sn.k;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$audioPositionTrackingFlow$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "playing", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lsn/k;", "<anonymous>", "(ZI)Lsn/k;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$audioPositionTrackingFlow$1 extends i implements q {
    /* synthetic */ int I$0;
    /* synthetic */ boolean Z$0;
    int label;

    public BackgroundPlayerService$audioPositionTrackingFlow$1(wn.c<? super BackgroundPlayerService$audioPositionTrackingFlow$1> cVar) {
        super(3, cVar);
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), (wn.c<? super k>) obj3);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean z6 = this.Z$0;
        int i10 = this.I$0;
        if (this.label == 0) {
            sn.a.g(obj);
            return new k(Boolean.valueOf(z6), new Integer(i10));
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(boolean z6, int i10, wn.c<? super k> cVar) {
        BackgroundPlayerService$audioPositionTrackingFlow$1 backgroundPlayerService$audioPositionTrackingFlow$1 = new BackgroundPlayerService$audioPositionTrackingFlow$1(cVar);
        backgroundPlayerService$audioPositionTrackingFlow$1.Z$0 = z6;
        backgroundPlayerService$audioPositionTrackingFlow$1.I$0 = i10;
        return backgroundPlayerService$audioPositionTrackingFlow$1.invokeSuspend(z.f31622a);
    }
}
