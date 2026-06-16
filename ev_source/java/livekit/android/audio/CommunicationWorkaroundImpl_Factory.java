package io.livekit.android.audio;

import fr.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class CommunicationWorkaroundImpl_Factory implements ul.c {
    private final rn.a dispatcherProvider;

    public CommunicationWorkaroundImpl_Factory(rn.a aVar) {
        this.dispatcherProvider = aVar;
    }

    public static CommunicationWorkaroundImpl_Factory create(rn.a aVar) {
        return new CommunicationWorkaroundImpl_Factory(aVar);
    }

    public static CommunicationWorkaroundImpl newInstance(z zVar) {
        return new CommunicationWorkaroundImpl(zVar);
    }

    @Override // rn.a
    public CommunicationWorkaroundImpl get() {
        return newInstance((z) this.dispatcherProvider.get());
    }
}
