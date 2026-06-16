package io.elevenlabs.data.services;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerSeekMediator_Factory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final PlayerSeekMediator_Factory INSTANCE = new PlayerSeekMediator_Factory();

        private InstanceHolder() {
        }
    }

    public static PlayerSeekMediator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PlayerSeekMediator newInstance() {
        return new PlayerSeekMediator();
    }

    @Override // rn.a
    public PlayerSeekMediator get() {
        return newInstance();
    }
}
