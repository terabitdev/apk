package io.elevenlabs.data.services;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AndroidLocaleService_Factory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final AndroidLocaleService_Factory INSTANCE = new AndroidLocaleService_Factory();

        private InstanceHolder() {
        }
    }

    public static AndroidLocaleService_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AndroidLocaleService newInstance() {
        return new AndroidLocaleService();
    }

    @Override // rn.a
    public AndroidLocaleService get() {
        return newInstance();
    }
}
