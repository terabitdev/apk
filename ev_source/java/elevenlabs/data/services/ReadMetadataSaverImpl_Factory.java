package io.elevenlabs.data.services;

import io.elevenlabs.data.database.entities.reads.ReadsDao;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReadMetadataSaverImpl_Factory implements ul.c {
    private final ul.f readsDaoProvider;

    private ReadMetadataSaverImpl_Factory(ul.f fVar) {
        this.readsDaoProvider = fVar;
    }

    public static ReadMetadataSaverImpl_Factory create(ul.f fVar) {
        return new ReadMetadataSaverImpl_Factory(fVar);
    }

    public static ReadMetadataSaverImpl newInstance(ReadsDao readsDao) {
        return new ReadMetadataSaverImpl(readsDao);
    }

    @Override // rn.a
    public ReadMetadataSaverImpl get() {
        return newInstance((ReadsDao) this.readsDaoProvider.get());
    }
}
