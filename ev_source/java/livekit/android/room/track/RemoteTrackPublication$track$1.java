package io.livekit.android.room.track;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.TrackEvent;
import io.livekit.android.rpc.RpcError;
import ir.j;
import ir.n1;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.track.RemoteTrackPublication$track$1", f = "RemoteTrackPublication.kt", l = {RpcError.MAX_MESSAGE_BYTES}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteTrackPublication$track$1 extends i implements p {
    final /* synthetic */ Track $value;
    int label;
    final /* synthetic */ RemoteTrackPublication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteTrackPublication$track$1(Track track, RemoteTrackPublication remoteTrackPublication, c<? super RemoteTrackPublication$track$1> cVar) {
        super(2, cVar);
        this.$value = track;
        this.this$0 = remoteTrackPublication;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RemoteTrackPublication$track$1(this.$value, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RemoteTrackPublication$track$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            EventListenable<TrackEvent> events = this.$value.getEvents();
            final RemoteTrackPublication remoteTrackPublication = this.this$0;
            n1 events2 = events.getEvents();
            j jVar = new j() { // from class: io.livekit.android.room.track.RemoteTrackPublication$track$1$invokeSuspend$$inlined$collect$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // ir.j
                public final Object emit(T t10, c<? super z> cVar) {
                    TrackEvent trackEvent = (TrackEvent) t10;
                    if (trackEvent instanceof TrackEvent.VisibilityChanged) {
                        RemoteTrackPublication.this.handleVisibilityChanged(((TrackEvent.VisibilityChanged) trackEvent).getIsVisible());
                    } else if (trackEvent instanceof TrackEvent.VideoDimensionsChanged) {
                        RemoteTrackPublication.this.handleVideoDimensionsChanged(((TrackEvent.VideoDimensionsChanged) trackEvent).getNewDimensions());
                    } else if (trackEvent instanceof TrackEvent.StreamStateChanged) {
                        RemoteTrackPublication.this.handleStreamStateChanged((TrackEvent.StreamStateChanged) trackEvent);
                    }
                    return z.f31622a;
                }
            };
            this.label = 1;
            Object collect = events2.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        c6.u();
        return null;
    }
}
