package io.elevenlabs.data.database.entities.reads;

import android.gov.nist.core.Separators;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;", "", "meta", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "chapters", "", "Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "offlineRead", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "offlineChapters", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "sampleConfig", "Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "<init>", "(Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;Ljava/util/List;Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;Ljava/util/List;Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;)V", "getMeta", "()Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "getChapters", "()Ljava/util/List;", "getOfflineRead", "()Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "getOfflineChapters", "getSampleConfig", "()Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadMetaEntityWithChapters {
    private final List<ReadChapterEntity> chapters;
    private final ReadMetaEntity meta;
    private final List<OfflineChapterEntity> offlineChapters;
    private final OfflineReadEntity offlineRead;
    private final SampleConfigEntity sampleConfig;

    public ReadMetaEntityWithChapters(ReadMetaEntity readMetaEntity, List<ReadChapterEntity> list, OfflineReadEntity offlineReadEntity, List<OfflineChapterEntity> list2, SampleConfigEntity sampleConfigEntity) {
        readMetaEntity.getClass();
        list.getClass();
        list2.getClass();
        this.meta = readMetaEntity;
        this.chapters = list;
        this.offlineRead = offlineReadEntity;
        this.offlineChapters = list2;
        this.sampleConfig = sampleConfigEntity;
    }

    public static /* synthetic */ ReadMetaEntityWithChapters copy$default(ReadMetaEntityWithChapters readMetaEntityWithChapters, ReadMetaEntity readMetaEntity, List list, OfflineReadEntity offlineReadEntity, List list2, SampleConfigEntity sampleConfigEntity, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            readMetaEntity = readMetaEntityWithChapters.meta;
        }
        if ((i10 & 2) != 0) {
            list = readMetaEntityWithChapters.chapters;
        }
        if ((i10 & 4) != 0) {
            offlineReadEntity = readMetaEntityWithChapters.offlineRead;
        }
        if ((i10 & 8) != 0) {
            list2 = readMetaEntityWithChapters.offlineChapters;
        }
        if ((i10 & 16) != 0) {
            sampleConfigEntity = readMetaEntityWithChapters.sampleConfig;
        }
        SampleConfigEntity sampleConfigEntity2 = sampleConfigEntity;
        OfflineReadEntity offlineReadEntity2 = offlineReadEntity;
        return readMetaEntityWithChapters.copy(readMetaEntity, list, offlineReadEntity2, list2, sampleConfigEntity2);
    }

    /* renamed from: component1, reason: from getter */
    public final ReadMetaEntity getMeta() {
        return this.meta;
    }

    public final List<ReadChapterEntity> component2() {
        return this.chapters;
    }

    /* renamed from: component3, reason: from getter */
    public final OfflineReadEntity getOfflineRead() {
        return this.offlineRead;
    }

    public final List<OfflineChapterEntity> component4() {
        return this.offlineChapters;
    }

    /* renamed from: component5, reason: from getter */
    public final SampleConfigEntity getSampleConfig() {
        return this.sampleConfig;
    }

    public final ReadMetaEntityWithChapters copy(ReadMetaEntity meta, List<ReadChapterEntity> chapters, OfflineReadEntity offlineRead, List<OfflineChapterEntity> offlineChapters, SampleConfigEntity sampleConfig) {
        meta.getClass();
        chapters.getClass();
        offlineChapters.getClass();
        return new ReadMetaEntityWithChapters(meta, chapters, offlineRead, offlineChapters, sampleConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadMetaEntityWithChapters)) {
            return false;
        }
        ReadMetaEntityWithChapters readMetaEntityWithChapters = (ReadMetaEntityWithChapters) other;
        if (m.c(this.meta, readMetaEntityWithChapters.meta) && m.c(this.chapters, readMetaEntityWithChapters.chapters) && m.c(this.offlineRead, readMetaEntityWithChapters.offlineRead) && m.c(this.offlineChapters, readMetaEntityWithChapters.offlineChapters) && m.c(this.sampleConfig, readMetaEntityWithChapters.sampleConfig)) {
            return true;
        }
        return false;
    }

    public final List<ReadChapterEntity> getChapters() {
        return this.chapters;
    }

    public final ReadMetaEntity getMeta() {
        return this.meta;
    }

    public final List<OfflineChapterEntity> getOfflineChapters() {
        return this.offlineChapters;
    }

    public final OfflineReadEntity getOfflineRead() {
        return this.offlineRead;
    }

    public final SampleConfigEntity getSampleConfig() {
        return this.sampleConfig;
    }

    public int hashCode() {
        int hashCode;
        int d10 = n.d(this.meta.hashCode() * 31, 31, this.chapters);
        OfflineReadEntity offlineReadEntity = this.offlineRead;
        int i10 = 0;
        if (offlineReadEntity == null) {
            hashCode = 0;
        } else {
            hashCode = offlineReadEntity.hashCode();
        }
        int d11 = n.d((d10 + hashCode) * 31, 31, this.offlineChapters);
        SampleConfigEntity sampleConfigEntity = this.sampleConfig;
        if (sampleConfigEntity != null) {
            i10 = sampleConfigEntity.hashCode();
        }
        return d11 + i10;
    }

    public String toString() {
        return "ReadMetaEntityWithChapters(meta=" + this.meta + ", chapters=" + this.chapters + ", offlineRead=" + this.offlineRead + ", offlineChapters=" + this.offlineChapters + ", sampleConfig=" + this.sampleConfig + Separators.RPAREN;
    }
}
