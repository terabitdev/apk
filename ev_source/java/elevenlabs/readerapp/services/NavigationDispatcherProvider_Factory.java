package io.elevenlabs.readerapp.services;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NavigationDispatcherProvider_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final NavigationDispatcherProvider_Factory INSTANCE = new NavigationDispatcherProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static NavigationDispatcherProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NavigationDispatcherProvider newInstance() {
        return new NavigationDispatcherProvider();
    }

    @Override // rn.a
    public NavigationDispatcherProvider get() {
        return newInstance();
    }
}
