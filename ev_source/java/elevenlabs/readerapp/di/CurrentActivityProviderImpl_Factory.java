package io.elevenlabs.readerapp.di;

import android.app.Application;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CurrentActivityProviderImpl_Factory implements c {
    private final f applicationProvider;

    private CurrentActivityProviderImpl_Factory(f fVar) {
        this.applicationProvider = fVar;
    }

    public static CurrentActivityProviderImpl_Factory create(f fVar) {
        return new CurrentActivityProviderImpl_Factory(fVar);
    }

    public static CurrentActivityProviderImpl newInstance(Application application) {
        return new CurrentActivityProviderImpl(application);
    }

    @Override // rn.a
    public CurrentActivityProviderImpl get() {
        return newInstance((Application) this.applicationProvider.get());
    }
}
