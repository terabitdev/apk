package io.elevenlabs;

import a2.h3;
import a2.t;
import android.content.Context;
import android.util.Log;
import b5.c;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import fr.d0;
import fr.g0;
import fr.r0;
import ho.l;
import ho.p;
import ho.q;
import ib.i;
import io.elevenlabs.audio.AudioManager;
import io.elevenlabs.audio.LiveKitAudioManager;
import io.elevenlabs.models.ConnectionStatusKt;
import io.elevenlabs.models.ConversationEvent;
import io.elevenlabs.models.ConversationStatus;
import io.elevenlabs.network.BaseConnection;
import io.elevenlabs.network.ConnectionState;
import io.elevenlabs.network.OutgoingEvent;
import io.elevenlabs.network.WebRTCConnection;
import io.livekit.android.room.Room;
import ir.b2;
import ir.j1;
import ir.r;
import ir.z1;
import java.util.Map;
import kotlin.Metadata;
import kr.o;
import livekit.LivekitInternal$NodeStats;
import mr.e;
import sn.m;
import sn.z;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b'\u0010\u0012J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00142\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b6\u0010\u0017J\u001f\u00109\u001a\u00020\u0010*\u0006\u0012\u0002\b\u0003072\u0006\u00108\u001a\u00020\u0014H\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010N\u001a\b\u0012\u0004\u0012\u00020J0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010S\u001a\b\u0012\u0004\u0012\u00020R0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010QR \u0010U\u001a\b\u0012\u0004\u0012\u00020\u00180M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010O\u001a\u0004\bU\u0010QR \u0010V\u001a\b\u0012\u0004\u0012\u00020+0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\bW\u0010Q¨\u0006X"}, d2 = {"Lio/elevenlabs/ConversationSessionImpl;", "Lio/elevenlabs/ConversationSession;", "Landroid/content/Context;", "context", "Lio/elevenlabs/ConversationConfig;", "config", "Lio/livekit/android/room/Room;", "room", "Lio/elevenlabs/network/BaseConnection;", "connection", "Lio/elevenlabs/audio/AudioManager;", "audioManager", "Lio/elevenlabs/ClientToolRegistry;", "toolRegistry", "<init>", "(Landroid/content/Context;Lio/elevenlabs/ConversationConfig;Lio/livekit/android/room/Room;Lio/elevenlabs/network/BaseConnection;Lio/elevenlabs/audio/AudioManager;Lio/elevenlabs/ClientToolRegistry;)V", "Lsn/z;", "start", "(Lwn/c;)Ljava/lang/Object;", "endSession", "", "message", "sendUserMessage", "(Ljava/lang/String;)V", "", "isPositive", "sendFeedback", "(Z)V", "update", "sendContextualUpdate", "sendUserActivity", "()V", "toolCallId", "result", "isError", "sendToolResult", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "toggleMute", "muted", "setMicMuted", "(ZLwn/c;)Ljava/lang/Object;", "", "volume", "setVolume", "(F)V", "getVolume", "()F", DiagnosticsEntry.NAME_KEY, "Lio/elevenlabs/ClientTool;", "tool", "registerTool", "(Ljava/lang/String;Lio/elevenlabs/ClientTool;)V", "unregisterTool", "Lsn/m;", "functionName", "logException", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroid/content/Context;", "Lio/elevenlabs/ConversationConfig;", "Lio/livekit/android/room/Room;", "Lio/elevenlabs/network/BaseConnection;", "Lio/elevenlabs/audio/AudioManager;", "Lio/elevenlabs/ClientToolRegistry;", "Lfr/d0;", "scope", "Lfr/d0;", "conversationId", "Ljava/lang/String;", "Lio/elevenlabs/ConversationEventHandler;", "eventHandler", "Lio/elevenlabs/ConversationEventHandler;", "Lir/j1;", "Lio/elevenlabs/models/ConversationStatus;", "_status", "Lir/j1;", "Lir/z1;", "status", "Lir/z1;", "getStatus", "()Lir/z1;", "Lio/elevenlabs/models/ConversationMode;", "mode", "getMode", "isMuted", "audioLevel", "getAudioLevel", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConversationSessionImpl implements ConversationSession {
    private final j1 _status;
    private final z1 audioLevel;
    private final AudioManager audioManager;
    private final ConversationConfig config;
    private final BaseConnection connection;
    private final Context context;
    private volatile String conversationId;
    private final ConversationEventHandler eventHandler;
    private final z1 isMuted;
    private final z1 mode;
    private final Room room;
    private final d0 scope;
    private final z1 status;
    private final ClientToolRegistry toolRegistry;

    public ConversationSessionImpl(Context context, ConversationConfig conversationConfig, Room room, BaseConnection baseConnection, AudioManager audioManager, ClientToolRegistry clientToolRegistry) {
        z1 c5;
        z1 c10;
        context.getClass();
        conversationConfig.getClass();
        baseConnection.getClass();
        audioManager.getClass();
        clientToolRegistry.getClass();
        this.context = context;
        this.config = conversationConfig;
        this.room = room;
        this.connection = baseConnection;
        this.audioManager = audioManager;
        this.toolRegistry = clientToolRegistry;
        e eVar = r0.f9888a;
        this.scope = g0.c(o.f20734a.plus(g0.f()));
        ConversationEventHandler conversationEventHandler = new ConversationEventHandler(audioManager, clientToolRegistry, new a(this, 7), new a(this, 9), new a(this, 10), new a(this, 1), new a(this, 2), new a(this, 3), new a(this, 4), new a(this, 5), new b(this, 0), new c(this, 1), new h3(this, 2), new a(this, 8), new ConversationSessionImpl$eventHandler$13(this, null), new b(this, 2));
        this.eventHandler = conversationEventHandler;
        b2 c11 = r.c(ConversationStatus.DISCONNECTED);
        this._status = c11;
        this.status = c11;
        this.mode = conversationEventHandler.getConversationMode();
        if (audioManager instanceof LiveKitAudioManager) {
            c5 = ((LiveKitAudioManager) audioManager).getMuteState();
        } else {
            c5 = r.c(Boolean.FALSE);
        }
        this.isMuted = c5;
        if (baseConnection instanceof WebRTCConnection) {
            c10 = ((WebRTCConnection) baseConnection).getAudioLevel();
        } else {
            c10 = r.c(Float.valueOf(u.P));
        }
        this.audioLevel = c10;
    }

    public static final z endSession$lambda$23(ConversationSessionImpl conversationSessionImpl, m mVar, String str) {
        str.getClass();
        Throwable a10 = m.a(mVar.f31603a);
        if (a10 != null) {
            conversationSessionImpl._status.setValue(ConversationStatus.ERROR);
            Log.w("ConversationSession", f.k("Error ending conversation session (", str, "): ", a10.getMessage()), a10);
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$0(ConversationSessionImpl conversationSessionImpl, OutgoingEvent outgoingEvent) {
        outgoingEvent.getClass();
        conversationSessionImpl.connection.sendMessage(outgoingEvent);
        return z.f31622a;
    }

    public static final z eventHandler$lambda$1(ConversationSessionImpl conversationSessionImpl, boolean z6) {
        try {
            l onCanSendFeedbackChange = conversationSessionImpl.config.getOnCanSendFeedbackChange();
            if (onCanSendFeedbackChange != null) {
                onCanSendFeedbackChange.invoke(Boolean.valueOf(z6));
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$10(ConversationSessionImpl conversationSessionImpl, String str, String str2, String str3) {
        i.s(str, str2, str3);
        try {
            q onConversationInitiationMetadata = conversationSessionImpl.config.getOnConversationInitiationMetadata();
            if (onConversationInitiationMetadata != null) {
                onConversationInitiationMetadata.invoke(str, str2, str3);
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$11(ConversationSessionImpl conversationSessionImpl, int i10) {
        try {
            l onInterruption = conversationSessionImpl.config.getOnInterruption();
            if (onInterruption != null) {
                onInterruption.invoke(Integer.valueOf(i10));
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$12(ConversationSessionImpl conversationSessionImpl, int i10, String str) {
        try {
            p onError = conversationSessionImpl.config.getOnError();
            if (onError != null) {
                onError.invoke(Integer.valueOf(i10), str);
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$2(ConversationSessionImpl conversationSessionImpl, ConversationEvent.ClientToolCall clientToolCall) {
        clientToolCall.getClass();
        try {
            l onUnhandledClientToolCall = conversationSessionImpl.config.getOnUnhandledClientToolCall();
            if (onUnhandledClientToolCall != null) {
                onUnhandledClientToolCall.invoke(clientToolCall);
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$3(ConversationSessionImpl conversationSessionImpl, float f10) {
        try {
            l onVadScore = conversationSessionImpl.config.getOnVadScore();
            if (onVadScore != null) {
                onVadScore.invoke(Float.valueOf(f10));
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$4(ConversationSessionImpl conversationSessionImpl, Map map) {
        map.getClass();
        try {
            l onAudioAlignment = conversationSessionImpl.config.getOnAudioAlignment();
            if (onAudioAlignment != null) {
                onAudioAlignment.invoke(map);
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$5(ConversationSessionImpl conversationSessionImpl, Map map) {
        map.getClass();
        try {
            l onAgentResponseMetadata = conversationSessionImpl.config.getOnAgentResponseMetadata();
            if (onAgentResponseMetadata != null) {
                onAgentResponseMetadata.invoke(map);
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$6(ConversationSessionImpl conversationSessionImpl, String str) {
        str.getClass();
        try {
            l onUserTranscript = conversationSessionImpl.config.getOnUserTranscript();
            if (onUserTranscript != null) {
                onUserTranscript.invoke(str);
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$7(ConversationSessionImpl conversationSessionImpl, String str) {
        str.getClass();
        try {
            l onAgentResponse = conversationSessionImpl.config.getOnAgentResponse();
            if (onAgentResponse != null) {
                onAgentResponse.invoke(str);
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$8(ConversationSessionImpl conversationSessionImpl, String str, String str2) {
        str.getClass();
        str2.getClass();
        try {
            p onAgentResponseCorrection = conversationSessionImpl.config.getOnAgentResponseCorrection();
            if (onAgentResponseCorrection != null) {
                onAgentResponseCorrection.invoke(str, str2);
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z eventHandler$lambda$9(ConversationSessionImpl conversationSessionImpl, String str, String str2, String str3, boolean z6) {
        i.s(str, str2, str3);
        try {
            ho.r onAgentToolResponse = conversationSessionImpl.config.getOnAgentToolResponse();
            if (onAgentToolResponse != null) {
                onAgentToolResponse.invoke(str, str2, str3, Boolean.valueOf(z6));
            }
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    private final void logException(Object obj, String str) {
        Throwable a10 = m.a(obj);
        if (a10 != null) {
            Log.w("ConversationSession", "Failed to run " + str, a10);
        }
    }

    public static final z start$lambda$13(ConversationSessionImpl conversationSessionImpl, String str) {
        str.getClass();
        g0.D(conversationSessionImpl.scope, null, null, new ConversationSessionImpl$start$2$1(str, conversationSessionImpl, null), 3);
        return z.f31622a;
    }

    public static final z start$lambda$14(ConversationSessionImpl conversationSessionImpl, ConnectionState connectionState) {
        connectionState.getClass();
        conversationSessionImpl._status.setValue(ConnectionStatusKt.toConversationStatus(connectionState));
        return z.f31622a;
    }

    public static final z start$lambda$16(ConversationSessionImpl conversationSessionImpl, l lVar, String str) {
        str.getClass();
        conversationSessionImpl.conversationId = str;
        if (lVar != null) {
            try {
                lVar.invoke(str);
            } catch (Throwable unused) {
            }
        }
        return z.f31622a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:10|(3:11|12|13)|14|(3:15|16|17)|18|19|20|21|22|(3:23|24|25)|26|27) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|(1:(1:(18:10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27)(2:41|42))(3:43|44|45))(5:59|60|61|(1:63)|51)|46|47|48|49|(16:52|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27)|51))|67|6|(0)(0)|46|47|48|49|(0)|51|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        r4 = new sn.l(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        r2 = r6;
        r3 = r2;
        r1 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.ConversationSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object endSession(wn.c<? super z> cVar) {
        ConversationSessionImpl$endSession$1 conversationSessionImpl$endSession$1;
        xn.a aVar;
        int i10;
        p bVar;
        ConversationSessionImpl conversationSessionImpl;
        p pVar;
        Object lVar;
        AudioManager audioManager;
        p pVar2;
        p pVar3;
        ConversationSessionImpl conversationSessionImpl2;
        Object lVar2;
        Object lVar3;
        Object lVar4;
        z zVar = z.f31622a;
        if (cVar instanceof ConversationSessionImpl$endSession$1) {
            conversationSessionImpl$endSession$1 = (ConversationSessionImpl$endSession$1) cVar;
            int i11 = conversationSessionImpl$endSession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                conversationSessionImpl$endSession$1.label = i11 - Integer.MIN_VALUE;
                Object obj = conversationSessionImpl$endSession$1.result;
                aVar = xn.a.f37986a;
                i10 = conversationSessionImpl$endSession$1.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            pVar2 = (p) conversationSessionImpl$endSession$1.L$2;
                            pVar3 = (p) conversationSessionImpl$endSession$1.L$1;
                            conversationSessionImpl2 = (ConversationSessionImpl) conversationSessionImpl$endSession$1.L$0;
                            try {
                                sn.a.g(obj);
                                lVar2 = zVar;
                            } catch (Throwable th) {
                                th = th;
                                lVar2 = new sn.l(th);
                                pVar2.invoke(new m(lVar2), "stopPlayback");
                                BaseConnection.disconnect$default(conversationSessionImpl2.connection, null, 1, null);
                                lVar3 = zVar;
                                pVar3.invoke(new m(lVar3), "disconnect");
                                conversationSessionImpl2.eventHandler.cleanup();
                                Object lVar5 = zVar;
                                pVar3.invoke(new m(lVar5), "eventHandler.cleanup");
                                conversationSessionImpl2.audioManager.cleanup();
                                lVar4 = zVar;
                                pVar3.invoke(new m(lVar4), "audioManager.cleanup");
                                conversationSessionImpl2._status.setValue(ConversationStatus.DISCONNECTED);
                                conversationSessionImpl2.conversationId = null;
                                g0.i(conversationSessionImpl2.scope, null);
                                return zVar;
                            }
                            pVar2.invoke(new m(lVar2), "stopPlayback");
                            try {
                                BaseConnection.disconnect$default(conversationSessionImpl2.connection, null, 1, null);
                                lVar3 = zVar;
                            } catch (Throwable th2) {
                                lVar3 = new sn.l(th2);
                            }
                            pVar3.invoke(new m(lVar3), "disconnect");
                            conversationSessionImpl2.eventHandler.cleanup();
                            Object lVar52 = zVar;
                            pVar3.invoke(new m(lVar52), "eventHandler.cleanup");
                            try {
                                conversationSessionImpl2.audioManager.cleanup();
                                lVar4 = zVar;
                            } catch (Throwable th3) {
                                lVar4 = new sn.l(th3);
                            }
                            pVar3.invoke(new m(lVar4), "audioManager.cleanup");
                            conversationSessionImpl2._status.setValue(ConversationStatus.DISCONNECTED);
                            conversationSessionImpl2.conversationId = null;
                            g0.i(conversationSessionImpl2.scope, null);
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (p) conversationSessionImpl$endSession$1.L$2;
                    pVar = (p) conversationSessionImpl$endSession$1.L$1;
                    conversationSessionImpl = (ConversationSessionImpl) conversationSessionImpl$endSession$1.L$0;
                    try {
                        sn.a.g(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        lVar = new sn.l(th);
                        bVar.invoke(new m(lVar), "stopRecording");
                        audioManager = conversationSessionImpl.audioManager;
                        conversationSessionImpl$endSession$1.L$0 = conversationSessionImpl;
                        conversationSessionImpl$endSession$1.L$1 = pVar;
                        conversationSessionImpl$endSession$1.L$2 = pVar;
                        conversationSessionImpl$endSession$1.label = 2;
                        if (audioManager.stopPlayback(conversationSessionImpl$endSession$1) != aVar) {
                        }
                        return aVar;
                    }
                } else {
                    sn.a.g(obj);
                    this._status.setValue(ConversationStatus.DISCONNECTING);
                    bVar = new b(this, 1);
                    AudioManager audioManager2 = this.audioManager;
                    try {
                        conversationSessionImpl$endSession$1.L$0 = this;
                        conversationSessionImpl$endSession$1.L$1 = bVar;
                        conversationSessionImpl$endSession$1.L$2 = bVar;
                        conversationSessionImpl$endSession$1.label = 1;
                        if (audioManager2.stopRecording(conversationSessionImpl$endSession$1) != aVar) {
                            conversationSessionImpl = this;
                            pVar = bVar;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        conversationSessionImpl = this;
                        pVar = bVar;
                        lVar = new sn.l(th);
                        bVar.invoke(new m(lVar), "stopRecording");
                        audioManager = conversationSessionImpl.audioManager;
                        conversationSessionImpl$endSession$1.L$0 = conversationSessionImpl;
                        conversationSessionImpl$endSession$1.L$1 = pVar;
                        conversationSessionImpl$endSession$1.L$2 = pVar;
                        conversationSessionImpl$endSession$1.label = 2;
                        if (audioManager.stopPlayback(conversationSessionImpl$endSession$1) != aVar) {
                        }
                        return aVar;
                    }
                    return aVar;
                }
                lVar = zVar;
                bVar.invoke(new m(lVar), "stopRecording");
                audioManager = conversationSessionImpl.audioManager;
                conversationSessionImpl$endSession$1.L$0 = conversationSessionImpl;
                conversationSessionImpl$endSession$1.L$1 = pVar;
                conversationSessionImpl$endSession$1.L$2 = pVar;
                conversationSessionImpl$endSession$1.label = 2;
                if (audioManager.stopPlayback(conversationSessionImpl$endSession$1) != aVar) {
                    pVar2 = pVar;
                    pVar3 = pVar2;
                    conversationSessionImpl2 = conversationSessionImpl;
                    lVar2 = zVar;
                    pVar2.invoke(new m(lVar2), "stopPlayback");
                    BaseConnection.disconnect$default(conversationSessionImpl2.connection, null, 1, null);
                    lVar3 = zVar;
                    pVar3.invoke(new m(lVar3), "disconnect");
                    conversationSessionImpl2.eventHandler.cleanup();
                    Object lVar522 = zVar;
                    pVar3.invoke(new m(lVar522), "eventHandler.cleanup");
                    conversationSessionImpl2.audioManager.cleanup();
                    lVar4 = zVar;
                    pVar3.invoke(new m(lVar4), "audioManager.cleanup");
                    conversationSessionImpl2._status.setValue(ConversationStatus.DISCONNECTED);
                    conversationSessionImpl2.conversationId = null;
                    g0.i(conversationSessionImpl2.scope, null);
                    return zVar;
                }
                return aVar;
            }
        }
        conversationSessionImpl$endSession$1 = new ConversationSessionImpl$endSession$1(this, cVar);
        Object obj2 = conversationSessionImpl$endSession$1.result;
        aVar = xn.a.f37986a;
        i10 = conversationSessionImpl$endSession$1.label;
        if (i10 == 0) {
        }
        lVar = zVar;
        bVar.invoke(new m(lVar), "stopRecording");
        audioManager = conversationSessionImpl.audioManager;
        conversationSessionImpl$endSession$1.L$0 = conversationSessionImpl;
        conversationSessionImpl$endSession$1.L$1 = pVar;
        conversationSessionImpl$endSession$1.L$2 = pVar;
        conversationSessionImpl$endSession$1.label = 2;
        if (audioManager.stopPlayback(conversationSessionImpl$endSession$1) != aVar) {
        }
        return aVar;
    }

    @Override // io.elevenlabs.ConversationSession
    public z1 getAudioLevel() {
        return this.audioLevel;
    }

    @Override // io.elevenlabs.ConversationSession
    /* renamed from: getId, reason: from getter */
    public String getConversationId() {
        return this.conversationId;
    }

    @Override // io.elevenlabs.ConversationSession
    public z1 getMode() {
        return this.mode;
    }

    @Override // io.elevenlabs.ConversationSession
    public z1 getStatus() {
        return this.status;
    }

    @Override // io.elevenlabs.ConversationSession
    public float getVolume() {
        return this.audioManager.getVolume();
    }

    @Override // io.elevenlabs.ConversationSession
    /* renamed from: isMuted, reason: from getter */
    public z1 getIsMuted() {
        return this.isMuted;
    }

    @Override // io.elevenlabs.ConversationSession
    public void registerTool(String r22, ClientTool tool) {
        r22.getClass();
        tool.getClass();
        this.toolRegistry.registerTool(r22, tool);
    }

    @Override // io.elevenlabs.ConversationSession
    public void sendContextualUpdate(String update) {
        update.getClass();
        this.eventHandler.sendContextualUpdate(update);
    }

    @Override // io.elevenlabs.ConversationSession
    public void sendFeedback(boolean isPositive) {
        this.eventHandler.sendFeedback(isPositive);
    }

    @Override // io.elevenlabs.ConversationSession
    public void sendToolResult(String toolCallId, String result, boolean isError) {
        toolCallId.getClass();
        result.getClass();
        this.eventHandler.sendToolResult(toolCallId, result, isError);
    }

    @Override // io.elevenlabs.ConversationSession
    public void sendUserActivity() {
        this.eventHandler.sendUserActivity();
    }

    @Override // io.elevenlabs.ConversationSession
    public void sendUserMessage(String message) {
        message.getClass();
        this.eventHandler.sendUserMessage(message);
    }

    @Override // io.elevenlabs.ConversationSession
    public Object setMicMuted(boolean z6, wn.c<? super z> cVar) {
        Object micMuted = this.audioManager.setMicMuted(z6, cVar);
        if (micMuted == xn.a.f37986a) {
            return micMuted;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.ConversationSession
    public void setVolume(float volume) {
        this.audioManager.setVolume(volume);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(17:17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33))(9:46|47|48|49|50|51|52|(15:55|20|21|22|23|24|25|26|27|28|29|30|31|32|33)|54))(3:62|63|64))(5:65|66|67|(2:69|54)|70))(2:71|72))(8:81|82|83|84|(1:86)(1:91)|87|(1:89)|54)|73|(2:75|(4:77|(2:79|54)|67|(0))(1:80))|70))|104|6|7|(0)(0)|73|(0)|70|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0070, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0071, code lost:
    
        r4 = r0;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:63:0x006c, B:66:0x0078, B:67:0x014d, B:72:0x0081, B:73:0x0130, B:75:0x0138, B:77:0x0140, B:80:0x015a), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    @Override // io.elevenlabs.ConversationSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(wn.c<? super z> cVar) {
        ConversationSessionImpl$start$1 conversationSessionImpl$start$1;
        int i10;
        Exception exc;
        ConversationSessionImpl conversationSessionImpl;
        ConversationSessionImpl conversationSessionImpl2;
        Object lVar;
        ConversationSessionImpl conversationSessionImpl3;
        AudioManager audioManager;
        ConversationSessionImpl conversationSessionImpl4;
        ConversationSessionImpl conversationSessionImpl5;
        ConversationSessionImpl conversationSessionImpl6;
        Object lVar2;
        Object lVar3;
        Object lVar4;
        String websocketUrl;
        ConversationSessionImpl conversationSessionImpl7;
        AudioManager audioManager2;
        ?? r22 = "Starting connection to ";
        if (cVar instanceof ConversationSessionImpl$start$1) {
            conversationSessionImpl$start$1 = (ConversationSessionImpl$start$1) cVar;
            int i11 = conversationSessionImpl$start$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                conversationSessionImpl$start$1.label = i11 - Integer.MIN_VALUE;
                Object obj = conversationSessionImpl$start$1.result;
                i10 = conversationSessionImpl$start$1.label;
                Object obj2 = z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    conversationSessionImpl4 = (ConversationSessionImpl) conversationSessionImpl$start$1.L$2;
                                    exc = (Exception) conversationSessionImpl$start$1.L$1;
                                    conversationSessionImpl5 = (ConversationSessionImpl) conversationSessionImpl$start$1.L$0;
                                    try {
                                        sn.a.g(obj);
                                        lVar2 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        lVar2 = new sn.l(th);
                                        conversationSessionImpl4.logException(lVar2, "stopPlayback");
                                        BaseConnection.disconnect$default(conversationSessionImpl5.connection, null, 1, null);
                                        lVar3 = obj2;
                                        conversationSessionImpl5.logException(lVar3, "disconnect");
                                        conversationSessionImpl5.eventHandler.cleanup();
                                        lVar4 = obj2;
                                        conversationSessionImpl5.logException(lVar4, "eventHandler.cleanup");
                                        conversationSessionImpl5.audioManager.cleanup();
                                        conversationSessionImpl5.logException(obj2, "audioManager.cleanup");
                                        ja.h3.e("Failed to start conversation session", exc);
                                        return null;
                                    }
                                    conversationSessionImpl4.logException(lVar2, "stopPlayback");
                                    try {
                                        BaseConnection.disconnect$default(conversationSessionImpl5.connection, null, 1, null);
                                        lVar3 = obj2;
                                    } catch (Throwable th2) {
                                        lVar3 = new sn.l(th2);
                                    }
                                    conversationSessionImpl5.logException(lVar3, "disconnect");
                                    try {
                                        conversationSessionImpl5.eventHandler.cleanup();
                                        lVar4 = obj2;
                                    } catch (Throwable th3) {
                                        lVar4 = new sn.l(th3);
                                    }
                                    conversationSessionImpl5.logException(lVar4, "eventHandler.cleanup");
                                    try {
                                        conversationSessionImpl5.audioManager.cleanup();
                                    } catch (Throwable th4) {
                                        obj2 = new sn.l(th4);
                                    }
                                    conversationSessionImpl5.logException(obj2, "audioManager.cleanup");
                                    ja.h3.e("Failed to start conversation session", exc);
                                    return null;
                                }
                                conversationSessionImpl = (ConversationSessionImpl) conversationSessionImpl$start$1.L$2;
                                exc = (Exception) conversationSessionImpl$start$1.L$1;
                                conversationSessionImpl2 = (ConversationSessionImpl) conversationSessionImpl$start$1.L$0;
                                try {
                                    try {
                                        sn.a.g(obj);
                                        conversationSessionImpl6 = conversationSessionImpl;
                                        lVar = obj2;
                                        conversationSessionImpl3 = conversationSessionImpl6;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        lVar = new sn.l(th);
                                        conversationSessionImpl3 = conversationSessionImpl;
                                        conversationSessionImpl3.logException(lVar, "stopRecording");
                                        audioManager = conversationSessionImpl2.audioManager;
                                        conversationSessionImpl$start$1.L$0 = conversationSessionImpl2;
                                        conversationSessionImpl$start$1.L$1 = exc;
                                        conversationSessionImpl$start$1.L$2 = conversationSessionImpl2;
                                        conversationSessionImpl$start$1.label = 5;
                                        if (audioManager.stopPlayback(conversationSessionImpl$start$1) != aVar) {
                                        }
                                        return aVar;
                                    }
                                    conversationSessionImpl$start$1.L$0 = conversationSessionImpl2;
                                    conversationSessionImpl$start$1.L$1 = exc;
                                    conversationSessionImpl$start$1.L$2 = conversationSessionImpl2;
                                    conversationSessionImpl$start$1.label = 5;
                                } catch (Throwable th6) {
                                    th = th6;
                                    conversationSessionImpl4 = conversationSessionImpl2;
                                    conversationSessionImpl5 = conversationSessionImpl4;
                                    lVar2 = new sn.l(th);
                                    conversationSessionImpl4.logException(lVar2, "stopPlayback");
                                    BaseConnection.disconnect$default(conversationSessionImpl5.connection, null, 1, null);
                                    lVar3 = obj2;
                                    conversationSessionImpl5.logException(lVar3, "disconnect");
                                    conversationSessionImpl5.eventHandler.cleanup();
                                    lVar4 = obj2;
                                    conversationSessionImpl5.logException(lVar4, "eventHandler.cleanup");
                                    conversationSessionImpl5.audioManager.cleanup();
                                    conversationSessionImpl5.logException(obj2, "audioManager.cleanup");
                                    ja.h3.e("Failed to start conversation session", exc);
                                    return null;
                                }
                                conversationSessionImpl3.logException(lVar, "stopRecording");
                                audioManager = conversationSessionImpl2.audioManager;
                                if (audioManager.stopPlayback(conversationSessionImpl$start$1) != aVar) {
                                    conversationSessionImpl4 = conversationSessionImpl2;
                                    conversationSessionImpl5 = conversationSessionImpl4;
                                    lVar2 = obj2;
                                    conversationSessionImpl4.logException(lVar2, "stopPlayback");
                                    BaseConnection.disconnect$default(conversationSessionImpl5.connection, null, 1, null);
                                    lVar3 = obj2;
                                    conversationSessionImpl5.logException(lVar3, "disconnect");
                                    conversationSessionImpl5.eventHandler.cleanup();
                                    lVar4 = obj2;
                                    conversationSessionImpl5.logException(lVar4, "eventHandler.cleanup");
                                    conversationSessionImpl5.audioManager.cleanup();
                                    conversationSessionImpl5.logException(obj2, "audioManager.cleanup");
                                    ja.h3.e("Failed to start conversation session", exc);
                                    return null;
                                }
                                return aVar;
                            }
                            sn.a.g(obj);
                            return obj2;
                        }
                        conversationSessionImpl7 = (ConversationSessionImpl) conversationSessionImpl$start$1.L$0;
                        sn.a.g(obj);
                        audioManager2 = conversationSessionImpl7.audioManager;
                        conversationSessionImpl$start$1.L$0 = conversationSessionImpl7;
                        conversationSessionImpl$start$1.label = 3;
                        if (audioManager2.startPlayback(conversationSessionImpl$start$1) == aVar) {
                            return aVar;
                        }
                        return obj2;
                    }
                    conversationSessionImpl7 = (ConversationSessionImpl) conversationSessionImpl$start$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    try {
                        this._status.setValue(ConversationStatus.CONNECTING);
                        this.connection.setOnMessageListener(new a(this, 0));
                        this.connection.setOnConnectionStateListener(new a(this, 6));
                        boolean textOnly = this.config.getTextOnly();
                        ConversationConfig conversationConfig = this.config;
                        if (textOnly) {
                            websocketUrl = conversationConfig.getApiEndpoint();
                        } else {
                            websocketUrl = conversationConfig.getWebsocketUrl();
                        }
                        Log.d("ConversationSession", "Starting connection to " + websocketUrl);
                        ConversationConfig copy$default = ConversationConfig.copy$default(this.config, null, null, null, null, false, 0, null, null, null, null, null, null, null, new t(this, this.config.getOnConnect(), 14), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147475455, null);
                        BaseConnection baseConnection = this.connection;
                        conversationSessionImpl$start$1.L$0 = this;
                        conversationSessionImpl$start$1.label = 1;
                        if (baseConnection.connect(websocketUrl, copy$default, conversationSessionImpl$start$1) != aVar) {
                            conversationSessionImpl7 = this;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        conversationSessionImpl = this;
                        conversationSessionImpl._status.setValue(ConversationStatus.ERROR);
                        AudioManager audioManager3 = conversationSessionImpl.audioManager;
                        try {
                            conversationSessionImpl$start$1.L$0 = conversationSessionImpl;
                            conversationSessionImpl$start$1.L$1 = exc;
                            conversationSessionImpl$start$1.L$2 = conversationSessionImpl;
                            conversationSessionImpl$start$1.label = 4;
                        } catch (Throwable th7) {
                            th = th7;
                            conversationSessionImpl2 = conversationSessionImpl;
                            lVar = new sn.l(th);
                            conversationSessionImpl3 = conversationSessionImpl;
                            conversationSessionImpl3.logException(lVar, "stopRecording");
                            audioManager = conversationSessionImpl2.audioManager;
                            conversationSessionImpl$start$1.L$0 = conversationSessionImpl2;
                            conversationSessionImpl$start$1.L$1 = exc;
                            conversationSessionImpl$start$1.L$2 = conversationSessionImpl2;
                            conversationSessionImpl$start$1.label = 5;
                            if (audioManager.stopPlayback(conversationSessionImpl$start$1) != aVar) {
                            }
                            return aVar;
                        }
                        if (audioManager3.stopRecording(conversationSessionImpl$start$1) != aVar) {
                            conversationSessionImpl2 = conversationSessionImpl;
                            conversationSessionImpl6 = conversationSessionImpl;
                            lVar = obj2;
                            conversationSessionImpl3 = conversationSessionImpl6;
                            conversationSessionImpl3.logException(lVar, "stopRecording");
                            audioManager = conversationSessionImpl2.audioManager;
                            conversationSessionImpl$start$1.L$0 = conversationSessionImpl2;
                            conversationSessionImpl$start$1.L$1 = exc;
                            conversationSessionImpl$start$1.L$2 = conversationSessionImpl2;
                            conversationSessionImpl$start$1.label = 5;
                            if (audioManager.stopPlayback(conversationSessionImpl$start$1) != aVar) {
                            }
                        }
                        return aVar;
                    }
                    return aVar;
                }
                if (!conversationSessionImpl7.config.getTextOnly()) {
                    if (conversationSessionImpl7.audioManager.hasAudioPermission()) {
                        AudioManager audioManager4 = conversationSessionImpl7.audioManager;
                        conversationSessionImpl$start$1.L$0 = conversationSessionImpl7;
                        conversationSessionImpl$start$1.label = 2;
                        if (audioManager4.startRecording(conversationSessionImpl$start$1) == aVar) {
                            return aVar;
                        }
                        audioManager2 = conversationSessionImpl7.audioManager;
                        conversationSessionImpl$start$1.L$0 = conversationSessionImpl7;
                        conversationSessionImpl$start$1.label = 3;
                        if (audioManager2.startPlayback(conversationSessionImpl$start$1) == aVar) {
                        }
                    } else {
                        yn.f.b(Log.d("ConversationSession", "Audio permission not granted - text-only mode"));
                    }
                }
                return obj2;
            }
        }
        conversationSessionImpl$start$1 = new ConversationSessionImpl$start$1(this, cVar);
        Object obj3 = conversationSessionImpl$start$1.result;
        i10 = conversationSessionImpl$start$1.label;
        Object obj22 = z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        if (!conversationSessionImpl7.config.getTextOnly()) {
        }
        return obj22;
    }

    @Override // io.elevenlabs.ConversationSession
    public Object toggleMute(wn.c<? super z> cVar) {
        Object micMuted = this.audioManager.setMicMuted(!this.audioManager.isMuted(), cVar);
        if (micMuted == xn.a.f37986a) {
            return micMuted;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.ConversationSession
    public void unregisterTool(String r22) {
        r22.getClass();
        this.toolRegistry.unregisterTool(r22);
    }

    public /* synthetic */ ConversationSessionImpl(Context context, ConversationConfig conversationConfig, Room room, BaseConnection baseConnection, AudioManager audioManager, ClientToolRegistry clientToolRegistry, int i10, kotlin.jvm.internal.f fVar) {
        this(context, conversationConfig, (i10 & 4) != 0 ? null : room, baseConnection, audioManager, clientToolRegistry);
    }
}
