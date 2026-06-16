package io.livekit.android.room.provisions;

import rn.a;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class LKObjects_Factory implements c {
    private final a audioDeviceModuleProvider;
    private final a eglBaseProvider;

    public LKObjects_Factory(a aVar, a aVar2) {
        this.eglBaseProvider = aVar;
        this.audioDeviceModuleProvider = aVar2;
    }

    public static LKObjects_Factory create(a aVar, a aVar2) {
        return new LKObjects_Factory(aVar, aVar2);
    }

    public static LKObjects newInstance(a aVar, a aVar2) {
        return new LKObjects(aVar, aVar2);
    }

    @Override // rn.a
    public LKObjects get() {
        return newInstance(this.eglBaseProvider, this.audioDeviceModuleProvider);
    }
}
