package io.elevenlabs.readerapp.di;

import androidx.room.m0;
import io.elevenlabs.domain.services.player.PlayerConfiguration;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ConfigModule_PlayerConfigurationFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final ConfigModule_PlayerConfigurationFactory INSTANCE = new ConfigModule_PlayerConfigurationFactory();

        private InstanceHolder() {
        }
    }

    public static ConfigModule_PlayerConfigurationFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PlayerConfiguration playerConfiguration() {
        PlayerConfiguration playerConfiguration = ConfigModule.INSTANCE.playerConfiguration();
        m0.n(playerConfiguration);
        return playerConfiguration;
    }

    @Override // rn.a
    public PlayerConfiguration get() {
        return playerConfiguration();
    }
}
