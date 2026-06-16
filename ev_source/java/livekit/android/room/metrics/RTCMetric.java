package io.livekit.android.room.metrics;

import as.j6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lio/livekit/android/room/metrics/RTCMetric;", "", "Las/j6;", "protoLabel", "", "statKey", "<init>", "(Ljava/lang/String;ILas/j6;Ljava/lang/String;)V", "Las/j6;", "getProtoLabel", "()Las/j6;", "Ljava/lang/String;", "getStatKey", "()Ljava/lang/String;", "FREEZE_COUNT", "TOTAL_FREEZES_DURATION", "PAUSE_COUNT", "TOTAL_PAUSES_DURATION", "CONCEALED_SAMPLES", "SILENT_CONCEALED_SAMPLES", "CONCEALMENT_EVENTS", "JITTER_BUFFER_DELAY", "JITTER_BUFFER_EMITTED_COUNT", "QUALITY_LIMITATION_DURATION_BANDWIDTH", "QUALITY_LIMITATION_DURATION_CPU", "QUALITY_LIMITATION_DURATION_OTHER", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
final class RTCMetric {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RTCMetric[] $VALUES;
    private final j6 protoLabel;
    private final String statKey;
    public static final RTCMetric FREEZE_COUNT = new RTCMetric("FREEZE_COUNT", 0, j6.CLIENT_VIDEO_SUBSCRIBER_FREEZE_COUNT, "freezeCount");
    public static final RTCMetric TOTAL_FREEZES_DURATION = new RTCMetric("TOTAL_FREEZES_DURATION", 1, j6.CLIENT_VIDEO_SUBSCRIBER_TOTAL_FREEZE_DURATION, "totalFreezesDuration");
    public static final RTCMetric PAUSE_COUNT = new RTCMetric("PAUSE_COUNT", 2, j6.CLIENT_VIDEO_SUBSCRIBER_PAUSE_COUNT, "pauseCount");
    public static final RTCMetric TOTAL_PAUSES_DURATION = new RTCMetric("TOTAL_PAUSES_DURATION", 3, j6.CLIENT_VIDEO_SUBSCRIBER_TOTAL_PAUSES_DURATION, "totalPausesDuration");
    public static final RTCMetric CONCEALED_SAMPLES = new RTCMetric("CONCEALED_SAMPLES", 4, j6.CLIENT_AUDIO_SUBSCRIBER_CONCEALED_SAMPLES, "concealedSamples");
    public static final RTCMetric SILENT_CONCEALED_SAMPLES = new RTCMetric("SILENT_CONCEALED_SAMPLES", 5, j6.CLIENT_AUDIO_SUBSCRIBER_SILENT_CONCEALED_SAMPLES, "silentConcealedSamples");
    public static final RTCMetric CONCEALMENT_EVENTS = new RTCMetric("CONCEALMENT_EVENTS", 6, j6.CLIENT_AUDIO_SUBSCRIBER_CONCEALMENT_EVENTS, "concealmentEvents");
    public static final RTCMetric JITTER_BUFFER_DELAY = new RTCMetric("JITTER_BUFFER_DELAY", 7, j6.CLIENT_SUBSCRIBER_JITTER_BUFFER_DELAY, "jitterBufferDelay");
    public static final RTCMetric JITTER_BUFFER_EMITTED_COUNT = new RTCMetric("JITTER_BUFFER_EMITTED_COUNT", 8, j6.CLIENT_SUBSCRIBER_JITTER_BUFFER_EMITTED_COUNT, "jitterBufferEmittedCount");
    public static final RTCMetric QUALITY_LIMITATION_DURATION_BANDWIDTH = new RTCMetric("QUALITY_LIMITATION_DURATION_BANDWIDTH", 9, j6.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_BANDWIDTH, "qualityLimitationDurations");
    public static final RTCMetric QUALITY_LIMITATION_DURATION_CPU = new RTCMetric("QUALITY_LIMITATION_DURATION_CPU", 10, j6.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_CPU, "qualityLimitationDurations");
    public static final RTCMetric QUALITY_LIMITATION_DURATION_OTHER = new RTCMetric("QUALITY_LIMITATION_DURATION_OTHER", 11, j6.CLIENT_VIDEO_PUBLISHER_QUALITY_LIMITATION_DURATION_OTHER, "qualityLimitationDurations");

    private static final /* synthetic */ RTCMetric[] $values() {
        return new RTCMetric[]{FREEZE_COUNT, TOTAL_FREEZES_DURATION, PAUSE_COUNT, TOTAL_PAUSES_DURATION, CONCEALED_SAMPLES, SILENT_CONCEALED_SAMPLES, CONCEALMENT_EVENTS, JITTER_BUFFER_DELAY, JITTER_BUFFER_EMITTED_COUNT, QUALITY_LIMITATION_DURATION_BANDWIDTH, QUALITY_LIMITATION_DURATION_CPU, QUALITY_LIMITATION_DURATION_OTHER};
    }

    static {
        RTCMetric[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private RTCMetric(String str, int i10, j6 j6Var, String str2) {
        this.protoLabel = j6Var;
        this.statKey = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static RTCMetric valueOf(String str) {
        return (RTCMetric) Enum.valueOf(RTCMetric.class, str);
    }

    public static RTCMetric[] values() {
        return (RTCMetric[]) $VALUES.clone();
    }

    public final j6 getProtoLabel() {
        return this.protoLabel;
    }

    public final String getStatKey() {
        return this.statKey;
    }
}
