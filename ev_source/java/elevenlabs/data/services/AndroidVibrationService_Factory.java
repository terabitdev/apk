package io.elevenlabs.data.services;

import android.content.Context;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AndroidVibrationService_Factory implements ul.c {
    private final ul.f contextProvider;

    private AndroidVibrationService_Factory(ul.f fVar) {
        this.contextProvider = fVar;
    }

    public static AndroidVibrationService_Factory create(ul.f fVar) {
        return new AndroidVibrationService_Factory(fVar);
    }

    public static AndroidVibrationService newInstance(Context context) {
        return new AndroidVibrationService(context);
    }

    @Override // rn.a
    public AndroidVibrationService get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
