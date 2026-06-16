package io.elevenlabs.player.di;

import androidx.room.m0;
import io.elevenlabs.player.media.HlsMediaDataSource;
import io.elevenlabs.player.media.MediaItemCreator;
import io.elevenlabs.player.media.ReadsDataSource;
import j8.s;
import r8.g0;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerServiceModule_ProvideMediaSourceFactoryFactory implements c {
    private final f drmProvider;
    private final f hlsDataSourceProvider;
    private final f mediaItemCreatorProvider;
    private final f readsDataSourceProvider;

    private PlayerServiceModule_ProvideMediaSourceFactoryFactory(f fVar, f fVar2, f fVar3, f fVar4) {
        this.readsDataSourceProvider = fVar;
        this.hlsDataSourceProvider = fVar2;
        this.drmProvider = fVar3;
        this.mediaItemCreatorProvider = fVar4;
    }

    public static PlayerServiceModule_ProvideMediaSourceFactoryFactory create(f fVar, f fVar2, f fVar3, f fVar4) {
        return new PlayerServiceModule_ProvideMediaSourceFactoryFactory(fVar, fVar2, fVar3, fVar4);
    }

    public static g0 provideMediaSourceFactory(ReadsDataSource.Factory factory, HlsMediaDataSource.Factory factory2, s sVar, MediaItemCreator mediaItemCreator) {
        g0 provideMediaSourceFactory = PlayerServiceModule.INSTANCE.provideMediaSourceFactory(factory, factory2, sVar, mediaItemCreator);
        m0.n(provideMediaSourceFactory);
        return provideMediaSourceFactory;
    }

    @Override // rn.a
    public g0 get() {
        return provideMediaSourceFactory((ReadsDataSource.Factory) this.readsDataSourceProvider.get(), (HlsMediaDataSource.Factory) this.hlsDataSourceProvider.get(), (s) this.drmProvider.get(), (MediaItemCreator) this.mediaItemCreatorProvider.get());
    }
}
