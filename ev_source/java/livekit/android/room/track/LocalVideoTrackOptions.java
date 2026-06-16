package io.livekit.android.room.track;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lio/livekit/android/room/track/LocalVideoTrackOptions;", "", "isScreencast", "", "deviceId", "", "position", "Lio/livekit/android/room/track/CameraPosition;", "captureParams", "Lio/livekit/android/room/track/VideoCaptureParameter;", "(ZLjava/lang/String;Lio/livekit/android/room/track/CameraPosition;Lio/livekit/android/room/track/VideoCaptureParameter;)V", "getCaptureParams", "()Lio/livekit/android/room/track/VideoCaptureParameter;", "getDeviceId", "()Ljava/lang/String;", "()Z", "getPosition", "()Lio/livekit/android/room/track/CameraPosition;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class LocalVideoTrackOptions {
    private final VideoCaptureParameter captureParams;
    private final String deviceId;
    private final boolean isScreencast;
    private final CameraPosition position;

    public /* synthetic */ LocalVideoTrackOptions(boolean z6, String str, CameraPosition cameraPosition, VideoCaptureParameter videoCaptureParameter, int i10, f fVar) {
        this((i10 & 1) != 0 ? false : z6, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? CameraPosition.FRONT : cameraPosition, (i10 & 8) != 0 ? VideoPreset169.H720.getCapture() : videoCaptureParameter);
    }

    public static /* synthetic */ LocalVideoTrackOptions copy$default(LocalVideoTrackOptions localVideoTrackOptions, boolean z6, String str, CameraPosition cameraPosition, VideoCaptureParameter videoCaptureParameter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = localVideoTrackOptions.isScreencast;
        }
        if ((i10 & 2) != 0) {
            str = localVideoTrackOptions.deviceId;
        }
        if ((i10 & 4) != 0) {
            cameraPosition = localVideoTrackOptions.position;
        }
        if ((i10 & 8) != 0) {
            videoCaptureParameter = localVideoTrackOptions.captureParams;
        }
        return localVideoTrackOptions.copy(z6, str, cameraPosition, videoCaptureParameter);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsScreencast() {
        return this.isScreencast;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final CameraPosition getPosition() {
        return this.position;
    }

    /* renamed from: component4, reason: from getter */
    public final VideoCaptureParameter getCaptureParams() {
        return this.captureParams;
    }

    public final LocalVideoTrackOptions copy(boolean isScreencast, String deviceId, CameraPosition position, VideoCaptureParameter captureParams) {
        captureParams.getClass();
        return new LocalVideoTrackOptions(isScreencast, deviceId, position, captureParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalVideoTrackOptions)) {
            return false;
        }
        LocalVideoTrackOptions localVideoTrackOptions = (LocalVideoTrackOptions) other;
        if (this.isScreencast == localVideoTrackOptions.isScreencast && m.c(this.deviceId, localVideoTrackOptions.deviceId) && this.position == localVideoTrackOptions.position && m.c(this.captureParams, localVideoTrackOptions.captureParams)) {
            return true;
        }
        return false;
    }

    public final VideoCaptureParameter getCaptureParams() {
        return this.captureParams;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final CameraPosition getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.isScreencast) * 31;
        String str = this.deviceId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        CameraPosition cameraPosition = this.position;
        if (cameraPosition != null) {
            i10 = cameraPosition.hashCode();
        }
        return this.captureParams.hashCode() + ((i11 + i10) * 31);
    }

    public final boolean isScreencast() {
        return this.isScreencast;
    }

    public String toString() {
        return "LocalVideoTrackOptions(isScreencast=" + this.isScreencast + ", deviceId=" + this.deviceId + ", position=" + this.position + ", captureParams=" + this.captureParams + ')';
    }

    public LocalVideoTrackOptions(boolean z6, String str, CameraPosition cameraPosition, VideoCaptureParameter videoCaptureParameter) {
        videoCaptureParameter.getClass();
        this.isScreencast = z6;
        this.deviceId = str;
        this.position = cameraPosition;
        this.captureParams = videoCaptureParameter;
    }

    public LocalVideoTrackOptions() {
        this(false, null, null, null, 15, null);
    }
}
