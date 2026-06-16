package io.livekit.android.room.track;

import android.content.Context;
import io.livekit.android.room.DefaultsManager;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.room.track.video.CaptureDispatchObserver;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoSource;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.track.LocalVideoTrack_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0068LocalVideoTrack_Factory {
    private final rn.a contextProvider;
    private final rn.a defaultsManagerProvider;
    private final rn.a eglBaseProvider;
    private final rn.a peerConnectionFactoryProvider;
    private final rn.a rtcThreadTokenProvider;
    private final rn.a trackFactoryProvider;

    public C0068LocalVideoTrack_Factory(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6) {
        this.peerConnectionFactoryProvider = aVar;
        this.contextProvider = aVar2;
        this.eglBaseProvider = aVar3;
        this.defaultsManagerProvider = aVar4;
        this.trackFactoryProvider = aVar5;
        this.rtcThreadTokenProvider = aVar6;
    }

    public static C0068LocalVideoTrack_Factory create(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6) {
        return new C0068LocalVideoTrack_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static LocalVideoTrack newInstance(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, DefaultsManager defaultsManager, LocalVideoTrack.Factory factory, CaptureDispatchObserver captureDispatchObserver, RTCThreadToken rTCThreadToken) {
        return new LocalVideoTrack(videoCapturer, videoSource, str, localVideoTrackOptions, videoTrack, peerConnectionFactory, context, eglBase, defaultsManager, factory, captureDispatchObserver, rTCThreadToken);
    }

    public LocalVideoTrack get(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, CaptureDispatchObserver captureDispatchObserver) {
        return newInstance(videoCapturer, videoSource, str, localVideoTrackOptions, videoTrack, (PeerConnectionFactory) this.peerConnectionFactoryProvider.get(), (Context) this.contextProvider.get(), (EglBase) this.eglBaseProvider.get(), (DefaultsManager) this.defaultsManagerProvider.get(), (LocalVideoTrack.Factory) this.trackFactoryProvider.get(), captureDispatchObserver, (RTCThreadToken) this.rtcThreadTokenProvider.get());
    }
}
