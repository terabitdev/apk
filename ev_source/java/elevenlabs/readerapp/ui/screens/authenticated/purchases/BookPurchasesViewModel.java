package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesState;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookPurchasesViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookPurchasesState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "customerService", "Lio/elevenlabs/domain/services/CustomerService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;)V", "load", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookPurchasesViewModel extends MviViewModel<BookPurchasesState> {
    public static final int $stable = 8;
    private final CustomerService customerService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookPurchasesViewModel(DispatcherFactory dispatcherFactory, CustomerService customerService, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        super(BookPurchasesState.Idle.INSTANCE, dispatcherFactory, null, 4, null);
        dispatcherFactory.getClass();
        customerService.getClass();
        resolveErrorMessageUseCase.getClass();
        this.customerService = customerService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookPurchasesState load$lambda$0(BookPurchasesViewModel bookPurchasesViewModel, BookPurchasesState bookPurchasesState) {
        bookPurchasesState.getClass();
        if (bookPurchasesState instanceof BookPurchasesState.Loading) {
            return bookPurchasesState;
        }
        MviViewModel.launch$default(bookPurchasesViewModel, null, new BookPurchasesViewModel$load$1$1(bookPurchasesViewModel, null), 1, null);
        return BookPurchasesState.Loading.INSTANCE;
    }

    public final MviViewModel.StateUpdate load() {
        return queueStateUpdate(new b(this, 1));
    }
}
