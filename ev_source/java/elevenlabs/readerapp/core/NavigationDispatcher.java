package io.elevenlabs.readerapp.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.model.Destination;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/core/NavigationDispatcher;", "", "Lio/elevenlabs/domain/model/Destination;", FirebaseAnalytics.Param.DESTINATION, "Lsn/z;", "requestNavigation", "(Lio/elevenlabs/domain/model/Destination;Lwn/c;)Ljava/lang/Object;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface NavigationDispatcher {
    Object requestNavigation(Destination destination, wn.c<? super z> cVar);
}
