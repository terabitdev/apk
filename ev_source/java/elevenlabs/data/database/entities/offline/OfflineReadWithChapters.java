package io.elevenlabs.data.database.entities.offline;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineReadWithChapters;", "", "offlineRead", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "chapters", "", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "<init>", "(Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;Ljava/util/List;)V", "getOfflineRead", "()Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "getChapters", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OfflineReadWithChapters {
    private final List<OfflineChapterEntity> chapters;
    private final OfflineReadEntity offlineRead;

    public OfflineReadWithChapters(OfflineReadEntity offlineReadEntity, List<OfflineChapterEntity> list) {
        offlineReadEntity.getClass();
        list.getClass();
        this.offlineRead = offlineReadEntity;
        this.chapters = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfflineReadWithChapters copy$default(OfflineReadWithChapters offlineReadWithChapters, OfflineReadEntity offlineReadEntity, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offlineReadEntity = offlineReadWithChapters.offlineRead;
        }
        if ((i10 & 2) != 0) {
            list = offlineReadWithChapters.chapters;
        }
        return offlineReadWithChapters.copy(offlineReadEntity, list);
    }

    /* renamed from: component1, reason: from getter */
    public final OfflineReadEntity getOfflineRead() {
        return this.offlineRead;
    }

    public final List<OfflineChapterEntity> component2() {
        return this.chapters;
    }

    public final OfflineReadWithChapters copy(OfflineReadEntity offlineRead, List<OfflineChapterEntity> chapters) {
        offlineRead.getClass();
        chapters.getClass();
        return new OfflineReadWithChapters(offlineRead, chapters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineReadWithChapters)) {
            return false;
        }
        OfflineReadWithChapters offlineReadWithChapters = (OfflineReadWithChapters) other;
        if (m.c(this.offlineRead, offlineReadWithChapters.offlineRead) && m.c(this.chapters, offlineReadWithChapters.chapters)) {
            return true;
        }
        return false;
    }

    public final List<OfflineChapterEntity> getChapters() {
        return this.chapters;
    }

    public final OfflineReadEntity getOfflineRead() {
        return this.offlineRead;
    }

    public int hashCode() {
        return this.chapters.hashCode() + (this.offlineRead.hashCode() * 31);
    }

    public String toString() {
        return "OfflineReadWithChapters(offlineRead=" + this.offlineRead + ", chapters=" + this.chapters + Separators.RPAREN;
    }
}
