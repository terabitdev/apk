package io.elevenlabs.data.services;

import io.elevenlabs.data.api.HomeAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class HomeServiceImpl_Factory implements ul.c {
    private final ul.f homeAPIProvider;

    private HomeServiceImpl_Factory(ul.f fVar) {
        this.homeAPIProvider = fVar;
    }

    public static HomeServiceImpl_Factory create(ul.f fVar) {
        return new HomeServiceImpl_Factory(fVar);
    }

    public static HomeServiceImpl newInstance(HomeAPI homeAPI) {
        return new HomeServiceImpl(homeAPI);
    }

    @Override // rn.a
    public HomeServiceImpl get() {
        return newInstance((HomeAPI) this.homeAPIProvider.get());
    }
}
