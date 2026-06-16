package io.livekit.android.dagger;

import android.media.AudioAttributes;
import android.os.Build;
import io.livekit.android.AudioType;
import io.livekit.android.audio.AudioHandler;
import io.livekit.android.audio.AudioSwitchHandler;
import io.livekit.android.audio.CommunicationWorkaround;
import io.livekit.android.audio.CommunicationWorkaroundImpl;
import io.livekit.android.audio.NoopCommunicationWorkaround;
import io.livekit.android.memory.CloseableManager;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/livekit/android/dagger/AudioHandlerModule;", "", "<init>", "()V", "Lio/livekit/android/AudioType;", "audioOutputOverride", "audioOutputType", "(Lio/livekit/android/AudioType;)Lio/livekit/android/AudioType;", "audioType", "Landroid/media/AudioAttributes;", "audioOutputAttributes", "(Lio/livekit/android/AudioType;)Landroid/media/AudioAttributes;", "Lrn/a;", "Lio/livekit/android/audio/AudioSwitchHandler;", "audioSwitchHandler", "Lio/livekit/android/audio/AudioHandler;", "audioHandlerOverride", "audioHandler", "(Lrn/a;Lio/livekit/android/audio/AudioHandler;Lio/livekit/android/AudioType;)Lio/livekit/android/audio/AudioHandler;", "", "disableCommunicationWorkaround", "Lio/livekit/android/memory/CloseableManager;", "closeableManager", "Lio/livekit/android/audio/CommunicationWorkaroundImpl;", "commWorkaroundImplProvider", "Lio/livekit/android/audio/CommunicationWorkaround;", "communicationWorkaround", "(ZLio/livekit/android/AudioType;Lio/livekit/android/memory/CloseableManager;Lrn/a;)Lio/livekit/android/audio/CommunicationWorkaround;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AudioHandlerModule {
    public static final AudioHandlerModule INSTANCE = new AudioHandlerModule();

    private AudioHandlerModule() {
    }

    public final AudioHandler audioHandler(rn.a audioSwitchHandler, AudioHandler audioHandlerOverride, AudioType audioOutputType) {
        audioSwitchHandler.getClass();
        audioOutputType.getClass();
        if (audioHandlerOverride == null) {
            Object obj = audioSwitchHandler.get();
            AudioSwitchHandler audioSwitchHandler2 = (AudioSwitchHandler) obj;
            audioSwitchHandler2.setAudioMode(audioOutputType.getAudioMode());
            audioSwitchHandler2.setAudioAttributeContentType(audioOutputType.getAudioAttributes().getContentType());
            audioSwitchHandler2.setAudioAttributeUsageType(audioOutputType.getAudioAttributes().getUsage());
            audioSwitchHandler2.setAudioStreamType(audioOutputType.getAudioStreamType());
            obj.getClass();
            return (AudioHandler) obj;
        }
        return audioHandlerOverride;
    }

    public final AudioAttributes audioOutputAttributes(AudioType audioType) {
        audioType.getClass();
        return audioType.getAudioAttributes();
    }

    public final AudioType audioOutputType(AudioType audioOutputOverride) {
        if (audioOutputOverride == null) {
            return new AudioType.CallAudioType();
        }
        return audioOutputOverride;
    }

    public final CommunicationWorkaround communicationWorkaround(boolean disableCommunicationWorkaround, AudioType audioType, CloseableManager closeableManager, rn.a commWorkaroundImplProvider) {
        audioType.getClass();
        closeableManager.getClass();
        commWorkaroundImplProvider.getClass();
        if (!disableCommunicationWorkaround && Build.VERSION.SDK_INT >= 30 && audioType.getAudioMode() == 3) {
            Object obj = commWorkaroundImplProvider.get();
            closeableManager.registerClosable(new a((CommunicationWorkaroundImpl) obj, 0));
            obj.getClass();
            return (CommunicationWorkaround) obj;
        }
        return new NoopCommunicationWorkaround();
    }
}
