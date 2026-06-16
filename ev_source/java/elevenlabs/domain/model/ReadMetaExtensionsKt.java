package io.elevenlabs.domain.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"totalAudioDurationSeconds", "", "Lio/elevenlabs/domain/model/ReadMeta;", "getTotalAudioDurationSeconds", "(Lio/elevenlabs/domain/model/ReadMeta;)Ljava/lang/Double;", "audioElapsedSeconds", "getAudioElapsedSeconds", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadMetaExtensionsKt {
    public static final Double getAudioElapsedSeconds(ReadMeta readMeta) {
        String lastListenedAudioFileNumber;
        double d10;
        readMeta.getClass();
        if (!ReadMetaKt.isMediaType(readMeta) || (lastListenedAudioFileNumber = readMeta.getLastListenedAudioFileNumber()) == null) {
            return null;
        }
        Double lastListenedAudioSeconds = readMeta.getLastListenedAudioSeconds();
        if (lastListenedAudioSeconds != null) {
            d10 = lastListenedAudioSeconds.doubleValue();
        } else {
            d10 = 0.0d;
        }
        Iterator<Chapter> it = readMeta.getChapters().iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (m.c(it.next().getAudioFileNumber(), lastListenedAudioFileNumber)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return null;
        }
        return Double.valueOf(ChapterUtilsKt.getCumulativeChapterDuration(readMeta.getChapters(), i10) + d10);
    }

    public static final Double getTotalAudioDurationSeconds(ReadMeta readMeta) {
        readMeta.getClass();
        if (!ReadMetaKt.isMediaType(readMeta)) {
            return null;
        }
        if (readMeta.getAudioDurationSeconds() != null) {
            return readMeta.getAudioDurationSeconds();
        }
        Iterator<Chapter> it = readMeta.getChapters().iterator();
        double d10 = 0.0d;
        while (it.hasNext()) {
            Double durationSeconds = it.next().getDurationSeconds();
            if (durationSeconds == null) {
                return null;
            }
            d10 += durationSeconds.doubleValue();
        }
        return Double.valueOf(d10);
    }
}
