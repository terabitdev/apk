package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.ParticipantEvent;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.room.participant.Participant;
import ir.j;
import ir.n1;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.Room$setupLocalParticipantEventHandling$1", f = "Room.kt", l = {1602}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Room$setupLocalParticipantEventHandling$1 extends i implements p {
    int label;
    final /* synthetic */ Room this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$setupLocalParticipantEventHandling$1(Room room, c<? super Room$setupLocalParticipantEventHandling$1> cVar) {
        super(2, cVar);
        this.this$0 = room;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new Room$setupLocalParticipantEventHandling$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((Room$setupLocalParticipantEventHandling$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            EventListenable<ParticipantEvent> events = this.this$0.getLocalParticipant().getEvents();
            final Room room = this.this$0;
            n1 events2 = events.getEvents();
            j jVar = new j() { // from class: io.livekit.android.room.Room$setupLocalParticipantEventHandling$1$invokeSuspend$$inlined$collect$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // ir.j
                public final Object emit(T t10, c<? super z> cVar) {
                    Object emitWhenConnected;
                    Object emitWhenConnected2;
                    Object emitWhenConnected3;
                    Object emitWhenConnected4;
                    Object emitWhenConnected5;
                    Object emitWhenConnected6;
                    Object emitWhenConnected7;
                    ParticipantEvent participantEvent = (ParticipantEvent) t10;
                    if (participantEvent instanceof ParticipantEvent.TrackPublished) {
                        Room room2 = Room.this;
                        ParticipantEvent.TrackPublished trackPublished = (ParticipantEvent.TrackPublished) participantEvent;
                        emitWhenConnected7 = room2.emitWhenConnected(new RoomEvent.TrackPublished(room2, trackPublished.getPublication(), trackPublished.getParticipant()), cVar);
                        if (emitWhenConnected7 == xn.a.f37986a) {
                            return emitWhenConnected7;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.LocalTrackPublicationFailed) {
                        Room room3 = Room.this;
                        ParticipantEvent.LocalTrackPublicationFailed localTrackPublicationFailed = (ParticipantEvent.LocalTrackPublicationFailed) participantEvent;
                        emitWhenConnected6 = room3.emitWhenConnected(new RoomEvent.TrackPublicationFailed(room3, localTrackPublicationFailed.getTrack(), localTrackPublicationFailed.getParticipant(), localTrackPublicationFailed.getE()), cVar);
                        if (emitWhenConnected6 == xn.a.f37986a) {
                            return emitWhenConnected6;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.TrackUnpublished) {
                        Room room4 = Room.this;
                        ParticipantEvent.TrackUnpublished trackUnpublished = (ParticipantEvent.TrackUnpublished) participantEvent;
                        emitWhenConnected5 = room4.emitWhenConnected(new RoomEvent.TrackUnpublished(room4, trackUnpublished.getPublication(), trackUnpublished.getParticipant()), cVar);
                        if (emitWhenConnected5 == xn.a.f37986a) {
                            return emitWhenConnected5;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.ParticipantPermissionsChanged) {
                        Room room5 = Room.this;
                        Participant participant = participantEvent.getParticipant();
                        ParticipantEvent.ParticipantPermissionsChanged participantPermissionsChanged = (ParticipantEvent.ParticipantPermissionsChanged) participantEvent;
                        emitWhenConnected4 = room5.emitWhenConnected(new RoomEvent.ParticipantPermissionsChanged(room5, participant, participantPermissionsChanged.getNewPermissions(), participantPermissionsChanged.getOldPermissions()), cVar);
                        if (emitWhenConnected4 == xn.a.f37986a) {
                            return emitWhenConnected4;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.MetadataChanged) {
                        Room room6 = Room.this;
                        emitWhenConnected3 = room6.emitWhenConnected(new RoomEvent.ParticipantMetadataChanged(room6, participantEvent.getParticipant(), ((ParticipantEvent.MetadataChanged) participantEvent).getPrevMetadata()), cVar);
                        if (emitWhenConnected3 == xn.a.f37986a) {
                            return emitWhenConnected3;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.AttributesChanged) {
                        Room room7 = Room.this;
                        Participant participant2 = participantEvent.getParticipant();
                        ParticipantEvent.AttributesChanged attributesChanged = (ParticipantEvent.AttributesChanged) participantEvent;
                        emitWhenConnected2 = room7.emitWhenConnected(new RoomEvent.ParticipantAttributesChanged(room7, participant2, attributesChanged.getChangedAttributes(), attributesChanged.getOldAttributes()), cVar);
                        if (emitWhenConnected2 == xn.a.f37986a) {
                            return emitWhenConnected2;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.NameChanged) {
                        Room room8 = Room.this;
                        emitWhenConnected = room8.emitWhenConnected(new RoomEvent.ParticipantNameChanged(room8, participantEvent.getParticipant(), ((ParticipantEvent.NameChanged) participantEvent).getName()), cVar);
                        if (emitWhenConnected == xn.a.f37986a) {
                            return emitWhenConnected;
                        }
                    } else if (participantEvent instanceof ParticipantEvent.StateChanged) {
                        Room room9 = Room.this;
                        Participant participant3 = participantEvent.getParticipant();
                        ParticipantEvent.StateChanged stateChanged = (ParticipantEvent.StateChanged) participantEvent;
                        new RoomEvent.ParticipantStateChanged(room9, participant3, stateChanged.getNewState(), stateChanged.getOldState());
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
