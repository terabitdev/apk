package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/domain/model/ReadFromFollowingSection;", "", "read", "Lio/elevenlabs/domain/model/ReadMeta;", "followedEntityType", "Lio/elevenlabs/domain/model/FollowedEntityType;", "followedEntityName", "", "releasedOnUnix", "", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/FollowedEntityType;Ljava/lang/String;J)V", "getRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "getFollowedEntityType", "()Lio/elevenlabs/domain/model/FollowedEntityType;", "getFollowedEntityName", "()Ljava/lang/String;", "getReleasedOnUnix", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadFromFollowingSection {
    private final String followedEntityName;
    private final FollowedEntityType followedEntityType;
    private final ReadMeta read;
    private final long releasedOnUnix;

    public ReadFromFollowingSection(ReadMeta readMeta, FollowedEntityType followedEntityType, String str, long j4) {
        readMeta.getClass();
        str.getClass();
        this.read = readMeta;
        this.followedEntityType = followedEntityType;
        this.followedEntityName = str;
        this.releasedOnUnix = j4;
    }

    public static /* synthetic */ ReadFromFollowingSection copy$default(ReadFromFollowingSection readFromFollowingSection, ReadMeta readMeta, FollowedEntityType followedEntityType, String str, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            readMeta = readFromFollowingSection.read;
        }
        if ((i10 & 2) != 0) {
            followedEntityType = readFromFollowingSection.followedEntityType;
        }
        if ((i10 & 4) != 0) {
            str = readFromFollowingSection.followedEntityName;
        }
        if ((i10 & 8) != 0) {
            j4 = readFromFollowingSection.releasedOnUnix;
        }
        String str2 = str;
        return readFromFollowingSection.copy(readMeta, followedEntityType, str2, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final ReadMeta getRead() {
        return this.read;
    }

    /* renamed from: component2, reason: from getter */
    public final FollowedEntityType getFollowedEntityType() {
        return this.followedEntityType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFollowedEntityName() {
        return this.followedEntityName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getReleasedOnUnix() {
        return this.releasedOnUnix;
    }

    public final ReadFromFollowingSection copy(ReadMeta read, FollowedEntityType followedEntityType, String followedEntityName, long releasedOnUnix) {
        read.getClass();
        followedEntityName.getClass();
        return new ReadFromFollowingSection(read, followedEntityType, followedEntityName, releasedOnUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadFromFollowingSection)) {
            return false;
        }
        ReadFromFollowingSection readFromFollowingSection = (ReadFromFollowingSection) other;
        if (m.c(this.read, readFromFollowingSection.read) && this.followedEntityType == readFromFollowingSection.followedEntityType && m.c(this.followedEntityName, readFromFollowingSection.followedEntityName) && this.releasedOnUnix == readFromFollowingSection.releasedOnUnix) {
            return true;
        }
        return false;
    }

    public final String getFollowedEntityName() {
        return this.followedEntityName;
    }

    public final FollowedEntityType getFollowedEntityType() {
        return this.followedEntityType;
    }

    public final ReadMeta getRead() {
        return this.read;
    }

    public final long getReleasedOnUnix() {
        return this.releasedOnUnix;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.read.hashCode() * 31;
        FollowedEntityType followedEntityType = this.followedEntityType;
        if (followedEntityType == null) {
            hashCode = 0;
        } else {
            hashCode = followedEntityType.hashCode();
        }
        return Long.hashCode(this.releasedOnUnix) + c.c((hashCode2 + hashCode) * 31, 31, this.followedEntityName);
    }

    public String toString() {
        return "ReadFromFollowingSection(read=" + this.read + ", followedEntityType=" + this.followedEntityType + ", followedEntityName=" + this.followedEntityName + ", releasedOnUnix=" + this.releasedOnUnix + Separators.RPAREN;
    }
}
