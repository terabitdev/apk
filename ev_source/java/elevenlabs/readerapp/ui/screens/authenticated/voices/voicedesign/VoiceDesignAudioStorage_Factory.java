package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import android.content.Context;
import fr.d0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoiceDesignAudioStorage_Factory implements ul.c {
    private final ul.f contextProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f scopeProvider;

    private VoiceDesignAudioStorage_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.contextProvider = fVar;
        this.scopeProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
        this.loggerProvider = fVar4;
    }

    public static VoiceDesignAudioStorage_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new VoiceDesignAudioStorage_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static VoiceDesignAudioStorage newInstance(Context context, d0 d0Var, DispatcherFactory dispatcherFactory, Logger logger) {
        return new VoiceDesignAudioStorage(context, d0Var, dispatcherFactory, logger);
    }

    @Override // rn.a
    public VoiceDesignAudioStorage get() {
        return newInstance((Context) this.contextProvider.get(), (d0) this.scopeProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get());
    }
}
