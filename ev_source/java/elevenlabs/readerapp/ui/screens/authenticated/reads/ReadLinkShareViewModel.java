package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import androidx.lifecycle.c1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "readsService", "Lio/elevenlabs/domain/services/ReadsService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "logger", "Lio/elevenlabs/domain/Logger;", "analytics", "Lio/elevenlabs/domain/Analytics;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;)V", "getLogger", "()Lio/elevenlabs/domain/Logger;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "setRead", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "read", "Lio/elevenlabs/domain/model/ReadMeta;", "shareOption", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;", "dismissed", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadLinkShareViewModel extends MviViewModel<ReadLinkShareState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final Logger logger;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReadLinkShareViewModel(DispatcherFactory dispatcherFactory, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger, Analytics analytics) {
        super(new ReadLinkShareState(false, null, null, null, null, 31, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
        dispatcherFactory.getClass();
        readsService.getClass();
        resolveErrorMessageUseCase.getClass();
        logger.getClass();
        analytics.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.readsService = readsService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.logger = logger;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadLinkShareState dismissed$lambda$0(ReadLinkShareState readLinkShareState) {
        readLinkShareState.getClass();
        return ReadLinkShareState.copy$default(readLinkShareState, false, null, null, null, null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadLinkShareState setRead$lambda$0(ReadLinkShareViewModel readLinkShareViewModel, ReadMeta readMeta, ReadLinkShareOption readLinkShareOption, ReadLinkShareState readLinkShareState) {
        readLinkShareState.getClass();
        if (readLinkShareState.isLoading()) {
            return readLinkShareState;
        }
        fr.g0.D(c1.h(readLinkShareViewModel), readLinkShareViewModel.getDispatcherFactory().getDefault(), null, new ReadLinkShareViewModel$setRead$1$1(readLinkShareViewModel, readMeta, null), 2);
        return ReadLinkShareState.copy$default(readLinkShareState, true, readMeta, null, null, readLinkShareOption, 12, null);
    }

    public final MviViewModel.StateUpdate dismissed() {
        return queueStateUpdate(new e0(17));
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final MviViewModel.StateUpdate setRead(ReadMeta read, ReadLinkShareOption shareOption) {
        read.getClass();
        shareOption.getClass();
        return queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.o(this, read, shareOption, 6));
    }
}
