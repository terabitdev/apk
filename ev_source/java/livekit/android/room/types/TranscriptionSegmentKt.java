package io.livekit.android.room.types;

import et.d;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$TranscriptionSegment;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\t\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/types/TranscriptionSegment;", "newSegment", "merge", "(Lio/livekit/android/room/types/TranscriptionSegment;Lio/livekit/android/room/types/TranscriptionSegment;)Lio/livekit/android/room/types/TranscriptionSegment;", "", "", "", "newSegments", "Lsn/z;", "mergeNewSegments", "(Ljava/util/Map;Ljava/util/Collection;)V", "Llivekit/LivekitModels$TranscriptionSegment;", "", "firstReceivedTime", "toSDKType", "(Llivekit/LivekitModels$TranscriptionSegment;J)Lio/livekit/android/room/types/TranscriptionSegment;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TranscriptionSegmentKt {
    public static final TranscriptionSegment merge(TranscriptionSegment transcriptionSegment, TranscriptionSegment transcriptionSegment2) {
        transcriptionSegment2.getClass();
        if (transcriptionSegment == null) {
            return transcriptionSegment2;
        }
        if (!m.c(transcriptionSegment.getId(), transcriptionSegment2.getId())) {
            return transcriptionSegment;
        }
        if (transcriptionSegment.getFinal()) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.a(null, "new segment for " + transcriptionSegment.getId() + " overwriting final segment?", new Object[0]);
            }
        }
        return transcriptionSegment.copy(transcriptionSegment.getId(), transcriptionSegment2.getText(), transcriptionSegment2.getLanguage(), transcriptionSegment2.getFinal(), transcriptionSegment.getFirstReceivedTime(), transcriptionSegment2.getLastReceivedTime());
    }

    public static final void mergeNewSegments(Map<String, TranscriptionSegment> map, Collection<TranscriptionSegment> collection) {
        map.getClass();
        collection.getClass();
        for (TranscriptionSegment transcriptionSegment : collection) {
            map.put(transcriptionSegment.getId(), merge(map.get(transcriptionSegment.getId()), transcriptionSegment));
        }
    }

    public static final TranscriptionSegment toSDKType(LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment, long j4) {
        livekitModels$TranscriptionSegment.getClass();
        String id2 = livekitModels$TranscriptionSegment.getId();
        id2.getClass();
        String text = livekitModels$TranscriptionSegment.getText();
        text.getClass();
        String language = livekitModels$TranscriptionSegment.getLanguage();
        language.getClass();
        return new TranscriptionSegment(id2, text, language, livekitModels$TranscriptionSegment.getFinal(), j4, 0L, 32, null);
    }

    public static /* synthetic */ TranscriptionSegment toSDKType$default(LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = new Date().getTime();
        }
        return toSDKType(livekitModels$TranscriptionSegment, j4);
    }
}
