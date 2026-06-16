package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportContentBrowserSurveyViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportContentBrowserSurveyState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;)V", "Lkotlin/Function0;", "Lsn/z;", "onShowSurvey", "onIKnowClick", "(Lho/a;)V", "onShowMeClick", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportContentBrowserSurveyViewModel extends MviViewModel<ImportContentBrowserSurveyState> {
    public static final int $stable = 8;
    private final Analytics analytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImportContentBrowserSurveyViewModel(DispatcherFactory dispatcherFactory, Analytics analytics, Logger logger) {
        super(new ImportContentBrowserSurveyState(null, 1, 0 == true ? 1 : 0), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        analytics.getClass();
        logger.getClass();
        this.analytics = analytics;
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final void onIKnowClick(ho.a onShowSurvey) {
        onShowSurvey.getClass();
        onShowSurvey.invoke();
    }

    public final void onShowMeClick(ho.a onShowSurvey) {
        onShowSurvey.getClass();
        onShowSurvey.invoke();
    }
}
