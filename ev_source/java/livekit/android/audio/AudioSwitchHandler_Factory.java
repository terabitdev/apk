package io.livekit.android.audio;

import android.content.Context;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AudioSwitchHandler_Factory implements ul.c {
    private final rn.a contextProvider;

    public AudioSwitchHandler_Factory(rn.a aVar) {
        this.contextProvider = aVar;
    }

    public static AudioSwitchHandler_Factory create(rn.a aVar) {
        return new AudioSwitchHandler_Factory(aVar);
    }

    public static AudioSwitchHandler newInstance(Context context) {
        return new AudioSwitchHandler(context);
    }

    @Override // rn.a
    public AudioSwitchHandler get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
