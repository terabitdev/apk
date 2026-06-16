package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import androidx.lifecycle.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReferralService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/ReferFriendViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/ReferFriendState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "toastService", "Lio/elevenlabs/domain/services/ToastService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "referralService", "Lio/elevenlabs/domain/services/ReferralService;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ReferralService;)V", FirebaseAnalytics.Event.SHARE, "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "dismiss", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReferFriendViewModel extends MviViewModel<ReferFriendState> {
    public static final int $stable = 8;
    private final ReferralService referralService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final ToastService toastService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferFriendViewModel(DispatcherFactory dispatcherFactory, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ReferralService referralService) {
        super(new ReferFriendState(false, null, 3, null), dispatcherFactory, null, 4, null);
        dispatcherFactory.getClass();
        toastService.getClass();
        resolveErrorMessageUseCase.getClass();
        referralService.getClass();
        this.toastService = toastService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.referralService = referralService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReferFriendState dismiss$lambda$0(ReferFriendState referFriendState) {
        referFriendState.getClass();
        return ReferFriendState.copy$default(referFriendState, false, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReferFriendState share$lambda$0(ReferFriendViewModel referFriendViewModel, ReferFriendState referFriendState) {
        referFriendState.getClass();
        if (referFriendState.isLoadingLink()) {
            return referFriendState;
        }
        g0.D(c1.h(referFriendViewModel), referFriendViewModel.getDispatcherFactory().getDefault(), null, new ReferFriendViewModel$share$1$1(referFriendViewModel, null), 2);
        return ReferFriendState.copy$default(referFriendState, true, null, 2, null);
    }

    public final MviViewModel.StateUpdate dismiss() {
        return queueStateUpdate(new k(17));
    }

    public final MviViewModel.StateUpdate share() {
        return queueStateUpdate(new v(this, 1));
    }
}
