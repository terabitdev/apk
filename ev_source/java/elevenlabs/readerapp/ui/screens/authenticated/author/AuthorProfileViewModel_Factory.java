package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AuthorService;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AuthorProfileViewModel_Factory implements ul.c {
    private final ul.f authorServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f notificationPermissionServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private AuthorProfileViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.dispatcherFactoryProvider = fVar;
        this.authorServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.toastServiceProvider = fVar4;
        this.stringProvider = fVar5;
        this.loggerProvider = fVar6;
        this.notificationPermissionServiceProvider = fVar7;
    }

    public static AuthorProfileViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new AuthorProfileViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static AuthorProfileViewModel newInstance(DispatcherFactory dispatcherFactory, AuthorService authorService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, StringProvider stringProvider, Logger logger, NotificationPermissionService notificationPermissionService) {
        return new AuthorProfileViewModel(dispatcherFactory, authorService, resolveErrorMessageUseCase, toastService, stringProvider, logger, notificationPermissionService);
    }

    @Override // rn.a
    public AuthorProfileViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (AuthorService) this.authorServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ToastService) this.toastServiceProvider.get(), (StringProvider) this.stringProvider.get(), (Logger) this.loggerProvider.get(), (NotificationPermissionService) this.notificationPermissionServiceProvider.get());
    }
}
