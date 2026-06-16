package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AccountService;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AccountViewModel_Factory implements ul.c {
    private final ul.f accountServiceProvider;
    private final ul.f analyticsProvider;
    private final ul.f appConfigServiceProvider;
    private final ul.f authServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f offlineReadsServiceProvider;
    private final ul.f passwordResetServiceProvider;
    private final ul.f purchasesServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private AccountViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12) {
        this.authServiceProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
        this.passwordResetServiceProvider = fVar3;
        this.toastServiceProvider = fVar4;
        this.stringProvider = fVar5;
        this.loggerProvider = fVar6;
        this.analyticsProvider = fVar7;
        this.resolveErrorMessageUseCaseProvider = fVar8;
        this.appConfigServiceProvider = fVar9;
        this.accountServiceProvider = fVar10;
        this.offlineReadsServiceProvider = fVar11;
        this.purchasesServiceProvider = fVar12;
    }

    public static AccountViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12) {
        return new AccountViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    public static AccountViewModel newInstance(jl.a aVar, DispatcherFactory dispatcherFactory, jl.a aVar2, jl.a aVar3, jl.a aVar4, Logger logger, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase, AppConfigService appConfigService, AccountService accountService, OfflineReadsService offlineReadsService, PurchasesService purchasesService) {
        return new AccountViewModel(aVar, dispatcherFactory, aVar2, aVar3, aVar4, logger, analytics, resolveErrorMessageUseCase, appConfigService, accountService, offlineReadsService, purchasesService);
    }

    @Override // rn.a
    public AccountViewModel get() {
        return newInstance(ul.b.a(this.authServiceProvider), (DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.passwordResetServiceProvider), ul.b.a(this.toastServiceProvider), ul.b.a(this.stringProvider), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (AppConfigService) this.appConfigServiceProvider.get(), (AccountService) this.accountServiceProvider.get(), (OfflineReadsService) this.offlineReadsServiceProvider.get(), (PurchasesService) this.purchasesServiceProvider.get());
    }
}
