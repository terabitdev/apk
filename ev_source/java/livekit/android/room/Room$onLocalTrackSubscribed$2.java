package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.room.track.LocalTrackPublication;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.Room$onLocalTrackSubscribed$2", f = "Room.kt", l = {1443}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Room$onLocalTrackSubscribed$2 extends i implements p {
    final /* synthetic */ LocalTrackPublication $publication;
    int label;
    final /* synthetic */ Room this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$onLocalTrackSubscribed$2(Room room, LocalTrackPublication localTrackPublication, c<? super Room$onLocalTrackSubscribed$2> cVar) {
        super(2, cVar);
        this.this$0 = room;
        this.$publication = localTrackPublication;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new Room$onLocalTrackSubscribed$2(this.this$0, this.$publication, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((Room$onLocalTrackSubscribed$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object emitWhenConnected;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            Room room = this.this$0;
            RoomEvent.LocalTrackSubscribed localTrackSubscribed = new RoomEvent.LocalTrackSubscribed(room, this.$publication, room.getLocalParticipant());
            this.label = 1;
            emitWhenConnected = room.emitWhenConnected(localTrackSubscribed, this);
            xn.a aVar = xn.a.f37986a;
            if (emitWhenConnected == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
