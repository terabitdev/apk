package io.livekit.android.room.provisions;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.audio.AudioDeviceModule;
import rn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/provisions/LKObjects;", "", "Lrn/a;", "Llivekit/org/webrtc/EglBase;", "eglBaseProvider", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "audioDeviceModuleProvider", "<init>", "(Lrn/a;Lrn/a;)V", "Lrn/a;", "getEglBase", "()Llivekit/org/webrtc/EglBase;", "eglBase", "getAudioDeviceModule", "()Llivekit/org/webrtc/audio/AudioDeviceModule;", "audioDeviceModule", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LKObjects {
    private final a audioDeviceModuleProvider;
    private final a eglBaseProvider;

    public LKObjects(a aVar, a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.eglBaseProvider = aVar;
        this.audioDeviceModuleProvider = aVar2;
    }

    public final AudioDeviceModule getAudioDeviceModule() {
        Object obj = this.audioDeviceModuleProvider.get();
        obj.getClass();
        return (AudioDeviceModule) obj;
    }

    public final EglBase getEglBase() {
        Object obj = this.eglBaseProvider.get();
        obj.getClass();
        return (EglBase) obj;
    }
}
