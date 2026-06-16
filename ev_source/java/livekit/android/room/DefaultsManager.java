package io.livekit.android.room;

import io.livekit.android.room.participant.AudioTrackPublishDefaults;
import io.livekit.android.room.participant.VideoTrackPublishDefaults;
import io.livekit.android.room.track.LocalAudioTrackOptions;
import io.livekit.android.room.track.LocalVideoTrackOptions;
import io.livekit.android.room.track.ScreenSharePresets;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001a\u0010#\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f¨\u0006&"}, d2 = {"Lio/livekit/android/room/DefaultsManager;", "", "()V", "audioTrackCaptureDefaults", "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "getAudioTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalAudioTrackOptions;", "setAudioTrackCaptureDefaults", "(Lio/livekit/android/room/track/LocalAudioTrackOptions;)V", "audioTrackPublishDefaults", "Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "getAudioTrackPublishDefaults", "()Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "setAudioTrackPublishDefaults", "(Lio/livekit/android/room/participant/AudioTrackPublishDefaults;)V", "isPrerecording", "", "()Z", "setPrerecording", "(Z)V", "screenShareTrackCaptureDefaults", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "getScreenShareTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalVideoTrackOptions;", "setScreenShareTrackCaptureDefaults", "(Lio/livekit/android/room/track/LocalVideoTrackOptions;)V", "screenShareTrackPublishDefaults", "Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "getScreenShareTrackPublishDefaults", "()Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "setScreenShareTrackPublishDefaults", "(Lio/livekit/android/room/participant/VideoTrackPublishDefaults;)V", "videoTrackCaptureDefaults", "getVideoTrackCaptureDefaults", "setVideoTrackCaptureDefaults", "videoTrackPublishDefaults", "getVideoTrackPublishDefaults", "setVideoTrackPublishDefaults", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DefaultsManager {
    private LocalAudioTrackOptions audioTrackCaptureDefaults;
    private AudioTrackPublishDefaults audioTrackPublishDefaults;
    private boolean isPrerecording;
    private LocalVideoTrackOptions screenShareTrackCaptureDefaults;
    private VideoTrackPublishDefaults screenShareTrackPublishDefaults;
    private LocalVideoTrackOptions videoTrackCaptureDefaults;
    private VideoTrackPublishDefaults videoTrackPublishDefaults;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultsManager() {
        boolean z6 = false;
        boolean z10 = false;
        this.audioTrackCaptureDefaults = new LocalAudioTrackOptions(false, false, z6, z10, false, 31, null);
        this.audioTrackPublishDefaults = new AudioTrackPublishDefaults(null, z6, z10, 7, null);
        this.videoTrackCaptureDefaults = new LocalVideoTrackOptions(z6, null, null, 0 == true ? 1 : 0, 15, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        this.videoTrackPublishDefaults = new VideoTrackPublishDefaults(objArr3, false, objArr, null, objArr2, null, null, 127, null);
        ScreenSharePresets screenSharePresets = ScreenSharePresets.ORIGINAL;
        this.screenShareTrackCaptureDefaults = new LocalVideoTrackOptions(true, 0 == true ? 1 : 0, 0 == true ? 1 : 0, screenSharePresets.getCapture(), 6, 0 == true ? 1 : 0);
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        this.screenShareTrackPublishDefaults = new VideoTrackPublishDefaults(screenSharePresets.getEncoding(), false, null, null, objArr5, null, objArr4, 126, null);
    }

    public final LocalAudioTrackOptions getAudioTrackCaptureDefaults() {
        return this.audioTrackCaptureDefaults;
    }

    public final AudioTrackPublishDefaults getAudioTrackPublishDefaults() {
        return this.audioTrackPublishDefaults;
    }

    public final LocalVideoTrackOptions getScreenShareTrackCaptureDefaults() {
        return this.screenShareTrackCaptureDefaults;
    }

    public final VideoTrackPublishDefaults getScreenShareTrackPublishDefaults() {
        return this.screenShareTrackPublishDefaults;
    }

    public final LocalVideoTrackOptions getVideoTrackCaptureDefaults() {
        return this.videoTrackCaptureDefaults;
    }

    public final VideoTrackPublishDefaults getVideoTrackPublishDefaults() {
        return this.videoTrackPublishDefaults;
    }

    /* renamed from: isPrerecording, reason: from getter */
    public final boolean getIsPrerecording() {
        return this.isPrerecording;
    }

    public final void setAudioTrackCaptureDefaults(LocalAudioTrackOptions localAudioTrackOptions) {
        localAudioTrackOptions.getClass();
        this.audioTrackCaptureDefaults = localAudioTrackOptions;
    }

    public final void setAudioTrackPublishDefaults(AudioTrackPublishDefaults audioTrackPublishDefaults) {
        audioTrackPublishDefaults.getClass();
        this.audioTrackPublishDefaults = audioTrackPublishDefaults;
    }

    public final void setPrerecording(boolean z6) {
        this.isPrerecording = z6;
    }

    public final void setScreenShareTrackCaptureDefaults(LocalVideoTrackOptions localVideoTrackOptions) {
        localVideoTrackOptions.getClass();
        this.screenShareTrackCaptureDefaults = localVideoTrackOptions;
    }

    public final void setScreenShareTrackPublishDefaults(VideoTrackPublishDefaults videoTrackPublishDefaults) {
        videoTrackPublishDefaults.getClass();
        this.screenShareTrackPublishDefaults = videoTrackPublishDefaults;
    }

    public final void setVideoTrackCaptureDefaults(LocalVideoTrackOptions localVideoTrackOptions) {
        localVideoTrackOptions.getClass();
        this.videoTrackCaptureDefaults = localVideoTrackOptions;
    }

    public final void setVideoTrackPublishDefaults(VideoTrackPublishDefaults videoTrackPublishDefaults) {
        videoTrackPublishDefaults.getClass();
        this.videoTrackPublishDefaults = videoTrackPublishDefaults;
    }
}
