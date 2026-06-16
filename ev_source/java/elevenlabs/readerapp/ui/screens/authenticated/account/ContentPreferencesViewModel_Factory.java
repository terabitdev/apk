package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.AssistantPreferencesService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ContentPreferencesViewModel_Factory implements ul.c {
    private final ul.f assistantPreferencesServiceProvider;
    private final ul.f dispatcherFactoryProvider;

    private ContentPreferencesViewModel_Factory(ul.f fVar, ul.f fVar2) {
        this.assistantPreferencesServiceProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
    }

    public static ContentPreferencesViewModel_Factory create(ul.f fVar, ul.f fVar2) {
        return new ContentPreferencesViewModel_Factory(fVar, fVar2);
    }

    public static ContentPreferencesViewModel newInstance(AssistantPreferencesService assistantPreferencesService, DispatcherFactory dispatcherFactory) {
        return new ContentPreferencesViewModel(assistantPreferencesService, dispatcherFactory);
    }

    @Override // rn.a
    public ContentPreferencesViewModel get() {
        return newInstance((AssistantPreferencesService) this.assistantPreferencesServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
