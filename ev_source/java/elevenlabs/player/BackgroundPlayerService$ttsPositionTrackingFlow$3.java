package io.elevenlabs.player;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import ho.q;
import kotlin.Metadata;
import sn.k;
import sn.p;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$ttsPositionTrackingFlow$3", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsn/k;", "", "<destruct>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lsn/p;", "<anonymous>", "(Lsn/k;I)Lsn/p;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$ttsPositionTrackingFlow$3 extends i implements q {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    public BackgroundPlayerService$ttsPositionTrackingFlow$3(wn.c<? super BackgroundPlayerService$ttsPositionTrackingFlow$3> cVar) {
        super(3, cVar);
    }

    public final Object invoke(k kVar, int i10, wn.c<? super p> cVar) {
        BackgroundPlayerService$ttsPositionTrackingFlow$3 backgroundPlayerService$ttsPositionTrackingFlow$3 = new BackgroundPlayerService$ttsPositionTrackingFlow$3(cVar);
        backgroundPlayerService$ttsPositionTrackingFlow$3.L$0 = kVar;
        backgroundPlayerService$ttsPositionTrackingFlow$3.I$0 = i10;
        return backgroundPlayerService$ttsPositionTrackingFlow$3.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        k kVar = (k) this.L$0;
        int i10 = this.I$0;
        if (this.label == 0) {
            sn.a.g(obj);
            Boolean bool = (Boolean) kVar.f31600a;
            bool.booleanValue();
            Boolean bool2 = (Boolean) kVar.f31601b;
            bool2.booleanValue();
            return new p(bool, bool2, new Integer(i10));
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((k) obj, ((Number) obj2).intValue(), (wn.c<? super p>) obj3);
    }
}
