package io.livekit.android.token;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lio/livekit/android/token/TokenRequestOptions;", "", "roomName", "", "participantName", "participantIdentity", "participantMetadata", "participantAttributes", "", "agentName", "agentMetadata", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getAgentMetadata", "()Ljava/lang/String;", "getAgentName", "getParticipantAttributes", "()Ljava/util/Map;", "getParticipantIdentity", "getParticipantMetadata", "getParticipantName", "getRoomName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class TokenRequestOptions {
    private final String agentMetadata;
    private final String agentName;
    private final Map<String, String> participantAttributes;
    private final String participantIdentity;
    private final String participantMetadata;
    private final String participantName;
    private final String roomName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TokenRequestOptions(String str, String str2, String str3, String str4, Map map, String str5, String str6, int i10, f fVar) {
        this(str, str2, str3, str4, map, str5, r9);
        String str7;
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        str3 = (i10 & 4) != 0 ? null : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        map = (i10 & 16) != 0 ? null : map;
        str5 = (i10 & 32) != 0 ? null : str5;
        if ((i10 & 64) != 0) {
            str7 = null;
        } else {
            str7 = str6;
        }
    }

    public static /* synthetic */ TokenRequestOptions copy$default(TokenRequestOptions tokenRequestOptions, String str, String str2, String str3, String str4, Map map, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenRequestOptions.roomName;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenRequestOptions.participantName;
        }
        if ((i10 & 4) != 0) {
            str3 = tokenRequestOptions.participantIdentity;
        }
        if ((i10 & 8) != 0) {
            str4 = tokenRequestOptions.participantMetadata;
        }
        if ((i10 & 16) != 0) {
            map = tokenRequestOptions.participantAttributes;
        }
        if ((i10 & 32) != 0) {
            str5 = tokenRequestOptions.agentName;
        }
        if ((i10 & 64) != 0) {
            str6 = tokenRequestOptions.agentMetadata;
        }
        String str7 = str5;
        String str8 = str6;
        Map map2 = map;
        String str9 = str3;
        return tokenRequestOptions.copy(str, str2, str9, str4, map2, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParticipantName() {
        return this.participantName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParticipantIdentity() {
        return this.participantIdentity;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParticipantMetadata() {
        return this.participantMetadata;
    }

    public final Map<String, String> component5() {
        return this.participantAttributes;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAgentName() {
        return this.agentName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAgentMetadata() {
        return this.agentMetadata;
    }

    public final TokenRequestOptions copy(String roomName, String participantName, String participantIdentity, String participantMetadata, Map<String, String> participantAttributes, String agentName, String agentMetadata) {
        return new TokenRequestOptions(roomName, participantName, participantIdentity, participantMetadata, participantAttributes, agentName, agentMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenRequestOptions)) {
            return false;
        }
        TokenRequestOptions tokenRequestOptions = (TokenRequestOptions) other;
        if (m.c(this.roomName, tokenRequestOptions.roomName) && m.c(this.participantName, tokenRequestOptions.participantName) && m.c(this.participantIdentity, tokenRequestOptions.participantIdentity) && m.c(this.participantMetadata, tokenRequestOptions.participantMetadata) && m.c(this.participantAttributes, tokenRequestOptions.participantAttributes) && m.c(this.agentName, tokenRequestOptions.agentName) && m.c(this.agentMetadata, tokenRequestOptions.agentMetadata)) {
            return true;
        }
        return false;
    }

    public final String getAgentMetadata() {
        return this.agentMetadata;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final Map<String, String> getParticipantAttributes() {
        return this.participantAttributes;
    }

    public final String getParticipantIdentity() {
        return this.participantIdentity;
    }

    public final String getParticipantMetadata() {
        return this.participantMetadata;
    }

    public final String getParticipantName() {
        return this.participantName;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.roomName;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.participantName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.participantIdentity;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.participantMetadata;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Map<String, String> map = this.participantAttributes;
        if (map == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str5 = this.agentName;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str6 = this.agentMetadata;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return i16 + i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TokenRequestOptions(roomName=");
        sb.append(this.roomName);
        sb.append(", participantName=");
        sb.append(this.participantName);
        sb.append(", participantIdentity=");
        sb.append(this.participantIdentity);
        sb.append(", participantMetadata=");
        sb.append(this.participantMetadata);
        sb.append(", participantAttributes=");
        sb.append(this.participantAttributes);
        sb.append(", agentName=");
        sb.append(this.agentName);
        sb.append(", agentMetadata=");
        return defpackage.f.m(sb, this.agentMetadata, ')');
    }

    public TokenRequestOptions(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) {
        this.roomName = str;
        this.participantName = str2;
        this.participantIdentity = str3;
        this.participantMetadata = str4;
        this.participantAttributes = map;
        this.agentName = str5;
        this.agentMetadata = str6;
    }

    public TokenRequestOptions() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
