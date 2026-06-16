package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import ho.p;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.DisconnectReason;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.room.Room;
import io.livekit.android.room.network.NetworkCallbackManager;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import or.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.Room$handleDisconnect$1", f = "Room.kt", l = {1607, 970}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Room$handleDisconnect$1 extends i implements p {
    final /* synthetic */ DisconnectReason $reason;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Room this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$handleDisconnect$1(Room room, DisconnectReason disconnectReason, c<? super Room$handleDisconnect$1> cVar) {
        super(2, cVar);
        this.this$0 = room;
        this.$reason = disconnectReason;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new Room$handleDisconnect$1(this.this$0, this.$reason, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((Room$handleDisconnect$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (r11.a(r10) == r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a8 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:8:0x00a2, B:10:0x00a8, B:14:0x00af, B:15:0x00b2), top: B:6:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af A[Catch: all -> 0x001e, TRY_ENTER, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:8:0x00a2, B:10:0x00a8, B:14:0x00af, B:15:0x00b2), top: B:6:0x0019 }] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Room room;
        DisconnectReason disconnectReason;
        a aVar2;
        Throwable th;
        NetworkCallbackManager networkCallbackManager;
        BroadcastEventBus broadcastEventBus;
        d0 d0Var;
        d0 d0Var2;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar3 = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        room = (Room) this.L$1;
                        aVar2 = (a) this.L$0;
                        try {
                            sn.a.g(obj);
                            d0Var2 = room.coroutineScope;
                            if (d0Var2 == null) {
                                g0.i(d0Var2, null);
                                aVar2.n(null);
                                return zVar;
                            }
                            m.i("coroutineScope");
                            throw null;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.n(null);
                            throw th;
                        }
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                DisconnectReason disconnectReason2 = (DisconnectReason) this.L$2;
                Room room2 = (Room) this.L$1;
                a aVar4 = (a) this.L$0;
                sn.a.g(obj);
                disconnectReason = disconnectReason2;
                room = room2;
                aVar = aVar4;
            } else {
                sn.a.g(obj);
                aVar = this.this$0.stateLock;
                room = this.this$0;
                disconnectReason = this.$reason;
                this.L$0 = aVar;
                this.L$1 = room;
                this.L$2 = disconnectReason;
                this.label = 1;
            }
            Room.State state = room.getState();
            Room.State state2 = Room.State.DISCONNECTED;
            if (state != state2) {
                networkCallbackManager = room.networkCallbackManager;
                networkCallbackManager.unregisterCallback();
                room.setState(state2);
                room.cleanupRoom();
                RTCEngine.close$default(room.getEngine(), null, 1, null);
                room.getLocalParticipant().dispose();
                broadcastEventBus = room.eventBus;
                RoomEvent.Disconnected disconnected = new RoomEvent.Disconnected(room, null, disconnectReason);
                d0Var = room.coroutineScope;
                if (d0Var != null) {
                    k1 postEvent = broadcastEventBus.postEvent((BroadcastEventBus) disconnected, d0Var);
                    this.L$0 = aVar;
                    this.L$1 = room;
                    this.L$2 = null;
                    this.label = 2;
                    if (postEvent.join(this) != aVar3) {
                        aVar2 = aVar;
                        d0Var2 = room.coroutineScope;
                        if (d0Var2 == null) {
                        }
                    }
                    return aVar3;
                }
                m.i("coroutineScope");
                throw null;
            }
            aVar.n(null);
            return zVar;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.n(null);
            throw th;
        }
    }
}
