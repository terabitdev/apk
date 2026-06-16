package io.elevenlabs.player.di;

import androidx.room.m0;
import g8.h;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerServiceModule_ProvideDefaultLoadControlFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final PlayerServiceModule_ProvideDefaultLoadControlFactory INSTANCE = new PlayerServiceModule_ProvideDefaultLoadControlFactory();

        private InstanceHolder() {
        }
    }

    public static PlayerServiceModule_ProvideDefaultLoadControlFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static h provideDefaultLoadControl() {
        h provideDefaultLoadControl = PlayerServiceModule.INSTANCE.provideDefaultLoadControl();
        m0.n(provideDefaultLoadControl);
        return provideDefaultLoadControl;
    }

    @Override // rn.a
    public h get() {
        return provideDefaultLoadControl();
    }
}
