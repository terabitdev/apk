package io.livekit.android.audio;

import android.content.Context;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AudioFocusHandler_Factory implements ul.c {
    private final rn.a contextProvider;

    public AudioFocusHandler_Factory(rn.a aVar) {
        this.contextProvider = aVar;
    }

    public static AudioFocusHandler_Factory create(rn.a aVar) {
        return new AudioFocusHandler_Factory(aVar);
    }

    public static AudioFocusHandler newInstance(Context context) {
        return new AudioFocusHandler(context);
    }

    @Override // rn.a
    public AudioFocusHandler get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
