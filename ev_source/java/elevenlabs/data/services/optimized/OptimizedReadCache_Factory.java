package io.elevenlabs.data.services.optimized;

import io.elevenlabs.domain.services.FileService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OptimizedReadCache_Factory implements c {
    private final f fileServiceProvider;

    private OptimizedReadCache_Factory(f fVar) {
        this.fileServiceProvider = fVar;
    }

    public static OptimizedReadCache_Factory create(f fVar) {
        return new OptimizedReadCache_Factory(fVar);
    }

    public static OptimizedReadCache newInstance(FileService fileService) {
        return new OptimizedReadCache(fileService);
    }

    @Override // rn.a
    public OptimizedReadCache get() {
        return newInstance((FileService) this.fileServiceProvider.get());
    }
}
