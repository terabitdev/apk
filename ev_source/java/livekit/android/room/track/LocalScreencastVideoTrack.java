package io.livekit.android.room.track;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.media.projection.MediaProjection;
import android.util.DisplayMetrics;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import et.d;
import ho.l;
import io.livekit.android.room.DefaultsManager;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.room.track.screencapture.ScreenCaptureConnection;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.ScreenCapturerAndroid;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoProcessor;
import livekit.org.webrtc.VideoSource;
import sn.k;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00015\u0018\u0000 ;2\u00020\u0001:\u0003;<=Bu\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J$\u0010)\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\u001c2\b\u0010(\u001a\u0004\u0018\u00010'H\u0086@¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0016\u0010,\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lio/livekit/android/room/track/LocalScreencastVideoTrack;", "Lio/livekit/android/room/track/LocalVideoTrack;", "Llivekit/org/webrtc/VideoCapturer;", "capturer", "Llivekit/org/webrtc/VideoSource;", "source", "", DiagnosticsEntry.NAME_KEY, "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "options", "Llivekit/org/webrtc/VideoTrack;", "rtcTrack", "Lio/livekit/android/room/track/LocalScreencastVideoTrack$MediaProjectionCallback;", "mediaProjectionCallback", "Llivekit/org/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Landroid/content/Context;", "context", "Llivekit/org/webrtc/EglBase;", "eglBase", "Lio/livekit/android/room/DefaultsManager;", "defaultsManager", "Lio/livekit/android/room/track/LocalVideoTrack$Factory;", "videoTrackFactory", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Llivekit/org/webrtc/VideoCapturer;Llivekit/org/webrtc/VideoSource;Ljava/lang/String;Lio/livekit/android/room/track/LocalVideoTrackOptions;Llivekit/org/webrtc/VideoTrack;Lio/livekit/android/room/track/LocalScreencastVideoTrack$MediaProjectionCallback;Llivekit/org/webrtc/PeerConnectionFactory;Landroid/content/Context;Llivekit/org/webrtc/EglBase;Lio/livekit/android/room/DefaultsManager;Lio/livekit/android/room/track/LocalVideoTrack$Factory;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "", "displayWidth", "displayHeight", "Lsn/k;", "getCaptureDimensions", "(II)Lsn/k;", "Lsn/z;", "updateCaptureFormatIfNeeded", "()V", "startCapture", "notificationId", "Landroid/app/Notification;", "notification", "startForegroundService", "(Ljava/lang/Integer;Landroid/app/Notification;Lwn/c;)Ljava/lang/Object;", "stop", "prevDisplayWidth", TokenNames.I, "prevDisplayHeight", "Landroid/util/DisplayMetrics;", "displayMetrics", "Landroid/util/DisplayMetrics;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "io/livekit/android/room/track/LocalScreencastVideoTrack$orientationEventListener$1", "orientationEventListener", "Lio/livekit/android/room/track/LocalScreencastVideoTrack$orientationEventListener$1;", "Lio/livekit/android/room/track/screencapture/ScreenCaptureConnection;", "serviceConnection", "Lio/livekit/android/room/track/screencapture/ScreenCaptureConnection;", "Companion", "Factory", "MediaProjectionCallback", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalScreencastVideoTrack extends LocalVideoTrack {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DisplayMetrics displayMetrics;
    private final LocalScreencastVideoTrack$orientationEventListener$1 orientationEventListener;
    private int prevDisplayHeight;
    private int prevDisplayWidth;
    private final ScreenCaptureConnection serviceConnection;
    private final WindowManager windowManager;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/track/LocalScreencastVideoTrack$Factory;", "", "create", "Lio/livekit/android/room/track/LocalScreencastVideoTrack;", "capturer", "Llivekit/org/webrtc/VideoCapturer;", "source", "Llivekit/org/webrtc/VideoSource;", DiagnosticsEntry.NAME_KEY, "", "options", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "rtcTrack", "Llivekit/org/webrtc/VideoTrack;", "mediaProjectionCallback", "Lio/livekit/android/room/track/LocalScreencastVideoTrack$MediaProjectionCallback;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        LocalScreencastVideoTrack create(VideoCapturer capturer, VideoSource source, String name, LocalVideoTrackOptions options, livekit.org.webrtc.VideoTrack rtcTrack, MediaProjectionCallback mediaProjectionCallback);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/livekit/android/room/track/LocalScreencastVideoTrack$MediaProjectionCallback;", "Landroid/media/projection/MediaProjection$Callback;", "<init>", "()V", "Lkotlin/Function1;", "Lio/livekit/android/room/track/Track;", "Lsn/z;", "callback", "addOnStopCallback", "(Lho/l;)V", "onStop", "track", "Lio/livekit/android/room/track/Track;", "getTrack", "()Lio/livekit/android/room/track/Track;", "setTrack", "(Lio/livekit/android/room/track/Track;)V", "", "onStopCallbacks", "Ljava/util/List;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class MediaProjectionCallback extends MediaProjection.Callback {
        private final List<l> onStopCallbacks = new ArrayList();
        private Track track;

        public final void addOnStopCallback(l callback) {
            callback.getClass();
            this.onStopCallbacks.add(callback);
        }

        public final Track getTrack() {
            return this.track;
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            for (l lVar : this.onStopCallbacks) {
                Track track = this.track;
                track.getClass();
                lVar.invoke(track);
            }
        }

        public final void setTrack(Track track) {
            this.track = track;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v5, types: [io.livekit.android.room.track.LocalScreencastVideoTrack$orientationEventListener$1] */
    public LocalScreencastVideoTrack(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, MediaProjectionCallback mediaProjectionCallback, PeerConnectionFactory peerConnectionFactory, final Context context, EglBase eglBase, DefaultsManager defaultsManager, LocalVideoTrack.Factory factory, RTCThreadToken rTCThreadToken) {
        super(videoCapturer, videoSource, str, localVideoTrackOptions, videoTrack, peerConnectionFactory, context, eglBase, defaultsManager, factory, null, rTCThreadToken, UserMetadata.MAX_ATTRIBUTE_SIZE, null);
        videoCapturer.getClass();
        videoSource.getClass();
        str.getClass();
        localVideoTrackOptions.getClass();
        videoTrack.getClass();
        mediaProjectionCallback.getClass();
        peerConnectionFactory.getClass();
        context.getClass();
        eglBase.getClass();
        defaultsManager.getClass();
        factory.getClass();
        rTCThreadToken.getClass();
        this.displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        this.windowManager = (WindowManager) systemService;
        this.orientationEventListener = new OrientationEventListener(context) { // from class: io.livekit.android.room.track.LocalScreencastVideoTrack$orientationEventListener$1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                if (!this.isDisposed$livekit_android_sdk_release()) {
                    this.updateCaptureFormatIfNeeded();
                } else {
                    disable();
                }
            }
        };
        this.serviceConnection = new ScreenCaptureConnection(context);
        mediaProjectionCallback.setTrack(this);
        mediaProjectionCallback.addOnStopCallback(new LocalScreencastVideoTrack$1$1(this));
    }

    private final k getCaptureDimensions(int displayWidth, int displayHeight) {
        if (getOptions().getCaptureParams().getWidth() != 0 || getOptions().getCaptureParams().getHeight() != 0) {
            if (displayWidth > displayHeight) {
                displayWidth = getOptions().getCaptureParams().getWidth();
                displayHeight = getOptions().getCaptureParams().getHeight();
            } else {
                displayWidth = getOptions().getCaptureParams().getHeight();
                displayHeight = getOptions().getCaptureParams().getWidth();
            }
        }
        return new k(Integer.valueOf(displayWidth), Integer.valueOf(displayHeight));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCaptureFormatIfNeeded() {
        this.windowManager.getDefaultDisplay().getRealMetrics(this.displayMetrics);
        DisplayMetrics displayMetrics = this.displayMetrics;
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        if (i10 != this.prevDisplayWidth || i11 != this.prevDisplayHeight) {
            this.prevDisplayWidth = i10;
            this.prevDisplayHeight = i11;
            k captureDimensions = getCaptureDimensions(i10, i11);
            try {
                getCapturer().changeCaptureFormat(((Number) captureDimensions.f31600a).intValue(), ((Number) captureDimensions.f31601b).intValue(), getOptions().getCaptureParams().getMaxFps());
            } catch (Exception e10) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.f(e10, "Exception when changing capture format of the screen share track.", new Object[0]);
                }
            }
        }
    }

    @Override // io.livekit.android.room.track.LocalVideoTrack
    public void startCapture() {
        this.windowManager.getDefaultDisplay().getRealMetrics(this.displayMetrics);
        DisplayMetrics displayMetrics = this.displayMetrics;
        k captureDimensions = getCaptureDimensions(displayMetrics.widthPixels, displayMetrics.heightPixels);
        getCapturer().startCapture(((Number) captureDimensions.f31600a).intValue(), ((Number) captureDimensions.f31601b).intValue(), getOptions().getCaptureParams().getMaxFps());
        if (canDetectOrientation()) {
            enable();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startForegroundService(Integer num, Notification notification, c<? super z> cVar) {
        LocalScreencastVideoTrack$startForegroundService$1 localScreencastVideoTrack$startForegroundService$1;
        int i10;
        LocalScreencastVideoTrack localScreencastVideoTrack;
        if (cVar instanceof LocalScreencastVideoTrack$startForegroundService$1) {
            localScreencastVideoTrack$startForegroundService$1 = (LocalScreencastVideoTrack$startForegroundService$1) cVar;
            int i11 = localScreencastVideoTrack$startForegroundService$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localScreencastVideoTrack$startForegroundService$1.label = i11 - Integer.MIN_VALUE;
                Object obj = localScreencastVideoTrack$startForegroundService$1.result;
                i10 = localScreencastVideoTrack$startForegroundService$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        notification = (Notification) localScreencastVideoTrack$startForegroundService$1.L$2;
                        num = (Integer) localScreencastVideoTrack$startForegroundService$1.L$1;
                        localScreencastVideoTrack = (LocalScreencastVideoTrack) localScreencastVideoTrack$startForegroundService$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ScreenCaptureConnection screenCaptureConnection = this.serviceConnection;
                    localScreencastVideoTrack$startForegroundService$1.L$0 = this;
                    localScreencastVideoTrack$startForegroundService$1.L$1 = num;
                    localScreencastVideoTrack$startForegroundService$1.L$2 = notification;
                    localScreencastVideoTrack$startForegroundService$1.label = 1;
                    Object connect = screenCaptureConnection.connect(localScreencastVideoTrack$startForegroundService$1);
                    xn.a aVar = xn.a.f37986a;
                    if (connect == aVar) {
                        return aVar;
                    }
                    localScreencastVideoTrack = this;
                }
                localScreencastVideoTrack.serviceConnection.startForeground(num, notification);
                return z.f31622a;
            }
        }
        localScreencastVideoTrack$startForegroundService$1 = new LocalScreencastVideoTrack$startForegroundService$1(this, cVar);
        Object obj2 = localScreencastVideoTrack$startForegroundService$1.result;
        i10 = localScreencastVideoTrack$startForegroundService$1.label;
        if (i10 == 0) {
        }
        localScreencastVideoTrack.serviceConnection.startForeground(num, notification);
        return z.f31622a;
    }

    @Override // io.livekit.android.room.track.LocalVideoTrack, io.livekit.android.room.track.VideoTrack, io.livekit.android.room.track.Track
    public void stop() {
        super.stop();
        this.serviceConnection.stop();
        disable();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJe\u0010!\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0000¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lio/livekit/android/room/track/LocalScreencastVideoTrack$Companion;", "", "<init>", "()V", "Landroid/content/Intent;", "resultData", "Lio/livekit/android/room/track/LocalScreencastVideoTrack$MediaProjectionCallback;", "callback", "Llivekit/org/webrtc/ScreenCapturerAndroid;", "createScreenCapturer", "(Landroid/content/Intent;Lio/livekit/android/room/track/LocalScreencastVideoTrack$MediaProjectionCallback;)Llivekit/org/webrtc/ScreenCapturerAndroid;", "mediaProjectionPermissionResultData", "Llivekit/org/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Landroid/content/Context;", "context", "", DiagnosticsEntry.NAME_KEY, "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "options", "Llivekit/org/webrtc/EglBase;", "rootEglBase", "Lio/livekit/android/room/track/LocalScreencastVideoTrack$Factory;", "screencastVideoTrackFactory", "Llivekit/org/webrtc/VideoProcessor;", "videoProcessor", "Lkotlin/Function1;", "Lio/livekit/android/room/track/Track;", "Lsn/z;", "onStop", "Lio/livekit/android/room/track/LocalScreencastVideoTrack;", "createTrack$livekit_android_sdk_release", "(Landroid/content/Intent;Llivekit/org/webrtc/PeerConnectionFactory;Landroid/content/Context;Ljava/lang/String;Lio/livekit/android/room/track/LocalVideoTrackOptions;Llivekit/org/webrtc/EglBase;Lio/livekit/android/room/track/LocalScreencastVideoTrack$Factory;Llivekit/org/webrtc/VideoProcessor;Lho/l;)Lio/livekit/android/room/track/LocalScreencastVideoTrack;", "createTrack", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final ScreenCapturerAndroid createScreenCapturer(Intent resultData, MediaProjectionCallback callback) {
            return new ScreenCapturerAndroid(resultData, callback);
        }

        public final LocalScreencastVideoTrack createTrack$livekit_android_sdk_release(Intent mediaProjectionPermissionResultData, PeerConnectionFactory peerConnectionFactory, Context context, String name, LocalVideoTrackOptions options, EglBase rootEglBase, Factory screencastVideoTrackFactory, VideoProcessor videoProcessor, l onStop) {
            mediaProjectionPermissionResultData.getClass();
            peerConnectionFactory.getClass();
            context.getClass();
            name.getClass();
            options.getClass();
            rootEglBase.getClass();
            screencastVideoTrackFactory.getClass();
            onStop.getClass();
            VideoSource createVideoSource = peerConnectionFactory.createVideoSource(options.isScreencast());
            createVideoSource.setVideoProcessor(videoProcessor);
            MediaProjectionCallback mediaProjectionCallback = new MediaProjectionCallback();
            mediaProjectionCallback.addOnStopCallback(onStop);
            ScreenCapturerAndroid createScreenCapturer = createScreenCapturer(mediaProjectionPermissionResultData, mediaProjectionCallback);
            createScreenCapturer.initialize(SurfaceTextureHelper.create("ScreenVideoCaptureThread", rootEglBase.getEglBaseContext()), context, createVideoSource.getCapturerObserver());
            livekit.org.webrtc.VideoTrack createVideoTrack = peerConnectionFactory.createVideoTrack(UUID.randomUUID().toString(), createVideoSource);
            createVideoTrack.getClass();
            return screencastVideoTrackFactory.create(createScreenCapturer, createVideoSource, name, options, createVideoTrack, mediaProjectionCallback);
        }

        private Companion() {
        }
    }
}
