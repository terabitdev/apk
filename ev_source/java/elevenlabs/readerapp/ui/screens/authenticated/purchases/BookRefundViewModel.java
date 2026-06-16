package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.BookRefundReason;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006!"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookRefundViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/BookRefundState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;)V", "", "readId", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setReadId", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/BookRefundReason;", "reason", "selectReason", "(Lio/elevenlabs/domain/model/BookRefundReason;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "reasonText", "setInputReasonText", "proceed", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Ljl/a;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/StringProvider;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookRefundViewModel extends MviViewModel<BookRefundState> {
    public static final int $stable = 8;
    private final jl.a customerService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private final ToastService toastService;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BookRefundViewModel(DispatcherFactory dispatcherFactory, jl.a aVar, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, StringProvider stringProvider) {
        super(new BookRefundState(null, false, null, null, false, 31, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        aVar.getClass();
        resolveErrorMessageUseCase.getClass();
        toastService.getClass();
        stringProvider.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.customerService = aVar;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.toastService = toastService;
        this.stringProvider = stringProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookRefundState proceed$lambda$0(BookRefundViewModel bookRefundViewModel, BookRefundState bookRefundState) {
        bookRefundState.getClass();
        if (bookRefundState.isLoading() || bookRefundState.getReadId() == null || bookRefundState.getRefundReason() == null) {
            return bookRefundState;
        }
        MviViewModel.launch$default(bookRefundViewModel, null, new BookRefundViewModel$proceed$1$1(bookRefundViewModel, bookRefundState, null), 1, null);
        return BookRefundState.copy$default(bookRefundState, null, true, null, null, false, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookRefundState selectReason$lambda$0(BookRefundReason bookRefundReason, BookRefundState bookRefundState) {
        bookRefundState.getClass();
        return BookRefundState.copy$default(bookRefundState, null, false, bookRefundReason, null, false, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookRefundState setInputReasonText$lambda$0(String str, BookRefundState bookRefundState) {
        bookRefundState.getClass();
        return BookRefundState.copy$default(bookRefundState, null, false, null, str, false, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookRefundState setReadId$lambda$0(String str, BookRefundState bookRefundState) {
        bookRefundState.getClass();
        return BookRefundState.copy$default(bookRefundState, str, false, null, null, false, 30, null);
    }

    public final MviViewModel.StateUpdate proceed() {
        return queueStateUpdate(new j(this, 1));
    }

    public final MviViewModel.StateUpdate selectReason(BookRefundReason reason) {
        reason.getClass();
        return queueStateUpdate(new r(reason, 1));
    }

    public final MviViewModel.StateUpdate setInputReasonText(String reasonText) {
        reasonText.getClass();
        return queueStateUpdate(new p(reasonText, 2));
    }

    public final MviViewModel.StateUpdate setReadId(String readId) {
        readId.getClass();
        return queueStateUpdate(new p(readId, 3));
    }
}
