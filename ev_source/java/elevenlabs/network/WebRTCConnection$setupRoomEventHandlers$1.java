package io.elevenlabs.network;

import android.util.Log;
import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.ConversationConfig;
import io.elevenlabs.ConversationOverridesBuilder;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.Participant;
import ir.j;
import ir.n1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import rd.s0;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.f;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.network.WebRTCConnection$setupRoomEventHandlers$1", f = "WebRTCConnection.kt", l = {408}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class WebRTCConnection$setupRoomEventHandlers$1 extends i implements p {
    int label;
    final /* synthetic */ WebRTCConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRTCConnection$setupRoomEventHandlers$1(WebRTCConnection webRTCConnection, c<? super WebRTCConnection$setupRoomEventHandlers$1> cVar) {
        super(2, cVar);
        this.this$0 = webRTCConnection;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new WebRTCConnection$setupRoomEventHandlers$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((WebRTCConnection$setupRoomEventHandlers$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Room room;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.g(obj);
        } else {
            a.g(obj);
            room = this.this$0.room;
            EventListenable<RoomEvent> events = room.getEvents();
            final WebRTCConnection webRTCConnection = this.this$0;
            n1 events2 = events.getEvents();
            j jVar = new j() { // from class: io.elevenlabs.network.WebRTCConnection$setupRoomEventHandlers$1$invokeSuspend$$inlined$collect$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // ir.j
                public final Object emit(T t10, c<? super z> cVar) {
                    Room room2;
                    String m2548toStringimpl;
                    Room room3;
                    Room room4;
                    ConversationConfig conversationConfig;
                    l onConnect;
                    ConversationConfig conversationConfig2;
                    RoomEvent roomEvent = (RoomEvent) t10;
                    if (roomEvent instanceof RoomEvent.Connected) {
                        room2 = WebRTCConnection.this.room;
                        String m2537getSidCC6JpwI = room2.m2537getSidCC6JpwI();
                        if (m2537getSidCC6JpwI == null) {
                            m2548toStringimpl = "null";
                        } else {
                            m2548toStringimpl = Room.Sid.m2548toStringimpl(m2537getSidCC6JpwI);
                        }
                        room3 = WebRTCConnection.this.room;
                        Log.d("WebRTCConnection", "Connected. roomSid=" + m2548toStringimpl + ", name=" + room3.getName());
                        WebRTCConnection.this.updateConnectionState(ConnectionState.CONNECTED);
                        WebRTCConnection.this.startAudioLevelMonitoring();
                        try {
                            conversationConfig2 = WebRTCConnection.this.latestConfig;
                            if (conversationConfig2 != null) {
                                String jSONObject = ConversationOverridesBuilder.INSTANCE.constructOverrides(conversationConfig2).toString();
                                jSONObject.getClass();
                                WebRTCConnection.this.sendMessage(jSONObject);
                            }
                        } catch (Exception e10) {
                            android.gov.nist.javax.sip.header.a.s("failed to send overrides - ", e10.getMessage(), "WebRTCConnection");
                        }
                        try {
                            room4 = WebRTCConnection.this.room;
                            String name = room4.getName();
                            if (name == null) {
                                name = "";
                            }
                            Pattern compile = Pattern.compile("conv_[A-Za-z0-9_-]+", 66);
                            compile.getClass();
                            Matcher matcher = compile.matcher(name);
                            matcher.getClass();
                            wq.i g10 = s0.g(matcher, 0, name);
                            if (g10 != null) {
                                name = g10.f37255a.group();
                                name.getClass();
                            }
                            conversationConfig = WebRTCConnection.this.latestConfig;
                            if (conversationConfig != null && (onConnect = conversationConfig.getOnConnect()) != null) {
                                onConnect.invoke(name);
                            }
                        } catch (Throwable th) {
                            f.b(Log.d("WebRTCConnection", "onConnect callback threw: " + th.getMessage()));
                        }
                    } else if (roomEvent instanceof RoomEvent.Disconnected) {
                        Log.d("WebRTCConnection", "LiveKit room disconnected: " + ((RoomEvent.Disconnected) roomEvent).getReason());
                        if (WebRTCConnection.this.getConnectionState() == ConnectionState.CONNECTED) {
                            WebRTCConnection.this.updateConnectionState(ConnectionState.DISCONNECTED);
                        }
                    } else if (roomEvent instanceof RoomEvent.Reconnecting) {
                        Log.d("WebRTCConnection", "LiveKit room reconnecting");
                        WebRTCConnection.this.updateConnectionState(ConnectionState.RECONNECTING);
                    } else if (roomEvent instanceof RoomEvent.Reconnected) {
                        Log.d("WebRTCConnection", "LiveKit room reconnected");
                        WebRTCConnection.this.updateConnectionState(ConnectionState.CONNECTED);
                    } else if (roomEvent instanceof RoomEvent.ParticipantDisconnected) {
                        RoomEvent.ParticipantDisconnected participantDisconnected = (RoomEvent.ParticipantDisconnected) roomEvent;
                        android.gov.nist.javax.sip.header.a.s("Participant disconnected: ", Participant.Sid.m2616toStringimpl(participantDisconnected.getParticipant().getSid()), "WebRTCConnection");
                        WebRTCConnection.this.handleParticipantDisconnected(participantDisconnected.getParticipant());
                    } else if (roomEvent instanceof RoomEvent.TrackSubscribed) {
                        RoomEvent.TrackSubscribed trackSubscribed = (RoomEvent.TrackSubscribed) roomEvent;
                        android.gov.nist.javax.sip.header.a.s("Audio track subscribed from ", Participant.Sid.m2616toStringimpl(trackSubscribed.getParticipant().getSid()), "WebRTCConnection");
                        WebRTCConnection.this.handleTrackSubscribed(trackSubscribed.getTrack(), trackSubscribed.getParticipant());
                    } else if (roomEvent instanceof RoomEvent.DataReceived) {
                        RoomEvent.DataReceived dataReceived = (RoomEvent.DataReceived) roomEvent;
                        WebRTCConnection.this.handleDataReceived(dataReceived.getData(), dataReceived.getParticipant());
                    } else {
                        f.b(Log.d("WebRTCConnection", "Unhandled event: ".concat(roomEvent.getClass().getSimpleName())));
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
