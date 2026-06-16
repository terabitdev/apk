package io.elevenlabs.network;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import fr.r0;
import ho.l;
import ho.p;
import hr.n;
import io.elevenlabs.ConversationConfig;
import io.elevenlabs.models.ConnectionStatusKt;
import io.elevenlabs.models.ConversationMode;
import io.elevenlabs.models.DisconnectionDetails;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.participant.RemoteParticipant;
import io.livekit.android.room.track.RemoteAudioTrack;
import io.livekit.android.room.track.Track;
import ir.b2;
import ir.j1;
import ir.r;
import ir.z1;
import ja.h3;
import java.util.concurrent.CancellationException;
import kd.a;
import kotlin.Metadata;
import kr.o;
import livekit.LivekitInternal$NodeStats;
import mr.e;
import sn.z;
import t2.u;
import wn.c;
import wq.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J \u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b*\u0010#J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020\n2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n0/H\u0016¢\u0006\u0004\b1\u00102J#\u00103\u001a\u00020\n2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0/H\u0016¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020\n¢\u0006\u0004\b4\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001c0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020C0E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR$\u0010J\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020$0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\u0014\u0010W\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lio/elevenlabs/network/WebRTCConnection;", "Lio/elevenlabs/network/BaseConnection;", "Landroid/content/Context;", "context", "Lio/livekit/android/room/Room;", "room", "Lfr/d0;", "scope", "<init>", "(Landroid/content/Context;Lio/livekit/android/room/Room;Lfr/d0;)V", "Lsn/z;", "setupRoomEventHandlers", "()V", "startMessageProcessing", "Lio/livekit/android/room/participant/RemoteParticipant;", "participant", "handleParticipantDisconnected", "(Lio/livekit/android/room/participant/RemoteParticipant;)V", "Lio/livekit/android/room/track/Track;", "track", "Lio/livekit/android/room/participant/Participant;", "handleTrackSubscribed", "(Lio/livekit/android/room/track/Track;Lio/livekit/android/room/participant/Participant;)V", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleDataReceived", "([BLio/livekit/android/room/participant/Participant;)V", "startAudioLevelMonitoring", "Lio/elevenlabs/network/ConnectionState;", "newState", "updateConnectionState", "(Lio/elevenlabs/network/ConnectionState;)V", "Lio/elevenlabs/models/DisconnectionDetails;", "details", "invokeOnDisconnect", "(Lio/elevenlabs/models/DisconnectionDetails;)V", "", "serverUrl", "Lio/elevenlabs/ConversationConfig;", "config", "connect", "(Ljava/lang/String;Lio/elevenlabs/ConversationConfig;Lwn/c;)Ljava/lang/Object;", "disconnect", "", "message", "sendMessage", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "listener", "setOnMessageListener", "(Lho/l;)V", "setOnConnectionStateListener", "cleanup", "Landroid/content/Context;", "Lio/livekit/android/room/Room;", "Lfr/d0;", "Lio/livekit/android/room/participant/LocalParticipant;", "localParticipant", "Lio/livekit/android/room/participant/LocalParticipant;", "latestConfig", "Lio/elevenlabs/ConversationConfig;", "", "disconnectCallbackInvoked", "Z", "Lir/j1;", "_connectionState", "Lir/j1;", "", "_audioLevel", "Lir/z1;", "audioLevel", "Lir/z1;", "getAudioLevel", "()Lir/z1;", "messageListener", "Lho/l;", "connectionStateListener", "Lhr/n;", "messageChannel", "Lhr/n;", "Lfr/k1;", "messageJob", "Lfr/k1;", "audioLevelJob", "eventHandlerJob", "getConnectionState", "()Lio/elevenlabs/network/ConnectionState;", "connectionState", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class WebRTCConnection extends BaseConnection {
    private final j1 _audioLevel;
    private j1 _connectionState;
    private final z1 audioLevel;
    private k1 audioLevelJob;
    private l connectionStateListener;
    private final Context context;
    private volatile boolean disconnectCallbackInvoked;
    private k1 eventHandlerJob;
    private ConversationConfig latestConfig;
    private LocalParticipant localParticipant;
    private final n messageChannel;
    private k1 messageJob;
    private l messageListener;
    private final Room room;
    private final d0 scope;

    public WebRTCConnection(Context context, Room room, d0 d0Var) {
        context.getClass();
        room.getClass();
        d0Var.getClass();
        this.context = context;
        this.room = room;
        this.scope = d0Var;
        this._connectionState = r.c(ConnectionState.IDLE);
        b2 c5 = r.c(Float.valueOf(u.P));
        this._audioLevel = c5;
        this.audioLevel = c5;
        this.messageChannel = a.b(f.API_PRIORITY_OTHER, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDataReceived(byte[] data, Participant participant) {
        ConversationMode conversationMode;
        l onModeChange;
        p onMessage;
        try {
            String str = new String(data, b.f37231a);
            this.messageChannel.d(str);
            try {
                String str2 = "ai";
                if (!(participant instanceof RemoteParticipant) && (participant instanceof LocalParticipant)) {
                    str2 = "user";
                }
                ConversationConfig conversationConfig = this.latestConfig;
                if (conversationConfig != null && (onMessage = conversationConfig.getOnMessage()) != null) {
                    onMessage.invoke(str2, str);
                }
                if (participant != null && participant.isSpeaking()) {
                    conversationMode = ConversationMode.SPEAKING;
                } else {
                    conversationMode = ConversationMode.LISTENING;
                }
                ConversationConfig conversationConfig2 = this.latestConfig;
                if (conversationConfig2 != null && (onModeChange = conversationConfig2.getOnModeChange()) != null) {
                    onModeChange.invoke(conversationMode);
                }
            } catch (Throwable th) {
                Log.d("WebRTCConnection", "onMessage callback threw: " + th.getMessage());
            }
        } catch (Exception e10) {
            android.gov.nist.javax.sip.header.a.s("Failed to process received data: ", e10.getMessage(), "WebRTCConnection");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleParticipantDisconnected(RemoteParticipant participant) {
        String m2596getIdentity4WamZwg = participant.m2596getIdentity4WamZwg();
        if (m2596getIdentity4WamZwg == null) {
            m2596getIdentity4WamZwg = null;
        }
        if (m2596getIdentity4WamZwg != null && wq.u.W(m2596getIdentity4WamZwg, "agent", false)) {
            disconnect(DisconnectionDetails.Agent.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTrackSubscribed(Track track, Participant participant) {
        if (track instanceof RemoteAudioTrack) {
            android.gov.nist.javax.sip.header.a.s("Audio track subscribed from ", Participant.Sid.m2616toStringimpl(participant.getSid()), "WebRTCConnection");
        } else {
            Log.d("WebRTCConnection", "Other track type subscribed: ".concat(track.getClass().getSimpleName()));
        }
    }

    private final void invokeOnDisconnect(DisconnectionDetails details) {
        l onDisconnect;
        if (!this.disconnectCallbackInvoked) {
            this.disconnectCallbackInvoked = true;
            try {
                ConversationConfig conversationConfig = this.latestConfig;
                if (conversationConfig != null && (onDisconnect = conversationConfig.getOnDisconnect()) != null) {
                    onDisconnect.invoke(details);
                }
            } catch (Throwable th) {
                android.gov.nist.javax.sip.header.a.s("onDisconnect callback threw: ", th.getMessage(), "WebRTCConnection");
            }
        }
    }

    private final void setupRoomEventHandlers() {
        k1 k1Var = this.eventHandlerJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.eventHandlerJob = g0.D(this.scope, null, null, new WebRTCConnection$setupRoomEventHandlers$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAudioLevelMonitoring() {
        k1 k1Var = this.audioLevelJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.audioLevelJob = g0.D(this.scope, null, null, new WebRTCConnection$startAudioLevelMonitoring$1(this, null), 3);
    }

    private final void startMessageProcessing() {
        this.messageJob = g0.D(this.scope, null, null, new WebRTCConnection$startMessageProcessing$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConnectionState(ConnectionState newState) {
        l onStatusChange;
        if (this._connectionState.getValue() != newState) {
            this._connectionState.setValue(newState);
            l lVar = this.connectionStateListener;
            if (lVar != null) {
                lVar.invoke(newState);
            }
            try {
                ConversationConfig conversationConfig = this.latestConfig;
                if (conversationConfig != null && (onStatusChange = conversationConfig.getOnStatusChange()) != null) {
                    onStatusChange.invoke(ConnectionStatusKt.toConversationStatus(newState));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void cleanup() {
        BaseConnection.disconnect$default(this, null, 1, null);
        g0.i(this.scope, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // io.elevenlabs.network.BaseConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object connect(String str, ConversationConfig conversationConfig, c<? super z> cVar) {
        WebRTCConnection$connect$1 webRTCConnection$connect$1;
        int i10;
        String str2;
        Exception exc;
        WebRTCConnection webRTCConnection;
        if (cVar instanceof WebRTCConnection$connect$1) {
            webRTCConnection$connect$1 = (WebRTCConnection$connect$1) cVar;
            int i11 = webRTCConnection$connect$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                webRTCConnection$connect$1.label = i11 - Integer.MIN_VALUE;
                WebRTCConnection$connect$1 webRTCConnection$connect$12 = webRTCConnection$connect$1;
                Object obj = webRTCConnection$connect$12.result;
                i10 = webRTCConnection$connect$12.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        webRTCConnection = (WebRTCConnection) webRTCConnection$connect$12.L$0;
                        try {
                            sn.a.g(obj);
                        } catch (Exception e10) {
                            exc = e10;
                            webRTCConnection.invokeOnDisconnect(new DisconnectionDetails.Error(exc));
                            webRTCConnection.updateConnectionState(ConnectionState.ERROR);
                            h3.e("Failed to connect to LiveKit room", exc);
                            return null;
                        }
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    if (getConnectionState() != ConnectionState.IDLE && getConnectionState() != ConnectionState.DISCONNECTED) {
                        c6.x("Already connected or connecting");
                        return null;
                    }
                    String conversationToken = conversationConfig.getConversationToken();
                    if (conversationToken != null && !wq.n.m0(conversationToken)) {
                        str2 = conversationToken;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        try {
                            updateConnectionState(ConnectionState.CONNECTING);
                            this.latestConfig = conversationConfig;
                            this.localParticipant = this.room.getLocalParticipant();
                            setupRoomEventHandlers();
                            Log.d("WebRTCConnection", "Connecting to LiveKit url: " + str);
                            Room room = this.room;
                            webRTCConnection$connect$12.L$0 = this;
                            webRTCConnection$connect$12.label = 1;
                            Object connect$default = Room.connect$default(room, str, str2, null, webRTCConnection$connect$12, 4, null);
                            xn.a aVar = xn.a.f37986a;
                            if (connect$default == aVar) {
                                return aVar;
                            }
                            webRTCConnection = this;
                        } catch (Exception e11) {
                            exc = e11;
                            webRTCConnection = this;
                            webRTCConnection.invokeOnDisconnect(new DisconnectionDetails.Error(exc));
                            webRTCConnection.updateConnectionState(ConnectionState.ERROR);
                            h3.e("Failed to connect to LiveKit room", exc);
                            return null;
                        }
                    } else {
                        c6.t("WebRTC connection requires a non-blank conversationToken");
                        return null;
                    }
                }
                webRTCConnection.startMessageProcessing();
                return z.f31622a;
            }
        }
        webRTCConnection$connect$1 = new WebRTCConnection$connect$1(this, cVar);
        WebRTCConnection$connect$1 webRTCConnection$connect$122 = webRTCConnection$connect$1;
        Object obj2 = webRTCConnection$connect$122.result;
        i10 = webRTCConnection$connect$122.label;
        if (i10 == 0) {
        }
        webRTCConnection.startMessageProcessing();
        return z.f31622a;
    }

    @Override // io.elevenlabs.network.BaseConnection
    public void disconnect(DisconnectionDetails details) {
        Throwable th;
        if (details == null) {
            details = DisconnectionDetails.User.INSTANCE;
        }
        try {
            try {
                k1 k1Var = this.messageJob;
                if (k1Var != null) {
                    k1Var.cancel((CancellationException) null);
                }
                this.messageJob = null;
                k1 k1Var2 = this.audioLevelJob;
                if (k1Var2 != null) {
                    k1Var2.cancel((CancellationException) null);
                }
                this.audioLevelJob = null;
                k1 k1Var3 = this.eventHandlerJob;
                if (k1Var3 != null) {
                    k1Var3.cancel((CancellationException) null);
                }
                this.eventHandlerJob = null;
                this.room.disconnect();
                this.localParticipant = null;
                this._audioLevel.setValue(Float.valueOf(u.P));
                this.disconnectCallbackInvoked = false;
                updateConnectionState(ConnectionState.IDLE);
                Log.d("WebRTCConnection", "Disconnected and reset to IDLE state");
                invokeOnDisconnect(details);
            } catch (Throwable th2) {
                th = th2;
                invokeOnDisconnect(details);
                throw th;
            }
        } catch (Exception e10) {
            Log.d("WebRTCConnection", "Error during disconnect: " + e10.getMessage());
            DisconnectionDetails.Error error = new DisconnectionDetails.Error(e10);
            try {
                updateConnectionState(ConnectionState.ERROR);
                invokeOnDisconnect(error);
            } catch (Throwable th3) {
                th = th3;
                details = error;
                invokeOnDisconnect(details);
                throw th;
            }
        }
    }

    public final z1 getAudioLevel() {
        return this.audioLevel;
    }

    @Override // io.elevenlabs.network.BaseConnection
    public ConnectionState getConnectionState() {
        return (ConnectionState) this._connectionState.getValue();
    }

    @Override // io.elevenlabs.network.BaseConnection
    public void sendMessage(Object message) {
        String serializeOutgoingEvent;
        message.getClass();
        if (getConnectionState().isActive()) {
            if (message instanceof String) {
                serializeOutgoingEvent = (String) message;
            } else {
                serializeOutgoingEvent = ConversationEventParser.INSTANCE.serializeOutgoingEvent((OutgoingEvent) message);
            }
            byte[] bytes = serializeOutgoingEvent.getBytes(b.f37231a);
            bytes.getClass();
            g0.D(this.scope, null, null, new WebRTCConnection$sendMessage$1(this, bytes, null), 3);
            return;
        }
        c6.x("Not connected");
    }

    @Override // io.elevenlabs.network.BaseConnection
    public void setOnConnectionStateListener(l listener) {
        listener.getClass();
        this.connectionStateListener = listener;
    }

    @Override // io.elevenlabs.network.BaseConnection
    public void setOnMessageListener(l listener) {
        listener.getClass();
        this.messageListener = listener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebRTCConnection(Context context, Room room, d0 d0Var, int i10, kotlin.jvm.internal.f fVar) {
        this(context, room, d0Var);
        if ((i10 & 4) != 0) {
            e eVar = r0.f9888a;
            d0Var = g0.c(o.f20734a.plus(g0.f()));
        }
    }
}
