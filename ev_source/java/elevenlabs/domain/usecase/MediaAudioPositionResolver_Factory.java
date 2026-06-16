package io.elevenlabs.domain.usecase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class MediaAudioPositionResolver_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final MediaAudioPositionResolver_Factory INSTANCE = new MediaAudioPositionResolver_Factory();

        private InstanceHolder() {
        }
    }

    public static MediaAudioPositionResolver_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MediaAudioPositionResolver newInstance() {
        return new MediaAudioPositionResolver();
    }

    @Override // rn.a
    public MediaAudioPositionResolver get() {
        return newInstance();
    }
}
