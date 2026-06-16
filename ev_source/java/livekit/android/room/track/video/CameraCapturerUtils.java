package io.livekit.android.room.track.video;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import et.d;
import ho.p;
import io.livekit.android.room.track.CameraPosition;
import io.livekit.android.room.track.LocalVideoTrackOptions;
import io.livekit.android.room.track.video.CameraCapturerUtils;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.Camera1Capturer;
import livekit.org.webrtc.Camera1Enumerator;
import livekit.org.webrtc.Camera1Helper;
import livekit.org.webrtc.Camera2Capturer;
import livekit.org.webrtc.Camera2Enumerator;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.VideoCapturer;
import sn.h;
import sn.k;
import tn.o;
import wn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005*\u0002\u000e\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002./B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u001eJ5\u0010&\u001a\u0004\u0018\u00010%*\u00020\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J/\u0010&\u001a\u0004\u0018\u00010%*\u00020\u00192\u001a\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020#0(¢\u0006\u0004\b&\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lio/livekit/android/room/track/video/CameraCapturerUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraProvider;", "provider", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "options", "Lsn/k;", "Llivekit/org/webrtc/VideoCapturer;", "createCameraCapturer", "(Landroid/content/Context;Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraProvider;Lio/livekit/android/room/track/LocalVideoTrackOptions;)Lsn/k;", "io/livekit/android/room/track/video/CameraCapturerUtils$createCamera1Provider$1", "createCamera1Provider", "()Lio/livekit/android/room/track/video/CameraCapturerUtils$createCamera1Provider$1;", "io/livekit/android/room/track/video/CameraCapturerUtils$createCamera2Provider$1", "createCamera2Provider", "()Lio/livekit/android/room/track/video/CameraCapturerUtils$createCamera2Provider$1;", "cameraProvider", "Lsn/z;", "registerCameraProvider", "(Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraProvider;)V", "unregisterCameraProvider", "Llivekit/org/webrtc/CameraEnumerator;", "createCameraEnumerator", "(Landroid/content/Context;)Llivekit/org/webrtc/CameraEnumerator;", "getCameraProvider", "(Landroid/content/Context;)Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraProvider;", "(Landroid/content/Context;Lio/livekit/android/room/track/LocalVideoTrackOptions;)Lsn/k;", "", "deviceId", "Lio/livekit/android/room/track/CameraPosition;", "position", "", "fallback", "Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraDeviceInfo;", "findCamera", "(Llivekit/org/webrtc/CameraEnumerator;Ljava/lang/String;Lio/livekit/android/room/track/CameraPosition;Z)Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraDeviceInfo;", "Lkotlin/Function2;", "predicate", "(Llivekit/org/webrtc/CameraEnumerator;Lho/p;)Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraDeviceInfo;", "", "cameraProviders", "Ljava/util/List;", "CameraDeviceInfo", "CameraProvider", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CameraCapturerUtils {
    public static final CameraCapturerUtils INSTANCE;
    private static final List<CameraProvider> cameraProviders;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraDeviceInfo;", "", "deviceId", "", "position", "Lio/livekit/android/room/track/CameraPosition;", "(Ljava/lang/String;Lio/livekit/android/room/track/CameraPosition;)V", "getDeviceId", "()Ljava/lang/String;", "getPosition", "()Lio/livekit/android/room/track/CameraPosition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class CameraDeviceInfo {
        private final String deviceId;
        private final CameraPosition position;

        public CameraDeviceInfo(String str, CameraPosition cameraPosition) {
            str.getClass();
            this.deviceId = str;
            this.position = cameraPosition;
        }

        public static /* synthetic */ CameraDeviceInfo copy$default(CameraDeviceInfo cameraDeviceInfo, String str, CameraPosition cameraPosition, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cameraDeviceInfo.deviceId;
            }
            if ((i10 & 2) != 0) {
                cameraPosition = cameraDeviceInfo.position;
            }
            return cameraDeviceInfo.copy(str, cameraPosition);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: component2, reason: from getter */
        public final CameraPosition getPosition() {
            return this.position;
        }

        public final CameraDeviceInfo copy(String deviceId, CameraPosition position) {
            deviceId.getClass();
            return new CameraDeviceInfo(deviceId, position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraDeviceInfo)) {
                return false;
            }
            CameraDeviceInfo cameraDeviceInfo = (CameraDeviceInfo) other;
            if (m.c(this.deviceId, cameraDeviceInfo.deviceId) && this.position == cameraDeviceInfo.position) {
                return true;
            }
            return false;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final CameraPosition getPosition() {
            return this.position;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.deviceId.hashCode() * 31;
            CameraPosition cameraPosition = this.position;
            if (cameraPosition == null) {
                hashCode = 0;
            } else {
                hashCode = cameraPosition.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "CameraDeviceInfo(deviceId=" + this.deviceId + ", position=" + this.position + ')';
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"Lio/livekit/android/room/track/video/CameraCapturerUtils$CameraProvider;", "", "cameraVersion", "", "getCameraVersion", "()I", "isSupported", "", "context", "Landroid/content/Context;", "provideCapturer", "Llivekit/org/webrtc/VideoCapturer;", "options", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "eventsHandler", "Lio/livekit/android/room/track/video/CameraEventsDispatchHandler;", "provideEnumerator", "Llivekit/org/webrtc/CameraEnumerator;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface CameraProvider {
        int getCameraVersion();

        boolean isSupported(Context context);

        VideoCapturer provideCapturer(Context context, LocalVideoTrackOptions options, CameraEventsDispatchHandler eventsHandler);

        CameraEnumerator provideEnumerator(Context context);
    }

    static {
        CameraCapturerUtils cameraCapturerUtils = new CameraCapturerUtils();
        INSTANCE = cameraCapturerUtils;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cameraCapturerUtils.createCamera1Provider());
        arrayList.add(cameraCapturerUtils.createCamera2Provider());
        cameraProviders = arrayList;
    }

    private CameraCapturerUtils() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.livekit.android.room.track.video.CameraCapturerUtils$createCamera1Provider$1] */
    private final CameraCapturerUtils$createCamera1Provider$1 createCamera1Provider() {
        return new CameraProvider() { // from class: io.livekit.android.room.track.video.CameraCapturerUtils$createCamera1Provider$1

            /* renamed from: enumerator$delegate, reason: from kotlin metadata */
            private final h enumerator = sn.a.e(CameraCapturerUtils$createCamera1Provider$1$enumerator$2.INSTANCE);
            private final int cameraVersion = 1;

            private final Camera1Enumerator getEnumerator() {
                return (Camera1Enumerator) this.enumerator.getValue();
            }

            @Override // io.livekit.android.room.track.video.CameraCapturerUtils.CameraProvider
            public int getCameraVersion() {
                return this.cameraVersion;
            }

            @Override // io.livekit.android.room.track.video.CameraCapturerUtils.CameraProvider
            public boolean isSupported(Context context) {
                context.getClass();
                return true;
            }

            @Override // io.livekit.android.room.track.video.CameraCapturerUtils.CameraProvider
            public VideoCapturer provideCapturer(Context context, LocalVideoTrackOptions options, CameraEventsDispatchHandler eventsHandler) {
                String str;
                String str2;
                context.getClass();
                options.getClass();
                eventsHandler.getClass();
                CameraCapturerUtils.CameraDeviceInfo findCamera$default = CameraCapturerUtils.findCamera$default(CameraCapturerUtils.INSTANCE, getEnumerator(), options.getDeviceId(), options.getPosition(), false, 4, null);
                Camera1Helper.Companion companion = Camera1Helper.INSTANCE;
                String str3 = null;
                if (findCamera$default != null) {
                    str = findCamera$default.getDeviceId();
                } else {
                    str = null;
                }
                companion.getSupportedFormats(companion.getCameraId(str));
                Camera1Enumerator enumerator = getEnumerator();
                if (findCamera$default != null) {
                    str2 = findCamera$default.getDeviceId();
                } else {
                    str2 = null;
                }
                CameraVideoCapturer createCapturer = enumerator.createCapturer(str2, eventsHandler);
                createCapturer.getClass();
                Camera1Capturer camera1Capturer = (Camera1Capturer) createCapturer;
                if (findCamera$default != null) {
                    str3 = findCamera$default.getDeviceId();
                }
                return new Camera1CapturerWithSize(camera1Capturer, str3, eventsHandler);
            }

            @Override // io.livekit.android.room.track.video.CameraCapturerUtils.CameraProvider
            public Camera1Enumerator provideEnumerator(Context context) {
                context.getClass();
                return getEnumerator();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.livekit.android.room.track.video.CameraCapturerUtils$createCamera2Provider$1] */
    private final CameraCapturerUtils$createCamera2Provider$1 createCamera2Provider() {
        return new CameraProvider() { // from class: io.livekit.android.room.track.video.CameraCapturerUtils$createCamera2Provider$1
            private final int cameraVersion = 2;
            private Camera2Enumerator enumerator;

            @Override // io.livekit.android.room.track.video.CameraCapturerUtils.CameraProvider
            public int getCameraVersion() {
                return this.cameraVersion;
            }

            @Override // io.livekit.android.room.track.video.CameraCapturerUtils.CameraProvider
            public boolean isSupported(Context context) {
                context.getClass();
                return Camera2Enumerator.isSupported(context);
            }

            @Override // io.livekit.android.room.track.video.CameraCapturerUtils.CameraProvider
            public VideoCapturer provideCapturer(Context context, LocalVideoTrackOptions options, CameraEventsDispatchHandler eventsHandler) {
                String str;
                context.getClass();
                options.getClass();
                eventsHandler.getClass();
                CameraEnumerator provideEnumerator = provideEnumerator(context);
                CameraCapturerUtils.CameraDeviceInfo findCamera$default = CameraCapturerUtils.findCamera$default(CameraCapturerUtils.INSTANCE, provideEnumerator, options.getDeviceId(), options.getPosition(), false, 4, null);
                String str2 = null;
                if (findCamera$default != null) {
                    str = findCamera$default.getDeviceId();
                } else {
                    str = null;
                }
                CameraVideoCapturer createCapturer = provideEnumerator.createCapturer(str, eventsHandler);
                createCapturer.getClass();
                Camera2Capturer camera2Capturer = (Camera2Capturer) createCapturer;
                Object systemService = context.getSystemService("camera");
                systemService.getClass();
                CameraManager cameraManager = (CameraManager) systemService;
                if (findCamera$default != null) {
                    str2 = findCamera$default.getDeviceId();
                }
                return new Camera2CapturerWithSize(camera2Capturer, cameraManager, str2, eventsHandler);
            }

            @Override // io.livekit.android.room.track.video.CameraCapturerUtils.CameraProvider
            public CameraEnumerator provideEnumerator(Context context) {
                context.getClass();
                Camera2Enumerator camera2Enumerator = this.enumerator;
                if (camera2Enumerator != null) {
                    return camera2Enumerator;
                }
                Camera2Enumerator camera2Enumerator2 = new Camera2Enumerator(context);
                this.enumerator = camera2Enumerator2;
                return camera2Enumerator2;
            }
        };
    }

    private final k createCameraCapturer(Context context, CameraProvider provider, LocalVideoTrackOptions options) {
        CameraEnumerator provideEnumerator = provider.provideEnumerator(context);
        CameraEventsDispatchHandler cameraEventsDispatchHandler = new CameraEventsDispatchHandler();
        CameraDeviceInfo findCamera$default = findCamera$default(this, provideEnumerator, options.getDeviceId(), options.getPosition(), false, 4, null);
        if (findCamera$default == null) {
            return null;
        }
        VideoCapturer provideCapturer = provider.provideCapturer(context, options, cameraEventsDispatchHandler);
        LocalVideoTrackOptions copy$default = LocalVideoTrackOptions.copy$default(options, false, findCamera$default.getDeviceId(), findCamera$default.getPosition(), null, 9, null);
        if (!(provideCapturer instanceof VideoCapturerWithSize)) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "unknown CameraCapturer class: " + provideCapturer.getClass().getCanonicalName() + ". Reported dimensions may be inaccurate.", new Object[0]);
            }
        }
        return new k(provideCapturer, copy$default);
    }

    public static /* synthetic */ CameraDeviceInfo findCamera$default(CameraCapturerUtils cameraCapturerUtils, CameraEnumerator cameraEnumerator, String str, CameraPosition cameraPosition, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            cameraPosition = null;
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        return cameraCapturerUtils.findCamera(cameraEnumerator, str, cameraPosition, z6);
    }

    public final CameraEnumerator createCameraEnumerator(Context context) {
        context.getClass();
        return getCameraProvider(context).provideEnumerator(context);
    }

    public final CameraDeviceInfo findCamera(CameraEnumerator cameraEnumerator, p pVar) {
        cameraEnumerator.getClass();
        pVar.getClass();
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        deviceNames.getClass();
        int length = deviceNames.length;
        int i10 = 0;
        while (true) {
            CameraPosition cameraPosition = null;
            if (i10 >= length) {
                return null;
            }
            String str = deviceNames[i10];
            if (cameraEnumerator.isFrontFacing(str)) {
                cameraPosition = CameraPosition.FRONT;
            } else if (cameraEnumerator.isBackFacing(str)) {
                cameraPosition = CameraPosition.BACK;
            }
            str.getClass();
            if (((Boolean) pVar.invoke(str, cameraPosition)).booleanValue()) {
                return new CameraDeviceInfo(str, cameraPosition);
            }
            i10++;
        }
    }

    public final CameraProvider getCameraProvider(Context context) {
        context.getClass();
        for (CameraProvider cameraProvider : o.a1(new Comparator() { // from class: io.livekit.android.room.track.video.CameraCapturerUtils$getCameraProvider$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.g(Integer.valueOf(((CameraCapturerUtils.CameraProvider) t11).getCameraVersion()), Integer.valueOf(((CameraCapturerUtils.CameraProvider) t10).getCameraVersion()));
            }
        }, cameraProviders)) {
            if (cameraProvider.isSupported(context)) {
                return cameraProvider;
            }
        }
        wq.a.h("Collection contains no element matching the predicate.");
        return null;
    }

    public final void registerCameraProvider(CameraProvider cameraProvider) {
        cameraProvider.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.a(null, "Registering camera provider: Camera version:" + cameraProvider.getCameraVersion(), new Object[0]);
        }
        cameraProviders.add(cameraProvider);
    }

    public final void unregisterCameraProvider(CameraProvider cameraProvider) {
        cameraProvider.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.a(null, "Removing camera provider: Camera version:" + cameraProvider.getCameraVersion(), new Object[0]);
        }
        cameraProviders.remove(cameraProvider);
    }

    public final CameraDeviceInfo findCamera(CameraEnumerator cameraEnumerator, String str, CameraPosition cameraPosition, boolean z6) {
        cameraEnumerator.getClass();
        CameraDeviceInfo findCamera = str != null ? findCamera(cameraEnumerator, new CameraCapturerUtils$findCamera$1(str)) : null;
        if (findCamera == null && cameraPosition != null) {
            findCamera = findCamera(cameraEnumerator, new CameraCapturerUtils$findCamera$2(cameraPosition));
        }
        return (findCamera == null && z6) ? findCamera(cameraEnumerator, CameraCapturerUtils$findCamera$3.INSTANCE) : findCamera;
    }

    public final k createCameraCapturer(Context context, LocalVideoTrackOptions options) {
        context.getClass();
        options.getClass();
        k createCameraCapturer = createCameraCapturer(context, getCameraProvider(context), options);
        if (createCameraCapturer != null) {
            return createCameraCapturer;
        }
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.a(null, "Failed to open camera", new Object[0]);
        }
        return null;
    }
}
