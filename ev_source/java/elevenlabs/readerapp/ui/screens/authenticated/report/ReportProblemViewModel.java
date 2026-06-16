package io.elevenlabs.readerapp.ui.screens.authenticated.report;

import androidx.lifecycle.c1;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/report/ReportProblemViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/report/ReportProblemState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "appConfigService", "Lio/elevenlabs/domain/services/AppConfigService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "logger", "Lio/elevenlabs/domain/Logger;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/AppConfigService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Logger;)V", "load", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "readId", "", "retry", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReportProblemViewModel extends MviViewModel<ReportProblemState> {
    public static final int $stable = 8;
    private final AppConfigService appConfigService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportProblemViewModel(DispatcherFactory dispatcherFactory, AppConfigService appConfigService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger) {
        super(new ReportProblemState(null, null, false, null, 15, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        appConfigService.getClass();
        resolveErrorMessageUseCase.getClass();
        logger.getClass();
        this.appConfigService = appConfigService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReportProblemState load$lambda$0(String str, ReportProblemViewModel reportProblemViewModel, ReportProblemState reportProblemState) {
        reportProblemState.getClass();
        if (reportProblemState.isLoading() || (m.c(reportProblemState.getReadId(), str) && reportProblemState.getReportLinks() != null)) {
            return reportProblemState;
        }
        g0.D(c1.h(reportProblemViewModel), reportProblemViewModel.getDispatcherFactory().getDefault(), null, new ReportProblemViewModel$load$1$1(reportProblemViewModel, str, null), 2);
        return ReportProblemState.copy$default(reportProblemState, str, null, true, "", 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReportProblemState retry$lambda$0(ReportProblemViewModel reportProblemViewModel, ReportProblemState reportProblemState) {
        reportProblemState.getClass();
        reportProblemViewModel.load(reportProblemState.getReadId());
        return reportProblemState;
    }

    public final MviViewModel.StateUpdate load(String readId) {
        return queueStateUpdate(new e(readId, this));
    }

    public final MviViewModel.StateUpdate retry() {
        return queueStateUpdate(new c(this, 1));
    }
}
