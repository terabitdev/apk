package io.elevenlabs.readerapp.services;

import android.content.Context;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AndroidStringProvider_Factory implements c {
    private final f contextProvider;

    private AndroidStringProvider_Factory(f fVar) {
        this.contextProvider = fVar;
    }

    public static AndroidStringProvider_Factory create(f fVar) {
        return new AndroidStringProvider_Factory(fVar);
    }

    public static AndroidStringProvider newInstance(Context context) {
        return new AndroidStringProvider(context);
    }

    @Override // rn.a
    public AndroidStringProvider get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
