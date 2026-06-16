package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AssistantConfig;
import io.elevenlabs.domain.services.AssistantInteractionMode;
import io.elevenlabs.domain.services.AssistantPreferencesService;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import ir.i1;
import ir.n1;
import ir.q1;
import ir.z1;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001[\b\u0007\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001^B?\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010\"J\u001d\u0010(\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001e¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0017H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b2\u0010*J\u000f\u00103\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010,J\u000f\u00104\u001a\u00020\u0017H\u0002¢\u0006\u0004\b4\u0010,J\u000f\u00105\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u0010,J\u000f\u00106\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u0010,J\u000f\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u0010,J\u0017\u00109\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u001eH\u0002¢\u0006\u0004\b9\u0010%J\u000f\u0010:\u001a\u00020\u0017H\u0002¢\u0006\u0004\b:\u0010,J\u000f\u0010;\u001a\u00020\u0017H\u0002¢\u0006\u0004\b;\u0010,J\u0017\u0010=\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u0012H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0017H\u0002¢\u0006\u0004\b?\u0010,J\u0017\u0010A\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\u0012H\u0002¢\u0006\u0004\bA\u0010>J\u000f\u0010B\u001a\u00020\u0017H\u0002¢\u0006\u0004\bB\u0010,J\u000f\u0010C\u001a\u00020\u0017H\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020\u0017H\u0002¢\u0006\u0004\bD\u0010,J\u000f\u0010E\u001a\u00020\u0017H\u0002¢\u0006\u0004\bE\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010HR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020L0O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010TR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010UR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AskAssistantViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/AssistantPreferencesService;", "assistantPreferencesService", "Ljl/a;", "Lio/elevenlabs/domain/services/RuntimePermissionsService;", "runtimePermissionsService", "Lio/elevenlabs/domain/services/player/AssistantSessionService;", "assistantSessionService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/AssistantPreferencesService;Ljl/a;Lio/elevenlabs/domain/services/player/AssistantSessionService;)V", "", "readId", "", "position", "voiceId", "Lsn/z;", "initialize", "(Ljava/lang/String;JLjava/lang/String;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;", "event", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;)V", "", "granted", "isUserResponse", "updateMicPermission", "(ZZ)V", "denied", "updateMicPermissionPermanentlyDenied", "(Z)V", "isPermanentlyDenied", "handlePermissionResult", "checkMicPermissionState", "hasAskedForMicPermissionBefore", "(Lwn/c;)Ljava/lang/Object;", "onCleared", "()V", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;", "status", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "mapSessionStatus", "(Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;)Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "initializeAssistant", "handleClose", "handleRetry", "handleDismissExplainer", "handleAcceptTerms", "handleDeclineTerms", "isKeyboardVisible", "handleToggleMode", "handleToggleMic", "handleToggleAudio", ParameterNames.TEXT, "handleSendTextMessage", "(Ljava/lang/String;)V", "handleUserTyping", SDPKeywords.PROMPT, "handleSuggestedPromptClicked", "handleGiveFeedback", "handlePause", "handleResume", "endSession", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/AssistantPreferencesService;", "Ljl/a;", "Lio/elevenlabs/domain/services/player/AssistantSessionService;", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$ControlEvent;", "_controlEvents", "Lir/i1;", "Lir/n1;", "controlEvents", "Lir/n1;", "getControlEvents", "()Lir/n1;", "Ljava/lang/String;", "Ljava/lang/Long;", "Lfr/k1;", "sessionJob", "Lfr/k1;", "lastMessageSentAt", "J", "io/elevenlabs/readerapp/ui/screens/authenticated/assistant/AskAssistantViewModel$sessionListener$1", "sessionListener", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AskAssistantViewModel$sessionListener$1;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AskAssistantViewModel extends MviViewModel<AssistantContract.State> {
    private static final long DEBOUNCE_DELAY_MS = 500;
    private static final String TAG = "AskAssistantViewModel";
    private final i1 _controlEvents;
    private final Analytics analytics;
    private final AssistantPreferencesService assistantPreferencesService;
    private final AssistantSessionService assistantSessionService;
    private final n1 controlEvents;
    private long lastMessageSentAt;
    private final Logger logger;
    private Long position;
    private String readId;
    private final jl.a runtimePermissionsService;
    private k1 sessionJob;
    private final AskAssistantViewModel$sessionListener$1 sessionListener;
    private String voiceId;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$2", f = "AskAssistantViewModel.kt", l = {118}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                n1 closeEvents = AskAssistantViewModel.this.assistantSessionService.getCloseEvents();
                final AskAssistantViewModel askAssistantViewModel = AskAssistantViewModel.this;
                ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel.2.1
                    public final Object emit(sn.z zVar, wn.c<? super sn.z> cVar) {
                        AskAssistantViewModel.this.logger.log(AskAssistantViewModel.TAG, "Received close event, emitting CloseSheet");
                        Object emit = AskAssistantViewModel.this._controlEvents.emit(AssistantContract.ControlEvent.CloseSheet.INSTANCE, cVar);
                        if (emit == xn.a.f37986a) {
                            return emit;
                        }
                        return sn.z.f31622a;
                    }

                    @Override // ir.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                        return emit((sn.z) obj2, (wn.c<? super sn.z>) cVar);
                    }
                };
                this.label = 1;
                Object collect = closeEvents.collect(jVar, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            c6.u();
            return null;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssistantSessionService.SessionStatus.values().length];
            try {
                iArr[AssistantSessionService.SessionStatus.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssistantSessionService.SessionStatus.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssistantSessionService.SessionStatus.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssistantSessionService.SessionStatus.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAssistantViewModel(DispatcherFactory dispatcherFactory, Logger logger, Analytics analytics, AssistantPreferencesService assistantPreferencesService, jl.a aVar, AssistantSessionService assistantSessionService) {
        super(new AssistantContract.State(null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097151, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        logger.getClass();
        analytics.getClass();
        assistantPreferencesService.getClass();
        aVar.getClass();
        assistantSessionService.getClass();
        this.logger = logger;
        this.analytics = analytics;
        this.assistantPreferencesService = assistantPreferencesService;
        this.runtimePermissionsService = aVar;
        this.assistantSessionService = assistantSessionService;
        q1 b10 = ir.r.b(0, 0, null, 7);
        this._controlEvents = b10;
        this.controlEvents = new ir.k1(b10);
        this.sessionListener = new AskAssistantViewModel$sessionListener$1(this);
        logger.log(TAG, "Initializing AskAssistantViewModel");
        g0.D(c1.h(this), null, null, new AnonymousClass1(null), 3);
        g0.D(c1.h(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endSession() {
        k1 k1Var = this.sessionJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.sessionJob = null;
        this.assistantSessionService.setListener(null);
        this.assistantSessionService.endSession(false);
        this.logger.log(TAG, "Session ended");
    }

    private final void handleAcceptTerms() {
        this.analytics.log(Analytics.Event.AgentTermsAcceptClicked.INSTANCE);
        g0.D(c1.h(this), null, null, new AskAssistantViewModel$handleAcceptTerms$1(this, null), 3);
    }

    private final void handleClose() {
        this.logger.log(TAG, "Close clicked");
        Analytics analytics = this.analytics;
        String str = this.readId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.voiceId;
        if (str3 != null) {
            str2 = str3;
        }
        analytics.log(new Analytics.Event.AgentClosed(str, str2));
        g0.D(c1.h(this), null, null, new AskAssistantViewModel$handleClose$1(this, null), 3);
    }

    private final void handleDeclineTerms() {
        this.analytics.log(Analytics.Event.AgentTermsDeclineClicked.INSTANCE);
    }

    private final void handleDismissExplainer() {
        this.assistantPreferencesService.markExplainerSeen();
        queueStateUpdate(new o(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State handleDismissExplainer$lambda$0(AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097143, null);
    }

    private final void handleGiveFeedback() {
        String str;
        AssistantConfig assistantConfig = ((AssistantContract.State) getStateFlow().getValue()).getAssistantConfig();
        if (assistantConfig != null) {
            str = assistantConfig.getUserId();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String conversationId = ((AssistantContract.State) getStateFlow().getValue()).getConversationId();
        if (conversationId != null) {
            str2 = conversationId;
        }
        g0.D(c1.h(this), null, null, new AskAssistantViewModel$handleGiveFeedback$1(this, defpackage.f.k("https://form.typeform.com/to/hXh0AAb5#device=android&user_id=", str, "&conversation_id=", str2), null), 3);
    }

    private final void handlePause() {
        this.logger.log(TAG, "handlePause()");
        if (((AssistantContract.State) getStateFlow().getValue()).getStatus() == AssistantStatus.CONNECTED) {
            this.logger.log(TAG, "handlePause() - muting session");
            this.assistantSessionService.setMicMuted(true);
            this.assistantSessionService.setVolume(t2.u.P);
        }
    }

    private final void handleResume() {
        float f10;
        this.logger.log(TAG, "handleResume()");
        if (((AssistantContract.State) getStateFlow().getValue()).getStatus() == AssistantStatus.CONNECTED) {
            this.logger.log(TAG, "handleResume() - restoring session settings");
            this.assistantSessionService.setMicMuted(((AssistantContract.State) getStateFlow().getValue()).isMicMuted());
            AssistantSessionService assistantSessionService = this.assistantSessionService;
            if (((AssistantContract.State) getStateFlow().getValue()).isAudioMuted()) {
                f10 = t2.u.P;
            } else {
                f10 = 1.0f;
            }
            assistantSessionService.setVolume(f10);
        }
    }

    private final void handleRetry() {
        this.logger.log(TAG, "Retry/reconnect clicked");
        k1 k1Var = this.sessionJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        g0.D(c1.h(this), null, null, new AskAssistantViewModel$handleRetry$1(this, null), 3);
    }

    private final void handleSendTextMessage(String text) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastMessageSentAt < DEBOUNCE_DELAY_MS) {
            this.logger.log(TAG, "Message sending debounced");
            return;
        }
        this.lastMessageSentAt = currentTimeMillis;
        ib.i.r("Sending text message: ", text, this.logger, TAG);
        Object mo952sendUserMessageIoAF18A = this.assistantSessionService.mo952sendUserMessageIoAF18A(text);
        if (!(mo952sendUserMessageIoAF18A instanceof sn.l)) {
            this.logger.log(TAG, "Text message sent successfully");
        }
        Throwable a10 = sn.m.a(mo952sendUserMessageIoAF18A);
        if (a10 != null) {
            this.logger.logWarning(TAG, "Failed to send text message (" + a10 + Separators.RPAREN, a10);
        }
        queueStateUpdate(new p(text, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State handleSendTextMessage$lambda$2(String str, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, true, null, tn.o.P0(new ChatMessage(str, true, 0L, 4, null), state.getChatMessages()), true, false, null, false, false, false, false, false, 2083839, null);
    }

    private final void handleSuggestedPromptClicked(String prompt) {
        this.analytics.log(new Analytics.Event.AgentSuggestedPromptClicked(prompt));
        handleSendTextMessage(prompt);
    }

    private final void handleToggleAudio() {
        Analytics.Event event;
        float f10;
        boolean isAudioMuted = ((AssistantContract.State) getStateFlow().getValue()).isAudioMuted();
        boolean z6 = !isAudioMuted;
        Analytics analytics = this.analytics;
        if (!isAudioMuted) {
            event = Analytics.Event.AgentSpeakerMuteClicked.INSTANCE;
        } else {
            event = Analytics.Event.AgentSpeakerUnmuteClicked.INSTANCE;
        }
        analytics.log(event);
        if (!isAudioMuted) {
            f10 = t2.u.P;
        } else {
            f10 = 1.0f;
        }
        this.logger.log(TAG, "Setting volume to " + f10);
        this.assistantSessionService.setVolume(f10);
        queueStateUpdate(new q(z6, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State handleToggleAudio$lambda$0(boolean z6, AssistantContract.State state) {
        AssistantInteractionMode interactionMode;
        state.getClass();
        if (state.getInteractionMode() == AssistantInteractionMode.VOICE && z6) {
            interactionMode = AssistantInteractionMode.TEXT;
        } else {
            interactionMode = state.getInteractionMode();
        }
        return AssistantContract.State.copy$default(state, null, null, interactionMode, false, false, false, z6, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097083, null);
    }

    private final void handleToggleMic() {
        Analytics.Event event;
        boolean isMicMuted = ((AssistantContract.State) getStateFlow().getValue()).isMicMuted();
        boolean z6 = !isMicMuted;
        Analytics analytics = this.analytics;
        if (!isMicMuted) {
            event = Analytics.Event.AgentMicMuteClicked.INSTANCE;
        } else {
            event = Analytics.Event.AgentMicUnmuteClicked.INSTANCE;
        }
        analytics.log(event);
        this.assistantSessionService.setMicMuted(z6);
        queueStateUpdate(new q(z6, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State handleToggleMic$lambda$0(boolean z6, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, z6, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097119, null);
    }

    private final void handleToggleMode(boolean isKeyboardVisible) {
        AssistantInteractionMode interactionMode = ((AssistantContract.State) getStateFlow().getValue()).getInteractionMode();
        if (((AssistantContract.State) getStateFlow().getValue()).isTransitioning()) {
            return;
        }
        g0.D(c1.h(this), null, null, new AskAssistantViewModel$handleToggleMode$1(interactionMode, this, isKeyboardVisible, null), 3);
    }

    private final void handleUserTyping() {
        this.assistantSessionService.sendUserActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State initialize$lambda$0(AskAssistantViewModel askAssistantViewModel, AssistantInteractionMode assistantInteractionMode, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, AssistantStatus.CONNECTING, null, assistantInteractionMode, !askAssistantViewModel.assistantPreferencesService.hasSeenExplainer(), false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097138, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeAssistant(wn.c<? super sn.z> cVar) {
        AskAssistantViewModel$initializeAssistant$1 askAssistantViewModel$initializeAssistant$1;
        Object obj;
        int i10;
        if (cVar instanceof AskAssistantViewModel$initializeAssistant$1) {
            askAssistantViewModel$initializeAssistant$1 = (AskAssistantViewModel$initializeAssistant$1) cVar;
            int i11 = askAssistantViewModel$initializeAssistant$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                askAssistantViewModel$initializeAssistant$1.label = i11 - Integer.MIN_VALUE;
                obj = askAssistantViewModel$initializeAssistant$1.result;
                i10 = askAssistantViewModel$initializeAssistant$1.label;
                sn.z zVar = sn.z.f31622a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    k1 k1Var = this.sessionJob;
                    if (k1Var != null && k1Var.isActive()) {
                        this.logger.log(TAG, "Session job is already running.");
                        return zVar;
                    }
                    if (!this.assistantPreferencesService.hasSeenExplainer()) {
                        this.logger.log(TAG, "Can't initialize yet because user hasn't dismissed explainer yet.");
                        return zVar;
                    }
                    ir.i hasAcceptedTerms = this.assistantPreferencesService.hasAcceptedTerms();
                    askAssistantViewModel$initializeAssistant$1.label = 1;
                    obj = ir.r.u(hasAcceptedTerms, askAssistantViewModel$initializeAssistant$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    this.logger.log(TAG, "Can't initialize yet because terms have not been accepted.");
                    return zVar;
                }
                queueStateUpdate(new o(6));
                this.logger.log(TAG, "Initializing assistant for readId=" + this.readId + ", position=" + this.position + ", voiceId=" + this.voiceId);
                this.assistantSessionService.setListener(this.sessionListener);
                this.sessionJob = g0.D(c1.h(this), null, null, new AskAssistantViewModel$initializeAssistant$3(this, null), 3);
                return zVar;
            }
        }
        askAssistantViewModel$initializeAssistant$1 = new AskAssistantViewModel$initializeAssistant$1(this, cVar);
        obj = askAssistantViewModel$initializeAssistant$1.result;
        i10 = askAssistantViewModel$initializeAssistant$1.label;
        sn.z zVar2 = sn.z.f31622a;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State initializeAssistant$lambda$0(AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, AssistantStatus.CONNECTING, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2095006, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantStatus mapSessionStatus(AssistantSessionService.SessionStatus status) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return AssistantStatus.DISCONNECTED;
                    }
                    c6.p();
                    return null;
                }
                return AssistantStatus.CONNECTED;
            }
            return AssistantStatus.CONNECTING;
        }
        return AssistantStatus.DISCONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State onEvent$lambda$0(AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, true, false, 1572863, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State onEvent$lambda$1(AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 1572863, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State updateMicPermission$lambda$0(boolean z6, AskAssistantViewModel askAssistantViewModel, boolean z10, AssistantContract.State state) {
        boolean z11;
        state.getClass();
        if (z6 && state.getStatus() != AssistantStatus.CONNECTED) {
            g0.D(c1.h(askAssistantViewModel), null, null, new AskAssistantViewModel$updateMicPermission$1$1(askAssistantViewModel, null), 3);
        }
        Boolean valueOf = Boolean.valueOf(z6);
        if (!z6 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, valueOf, z11, false, false, false, false, 1998847, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssistantContract.State updateMicPermissionPermanentlyDenied$lambda$0(boolean z6, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, z6, false, false, false, 1966079, null);
    }

    public final void checkMicPermissionState(boolean granted, boolean isPermanentlyDenied) {
        this.logger.log(TAG, "checkMicPermissionState(granted=" + granted + ", isPermanentlyDenied=" + isPermanentlyDenied + Separators.RPAREN);
        updateMicPermission(granted, false);
        if (!granted) {
            updateMicPermissionPermanentlyDenied(isPermanentlyDenied);
        } else {
            updateMicPermissionPermanentlyDenied(false);
        }
    }

    public final n1 getControlEvents() {
        return this.controlEvents;
    }

    public final void handlePermissionResult(boolean granted, boolean isPermanentlyDenied) {
        this.logger.log(TAG, "handlePermissionResult(granted=" + granted + ", isPermanentlyDenied=" + isPermanentlyDenied + Separators.RPAREN);
        g0.D(c1.h(this), null, null, new AskAssistantViewModel$handlePermissionResult$1(this, granted, isPermanentlyDenied, null), 3);
    }

    public final Object hasAskedForMicPermissionBefore(wn.c<? super Boolean> cVar) {
        return ((RuntimePermissionsService) this.runtimePermissionsService.get()).hasAskedForPermissionBefore("android.permission.RECORD_AUDIO", cVar);
    }

    public final void initialize(String readId, long position, String voiceId) {
        readId.getClass();
        voiceId.getClass();
        this.readId = readId;
        this.position = Long.valueOf(position);
        this.voiceId = voiceId;
        AssistantInteractionMode lastInteractionMode = this.assistantPreferencesService.getLastInteractionMode();
        Analytics analytics = this.analytics;
        String name = lastInteractionMode.name();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        analytics.log(new Analytics.Event.AgentOpened(readId, voiceId, lowerCase));
        queueStateUpdate(new n(this, lastInteractionMode, 2));
        g0.D(c1.h(this), null, null, new AskAssistantViewModel$initialize$2(this, null), 3);
    }

    @Override // io.elevenlabs.readerapp.core.MviViewModel, androidx.lifecycle.j1
    public void onCleared() {
        this.logger.log(TAG, "Calling onCleared() - ending session and removing listener");
        endSession();
        super.onCleared();
    }

    public final void onEvent(AssistantContract.Event event) {
        event.getClass();
        if (event instanceof AssistantContract.Event.Close) {
            handleClose();
            return;
        }
        if (event instanceof AssistantContract.Event.Retry) {
            handleRetry();
            return;
        }
        if (event.equals(AssistantContract.Event.LifecyclePause.INSTANCE)) {
            handlePause();
            return;
        }
        if (event.equals(AssistantContract.Event.LifecycleResume.INSTANCE)) {
            handleResume();
            return;
        }
        if (event instanceof AssistantContract.Event.DismissExplainer) {
            handleDismissExplainer();
            return;
        }
        if (event instanceof AssistantContract.Event.AcceptTerms) {
            handleAcceptTerms();
            return;
        }
        if (event instanceof AssistantContract.Event.DeclineTerms) {
            handleDeclineTerms();
            return;
        }
        if (event instanceof AssistantContract.Event.ToggleMode) {
            handleToggleMode(((AssistantContract.Event.ToggleMode) event).isKeyboardVisible());
            return;
        }
        if (event instanceof AssistantContract.Event.ToggleMic) {
            handleToggleMic();
            return;
        }
        if (event instanceof AssistantContract.Event.ToggleAudio) {
            handleToggleAudio();
            return;
        }
        if (event instanceof AssistantContract.Event.SendTextMessage) {
            handleSendTextMessage(((AssistantContract.Event.SendTextMessage) event).getText());
            return;
        }
        if (event instanceof AssistantContract.Event.UserTyping) {
            handleUserTyping();
            return;
        }
        if (event instanceof AssistantContract.Event.SuggestedPromptClicked) {
            handleSuggestedPromptClicked(((AssistantContract.Event.SuggestedPromptClicked) event).getPrompt());
            return;
        }
        if (event instanceof AssistantContract.Event.OpenOverflowMenu) {
            queueStateUpdate(new o(7));
            return;
        }
        if (event instanceof AssistantContract.Event.CloseOverflowMenu) {
            queueStateUpdate(new o(8));
        } else if (event instanceof AssistantContract.Event.GiveFeedback) {
            handleGiveFeedback();
        } else {
            c6.p();
        }
    }

    public final void updateMicPermission(boolean granted, boolean isUserResponse) {
        this.logger.log(TAG, "updateMicPermission(granted=" + granted + Separators.RPAREN);
        queueStateUpdate(new m(granted, this, isUserResponse));
    }

    public final void updateMicPermissionPermanentlyDenied(boolean denied) {
        this.logger.log(TAG, "updateMicPermissionPermanentlyDenied(denied=" + denied + Separators.RPAREN);
        queueStateUpdate(new q(denied, 4));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$1", f = "AskAssistantViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                z1 state = AskAssistantViewModel.this.assistantSessionService.getState();
                C00331 c00331 = new C00331(AskAssistantViewModel.this);
                this.label = 1;
                Object collect = state.collect(c00331, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            c6.u();
            return null;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00331<T> implements ir.j {
            final /* synthetic */ AskAssistantViewModel this$0;

            public C00331(AskAssistantViewModel askAssistantViewModel) {
                this.this$0 = askAssistantViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AssistantContract.State emit$lambda$0(AskAssistantViewModel askAssistantViewModel, AssistantSessionService.SessionState sessionState, AssistantContract.State state) {
                boolean z6;
                state.getClass();
                AssistantStatus mapSessionStatus = askAssistantViewModel.mapSessionStatus(sessionState.getStatus());
                String conversationId = sessionState.getConversationId();
                if (conversationId == null) {
                    conversationId = state.getConversationId();
                }
                String str = conversationId;
                AssistantConfig assistantConfig = sessionState.getAssistantConfig();
                if (assistantConfig == null) {
                    assistantConfig = state.getAssistantConfig();
                }
                AssistantConfig assistantConfig2 = assistantConfig;
                String error = sessionState.getError();
                if (error == null) {
                    error = state.getConfigError();
                }
                String str2 = error;
                if (sessionState.getStatus() == AssistantSessionService.SessionStatus.CONNECTED) {
                    z6 = state.isAssistantTyping();
                } else {
                    z6 = false;
                }
                return AssistantContract.State.copy$default(state, mapSessionStatus, null, null, false, false, false, false, str, t2.u.P, assistantConfig2, false, str2, null, z6, false, null, false, false, false, false, false, 2086270, null);
            }

            public final Object emit(AssistantSessionService.SessionState sessionState, wn.c<? super sn.z> cVar) {
                AskAssistantViewModel askAssistantViewModel = this.this$0;
                askAssistantViewModel.queueStateUpdate(new n(askAssistantViewModel, sessionState, 0));
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((AssistantSessionService.SessionState) obj, (wn.c<? super sn.z>) cVar);
            }
        }
    }
}
