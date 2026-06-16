package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/SampleConfig;", "", "isSample", "", "parentId", "", "parentType", "Lio/elevenlabs/domain/model/SampleParentType;", "chapterIds", "", "<init>", "(ZLjava/lang/String;Lio/elevenlabs/domain/model/SampleParentType;Ljava/util/List;)V", "()Z", "getParentId", "()Ljava/lang/String;", "getParentType", "()Lio/elevenlabs/domain/model/SampleParentType;", "getChapterIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SampleConfig {
    private final List<String> chapterIds;
    private final boolean isSample;
    private final String parentId;
    private final SampleParentType parentType;

    public SampleConfig(boolean z6, String str, SampleParentType sampleParentType, List<String> list) {
        this.isSample = z6;
        this.parentId = str;
        this.parentType = sampleParentType;
        this.chapterIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SampleConfig copy$default(SampleConfig sampleConfig, boolean z6, String str, SampleParentType sampleParentType, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = sampleConfig.isSample;
        }
        if ((i10 & 2) != 0) {
            str = sampleConfig.parentId;
        }
        if ((i10 & 4) != 0) {
            sampleParentType = sampleConfig.parentType;
        }
        if ((i10 & 8) != 0) {
            list = sampleConfig.chapterIds;
        }
        return sampleConfig.copy(z6, str, sampleParentType, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSample() {
        return this.isSample;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* renamed from: component3, reason: from getter */
    public final SampleParentType getParentType() {
        return this.parentType;
    }

    public final List<String> component4() {
        return this.chapterIds;
    }

    public final SampleConfig copy(boolean isSample, String parentId, SampleParentType parentType, List<String> chapterIds) {
        return new SampleConfig(isSample, parentId, parentType, chapterIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SampleConfig)) {
            return false;
        }
        SampleConfig sampleConfig = (SampleConfig) other;
        if (this.isSample == sampleConfig.isSample && m.c(this.parentId, sampleConfig.parentId) && this.parentType == sampleConfig.parentType && m.c(this.chapterIds, sampleConfig.chapterIds)) {
            return true;
        }
        return false;
    }

    public final List<String> getChapterIds() {
        return this.chapterIds;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final SampleParentType getParentType() {
        return this.parentType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Boolean.hashCode(this.isSample) * 31;
        String str = this.parentId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        SampleParentType sampleParentType = this.parentType;
        if (sampleParentType == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = sampleParentType.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        List<String> list = this.chapterIds;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i12 + i10;
    }

    public final boolean isSample() {
        return this.isSample;
    }

    public String toString() {
        return "SampleConfig(isSample=" + this.isSample + ", parentId=" + this.parentId + ", parentType=" + this.parentType + ", chapterIds=" + this.chapterIds + Separators.RPAREN;
    }
}
