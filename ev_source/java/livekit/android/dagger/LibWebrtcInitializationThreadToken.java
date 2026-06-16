package io.livekit.android.dagger;

import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/livekit/android/dagger/LibWebrtcInitializationThreadToken;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "()V", "isDisposed", "", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
final class LibWebrtcInitializationThreadToken implements RTCThreadToken {
    public static final LibWebrtcInitializationThreadToken INSTANCE = new LibWebrtcInitializationThreadToken();

    private LibWebrtcInitializationThreadToken() {
    }

    @Override // io.livekit.android.webrtc.peerconnection.RTCThreadToken
    public boolean isDisposed() {
        return false;
    }
}
