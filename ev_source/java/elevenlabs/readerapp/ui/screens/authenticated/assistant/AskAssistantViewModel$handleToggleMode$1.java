package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.AssistantInteractionMode;
import io.elevenlabs.domain.services.AssistantPreferencesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$handleToggleMode$1", f = "AskAssistantViewModel.kt", l = {350, 363}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAssistantViewModel$handleToggleMode$1 extends yn.i implements ho.p {
    final /* synthetic */ AssistantInteractionMode $currentMode;
    final /* synthetic */ boolean $isKeyboardVisible;
    Object L$0;
    int label;
    final /* synthetic */ AskAssistantViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssistantInteractionMode.values().length];
            try {
                iArr[AssistantInteractionMode.VOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssistantInteractionMode.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAssistantViewModel$handleToggleMode$1(AssistantInteractionMode assistantInteractionMode, AskAssistantViewModel askAssistantViewModel, boolean z6, wn.c<? super AskAssistantViewModel$handleToggleMode$1> cVar) {
        super(2, cVar);
        this.$currentMode = assistantInteractionMode;
        this.this$0 = askAssistantViewModel;
        this.$isKeyboardVisible = z6;
    }

    public static final AssistantContract.State invokeSuspend$lambda$1(AssistantInteractionMode assistantInteractionMode, AssistantContract.State state) {
        return AssistantContract.State.copy$default(state, null, null, assistantInteractionMode, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097147, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AskAssistantViewModel$handleToggleMode$1(this.$currentMode, this.this$0, this.$isKeyboardVisible, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AskAssistantViewModel$handleToggleMode$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f4, code lost:
    
        if (fr.g0.m(r4, r7) != r3) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AssistantInteractionMode assistantInteractionMode;
        Analytics analytics;
        Analytics.Event event;
        AssistantInteractionMode assistantInteractionMode2;
        int i10;
        AssistantPreferencesService assistantPreferencesService;
        long j4;
        int i11 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new o(3));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            assistantInteractionMode2 = (AssistantInteractionMode) this.L$0;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            AssistantInteractionMode assistantInteractionMode3 = this.$currentMode;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i12 = iArr[assistantInteractionMode3.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    assistantInteractionMode = AssistantInteractionMode.VOICE;
                } else {
                    c6.p();
                    return null;
                }
            } else {
                assistantInteractionMode = AssistantInteractionMode.TEXT;
            }
            this.this$0.logger.log("AskAssistantViewModel", "Toggling mode to: " + assistantInteractionMode);
            analytics = this.this$0.analytics;
            int i13 = iArr[assistantInteractionMode.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    event = Analytics.Event.AgentOpenTextModeClicked.INSTANCE;
                } else {
                    c6.p();
                    return null;
                }
            } else {
                event = Analytics.Event.AgentOpenVoiceModeClicked.INSTANCE;
            }
            analytics.log(event);
            this.this$0.queueStateUpdate(new o(2));
            if (this.$currentMode == AssistantInteractionMode.TEXT && this.$isKeyboardVisible) {
                this.L$0 = assistantInteractionMode;
                this.label = 1;
                if (g0.m(260L, this) != aVar) {
                    assistantInteractionMode2 = assistantInteractionMode;
                }
                return aVar;
            }
            i10 = WhenMappings.$EnumSwitchMapping$0[assistantInteractionMode.ordinal()];
            if (i10 == 1) {
                if (i10 == 2) {
                    this.this$0.assistantSessionService.setMicMuted(true);
                } else {
                    c6.p();
                    return null;
                }
            } else {
                this.this$0.assistantSessionService.setMicMuted(((AssistantContract.State) this.this$0.getStateFlow().getValue()).isMicMuted());
            }
            assistantPreferencesService = this.this$0.assistantPreferencesService;
            assistantPreferencesService.setLastInteractionMode(assistantInteractionMode);
            this.this$0.queueStateUpdate(new p(assistantInteractionMode, 0));
            if (assistantInteractionMode != AssistantInteractionMode.TEXT) {
                j4 = 450;
            } else {
                j4 = 300;
            }
            this.L$0 = null;
            this.label = 2;
        }
        assistantInteractionMode = assistantInteractionMode2;
        i10 = WhenMappings.$EnumSwitchMapping$0[assistantInteractionMode.ordinal()];
        if (i10 == 1) {
        }
        assistantPreferencesService = this.this$0.assistantPreferencesService;
        assistantPreferencesService.setLastInteractionMode(assistantInteractionMode);
        this.this$0.queueStateUpdate(new p(assistantInteractionMode, 0));
        if (assistantInteractionMode != AssistantInteractionMode.TEXT) {
        }
        this.L$0 = null;
        this.label = 2;
    }
}
