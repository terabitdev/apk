package io.elevenlabs.payments;

import android.content.Context;
import fr.d0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class InAppPurchasesService_Factory implements c {
    private final f analyticsProvider;
    private final f contextProvider;
    private final f coroutineScopeProvider;
    private final f customerServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f googlePlayServiceProvider;
    private final f loggerProvider;
    private final f purchasesProvider;

    private InAppPurchasesService_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8) {
        this.purchasesProvider = fVar;
        this.customerServiceProvider = fVar2;
        this.googlePlayServiceProvider = fVar3;
        this.analyticsProvider = fVar4;
        this.dispatcherFactoryProvider = fVar5;
        this.loggerProvider = fVar6;
        this.coroutineScopeProvider = fVar7;
        this.contextProvider = fVar8;
    }

    public static InAppPurchasesService_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8) {
        return new InAppPurchasesService_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8);
    }

    public static InAppPurchasesService newInstance(jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, DispatcherFactory dispatcherFactory, Logger logger, d0 d0Var, Context context) {
        return new InAppPurchasesService(aVar, aVar2, aVar3, aVar4, dispatcherFactory, logger, d0Var, context);
    }

    @Override // rn.a
    public InAppPurchasesService get() {
        return newInstance(ul.b.a(this.purchasesProvider), ul.b.a(this.customerServiceProvider), ul.b.a(this.googlePlayServiceProvider), ul.b.a(this.analyticsProvider), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), (d0) this.coroutineScopeProvider.get(), (Context) this.contextProvider.get());
    }
}
