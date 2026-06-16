package io.elevenlabs.player;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ib.i;
import io.elevenlabs.AgentOverrides;
import io.elevenlabs.ConversationClient;
import io.elevenlabs.ConversationConfig;
import io.elevenlabs.ConversationSession;
import io.elevenlabs.Language;
import io.elevenlabs.Overrides;
import io.elevenlabs.TtsOverrides;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AssistantConfig;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AssistantService;
import io.elevenlabs.domain.services.VibrationService;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.domain.services.player.AssistantSessionSource;
import io.elevenlabs.models.ConversationEvent;
import io.elevenlabs.models.ConversationMode;
import io.elevenlabs.models.ConversationStatus;
import io.elevenlabs.player.tools.SupportClientToolsFactory;
import ir.b2;
import ir.i1;
import ir.j1;
import ir.k1;
import ir.l1;
import ir.n1;
import ir.q1;
import ir.r;
import ir.z1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONObject;
import sn.l;
import sn.m;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b1\u0010-J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0019\u001a\u000203H\u0082@¢\u0006\u0004\b4\u00105J&\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b:\u0010;J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0019\u001a\u00020=H\u0082@¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020*H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020*2\u0006\u0010D\u001a\u00020*H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00122\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u00122\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u0015H\u0002¢\u0006\u0004\bP\u0010 J\u0017\u0010R\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020&H\u0002¢\u0006\u0004\bR\u0010)J\u0017\u0010T\u001a\u00020\u00122\u0006\u0010S\u001a\u00020*H\u0002¢\u0006\u0004\bT\u0010CJ\u001f\u0010W\u001a\u00020\u00122\u0006\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020*H\u0002¢\u0006\u0004\bW\u0010FJ/\u0010\\\u001a\u00020\u00122\u0006\u0010X\u001a\u00020*2\u0006\u0010Y\u001a\u00020*2\u0006\u0010Z\u001a\u00020*2\u0006\u0010[\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\\\u0010]J'\u0010`\u001a\u00020\u00122\u0006\u0010A\u001a\u00020*2\u0006\u0010^\u001a\u00020*2\u0006\u0010_\u001a\u00020*H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020\u00122\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\u00122\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\u00020\u00122\u0006\u0010j\u001a\u00020*H\u0002¢\u0006\u0004\bk\u0010CJ\u0017\u0010n\u001a\u00020\u00122\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00122\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bp\u0010oJ\u001e\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010r\u001a\u00020qH\u0082@¢\u0006\u0004\bs\u0010tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010vR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010wR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010xR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010yR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010zR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010{R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020}0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR&\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020}0\u0080\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0088\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u008f\u0001R*\u0010\u0093\u0001\u001a\u0015\u0012\u0004\u0012\u00020b\u0012\n\u0012\b0\u0091\u0001j\u0003`\u0092\u00010\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0095\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0098\u0001"}, d2 = {"Lio/elevenlabs/player/AssistantSessionManager;", "Lio/elevenlabs/domain/services/player/AssistantSessionService;", "Lio/elevenlabs/domain/services/AssistantService;", "assistantService", "Lio/elevenlabs/domain/services/VibrationService;", "vibrationService", "Lio/elevenlabs/domain/Logger;", "logger", "Landroid/content/Context;", "context", "Lfr/d0;", "scope", "Lio/elevenlabs/player/tools/SupportClientToolsFactory;", "supportClientToolsFactory", "<init>", "(Lio/elevenlabs/domain/services/AssistantService;Lio/elevenlabs/domain/services/VibrationService;Lio/elevenlabs/domain/Logger;Landroid/content/Context;Lfr/d0;Lio/elevenlabs/player/tools/SupportClientToolsFactory;)V", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionListener;", "listener", "Lsn/z;", "setListener", "(Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionListener;)V", "", "isSessionActive", "()Z", "Lio/elevenlabs/domain/services/player/AssistantSessionSource;", "source", "Lsn/m;", "startSession-gIAlu-s", "(Lio/elevenlabs/domain/services/player/AssistantSessionSource;Lwn/c;)Ljava/lang/Object;", "startSession", "userRequested", "endSession", "(Z)V", "Lio/elevenlabs/ConversationSession;", "getSession", "()Lio/elevenlabs/ConversationSession;", "muted", "setMicMuted", "", "volume", "setVolume", "(F)V", "", ParameterNames.TEXT, "sendUserMessage-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "sendUserMessage", "sendUserActivity", "()V", "sendContextualUpdate-IoAF18A", "sendContextualUpdate", "Lio/elevenlabs/domain/services/player/AssistantSessionSource$ReadContext;", "startReadContextSession-gIAlu-s", "(Lio/elevenlabs/domain/services/player/AssistantSessionSource$ReadContext;Lwn/c;)Ljava/lang/Object;", "startReadContextSession", "Lio/elevenlabs/domain/model/AssistantConfig;", "assistantConfig", "textOnly", "connectReadContextSession-0E7RQCE", "(Lio/elevenlabs/domain/model/AssistantConfig;ZLwn/c;)Ljava/lang/Object;", "connectReadContextSession", "Lio/elevenlabs/domain/services/player/AssistantSessionSource$SupportAgent;", "connectSupportAgentSession-gIAlu-s", "(Lio/elevenlabs/domain/services/player/AssistantSessionSource$SupportAgent;Lwn/c;)Ljava/lang/Object;", "connectSupportAgentSession", "conversationId", "onSdkConnect", "(Ljava/lang/String;)V", "messageJson", "onSdkMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/elevenlabs/models/ConversationMode;", "mode", "onSdkModeChange", "(Lio/elevenlabs/models/ConversationMode;)V", "Lio/elevenlabs/models/ConversationStatus;", "status", "onSdkStatusChange", "(Lio/elevenlabs/models/ConversationStatus;)V", "canSend", "onSdkCanSendFeedbackChange", FirebaseAnalytics.Param.SCORE, "onSdkVadScore", "userTranscript", "onSdkUserTranscript", "originalResponse", "correctedResponse", "onSdkAgentResponseCorrection", "toolName", "toolCallId", "toolType", "isError", "onSdkAgentToolResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "agentOutputFormat", "userInputFormat", "onSdkConversationInitiationMetadata", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "eventId", "onSdkInterruption", "(I)V", "Lio/elevenlabs/models/ConversationEvent$ClientToolCall;", "clientToolCall", "onSdkUnhandledClientToolCall", "(Lio/elevenlabs/models/ConversationEvent$ClientToolCall;)V", "json", "routeIncomingAgentMessage", "Lorg/json/JSONObject;", "obj", "handleAgentChatResponsePart", "(Lorg/json/JSONObject;)V", "handleAgentResponseEvent", "Lio/elevenlabs/ConversationConfig;", "config", "startConversationClient-gIAlu-s", "(Lio/elevenlabs/ConversationConfig;Lwn/c;)Ljava/lang/Object;", "startConversationClient", "Lio/elevenlabs/domain/services/AssistantService;", "Lio/elevenlabs/domain/services/VibrationService;", "Lio/elevenlabs/domain/Logger;", "Landroid/content/Context;", "Lfr/d0;", "Lio/elevenlabs/player/tools/SupportClientToolsFactory;", "Lir/j1;", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionState;", "_state", "Lir/j1;", "Lir/z1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lir/z1;", "getState", "()Lir/z1;", "Lir/i1;", "_closeEvents", "Lir/i1;", "Lir/n1;", "closeEvents", "Lir/n1;", "getCloseEvents", "()Lir/n1;", ParameterNames.SESSION, "Lio/elevenlabs/ConversationSession;", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionListener;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "agentDeltaAccumulator", "Ljava/util/concurrent/ConcurrentHashMap;", "lastCompletedAgentEventId", "Ljava/lang/Integer;", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AssistantSessionManager implements AssistantSessionService {
    private static final String TAG = "AssistantSessionManager";
    private final i1 _closeEvents;
    private final j1 _state;
    private final ConcurrentHashMap<Integer, StringBuilder> agentDeltaAccumulator;
    private final AssistantService assistantService;
    private final n1 closeEvents;
    private final Context context;
    private volatile Integer lastCompletedAgentEventId;
    private AssistantSessionService.SessionListener listener;
    private final Logger logger;
    private final d0 scope;
    private ConversationSession session;
    private final z1 state;
    private final SupportClientToolsFactory supportClientToolsFactory;
    private final VibrationService vibrationService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationStatus.values().length];
            try {
                iArr[ConversationStatus.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversationStatus.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConversationStatus.DISCONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConversationStatus.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConversationStatus.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AssistantSessionManager(AssistantService assistantService, VibrationService vibrationService, Logger logger, Context context, @ApplicationCoroutineScope d0 d0Var, SupportClientToolsFactory supportClientToolsFactory) {
        assistantService.getClass();
        vibrationService.getClass();
        logger.getClass();
        context.getClass();
        d0Var.getClass();
        supportClientToolsFactory.getClass();
        this.assistantService = assistantService;
        this.vibrationService = vibrationService;
        this.logger = logger;
        this.context = context;
        this.scope = d0Var;
        this.supportClientToolsFactory = supportClientToolsFactory;
        b2 c5 = r.c(new AssistantSessionService.SessionState(null, null, null, null, 15, null));
        this._state = c5;
        this.state = new l1(c5);
        q1 b10 = r.b(0, 1, null, 5);
        this._closeEvents = b10;
        this.closeEvents = new k1(b10);
        this.agentDeltaAccumulator = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: connectReadContextSession-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m994connectReadContextSession0E7RQCE(AssistantConfig assistantConfig, boolean z6, wn.c<? super m> cVar) {
        AssistantSessionManager$connectReadContextSession$1 assistantSessionManager$connectReadContextSession$1;
        int i10;
        if (cVar instanceof AssistantSessionManager$connectReadContextSession$1) {
            assistantSessionManager$connectReadContextSession$1 = (AssistantSessionManager$connectReadContextSession$1) cVar;
            int i11 = assistantSessionManager$connectReadContextSession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assistantSessionManager$connectReadContextSession$1.label = i11 - Integer.MIN_VALUE;
                Object obj = assistantSessionManager$connectReadContextSession$1.result;
                i10 = assistantSessionManager$connectReadContextSession$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return ((m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                this.logger.log(TAG, "Connecting session with config: " + assistantConfig);
                ConversationConfig conversationConfig = new ConversationConfig(null, assistantConfig.getConversationToken(), null, assistantConfig.getUserId(), z6, 0, assistantConfig.getApiEndpoint(), assistantConfig.getWebsocketUrl(), null, new Overrides(new AgentOverrides(null, assistantConfig.getFirstMessage(), Language.INSTANCE.fromCode(assistantConfig.getLanguage()), 1, null), new TtsOverrides(assistantConfig.getVoiceId()), null, null, 12, null), null, assistantConfig.getDynamicVariables(), null, new AssistantSessionManager$connectReadContextSession$config$1(this), new AssistantSessionManager$connectReadContextSession$config$2(this), new AssistantSessionManager$connectReadContextSession$config$3(this), new AssistantSessionManager$connectReadContextSession$config$4(this), new AssistantSessionManager$connectReadContextSession$config$5(this), new AssistantSessionManager$connectReadContextSession$config$12(this), new AssistantSessionManager$connectReadContextSession$config$6(this), null, null, null, new AssistantSessionManager$connectReadContextSession$config$7(this), null, new AssistantSessionManager$connectReadContextSession$config$8(this), new AssistantSessionManager$connectReadContextSession$config$9(this), new AssistantSessionManager$connectReadContextSession$config$10(this), new AssistantSessionManager$connectReadContextSession$config$11(this), null, null, 1617958181, null);
                assistantSessionManager$connectReadContextSession$1.L$0 = null;
                assistantSessionManager$connectReadContextSession$1.L$1 = null;
                assistantSessionManager$connectReadContextSession$1.Z$0 = z6;
                assistantSessionManager$connectReadContextSession$1.label = 1;
                Object m996startConversationClientgIAlus = m996startConversationClientgIAlus(conversationConfig, assistantSessionManager$connectReadContextSession$1);
                Object obj2 = xn.a.f37986a;
                if (m996startConversationClientgIAlus == obj2) {
                    return obj2;
                }
                return m996startConversationClientgIAlus;
            }
        }
        assistantSessionManager$connectReadContextSession$1 = new AssistantSessionManager$connectReadContextSession$1(this, cVar);
        Object obj3 = assistantSessionManager$connectReadContextSession$1.result;
        i10 = assistantSessionManager$connectReadContextSession$1.label;
        if (i10 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: connectSupportAgentSession-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m995connectSupportAgentSessiongIAlus(AssistantSessionSource.SupportAgent supportAgent, wn.c<? super m> cVar) {
        AssistantSessionManager$connectSupportAgentSession$1 assistantSessionManager$connectSupportAgentSession$1;
        int i10;
        String str;
        String str2;
        Map<String, Object> map;
        if (cVar instanceof AssistantSessionManager$connectSupportAgentSession$1) {
            assistantSessionManager$connectSupportAgentSession$1 = (AssistantSessionManager$connectSupportAgentSession$1) cVar;
            int i11 = assistantSessionManager$connectSupportAgentSession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assistantSessionManager$connectSupportAgentSession$1.label = i11 - Integer.MIN_VALUE;
                Object obj = assistantSessionManager$connectSupportAgentSession$1.result;
                i10 = assistantSessionManager$connectSupportAgentSession$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return ((m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                this.logger.log(TAG, "Connecting support-agent session, dynamicVariableKeys=" + supportAgent.getDynamicVariables().keySet());
                String signedUrl = supportAgent.getSignedUrl();
                if (supportAgent.getTextOnly()) {
                    str = signedUrl;
                } else {
                    str = null;
                }
                String conversationToken = supportAgent.getConversationToken();
                if (!supportAgent.getTextOnly()) {
                    str2 = conversationToken;
                } else {
                    str2 = null;
                }
                String websocketUrl = supportAgent.getWebsocketUrl();
                Map<String, Object> dynamicVariables = supportAgent.getDynamicVariables();
                if (!dynamicVariables.isEmpty()) {
                    map = dynamicVariables;
                } else {
                    map = null;
                }
                ConversationConfig conversationConfig = new ConversationConfig(null, str2, str, null, supportAgent.getTextOnly(), 0, null, websocketUrl, null, null, null, map, this.supportClientToolsFactory.create(), new AssistantSessionManager$connectSupportAgentSession$config$4(this), new AssistantSessionManager$connectSupportAgentSession$config$5(this), new AssistantSessionManager$connectSupportAgentSession$config$6(this), new AssistantSessionManager$connectSupportAgentSession$config$7(this), new AssistantSessionManager$connectSupportAgentSession$config$8(this), new AssistantSessionManager$connectSupportAgentSession$config$15(this), new AssistantSessionManager$connectSupportAgentSession$config$9(this), null, null, null, new AssistantSessionManager$connectSupportAgentSession$config$10(this), null, new AssistantSessionManager$connectSupportAgentSession$config$11(this), new AssistantSessionManager$connectSupportAgentSession$config$12(this), new AssistantSessionManager$connectSupportAgentSession$config$13(this), new AssistantSessionManager$connectSupportAgentSession$config$14(this), null, null, 1617954665, null);
                assistantSessionManager$connectSupportAgentSession$1.L$0 = null;
                assistantSessionManager$connectSupportAgentSession$1.L$1 = null;
                assistantSessionManager$connectSupportAgentSession$1.label = 1;
                Object m996startConversationClientgIAlus = m996startConversationClientgIAlus(conversationConfig, assistantSessionManager$connectSupportAgentSession$1);
                Object obj2 = xn.a.f37986a;
                if (m996startConversationClientgIAlus == obj2) {
                    return obj2;
                }
                return m996startConversationClientgIAlus;
            }
        }
        assistantSessionManager$connectSupportAgentSession$1 = new AssistantSessionManager$connectSupportAgentSession$1(this, cVar);
        Object obj3 = assistantSessionManager$connectSupportAgentSession$1.result;
        i10 = assistantSessionManager$connectSupportAgentSession$1.label;
        if (i10 == 0) {
        }
    }

    private final void handleAgentChatResponsePart(JSONObject obj) {
        String str;
        AssistantSessionService.SessionListener sessionListener;
        StringBuilder putIfAbsent;
        JSONObject optJSONObject = obj.optJSONObject("text_response_part");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("type");
            String optString2 = optJSONObject.optString(ParameterNames.TEXT);
            int optInt = optJSONObject.optInt("event_id", -1);
            if (optInt >= 0 && optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != 3540994) {
                    if (hashCode != 95468472) {
                        if (hashCode == 109757538 && optString.equals("start")) {
                            this.agentDeltaAccumulator.put(Integer.valueOf(optInt), new StringBuilder());
                            return;
                        }
                        return;
                    }
                    if (optString.equals("delta")) {
                        ConcurrentHashMap<Integer, StringBuilder> concurrentHashMap = this.agentDeltaAccumulator;
                        Integer valueOf = Integer.valueOf(optInt);
                        StringBuilder sb = concurrentHashMap.get(valueOf);
                        if (sb == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (sb = new StringBuilder()))) != null) {
                            sb = putIfAbsent;
                        }
                        StringBuilder sb2 = sb;
                        sb2.append(optString2);
                        String sb3 = sb2.toString();
                        if (sb3.length() > 0 && (sessionListener = this.listener) != null) {
                            sessionListener.onAgentResponseStreaming(sb3, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (optString.equals("stop")) {
                    StringBuilder remove = this.agentDeltaAccumulator.remove(Integer.valueOf(optInt));
                    if (remove != null) {
                        str = remove.toString();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() > 0) {
                        this.lastCompletedAgentEventId = Integer.valueOf(optInt);
                        AssistantSessionService.SessionListener sessionListener2 = this.listener;
                        if (sessionListener2 != null) {
                            sessionListener2.onAgentResponseStreaming(str, true);
                        }
                        AssistantSessionService.SessionListener sessionListener3 = this.listener;
                        if (sessionListener3 != null) {
                            sessionListener3.onAgentResponse(str);
                        }
                    }
                }
            }
        }
    }

    private final void handleAgentResponseEvent(JSONObject obj) {
        AssistantSessionService.SessionListener sessionListener;
        Integer num;
        JSONObject optJSONObject = obj.optJSONObject("agent_response_event");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("agent_response");
            int optInt = optJSONObject.optInt("event_id", -1);
            optString.getClass();
            if (optString.length() == 0) {
                return;
            }
            if ((optInt < 0 || (num = this.lastCompletedAgentEventId) == null || optInt != num.intValue()) && (sessionListener = this.listener) != null) {
                sessionListener.onAgentResponse(optString);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkAgentResponseCorrection(String originalResponse, String correctedResponse) {
        this.logger.log(TAG, defpackage.f.k("Agent response correction - Original: ", originalResponse, ", Corrected: ", correctedResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkAgentToolResponse(String toolName, String toolCallId, String toolType, boolean isError) {
        Logger logger = this.logger;
        StringBuilder s10 = defpackage.f.s("Agent tool response - Tool: ", toolName, ", CallId: ", toolCallId, ", Type: ");
        s10.append(toolType);
        s10.append(", IsError: ");
        s10.append(isError);
        logger.log(TAG, s10.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkCanSendFeedbackChange(boolean canSend) {
        this.logger.log(TAG, "Can send feedback: " + canSend);
        AssistantSessionService.SessionListener sessionListener = this.listener;
        if (sessionListener != null) {
            sessionListener.onCanSendFeedbackChange(canSend);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkConnect(String conversationId) {
        i.r("Connected: conversationId=", conversationId, this.logger, TAG);
        this.vibrationService.vibrateShort();
        j1 j1Var = this._state;
        while (true) {
            Object value = j1Var.getValue();
            String str = conversationId;
            if (j1Var.compareAndSet(value, AssistantSessionService.SessionState.copy$default((AssistantSessionService.SessionState) value, AssistantSessionService.SessionStatus.CONNECTED, str, null, null, 12, null))) {
                return;
            } else {
                conversationId = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkConversationInitiationMetadata(String conversationId, String agentOutputFormat, String userInputFormat) {
        Logger logger = this.logger;
        StringBuilder s10 = defpackage.f.s("Conversation metadata - ID: ", conversationId, ", AgentFormat: ", agentOutputFormat, ", UserFormat: ");
        s10.append(userInputFormat);
        logger.log(TAG, s10.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkInterruption(int eventId) {
        this.logger.log(TAG, "Interruption event: " + eventId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkMessage(String source, String messageJson) {
        this.logger.log(TAG, defpackage.f.k("onMessage from=", source, ": ", messageJson));
        if (kotlin.jvm.internal.m.c(source, "ai")) {
            routeIncomingAgentMessage(messageJson);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkModeChange(ConversationMode mode) {
        this.logger.log(TAG, "Mode changed: " + mode);
        AssistantSessionService.SessionListener sessionListener = this.listener;
        if (sessionListener != null) {
            sessionListener.onModeChange(mode.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkStatusChange(ConversationStatus status) {
        AssistantSessionService.SessionStatus sessionStatus;
        Object value;
        this.logger.log(TAG, "Status changed: " + status);
        int i10 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4 && i10 != 5) {
                    c6.p();
                    return;
                }
                sessionStatus = AssistantSessionService.SessionStatus.DISCONNECTED;
            } else {
                sessionStatus = AssistantSessionService.SessionStatus.CONNECTING;
            }
        } else {
            sessionStatus = AssistantSessionService.SessionStatus.CONNECTED;
        }
        AssistantSessionService.SessionStatus sessionStatus2 = sessionStatus;
        j1 j1Var = this._state;
        do {
            value = j1Var.getValue();
        } while (!j1Var.compareAndSet(value, AssistantSessionService.SessionState.copy$default((AssistantSessionService.SessionState) value, sessionStatus2, null, null, null, 14, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkUnhandledClientToolCall(ConversationEvent.ClientToolCall clientToolCall) {
        this.logger.log(TAG, "Unhandled client tool call: " + clientToolCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkUserTranscript(String userTranscript) {
        i.r("User transcript: ", userTranscript, this.logger, TAG);
        AssistantSessionService.SessionListener sessionListener = this.listener;
        if (sessionListener != null) {
            sessionListener.onUserTranscript(userTranscript);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSdkVadScore(float score) {
        AssistantSessionService.SessionListener sessionListener = this.listener;
        if (sessionListener != null) {
            sessionListener.onVadScore(score);
        }
    }

    private final void routeIncomingAgentMessage(String json) {
        Object lVar;
        try {
            lVar = new JSONObject(json);
        } catch (Throwable th) {
            lVar = new l(th);
        }
        if (lVar instanceof l) {
            lVar = null;
        }
        JSONObject jSONObject = (JSONObject) lVar;
        if (jSONObject != null) {
            String optString = jSONObject.optString("type");
            if (kotlin.jvm.internal.m.c(optString, "agent_chat_response_part")) {
                handleAgentChatResponsePart(jSONObject);
            } else if (kotlin.jvm.internal.m.c(optString, "agent_response")) {
                handleAgentResponseEvent(jSONObject);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(2:3|(19:5|6|7|8|(1:(1:(1:(6:13|14|15|(2:17|(1:18))|22|(2:24|25)(2:27|28))(2:29|30))(10:31|32|33|34|35|(1:37)|15|(0)|22|(0)(0)))(2:41|42))(13:52|(1:54)|47|48|(2:50|39)|33|34|35|(0)|15|(0)|22|(0)(0))|43|44|(1:46)|47|48|(0)|33|34|35|(0)|15|(0)|22|(0)(0)))|61|6|7|8|(0)(0)|43|44|(0)|47|48|(0)|33|34|35|(0)|15|(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        if (r12.setMicMuted(false, r13) == r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0077, code lost:
    
        if (r0.endSession(r13) == r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0062, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007c, code lost:
    
        r1 = new sn.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
    
        r0 = new sn.l(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0064  */
    /* renamed from: startConversationClient-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m996startConversationClientgIAlus(ConversationConfig conversationConfig, wn.c<? super m> cVar) {
        AssistantSessionManager$startConversationClient$1 assistantSessionManager$startConversationClient$1;
        Object obj;
        int i10;
        xn.a aVar;
        Throwable a10;
        Object obj2;
        ConversationSession conversationSession;
        Throwable a11;
        Object value;
        if (cVar instanceof AssistantSessionManager$startConversationClient$1) {
            assistantSessionManager$startConversationClient$1 = (AssistantSessionManager$startConversationClient$1) cVar;
            int i11 = assistantSessionManager$startConversationClient$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assistantSessionManager$startConversationClient$1.label = i11 - Integer.MIN_VALUE;
                AssistantSessionManager$startConversationClient$1 assistantSessionManager$startConversationClient$12 = assistantSessionManager$startConversationClient$1;
                obj = assistantSessionManager$startConversationClient$12.result;
                i10 = assistantSessionManager$startConversationClient$12.label;
                z zVar = z.f31622a;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                conversationSession = (ConversationSession) assistantSessionManager$startConversationClient$12.L$2;
                                obj2 = assistantSessionManager$startConversationClient$12.L$1;
                                sn.a.g(obj);
                                conversationSession.setVolume(1.0f);
                                a11 = m.a(obj2);
                                if (a11 != null) {
                                    this.logger.logWarning(TAG, "Failed to start session: " + a11, a11);
                                    j1 j1Var = this._state;
                                    do {
                                        value = j1Var.getValue();
                                    } while (!j1Var.compareAndSet(value, AssistantSessionService.SessionState.copy$default((AssistantSessionService.SessionState) value, AssistantSessionService.SessionStatus.DISCONNECTED, null, a11.getMessage(), null, 10, null)));
                                }
                                if (!(obj2 instanceof l)) {
                                    return zVar;
                                }
                                return obj2;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                        Object lVar = (ConversationSession) obj;
                        obj2 = lVar;
                        if (!(obj2 instanceof l)) {
                            conversationSession = (ConversationSession) obj2;
                            this.logger.log(TAG, "Started session successfully: " + conversationSession);
                            this.session = conversationSession;
                            assistantSessionManager$startConversationClient$12.L$0 = null;
                            assistantSessionManager$startConversationClient$12.L$1 = obj2;
                            assistantSessionManager$startConversationClient$12.L$2 = conversationSession;
                            assistantSessionManager$startConversationClient$12.I$0 = 0;
                            assistantSessionManager$startConversationClient$12.label = 3;
                        }
                        a11 = m.a(obj2);
                        if (a11 != null) {
                        }
                        if (!(obj2 instanceof l)) {
                        }
                    } else {
                        conversationConfig = (ConversationConfig) assistantSessionManager$startConversationClient$12.L$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    ConversationSession conversationSession2 = this.session;
                    if (conversationSession2 != null) {
                        assistantSessionManager$startConversationClient$12.L$0 = conversationConfig;
                        assistantSessionManager$startConversationClient$12.L$1 = null;
                        assistantSessionManager$startConversationClient$12.I$0 = 0;
                        assistantSessionManager$startConversationClient$12.label = 1;
                    }
                    ConversationClient.Companion companion = ConversationClient.INSTANCE;
                    Context context = this.context;
                    assistantSessionManager$startConversationClient$12.L$0 = null;
                    assistantSessionManager$startConversationClient$12.L$1 = null;
                    assistantSessionManager$startConversationClient$12.I$0 = 0;
                    assistantSessionManager$startConversationClient$12.label = 2;
                    obj = companion.startSession(conversationConfig, context, assistantSessionManager$startConversationClient$12);
                    if (obj == aVar) {
                        return aVar;
                    }
                    Object lVar2 = (ConversationSession) obj;
                    obj2 = lVar2;
                    if (!(obj2 instanceof l)) {
                    }
                    a11 = m.a(obj2);
                    if (a11 != null) {
                    }
                    if (!(obj2 instanceof l)) {
                    }
                }
                Object lVar3 = zVar;
                a10 = m.a(lVar3);
                if (a10 != null) {
                    this.logger.logWarning(TAG, "Failed to end previous session: " + a10, a10);
                }
                ConversationClient.Companion companion2 = ConversationClient.INSTANCE;
                Context context2 = this.context;
                assistantSessionManager$startConversationClient$12.L$0 = null;
                assistantSessionManager$startConversationClient$12.L$1 = null;
                assistantSessionManager$startConversationClient$12.I$0 = 0;
                assistantSessionManager$startConversationClient$12.label = 2;
                obj = companion2.startSession(conversationConfig, context2, assistantSessionManager$startConversationClient$12);
                if (obj == aVar) {
                }
                Object lVar22 = (ConversationSession) obj;
                obj2 = lVar22;
                if (!(obj2 instanceof l)) {
                }
                a11 = m.a(obj2);
                if (a11 != null) {
                }
                if (!(obj2 instanceof l)) {
                }
            }
        }
        assistantSessionManager$startConversationClient$1 = new AssistantSessionManager$startConversationClient$1(this, cVar);
        AssistantSessionManager$startConversationClient$1 assistantSessionManager$startConversationClient$122 = assistantSessionManager$startConversationClient$1;
        obj = assistantSessionManager$startConversationClient$122.result;
        i10 = assistantSessionManager$startConversationClient$122.label;
        z zVar2 = z.f31622a;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        Object lVar32 = zVar2;
        a10 = m.a(lVar32);
        if (a10 != null) {
        }
        ConversationClient.Companion companion22 = ConversationClient.INSTANCE;
        Context context22 = this.context;
        assistantSessionManager$startConversationClient$122.L$0 = null;
        assistantSessionManager$startConversationClient$122.L$1 = null;
        assistantSessionManager$startConversationClient$122.I$0 = 0;
        assistantSessionManager$startConversationClient$122.label = 2;
        obj = companion22.startSession(conversationConfig, context22, assistantSessionManager$startConversationClient$122);
        if (obj == aVar) {
        }
        Object lVar222 = (ConversationSession) obj;
        obj2 = lVar222;
        if (!(obj2 instanceof l)) {
        }
        a11 = m.a(obj2);
        if (a11 != null) {
        }
        if (!(obj2 instanceof l)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006c, code lost:
    
        if (r1 == r10) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: startReadContextSession-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m997startReadContextSessiongIAlus(AssistantSessionSource.ReadContext readContext, wn.c<? super m> cVar) {
        AssistantSessionManager$startReadContextSession$1 assistantSessionManager$startReadContextSession$1;
        int i10;
        AssistantSessionSource.ReadContext readContext2;
        AsyncCallResult asyncCallResult;
        String message;
        Object value;
        Object value2;
        if (cVar instanceof AssistantSessionManager$startReadContextSession$1) {
            assistantSessionManager$startReadContextSession$1 = (AssistantSessionManager$startReadContextSession$1) cVar;
            int i11 = assistantSessionManager$startReadContextSession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assistantSessionManager$startReadContextSession$1.label = i11 - Integer.MIN_VALUE;
                AssistantSessionManager$startReadContextSession$1 assistantSessionManager$startReadContextSession$12 = assistantSessionManager$startReadContextSession$1;
                Object obj = assistantSessionManager$startReadContextSession$12.result;
                i10 = assistantSessionManager$startReadContextSession$12.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return ((m) obj).f31603a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    readContext2 = (AssistantSessionSource.ReadContext) assistantSessionManager$startReadContextSession$12.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    AssistantService assistantService = this.assistantService;
                    String readId = readContext.getReadId();
                    long position = readContext.getPosition();
                    String voiceId = readContext.getVoiceId();
                    if (voiceId == null) {
                        voiceId = "";
                    }
                    String str = voiceId;
                    readContext2 = readContext;
                    assistantSessionManager$startReadContextSession$12.L$0 = readContext2;
                    assistantSessionManager$startReadContextSession$12.label = 1;
                    obj = assistantService.initializeAssistant(readId, position, str, assistantSessionManager$startReadContextSession$12);
                }
                asyncCallResult = (AsyncCallResult) obj;
                if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
                    AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                    this.logger.log(TAG, "Assistant config loaded: " + success.getData());
                    j1 j1Var = this._state;
                    do {
                        value2 = j1Var.getValue();
                    } while (!j1Var.compareAndSet(value2, AssistantSessionService.SessionState.copy$default((AssistantSessionService.SessionState) value2, null, null, null, (AssistantConfig) success.getData(), 7, null)));
                    AssistantConfig assistantConfig = (AssistantConfig) success.getData();
                    boolean textOnly = readContext2.getTextOnly();
                    assistantSessionManager$startReadContextSession$12.L$0 = null;
                    assistantSessionManager$startReadContextSession$12.L$1 = null;
                    assistantSessionManager$startReadContextSession$12.label = 2;
                    Object m994connectReadContextSession0E7RQCE = m994connectReadContextSession0E7RQCE(assistantConfig, textOnly, assistantSessionManager$startReadContextSession$12);
                    if (m994connectReadContextSession0E7RQCE == obj2) {
                        return obj2;
                    }
                    return m994connectReadContextSession0E7RQCE;
                }
                if (asyncCallResult instanceof AsyncCallResult.Error) {
                    AsyncCallResult.AsyncCallError error = ((AsyncCallResult.Error) asyncCallResult).getError();
                    if (error instanceof AsyncCallResult.AsyncCallError.ApiError) {
                        message = ((AsyncCallResult.AsyncCallError.ApiError) error).getMessage();
                        if (message == null) {
                            message = "Failed to load assistant configuration";
                        }
                    } else if (error instanceof AsyncCallResult.AsyncCallError.NetworkError) {
                        message = "Network error. Please check your connection.";
                    } else if (error instanceof AsyncCallResult.AsyncCallError.UnknownError) {
                        message = ((AsyncCallResult.AsyncCallError.UnknownError) error).getMessage();
                    } else {
                        c6.p();
                        return null;
                    }
                    String str2 = message;
                    Logger.logWarning$default(this.logger, TAG, defpackage.f.i("Failed to load assistant config: ", str2), null, 4, null);
                    j1 j1Var2 = this._state;
                    do {
                        value = j1Var2.getValue();
                    } while (!j1Var2.compareAndSet(value, AssistantSessionService.SessionState.copy$default((AssistantSessionService.SessionState) value, AssistantSessionService.SessionStatus.DISCONNECTED, null, str2, null, 10, null)));
                    return new l(new Exception(str2));
                }
                c6.p();
                return null;
            }
        }
        assistantSessionManager$startReadContextSession$1 = new AssistantSessionManager$startReadContextSession$1(this, cVar);
        AssistantSessionManager$startReadContextSession$1 assistantSessionManager$startReadContextSession$122 = assistantSessionManager$startReadContextSession$1;
        Object obj3 = assistantSessionManager$startReadContextSession$122.result;
        i10 = assistantSessionManager$startReadContextSession$122.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        asyncCallResult = (AsyncCallResult) obj3;
        if (!(asyncCallResult instanceof AsyncCallResult.Success)) {
        }
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    public void endSession(boolean userRequested) {
        Object value;
        this.logger.log(TAG, "Ending session, userRequested=" + userRequested);
        ConversationSession conversationSession = this.session;
        this.session = null;
        this.agentDeltaAccumulator.clear();
        this.lastCompletedAgentEventId = null;
        j1 j1Var = this._state;
        do {
            value = j1Var.getValue();
        } while (!j1Var.compareAndSet(value, new AssistantSessionService.SessionState(null, null, null, null, 15, null)));
        if (userRequested) {
            g0.D(this.scope, null, null, new AssistantSessionManager$endSession$2(this, null), 3);
        }
        if (conversationSession != null) {
            g0.D(this.scope, null, null, new AssistantSessionManager$endSession$3(conversationSession, this, null), 3);
        }
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    public n1 getCloseEvents() {
        return this.closeEvents;
    }

    public final ConversationSession getSession() {
        return this.session;
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    public z1 getState() {
        return this.state;
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    public boolean isSessionActive() {
        AssistantSessionService.SessionStatus status = ((AssistantSessionService.SessionState) this._state.getValue()).getStatus();
        if (status != AssistantSessionService.SessionStatus.CONNECTING && status != AssistantSessionService.SessionStatus.CONNECTED) {
            return false;
        }
        return true;
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    /* renamed from: sendContextualUpdate-IoAF18A */
    public Object mo951sendContextualUpdateIoAF18A(String text) {
        text.getClass();
        ConversationSession conversationSession = this.session;
        Logger logger = this.logger;
        if (conversationSession == null) {
            Logger.logWarning$default(logger, TAG, "sendContextualUpdate called but session is null", null, 4, null);
            return new l(new IllegalStateException("No active session"));
        }
        i.q("sendContextualUpdate forwarding to SDK (len=", text.length(), Separators.RPAREN, logger, TAG);
        g0.D(this.scope, null, null, new AssistantSessionManager$sendContextualUpdate$1(conversationSession, text, this, null), 3);
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    public void sendUserActivity() {
        ConversationSession conversationSession = this.session;
        if (conversationSession == null) {
            return;
        }
        g0.D(this.scope, null, null, new AssistantSessionManager$sendUserActivity$1(conversationSession, null), 3);
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    /* renamed from: sendUserMessage-IoAF18A */
    public Object mo952sendUserMessageIoAF18A(String text) {
        text.getClass();
        ConversationSession conversationSession = this.session;
        Logger logger = this.logger;
        if (conversationSession == null) {
            Logger.logWarning$default(logger, TAG, "sendUserMessage called but session is null", null, 4, null);
            return new l(new IllegalStateException("No active session"));
        }
        i.q("sendUserMessage forwarding to SDK (len=", text.length(), Separators.RPAREN, logger, TAG);
        g0.D(this.scope, null, null, new AssistantSessionManager$sendUserMessage$1(conversationSession, text, this, null), 3);
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    public void setListener(AssistantSessionService.SessionListener listener) {
        this.listener = listener;
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    public void setMicMuted(boolean muted) {
        ConversationSession conversationSession = this.session;
        if (conversationSession == null) {
            return;
        }
        g0.D(this.scope, null, null, new AssistantSessionManager$setMicMuted$1(conversationSession, muted, null), 3);
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    public void setVolume(float volume) {
        ConversationSession conversationSession = this.session;
        if (conversationSession == null) {
            return;
        }
        g0.D(this.scope, null, null, new AssistantSessionManager$setVolume$1(conversationSession, volume, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    /* renamed from: startSession-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo953startSessiongIAlus(AssistantSessionSource assistantSessionSource, wn.c<? super m> cVar) {
        AssistantSessionManager$startSession$1 assistantSessionManager$startSession$1;
        int i10;
        Object value;
        if (cVar instanceof AssistantSessionManager$startSession$1) {
            assistantSessionManager$startSession$1 = (AssistantSessionManager$startSession$1) cVar;
            int i11 = assistantSessionManager$startSession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assistantSessionManager$startSession$1.label = i11 - Integer.MIN_VALUE;
                Object obj = assistantSessionManager$startSession$1.result;
                i10 = assistantSessionManager$startSession$1.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return ((m) obj).f31603a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                    return ((m) obj).f31603a;
                }
                sn.a.g(obj);
                if (isSessionActive()) {
                    this.logger.log(TAG, "Session already active, ending first");
                    endSession(false);
                }
                j1 j1Var = this._state;
                do {
                    value = j1Var.getValue();
                } while (!j1Var.compareAndSet(value, AssistantSessionService.SessionState.copy$default((AssistantSessionService.SessionState) value, AssistantSessionService.SessionStatus.CONNECTING, null, null, null, 10, null)));
                this.logger.log(TAG, "Starting session for source=" + assistantSessionSource);
                boolean z6 = assistantSessionSource instanceof AssistantSessionSource.ReadContext;
                Object obj2 = xn.a.f37986a;
                if (z6) {
                    assistantSessionManager$startSession$1.L$0 = null;
                    assistantSessionManager$startSession$1.label = 1;
                    Object m997startReadContextSessiongIAlus = m997startReadContextSessiongIAlus((AssistantSessionSource.ReadContext) assistantSessionSource, assistantSessionManager$startSession$1);
                    if (m997startReadContextSessiongIAlus != obj2) {
                        return m997startReadContextSessiongIAlus;
                    }
                } else if (assistantSessionSource instanceof AssistantSessionSource.SupportAgent) {
                    assistantSessionManager$startSession$1.L$0 = null;
                    assistantSessionManager$startSession$1.label = 2;
                    Object m995connectSupportAgentSessiongIAlus = m995connectSupportAgentSessiongIAlus((AssistantSessionSource.SupportAgent) assistantSessionSource, assistantSessionManager$startSession$1);
                    if (m995connectSupportAgentSessiongIAlus != obj2) {
                        return m995connectSupportAgentSessiongIAlus;
                    }
                } else {
                    c6.p();
                    return null;
                }
                return obj2;
            }
        }
        assistantSessionManager$startSession$1 = new AssistantSessionManager$startSession$1(this, cVar);
        Object obj3 = assistantSessionManager$startSession$1.result;
        i10 = assistantSessionManager$startSession$1.label;
        if (i10 == 0) {
        }
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService
    /* renamed from: startSession-yxL6bBk */
    public /* bridge */ Object mo954startSessionyxL6bBk(String str, long j4, String str2, boolean z6, wn.c<? super m> cVar) {
        return super.mo954startSessionyxL6bBk(str, j4, str2, z6, cVar);
    }
}
