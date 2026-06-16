package io.elevenlabs.data.services;

import com.google.firebase.analytics.FirebaseAnalytics;
import fr.g0;
import io.elevenlabs.data.api.CommunityVoicesApi;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.AvailableFilters;
import io.elevenlabs.domain.model.CommunityVoicesPage;
import io.elevenlabs.domain.services.CommunityVoicesService;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J|\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/data/services/CommunityVoicesServiceImpl;", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/data/api/CommunityVoicesApi;", "api", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/data/api/CommunityVoicesApi;)V", "", "page", "pageSize", "", "sort", "accent", "category", "gender", "age", "", "useCases", "language", FirebaseAnalytics.Event.SEARCH, "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/CommunityVoicesPage;", "getCommunityVoices", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/AvailableFilters;", "getFilters", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lio/elevenlabs/data/api/CommunityVoicesApi;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CommunityVoicesServiceImpl implements CommunityVoicesService {
    private final CommunityVoicesApi api;
    private final DispatcherFactory dispatcherFactory;

    public CommunityVoicesServiceImpl(DispatcherFactory dispatcherFactory, CommunityVoicesApi communityVoicesApi) {
        dispatcherFactory.getClass();
        communityVoicesApi.getClass();
        this.dispatcherFactory = dispatcherFactory;
        this.api = communityVoicesApi;
    }

    @Override // io.elevenlabs.domain.services.CommunityVoicesService
    public Object getCommunityVoices(int i10, int i11, String str, String str2, String str3, String str4, String str5, Set<String> set, String str6, String str7, wn.c<? super AsyncCallResult<CommunityVoicesPage>> cVar) {
        return g0.Q(this.dispatcherFactory.getIo(), new CommunityVoicesServiceImpl$getCommunityVoices$2(this, i10, i11, str3, str4, str5, str2, str6, str7, set, str, null), cVar);
    }

    @Override // io.elevenlabs.domain.services.CommunityVoicesService
    public Object getFilters(wn.c<? super AsyncCallResult<AvailableFilters>> cVar) {
        return g0.Q(this.dispatcherFactory.getIo(), new CommunityVoicesServiceImpl$getFilters$2(this, null), cVar);
    }
}
