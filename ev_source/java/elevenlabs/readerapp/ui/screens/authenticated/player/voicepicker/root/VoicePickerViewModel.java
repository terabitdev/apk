package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.d1;
import ir.i1;
import ir.k1;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002NMB[\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!0 H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u001b2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u001b2\u0006\u00101\u001a\u000204¢\u0006\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010=R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010>R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020D0 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010%R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020A0 8F¢\u0006\u0006\u001a\u0004\bG\u0010%R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020#0I8F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$State;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "sharedRepository", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "mode", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;Lio/elevenlabs/domain/services/VoicesService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/ConnectivityService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;)V", "", "voiceId", "Lsn/z;", "handleVoiceCreated", "(Ljava/lang/String;)V", "handleInitialise", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;)V", "Lir/i;", "Lsn/k;", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "observeInitData", "()Lir/i;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;", "tab", "handleSelectTab", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;)V", "handleSave", "()V", "sharedState", "newVoiceId", "logVoiceChangerSwap", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Ljava/lang/String;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "event", "onSharedEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "Lio/elevenlabs/domain/services/VoicesService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/ConnectivityService;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$ControlEvent;", "mutableControlEventsFlow", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "getNavigationFlow", "navigationFlow", "getControlEventsFlow", "controlEventsFlow", "Lir/z1;", "getSharedStateFlow", "()Lir/z1;", "sharedStateFlow", "Companion", "Factory", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerViewModel extends MviViewModel<VoicePickerContract.State> {
    private static final String TAG = "VoicePickerViewModel";
    private final Analytics analytics;
    private final ConnectivityService connectivityService;
    private final Logger logger;
    private final VoicePickerMode mode;
    private final i1 mutableControlEventsFlow;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final VoicePickerSharedRepository sharedRepository;
    private final ToastService toastService;
    private final VoicesService voicesService;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerViewModel$Factory;", "", "create", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerViewModel;", "mode", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        VoicePickerViewModel create(VoicePickerMode mode);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoicePickerViewModel(DispatcherFactory dispatcherFactory, VoicePickerSharedRepository voicePickerSharedRepository, VoicesService voicesService, ReadsService readsService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics, ConnectivityService connectivityService, Logger logger, VoicePickerMode voicePickerMode) {
        super(new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Explore), null, false, 6, r5), dispatcherFactory, r3, 4, r5);
        dispatcherFactory.getClass();
        voicePickerSharedRepository.getClass();
        voicesService.getClass();
        readsService.getClass();
        toastService.getClass();
        resolveErrorMessageUseCase.getClass();
        analytics.getClass();
        connectivityService.getClass();
        logger.getClass();
        voicePickerMode.getClass();
        kotlin.jvm.internal.f fVar = null;
        Logger logger2 = null;
        this.sharedRepository = voicePickerSharedRepository;
        this.voicesService = voicesService;
        this.readsService = readsService;
        this.toastService = toastService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.analytics = analytics;
        this.connectivityService = connectivityService;
        this.logger = logger;
        this.mode = voicePickerMode;
        this.mutableControlEventsFlow = r.a(0, 1, hr.a.f12537b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ir.i getNavigationFlow() {
        return this.sharedRepository.getNavigationFlow();
    }

    private final void handleInitialise(VoicePickerMode mode) {
        this.sharedRepository.onEvent(new VoicePickerSharedContract.Event.Initialise(mode));
        MviViewModel.launch$default(this, null, new VoicePickerViewModel$handleInitialise$1(this, null), 1, null);
        MviViewModel.launch$default(this, null, new VoicePickerViewModel$handleInitialise$2(this, null), 1, null);
    }

    private final void handleSave() {
        MviViewModel.launch$default(this, null, new VoicePickerViewModel$handleSave$1(this, null), 1, null);
    }

    private final void handleSelectTab(VoicePickerTab tab) {
        queueStateUpdate(new io.elevenlabs.data.database.entities.reads.h(this, tab, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicePickerContract.State handleSelectTab$lambda$0(VoicePickerViewModel voicePickerViewModel, VoicePickerTab voicePickerTab, VoicePickerContract.State state) {
        VoicePickerContract.TabsState copy$default;
        state.getClass();
        VoicePickerContract.TabsState tabs = state.getTabs();
        if (tabs instanceof VoicePickerContract.TabsState.Hidden) {
            Logger.logWarning$default(voicePickerViewModel.logger, TAG, "SelectTab event received while tabs are hidden", null, 4, null);
            copy$default = state.getTabs();
        } else if (tabs instanceof VoicePickerContract.TabsState.Visible) {
            copy$default = VoicePickerContract.TabsState.Visible.copy$default((VoicePickerContract.TabsState.Visible) state.getTabs(), voicePickerTab, null, 2, null);
        } else {
            c6.p();
            return null;
        }
        return VoicePickerContract.State.copy$default(state, copy$default, null, false, 6, null);
    }

    private final void handleVoiceCreated(String voiceId) {
        handleSelectTab(VoicePickerTab.Created);
        this.sharedRepository.onEvent(new VoicePickerSharedContract.Event.SetSelectedVoiceId(voiceId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logVoiceChangerSwap(VoicePickerSharedContract.State sharedState, String newVoiceId) {
        VoicePickerSharedContract.ReadMetaState.Present present;
        ReadMeta value;
        String str;
        VoicePickerSharedContract.ReadMetaState readMeta = sharedState.getReadMeta();
        String str2 = null;
        if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Present) {
            present = (VoicePickerSharedContract.ReadMetaState.Present) readMeta;
        } else {
            present = null;
        }
        if (present != null && (value = present.getValue()) != null && sharedState.isVoiceChangerEnabled() && ReadMetaKt.getSupportsVoiceChanger(value)) {
            String fallbackVoiceId = sharedState.getFallbackVoiceId();
            if (fallbackVoiceId != null && !fallbackVoiceId.equals(EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
                str = "tts";
            } else {
                str = "media";
            }
            if (kotlin.jvm.internal.m.c(newVoiceId, EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
                if (fallbackVoiceId != null && !fallbackVoiceId.equals(EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
                    this.analytics.log(new Analytics.Event.VoiceChangerOriginalAudioRestored(value.getReadId(), fallbackVoiceId));
                    return;
                }
                return;
            }
            Analytics analytics = this.analytics;
            String readId = value.getReadId();
            if (!kotlin.jvm.internal.m.c(fallbackVoiceId, EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
                str2 = fallbackVoiceId;
            }
            analytics.log(new Analytics.Event.VoiceChangerVoiceSelected(readId, newVoiceId, str2, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ir.i observeInitData() {
        return new d1(this.connectivityService.getIsConnected(), this.sharedRepository.getStateFlow(), VoicePickerViewModel$observeInitData$3.INSTANCE, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object observeInitData$lambda$0(boolean z6, VoicePickerSharedContract.State state, wn.c cVar) {
        return new sn.k(Boolean.valueOf(z6), state);
    }

    public final ir.i getControlEventsFlow() {
        return new k1(this.mutableControlEventsFlow);
    }

    public final z1 getSharedStateFlow() {
        return this.sharedRepository.getStateFlow();
    }

    public final void onEvent(VoicePickerContract.Event event) {
        event.getClass();
        if (event instanceof VoicePickerContract.Event.Initialize) {
            handleInitialise(((VoicePickerContract.Event.Initialize) event).getMode());
            return;
        }
        if (event instanceof VoicePickerContract.Event.SelectTab) {
            handleSelectTab(((VoicePickerContract.Event.SelectTab) event).getTab());
            return;
        }
        if (event instanceof VoicePickerContract.Event.Reset) {
            this.sharedRepository.onEvent(VoicePickerSharedContract.Event.ResetSelectedVoice.INSTANCE);
            onEvent(VoicePickerContract.Event.Close.INSTANCE);
            return;
        }
        if (event instanceof VoicePickerContract.Event.Save) {
            handleSave();
            return;
        }
        if (event instanceof VoicePickerContract.Event.Close) {
            onSharedEvent(VoicePickerSharedContract.Event.ResetBeforeClosing.INSTANCE);
            this.mutableControlEventsFlow.tryEmit(VoicePickerContract.ControlEvent.CloseScreen.INSTANCE);
        } else if (event instanceof VoicePickerContract.Event.VoiceCreated) {
            handleVoiceCreated(((VoicePickerContract.Event.VoiceCreated) event).getVoiceId());
        } else {
            c6.p();
        }
    }

    public final void onSharedEvent(VoicePickerSharedContract.Event event) {
        event.getClass();
        this.sharedRepository.onEvent(event);
    }
}
