package io.elevenlabs.player.media;

import d8.v;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.MediaManifestService;
import io.elevenlabs.player.media.HlsMediaDataSource;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class HlsMediaDataSource_Factory_Factory implements c {
    private final f configurationProvider;
    private final f loggerProvider;
    private final f mediaManifestServiceProvider;
    private final f simpleCacheProvider;

    private HlsMediaDataSource_Factory_Factory(f fVar, f fVar2, f fVar3, f fVar4) {
        this.loggerProvider = fVar;
        this.mediaManifestServiceProvider = fVar2;
        this.simpleCacheProvider = fVar3;
        this.configurationProvider = fVar4;
    }

    public static HlsMediaDataSource_Factory_Factory create(f fVar, f fVar2, f fVar3, f fVar4) {
        return new HlsMediaDataSource_Factory_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static HlsMediaDataSource.Factory newInstance(Logger logger, MediaManifestService mediaManifestService, v vVar, Configuration configuration) {
        return new HlsMediaDataSource.Factory(logger, mediaManifestService, vVar, configuration);
    }

    @Override // rn.a
    public HlsMediaDataSource.Factory get() {
        return newInstance((Logger) this.loggerProvider.get(), (MediaManifestService) this.mediaManifestServiceProvider.get(), (v) this.simpleCacheProvider.get(), (Configuration) this.configurationProvider.get());
    }
}
