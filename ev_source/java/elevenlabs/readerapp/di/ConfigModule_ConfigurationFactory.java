package io.elevenlabs.readerapp.di;

import androidx.room.m0;
import io.elevenlabs.domain.Configuration;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ConfigModule_ConfigurationFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final ConfigModule_ConfigurationFactory INSTANCE = new ConfigModule_ConfigurationFactory();

        private InstanceHolder() {
        }
    }

    public static Configuration configuration() {
        Configuration configuration = ConfigModule.INSTANCE.configuration();
        m0.n(configuration);
        return configuration;
    }

    public static ConfigModule_ConfigurationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    @Override // rn.a
    public Configuration get() {
        return configuration();
    }
}
