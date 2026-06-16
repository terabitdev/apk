package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import androidx.lifecycle.c1;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareOptionsViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareOptionsState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "readsService", "Lio/elevenlabs/domain/services/ReadsService;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsService;)V", "setReadId", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "readId", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadShareOptionsViewModel extends MviViewModel<ReadShareOptionsState> {
    public static final int $stable = 8;
    private final ReadsService readsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReadShareOptionsViewModel(DispatcherFactory dispatcherFactory, ReadsService readsService) {
        super(new ReadShareOptionsState(null, 1, 0 == true ? 1 : 0), dispatcherFactory, null, 4, null);
        dispatcherFactory.getClass();
        readsService.getClass();
        this.readsService = readsService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadShareOptionsState setReadId$lambda$0(String str, ReadShareOptionsViewModel readShareOptionsViewModel, ReadShareOptionsState readShareOptionsState) {
        readShareOptionsState.getClass();
        if (str == null) {
            return readShareOptionsState;
        }
        fr.g0.D(c1.h(readShareOptionsViewModel), readShareOptionsViewModel.getDispatcherFactory().getDefault(), null, new ReadShareOptionsViewModel$setReadId$1$1(readShareOptionsViewModel, str, null), 2);
        return readShareOptionsState;
    }

    public final MviViewModel.StateUpdate setReadId(String readId) {
        return queueStateUpdate(new h(readId, this, 11));
    }
}
