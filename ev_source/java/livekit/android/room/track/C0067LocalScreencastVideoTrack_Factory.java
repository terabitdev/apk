package io.livekit.android.room.track;

import android.content.Context;
import io.livekit.android.room.DefaultsManager;
import io.livekit.android.room.track.LocalScreencastVideoTrack;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoSource;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.track.LocalScreencastVideoTrack_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0067LocalScreencastVideoTrack_Factory {
    private final rn.a contextProvider;
    private final rn.a defaultsManagerProvider;
    private final rn.a eglBaseProvider;
    private final rn.a peerConnectionFactoryProvider;
    private final rn.a rtcThreadTokenProvider;
    private final rn.a videoTrackFactoryProvider;

    public C0067LocalScreencastVideoTrack_Factory(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6) {
        this.peerConnectionFactoryProvider = aVar;
        this.contextProvider = aVar2;
        this.eglBaseProvider = aVar3;
        this.defaultsManagerProvider = aVar4;
        this.videoTrackFactoryProvider = aVar5;
        this.rtcThreadTokenProvider = aVar6;
    }

    public static C0067LocalScreencastVideoTrack_Factory create(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6) {
        return new C0067LocalScreencastVideoTrack_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static LocalScreencastVideoTrack newInstance(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, LocalScreencastVideoTrack.MediaProjectionCallback mediaProjectionCallback, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, DefaultsManager defaultsManager, LocalVideoTrack.Factory factory, RTCThreadToken rTCThreadToken) {
        return new LocalScreencastVideoTrack(videoCapturer, videoSource, str, localVideoTrackOptions, videoTrack, mediaProjectionCallback, peerConnectionFactory, context, eglBase, defaultsManager, factory, rTCThreadToken);
    }

    public LocalScreencastVideoTrack get(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, LocalScreencastVideoTrack.MediaProjectionCallback mediaProjectionCallback) {
        return newInstance(videoCapturer, videoSource, str, localVideoTrackOptions, videoTrack, mediaProjectionCallback, (PeerConnectionFactory) this.peerConnectionFactoryProvider.get(), (Context) this.contextProvider.get(), (EglBase) this.eglBaseProvider.get(), (DefaultsManager) this.defaultsManagerProvider.get(), (LocalVideoTrack.Factory) this.videoTrackFactoryProvider.get(), (RTCThreadToken) this.rtcThreadTokenProvider.get());
    }
}
