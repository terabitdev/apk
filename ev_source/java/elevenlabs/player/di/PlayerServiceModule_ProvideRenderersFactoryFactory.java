package io.elevenlabs.player.di;

import android.content.Context;
import androidx.room.m0;
import g8.s1;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerServiceModule_ProvideRenderersFactoryFactory implements c {
    private final f contextProvider;

    private PlayerServiceModule_ProvideRenderersFactoryFactory(f fVar) {
        this.contextProvider = fVar;
    }

    public static PlayerServiceModule_ProvideRenderersFactoryFactory create(f fVar) {
        return new PlayerServiceModule_ProvideRenderersFactoryFactory(fVar);
    }

    public static s1 provideRenderersFactory(Context context) {
        s1 provideRenderersFactory = PlayerServiceModule.INSTANCE.provideRenderersFactory(context);
        m0.n(provideRenderersFactory);
        return provideRenderersFactory;
    }

    @Override // rn.a
    public s1 get() {
        return provideRenderersFactory((Context) this.contextProvider.get());
    }
}
