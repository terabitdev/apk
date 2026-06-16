package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ConsumptionAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ConsumptionApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ConsumptionApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static ConsumptionAPI consumptionApi(s0 s0Var) {
        ConsumptionAPI consumptionApi = NetworkModule.INSTANCE.consumptionApi(s0Var);
        m0.n(consumptionApi);
        return consumptionApi;
    }

    public static NetworkModule_ConsumptionApiFactory create(f fVar) {
        return new NetworkModule_ConsumptionApiFactory(fVar);
    }

    @Override // rn.a
    public ConsumptionAPI get() {
        return consumptionApi((s0) this.retrofitProvider.get());
    }
}
