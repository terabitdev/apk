package io.elevenlabs.domain.model;

import ae.l;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00112\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u0004\u0018\u00010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "Lio/elevenlabs/domain/model/Chapter;", "chapters", "", "beforeIndex", "", "getCumulativeChapterDuration", "(Ljava/util/List;I)D", "", "charOffset", "findTtsChapterIndex", "(Ljava/util/List;J)I", "", "audioFileNumber", "findAudioChapterIndex", "(Ljava/util/List;Ljava/lang/String;)I", "totalSeconds", "Lsn/k;", "findChapterAtPosition", "(Ljava/util/List;D)Lsn/k;", "positionInChapterSeconds", "audioPositionToCharOffset", "(Ljava/util/List;Ljava/lang/String;D)Ljava/lang/Long;", "charOffsetToAudioPosition", "(Ljava/util/List;J)Lsn/k;", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ChapterUtilsKt {
    public static final Long audioPositionToCharOffset(List<Chapter> list, String str, double d10) {
        Object obj;
        Double durationSeconds;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m.c(((Chapter) obj).getAudioFileNumber(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Chapter chapter = (Chapter) obj;
        if (chapter != null && (durationSeconds = chapter.getDurationSeconds()) != null) {
            double doubleValue = durationSeconds.doubleValue();
            if (doubleValue > 0.0d && chapter.getCharCount() > 0) {
                return Long.valueOf(chapter.getStartingCharOffset() + ((long) (l.k(d10 / doubleValue, 0.0d, 1.0d) * chapter.getCharCount())));
            }
        }
        return null;
    }

    public static final k charOffsetToAudioPosition(List<Chapter> list, long j4) {
        Chapter chapter;
        String audioFileNumber;
        Double durationSeconds;
        list.getClass();
        if (list.isEmpty() || (chapter = (Chapter) o.z0(findTtsChapterIndex(list, j4), list)) == null || (audioFileNumber = chapter.getAudioFileNumber()) == null || (durationSeconds = chapter.getDurationSeconds()) == null) {
            return null;
        }
        double doubleValue = durationSeconds.doubleValue();
        long j10 = 0;
        if (chapter.getCharCount() <= 0) {
            return new k(audioFileNumber, Double.valueOf(0.0d));
        }
        long startingCharOffset = j4 - chapter.getStartingCharOffset();
        if (startingCharOffset >= 0) {
            j10 = startingCharOffset;
        }
        return new k(audioFileNumber, Double.valueOf(l.k(j10 / chapter.getCharCount(), 0.0d, 1.0d) * doubleValue));
    }

    public static final int findAudioChapterIndex(List<Chapter> list, String str) {
        list.getClass();
        Iterator<Chapter> it = list.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (m.c(it.next().getAudioFileNumber(), str)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public static final k findChapterAtPosition(List<Chapter> list, double d10) {
        Double durationSeconds;
        double d11;
        list.getClass();
        double d12 = 0.0d;
        if (list.isEmpty()) {
            return new k(null, Double.valueOf(0.0d));
        }
        double d13 = 0.0d;
        for (Chapter chapter : list) {
            Double durationSeconds2 = chapter.getDurationSeconds();
            if (durationSeconds2 != null) {
                d11 = durationSeconds2.doubleValue();
            } else {
                d11 = 0.0d;
            }
            double d14 = d11 + d13;
            if (d10 < d14) {
                return new k(chapter, Double.valueOf(d10 - d13));
            }
            d13 = d14;
        }
        Chapter chapter2 = (Chapter) o.H0(list);
        if (chapter2 != null && (durationSeconds = chapter2.getDurationSeconds()) != null) {
            d12 = durationSeconds.doubleValue();
        }
        return new k(chapter2, Double.valueOf(d12));
    }

    public static final int findTtsChapterIndex(List<Chapter> list, long j4) {
        int i10;
        list.getClass();
        ListIterator<Chapter> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().getStartingCharOffset() <= j4) {
                    i10 = listIterator.nextIndex();
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public static final double getCumulativeChapterDuration(List<Chapter> list, int i10) {
        double d10;
        list.getClass();
        Iterator it = o.b1(list, i10).iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            Double durationSeconds = ((Chapter) it.next()).getDurationSeconds();
            if (durationSeconds != null) {
                d10 = durationSeconds.doubleValue();
            } else {
                d10 = 0.0d;
            }
            d11 += d10;
        }
        return d11;
    }
}
