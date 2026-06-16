package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoiceDesignService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import ir.i1;
import ir.r;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001[Ba\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020+H\u0002¢\u0006\u0004\b3\u0010-J\u0017\u00105\u001a\u00020\u001d2\u0006\u00104\u001a\u00020#H\u0002¢\u0006\u0004\b5\u0010&J\u000f\u00106\u001a\u00020+H\u0002¢\u0006\u0004\b6\u0010-J\u000f\u00107\u001a\u00020+H\u0002¢\u0006\u0004\b7\u0010-J\u000f\u00108\u001a\u00020+H\u0002¢\u0006\u0004\b8\u0010-J\u000f\u00109\u001a\u00020\u001dH\u0002¢\u0006\u0004\b9\u0010!J\u000f\u0010:\u001a\u00020\u001dH\u0002¢\u0006\u0004\b:\u0010!J\u000f\u0010;\u001a\u00020\u001dH\u0002¢\u0006\u0004\b;\u0010!J\u000f\u0010<\u001a\u00020+H\u0002¢\u0006\u0004\b<\u0010-J\u000f\u0010=\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010!J\u000f\u0010>\u001a\u00020\u001dH\u0002¢\u0006\u0004\b>\u0010!J\u0017\u0010@\u001a\u00020+2\u0006\u0010?\u001a\u00020#H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u001dH\u0002¢\u0006\u0004\bB\u0010!J\u000f\u0010C\u001a\u00020+H\u0002¢\u0006\u0004\bC\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010FR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010JR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010KR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010LR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010MR\u0014\u0010N\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020T0W8F¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/VoiceDesignService;", "voiceDesignService", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessage", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignAudioStorage;", "voiceDesignAudioStorage", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/VoiceDesignService;Lio/elevenlabs/domain/services/VoicesService;Lio/elevenlabs/domain/services/AudioPreviewService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignAudioStorage;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/services/CustomerService;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "event", "Lsn/z;", "onEvent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;)V", "onCleared", "()V", "resolvePaywallOnGenerate", "", ParameterNames.TEXT, "updateDescription", "(Ljava/lang/String;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignPrompt;", SDPKeywords.PROMPT, "selectPromptPill", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignPrompt;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "generateVoice", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "startGeneration", "", FirebaseAnalytics.Param.INDEX, "updatePreviewIndex", "(I)V", "selectPreview", DiagnosticsEntry.NAME_KEY, "updateVoiceName", "saveVoice", "goBack", "close", "showDiscardDialog", "hideDiscardDialog", "confirmDiscard", "retry", "showTips", "hideTips", "previewId", "playPreview", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "stopPreview", "stopPreviewPlayback", "Lio/elevenlabs/domain/services/VoiceDesignService;", "Lio/elevenlabs/domain/services/VoicesService;", "Lio/elevenlabs/domain/services/AudioPreviewService;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignAudioStorage;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/services/CustomerService;", "sessionId", "Ljava/lang/String;", "Lfr/k1;", "playbackJob", "Lfr/k1;", "Lir/i1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Effect;", "mutableEffectsFlow", "Lir/i1;", "Lir/i;", "getEffectsFlow", "()Lir/i;", "effectsFlow", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceDesignViewModel extends MviViewModel<VoiceDesignContract.State> {

    @Deprecated
    public static final String TAG = "VoiceDesignViewModel";
    private final Analytics analytics;
    private final AudioPreviewService audioPreviewService;
    private final CustomerService customerService;
    private final Logger logger;
    private final i1 mutableEffectsFlow;
    private k1 playbackJob;
    private final ResolveErrorMessageUseCase resolveErrorMessage;
    private final String sessionId;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    private final VoiceDesignAudioStorage voiceDesignAudioStorage;
    private final VoiceDesignService voiceDesignService;
    private final VoicesService voicesService;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceDesignContract.Step.values().length];
            try {
                iArr[VoiceDesignContract.Step.SELECT_PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoiceDesignContract.Step.SAVE_VOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoiceDesignContract.Step.VOICE_PROMPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDesignViewModel(DispatcherFactory dispatcherFactory, VoiceDesignService voiceDesignService, VoicesService voicesService, AudioPreviewService audioPreviewService, Analytics analytics, Logger logger, StringProvider stringProvider, ResolveErrorMessageUseCase resolveErrorMessageUseCase, VoiceDesignAudioStorage voiceDesignAudioStorage, ToastService toastService, CustomerService customerService) {
        super(new VoiceDesignContract.State(null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 16383, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        voiceDesignService.getClass();
        voicesService.getClass();
        audioPreviewService.getClass();
        analytics.getClass();
        logger.getClass();
        stringProvider.getClass();
        resolveErrorMessageUseCase.getClass();
        voiceDesignAudioStorage.getClass();
        toastService.getClass();
        customerService.getClass();
        this.voiceDesignService = voiceDesignService;
        this.voicesService = voicesService;
        this.audioPreviewService = audioPreviewService;
        this.analytics = analytics;
        this.logger = logger;
        this.stringProvider = stringProvider;
        this.resolveErrorMessage = resolveErrorMessageUseCase;
        this.voiceDesignAudioStorage = voiceDesignAudioStorage;
        this.toastService = toastService;
        this.customerService = customerService;
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        this.sessionId = uuid;
        this.mutableEffectsFlow = r.a(0, 1, hr.a.f12537b);
        analytics.log(Analytics.Event.VoiceDesignOpened.INSTANCE);
        resolvePaywallOnGenerate();
    }

    private final MviViewModel.StateUpdate close() {
        return queueStateUpdate(new g(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State close$lambda$0(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state) {
        state.getClass();
        if (state.getHasChanges()) {
            voiceDesignViewModel.showDiscardDialog();
            return state;
        }
        voiceDesignViewModel.analytics.log(Analytics.Event.VoiceDesignClosed.INSTANCE);
        voiceDesignViewModel.stopPreviewPlayback();
        voiceDesignViewModel.mutableEffectsFlow.tryEmit(VoiceDesignContract.Effect.CloseSheet.INSTANCE);
        return state;
    }

    private final void confirmDiscard() {
        this.analytics.log(Analytics.Event.VoiceDesignClosed.INSTANCE);
        stopPreviewPlayback();
        this.voiceDesignAudioStorage.cleanupSessionFiles(this.sessionId);
        this.mutableEffectsFlow.tryEmit(VoiceDesignContract.Effect.CloseSheet.INSTANCE);
    }

    private final MviViewModel.StateUpdate generateVoice() {
        return queueStateUpdate(new g(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State generateVoice$lambda$0(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state) {
        state.getClass();
        voiceDesignViewModel.analytics.log(Analytics.Event.VoiceDesignGenerateTapped.INSTANCE);
        if (!state.isGenerateButtonEnabled()) {
            ToastService.showToast$default(voiceDesignViewModel.toastService, voiceDesignViewModel.stringProvider.getString(R.string.voice_design_prompt_requires_20_chars), null, ToastService.ToastVariant.ERROR, 2, null);
            return state;
        }
        if (state.getShouldShowPaywallOnGenerate()) {
            voiceDesignViewModel.mutableEffectsFlow.tryEmit(VoiceDesignContract.Effect.NavigateToPaywall.INSTANCE);
            return state;
        }
        voiceDesignViewModel.startGeneration();
        return state;
    }

    private final MviViewModel.StateUpdate goBack() {
        return queueStateUpdate(new g(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State goBack$lambda$0(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state) {
        state.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[state.getCurrentStep().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return state;
            }
            voiceDesignViewModel.stopPreviewPlayback();
            return VoiceDesignContract.State.copy$default(state, VoiceDesignContract.Step.SELECT_PREVIEW, null, false, null, null, 0, "", false, null, false, false, null, null, false, 16318, null);
        }
        voiceDesignViewModel.stopPreviewPlayback();
        return VoiceDesignContract.State.copy$default(state, VoiceDesignContract.Step.VOICE_PROMPT, null, false, t.f33547a, "", 0, null, false, null, false, false, null, null, false, 16070, null);
    }

    private final void hideDiscardDialog() {
        queueStateUpdate(new i(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State hideDiscardDialog$lambda$0(VoiceDesignContract.State state) {
        state.getClass();
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 15359, null);
    }

    private final void hideTips() {
        queueStateUpdate(new i(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State hideTips$lambda$0(VoiceDesignContract.State state) {
        state.getClass();
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 15871, null);
    }

    private final MviViewModel.StateUpdate playPreview(String previewId) {
        return queueStateUpdate(new k(this, previewId, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State playPreview$lambda$0(VoiceDesignViewModel voiceDesignViewModel, String str, VoiceDesignContract.State state) {
        Object obj;
        state.getClass();
        voiceDesignViewModel.analytics.log(Analytics.Event.VoiceDesignPreviewPlayTapped.INSTANCE);
        Iterator<T> it = state.getGeneratedPreviews().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m.c(((VoiceDesignContract.PreviewItem) obj).getGeneratedVoiceId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        VoiceDesignContract.PreviewItem previewItem = (VoiceDesignContract.PreviewItem) obj;
        if (previewItem == null) {
            Logger.logWarning$default(voiceDesignViewModel.logger, TAG, defpackage.f.i("Attempted to play preview with unknown ID: ", str), null, 4, null);
            return state;
        }
        k1 k1Var = voiceDesignViewModel.playbackJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        voiceDesignViewModel.playbackJob = MviViewModel.launch$default(voiceDesignViewModel, null, new VoiceDesignViewModel$playPreview$1$1(voiceDesignViewModel, previewItem, str, null), 1, null);
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, str, false, false, null, null, false, 16127, null);
    }

    private final void resolvePaywallOnGenerate() {
        MviViewModel.launch$default(this, null, new VoiceDesignViewModel$resolvePaywallOnGenerate$1(this, null), 1, null);
    }

    private final MviViewModel.StateUpdate retry() {
        return queueStateUpdate(new g(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State retry$lambda$0(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state) {
        state.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[state.getCurrentStep().ordinal()];
        if (i10 != 2) {
            if (i10 == 3) {
                voiceDesignViewModel.generateVoice();
            }
        } else {
            voiceDesignViewModel.saveVoice();
        }
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 14335, null);
    }

    private final MviViewModel.StateUpdate saveVoice() {
        return queueStateUpdate(new g(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State saveVoice$lambda$0(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state) {
        state.getClass();
        voiceDesignViewModel.analytics.log(Analytics.Event.VoiceDesignSaveTapped.INSTANCE);
        VoiceDesignContract.PreviewItem selectedPreview = state.getSelectedPreview();
        if (selectedPreview == null) {
            return state;
        }
        String voiceName = state.getVoiceName();
        String voiceDescription = state.getVoiceDescription();
        voiceDesignViewModel.stopPreviewPlayback();
        MviViewModel.launch$default(voiceDesignViewModel, null, new VoiceDesignViewModel$saveVoice$1$1(voiceDesignViewModel, selectedPreview, voiceName, voiceDescription, null), 1, null);
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, true, null, false, false, null, null, false, 16255, null);
    }

    private final MviViewModel.StateUpdate selectPreview() {
        return queueStateUpdate(new g(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State selectPreview$lambda$0(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state) {
        state.getClass();
        voiceDesignViewModel.stopPreviewPlayback();
        voiceDesignViewModel.analytics.log(new Analytics.Event.VoiceDesignPreviewSelected(state.getSelectedPreviewIndex()));
        return VoiceDesignContract.State.copy$default(state, VoiceDesignContract.Step.SAVE_VOICE, null, false, null, null, 0, null, false, null, false, false, null, null, false, 16382, null);
    }

    private final void selectPromptPill(VoiceDesignPrompt prompt) {
        String string = this.stringProvider.getString(prompt.getPromptTextResId());
        this.analytics.log(new Analytics.Event.VoiceDesignSuggestionTapped(prompt.getId()));
        queueStateUpdate(new k(string, prompt, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State selectPromptPill$lambda$0(String str, VoiceDesignPrompt voiceDesignPrompt, VoiceDesignContract.State state) {
        state.getClass();
        return VoiceDesignContract.State.copy$default(state, null, str, false, null, null, 0, null, false, null, false, false, null, voiceDesignPrompt.getId(), false, 12285, null);
    }

    private final void showDiscardDialog() {
        queueStateUpdate(new i(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State showDiscardDialog$lambda$0(VoiceDesignContract.State state) {
        state.getClass();
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, null, false, true, null, null, false, 15359, null);
    }

    private final void showTips() {
        this.analytics.log(Analytics.Event.VoiceDesignTipsOpened.INSTANCE);
        queueStateUpdate(new i(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State showTips$lambda$0(VoiceDesignContract.State state) {
        state.getClass();
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, null, true, false, null, null, false, 15871, null);
    }

    private final MviViewModel.StateUpdate startGeneration() {
        return queueStateUpdate(new g(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State startGeneration$lambda$0(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state) {
        state.getClass();
        MviViewModel.launch$default(voiceDesignViewModel, null, new VoiceDesignViewModel$startGeneration$1$1(voiceDesignViewModel, state, null), 1, null);
        return VoiceDesignContract.State.copy$default(state, VoiceDesignContract.Step.GENERATING, null, true, null, null, 0, null, false, null, false, false, null, null, false, 14330, null);
    }

    private final void stopPreview() {
        stopPreviewPlayback();
    }

    private final MviViewModel.StateUpdate stopPreviewPlayback() {
        return queueStateUpdate(new g(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State stopPreviewPlayback$lambda$0(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state) {
        state.getClass();
        MviViewModel.launch$default(voiceDesignViewModel, null, new VoiceDesignViewModel$stopPreviewPlayback$1$1(voiceDesignViewModel, null), 1, null);
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 16127, null);
    }

    private final void updateDescription(String text) {
        queueStateUpdate(new h(text, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State updateDescription$lambda$0(String str, VoiceDesignContract.State state) {
        state.getClass();
        return VoiceDesignContract.State.copy$default(state, null, str, false, null, null, 0, null, false, null, false, false, null, null, false, 12285, null);
    }

    private final void updatePreviewIndex(int index) {
        this.analytics.log(Analytics.Event.VoiceDesignPreviewSwiped.INSTANCE);
        queueStateUpdate(new io.elevenlabs.highlighter.t(index, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State updatePreviewIndex$lambda$0(int i10, VoiceDesignContract.State state) {
        state.getClass();
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, i10, null, false, null, false, false, null, null, false, 16351, null);
    }

    private final void updateVoiceName(String name) {
        queueStateUpdate(new h(name, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDesignContract.State updateVoiceName$lambda$0(String str, VoiceDesignContract.State state) {
        state.getClass();
        return VoiceDesignContract.State.copy$default(state, null, null, false, null, null, 0, str, false, null, false, false, null, null, false, 16319, null);
    }

    public final ir.i getEffectsFlow() {
        return new ir.k1(this.mutableEffectsFlow);
    }

    @Override // io.elevenlabs.readerapp.core.MviViewModel, androidx.lifecycle.j1
    public void onCleared() {
        super.onCleared();
        MviViewModel.launch$default(this, null, new VoiceDesignViewModel$onCleared$1(this, null), 1, null);
        this.voiceDesignAudioStorage.cleanupSessionFiles(this.sessionId);
    }

    public final void onEvent(VoiceDesignContract.Event event) {
        event.getClass();
        if (event instanceof VoiceDesignContract.Event.UpdateDescription) {
            updateDescription(((VoiceDesignContract.Event.UpdateDescription) event).getText());
            return;
        }
        if (event instanceof VoiceDesignContract.Event.GenerateVoice) {
            generateVoice();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.SelectPromptPill) {
            selectPromptPill(((VoiceDesignContract.Event.SelectPromptPill) event).getPrompt());
            return;
        }
        if (event instanceof VoiceDesignContract.Event.UpdatePreviewIndex) {
            updatePreviewIndex(((VoiceDesignContract.Event.UpdatePreviewIndex) event).getIndex());
            return;
        }
        if (event instanceof VoiceDesignContract.Event.SelectPreview) {
            selectPreview();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.UpdateVoiceName) {
            updateVoiceName(((VoiceDesignContract.Event.UpdateVoiceName) event).getName());
            return;
        }
        if (event instanceof VoiceDesignContract.Event.SaveVoice) {
            saveVoice();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.GoBack) {
            goBack();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.Close) {
            close();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.ShowDiscardDialog) {
            showDiscardDialog();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.HideDiscardDialog) {
            hideDiscardDialog();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.ConfirmDiscard) {
            confirmDiscard();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.ShowTips) {
            showTips();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.HideTips) {
            hideTips();
            return;
        }
        if (event instanceof VoiceDesignContract.Event.PlayPreview) {
            playPreview(((VoiceDesignContract.Event.PlayPreview) event).getPreviewId());
            return;
        }
        if (event instanceof VoiceDesignContract.Event.StopPreview) {
            stopPreview();
        } else if (event instanceof VoiceDesignContract.Event.Retry) {
            retry();
        } else {
            c6.p();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignViewModel$Companion;", "", "<init>", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
