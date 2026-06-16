package io.elevenlabs.readerapp.usecase;

import io.elevenlabs.domain.StringProvider;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ResolveErrorMessageUseCaseImpl_Factory implements c {
    private final f stringProvider;

    private ResolveErrorMessageUseCaseImpl_Factory(f fVar) {
        this.stringProvider = fVar;
    }

    public static ResolveErrorMessageUseCaseImpl_Factory create(f fVar) {
        return new ResolveErrorMessageUseCaseImpl_Factory(fVar);
    }

    public static ResolveErrorMessageUseCaseImpl newInstance(StringProvider stringProvider) {
        return new ResolveErrorMessageUseCaseImpl(stringProvider);
    }

    @Override // rn.a
    public ResolveErrorMessageUseCaseImpl get() {
        return newInstance((StringProvider) this.stringProvider.get());
    }
}
