package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import androidx.lifecycle.c1;
import com.google.api.Endpoint;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.PlayPronunciationPreviewUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.models.UiAction;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006)"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationsListViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationsListState;", "Lio/elevenlabs/domain/services/PronunciationsService;", "pronunciationsService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/usecase/PlayPronunciationPreviewUseCase;", "playPronunciationPreviewUseCase", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Lio/elevenlabs/domain/services/PronunciationsService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/usecase/PlayPronunciationPreviewUseCase;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/VoicesService;Lio/elevenlabs/domain/DispatcherFactory;)V", "Lsn/z;", "observePronunciations", "()V", "Lio/elevenlabs/domain/model/Pronunciation;", "pronunciation", "onDeletePronunciation", "(Lio/elevenlabs/domain/model/Pronunciation;)V", "onEditPronunciation", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "clearNavigateToEdit", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onPlayPreview", "(Lio/elevenlabs/domain/model/Pronunciation;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/services/PronunciationsService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/usecase/PlayPronunciationPreviewUseCase;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/VoicesService;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PronunciationsListViewModel extends MviViewModel<PronunciationsListState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final Logger logger;
    private final PlayPronunciationPreviewUseCase playPronunciationPreviewUseCase;
    private final PronunciationsService pronunciationsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final ToastService toastService;
    private final VoicesService voicesService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$1", f = "PronunciationsListScreen.kt", l = {Endpoint.TARGET_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$1, reason: invalid class name */
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
                PronunciationsService pronunciationsService = PronunciationsListViewModel.this.pronunciationsService;
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
    public PronunciationsListViewModel(PronunciationsService pronunciationsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, Logger logger, PlayPronunciationPreviewUseCase playPronunciationPreviewUseCase, Analytics analytics, VoicesService voicesService, DispatcherFactory dispatcherFactory) {
        super(new PronunciationsListState(null, false, null, null, null, 31, null), dispatcherFactory, logger);
        pronunciationsService.getClass();
        resolveErrorMessageUseCase.getClass();
        toastService.getClass();
        logger.getClass();
        playPronunciationPreviewUseCase.getClass();
        analytics.getClass();
        voicesService.getClass();
        dispatcherFactory.getClass();
        this.pronunciationsService = pronunciationsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.toastService = toastService;
        this.logger = logger;
        this.playPronunciationPreviewUseCase = playPronunciationPreviewUseCase;
        this.analytics = analytics;
        this.voicesService = voicesService;
        g0.D(c1.h(this), null, null, new AnonymousClass1(null), 3);
        observePronunciations();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PronunciationsListState clearNavigateToEdit$lambda$0(PronunciationsListState pronunciationsListState) {
        pronunciationsListState.getClass();
        return PronunciationsListState.copy$default(pronunciationsListState, null, false, UiAction.Reset.INSTANCE, null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.z] */
    public final void observePronunciations() {
        g0.D(c1.h(this), null, null, new PronunciationsListViewModel$observePronunciations$1(this, new Object(), null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PronunciationsListState onPlayPreview$lambda$0(PronunciationsListViewModel pronunciationsListViewModel, Pronunciation pronunciation, PronunciationsListState pronunciationsListState) {
        pronunciationsListState.getClass();
        PronunciationPreviewState previewState = pronunciationsListState.getPreviewState();
        String previewPlayingPronunciationId = pronunciationsListState.getPreviewPlayingPronunciationId();
        pronunciationsListViewModel.analytics.log(Analytics.Event.PronunciationsListClickedPreview.INSTANCE);
        g0.D(c1.h(pronunciationsListViewModel), null, null, new PronunciationsListViewModel$onPlayPreview$1$1(pronunciationsListViewModel, pronunciation, previewState, previewPlayingPronunciationId, null), 3);
        return pronunciationsListState;
    }

    public final MviViewModel.StateUpdate clearNavigateToEdit() {
        return queueStateUpdate(new m(16));
    }

    public final void onDeletePronunciation(Pronunciation pronunciation) {
        pronunciation.getClass();
        this.analytics.log(Analytics.Event.PronunciationsListClickedDeleteOption.INSTANCE);
        g0.D(c1.h(this), null, null, new PronunciationsListViewModel$onDeletePronunciation$1(this, pronunciation, null), 3);
    }

    public final void onEditPronunciation(Pronunciation pronunciation) {
        pronunciation.getClass();
        this.analytics.log(Analytics.Event.PronunciationsListClickedEditOption.INSTANCE);
        g0.D(c1.h(this), null, null, new PronunciationsListViewModel$onEditPronunciation$1(this, pronunciation, null), 3);
    }

    public final MviViewModel.StateUpdate onPlayPreview(Pronunciation pronunciation) {
        pronunciation.getClass();
        return queueStateUpdate(new r(this, pronunciation, 1));
    }
}
