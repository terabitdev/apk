package io.livekit.android.token;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.c;
import tr.b;
import ur.c1;
import ur.g1;
import ur.h0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBc\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#Jd\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00068"}, d2 = {"Lio/livekit/android/token/TokenSourceRequest;", "", "", "roomName", "participantName", "participantIdentity", "participantMetadata", "", "participantAttributes", "Lio/livekit/android/token/RoomConfiguration;", "roomConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/livekit/android/token/RoomConfiguration;)V", "", "seen1", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/livekit/android/token/RoomConfiguration;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$livekit_android_sdk_release", "(Lio/livekit/android/token/TokenSourceRequest;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "component6", "()Lio/livekit/android/token/RoomConfiguration;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/livekit/android/token/RoomConfiguration;)Lio/livekit/android/token/TokenSourceRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRoomName", "getParticipantName", "getParticipantIdentity", "getParticipantMetadata", "Ljava/util/Map;", "getParticipantAttributes", "Lio/livekit/android/token/RoomConfiguration;", "getRoomConfig", "Companion", "$serializer", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes4.dex */
public final /* data */ class TokenSourceRequest {
    private static final KSerializer[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, String> participantAttributes;
    private final String participantIdentity;
    private final String participantMetadata;
    private final String participantName;
    private final RoomConfiguration roomConfig;
    private final String roomName;

    static {
        g1 g1Var = g1.f34588a;
        $childSerializers = new KSerializer[]{null, null, null, null, new h0(g1Var, g1Var), null};
    }

    @c
    public /* synthetic */ TokenSourceRequest(int i10, String str, String str2, String str3, String str4, Map map, RoomConfiguration roomConfiguration, c1 c1Var) {
        if (63 == (i10 & 63)) {
            this.roomName = str;
            this.participantName = str2;
            this.participantIdentity = str3;
            this.participantMetadata = str4;
            this.participantAttributes = map;
            this.roomConfig = roomConfiguration;
            return;
        }
        t0.j(i10, 63, TokenSourceRequest$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ TokenSourceRequest copy$default(TokenSourceRequest tokenSourceRequest, String str, String str2, String str3, String str4, Map map, RoomConfiguration roomConfiguration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenSourceRequest.roomName;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenSourceRequest.participantName;
        }
        if ((i10 & 4) != 0) {
            str3 = tokenSourceRequest.participantIdentity;
        }
        if ((i10 & 8) != 0) {
            str4 = tokenSourceRequest.participantMetadata;
        }
        if ((i10 & 16) != 0) {
            map = tokenSourceRequest.participantAttributes;
        }
        if ((i10 & 32) != 0) {
            roomConfiguration = tokenSourceRequest.roomConfig;
        }
        Map map2 = map;
        RoomConfiguration roomConfiguration2 = roomConfiguration;
        return tokenSourceRequest.copy(str, str2, str3, str4, map2, roomConfiguration2);
    }

    public static final /* synthetic */ void write$Self$livekit_android_sdk_release(TokenSourceRequest self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        g1 g1Var = g1.f34588a;
        output.o(serialDesc, 0, g1Var, self.roomName);
        output.o(serialDesc, 1, g1Var, self.participantName);
        output.o(serialDesc, 2, g1Var, self.participantIdentity);
        output.o(serialDesc, 3, g1Var, self.participantMetadata);
        output.o(serialDesc, 4, kSerializerArr[4], self.participantAttributes);
        output.o(serialDesc, 5, RoomConfiguration$$serializer.INSTANCE, self.roomConfig);
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
    public final RoomConfiguration getRoomConfig() {
        return this.roomConfig;
    }

    public final TokenSourceRequest copy(String roomName, String participantName, String participantIdentity, String participantMetadata, Map<String, String> participantAttributes, RoomConfiguration roomConfig) {
        return new TokenSourceRequest(roomName, participantName, participantIdentity, participantMetadata, participantAttributes, roomConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenSourceRequest)) {
            return false;
        }
        TokenSourceRequest tokenSourceRequest = (TokenSourceRequest) other;
        if (m.c(this.roomName, tokenSourceRequest.roomName) && m.c(this.participantName, tokenSourceRequest.participantName) && m.c(this.participantIdentity, tokenSourceRequest.participantIdentity) && m.c(this.participantMetadata, tokenSourceRequest.participantMetadata) && m.c(this.participantAttributes, tokenSourceRequest.participantAttributes) && m.c(this.roomConfig, tokenSourceRequest.roomConfig)) {
            return true;
        }
        return false;
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

    public final RoomConfiguration getRoomConfig() {
        return this.roomConfig;
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
        RoomConfiguration roomConfiguration = this.roomConfig;
        if (roomConfiguration != null) {
            i10 = roomConfiguration.hashCode();
        }
        return i15 + i10;
    }

    public String toString() {
        return "TokenSourceRequest(roomName=" + this.roomName + ", participantName=" + this.participantName + ", participantIdentity=" + this.participantIdentity + ", participantMetadata=" + this.participantMetadata + ", participantAttributes=" + this.participantAttributes + ", roomConfig=" + this.roomConfig + ')';
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/token/TokenSourceRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/token/TokenSourceRequest;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return TokenSourceRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TokenSourceRequest(String str, String str2, String str3, String str4, Map<String, String> map, RoomConfiguration roomConfiguration) {
        this.roomName = str;
        this.participantName = str2;
        this.participantIdentity = str3;
        this.participantMetadata = str4;
        this.participantAttributes = map;
        this.roomConfig = roomConfiguration;
    }
}
