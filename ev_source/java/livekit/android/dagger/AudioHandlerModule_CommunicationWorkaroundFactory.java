package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.AudioType;
import io.livekit.android.audio.CommunicationWorkaround;
import io.livekit.android.memory.CloseableManager;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AudioHandlerModule_CommunicationWorkaroundFactory implements c {
    private final rn.a audioTypeProvider;
    private final rn.a closeableManagerProvider;
    private final rn.a commWorkaroundImplProvider;
    private final rn.a disableCommunicationWorkaroundProvider;

    public AudioHandlerModule_CommunicationWorkaroundFactory(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4) {
        this.disableCommunicationWorkaroundProvider = aVar;
        this.audioTypeProvider = aVar2;
        this.closeableManagerProvider = aVar3;
        this.commWorkaroundImplProvider = aVar4;
    }

    public static CommunicationWorkaround communicationWorkaround(boolean z6, AudioType audioType, CloseableManager closeableManager, rn.a aVar) {
        CommunicationWorkaround communicationWorkaround = AudioHandlerModule.INSTANCE.communicationWorkaround(z6, audioType, closeableManager, aVar);
        m0.n(communicationWorkaround);
        return communicationWorkaround;
    }

    public static AudioHandlerModule_CommunicationWorkaroundFactory create(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4) {
        return new AudioHandlerModule_CommunicationWorkaroundFactory(aVar, aVar2, aVar3, aVar4);
    }

    @Override // rn.a
    public CommunicationWorkaround get() {
        return communicationWorkaround(((Boolean) this.disableCommunicationWorkaroundProvider.get()).booleanValue(), (AudioType) this.audioTypeProvider.get(), (CloseableManager) this.closeableManagerProvider.get(), this.commWorkaroundImplProvider);
    }
}
