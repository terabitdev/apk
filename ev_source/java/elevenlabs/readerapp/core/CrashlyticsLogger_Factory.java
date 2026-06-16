package io.elevenlabs.readerapp.core;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CrashlyticsLogger_Factory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final CrashlyticsLogger_Factory INSTANCE = new CrashlyticsLogger_Factory();

        private InstanceHolder() {
        }
    }

    public static CrashlyticsLogger_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CrashlyticsLogger newInstance() {
        return new CrashlyticsLogger();
    }

    @Override // rn.a
    public CrashlyticsLogger get() {
        return newInstance();
    }
}
