package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.g0;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\b\b\u0001\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001c¢\u0006\u0004\b&\u0010 J\r\u0010'\u001a\u00020#¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020#¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020#¢\u0006\u0004\b*\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/FavoriteVoicesService;", "favoriteVoicesService", "Ljl/a;", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/ReadsExploreService;", "readsExploreService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/FavoriteVoicesService;Ljl/a;Ljl/a;Ljl/a;Ljl/a;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Ljl/a;Lio/elevenlabs/domain/Analytics;)V", "Lio/elevenlabs/domain/model/AsyncCallResult;", "result", "", "successMessage", "Lsn/z;", "showResultToast", "(Lio/elevenlabs/domain/model/AsyncCallResult;I)V", "actualiseVoice", "()V", "", "voiceId", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setVoiceId", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "logClickedDetails", "toggleVoiceFavorite", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "togglePreview", "retry", "Lio/elevenlabs/domain/services/FavoriteVoicesService;", "Ljl/a;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Analytics;", "Lfr/k1;", "lastPreviewPlayJob", "Lfr/k1;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceDetailsViewModel extends MviViewModel<VoiceDetailsState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final jl.a audioPreviewService;
    private final FavoriteVoicesService favoriteVoicesService;
    private k1 lastPreviewPlayJob;
    private final jl.a readsExploreService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final jl.a stringProvider;
    private final jl.a toastService;
    private final jl.a voicesService;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoiceDetailsViewModel(DispatcherFactory dispatcherFactory, FavoriteVoicesService favoriteVoicesService, jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar5, Analytics analytics) {
        super(new VoiceDetailsState(false, null, null, null, false, false, false, null, 255, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        favoriteVoicesService.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        resolveErrorMessageUseCase.getClass();
        aVar5.getClass();
        analytics.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.favoriteVoicesService = favoriteVoicesService;
        this.voicesService = aVar;
        this.readsExploreService = aVar2;
        this.stringProvider = aVar3;
        this.toastService = aVar4;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.audioPreviewService = aVar5;
        this.analytics = analytics;
        actualiseVoice();
    }

    private final void actualiseVoice() {
        MviViewModel.launch$default(this, null, new VoiceDetailsViewModel$actualiseVoice$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDetailsState retry$lambda$0(VoiceDetailsViewModel voiceDetailsViewModel, VoiceDetailsState voiceDetailsState) {
        voiceDetailsState.getClass();
        String voiceId = voiceDetailsState.getVoiceId();
        if (voiceId != null) {
            voiceDetailsViewModel.setVoiceId(voiceId);
        }
        return VoiceDetailsState.copy$default(voiceDetailsState, false, "", null, null, false, false, false, null, 253, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDetailsState setVoiceId$lambda$0(VoiceDetailsViewModel voiceDetailsViewModel, String str, VoiceDetailsState voiceDetailsState) {
        voiceDetailsState.getClass();
        if (voiceDetailsState.isLoading()) {
            return voiceDetailsState;
        }
        g0.D(c1.h(voiceDetailsViewModel), voiceDetailsViewModel.getDispatcherFactory().getDefault(), null, new VoiceDetailsViewModel$setVoiceId$1$1(voiceDetailsViewModel, str, null), 2);
        return VoiceDetailsState.copy$default(voiceDetailsState, true, "", str, null, false, false, false, null, 248, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showResultToast(AsyncCallResult<?> result, int successMessage) {
        if (result instanceof AsyncCallResult.Error) {
            Object obj = this.toastService.get();
            obj.getClass();
            ToastService.showToast$default((ToastService) obj, ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, (AsyncCallResult.Error) result, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
        } else {
            if (result instanceof AsyncCallResult.Success) {
                Object obj2 = this.toastService.get();
                obj2.getClass();
                ToastService.showToast$default((ToastService) obj2, ((StringProvider) this.stringProvider.get()).getString(successMessage), null, ToastService.ToastVariant.SUCCESS, 2, null);
                return;
            }
            c6.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDetailsState togglePreview$lambda$0(VoiceDetailsViewModel voiceDetailsViewModel, VoiceDetailsState voiceDetailsState) {
        voiceDetailsState.getClass();
        if (voiceDetailsState.getVoice() == null) {
            return voiceDetailsState;
        }
        k1 k1Var = voiceDetailsViewModel.lastPreviewPlayJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        if (!voiceDetailsState.isPlaying()) {
            voiceDetailsViewModel.analytics.log(Analytics.Event.VoicesClickedPlayVoice.INSTANCE);
            voiceDetailsViewModel.lastPreviewPlayJob = g0.D(c1.h(voiceDetailsViewModel), voiceDetailsViewModel.getDispatcherFactory().getDefault(), null, new VoiceDetailsViewModel$togglePreview$1$1(voiceDetailsState, voiceDetailsViewModel, null), 2);
            return VoiceDetailsState.copy$default(voiceDetailsState, false, null, null, null, true, false, false, null, 239, null);
        }
        return VoiceDetailsState.copy$default(voiceDetailsState, false, null, null, null, false, false, false, null, 239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoiceDetailsState toggleVoiceFavorite$lambda$0(VoiceDetailsViewModel voiceDetailsViewModel, VoiceDetailsState voiceDetailsState) {
        voiceDetailsState.getClass();
        if (!voiceDetailsState.isActionLoading() && voiceDetailsState.getVoiceId() != null) {
            g0.D(c1.h(voiceDetailsViewModel), voiceDetailsViewModel.getDispatcherFactory().getDefault(), null, new VoiceDetailsViewModel$toggleVoiceFavorite$1$1(voiceDetailsState, voiceDetailsViewModel, null), 2);
            return VoiceDetailsState.copy$default(voiceDetailsState, false, null, null, null, false, true, false, null, 223, null);
        }
        return voiceDetailsState;
    }

    public final void logClickedDetails() {
        this.analytics.log(Analytics.Event.VoicesClickedVoiceDetail.INSTANCE);
    }

    public final MviViewModel.StateUpdate retry() {
        return queueStateUpdate(new e(this, 2));
    }

    public final MviViewModel.StateUpdate setVoiceId(String voiceId) {
        voiceId.getClass();
        return queueStateUpdate(new p(this, voiceId, 2));
    }

    public final MviViewModel.StateUpdate togglePreview() {
        return queueStateUpdate(new e(this, 3));
    }

    public final MviViewModel.StateUpdate toggleVoiceFavorite() {
        return queueStateUpdate(new e(this, 1));
    }
}
