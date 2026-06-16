package io.elevenlabs.readerapp.services;

import android.content.Context;
import io.elevenlabs.domain.DispatcherFactory;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AndroidClipboardService_Factory implements c {
    private final f contextProvider;
    private final f dispatcherFactoryProvider;

    private AndroidClipboardService_Factory(f fVar, f fVar2) {
        this.contextProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
    }

    public static AndroidClipboardService_Factory create(f fVar, f fVar2) {
        return new AndroidClipboardService_Factory(fVar, fVar2);
    }

    public static AndroidClipboardService newInstance(Context context, DispatcherFactory dispatcherFactory) {
        return new AndroidClipboardService(context, dispatcherFactory);
    }

    @Override // rn.a
    public AndroidClipboardService get() {
        return newInstance((Context) this.contextProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
