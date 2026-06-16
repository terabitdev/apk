package io.elevenlabs.readerapp.usecase;

import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.ToastService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ShowImportingContentToast_Factory implements c {
    private final f stringProvider;
    private final f toastServiceProvider;

    private ShowImportingContentToast_Factory(f fVar, f fVar2) {
        this.toastServiceProvider = fVar;
        this.stringProvider = fVar2;
    }

    public static ShowImportingContentToast_Factory create(f fVar, f fVar2) {
        return new ShowImportingContentToast_Factory(fVar, fVar2);
    }

    public static ShowImportingContentToast newInstance(ToastService toastService, StringProvider stringProvider) {
        return new ShowImportingContentToast(toastService, stringProvider);
    }

    @Override // rn.a
    public ShowImportingContentToast get() {
        return newInstance((ToastService) this.toastServiceProvider.get(), (StringProvider) this.stringProvider.get());
    }
}
