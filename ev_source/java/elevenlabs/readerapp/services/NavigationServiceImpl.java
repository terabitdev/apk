package io.elevenlabs.readerapp.services;

import com.google.firebase.analytics.FirebaseAnalytics;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.domain.services.NavigationService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import n0.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/readerapp/services/NavigationServiceImpl;", "Lio/elevenlabs/domain/services/NavigationService;", "Lio/elevenlabs/readerapp/services/NavigationDispatcherProvider;", "navigationDispatcherProvider", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/readerapp/services/NavigationDispatcherProvider;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/model/Destination;", FirebaseAnalytics.Param.DESTINATION, "Lsn/z;", "navigate", "(Lio/elevenlabs/domain/model/Destination;)V", "Lio/elevenlabs/readerapp/services/NavigationDispatcherProvider;", "Lio/elevenlabs/domain/Logger;", "Lfr/d0;", "scope", "Lfr/d0;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NavigationServiceImpl implements NavigationService {
    private static final String TAG = "NavigationService";
    private final Logger logger;
    private final NavigationDispatcherProvider navigationDispatcherProvider;
    private final d0 scope;
    public static final int $stable = 8;

    public NavigationServiceImpl(NavigationDispatcherProvider navigationDispatcherProvider, DispatcherFactory dispatcherFactory, Logger logger) {
        navigationDispatcherProvider.getClass();
        dispatcherFactory.getClass();
        logger.getClass();
        this.navigationDispatcherProvider = navigationDispatcherProvider;
        this.logger = logger;
        this.scope = g0.c(l.J(g0.f(), dispatcherFactory.getMain()));
    }

    @Override // io.elevenlabs.domain.services.NavigationService
    public void navigate(Destination destination) {
        destination.getClass();
        g0.D(this.scope, null, null, new NavigationServiceImpl$navigate$1(this, destination, null), 3);
    }
}
