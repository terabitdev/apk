package io.elevenlabs.domain.services.player;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AssistantConfig;
import io.elevenlabs.domain.services.player.AssistantSessionSource;
import ir.n1;
import ir.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.m;
import wn.c;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003234J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0007H&¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010!\u001a\u00020\u0010H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020\u0004H&¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010!\u001a\u00020\u0010H&¢\u0006\u0004\b'\u0010#R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/player/AssistantSessionService;", "", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionListener;", "listener", "Lsn/z;", "setListener", "(Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionListener;)V", "", "isSessionActive", "()Z", "Lio/elevenlabs/domain/services/player/AssistantSessionSource;", "source", "Lsn/m;", "startSession-gIAlu-s", "(Lio/elevenlabs/domain/services/player/AssistantSessionSource;Lwn/c;)Ljava/lang/Object;", "startSession", "", "readId", "", "position", "voiceId", "textOnly", "startSession-yxL6bBk", "(Ljava/lang/String;JLjava/lang/String;ZLwn/c;)Ljava/lang/Object;", "userRequested", "endSession", "(Z)V", "muted", "setMicMuted", "", "volume", "setVolume", "(F)V", ParameterNames.TEXT, "sendUserMessage-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "sendUserMessage", "sendUserActivity", "()V", "sendContextualUpdate-IoAF18A", "sendContextualUpdate", "Lir/z1;", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionState;", "getState", "()Lir/z1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lir/n1;", "getCloseEvents", "()Lir/n1;", "closeEvents", "SessionState", "SessionStatus", "SessionListener", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AssistantSessionService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: startSession-yxL6bBk */
        public static Object m955startSessionyxL6bBk(AssistantSessionService assistantSessionService, String str, long j4, String str2, boolean z6, c<? super m> cVar) {
            return AssistantSessionService.super.mo954startSessionyxL6bBk(str, j4, str2, z6, cVar);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionListener;", "", "", ParameterNames.TEXT, "Lsn/z;", "onUserTranscript", "(Ljava/lang/String;)V", "onAgentResponse", "mode", "onModeChange", "", "canSend", "onCanSendFeedbackChange", "(Z)V", "", FirebaseAnalytics.Param.SCORE, "onVadScore", "(F)V", "isFinal", "onAgentResponseStreaming", "(Ljava/lang/String;Z)V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface SessionListener {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static void onAgentResponseStreaming(SessionListener sessionListener, String str, boolean z6) {
                str.getClass();
                SessionListener.super.onAgentResponseStreaming(str, z6);
            }
        }

        void onAgentResponse(String r12);

        default void onAgentResponseStreaming(String r12, boolean isFinal) {
            r12.getClass();
        }

        void onCanSendFeedbackChange(boolean canSend);

        void onModeChange(String mode);

        void onUserTranscript(String r12);

        void onVadScore(float r12);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "CONNECTING", "CONNECTED", "DISCONNECTED", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class SessionStatus extends Enum<SessionStatus> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SessionStatus[] $VALUES;
        public static final SessionStatus IDLE = new SessionStatus("IDLE", 0);
        public static final SessionStatus CONNECTING = new SessionStatus("CONNECTING", 1);
        public static final SessionStatus CONNECTED = new SessionStatus("CONNECTED", 2);
        public static final SessionStatus DISCONNECTED = new SessionStatus("DISCONNECTED", 3);

        private static final /* synthetic */ SessionStatus[] $values() {
            return new SessionStatus[]{IDLE, CONNECTING, CONNECTED, DISCONNECTED};
        }

        static {
            SessionStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private SessionStatus(String str, int i10) {
            super(str, i10);
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static SessionStatus valueOf(String str) {
            return (SessionStatus) Enum.valueOf(SessionStatus.class, str);
        }

        public static SessionStatus[] values() {
            return (SessionStatus[]) $VALUES.clone();
        }
    }

    /* renamed from: startSession-yxL6bBk$default */
    static /* synthetic */ Object m949startSessionyxL6bBk$default(AssistantSessionService assistantSessionService, String str, long j4, String str2, boolean z6, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                z6 = false;
            }
            return assistantSessionService.mo954startSessionyxL6bBk(str, j4, str2, z6, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: startSession-yxL6bBk");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: startSession-yxL6bBk$suspendImpl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object m950startSessionyxL6bBk$suspendImpl(AssistantSessionService assistantSessionService, String str, long j4, String str2, boolean z6, c<? super m> cVar) {
        AssistantSessionService$startSession$1 assistantSessionService$startSession$1;
        int i10;
        if (cVar instanceof AssistantSessionService$startSession$1) {
            assistantSessionService$startSession$1 = (AssistantSessionService$startSession$1) cVar;
            int i11 = assistantSessionService$startSession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assistantSessionService$startSession$1.label = i11 - Integer.MIN_VALUE;
                Object obj = assistantSessionService$startSession$1.result;
                i10 = assistantSessionService$startSession$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return ((m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                AssistantSessionSource readContext = new AssistantSessionSource.ReadContext(str, j4, str2, z6);
                assistantSessionService$startSession$1.L$0 = null;
                assistantSessionService$startSession$1.L$1 = null;
                assistantSessionService$startSession$1.L$2 = null;
                assistantSessionService$startSession$1.J$0 = j4;
                assistantSessionService$startSession$1.Z$0 = z6;
                assistantSessionService$startSession$1.label = 1;
                Object mo953startSessiongIAlus = assistantSessionService.mo953startSessiongIAlus(readContext, assistantSessionService$startSession$1);
                Object obj2 = xn.a.f37986a;
                if (mo953startSessiongIAlus == obj2) {
                    return obj2;
                }
                return mo953startSessiongIAlus;
            }
        }
        assistantSessionService$startSession$1 = new AssistantSessionService$startSession$1(assistantSessionService, cVar);
        Object obj3 = assistantSessionService$startSession$1.result;
        i10 = assistantSessionService$startSession$1.label;
        if (i10 == 0) {
        }
    }

    void endSession(boolean userRequested);

    n1 getCloseEvents();

    z1 getState();

    boolean isSessionActive();

    /* renamed from: sendContextualUpdate-IoAF18A */
    Object mo951sendContextualUpdateIoAF18A(String r12);

    void sendUserActivity();

    /* renamed from: sendUserMessage-IoAF18A */
    Object mo952sendUserMessageIoAF18A(String r12);

    void setListener(SessionListener listener);

    void setMicMuted(boolean muted);

    void setVolume(float volume);

    /* renamed from: startSession-gIAlu-s */
    Object mo953startSessiongIAlus(AssistantSessionSource assistantSessionSource, c<? super m> cVar);

    /* renamed from: startSession-yxL6bBk */
    default Object mo954startSessionyxL6bBk(String str, long j4, String str2, boolean z6, c<? super m> cVar) {
        return m950startSessionyxL6bBk$suspendImpl(this, str, j4, str2, z6, cVar);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionState;", "", "status", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;", "conversationId", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "assistantConfig", "Lio/elevenlabs/domain/model/AssistantConfig;", "<init>", "(Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/AssistantConfig;)V", "getStatus", "()Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;", "getConversationId", "()Ljava/lang/String;", "getError", "getAssistantConfig", "()Lio/elevenlabs/domain/model/AssistantConfig;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SessionState {
        private final AssistantConfig assistantConfig;
        private final String conversationId;
        private final String error;
        private final SessionStatus status;

        public /* synthetic */ SessionState(SessionStatus sessionStatus, String str, String str2, AssistantConfig assistantConfig, int i10, f fVar) {
            this((i10 & 1) != 0 ? SessionStatus.IDLE : sessionStatus, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : assistantConfig);
        }

        public static /* synthetic */ SessionState copy$default(SessionState sessionState, SessionStatus sessionStatus, String str, String str2, AssistantConfig assistantConfig, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sessionStatus = sessionState.status;
            }
            if ((i10 & 2) != 0) {
                str = sessionState.conversationId;
            }
            if ((i10 & 4) != 0) {
                str2 = sessionState.error;
            }
            if ((i10 & 8) != 0) {
                assistantConfig = sessionState.assistantConfig;
            }
            return sessionState.copy(sessionStatus, str, str2, assistantConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final SessionStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component4, reason: from getter */
        public final AssistantConfig getAssistantConfig() {
            return this.assistantConfig;
        }

        public final SessionState copy(SessionStatus status, String conversationId, String r42, AssistantConfig assistantConfig) {
            status.getClass();
            return new SessionState(status, conversationId, r42, assistantConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionState)) {
                return false;
            }
            SessionState sessionState = (SessionState) other;
            if (this.status == sessionState.status && kotlin.jvm.internal.m.c(this.conversationId, sessionState.conversationId) && kotlin.jvm.internal.m.c(this.error, sessionState.error) && kotlin.jvm.internal.m.c(this.assistantConfig, sessionState.assistantConfig)) {
                return true;
            }
            return false;
        }

        public final AssistantConfig getAssistantConfig() {
            return this.assistantConfig;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getError() {
            return this.error;
        }

        public final SessionStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.status.hashCode() * 31;
            String str = this.conversationId;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode3 + hashCode) * 31;
            String str2 = this.error;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (i11 + hashCode2) * 31;
            AssistantConfig assistantConfig = this.assistantConfig;
            if (assistantConfig != null) {
                i10 = assistantConfig.hashCode();
            }
            return i12 + i10;
        }

        public String toString() {
            return "SessionState(status=" + this.status + ", conversationId=" + this.conversationId + ", error=" + this.error + ", assistantConfig=" + this.assistantConfig + Separators.RPAREN;
        }

        public SessionState(SessionStatus sessionStatus, String str, String str2, AssistantConfig assistantConfig) {
            sessionStatus.getClass();
            this.status = sessionStatus;
            this.conversationId = str;
            this.error = str2;
            this.assistantConfig = assistantConfig;
        }

        public SessionState() {
            this(null, null, null, null, 15, null);
        }
    }
}
