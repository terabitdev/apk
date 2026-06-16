package io.elevenlabs.data.services;

import io.elevenlabs.data.api.CommunityVoicesApi;
import io.elevenlabs.domain.DispatcherFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CommunityVoicesServiceImpl_Factory implements ul.c {
    private final ul.f apiProvider;
    private final ul.f dispatcherFactoryProvider;

    private CommunityVoicesServiceImpl_Factory(ul.f fVar, ul.f fVar2) {
        this.dispatcherFactoryProvider = fVar;
        this.apiProvider = fVar2;
    }

    public static CommunityVoicesServiceImpl_Factory create(ul.f fVar, ul.f fVar2) {
        return new CommunityVoicesServiceImpl_Factory(fVar, fVar2);
    }

    public static CommunityVoicesServiceImpl newInstance(DispatcherFactory dispatcherFactory, CommunityVoicesApi communityVoicesApi) {
        return new CommunityVoicesServiceImpl(dispatcherFactory, communityVoicesApi);
    }

    @Override // rn.a
    public CommunityVoicesServiceImpl get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (CommunityVoicesApi) this.apiProvider.get());
    }
}
