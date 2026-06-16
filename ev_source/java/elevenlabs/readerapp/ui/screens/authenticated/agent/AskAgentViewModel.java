package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import com.google.protobuf.c6;
import fr.d0;
import fr.k1;
import ho.l;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AgentContextService;
import io.elevenlabs.domain.services.SupportAgentService;
import io.elevenlabs.domain.services.SupportToolEvents;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import ir.i1;
import ir.n1;
import ir.q1;
import ir.r;
import ir.z1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0099\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\b\u0005*\u0001J\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MBA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010\u0015J\u0015\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0014¢\u0006\u0004\b-\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u00109\u001a\b\u0012\u0004\u0012\u000205088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0016\u0010D\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010?R\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$State;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/player/AssistantSessionService;", "assistantSessionService", "Lio/elevenlabs/domain/services/AgentContextService;", "agentContextService", "Lio/elevenlabs/domain/services/SupportAgentService;", "supportAgentService", "Lio/elevenlabs/domain/services/SupportToolEvents;", "supportToolEvents", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/player/AssistantSessionService;Lio/elevenlabs/domain/services/AgentContextService;Lio/elevenlabs/domain/services/SupportAgentService;Lio/elevenlabs/domain/services/SupportToolEvents;Lio/elevenlabs/domain/Analytics;)V", "Lsn/z;", "handleDismissCustomerCenter", "()V", "startAgentSession", "handleRetry", "pushInitialContextIfNeeded", "", "text", "handleSendMessage", "(Ljava/lang/String;)V", "handleEndChat", "endSession", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionState;", "sessionState", "trackSessionStatusTransition", "(Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionState;)V", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;", "status", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "mapSessionStatus", "(Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;)Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "initialize", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event;", "event", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$Event;)V", "onCleared", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/player/AssistantSessionService;", "Lio/elevenlabs/domain/services/AgentContextService;", "Lio/elevenlabs/domain/services/SupportAgentService;", "Lio/elevenlabs/domain/services/SupportToolEvents;", "Lio/elevenlabs/domain/Analytics;", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$ControlEvent;", "_controlEvents", "Lir/i1;", "Lir/n1;", "controlEvents", "Lir/n1;", "getControlEvents", "()Lir/n1;", "", "hasInitialized", "Z", "Lfr/k1;", "sessionJob", "Lfr/k1;", "contextPushJob", "hasPushedInitialContext", "", "lastMessageSentAt", "J", "lastSessionStatus", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionStatus;", "io/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentViewModel$sessionListener$1", "sessionListener", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentViewModel$sessionListener$1;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AskAgentViewModel extends MviViewModel<AskAgentContract.State> {
    private static final long DEBOUNCE_DELAY_MS = 500;
    private static final String SUPPORT_AGENT_MODE = "text";
    private final i1 _controlEvents;
    private final AgentContextService agentContextService;
    private final Analytics analytics;
    private final AssistantSessionService assistantSessionService;
    private k1 contextPushJob;
    private final n1 controlEvents;
    private boolean hasInitialized;
    private boolean hasPushedInitialContext;
    private long lastMessageSentAt;
    private AssistantSessionService.SessionStatus lastSessionStatus;
    private final Logger logger;
    private k1 sessionJob;
    private final AskAgentViewModel$sessionListener$1 sessionListener;
    private final SupportAgentService supportAgentService;
    private final SupportToolEvents supportToolEvents;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$2", f = "AskAgentViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements p {
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                n1 closeEvents = AskAgentViewModel.this.assistantSessionService.getCloseEvents();
                final AskAgentViewModel askAgentViewModel = AskAgentViewModel.this;
                ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel.2.1
                    public final Object emit(z zVar, wn.c<? super z> cVar) {
                        Object emit = AskAgentViewModel.this._controlEvents.emit(AskAgentContract.ControlEvent.Close.INSTANCE, cVar);
                        if (emit == xn.a.f37986a) {
                            return emit;
                        }
                        return z.f31622a;
                    }

                    @Override // ir.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                        return emit((z) obj2, (wn.c<? super z>) cVar);
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
                iArr[AssistantSessionService.SessionStatus.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssistantSessionService.SessionStatus.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssistantSessionService.SessionStatus.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AssistantSessionService.SessionStatus.CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAgentViewModel(DispatcherFactory dispatcherFactory, Logger logger, AssistantSessionService assistantSessionService, AgentContextService agentContextService, SupportAgentService supportAgentService, SupportToolEvents supportToolEvents, Analytics analytics) {
        super(new AskAgentContract.State(null, null, false, null, false, false, 63, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        logger.getClass();
        assistantSessionService.getClass();
        agentContextService.getClass();
        supportAgentService.getClass();
        supportToolEvents.getClass();
        analytics.getClass();
        this.logger = logger;
        this.assistantSessionService = assistantSessionService;
        this.agentContextService = agentContextService;
        this.supportAgentService = supportAgentService;
        this.supportToolEvents = supportToolEvents;
        this.analytics = analytics;
        q1 b10 = r.b(0, 0, null, 7);
        this._controlEvents = b10;
        this.controlEvents = new ir.k1(b10);
        this.sessionListener = new AskAgentViewModel$sessionListener$1(this);
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass3(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endSession() {
        k1 k1Var = this.sessionJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.sessionJob = null;
        k1 k1Var2 = this.contextPushJob;
        if (k1Var2 != null) {
            k1Var2.cancel((CancellationException) null);
        }
        this.contextPushJob = null;
        this.hasPushedInitialContext = false;
        this.assistantSessionService.setListener(null);
        this.assistantSessionService.endSession(false);
    }

    private final void handleDismissCustomerCenter() {
        this.analytics.log(Analytics.Event.CustomerCenterDismissed.INSTANCE);
        queueStateUpdate(new f(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AskAgentContract.State handleDismissCustomerCenter$lambda$0(AskAgentContract.State state) {
        state.getClass();
        return AskAgentContract.State.copy$default(state, null, null, false, null, false, false, 31, null);
    }

    private final void handleEndChat() {
        MviViewModel.launch$default(this, null, new AskAgentViewModel$handleEndChat$1(this, null), 1, null);
    }

    private final void handleRetry() {
        this.analytics.log(Analytics.Event.SupportAgentRetry.INSTANCE);
        k1 k1Var = this.sessionJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.sessionJob = null;
        k1 k1Var2 = this.contextPushJob;
        if (k1Var2 != null) {
            k1Var2.cancel((CancellationException) null);
        }
        this.contextPushJob = null;
        this.hasPushedInitialContext = false;
        startAgentSession();
    }

    private final void handleSendMessage(String text) {
        String obj = n.L0(text).toString();
        if (obj.length() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastMessageSentAt < DEBOUNCE_DELAY_MS) {
                return;
            }
            this.lastMessageSentAt = currentTimeMillis;
            this.analytics.log(new Analytics.Event.SupportAgentMessageSent("text"));
            this.assistantSessionService.mo952sendUserMessageIoAF18A(obj);
            queueStateUpdate(new h(obj, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AskAgentContract.State handleSendMessage$lambda$0(String str, AskAgentContract.State state) {
        state.getClass();
        return AskAgentContract.State.copy$default(state, null, o.P0(new ChatMessage(str, true, 0L, 4, null), state.getMessages()), true, null, false, false, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantStatus mapSessionStatus(AssistantSessionService.SessionStatus status) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return AssistantStatus.CONNECTING;
                    }
                    c6.p();
                    return null;
                }
                return AssistantStatus.DISCONNECTED;
            }
            return AssistantStatus.DISCONNECTED;
        }
        return AssistantStatus.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pushInitialContextIfNeeded() {
        if (this.hasPushedInitialContext) {
            return;
        }
        k1 k1Var = this.contextPushJob;
        if (k1Var != null && k1Var.isActive()) {
            return;
        }
        this.hasPushedInitialContext = true;
        this.contextPushJob = MviViewModel.launch$default(this, null, new AskAgentViewModel$pushInitialContextIfNeeded$1(this, null), 1, null);
    }

    private final void startAgentSession() {
        k1 k1Var = this.sessionJob;
        if (k1Var != null && k1Var.isActive()) {
            return;
        }
        this.assistantSessionService.setListener(this.sessionListener);
        queueStateUpdate(new f(3));
        this.sessionJob = MviViewModel.launch$default(this, null, new AskAgentViewModel$startAgentSession$2(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AskAgentContract.State startAgentSession$lambda$0(AskAgentContract.State state) {
        state.getClass();
        return AskAgentContract.State.copy$default(state, AssistantStatus.CONNECTING, null, false, null, false, false, 54, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackSessionStatusTransition(AssistantSessionService.SessionState sessionState) {
        AssistantSessionService.SessionStatus sessionStatus = this.lastSessionStatus;
        AssistantSessionService.SessionStatus status = sessionState.getStatus();
        if (sessionStatus == status) {
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 && ((sessionStatus == AssistantSessionService.SessionStatus.CONNECTING || sessionStatus == AssistantSessionService.SessionStatus.CONNECTED) && sessionState.getError() != null)) {
                this.analytics.log(new Analytics.Event.SupportAgentConnectionError("text"));
            }
        } else {
            this.analytics.log(new Analytics.Event.SupportAgentConnected("text"));
        }
        this.lastSessionStatus = status;
    }

    public final n1 getControlEvents() {
        return this.controlEvents;
    }

    public final void initialize() {
        if (this.hasInitialized) {
            return;
        }
        this.hasInitialized = true;
        this.analytics.log(new Analytics.Event.SupportAgentOpened("text"));
        startAgentSession();
    }

    @Override // io.elevenlabs.readerapp.core.MviViewModel, androidx.lifecycle.j1
    public void onCleared() {
        this.analytics.log(Analytics.Event.SupportAgentClosed.INSTANCE);
        endSession();
        super.onCleared();
    }

    public final void onEvent(AskAgentContract.Event event) {
        event.getClass();
        if (event instanceof AskAgentContract.Event.Retry) {
            handleRetry();
            return;
        }
        if (event instanceof AskAgentContract.Event.SendMessage) {
            handleSendMessage(((AskAgentContract.Event.SendMessage) event).getText());
            return;
        }
        if (event instanceof AskAgentContract.Event.EndChat) {
            handleEndChat();
        } else if (event instanceof AskAgentContract.Event.DismissCustomerCenter) {
            handleDismissCustomerCenter();
        } else {
            c6.p();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$1", f = "AskAgentViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        int label;

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                z1 state = AskAgentViewModel.this.assistantSessionService.getState();
                C00321 c00321 = new C00321(AskAgentViewModel.this);
                this.label = 1;
                Object collect = state.collect(c00321, this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00321<T> implements ir.j {
            final /* synthetic */ AskAgentViewModel this$0;

            public C00321(AskAgentViewModel askAgentViewModel) {
                this.this$0 = askAgentViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AskAgentContract.State emit$lambda$0(AskAgentViewModel askAgentViewModel, AssistantSessionService.SessionState sessionState, AskAgentContract.State state) {
                boolean z6;
                state.getClass();
                AssistantStatus mapSessionStatus = askAgentViewModel.mapSessionStatus(sessionState.getStatus());
                String error = sessionState.getError();
                if (error == null) {
                    error = state.getErrorMessage();
                }
                String str = error;
                if (sessionState.getStatus() == AssistantSessionService.SessionStatus.CONNECTED) {
                    z6 = state.isAssistantTyping();
                } else {
                    z6 = false;
                }
                return AskAgentContract.State.copy$default(state, mapSessionStatus, null, z6, str, false, false, 50, null);
            }

            public final Object emit(final AssistantSessionService.SessionState sessionState, wn.c<? super z> cVar) {
                this.this$0.trackSessionStatusTransition(sessionState);
                if (sessionState.getStatus() == AssistantSessionService.SessionStatus.CONNECTED) {
                    this.this$0.pushInitialContextIfNeeded();
                }
                final AskAgentViewModel askAgentViewModel = this.this$0;
                askAgentViewModel.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.e
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        AskAgentContract.State emit$lambda$0;
                        emit$lambda$0 = AskAgentViewModel.AnonymousClass1.C00321.emit$lambda$0(AskAgentViewModel.this, sessionState, (AskAgentContract.State) obj);
                        return emit$lambda$0;
                    }
                });
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((AssistantSessionService.SessionState) obj, (wn.c<? super z>) cVar);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$3", f = "AskAgentViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements p {
        int label;

        public AnonymousClass3(wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                n1 events = AskAgentViewModel.this.supportToolEvents.getEvents();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AskAgentViewModel.this);
                this.label = 1;
                Object collect = events.collect(anonymousClass1, this);
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
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1<T> implements ir.j {
            final /* synthetic */ AskAgentViewModel this$0;

            public AnonymousClass1(AskAgentViewModel askAgentViewModel) {
                this.this$0 = askAgentViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AskAgentContract.State emit$lambda$0(AskAgentContract.State state) {
                state.getClass();
                return AskAgentContract.State.copy$default(state, null, null, false, null, false, true, 31, null);
            }

            public final Object emit(SupportToolEvents.Event event, wn.c<? super z> cVar) {
                this.this$0.analytics.log(new Analytics.Event.SupportAgentToolCall(event.getToolName()));
                if (event instanceof SupportToolEvents.Event.ShowCustomerCenter) {
                    this.this$0.queueStateUpdate(new f(0));
                    return z.f31622a;
                }
                c6.p();
                return null;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((SupportToolEvents.Event) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}
