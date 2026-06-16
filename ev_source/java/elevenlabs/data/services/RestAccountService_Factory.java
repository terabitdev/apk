package io.elevenlabs.data.services;

import io.elevenlabs.data.api.AccountAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RestAccountService_Factory implements ul.c {
    private final ul.f accountAPIProvider;

    private RestAccountService_Factory(ul.f fVar) {
        this.accountAPIProvider = fVar;
    }

    public static RestAccountService_Factory create(ul.f fVar) {
        return new RestAccountService_Factory(fVar);
    }

    public static RestAccountService newInstance(AccountAPI accountAPI) {
        return new RestAccountService(accountAPI);
    }

    @Override // rn.a
    public RestAccountService get() {
        return newInstance((AccountAPI) this.accountAPIProvider.get());
    }
}
