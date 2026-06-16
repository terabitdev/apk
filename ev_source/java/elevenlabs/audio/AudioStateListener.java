package io.elevenlabs.audio;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/audio/AudioStateListener;", "", "", "isRecording", "Lsn/z;", "onRecordingStateChanged", "(Z)V", "isPlaying", "onPlaybackStateChanged", "isMuted", "onMuteStateChanged", "", "volume", "onVolumeChanged", "(F)V", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "exception", "onAudioError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AudioStateListener {
    void onAudioError(String error, Throwable exception);

    void onMuteStateChanged(boolean isMuted);

    void onPlaybackStateChanged(boolean isPlaying);

    void onRecordingStateChanged(boolean isRecording);

    void onVolumeChanged(float volume);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static void onAudioError(AudioStateListener audioStateListener, String str, Throwable th) {
            str.getClass();
        }

        public static /* synthetic */ void onAudioError$default(AudioStateListener audioStateListener, String str, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    th = null;
                }
                audioStateListener.onAudioError(str, th);
                return;
            }
            a9.a.y("Super calls with default arguments not supported in this target, function: onAudioError");
        }

        public static void onMuteStateChanged(AudioStateListener audioStateListener, boolean z6) {
        }

        public static void onPlaybackStateChanged(AudioStateListener audioStateListener, boolean z6) {
        }

        public static void onRecordingStateChanged(AudioStateListener audioStateListener, boolean z6) {
        }

        public static void onVolumeChanged(AudioStateListener audioStateListener, float f10) {
        }
    }
}
