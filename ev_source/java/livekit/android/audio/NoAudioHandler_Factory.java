package io.livekit.android.audio;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class NoAudioHandler_Factory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final NoAudioHandler_Factory INSTANCE = new NoAudioHandler_Factory();

        private InstanceHolder() {
        }
    }

    public static NoAudioHandler_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NoAudioHandler newInstance() {
        return new NoAudioHandler();
    }

    @Override // rn.a
    public NoAudioHandler get() {
        return newInstance();
    }
}
