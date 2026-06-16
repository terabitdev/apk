package io.livekit.android.room.track;

import android.view.View;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import et.d;
import fr.d0;
import fr.g0;
import fr.z;
import io.livekit.android.events.TrackEvent;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.video.VideoSinkVisibility;
import io.livekit.android.room.track.video.ViewVisibility;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.VideoSink;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0010\u001f\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001<BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R*\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\"\u0012\u0004\b.\u0010\u0017\u001a\u0004\b-\u0010\u0011R*\u0010/\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00128\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010\u0017\u001a\u0004\b1\u0010\u0014R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001c088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lio/livekit/android/room/track/RemoteVideoTrack;", "Lio/livekit/android/room/track/VideoTrack;", "", DiagnosticsEntry.NAME_KEY, "Llivekit/org/webrtc/VideoTrack;", "rtcTrack", "", "autoManageVideo", "Lfr/z;", "dispatcher", "Llivekit/org/webrtc/RtpReceiver;", "receiver", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Ljava/lang/String;Llivekit/org/webrtc/VideoTrack;ZLfr/z;Llivekit/org/webrtc/RtpReceiver;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "hasVisibleSinks", "()Z", "Lio/livekit/android/room/track/Track$Dimensions;", "largestVideoViewSize", "()Lio/livekit/android/room/track/Track$Dimensions;", "Lsn/z;", "recalculateVisibility", "()V", "Llivekit/org/webrtc/VideoSink;", "renderer", "addRenderer", "(Llivekit/org/webrtc/VideoSink;)V", "Lio/livekit/android/room/track/video/VideoSinkVisibility;", "visibility", "(Llivekit/org/webrtc/VideoSink;Lio/livekit/android/room/track/video/VideoSinkVisibility;)V", "removeRenderer", "stop", "dispose", "Z", "getAutoManageVideo", "Lfr/z;", "Lfr/d0;", "coroutineScope", "Lfr/d0;", "", "sinkVisibilityMap", "Ljava/util/Map;", "<set-?>", "lastVisibility", "getLastVisibility", "getLastVisibility$annotations", "lastDimensions", "Lio/livekit/android/room/track/Track$Dimensions;", "getLastDimensions", "getLastDimensions$annotations", "Llivekit/org/webrtc/RtpReceiver;", "getReceiver$livekit_android_sdk_release", "()Llivekit/org/webrtc/RtpReceiver;", "setReceiver$livekit_android_sdk_release", "(Llivekit/org/webrtc/RtpReceiver;)V", "", "getVisibilities", "()Ljava/util/Collection;", "visibilities", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RemoteVideoTrack extends VideoTrack {
    private final boolean autoManageVideo;
    private d0 coroutineScope;
    private final z dispatcher;
    private Track.Dimensions lastDimensions;
    private boolean lastVisibility;
    private RtpReceiver receiver;
    private final Map<VideoSink, VideoSinkVisibility> sinkVisibilityMap;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lio/livekit/android/room/track/RemoteVideoTrack$Factory;", "", "create", "Lio/livekit/android/room/track/RemoteVideoTrack;", DiagnosticsEntry.NAME_KEY, "", "rtcTrack", "Llivekit/org/webrtc/VideoTrack;", "autoManageVideo", "", "receiver", "Llivekit/org/webrtc/RtpReceiver;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ RemoteVideoTrack create$default(Factory factory, String str, livekit.org.webrtc.VideoTrack videoTrack, boolean z6, RtpReceiver rtpReceiver, int i10, Object obj) {
                if (obj == null) {
                    if ((i10 & 4) != 0) {
                        z6 = false;
                    }
                    return factory.create(str, videoTrack, z6, rtpReceiver);
                }
                a9.a.y("Super calls with default arguments not supported in this target, function: create");
                return null;
            }
        }

        RemoteVideoTrack create(String name, livekit.org.webrtc.VideoTrack rtcTrack, boolean autoManageVideo, RtpReceiver receiver);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteVideoTrack(String str, livekit.org.webrtc.VideoTrack videoTrack, boolean z6, z zVar, RtpReceiver rtpReceiver, RTCThreadToken rTCThreadToken) {
        super(str, videoTrack, rTCThreadToken);
        str.getClass();
        videoTrack.getClass();
        zVar.getClass();
        rtpReceiver.getClass();
        rTCThreadToken.getClass();
        this.autoManageVideo = z6;
        this.dispatcher = zVar;
        this.coroutineScope = g0.c(zVar.plus(g0.f()));
        this.sinkVisibilityMap = new LinkedHashMap();
        this.lastDimensions = new Track.Dimensions(0, 0);
        this.receiver = rtpReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRenderer$lambda$1(RemoteVideoTrack remoteVideoTrack, Observable observable, Object obj) {
        remoteVideoTrack.getClass();
        remoteVideoTrack.recalculateVisibility();
    }

    private final Collection<VideoSinkVisibility> getVisibilities() {
        return this.sinkVisibilityMap.values();
    }

    private final boolean hasVisibleSinks() {
        boolean z6;
        synchronized (this.sinkVisibilityMap) {
            try {
                Collection<VideoSinkVisibility> visibilities = getVisibilities();
                z6 = false;
                if (!(visibilities instanceof Collection) || !visibilities.isEmpty()) {
                    Iterator<T> it = visibilities.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((VideoSinkVisibility) it.next()).isVisible()) {
                            z6 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    private final Track.Dimensions largestVideoViewSize() {
        int i10;
        int i11;
        synchronized (this.sinkVisibilityMap) {
            Iterator<T> it = getVisibilities().iterator();
            i10 = 0;
            i11 = 0;
            while (it.hasNext()) {
                Track.Dimensions size = ((VideoSinkVisibility) it.next()).size();
                i10 = Math.max(i10, size.getWidth());
                i11 = Math.max(i11, size.getHeight());
            }
        }
        return new Track.Dimensions(i10, i11);
    }

    private final void recalculateVisibility() {
        boolean hasVisibleSinks;
        Track.Dimensions largestVideoViewSize;
        synchronized (this.sinkVisibilityMap) {
            hasVisibleSinks = hasVisibleSinks();
            largestVideoViewSize = largestVideoViewSize();
        }
        ArrayList arrayList = new ArrayList();
        if (hasVisibleSinks != this.lastVisibility) {
            this.lastVisibility = hasVisibleSinks;
            arrayList.add(new TrackEvent.VisibilityChanged(this, hasVisibleSinks));
        }
        if (!m.c(largestVideoViewSize, this.lastDimensions)) {
            this.lastDimensions = largestVideoViewSize;
            arrayList.add(new TrackEvent.VideoDimensionsChanged(this, largestVideoViewSize));
        }
        if (o.i0(arrayList)) {
            g0.D(this.coroutineScope, null, null, new RemoteVideoTrack$recalculateVisibility$2(this, arrayList, null), 3);
        }
    }

    public final void addRenderer(VideoSink renderer, VideoSinkVisibility visibility) {
        renderer.getClass();
        visibility.getClass();
        super.addRenderer(renderer);
        if (this.autoManageVideo) {
            synchronized (this.sinkVisibilityMap) {
                this.sinkVisibilityMap.put(renderer, visibility);
            }
            visibility.addObserver(new Observer() { // from class: io.livekit.android.room.track.a
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    RemoteVideoTrack.addRenderer$lambda$1(RemoteVideoTrack.this, observable, obj);
                }
            });
            recalculateVisibility();
            return;
        }
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.f(null, "attempted to tracking video sink visibility on an non auto managed video track.", new Object[0]);
        }
    }

    @Override // io.livekit.android.room.track.Track
    public void dispose() {
        super.dispose();
        g0.i(this.coroutineScope, null);
    }

    public final boolean getAutoManageVideo() {
        return this.autoManageVideo;
    }

    public final Track.Dimensions getLastDimensions() {
        return this.lastDimensions;
    }

    public final boolean getLastVisibility() {
        return this.lastVisibility;
    }

    /* renamed from: getReceiver$livekit_android_sdk_release, reason: from getter */
    public final RtpReceiver getReceiver() {
        return this.receiver;
    }

    @Override // io.livekit.android.room.track.VideoTrack
    public void removeRenderer(VideoSink renderer) {
        VideoSinkVisibility remove;
        renderer.getClass();
        super.removeRenderer(renderer);
        synchronized (this.sinkVisibilityMap) {
            remove = this.sinkVisibilityMap.remove(renderer);
        }
        if (remove != null) {
            remove.close();
        }
        if (this.autoManageVideo && remove != null) {
            recalculateVisibility();
        }
    }

    public final void setReceiver$livekit_android_sdk_release(RtpReceiver rtpReceiver) {
        rtpReceiver.getClass();
        this.receiver = rtpReceiver;
    }

    @Override // io.livekit.android.room.track.VideoTrack, io.livekit.android.room.track.Track
    public void stop() {
        super.stop();
        synchronized (this.sinkVisibilityMap) {
            try {
                Iterator<T> it = this.sinkVisibilityMap.values().iterator();
                while (it.hasNext()) {
                    ((VideoSinkVisibility) it.next()).close();
                }
                this.sinkVisibilityMap.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void getLastDimensions$annotations() {
    }

    public static /* synthetic */ void getLastVisibility$annotations() {
    }

    public /* synthetic */ RemoteVideoTrack(String str, livekit.org.webrtc.VideoTrack videoTrack, boolean z6, z zVar, RtpReceiver rtpReceiver, RTCThreadToken rTCThreadToken, int i10, f fVar) {
        this(str, videoTrack, (i10 & 4) != 0 ? false : z6, zVar, rtpReceiver, rTCThreadToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.livekit.android.room.track.VideoTrack
    public void addRenderer(VideoSink renderer) {
        renderer.getClass();
        if (this.autoManageVideo && (renderer instanceof View)) {
            addRenderer(renderer, new ViewVisibility((View) renderer));
        } else {
            super.addRenderer(renderer);
        }
    }
}
