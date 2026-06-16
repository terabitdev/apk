package io.livekit.android.room;

import com.google.protobuf.c6;
import ho.p;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.ParticipantEvent;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.participant.RemoteParticipant;
import ir.j;
import ir.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.Room$getOrCreateRemoteParticipant$1", f = "Room.kt", l = {1602}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Room$getOrCreateRemoteParticipant$1 extends i implements p {
    final /* synthetic */ d0 $participant;
    int label;
    final /* synthetic */ Room this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$getOrCreateRemoteParticipant$1(d0 d0Var, Room room, c<? super Room$getOrCreateRemoteParticipant$1> cVar) {
        super(2, cVar);
        this.$participant = d0Var;
        this.this$0 = room;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new Room$getOrCreateRemoteParticipant$1(this.$participant, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
        return ((Room$getOrCreateRemoteParticipant$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.g(obj);
        } else {
            a.g(obj);
            EventListenable<ParticipantEvent> events = ((RemoteParticipant) this.$participant.f20559a).getEvents();
            final Room room = this.this$0;
            n1 events2 = events.getEvents();
            j jVar = new j() { // from class: io.livekit.android.room.Room$getOrCreateRemoteParticipant$1$invokeSuspend$$inlined$collect$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // ir.j
                public final Object emit(T t10, c<? super z> cVar) {
                    BroadcastEventBus broadcastEventBus;
                    BroadcastEventBus broadcastEventBus2;
                    Object emitWhenConnected;
                    Object emitWhenConnected2;
                    Object emitWhenConnected3;
                    BroadcastEventBus broadcastEventBus3;
                    BroadcastEventBus broadcastEventBus4;
                    BroadcastEventBus broadcastEventBus5;
                    ParticipantEvent participantEvent = (ParticipantEvent) t10;
                    if (participantEvent instanceof ParticipantEvent.TrackPublished) {
                        if (Room.this.getState() == Room.State.CONNECTED) {
                            broadcastEventBus5 = Room.this.eventBus;
                            ParticipantEvent.TrackPublished trackPublished = (ParticipantEvent.TrackPublished) participantEvent;
                            Object postEvent = broadcastEventBus5.postEvent((BroadcastEventBus) new RoomEvent.TrackPublished(Room.this, trackPublished.getPublication(), trackPublished.getParticipant()), cVar);
                            if (postEvent == xn.a.f37986a) {
                                return postEvent;
                            }
                        }
                    } else if (participantEvent instanceof ParticipantEvent.TrackStreamStateChanged) {
                        broadcastEventBus4 = Room.this.eventBus;
                        ParticipantEvent.TrackStreamStateChanged trackStreamStateChanged = (ParticipantEvent.TrackStreamStateChanged) participantEvent;
                        Object postEvent2 = broadcastEventBus4.postEvent((BroadcastEventBus) new RoomEvent.TrackStreamStateChanged(Room.this, trackStreamStateChanged.getTrackPublication(), trackStreamStateChanged.getStreamState()), cVar);
                        if (postEvent2 == xn.a.f37986a) {
                            return postEvent2;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.TrackSubscriptionPermissionChanged) {
                        broadcastEventBus3 = Room.this.eventBus;
                        ParticipantEvent.TrackSubscriptionPermissionChanged trackSubscriptionPermissionChanged = (ParticipantEvent.TrackSubscriptionPermissionChanged) participantEvent;
                        Object postEvent3 = broadcastEventBus3.postEvent((BroadcastEventBus) new RoomEvent.TrackSubscriptionPermissionChanged(Room.this, trackSubscriptionPermissionChanged.getParticipant(), trackSubscriptionPermissionChanged.getTrackPublication(), trackSubscriptionPermissionChanged.getSubscriptionAllowed()), cVar);
                        if (postEvent3 == xn.a.f37986a) {
                            return postEvent3;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.MetadataChanged) {
                        Room room2 = Room.this;
                        emitWhenConnected3 = room2.emitWhenConnected(new RoomEvent.ParticipantMetadataChanged(room2, participantEvent.getParticipant(), ((ParticipantEvent.MetadataChanged) participantEvent).getPrevMetadata()), cVar);
                        if (emitWhenConnected3 == xn.a.f37986a) {
                            return emitWhenConnected3;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.AttributesChanged) {
                        Room room3 = Room.this;
                        Participant participant = participantEvent.getParticipant();
                        ParticipantEvent.AttributesChanged attributesChanged = (ParticipantEvent.AttributesChanged) participantEvent;
                        emitWhenConnected2 = room3.emitWhenConnected(new RoomEvent.ParticipantAttributesChanged(room3, participant, attributesChanged.getChangedAttributes(), attributesChanged.getOldAttributes()), cVar);
                        if (emitWhenConnected2 == xn.a.f37986a) {
                            return emitWhenConnected2;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.NameChanged) {
                        Room room4 = Room.this;
                        emitWhenConnected = room4.emitWhenConnected(new RoomEvent.ParticipantNameChanged(room4, participantEvent.getParticipant(), ((ParticipantEvent.NameChanged) participantEvent).getName()), cVar);
                        if (emitWhenConnected == xn.a.f37986a) {
                            return emitWhenConnected;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.ParticipantPermissionsChanged) {
                        broadcastEventBus2 = Room.this.eventBus;
                        Room room5 = Room.this;
                        Participant participant2 = participantEvent.getParticipant();
                        ParticipantEvent.ParticipantPermissionsChanged participantPermissionsChanged = (ParticipantEvent.ParticipantPermissionsChanged) participantEvent;
                        Object postEvent4 = broadcastEventBus2.postEvent((BroadcastEventBus) new RoomEvent.ParticipantPermissionsChanged(room5, participant2, participantPermissionsChanged.getNewPermissions(), participantPermissionsChanged.getOldPermissions()), cVar);
                        if (postEvent4 == xn.a.f37986a) {
                            return postEvent4;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.StateChanged) {
                        broadcastEventBus = Room.this.eventBus;
                        Room room6 = Room.this;
                        Participant participant3 = participantEvent.getParticipant();
                        ParticipantEvent.StateChanged stateChanged = (ParticipantEvent.StateChanged) participantEvent;
                        Object postEvent5 = broadcastEventBus.postEvent((BroadcastEventBus) new RoomEvent.ParticipantStateChanged(room6, participant3, stateChanged.getNewState(), stateChanged.getOldState()), cVar);
                        if (postEvent5 == xn.a.f37986a) {
                            return postEvent5;
                        }
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
