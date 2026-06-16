package io.livekit.android.room.track;

import android.gov.nist.javax.sip.parser.TokenNames;
import as.ad;
import as.d9;
import as.e9;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ho.l;
import ib.i;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.TrackEvent;
import io.livekit.android.room.SignalClient;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.MutableStateFlowDelegate;
import io.livekit.android.webrtc.RTCStatsExtKt;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import j0.c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RTCStatsReport;
import oo.u;
import rd.c1;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u00002\u00020\u0001:\u0004UVWXB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J<\u0010\u001c\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00172\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u001a\u0010\u001bJD\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u001d\u001a\u00028\u00002\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0018H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u001a\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020&0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R*\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R.\u0010;\u001a\u0004\u0018\u00010\u00022\b\u00100\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105R+\u0010E\u001a\u00020>2\u0006\u00100\u001a\u00020>8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR6\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018j\u0004\u0018\u0001`F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010\u001bR$\u0010R\u001a\u00020L2\u0006\u0010M\u001a\u00020L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010O\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Y"}, d2 = {"Lio/livekit/android/room/track/Track;", "", "", DiagnosticsEntry.NAME_KEY, "Lio/livekit/android/room/track/Track$Kind;", "kind", "Llivekit/org/webrtc/MediaStreamTrack;", "rtcTrack", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Ljava/lang/String;Lio/livekit/android/room/track/Track$Kind;Llivekit/org/webrtc/MediaStreamTrack;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "Llivekit/org/webrtc/RTCStatsReport;", "getRTCStats", "(Lwn/c;)Ljava/lang/Object;", "Llivekit/org/webrtc/RTCStatsCollectorCallback;", "callback", "Lsn/z;", "(Llivekit/org/webrtc/RTCStatsCollectorCallback;)V", "start", "()V", "stop", "dispose", TokenNames.T, "Lkotlin/Function1;", "action", "withRTCTrack$livekit_android_sdk_release", "(Lho/l;)V", "withRTCTrack", "defaultValue", "(Ljava/lang/Object;Lho/l;)Ljava/lang/Object;", "Llivekit/org/webrtc/MediaStreamTrack;", "getRtcTrack", "()Llivekit/org/webrtc/MediaStreamTrack;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "getRtcThreadToken", "()Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "Lio/livekit/android/events/BroadcastEventBus;", "Lio/livekit/android/events/TrackEvent;", "eventBus", "Lio/livekit/android/events/BroadcastEventBus;", "getEventBus", "()Lio/livekit/android/events/BroadcastEventBus;", "Lio/livekit/android/events/EventListenable;", "events", "Lio/livekit/android/events/EventListenable;", "getEvents", "()Lio/livekit/android/events/EventListenable;", "<set-?>", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName$livekit_android_sdk_release", "(Ljava/lang/String;)V", "Lio/livekit/android/room/track/Track$Kind;", "getKind", "()Lio/livekit/android/room/track/Track$Kind;", "setKind$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track$Kind;)V", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "getSid", "setSid$livekit_android_sdk_release", "Lio/livekit/android/room/track/Track$StreamState;", "streamState$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getStreamState", "()Lio/livekit/android/room/track/Track$StreamState;", "setStreamState$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track$StreamState;)V", "streamState", "Lio/livekit/android/webrtc/RTCStatsGetter;", "statsGetter", "Lho/l;", "getStatsGetter", "()Lho/l;", "setStatsGetter", "", "value", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "isDisposed$livekit_android_sdk_release", "isDisposed", "Dimensions", "Kind", "Source", "StreamState", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class Track {
    static final /* synthetic */ u[] $$delegatedProperties = {e0.f20562a.e(new q(Track.class, "streamState", "getStreamState()Lio/livekit/android/room/track/Track$StreamState;", 0))};
    private final BroadcastEventBus<TrackEvent> eventBus;
    private final EventListenable<TrackEvent> events;
    private Kind kind;
    private String name;
    private final RTCThreadToken rtcThreadToken;
    private final MediaStreamTrack rtcTrack;
    private String sid;
    private l statsGetter;

    /* renamed from: streamState$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate streamState;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/livekit/android/room/track/Track$Dimensions;", "", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Dimensions {
        private final int height;
        private final int width;

        public Dimensions(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static /* synthetic */ Dimensions copy$default(Dimensions dimensions, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = dimensions.width;
            }
            if ((i12 & 2) != 0) {
                i11 = dimensions.height;
            }
            return dimensions.copy(i10, i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final Dimensions copy(int width, int height) {
            return new Dimensions(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dimensions)) {
                return false;
            }
            Dimensions dimensions = (Dimensions) other;
            if (this.width == dimensions.width && this.height == dimensions.height) {
                return true;
            }
            return false;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Dimensions(width=");
            sb.append(this.width);
            sb.append(", height=");
            return c.m(sb, this.height, ')');
        }
    }

    public Track(String str, Kind kind, MediaStreamTrack mediaStreamTrack, RTCThreadToken rTCThreadToken) {
        str.getClass();
        kind.getClass();
        mediaStreamTrack.getClass();
        rTCThreadToken.getClass();
        this.rtcTrack = mediaStreamTrack;
        this.rtcThreadToken = rTCThreadToken;
        BroadcastEventBus<TrackEvent> broadcastEventBus = new BroadcastEventBus<>();
        this.eventBus = broadcastEventBus;
        this.events = broadcastEventBus.readOnly();
        this.name = str;
        this.kind = kind;
        this.streamState = FlowDelegateKt.flowDelegate(StreamState.PAUSED, new Track$streamState$2(this));
    }

    public void dispose() {
        if (!isDisposed$livekit_android_sdk_release()) {
            final RTCThreadToken rtcThreadToken = getRtcThreadToken();
            if (!rtcThreadToken.isDisposed()) {
                if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                    if (isDisposed$livekit_android_sdk_release()) {
                        return;
                    }
                    getRtcTrack();
                    getRtcTrack().dispose();
                    return;
                }
                ExecutorService access$getExecutor$p = RTCThreadUtilsKt.access$getExecutor$p();
                final z zVar = z.f31622a;
                access$getExecutor$p.submit(new Callable() { // from class: io.livekit.android.room.track.Track$dispose$$inlined$withRTCTrack$livekit_android_sdk_release$1
                    /* JADX WARN: Type inference failed for: r0v8, types: [sn.z, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final z call() {
                        if (RTCThreadToken.this.isDisposed()) {
                            return null;
                        }
                        if (this.isDisposed$livekit_android_sdk_release()) {
                            return zVar;
                        }
                        this.getRtcTrack();
                        this.getRtcTrack().dispose();
                        return z.f31622a;
                    }
                }).get();
            }
        }
    }

    public final boolean getEnabled() {
        Object obj;
        final Object obj2 = Boolean.FALSE;
        if (!isDisposed$livekit_android_sdk_release()) {
            final RTCThreadToken rtcThreadToken = getRtcThreadToken();
            if (rtcThreadToken.isDisposed()) {
                obj = null;
            } else if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                if (isDisposed$livekit_android_sdk_release()) {
                    obj = obj2;
                } else {
                    getRtcTrack();
                    obj = Boolean.valueOf(getRtcTrack().enabled());
                }
            } else {
                obj = RTCThreadUtilsKt.access$getExecutor$p().submit(new Callable() { // from class: io.livekit.android.room.track.Track$special$$inlined$withRTCTrack$livekit_android_sdk_release$1
                    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final Boolean call() {
                        if (RTCThreadToken.this.isDisposed()) {
                            return null;
                        }
                        if (this.isDisposed$livekit_android_sdk_release()) {
                            return obj2;
                        }
                        this.getRtcTrack();
                        return Boolean.valueOf(this.getRtcTrack().enabled());
                    }
                }).get();
            }
            if (obj != null) {
                obj2 = obj;
            }
        }
        return ((Boolean) obj2).booleanValue();
    }

    public final BroadcastEventBus<TrackEvent> getEventBus() {
        return this.eventBus;
    }

    public final EventListenable<TrackEvent> getEvents() {
        return this.events;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public final void getRTCStats(RTCStatsCollectorCallback callback) {
        z zVar;
        callback.getClass();
        l lVar = this.statsGetter;
        if (lVar != null) {
            lVar.invoke(callback);
            zVar = z.f31622a;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            callback.onStatsDelivered(null);
        }
    }

    public final RTCThreadToken getRtcThreadToken() {
        return this.rtcThreadToken;
    }

    public MediaStreamTrack getRtcTrack() {
        return this.rtcTrack;
    }

    public final String getSid() {
        return this.sid;
    }

    public final l getStatsGetter() {
        return this.statsGetter;
    }

    public final StreamState getStreamState() {
        return (StreamState) this.streamState.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean isDisposed$livekit_android_sdk_release() {
        return getRtcTrack().isDisposed();
    }

    public final void setEnabled(final boolean z6) {
        if (!isDisposed$livekit_android_sdk_release()) {
            final RTCThreadToken rtcThreadToken = getRtcThreadToken();
            if (!rtcThreadToken.isDisposed()) {
                if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                    if (isDisposed$livekit_android_sdk_release()) {
                        return;
                    }
                    getRtcTrack();
                    getRtcTrack().setEnabled(z6);
                    return;
                }
                ExecutorService access$getExecutor$p = RTCThreadUtilsKt.access$getExecutor$p();
                final z zVar = z.f31622a;
                access$getExecutor$p.submit(new Callable() { // from class: io.livekit.android.room.track.Track$special$$inlined$withRTCTrack$livekit_android_sdk_release$2
                    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final Boolean call() {
                        if (RTCThreadToken.this.isDisposed()) {
                            return null;
                        }
                        if (this.isDisposed$livekit_android_sdk_release()) {
                            return zVar;
                        }
                        this.getRtcTrack();
                        return Boolean.valueOf(this.getRtcTrack().setEnabled(z6));
                    }
                }).get();
            }
        }
    }

    public final void setKind$livekit_android_sdk_release(Kind kind) {
        kind.getClass();
        this.kind = kind;
    }

    public final void setName$livekit_android_sdk_release(String str) {
        str.getClass();
        this.name = str;
    }

    public final void setSid$livekit_android_sdk_release(String str) {
        this.sid = str;
    }

    public final void setStatsGetter(l lVar) {
        this.statsGetter = lVar;
    }

    public final void setStreamState$livekit_android_sdk_release(StreamState streamState) {
        streamState.getClass();
        this.streamState.setValue(this, $$delegatedProperties[0], streamState);
    }

    public void start() {
        setEnabled(true);
    }

    public void stop() {
        setEnabled(false);
    }

    public final <T> T withRTCTrack$livekit_android_sdk_release(T defaultValue, l action) {
        T t10;
        action.getClass();
        if (!isDisposed$livekit_android_sdk_release()) {
            RTCThreadToken rtcThreadToken = getRtcThreadToken();
            if (rtcThreadToken.isDisposed()) {
                t10 = null;
            } else if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                if (isDisposed$livekit_android_sdk_release()) {
                    t10 = defaultValue;
                } else {
                    t10 = (T) action.invoke(getRtcTrack());
                }
            } else {
                t10 = RTCThreadUtilsKt.access$getExecutor$p().submit(new Track$withRTCTrack$$inlined$executeBlockingOnRTCThread$1(rtcThreadToken, this, defaultValue, action)).get();
            }
            if (t10 != null) {
                return t10;
            }
        }
        return defaultValue;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/livekit/android/room/track/Track$Kind;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Las/e9;", "toProto", "()Las/e9;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "AUDIO", "VIDEO", "UNRECOGNIZED", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Kind {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final Kind AUDIO = new Kind("AUDIO", 0, "audio");
        public static final Kind VIDEO = new Kind("VIDEO", 1, "video");
        public static final Kind UNRECOGNIZED = new Kind("UNRECOGNIZED", 2, "unrecognized");

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Kind.values().length];
                try {
                    iArr[Kind.AUDIO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Kind.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Kind.UNRECOGNIZED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{AUDIO, VIDEO, UNRECOGNIZED};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
            INSTANCE = new Companion(null);
        }

        private Kind(String str, int i10, String str2) {
            this.value = str2;
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public final e9 toProto() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return e9.UNRECOGNIZED;
                    }
                    c6.p();
                    return null;
                }
                return e9.VIDEO;
            }
            return e9.AUDIO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/room/track/Track$Kind$Companion;", "", "<init>", "()V", "Las/e9;", "tt", "Lio/livekit/android/room/track/Track$Kind;", "fromProto", "(Las/e9;)Lio/livekit/android/room/track/Track$Kind;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[e9.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final Kind fromProto(e9 tt) {
                tt.getClass();
                int ordinal = tt.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2 && ordinal != 3) {
                            c6.p();
                            return null;
                        }
                        return Kind.UNRECOGNIZED;
                    }
                    return Kind.VIDEO;
                }
                return Kind.AUDIO;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/livekit/android/room/track/Track$Source;", "", "<init>", "(Ljava/lang/String;I)V", "Las/d9;", "toProto", "()Las/d9;", "Companion", "UNKNOWN", "CAMERA", "MICROPHONE", "SCREEN_SHARE", "SCREEN_SHARE_AUDIO", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Source {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Source UNKNOWN = new Source("UNKNOWN", 0);
        public static final Source CAMERA = new Source("CAMERA", 1);
        public static final Source MICROPHONE = new Source("MICROPHONE", 2);
        public static final Source SCREEN_SHARE = new Source("SCREEN_SHARE", 3);
        public static final Source SCREEN_SHARE_AUDIO = new Source("SCREEN_SHARE_AUDIO", 4);

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Source.values().length];
                try {
                    iArr[Source.UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Source.CAMERA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Source.MICROPHONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Source.SCREEN_SHARE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Source.SCREEN_SHARE_AUDIO.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{UNKNOWN, CAMERA, MICROPHONE, SCREEN_SHARE, SCREEN_SHARE_AUDIO};
        }

        static {
            Source[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
            INSTANCE = new Companion(null);
        }

        private Source(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }

        public final d9 toProto() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return d9.SCREEN_SHARE_AUDIO;
                            }
                            c6.p();
                            return null;
                        }
                        return d9.SCREEN_SHARE;
                    }
                    return d9.MICROPHONE;
                }
                return d9.CAMERA;
            }
            return d9.UNKNOWN;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/room/track/Track$Source$Companion;", "", "<init>", "()V", "Las/d9;", "source", "Lio/livekit/android/room/track/Track$Source;", "fromProto", "(Las/d9;)Lio/livekit/android/room/track/Track$Source;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[d9.values().length];
                    try {
                        iArr[1] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[2] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[3] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[4] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[0] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[5] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final Source fromProto(d9 source) {
                source.getClass();
                int ordinal = source.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal != 5) {
                                        c6.p();
                                        return null;
                                    }
                                } else {
                                    return Source.SCREEN_SHARE_AUDIO;
                                }
                            } else {
                                return Source.SCREEN_SHARE;
                            }
                        } else {
                            return Source.MICROPHONE;
                        }
                    } else {
                        return Source.CAMERA;
                    }
                }
                return Source.UNKNOWN;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/room/track/Track$StreamState;", "", "<init>", "(Ljava/lang/String;I)V", "Las/ad;", "toProto", "()Las/ad;", "Companion", "ACTIVE", "PAUSED", "UNKNOWN", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class StreamState {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ StreamState[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final StreamState ACTIVE = new StreamState("ACTIVE", 0);
        public static final StreamState PAUSED = new StreamState("PAUSED", 1);
        public static final StreamState UNKNOWN = new StreamState("UNKNOWN", 2);

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StreamState.values().length];
                try {
                    iArr[StreamState.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StreamState.PAUSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StreamState.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ StreamState[] $values() {
            return new StreamState[]{ACTIVE, PAUSED, UNKNOWN};
        }

        static {
            StreamState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
            INSTANCE = new Companion(null);
        }

        private StreamState(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) $VALUES.clone();
        }

        public final ad toProto() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return ad.UNRECOGNIZED;
                    }
                    c6.p();
                    return null;
                }
                return ad.PAUSED;
            }
            return ad.ACTIVE;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/room/track/Track$StreamState$Companion;", "", "<init>", "()V", "Las/ad;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/livekit/android/room/track/Track$StreamState;", "fromProto", "(Las/ad;)Lio/livekit/android/room/track/Track$StreamState;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ad.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final StreamState fromProto(ad state) {
                state.getClass();
                int ordinal = state.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return StreamState.UNKNOWN;
                        }
                        c6.p();
                        return null;
                    }
                    return StreamState.PAUSED;
                }
                return StreamState.ACTIVE;
            }

            private Companion() {
            }
        }
    }

    public final Object getRTCStats(wn.c<? super RTCStatsReport> cVar) {
        l lVar = this.statsGetter;
        if (lVar == null) {
            return null;
        }
        Object stats = RTCStatsExtKt.getStats(lVar, cVar);
        return stats == xn.a.f37986a ? stats : (RTCStatsReport) stats;
    }

    public final <T> void withRTCTrack$livekit_android_sdk_release(l action) {
        action.getClass();
        if (isDisposed$livekit_android_sdk_release()) {
            return;
        }
        RTCThreadToken rtcThreadToken = getRtcThreadToken();
        if (rtcThreadToken.isDisposed()) {
            return;
        }
        if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
            if (isDisposed$livekit_android_sdk_release()) {
                return;
            }
            action.invoke(getRtcTrack());
            return;
        }
        RTCThreadUtilsKt.access$getExecutor$p().submit(new Track$withRTCTrack$$inlined$executeBlockingOnRTCThread$1(rtcThreadToken, this, z.f31622a, action)).get();
    }
}
