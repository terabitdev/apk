package io.elevenlabs.data.services;

import io.elevenlabs.data.api.MessagesAPI;
import io.elevenlabs.domain.services.AuthService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RestMessagesService_Factory implements ul.c {
    private final ul.f authServiceProvider;
    private final ul.f messagesAPIProvider;

    private RestMessagesService_Factory(ul.f fVar, ul.f fVar2) {
        this.messagesAPIProvider = fVar;
        this.authServiceProvider = fVar2;
    }

    public static RestMessagesService_Factory create(ul.f fVar, ul.f fVar2) {
        return new RestMessagesService_Factory(fVar, fVar2);
    }

    public static RestMessagesService newInstance(MessagesAPI messagesAPI, AuthService authService) {
        return new RestMessagesService(messagesAPI, authService);
    }

    @Override // rn.a
    public RestMessagesService get() {
        return newInstance((MessagesAPI) this.messagesAPIProvider.get(), (AuthService) this.authServiceProvider.get());
    }
}
