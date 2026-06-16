package io.elevenlabs.di;

import androidx.room.m0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ProvideJsonSerializerFactory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final NetworkModule_ProvideJsonSerializerFactory INSTANCE = new NetworkModule_ProvideJsonSerializerFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkModule_ProvideJsonSerializerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static vr.c provideJsonSerializer() {
        vr.c provideJsonSerializer = NetworkModule.INSTANCE.provideJsonSerializer();
        m0.n(provideJsonSerializer);
        return provideJsonSerializer;
    }

    @Override // rn.a
    public vr.c get() {
        return provideJsonSerializer();
    }
}
