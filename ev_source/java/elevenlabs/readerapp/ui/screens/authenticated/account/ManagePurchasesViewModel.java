package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import androidx.lifecycle.c1;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManagePurchasesViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManagePurchasesState;", "Lio/elevenlabs/domain/services/PurchasesService;", "purchasesService", "Ljl/a;", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Lio/elevenlabs/domain/services/PurchasesService;Ljl/a;Ljl/a;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/DispatcherFactory;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "restorePurchases", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/services/PurchasesService;", "Ljl/a;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ManagePurchasesViewModel extends MviViewModel<ManagePurchasesState> {
    public static final int $stable = 8;
    private final PurchasesService purchasesService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final jl.a stringProvider;
    private final jl.a toastService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagePurchasesViewModel(PurchasesService purchasesService, jl.a aVar, jl.a aVar2, ResolveErrorMessageUseCase resolveErrorMessageUseCase, DispatcherFactory dispatcherFactory) {
        super(new ManagePurchasesState(false, 1, null), dispatcherFactory, null, 4, null);
        purchasesService.getClass();
        aVar.getClass();
        aVar2.getClass();
        resolveErrorMessageUseCase.getClass();
        dispatcherFactory.getClass();
        this.purchasesService = purchasesService;
        this.toastService = aVar;
        this.stringProvider = aVar2;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManagePurchasesState restorePurchases$lambda$0(ManagePurchasesViewModel managePurchasesViewModel, ManagePurchasesState managePurchasesState) {
        managePurchasesState.getClass();
        g0.D(c1.h(managePurchasesViewModel), managePurchasesViewModel.getDispatcherFactory().getDefault(), null, new ManagePurchasesViewModel$restorePurchases$1$1(managePurchasesViewModel, null), 2);
        return managePurchasesState.copy(true);
    }

    public final MviViewModel.StateUpdate restorePurchases() {
        return queueStateUpdate(new h(this, 5));
    }
}
