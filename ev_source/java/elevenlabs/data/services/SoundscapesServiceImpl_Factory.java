package io.elevenlabs.data.services;

import io.elevenlabs.data.api.SoundscapesAPI;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class SoundscapesServiceImpl_Factory implements ul.c {
    private final ul.f loggerProvider;
    private final ul.f soundscapeDownloaderProvider;
    private final ul.f soundscapesAPIProvider;

    private SoundscapesServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.soundscapesAPIProvider = fVar;
        this.soundscapeDownloaderProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static SoundscapesServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new SoundscapesServiceImpl_Factory(fVar, fVar2, fVar3);
    }

    public static SoundscapesServiceImpl newInstance(SoundscapesAPI soundscapesAPI, SoundscapeDownloader soundscapeDownloader, Logger logger) {
        return new SoundscapesServiceImpl(soundscapesAPI, soundscapeDownloader, logger);
    }

    @Override // rn.a
    public SoundscapesServiceImpl get() {
        return newInstance((SoundscapesAPI) this.soundscapesAPIProvider.get(), (SoundscapeDownloader) this.soundscapeDownloaderProvider.get(), (Logger) this.loggerProvider.get());
    }
}
