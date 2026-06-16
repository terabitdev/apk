package io.livekit.android;

import ho.l;
import io.livekit.android.audio.AudioHandler;
import io.livekit.android.audio.AudioProcessorOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.audio.AudioDeviceModule;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/livekit/android/AudioOptions;", "", "Lio/livekit/android/AudioType;", "audioOutputType", "Lio/livekit/android/audio/AudioHandler;", "audioHandler", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "audioDeviceModule", "Lkotlin/Function1;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$Builder;", "Lsn/z;", "javaAudioDeviceModuleCustomizer", "", "disableCommunicationModeWorkaround", "Lio/livekit/android/audio/AudioProcessorOptions;", "audioProcessorOptions", "<init>", "(Lio/livekit/android/AudioType;Lio/livekit/android/audio/AudioHandler;Llivekit/org/webrtc/audio/AudioDeviceModule;Lho/l;ZLio/livekit/android/audio/AudioProcessorOptions;)V", "Lio/livekit/android/AudioType;", "getAudioOutputType", "()Lio/livekit/android/AudioType;", "Lio/livekit/android/audio/AudioHandler;", "getAudioHandler", "()Lio/livekit/android/audio/AudioHandler;", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "getAudioDeviceModule", "()Llivekit/org/webrtc/audio/AudioDeviceModule;", "Lho/l;", "getJavaAudioDeviceModuleCustomizer", "()Lho/l;", "Z", "getDisableCommunicationModeWorkaround", "()Z", "Lio/livekit/android/audio/AudioProcessorOptions;", "getAudioProcessorOptions", "()Lio/livekit/android/audio/AudioProcessorOptions;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AudioOptions {
    private final AudioDeviceModule audioDeviceModule;
    private final AudioHandler audioHandler;
    private final AudioType audioOutputType;
    private final AudioProcessorOptions audioProcessorOptions;
    private final boolean disableCommunicationModeWorkaround;
    private final l javaAudioDeviceModuleCustomizer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AudioOptions(AudioType audioType, AudioHandler audioHandler, AudioDeviceModule audioDeviceModule, l lVar, boolean z6, AudioProcessorOptions audioProcessorOptions, int i10, f fVar) {
        this(audioType, audioHandler, audioDeviceModule, lVar, z6, r8);
        AudioProcessorOptions audioProcessorOptions2;
        audioType = (i10 & 1) != 0 ? null : audioType;
        audioHandler = (i10 & 2) != 0 ? null : audioHandler;
        audioDeviceModule = (i10 & 4) != 0 ? null : audioDeviceModule;
        lVar = (i10 & 8) != 0 ? null : lVar;
        z6 = (i10 & 16) != 0 ? false : z6;
        if ((i10 & 32) != 0) {
            audioProcessorOptions2 = null;
        } else {
            audioProcessorOptions2 = audioProcessorOptions;
        }
    }

    public final AudioDeviceModule getAudioDeviceModule() {
        return this.audioDeviceModule;
    }

    public final AudioHandler getAudioHandler() {
        return this.audioHandler;
    }

    public final AudioType getAudioOutputType() {
        return this.audioOutputType;
    }

    public final AudioProcessorOptions getAudioProcessorOptions() {
        return this.audioProcessorOptions;
    }

    public final boolean getDisableCommunicationModeWorkaround() {
        return this.disableCommunicationModeWorkaround;
    }

    public final l getJavaAudioDeviceModuleCustomizer() {
        return this.javaAudioDeviceModuleCustomizer;
    }

    public AudioOptions(AudioType audioType, AudioHandler audioHandler, AudioDeviceModule audioDeviceModule, l lVar, boolean z6, AudioProcessorOptions audioProcessorOptions) {
        this.audioOutputType = audioType;
        this.audioHandler = audioHandler;
        this.audioDeviceModule = audioDeviceModule;
        this.javaAudioDeviceModuleCustomizer = lVar;
        this.disableCommunicationModeWorkaround = z6;
        this.audioProcessorOptions = audioProcessorOptions;
    }

    public AudioOptions() {
        this(null, null, null, null, false, null, 63, null);
    }
}
