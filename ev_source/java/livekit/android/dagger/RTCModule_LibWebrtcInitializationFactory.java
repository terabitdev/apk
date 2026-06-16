package io.livekit.android.dagger;

import android.content.Context;
import androidx.room.m0;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_LibWebrtcInitializationFactory implements c {
    private final rn.a appContextProvider;

    public RTCModule_LibWebrtcInitializationFactory(rn.a aVar) {
        this.appContextProvider = aVar;
    }

    public static RTCModule_LibWebrtcInitializationFactory create(rn.a aVar) {
        return new RTCModule_LibWebrtcInitializationFactory(aVar);
    }

    public static LibWebrtcInitialization libWebrtcInitialization(Context context) {
        LibWebrtcInitialization libWebrtcInitialization = RTCModule.INSTANCE.libWebrtcInitialization(context);
        m0.n(libWebrtcInitialization);
        return libWebrtcInitialization;
    }

    @Override // rn.a
    public LibWebrtcInitialization get() {
        return libWebrtcInitialization((Context) this.appContextProvider.get());
    }
}
