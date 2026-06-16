package io.elevenlabs.readerapp.services;

import android.content.Context;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.LocaleService;
import io.elevenlabs.domain.services.ReadsService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AgentContextServiceImpl_Factory implements c {
    private final f authServiceProvider;
    private final f configurationProvider;
    private final f contextProvider;
    private final f customerServiceProvider;
    private final f localeServiceProvider;
    private final f loggerProvider;
    private final f readsServiceProvider;

    private AgentContextServiceImpl_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7) {
        this.authServiceProvider = fVar;
        this.customerServiceProvider = fVar2;
        this.localeServiceProvider = fVar3;
        this.configurationProvider = fVar4;
        this.readsServiceProvider = fVar5;
        this.contextProvider = fVar6;
        this.loggerProvider = fVar7;
    }

    public static AgentContextServiceImpl_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7) {
        return new AgentContextServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static AgentContextServiceImpl newInstance(AuthService authService, CustomerService customerService, LocaleService localeService, Configuration configuration, ReadsService readsService, Context context, Logger logger) {
        return new AgentContextServiceImpl(authService, customerService, localeService, configuration, readsService, context, logger);
    }

    @Override // rn.a
    public AgentContextServiceImpl get() {
        return newInstance((AuthService) this.authServiceProvider.get(), (CustomerService) this.customerServiceProvider.get(), (LocaleService) this.localeServiceProvider.get(), (Configuration) this.configurationProvider.get(), (ReadsService) this.readsServiceProvider.get(), (Context) this.contextProvider.get(), (Logger) this.loggerProvider.get());
    }
}
