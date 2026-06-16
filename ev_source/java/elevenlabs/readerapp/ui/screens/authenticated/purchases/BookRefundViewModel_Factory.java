package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class BookRefundViewModel_Factory implements ul.c {
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private BookRefundViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.customerServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.toastServiceProvider = fVar4;
        this.stringProvider = fVar5;
    }

    public static BookRefundViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new BookRefundViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static BookRefundViewModel newInstance(DispatcherFactory dispatcherFactory, jl.a aVar, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, StringProvider stringProvider) {
        return new BookRefundViewModel(dispatcherFactory, aVar, resolveErrorMessageUseCase, toastService, stringProvider);
    }

    @Override // rn.a
    public BookRefundViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.customerServiceProvider), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ToastService) this.toastServiceProvider.get(), (StringProvider) this.stringProvider.get());
    }
}
