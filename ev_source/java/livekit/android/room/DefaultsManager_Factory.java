package io.livekit.android.room;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class DefaultsManager_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final DefaultsManager_Factory INSTANCE = new DefaultsManager_Factory();

        private InstanceHolder() {
        }
    }

    public static DefaultsManager_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultsManager newInstance() {
        return new DefaultsManager();
    }

    @Override // rn.a
    public DefaultsManager get() {
        return newInstance();
    }
}
