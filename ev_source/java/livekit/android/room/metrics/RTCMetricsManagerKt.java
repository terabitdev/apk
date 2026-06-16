package io.livekit.android.room.metrics;

import as.c7;
import as.j6;
import as.k6;
import as.m6;
import as.o6;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import et.d;
import fr.g0;
import fr.k1;
import fr.l;
import fr.n;
import gg.b;
import ig.f;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.Room;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitMetrics$MetricSample;
import livekit.LivekitMetrics$MetricsBatch;
import livekit.LivekitMetrics$TimeSeriesMetric;
import livekit.LivekitModels$DataPacket;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RTCStats;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RTCStatsReport;
import sn.k;
import sn.m;
import sn.z;
import tn.o;
import tn.t;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a \u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\b\u0010\u0006\u001a \u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\t\u0010\u0006\u001a@\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a8\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a8\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001c\u001a!\u0010\"\u001a\u00020!*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*\u001a>\u00101\u001a\u0004\u0018\u00010\u00122\u0006\u0010+\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aZ\u00109\u001a\u00020\u00122\u0006\u00103\u001a\u0002022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00104\u001a\b\u0012\u0004\u0012\u00020(0\u00112\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u0013\u0010:\u001a\u00020$*\u00020&H\u0002¢\u0006\u0004\b:\u0010;\"&\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b0<0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Lio/livekit/android/room/Room;", "room", "Lio/livekit/android/room/RTCEngine;", "rtcEngine", "Lfr/k1;", "collectMetrics", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/RTCEngine;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "collectPublisherMetrics", "collectSubscriberMetrics", "", "", "strings", "Llivekit/org/webrtc/RTCStatsReport;", "report", "Lio/livekit/android/room/participant/Participant$Identity;", "participantIdentity", "", "Llivekit/LivekitMetrics$TimeSeriesMetric;", "findPublisherVideoStats-PInpjGE", "(Ljava/util/List;Lio/livekit/android/room/Room;Llivekit/org/webrtc/RTCStatsReport;Ljava/lang/String;)Ljava/util/List;", "findPublisherVideoStats", "Llivekit/org/webrtc/RTCStats;", "mediaSources", "videoTrack", "getPublishVideoTrackSid", "(Lio/livekit/android/room/Room;Ljava/util/List;Llivekit/org/webrtc/RTCStats;)Ljava/lang/String;", "findSubscriberAudioStats-fuxFtts", "(Ljava/util/List;Llivekit/org/webrtc/RTCStatsReport;Ljava/lang/String;)Ljava/util/List;", "findSubscriberAudioStats", "findSubscriberVideoStats-fuxFtts", "findSubscriberVideoStats", "string", "", "getOrCreateIndex", "(Ljava/util/List;Ljava/lang/String;)I", "", "timestampMs", "", "value", "Llivekit/LivekitMetrics$MetricSample;", "createMetricSample", "(JLjava/lang/Number;)Llivekit/LivekitMetrics$MetricSample;", "stat", "Lio/livekit/android/room/metrics/RTCMetric;", "metric", "identity", "createTimeSeriesForMetric-PInpjGE", "(Llivekit/org/webrtc/RTCStats;Lio/livekit/android/room/metrics/RTCMetric;Ljava/util/List;Ljava/lang/String;)Llivekit/LivekitMetrics$TimeSeriesMetric;", "createTimeSeriesForMetric", "Las/j6;", Constants.ScionAnalytics.PARAM_LABEL, "samples", "trackSid", "rid", "createTimeSeries-q9XrzG4", "(Las/j6;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Llivekit/LivekitMetrics$TimeSeriesMetric;", "createTimeSeries", "microToMilli", "(Ljava/lang/Number;)J", "Lsn/k;", "qualityLimitations", "Ljava/util/List;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCMetricsManagerKt {
    private static final List<k> qualityLimitations = f.I(new k(RTCMetric.QUALITY_LIMITATION_DURATION_CPU, "cpu"), new k(RTCMetric.QUALITY_LIMITATION_DURATION_BANDWIDTH, "bandwidth"), new k(RTCMetric.QUALITY_LIMITATION_DURATION_OTHER, "other"));

    public static final Object collectMetrics(Room room, RTCEngine rTCEngine, c<? super k1> cVar) {
        return g0.l(new RTCMetricsManagerKt$collectMetrics$2(room, rTCEngine, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r14 != r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f8 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0113 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0119 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x011b -> B:19:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object collectPublisherMetrics(Room room, RTCEngine rTCEngine, c<? super z> cVar) {
        RTCMetricsManagerKt$collectPublisherMetrics$1 rTCMetricsManagerKt$collectPublisherMetrics$1;
        int i10;
        Room room2;
        RTCEngine rTCEngine2;
        Object m2529sendDatagIAlus$livekit_android_sdk_release;
        if (cVar instanceof RTCMetricsManagerKt$collectPublisherMetrics$1) {
            rTCMetricsManagerKt$collectPublisherMetrics$1 = (RTCMetricsManagerKt$collectPublisherMetrics$1) cVar;
            int i11 = rTCMetricsManagerKt$collectPublisherMetrics$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rTCMetricsManagerKt$collectPublisherMetrics$1.label = i11 - Integer.MIN_VALUE;
                Object obj = rTCMetricsManagerKt$collectPublisherMetrics$1.result;
                i10 = rTCMetricsManagerKt$collectPublisherMetrics$1.label;
                a aVar = a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                rTCEngine2 = (RTCEngine) rTCMetricsManagerKt$collectPublisherMetrics$1.L$1;
                                room2 = (Room) rTCMetricsManagerKt$collectPublisherMetrics$1.L$0;
                                try {
                                    sn.a.g(obj);
                                    m2529sendDatagIAlus$livekit_android_sdk_release = ((m) obj).f31603a;
                                } catch (Exception e10) {
                                    e = e10;
                                    Room room3 = room2;
                                    rTCEngine = rTCEngine2;
                                    room = room3;
                                    LKLog.Companion companion = LKLog.INSTANCE;
                                    if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                        d.c(e, "Error sending metrics: ", new Object[0]);
                                    }
                                    if (!g0.z(rTCMetricsManagerKt$collectPublisherMetrics$1.getContext())) {
                                    }
                                }
                                Room room4 = room2;
                                rTCEngine = rTCEngine2;
                                room = room4;
                                try {
                                } catch (Exception e11) {
                                    e = e11;
                                    LKLog.Companion companion2 = LKLog.INSTANCE;
                                    if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                                        d.c(e, "Error sending metrics: ", new Object[0]);
                                    }
                                    if (!g0.z(rTCMetricsManagerKt$collectPublisherMetrics$1.getContext())) {
                                    }
                                }
                                Throwable a10 = m.a(m2529sendDatagIAlus$livekit_android_sdk_release);
                                if (a10 == null) {
                                    if (!g0.z(rTCMetricsManagerKt$collectPublisherMetrics$1.getContext())) {
                                        rTCMetricsManagerKt$collectPublisherMetrics$1.L$0 = room;
                                        rTCMetricsManagerKt$collectPublisherMetrics$1.L$1 = rTCEngine;
                                        rTCMetricsManagerKt$collectPublisherMetrics$1.label = 1;
                                        if (g0.m(1000L, rTCMetricsManagerKt$collectPublisherMetrics$1) != aVar) {
                                            RTCEngine rTCEngine3 = rTCEngine;
                                            room2 = room;
                                            rTCEngine2 = rTCEngine3;
                                            rTCMetricsManagerKt$collectPublisherMetrics$1.L$0 = room2;
                                            rTCMetricsManagerKt$collectPublisherMetrics$1.L$1 = rTCEngine2;
                                            rTCMetricsManagerKt$collectPublisherMetrics$1.label = 2;
                                            final n nVar = new n(1, b.V(rTCMetricsManagerKt$collectPublisherMetrics$1));
                                            nVar.t();
                                            room2.getPublisherRTCStats(new RTCStatsCollectorCallback() { // from class: io.livekit.android.room.metrics.RTCMetricsManagerKt$collectPublisherMetrics$report$1$1
                                                @Override // livekit.org.webrtc.RTCStatsCollectorCallback
                                                public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                                                    l.this.resumeWith(rTCStatsReport);
                                                }
                                            });
                                            obj = nVar.s();
                                        }
                                        return aVar;
                                    }
                                    return z.f31622a;
                                }
                                throw a10;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rTCEngine2 = (RTCEngine) rTCMetricsManagerKt$collectPublisherMetrics$1.L$1;
                        room2 = (Room) rTCMetricsManagerKt$collectPublisherMetrics$1.L$0;
                        sn.a.g(obj);
                        RTCStatsReport rTCStatsReport = (RTCStatsReport) obj;
                        ArrayList arrayList = new ArrayList();
                        rTCStatsReport.getClass();
                        List<LivekitMetrics$TimeSeriesMetric> m2576findPublisherVideoStatsPInpjGE = m2576findPublisherVideoStatsPInpjGE(arrayList, room2, rTCStatsReport, room2.getLocalParticipant().m2596getIdentity4WamZwg());
                        livekit.a newBuilder = LivekitModels$DataPacket.newBuilder();
                        m6 newBuilder2 = LivekitMetrics$MetricsBatch.newBuilder();
                        newBuilder2.d(microToMilli(new Double(rTCStatsReport.getTimestampUs())));
                        newBuilder2.b(arrayList);
                        newBuilder2.c(m2576findPublisherVideoStatsPInpjGE);
                        newBuilder.g((LivekitMetrics$MetricsBatch) newBuilder2.build());
                        newBuilder.f(c7.RELIABLE);
                        LivekitModels$DataPacket livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder.build();
                        livekitModels$DataPacket.getClass();
                        rTCMetricsManagerKt$collectPublisherMetrics$1.L$0 = room2;
                        rTCMetricsManagerKt$collectPublisherMetrics$1.L$1 = rTCEngine2;
                        rTCMetricsManagerKt$collectPublisherMetrics$1.label = 3;
                        m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine2.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, rTCMetricsManagerKt$collectPublisherMetrics$1);
                    } else {
                        rTCEngine2 = (RTCEngine) rTCMetricsManagerKt$collectPublisherMetrics$1.L$1;
                        room2 = (Room) rTCMetricsManagerKt$collectPublisherMetrics$1.L$0;
                        sn.a.g(obj);
                        rTCMetricsManagerKt$collectPublisherMetrics$1.L$0 = room2;
                        rTCMetricsManagerKt$collectPublisherMetrics$1.L$1 = rTCEngine2;
                        rTCMetricsManagerKt$collectPublisherMetrics$1.label = 2;
                        final l nVar2 = new n(1, b.V(rTCMetricsManagerKt$collectPublisherMetrics$1));
                        nVar2.t();
                        room2.getPublisherRTCStats(new RTCStatsCollectorCallback() { // from class: io.livekit.android.room.metrics.RTCMetricsManagerKt$collectPublisherMetrics$report$1$1
                            @Override // livekit.org.webrtc.RTCStatsCollectorCallback
                            public final void onStatsDelivered(RTCStatsReport rTCStatsReport2) {
                                l.this.resumeWith(rTCStatsReport2);
                            }
                        });
                        obj = nVar2.s();
                    }
                } else {
                    sn.a.g(obj);
                    if (!g0.z(rTCMetricsManagerKt$collectPublisherMetrics$1.getContext())) {
                    }
                }
            }
        }
        rTCMetricsManagerKt$collectPublisherMetrics$1 = new RTCMetricsManagerKt$collectPublisherMetrics$1(cVar);
        Object obj2 = rTCMetricsManagerKt$collectPublisherMetrics$1.result;
        i10 = rTCMetricsManagerKt$collectPublisherMetrics$1.label;
        a aVar2 = a.f37986a;
        if (i10 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r14 != r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0108 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0123 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0129 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012b -> B:19:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object collectSubscriberMetrics(Room room, RTCEngine rTCEngine, c<? super z> cVar) {
        RTCMetricsManagerKt$collectSubscriberMetrics$1 rTCMetricsManagerKt$collectSubscriberMetrics$1;
        int i10;
        Room room2;
        RTCEngine rTCEngine2;
        Object m2529sendDatagIAlus$livekit_android_sdk_release;
        if (cVar instanceof RTCMetricsManagerKt$collectSubscriberMetrics$1) {
            rTCMetricsManagerKt$collectSubscriberMetrics$1 = (RTCMetricsManagerKt$collectSubscriberMetrics$1) cVar;
            int i11 = rTCMetricsManagerKt$collectSubscriberMetrics$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rTCMetricsManagerKt$collectSubscriberMetrics$1.label = i11 - Integer.MIN_VALUE;
                Object obj = rTCMetricsManagerKt$collectSubscriberMetrics$1.result;
                i10 = rTCMetricsManagerKt$collectSubscriberMetrics$1.label;
                a aVar = a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                rTCEngine2 = (RTCEngine) rTCMetricsManagerKt$collectSubscriberMetrics$1.L$1;
                                room2 = (Room) rTCMetricsManagerKt$collectSubscriberMetrics$1.L$0;
                                try {
                                    sn.a.g(obj);
                                    m2529sendDatagIAlus$livekit_android_sdk_release = ((m) obj).f31603a;
                                } catch (Exception e10) {
                                    e = e10;
                                    Room room3 = room2;
                                    rTCEngine = rTCEngine2;
                                    room = room3;
                                    LKLog.Companion companion = LKLog.INSTANCE;
                                    if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                        d.c(e, "Error sending metrics: ", new Object[0]);
                                    }
                                    if (!g0.z(rTCMetricsManagerKt$collectSubscriberMetrics$1.getContext())) {
                                    }
                                }
                                Room room4 = room2;
                                rTCEngine = rTCEngine2;
                                room = room4;
                                try {
                                } catch (Exception e11) {
                                    e = e11;
                                    LKLog.Companion companion2 = LKLog.INSTANCE;
                                    if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                                        d.c(e, "Error sending metrics: ", new Object[0]);
                                    }
                                    if (!g0.z(rTCMetricsManagerKt$collectSubscriberMetrics$1.getContext())) {
                                    }
                                }
                                Throwable a10 = m.a(m2529sendDatagIAlus$livekit_android_sdk_release);
                                if (a10 == null) {
                                    if (!g0.z(rTCMetricsManagerKt$collectSubscriberMetrics$1.getContext())) {
                                        rTCMetricsManagerKt$collectSubscriberMetrics$1.L$0 = room;
                                        rTCMetricsManagerKt$collectSubscriberMetrics$1.L$1 = rTCEngine;
                                        rTCMetricsManagerKt$collectSubscriberMetrics$1.label = 1;
                                        if (g0.m(1000L, rTCMetricsManagerKt$collectSubscriberMetrics$1) != aVar) {
                                            RTCEngine rTCEngine3 = rTCEngine;
                                            room2 = room;
                                            rTCEngine2 = rTCEngine3;
                                            rTCMetricsManagerKt$collectSubscriberMetrics$1.L$0 = room2;
                                            rTCMetricsManagerKt$collectSubscriberMetrics$1.L$1 = rTCEngine2;
                                            rTCMetricsManagerKt$collectSubscriberMetrics$1.label = 2;
                                            final n nVar = new n(1, b.V(rTCMetricsManagerKt$collectSubscriberMetrics$1));
                                            nVar.t();
                                            room2.getSubscriberRTCStats(new RTCStatsCollectorCallback() { // from class: io.livekit.android.room.metrics.RTCMetricsManagerKt$collectSubscriberMetrics$report$1$1
                                                @Override // livekit.org.webrtc.RTCStatsCollectorCallback
                                                public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                                                    l.this.resumeWith(rTCStatsReport);
                                                }
                                            });
                                            obj = nVar.s();
                                        }
                                        return aVar;
                                    }
                                    return z.f31622a;
                                }
                                throw a10;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rTCEngine2 = (RTCEngine) rTCMetricsManagerKt$collectSubscriberMetrics$1.L$1;
                        room2 = (Room) rTCMetricsManagerKt$collectSubscriberMetrics$1.L$0;
                        sn.a.g(obj);
                        RTCStatsReport rTCStatsReport = (RTCStatsReport) obj;
                        ArrayList arrayList = new ArrayList();
                        rTCStatsReport.getClass();
                        ArrayList O0 = o.O0(m2578findSubscriberVideoStatsfuxFtts(arrayList, rTCStatsReport, room2.getLocalParticipant().m2596getIdentity4WamZwg()), m2577findSubscriberAudioStatsfuxFtts(arrayList, rTCStatsReport, room2.getLocalParticipant().m2596getIdentity4WamZwg()));
                        livekit.a newBuilder = LivekitModels$DataPacket.newBuilder();
                        m6 newBuilder2 = LivekitMetrics$MetricsBatch.newBuilder();
                        newBuilder2.d(microToMilli(new Double(rTCStatsReport.getTimestampUs())));
                        newBuilder2.b(arrayList);
                        newBuilder2.c(O0);
                        newBuilder.g((LivekitMetrics$MetricsBatch) newBuilder2.build());
                        newBuilder.f(c7.RELIABLE);
                        LivekitModels$DataPacket livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder.build();
                        livekitModels$DataPacket.getClass();
                        rTCMetricsManagerKt$collectSubscriberMetrics$1.L$0 = room2;
                        rTCMetricsManagerKt$collectSubscriberMetrics$1.L$1 = rTCEngine2;
                        rTCMetricsManagerKt$collectSubscriberMetrics$1.label = 3;
                        m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine2.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, rTCMetricsManagerKt$collectSubscriberMetrics$1);
                    } else {
                        rTCEngine2 = (RTCEngine) rTCMetricsManagerKt$collectSubscriberMetrics$1.L$1;
                        room2 = (Room) rTCMetricsManagerKt$collectSubscriberMetrics$1.L$0;
                        sn.a.g(obj);
                        rTCMetricsManagerKt$collectSubscriberMetrics$1.L$0 = room2;
                        rTCMetricsManagerKt$collectSubscriberMetrics$1.L$1 = rTCEngine2;
                        rTCMetricsManagerKt$collectSubscriberMetrics$1.label = 2;
                        final l nVar2 = new n(1, b.V(rTCMetricsManagerKt$collectSubscriberMetrics$1));
                        nVar2.t();
                        room2.getSubscriberRTCStats(new RTCStatsCollectorCallback() { // from class: io.livekit.android.room.metrics.RTCMetricsManagerKt$collectSubscriberMetrics$report$1$1
                            @Override // livekit.org.webrtc.RTCStatsCollectorCallback
                            public final void onStatsDelivered(RTCStatsReport rTCStatsReport2) {
                                l.this.resumeWith(rTCStatsReport2);
                            }
                        });
                        obj = nVar2.s();
                    }
                } else {
                    sn.a.g(obj);
                    if (!g0.z(rTCMetricsManagerKt$collectSubscriberMetrics$1.getContext())) {
                    }
                }
            }
        }
        rTCMetricsManagerKt$collectSubscriberMetrics$1 = new RTCMetricsManagerKt$collectSubscriberMetrics$1(cVar);
        Object obj2 = rTCMetricsManagerKt$collectSubscriberMetrics$1.result;
        i10 = rTCMetricsManagerKt$collectSubscriberMetrics$1.label;
        a aVar2 = a.f37986a;
        if (i10 == 0) {
        }
    }

    private static final LivekitMetrics$MetricSample createMetricSample(long j4, Number number) {
        k6 newBuilder = LivekitMetrics$MetricSample.newBuilder();
        newBuilder.b(j4);
        newBuilder.c(number.floatValue());
        LivekitMetrics$MetricSample livekitMetrics$MetricSample = (LivekitMetrics$MetricSample) newBuilder.build();
        livekitMetrics$MetricSample.getClass();
        return livekitMetrics$MetricSample;
    }

    /* renamed from: createTimeSeries-q9XrzG4, reason: not valid java name */
    private static final LivekitMetrics$TimeSeriesMetric m2572createTimeSeriesq9XrzG4(j6 j6Var, List<String> list, List<LivekitMetrics$MetricSample> list2, String str, String str2, String str3) {
        o6 newBuilder = LivekitMetrics$TimeSeriesMetric.newBuilder();
        newBuilder.c(j6Var.getNumber());
        if (str != null) {
            newBuilder.d(getOrCreateIndex(list, str));
        }
        if (str2 != null) {
            newBuilder.f(getOrCreateIndex(list, str2));
        }
        if (str3 != null) {
            newBuilder.e(getOrCreateIndex(list, str3));
        }
        newBuilder.b(list2);
        LivekitMetrics$TimeSeriesMetric livekitMetrics$TimeSeriesMetric = (LivekitMetrics$TimeSeriesMetric) newBuilder.build();
        livekitMetrics$TimeSeriesMetric.getClass();
        return livekitMetrics$TimeSeriesMetric;
    }

    /* renamed from: createTimeSeries-q9XrzG4$default, reason: not valid java name */
    public static /* synthetic */ LivekitMetrics$TimeSeriesMetric m2573createTimeSeriesq9XrzG4$default(j6 j6Var, List list, List list2, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        return m2572createTimeSeriesq9XrzG4(j6Var, list, list2, str, str2, str3);
    }

    /* renamed from: createTimeSeriesForMetric-PInpjGE, reason: not valid java name */
    private static final LivekitMetrics$TimeSeriesMetric m2574createTimeSeriesForMetricPInpjGE(RTCStats rTCStats, RTCMetric rTCMetric, List<String> list, String str) {
        Number number;
        String str2;
        Object obj = rTCStats.getMembers().get(rTCMetric.getStatKey());
        String str3 = null;
        if (obj instanceof Number) {
            number = (Number) obj;
        } else {
            number = null;
        }
        if (number == null) {
            return null;
        }
        Object obj2 = rTCStats.getMembers().get("trackIdentifier");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        Object obj3 = rTCStats.getMembers().get("rid");
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        }
        return m2572createTimeSeriesq9XrzG4(rTCMetric.getProtoLabel(), list, f.H(createMetricSample(microToMilli(Double.valueOf(rTCStats.getTimestampUs())), number)), str, str2, str3);
    }

    /* renamed from: createTimeSeriesForMetric-PInpjGE$default, reason: not valid java name */
    public static /* synthetic */ LivekitMetrics$TimeSeriesMetric m2575createTimeSeriesForMetricPInpjGE$default(RTCStats rTCStats, RTCMetric rTCMetric, List list, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return m2574createTimeSeriesForMetricPInpjGE(rTCStats, rTCMetric, list, str);
    }

    /* renamed from: findPublisherVideoStats-PInpjGE, reason: not valid java name */
    private static final List<LivekitMetrics$TimeSeriesMetric> m2576findPublisherVideoStatsPInpjGE(List<String> list, Room room, RTCStatsReport rTCStatsReport, String str) {
        Map map;
        String str2;
        Number number;
        String str3;
        List<String> list2;
        LivekitMetrics$TimeSeriesMetric m2572createTimeSeriesq9XrzG4;
        Collection<RTCStats> values = rTCStatsReport.getStatsMap().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            RTCStats rTCStats = (RTCStats) obj;
            if (kotlin.jvm.internal.m.c(rTCStats.getType(), "media-source") && kotlin.jvm.internal.m.c(rTCStats.getMembers().get("kind"), "video")) {
                arrayList.add(obj);
            }
        }
        Collection<RTCStats> values2 = rTCStatsReport.getStatsMap().values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : values2) {
            RTCStats rTCStats2 = (RTCStats) obj2;
            if (kotlin.jvm.internal.m.c(rTCStats2.getType(), "outbound-rtp") && kotlin.jvm.internal.m.c(rTCStats2.getMembers().get("kind"), "video")) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            RTCStats rTCStats3 = (RTCStats) it.next();
            rTCStats3.getClass();
            arrayList3.add(new k(rTCStats3, getPublishVideoTrackSid(room, arrayList, rTCStats3)));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            RTCStats rTCStats4 = (RTCStats) kVar.f31600a;
            String str4 = (String) kVar.f31601b;
            Object obj3 = rTCStats4.getMembers().get("qualityLimitationDurations");
            if (obj3 instanceof Map) {
                map = (Map) obj3;
            } else {
                map = null;
            }
            if (map == null) {
                return t.f33547a;
            }
            Object obj4 = rTCStats4.getMembers().get("rid");
            if (obj4 instanceof String) {
                str2 = (String) obj4;
            } else {
                str2 = null;
            }
            List<k> list3 = qualityLimitations;
            ArrayList arrayList5 = new ArrayList();
            for (k kVar2 : list3) {
                RTCMetric rTCMetric = (RTCMetric) kVar2.f31600a;
                Object obj5 = map.get((String) kVar2.f31601b);
                if (obj5 instanceof Number) {
                    number = (Number) obj5;
                } else {
                    number = null;
                }
                if (number == null) {
                    list2 = list;
                    str3 = str;
                    m2572createTimeSeriesq9XrzG4 = null;
                } else {
                    str3 = str;
                    list2 = list;
                    m2572createTimeSeriesq9XrzG4 = m2572createTimeSeriesq9XrzG4(rTCMetric.getProtoLabel(), list2, f.H(createMetricSample(microToMilli(Double.valueOf(rTCStats4.getTimestampUs())), number)), str3, str4, str2);
                }
                if (m2572createTimeSeriesq9XrzG4 != null) {
                    arrayList5.add(m2572createTimeSeriesq9XrzG4);
                }
                list = list2;
                str = str3;
            }
            o.g0(arrayList5, arrayList4);
        }
        return arrayList4;
    }

    /* renamed from: findSubscriberAudioStats-fuxFtts, reason: not valid java name */
    private static final List<LivekitMetrics$TimeSeriesMetric> m2577findSubscriberAudioStatsfuxFtts(List<String> list, RTCStatsReport rTCStatsReport, String str) {
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        statsMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, RTCStats> entry : statsMap.entrySet()) {
            RTCStats value = entry.getValue();
            if (kotlin.jvm.internal.m.c(value.getType(), "inbound-rtp") && kotlin.jvm.internal.m.c(value.getMembers().get("kind"), "audio")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection<RTCStats> values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (RTCStats rTCStats : values) {
            List<RTCMetric> I = f.I(RTCMetric.CONCEALED_SAMPLES, RTCMetric.CONCEALMENT_EVENTS, RTCMetric.SILENT_CONCEALED_SAMPLES, RTCMetric.JITTER_BUFFER_DELAY, RTCMetric.JITTER_BUFFER_EMITTED_COUNT);
            ArrayList arrayList2 = new ArrayList();
            for (RTCMetric rTCMetric : I) {
                rTCStats.getClass();
                LivekitMetrics$TimeSeriesMetric m2574createTimeSeriesForMetricPInpjGE = m2574createTimeSeriesForMetricPInpjGE(rTCStats, rTCMetric, list, str);
                if (m2574createTimeSeriesForMetricPInpjGE != null) {
                    arrayList2.add(m2574createTimeSeriesForMetricPInpjGE);
                }
            }
            o.g0(arrayList2, arrayList);
        }
        return arrayList;
    }

    /* renamed from: findSubscriberVideoStats-fuxFtts, reason: not valid java name */
    private static final List<LivekitMetrics$TimeSeriesMetric> m2578findSubscriberVideoStatsfuxFtts(List<String> list, RTCStatsReport rTCStatsReport, String str) {
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        statsMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, RTCStats> entry : statsMap.entrySet()) {
            RTCStats value = entry.getValue();
            if (kotlin.jvm.internal.m.c(value.getType(), "inbound-rtp") && kotlin.jvm.internal.m.c(value.getMembers().get("kind"), "video")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection<RTCStats> values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (RTCStats rTCStats : values) {
            List<RTCMetric> I = f.I(RTCMetric.FREEZE_COUNT, RTCMetric.TOTAL_FREEZES_DURATION, RTCMetric.PAUSE_COUNT, RTCMetric.TOTAL_PAUSES_DURATION, RTCMetric.JITTER_BUFFER_DELAY, RTCMetric.JITTER_BUFFER_EMITTED_COUNT);
            ArrayList arrayList2 = new ArrayList();
            for (RTCMetric rTCMetric : I) {
                rTCStats.getClass();
                LivekitMetrics$TimeSeriesMetric m2574createTimeSeriesForMetricPInpjGE = m2574createTimeSeriesForMetricPInpjGE(rTCStats, rTCMetric, list, str);
                if (m2574createTimeSeriesForMetricPInpjGE != null) {
                    arrayList2.add(m2574createTimeSeriesForMetricPInpjGE);
                }
            }
            o.g0(arrayList2, arrayList);
        }
        return arrayList;
    }

    private static final int getOrCreateIndex(List<String> list, String str) {
        int indexOf = list.indexOf(str);
        if (indexOf == -1) {
            list.add(str);
            indexOf = list.size() - 1;
        }
        return j6.METRIC_LABEL_PREDEFINED_MAX_VALUE.getNumber() + indexOf;
    }

    private static final String getPublishVideoTrackSid(Room room, List<? extends RTCStats> list, RTCStats rTCStats) {
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        MediaStreamTrack rtcTrack;
        Object obj4 = rTCStats.getMembers().get("mediaSourceId");
        if (obj4 == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.m.c(((RTCStats) obj).getId(), obj4)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        RTCStats rTCStats2 = (RTCStats) obj;
        if (rTCStats2 == null || (obj2 = rTCStats2.getMembers().get("trackIdentifier")) == null) {
            return null;
        }
        Iterator<T> it2 = room.getLocalParticipant().getVideoTrackPublications().iterator();
        while (true) {
            if (it2.hasNext()) {
                obj3 = it2.next();
                Track track = (Track) ((k) obj3).f31601b;
                if (track != null && (rtcTrack = track.getRtcTrack()) != null) {
                    str = rtcTrack.id();
                } else {
                    str = null;
                }
                if (kotlin.jvm.internal.m.c(str, obj2)) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        k kVar = (k) obj3;
        if (kVar == null) {
            return null;
        }
        return ((TrackPublication) kVar.f31600a).getSid();
    }

    private static final long microToMilli(Number number) {
        return number.longValue();
    }
}
