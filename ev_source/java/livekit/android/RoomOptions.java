package io.livekit.android;

import com.google.android.gms.internal.play_billing.b;
import io.livekit.android.e2ee.E2EEOptions;
import io.livekit.android.room.participant.AudioTrackPublishDefaults;
import io.livekit.android.room.participant.VideoTrackPublishDefaults;
import io.livekit.android.room.track.LocalAudioTrackOptions;
import io.livekit.android.room.track.LocalVideoTrackOptions;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jq\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001e¨\u00061"}, d2 = {"Lio/livekit/android/RoomOptions;", "", "adaptiveStream", "", "dynacast", "e2eeOptions", "Lio/livekit/android/e2ee/E2EEOptions;", "audioTrackCaptureDefaults", "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "videoTrackCaptureDefaults", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "audioTrackPublishDefaults", "Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "videoTrackPublishDefaults", "Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "screenShareTrackCaptureDefaults", "screenShareTrackPublishDefaults", "(ZZLio/livekit/android/e2ee/E2EEOptions;Lio/livekit/android/room/track/LocalAudioTrackOptions;Lio/livekit/android/room/track/LocalVideoTrackOptions;Lio/livekit/android/room/participant/AudioTrackPublishDefaults;Lio/livekit/android/room/participant/VideoTrackPublishDefaults;Lio/livekit/android/room/track/LocalVideoTrackOptions;Lio/livekit/android/room/participant/VideoTrackPublishDefaults;)V", "getAdaptiveStream", "()Z", "getAudioTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalAudioTrackOptions;", "getAudioTrackPublishDefaults", "()Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "getDynacast", "getE2eeOptions", "()Lio/livekit/android/e2ee/E2EEOptions;", "getScreenShareTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalVideoTrackOptions;", "getScreenShareTrackPublishDefaults", "()Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "getVideoTrackCaptureDefaults", "getVideoTrackPublishDefaults", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class RoomOptions {
    private final boolean adaptiveStream;
    private final LocalAudioTrackOptions audioTrackCaptureDefaults;
    private final AudioTrackPublishDefaults audioTrackPublishDefaults;
    private final boolean dynacast;
    private final E2EEOptions e2eeOptions;
    private final LocalVideoTrackOptions screenShareTrackCaptureDefaults;
    private final VideoTrackPublishDefaults screenShareTrackPublishDefaults;
    private final LocalVideoTrackOptions videoTrackCaptureDefaults;
    private final VideoTrackPublishDefaults videoTrackPublishDefaults;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RoomOptions(boolean z6, boolean z10, E2EEOptions e2EEOptions, LocalAudioTrackOptions localAudioTrackOptions, LocalVideoTrackOptions localVideoTrackOptions, AudioTrackPublishDefaults audioTrackPublishDefaults, VideoTrackPublishDefaults videoTrackPublishDefaults, LocalVideoTrackOptions localVideoTrackOptions2, VideoTrackPublishDefaults videoTrackPublishDefaults2, int i10, f fVar) {
        this(z6, z10, e2EEOptions, localAudioTrackOptions, localVideoTrackOptions, audioTrackPublishDefaults, videoTrackPublishDefaults, localVideoTrackOptions2, r11);
        VideoTrackPublishDefaults videoTrackPublishDefaults3;
        z6 = (i10 & 1) != 0 ? false : z6;
        z10 = (i10 & 2) != 0 ? false : z10;
        e2EEOptions = (i10 & 4) != 0 ? null : e2EEOptions;
        localAudioTrackOptions = (i10 & 8) != 0 ? null : localAudioTrackOptions;
        localVideoTrackOptions = (i10 & 16) != 0 ? null : localVideoTrackOptions;
        audioTrackPublishDefaults = (i10 & 32) != 0 ? null : audioTrackPublishDefaults;
        videoTrackPublishDefaults = (i10 & 64) != 0 ? null : videoTrackPublishDefaults;
        localVideoTrackOptions2 = (i10 & 128) != 0 ? null : localVideoTrackOptions2;
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            videoTrackPublishDefaults3 = null;
        } else {
            videoTrackPublishDefaults3 = videoTrackPublishDefaults2;
        }
    }

    public static /* synthetic */ RoomOptions copy$default(RoomOptions roomOptions, boolean z6, boolean z10, E2EEOptions e2EEOptions, LocalAudioTrackOptions localAudioTrackOptions, LocalVideoTrackOptions localVideoTrackOptions, AudioTrackPublishDefaults audioTrackPublishDefaults, VideoTrackPublishDefaults videoTrackPublishDefaults, LocalVideoTrackOptions localVideoTrackOptions2, VideoTrackPublishDefaults videoTrackPublishDefaults2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = roomOptions.adaptiveStream;
        }
        if ((i10 & 2) != 0) {
            z10 = roomOptions.dynacast;
        }
        if ((i10 & 4) != 0) {
            e2EEOptions = roomOptions.e2eeOptions;
        }
        if ((i10 & 8) != 0) {
            localAudioTrackOptions = roomOptions.audioTrackCaptureDefaults;
        }
        if ((i10 & 16) != 0) {
            localVideoTrackOptions = roomOptions.videoTrackCaptureDefaults;
        }
        if ((i10 & 32) != 0) {
            audioTrackPublishDefaults = roomOptions.audioTrackPublishDefaults;
        }
        if ((i10 & 64) != 0) {
            videoTrackPublishDefaults = roomOptions.videoTrackPublishDefaults;
        }
        if ((i10 & 128) != 0) {
            localVideoTrackOptions2 = roomOptions.screenShareTrackCaptureDefaults;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            videoTrackPublishDefaults2 = roomOptions.screenShareTrackPublishDefaults;
        }
        LocalVideoTrackOptions localVideoTrackOptions3 = localVideoTrackOptions2;
        VideoTrackPublishDefaults videoTrackPublishDefaults3 = videoTrackPublishDefaults2;
        AudioTrackPublishDefaults audioTrackPublishDefaults2 = audioTrackPublishDefaults;
        VideoTrackPublishDefaults videoTrackPublishDefaults4 = videoTrackPublishDefaults;
        LocalVideoTrackOptions localVideoTrackOptions4 = localVideoTrackOptions;
        E2EEOptions e2EEOptions2 = e2EEOptions;
        return roomOptions.copy(z6, z10, e2EEOptions2, localAudioTrackOptions, localVideoTrackOptions4, audioTrackPublishDefaults2, videoTrackPublishDefaults4, localVideoTrackOptions3, videoTrackPublishDefaults3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAdaptiveStream() {
        return this.adaptiveStream;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDynacast() {
        return this.dynacast;
    }

    /* renamed from: component3, reason: from getter */
    public final E2EEOptions getE2eeOptions() {
        return this.e2eeOptions;
    }

    /* renamed from: component4, reason: from getter */
    public final LocalAudioTrackOptions getAudioTrackCaptureDefaults() {
        return this.audioTrackCaptureDefaults;
    }

    /* renamed from: component5, reason: from getter */
    public final LocalVideoTrackOptions getVideoTrackCaptureDefaults() {
        return this.videoTrackCaptureDefaults;
    }

    /* renamed from: component6, reason: from getter */
    public final AudioTrackPublishDefaults getAudioTrackPublishDefaults() {
        return this.audioTrackPublishDefaults;
    }

    /* renamed from: component7, reason: from getter */
    public final VideoTrackPublishDefaults getVideoTrackPublishDefaults() {
        return this.videoTrackPublishDefaults;
    }

    /* renamed from: component8, reason: from getter */
    public final LocalVideoTrackOptions getScreenShareTrackCaptureDefaults() {
        return this.screenShareTrackCaptureDefaults;
    }

    /* renamed from: component9, reason: from getter */
    public final VideoTrackPublishDefaults getScreenShareTrackPublishDefaults() {
        return this.screenShareTrackPublishDefaults;
    }

    public final RoomOptions copy(boolean adaptiveStream, boolean dynacast, E2EEOptions e2eeOptions, LocalAudioTrackOptions audioTrackCaptureDefaults, LocalVideoTrackOptions videoTrackCaptureDefaults, AudioTrackPublishDefaults audioTrackPublishDefaults, VideoTrackPublishDefaults videoTrackPublishDefaults, LocalVideoTrackOptions screenShareTrackCaptureDefaults, VideoTrackPublishDefaults screenShareTrackPublishDefaults) {
        return new RoomOptions(adaptiveStream, dynacast, e2eeOptions, audioTrackCaptureDefaults, videoTrackCaptureDefaults, audioTrackPublishDefaults, videoTrackPublishDefaults, screenShareTrackCaptureDefaults, screenShareTrackPublishDefaults);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomOptions)) {
            return false;
        }
        RoomOptions roomOptions = (RoomOptions) other;
        if (this.adaptiveStream == roomOptions.adaptiveStream && this.dynacast == roomOptions.dynacast && m.c(this.e2eeOptions, roomOptions.e2eeOptions) && m.c(this.audioTrackCaptureDefaults, roomOptions.audioTrackCaptureDefaults) && m.c(this.videoTrackCaptureDefaults, roomOptions.videoTrackCaptureDefaults) && m.c(this.audioTrackPublishDefaults, roomOptions.audioTrackPublishDefaults) && m.c(this.videoTrackPublishDefaults, roomOptions.videoTrackPublishDefaults) && m.c(this.screenShareTrackCaptureDefaults, roomOptions.screenShareTrackCaptureDefaults) && m.c(this.screenShareTrackPublishDefaults, roomOptions.screenShareTrackPublishDefaults)) {
            return true;
        }
        return false;
    }

    public final boolean getAdaptiveStream() {
        return this.adaptiveStream;
    }

    public final LocalAudioTrackOptions getAudioTrackCaptureDefaults() {
        return this.audioTrackCaptureDefaults;
    }

    public final AudioTrackPublishDefaults getAudioTrackPublishDefaults() {
        return this.audioTrackPublishDefaults;
    }

    public final boolean getDynacast() {
        return this.dynacast;
    }

    public final E2EEOptions getE2eeOptions() {
        return this.e2eeOptions;
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

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int f10 = b.f(Boolean.hashCode(this.adaptiveStream) * 31, 31, this.dynacast);
        E2EEOptions e2EEOptions = this.e2eeOptions;
        int i10 = 0;
        if (e2EEOptions == null) {
            hashCode = 0;
        } else {
            hashCode = e2EEOptions.hashCode();
        }
        int i11 = (f10 + hashCode) * 31;
        LocalAudioTrackOptions localAudioTrackOptions = this.audioTrackCaptureDefaults;
        if (localAudioTrackOptions == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = localAudioTrackOptions.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        LocalVideoTrackOptions localVideoTrackOptions = this.videoTrackCaptureDefaults;
        if (localVideoTrackOptions == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = localVideoTrackOptions.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        AudioTrackPublishDefaults audioTrackPublishDefaults = this.audioTrackPublishDefaults;
        if (audioTrackPublishDefaults == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = audioTrackPublishDefaults.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        VideoTrackPublishDefaults videoTrackPublishDefaults = this.videoTrackPublishDefaults;
        if (videoTrackPublishDefaults == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = videoTrackPublishDefaults.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        LocalVideoTrackOptions localVideoTrackOptions2 = this.screenShareTrackCaptureDefaults;
        if (localVideoTrackOptions2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = localVideoTrackOptions2.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        VideoTrackPublishDefaults videoTrackPublishDefaults2 = this.screenShareTrackPublishDefaults;
        if (videoTrackPublishDefaults2 != null) {
            i10 = videoTrackPublishDefaults2.hashCode();
        }
        return i16 + i10;
    }

    public String toString() {
        return "RoomOptions(adaptiveStream=" + this.adaptiveStream + ", dynacast=" + this.dynacast + ", e2eeOptions=" + this.e2eeOptions + ", audioTrackCaptureDefaults=" + this.audioTrackCaptureDefaults + ", videoTrackCaptureDefaults=" + this.videoTrackCaptureDefaults + ", audioTrackPublishDefaults=" + this.audioTrackPublishDefaults + ", videoTrackPublishDefaults=" + this.videoTrackPublishDefaults + ", screenShareTrackCaptureDefaults=" + this.screenShareTrackCaptureDefaults + ", screenShareTrackPublishDefaults=" + this.screenShareTrackPublishDefaults + ')';
    }

    public RoomOptions(boolean z6, boolean z10, E2EEOptions e2EEOptions, LocalAudioTrackOptions localAudioTrackOptions, LocalVideoTrackOptions localVideoTrackOptions, AudioTrackPublishDefaults audioTrackPublishDefaults, VideoTrackPublishDefaults videoTrackPublishDefaults, LocalVideoTrackOptions localVideoTrackOptions2, VideoTrackPublishDefaults videoTrackPublishDefaults2) {
        this.adaptiveStream = z6;
        this.dynacast = z10;
        this.e2eeOptions = e2EEOptions;
        this.audioTrackCaptureDefaults = localAudioTrackOptions;
        this.videoTrackCaptureDefaults = localVideoTrackOptions;
        this.audioTrackPublishDefaults = audioTrackPublishDefaults;
        this.videoTrackPublishDefaults = videoTrackPublishDefaults;
        this.screenShareTrackCaptureDefaults = localVideoTrackOptions2;
        this.screenShareTrackPublishDefaults = videoTrackPublishDefaults2;
    }

    public RoomOptions() {
        this(false, false, null, null, null, null, null, null, null, 511, null);
    }
}
