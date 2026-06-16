package io.elevenlabs.player.audio;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class LoopingAudioPlayer_Factory implements c {
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;

    private LoopingAudioPlayer_Factory(f fVar, f fVar2) {
        this.dispatcherFactoryProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static LoopingAudioPlayer_Factory create(f fVar, f fVar2) {
        return new LoopingAudioPlayer_Factory(fVar, fVar2);
    }

    public static LoopingAudioPlayer newInstance(DispatcherFactory dispatcherFactory, Logger logger) {
        return new LoopingAudioPlayer(dispatcherFactory, logger);
    }

    @Override // rn.a
    public LoopingAudioPlayer get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get());
    }
}
