package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.PlayPronunciationPreviewUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.models.UiAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenMode;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationState;", "pronunciationsService", "Lio/elevenlabs/domain/services/PronunciationsService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "toastService", "Lio/elevenlabs/domain/services/ToastService;", "stringProvider", "Lio/elevenlabs/domain/StringProvider;", "logger", "Lio/elevenlabs/domain/Logger;", "playPronunciationPreviewUseCase", "Lio/elevenlabs/domain/usecase/PlayPronunciationPreviewUseCase;", "analytics", "Lio/elevenlabs/domain/Analytics;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "<init>", "(Lio/elevenlabs/domain/services/PronunciationsService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/usecase/PlayPronunciationPreviewUseCase;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/DispatcherFactory;)V", "initAdd", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "mode", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode$Add;", "initEdit", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode$Edit;", "isOriginalTextTooLong", "", "originalText", "", "onSpokenTextChanged", ParameterNames.TEXT, "onSaveClick", "clearNavigateBackAction", "onPlayPreview", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PronunciationViewModel extends MviViewModel<PronunciationState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final Logger logger;
    private final PlayPronunciationPreviewUseCase playPronunciationPreviewUseCase;
    private final PronunciationsService pronunciationsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private final ToastService toastService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationViewModel$1", f = "PronunciationScreen.kt", l = {111}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
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
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                PronunciationsService pronunciationsService = PronunciationViewModel.this.pronunciationsService;
                this.label = 1;
                Object refreshPronunciations = pronunciationsService.refreshPronunciations(this);
                xn.a aVar = xn.a.f37986a;
                if (refreshPronunciations == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationViewModel(PronunciationsService pronunciationsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, StringProvider stringProvider, Logger logger, PlayPronunciationPreviewUseCase playPronunciationPreviewUseCase, Analytics analytics, DispatcherFactory dispatcherFactory) {
        super(new PronunciationState(null, null, null, null, false, false, null, null, null, 511, null), dispatcherFactory, logger);
        pronunciationsService.getClass();
        resolveErrorMessageUseCase.getClass();
        toastService.getClass();
        stringProvider.getClass();
        logger.getClass();
        playPronunciationPreviewUseCase.getClass();
        analytics.getClass();
        dispatcherFactory.getClass();
        this.pronunciationsService = pronunciationsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.toastService = toastService;
        this.stringProvider = stringProvider;
        this.logger = logger;
        this.playPronunciationPreviewUseCase = playPronunciationPreviewUseCase;
        this.analytics = analytics;
        g0.D(c1.h(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PronunciationState clearNavigateBackAction$lambda$0(PronunciationState pronunciationState) {
        pronunciationState.getClass();
        return PronunciationState.copy$default(pronunciationState, null, null, null, null, false, false, UiAction.Reset.INSTANCE, null, null, 447, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PronunciationState initAdd$lambda$0(PronunciationScreenMode.Add add, PronunciationViewModel pronunciationViewModel, PronunciationState pronunciationState) {
        pronunciationState.getClass();
        return PronunciationState.copy$default(pronunciationState, add, add.getOriginalText(), null, add.getVoiceId(), false, pronunciationViewModel.isOriginalTextTooLong(add.getOriginalText()), null, null, null, 468, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PronunciationState initEdit$lambda$0(PronunciationScreenMode.Edit edit, PronunciationViewModel pronunciationViewModel, PronunciationState pronunciationState) {
        pronunciationState.getClass();
        return PronunciationState.copy$default(pronunciationState, edit, edit.getOriginalText(), edit.getSpokenText(), edit.getVoiceId(), false, pronunciationViewModel.isOriginalTextTooLong(edit.getOriginalText()), null, edit.getPronunciationId(), null, 336, null);
    }

    private final boolean isOriginalTextTooLong(String originalText) {
        if (wq.n.z0(originalText, new String[]{Separators.SP}, 6).size() > 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PronunciationState onPlayPreview$lambda$0(PronunciationViewModel pronunciationViewModel, PronunciationState pronunciationState) {
        pronunciationState.getClass();
        String spokenText = pronunciationState.getSpokenText();
        PronunciationPreviewState previewState = pronunciationState.getPreviewState();
        String voiceId = pronunciationState.getVoiceId();
        pronunciationViewModel.analytics.log(Analytics.Event.PronunciationClickedPreview.INSTANCE);
        g0.D(c1.h(pronunciationViewModel), null, null, new PronunciationViewModel$onPlayPreview$1$1(pronunciationViewModel, spokenText, voiceId, previewState, null), 3);
        return pronunciationState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PronunciationState onSaveClick$lambda$0(PronunciationViewModel pronunciationViewModel, PronunciationState pronunciationState) {
        pronunciationState.getClass();
        if (wq.n.m0(pronunciationState.getSpokenText())) {
            return pronunciationState;
        }
        pronunciationViewModel.analytics.log(new Analytics.Event.PronunciationClickedSave(wq.n.z0(pronunciationState.getOriginalText(), new String[]{Separators.SP}, 6).size()));
        g0.D(c1.h(pronunciationViewModel), null, null, new PronunciationViewModel$onSaveClick$1$1(pronunciationState, pronunciationViewModel, null), 3);
        return PronunciationState.copy$default(pronunciationState, null, null, null, null, true, false, null, null, null, 495, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PronunciationState onSpokenTextChanged$lambda$0(String str, PronunciationState pronunciationState) {
        pronunciationState.getClass();
        return PronunciationState.copy$default(pronunciationState, null, null, str, null, false, false, null, null, null, 507, null);
    }

    public final MviViewModel.StateUpdate clearNavigateBackAction() {
        return queueStateUpdate(new m(14));
    }

    public final MviViewModel.StateUpdate initAdd(PronunciationScreenMode.Add mode) {
        mode.getClass();
        return queueStateUpdate(new q(mode, this, 4));
    }

    public final MviViewModel.StateUpdate initEdit(PronunciationScreenMode.Edit mode) {
        mode.getClass();
        return queueStateUpdate(new q(mode, this, 3));
    }

    public final MviViewModel.StateUpdate onPlayPreview() {
        return queueStateUpdate(new k(this, 3));
    }

    public final MviViewModel.StateUpdate onSaveClick() {
        return queueStateUpdate(new k(this, 2));
    }

    public final MviViewModel.StateUpdate onSpokenTextChanged(String text) {
        text.getClass();
        return queueStateUpdate(new l(text, 5));
    }
}
