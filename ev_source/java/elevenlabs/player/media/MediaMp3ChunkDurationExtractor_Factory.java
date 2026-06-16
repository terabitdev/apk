package io.elevenlabs.player.media;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class MediaMp3ChunkDurationExtractor_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final MediaMp3ChunkDurationExtractor_Factory INSTANCE = new MediaMp3ChunkDurationExtractor_Factory();

        private InstanceHolder() {
        }
    }

    public static MediaMp3ChunkDurationExtractor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MediaMp3ChunkDurationExtractor newInstance() {
        return new MediaMp3ChunkDurationExtractor();
    }

    @Override // rn.a
    public MediaMp3ChunkDurationExtractor get() {
        return newInstance();
    }
}
