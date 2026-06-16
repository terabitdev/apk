package io.elevenlabs.data.services;

import io.elevenlabs.data.api.MediaAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class MediaManifestServiceImpl_Factory implements ul.c {
    private final ul.f mediaAPIProvider;

    private MediaManifestServiceImpl_Factory(ul.f fVar) {
        this.mediaAPIProvider = fVar;
    }

    public static MediaManifestServiceImpl_Factory create(ul.f fVar) {
        return new MediaManifestServiceImpl_Factory(fVar);
    }

    public static MediaManifestServiceImpl newInstance(MediaAPI mediaAPI) {
        return new MediaManifestServiceImpl(mediaAPI);
    }

    @Override // rn.a
    public MediaManifestServiceImpl get() {
        return newInstance((MediaAPI) this.mediaAPIProvider.get());
    }
}
