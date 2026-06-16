package io.livekit.android.room.participant;

import as.od;
import com.google.android.gms.internal.play_billing.b;
import com.google.protobuf.a3;
import com.google.protobuf.c6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitRtc$TrackPermission;
import p.n;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\r\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001e"}, d2 = {"Lio/livekit/android/room/participant/ParticipantTrackPermission;", "", "participantIdentity", "", "participantSid", "allTracksAllowed", "", "allowedTrackSids", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getAllTracksAllowed", "()Z", "getAllowedTrackSids", "()Ljava/util/List;", "getParticipantIdentity", "()Ljava/lang/String;", "getParticipantSid", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toProto", "Llivekit/LivekitRtc$TrackPermission;", "toProto$livekit_android_sdk_release", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ParticipantTrackPermission {
    private final boolean allTracksAllowed;
    private final List<String> allowedTrackSids;
    private final String participantIdentity;
    private final String participantSid;

    public ParticipantTrackPermission(String str, String str2, boolean z6, List<String> list) {
        list.getClass();
        this.participantIdentity = str;
        this.participantSid = str2;
        this.allTracksAllowed = z6;
        this.allowedTrackSids = list;
        if (str == null && str2 == null) {
            c6.t("Either identity or sid must be provided.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParticipantTrackPermission copy$default(ParticipantTrackPermission participantTrackPermission, String str, String str2, boolean z6, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = participantTrackPermission.participantIdentity;
        }
        if ((i10 & 2) != 0) {
            str2 = participantTrackPermission.participantSid;
        }
        if ((i10 & 4) != 0) {
            z6 = participantTrackPermission.allTracksAllowed;
        }
        if ((i10 & 8) != 0) {
            list = participantTrackPermission.allowedTrackSids;
        }
        return participantTrackPermission.copy(str, str2, z6, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getParticipantIdentity() {
        return this.participantIdentity;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParticipantSid() {
        return this.participantSid;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAllTracksAllowed() {
        return this.allTracksAllowed;
    }

    public final List<String> component4() {
        return this.allowedTrackSids;
    }

    public final ParticipantTrackPermission copy(String participantIdentity, String participantSid, boolean allTracksAllowed, List<String> allowedTrackSids) {
        allowedTrackSids.getClass();
        return new ParticipantTrackPermission(participantIdentity, participantSid, allTracksAllowed, allowedTrackSids);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantTrackPermission)) {
            return false;
        }
        ParticipantTrackPermission participantTrackPermission = (ParticipantTrackPermission) other;
        if (m.c(this.participantIdentity, participantTrackPermission.participantIdentity) && m.c(this.participantSid, participantTrackPermission.participantSid) && this.allTracksAllowed == participantTrackPermission.allTracksAllowed && m.c(this.allowedTrackSids, participantTrackPermission.allowedTrackSids)) {
            return true;
        }
        return false;
    }

    public final boolean getAllTracksAllowed() {
        return this.allTracksAllowed;
    }

    public final List<String> getAllowedTrackSids() {
        return this.allowedTrackSids;
    }

    public final String getParticipantIdentity() {
        return this.participantIdentity;
    }

    public final String getParticipantSid() {
        return this.participantSid;
    }

    public int hashCode() {
        int hashCode;
        String str = this.participantIdentity;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.participantSid;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.allowedTrackSids.hashCode() + b.f((i11 + i10) * 31, 31, this.allTracksAllowed);
    }

    public final LivekitRtc$TrackPermission toProto$livekit_android_sdk_release() {
        od newBuilder = LivekitRtc$TrackPermission.newBuilder();
        newBuilder.d(this.participantIdentity);
        newBuilder.e(this.participantSid);
        newBuilder.c(this.allTracksAllowed);
        newBuilder.b(this.allowedTrackSids);
        a3 build = newBuilder.build();
        build.getClass();
        return (LivekitRtc$TrackPermission) build;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParticipantTrackPermission(participantIdentity=");
        sb.append(this.participantIdentity);
        sb.append(", participantSid=");
        sb.append(this.participantSid);
        sb.append(", allTracksAllowed=");
        sb.append(this.allTracksAllowed);
        sb.append(", allowedTrackSids=");
        return n.k(sb, this.allowedTrackSids, ')');
    }

    public ParticipantTrackPermission() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ ParticipantTrackPermission(String str, String str2, boolean z6, List list, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? t.f33547a : list);
    }
}
