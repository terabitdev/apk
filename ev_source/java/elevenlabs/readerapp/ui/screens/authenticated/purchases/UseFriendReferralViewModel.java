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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/UseFriendReferralViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/UseFriendReferralState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/ReferralService;", "referralService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Ljl/a;", "Lio/elevenlabs/domain/services/OnboardingService;", "onboardingService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ReferralService;Lio/elevenlabs/domain/services/ToastService;Ljl/a;Ljl/a;)V", "", "code", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setCode", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "load", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", FirebaseAnalytics.Event.SHARE, "dismiss", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/ReferralService;", "Lio/elevenlabs/domain/services/ToastService;", "Ljl/a;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class UseFriendReferralViewModel extends MviViewModel<UseFriendReferralState> {
    public static final int $stable = 8;
    private final jl.a customerService;
    private final jl.a onboardingService;
    private final ReferralService referralService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final ToastService toastService;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UseFriendReferralViewModel(DispatcherFactory dispatcherFactory, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ReferralService referralService, ToastService toastService, jl.a aVar, jl.a aVar2) {
        super(new UseFriendReferralState(false, null, null, false, false, null, null, null, 255, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        resolveErrorMessageUseCase.getClass();
        referralService.getClass();
        toastService.getClass();
        aVar.getClass();
        aVar2.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.referralService = referralService;
        this.toastService = toastService;
        this.onboardingService = aVar;
        this.customerService = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseFriendReferralState dismiss$lambda$0(UseFriendReferralState useFriendReferralState) {
        useFriendReferralState.getClass();
        return UseFriendReferralState.copy$default(useFriendReferralState, false, null, null, false, false, null, null, null, 223, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseFriendReferralState load$lambda$0(UseFriendReferralViewModel useFriendReferralViewModel, UseFriendReferralState useFriendReferralState) {
        useFriendReferralState.getClass();
        if (!useFriendReferralState.isLoading() && useFriendReferralState.getCode() != null) {
            g0.D(c1.h(useFriendReferralViewModel), useFriendReferralViewModel.getDispatcherFactory().getDefault(), null, new UseFriendReferralViewModel$load$1$1(useFriendReferralViewModel, useFriendReferralState, null), 2);
            return UseFriendReferralState.copy$default(useFriendReferralState, true, null, "", false, false, null, null, null, 250, null);
        }
        return useFriendReferralState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseFriendReferralState setCode$lambda$0(UseFriendReferralViewModel useFriendReferralViewModel, String str, UseFriendReferralState useFriendReferralState) {
        useFriendReferralState.getClass();
        useFriendReferralViewModel.load();
        return UseFriendReferralState.copy$default(useFriendReferralState, false, str, null, false, false, null, null, null, 253, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseFriendReferralState share$lambda$0(UseFriendReferralViewModel useFriendReferralViewModel, UseFriendReferralState useFriendReferralState) {
        useFriendReferralState.getClass();
        if (useFriendReferralState.isLoadingLink()) {
            return useFriendReferralState;
        }
        g0.D(c1.h(useFriendReferralViewModel), useFriendReferralViewModel.getDispatcherFactory().getDefault(), null, new UseFriendReferralViewModel$share$1$1(useFriendReferralViewModel, null), 2);
        return UseFriendReferralState.copy$default(useFriendReferralState, false, null, null, false, true, null, null, null, 239, null);
    }

    public final MviViewModel.StateUpdate dismiss() {
        return queueStateUpdate(new k(22));
    }

    public final MviViewModel.StateUpdate load() {
        return queueStateUpdate(new x(this, 1));
    }

    public final MviViewModel.StateUpdate setCode(String code) {
        code.getClass();
        return queueStateUpdate(new f(this, code, 7));
    }

    public final MviViewModel.StateUpdate share() {
        return queueStateUpdate(new x(this, 2));
    }
}
