package io.elevenlabs.data.database.entities.reads;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0007HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "", "id", "", "isSample", "", "parentId", "", "parentType", "chapterIds", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "()Z", "getParentId", "()Ljava/lang/String;", "getParentType", "getChapterIds", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SampleConfigEntity {
    private final String chapterIds;
    private final long id;
    private final boolean isSample;
    private final String parentId;
    private final String parentType;

    public /* synthetic */ SampleConfigEntity(long j4, boolean z6, String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? 0L : j4, z6, str, str2, str3);
    }

    public static /* synthetic */ SampleConfigEntity copy$default(SampleConfigEntity sampleConfigEntity, long j4, boolean z6, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = sampleConfigEntity.id;
        }
        long j10 = j4;
        if ((i10 & 2) != 0) {
            z6 = sampleConfigEntity.isSample;
        }
        boolean z10 = z6;
        if ((i10 & 4) != 0) {
            str = sampleConfigEntity.parentId;
        }
        String str4 = str;
        if ((i10 & 8) != 0) {
            str2 = sampleConfigEntity.parentType;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = sampleConfigEntity.chapterIds;
        }
        return sampleConfigEntity.copy(j10, z10, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSample() {
        return this.isSample;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParentType() {
        return this.parentType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getChapterIds() {
        return this.chapterIds;
    }

    public final SampleConfigEntity copy(long id2, boolean isSample, String parentId, String parentType, String chapterIds) {
        return new SampleConfigEntity(id2, isSample, parentId, parentType, chapterIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SampleConfigEntity)) {
            return false;
        }
        SampleConfigEntity sampleConfigEntity = (SampleConfigEntity) other;
        if (this.id == sampleConfigEntity.id && this.isSample == sampleConfigEntity.isSample && m.c(this.parentId, sampleConfigEntity.parentId) && m.c(this.parentType, sampleConfigEntity.parentType) && m.c(this.chapterIds, sampleConfigEntity.chapterIds)) {
            return true;
        }
        return false;
    }

    public final String getChapterIds() {
        return this.chapterIds;
    }

    public final long getId() {
        return this.id;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getParentType() {
        return this.parentType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int f10 = com.google.android.gms.internal.play_billing.b.f(Long.hashCode(this.id) * 31, 31, this.isSample);
        String str = this.parentId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (f10 + hashCode) * 31;
        String str2 = this.parentType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.chapterIds;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }

    public final boolean isSample() {
        return this.isSample;
    }

    public String toString() {
        long j4 = this.id;
        boolean z6 = this.isSample;
        String str = this.parentId;
        String str2 = this.parentType;
        String str3 = this.chapterIds;
        StringBuilder sb = new StringBuilder("SampleConfigEntity(id=");
        sb.append(j4);
        sb.append(", isSample=");
        sb.append(z6);
        defpackage.f.x(sb, ", parentId=", str, ", parentType=", str2);
        return z.h.d(sb, ", chapterIds=", str3, Separators.RPAREN);
    }

    public SampleConfigEntity(long j4, boolean z6, String str, String str2, String str3) {
        this.id = j4;
        this.isSample = z6;
        this.parentId = str;
        this.parentType = str2;
        this.chapterIds = str3;
    }
}
