package io.elevenlabs.domain.model;

import ig.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"chapterFor", "Lio/elevenlabs/domain/model/Chapter;", "", "c", "", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ChapterContentKt {
    public static final Chapter chapterFor(List<Chapter> list, long j4) {
        int i10;
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size();
        f.N(list.size(), size);
        int i11 = size - 1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 <= i11) {
                i10 = (i13 + i11) >>> 1;
                int chapterFor$lambda$0 = chapterFor$lambda$0(j4, list.get(i10));
                if (chapterFor$lambda$0 < 0) {
                    i13 = i10 + 1;
                } else {
                    if (chapterFor$lambda$0 <= 0) {
                        break;
                    }
                    i11 = i10 - 1;
                }
            } else {
                i10 = -(i13 + 1);
                break;
            }
        }
        if (i10 < 0) {
            int i14 = (-i10) - 2;
            if (i14 >= 0) {
                i12 = i14;
            }
            i10 = i12;
        }
        return list.get(i10);
    }

    private static final int chapterFor$lambda$0(long j4, Chapter chapter) {
        chapter.getClass();
        return m.e(chapter.getStartingCharOffset(), j4);
    }
}
