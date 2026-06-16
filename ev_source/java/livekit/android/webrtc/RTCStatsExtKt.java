package io.livekit.android.webrtc;

import android.gov.nist.javax.sip.header.ParameterNames;
import fr.n;
import ho.l;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RTCStats;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RTCStatsReport;
import tn.o;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a-\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\f\u001ae\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a$\u0010\u001b\u001a\u00020\u0000*\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017j\u0002`\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u001c*\"\u0010\u001d\"\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¨\u0006\u001e"}, d2 = {"Llivekit/org/webrtc/RTCStatsReport;", "Llivekit/org/webrtc/MediaStreamTrack;", "track", "getFilteredStats", "(Llivekit/org/webrtc/RTCStatsReport;Llivekit/org/webrtc/MediaStreamTrack;)Llivekit/org/webrtc/RTCStatsReport;", "", "trackIdentifier", "(Llivekit/org/webrtc/RTCStatsReport;Ljava/lang/String;)Llivekit/org/webrtc/RTCStatsReport;", "", "Llivekit/org/webrtc/RTCStats;", "statsMap", "getTrackStats", "(Ljava/lang/String;Ljava/util/Map;)Llivekit/org/webrtc/RTCStats;", "trackId", "getStreamStats", "", "", "ssrcs", "codecIds", "localCandidateId", "remoteCandidateId", "getExtraStats", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Set;", "Lkotlin/Function1;", "Llivekit/org/webrtc/RTCStatsCollectorCallback;", "Lsn/z;", "Lio/livekit/android/webrtc/RTCStatsGetter;", "getStats", "(Lho/l;Lwn/c;)Ljava/lang/Object;", "RTCStatsGetter", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCStatsExtKt {
    private static final Set<RTCStats> getExtraStats(String str, Set<Long> set, Set<String> set2, String str2, String str3, Map<String, ? extends RTCStats> map) {
        boolean c5;
        HashSet hashSet = new HashSet();
        for (RTCStats rTCStats : map.values()) {
            String type = rTCStats.getType();
            if (m.c(type, "certificate")) {
                c5 = true;
            } else {
                c5 = m.c(type, ParameterNames.TRANSPORT);
            }
            if (c5) {
                hashSet.add(rTCStats);
            }
            if (!m.c(rTCStats.getId(), str2) && !m.c(rTCStats.getId(), str3)) {
                if (o.m0(set, rTCStats.getMembers().get("ssrc"))) {
                    hashSet.add(rTCStats);
                } else if (m.c(str, rTCStats.getMembers().get("trackIdentifier"))) {
                    hashSet.add(rTCStats);
                } else if (set2.contains(rTCStats.getId())) {
                    hashSet.add(rTCStats);
                }
            } else {
                hashSet.add(rTCStats);
            }
        }
        return hashSet;
    }

    public static final RTCStatsReport getFilteredStats(RTCStatsReport rTCStatsReport, String str) {
        RTCStats rTCStats;
        String str2;
        rTCStatsReport.getClass();
        str.getClass();
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        LinkedHashSet<RTCStats> linkedHashSet = new LinkedHashSet();
        statsMap.getClass();
        RTCStats trackStats = getTrackStats(str, statsMap);
        if (trackStats == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.c(null, "getStats: couldn't find track stats!", new Object[0]);
            }
            return new RTCStatsReport((long) rTCStatsReport.getTimestampUs(), new HashMap());
        }
        linkedHashSet.add(trackStats);
        String id2 = trackStats.getId();
        id2.getClass();
        RTCStats streamStats = getStreamStats(id2, statsMap);
        if (streamStats != null) {
            linkedHashSet.add(streamStats);
        }
        HashSet hashSet = new HashSet();
        String str3 = null;
        HashSet hashSet2 = new HashSet();
        for (RTCStats rTCStats2 : statsMap.values()) {
            if (m.c(rTCStats2.getType(), "inbound-rtp") || m.c(rTCStats2.getType(), "outbound-rtp")) {
                if (id2.equals(rTCStats2.getMembers().get("trackId"))) {
                    hashSet.add((Long) rTCStats2.getMembers().get("ssrc"));
                    hashSet2.add((String) rTCStats2.getMembers().get("codecId"));
                    linkedHashSet.add(rTCStats2);
                }
            }
        }
        Iterator<RTCStats> it = statsMap.values().iterator();
        while (true) {
            if (it.hasNext()) {
                rTCStats = it.next();
                if (m.c(rTCStats.getType(), "candidate-pair") && m.c(rTCStats.getMembers().get("nominated"), Boolean.TRUE)) {
                    break;
                }
            } else {
                rTCStats = null;
                break;
            }
        }
        if (rTCStats != null) {
            linkedHashSet.add(rTCStats);
            String str4 = (String) rTCStats.getMembers().get("localCandidateId");
            str2 = (String) rTCStats.getMembers().get("remoteCandidateId");
            str3 = str4;
        } else {
            str2 = null;
        }
        linkedHashSet.addAll(getExtraStats(str, hashSet, hashSet2, str3, str2, statsMap));
        HashMap hashMap = new HashMap();
        for (RTCStats rTCStats3 : linkedHashSet) {
            String id3 = rTCStats3.getId();
            id3.getClass();
            hashMap.put(id3, rTCStats3);
        }
        return new RTCStatsReport((long) rTCStatsReport.getTimestampUs(), hashMap);
    }

    public static final Object getStats(l lVar, wn.c<? super RTCStatsReport> cVar) {
        final n nVar = new n(1, gg.b.V(cVar));
        nVar.t();
        lVar.invoke(new RTCStatsCollectorCallback() { // from class: io.livekit.android.webrtc.RTCStatsExtKt$getStats$2$listener$1
            @Override // livekit.org.webrtc.RTCStatsCollectorCallback
            public final void onStatsDelivered(RTCStatsReport rTCStatsReport) {
                fr.l.this.resumeWith(rTCStatsReport);
            }
        });
        return nVar.s();
    }

    private static final RTCStats getStreamStats(String str, Map<String, ? extends RTCStats> map) {
        List list;
        Iterator<? extends RTCStats> it = map.values().iterator();
        while (true) {
            Object[] objArr = null;
            if (!it.hasNext()) {
                return null;
            }
            RTCStats next = it.next();
            if (m.c(next.getType(), "stream")) {
                Object obj = next.getMembers().get("trackIds");
                if (obj instanceof Object[]) {
                    objArr = (Object[]) obj;
                }
                if (objArr != null) {
                    list = tn.n.d1(objArr);
                } else {
                    list = t.f33547a;
                }
                if (list.contains(str)) {
                    return next;
                }
            }
        }
    }

    private static final RTCStats getTrackStats(String str, Map<String, ? extends RTCStats> map) {
        for (RTCStats rTCStats : map.values()) {
            if (m.c(rTCStats.getType(), "track") && m.c(str, rTCStats.getMembers().get("trackIdentifier"))) {
                return rTCStats;
            }
        }
        return null;
    }

    public static final RTCStatsReport getFilteredStats(RTCStatsReport rTCStatsReport, MediaStreamTrack mediaStreamTrack) {
        rTCStatsReport.getClass();
        mediaStreamTrack.getClass();
        String id2 = mediaStreamTrack.id();
        id2.getClass();
        return getFilteredStats(rTCStatsReport, id2);
    }
}
