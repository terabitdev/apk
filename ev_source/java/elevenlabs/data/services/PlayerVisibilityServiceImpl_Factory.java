package io.elevenlabs.data.services;

import androidx.lifecycle.b0;
import fr.d0;
import io.elevenlabs.domain.DispatcherFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerVisibilityServiceImpl_Factory implements ul.c {
    private final ul.f coroutineScopeProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f processLifecycleOwnerProvider;

    private PlayerVisibilityServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.coroutineScopeProvider = fVar;
        this.processLifecycleOwnerProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
    }

    public static PlayerVisibilityServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new PlayerVisibilityServiceImpl_Factory(fVar, fVar2, fVar3);
    }

    public static PlayerVisibilityServiceImpl newInstance(d0 d0Var, b0 b0Var, DispatcherFactory dispatcherFactory) {
        return new PlayerVisibilityServiceImpl(d0Var, b0Var, dispatcherFactory);
    }

    @Override // rn.a
    public PlayerVisibilityServiceImpl get() {
        return newInstance((d0) this.coroutineScopeProvider.get(), (b0) this.processLifecycleOwnerProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
