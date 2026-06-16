package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.audio.AudioBufferCallbackDispatcher;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_LocalAudioBufferCallbackDispatcherFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final RTCModule_LocalAudioBufferCallbackDispatcherFactory INSTANCE = new RTCModule_LocalAudioBufferCallbackDispatcherFactory();

        private InstanceHolder() {
        }
    }

    public static RTCModule_LocalAudioBufferCallbackDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AudioBufferCallbackDispatcher localAudioBufferCallbackDispatcher() {
        AudioBufferCallbackDispatcher localAudioBufferCallbackDispatcher = RTCModule.INSTANCE.localAudioBufferCallbackDispatcher();
        m0.n(localAudioBufferCallbackDispatcher);
        return localAudioBufferCallbackDispatcher;
    }

    @Override // rn.a
    public AudioBufferCallbackDispatcher get() {
        return localAudioBufferCallbackDispatcher();
    }
}
