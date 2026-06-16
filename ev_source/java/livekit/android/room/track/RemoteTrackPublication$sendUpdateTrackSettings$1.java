package io.livekit.android.room.track;

import com.google.protobuf.c6;
import ho.p;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.track.RemoteTrackPublication$sendUpdateTrackSettings$1", f = "RemoteTrackPublication.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsn/z;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteTrackPublication$sendUpdateTrackSettings$1 extends i implements p {
    int label;
    final /* synthetic */ RemoteTrackPublication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteTrackPublication$sendUpdateTrackSettings$1(RemoteTrackPublication remoteTrackPublication, c<? super RemoteTrackPublication$sendUpdateTrackSettings$1> cVar) {
        super(2, cVar);
        this.this$0 = remoteTrackPublication;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RemoteTrackPublication$sendUpdateTrackSettings$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(z zVar, c<? super z> cVar) {
        return ((RemoteTrackPublication$sendUpdateTrackSettings$1) create(zVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            this.this$0.sendUpdateTrackSettingsImpl();
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
