package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.audio.AudioRecordSamplesDispatcher;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_LocalAudioSamplesDispatcherFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final RTCModule_LocalAudioSamplesDispatcherFactory INSTANCE = new RTCModule_LocalAudioSamplesDispatcherFactory();

        private InstanceHolder() {
        }
    }

    public static RTCModule_LocalAudioSamplesDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AudioRecordSamplesDispatcher localAudioSamplesDispatcher() {
        AudioRecordSamplesDispatcher localAudioSamplesDispatcher = RTCModule.INSTANCE.localAudioSamplesDispatcher();
        m0.n(localAudioSamplesDispatcher);
        return localAudioSamplesDispatcher;
    }

    @Override // rn.a
    public AudioRecordSamplesDispatcher get() {
        return localAudioSamplesDispatcher();
    }
}
