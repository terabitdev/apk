package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import androidx.lifecycle.c1;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/AddSharedReadViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/AddSharedReadState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "readsService", "Lio/elevenlabs/domain/services/ReadsService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;)V", "setOwnerAndRead", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "ownerId", "", "readId", "load", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AddSharedReadViewModel extends MviViewModel<AddSharedReadState> {
    public static final int $stable = 8;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddSharedReadViewModel(DispatcherFactory dispatcherFactory, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        super(new AddSharedReadState(false, null, null, null, null, 31, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
        dispatcherFactory.getClass();
        readsService.getClass();
        resolveErrorMessageUseCase.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.readsService = readsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddSharedReadState load$lambda$0(AddSharedReadViewModel addSharedReadViewModel, AddSharedReadState addSharedReadState) {
        addSharedReadState.getClass();
        if (addSharedReadState.isLoading() || addSharedReadState.getOwnerId() == null || addSharedReadState.getReadId() == null) {
            return addSharedReadState;
        }
        fr.g0.D(c1.h(addSharedReadViewModel), addSharedReadViewModel.getDispatcherFactory().getDefault(), null, new AddSharedReadViewModel$load$1$1(addSharedReadViewModel, addSharedReadState, null), 2);
        return AddSharedReadState.copy$default(addSharedReadState, true, "", null, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddSharedReadState setOwnerAndRead$lambda$0(AddSharedReadViewModel addSharedReadViewModel, String str, String str2, AddSharedReadState addSharedReadState) {
        addSharedReadState.getClass();
        addSharedReadViewModel.load();
        return AddSharedReadState.copy$default(addSharedReadState, false, null, str, str2, null, 19, null);
    }

    public final MviViewModel.StateUpdate load() {
        return queueStateUpdate(new g(this, 1));
    }

    public final MviViewModel.StateUpdate setOwnerAndRead(String ownerId, String readId) {
        ownerId.getClass();
        readId.getClass();
        return queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.o(this, ownerId, readId, 4));
    }
}
