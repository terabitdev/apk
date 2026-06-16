package io.livekit.android.token;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.c;
import tr.b;
import ur.c1;
import ur.d;
import ur.f0;
import ur.g1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0082\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b:\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b;\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b<\u0010!R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, d2 = {"Lio/livekit/android/token/RoomConfiguration;", "", "", DiagnosticsEntry.NAME_KEY, "", "emptyTimeout", "departureTimeout", "maxParticipants", "metadata", "minPlayoutDelay", "maxPlayoutDelay", "syncStreams", "", "Lio/livekit/android/token/RoomAgentDispatch;", "agents", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "seen1", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$livekit_android_sdk_release", "(Lio/livekit/android/token/RoomConfiguration;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lio/livekit/android/token/RoomConfiguration;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getEmptyTimeout", "getDepartureTimeout", "getMaxParticipants", "getMetadata", "getMinPlayoutDelay", "getMaxPlayoutDelay", "getSyncStreams", "Ljava/util/List;", "getAgents", "Companion", "$serializer", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes4.dex */
public final /* data */ class RoomConfiguration {
    private final List<RoomAgentDispatch> agents;
    private final Integer departureTimeout;
    private final Integer emptyTimeout;
    private final Integer maxParticipants;
    private final Integer maxPlayoutDelay;
    private final String metadata;
    private final Integer minPlayoutDelay;
    private final String name;
    private final Integer syncStreams;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, null, null, new d(RoomAgentDispatch$$serializer.INSTANCE, 0)};

    @c
    public /* synthetic */ RoomConfiguration(int i10, String str, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, Integer num6, List list, c1 c1Var) {
        if ((i10 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i10 & 2) == 0) {
            this.emptyTimeout = null;
        } else {
            this.emptyTimeout = num;
        }
        if ((i10 & 4) == 0) {
            this.departureTimeout = null;
        } else {
            this.departureTimeout = num2;
        }
        if ((i10 & 8) == 0) {
            this.maxParticipants = null;
        } else {
            this.maxParticipants = num3;
        }
        if ((i10 & 16) == 0) {
            this.metadata = null;
        } else {
            this.metadata = str2;
        }
        if ((i10 & 32) == 0) {
            this.minPlayoutDelay = null;
        } else {
            this.minPlayoutDelay = num4;
        }
        if ((i10 & 64) == 0) {
            this.maxPlayoutDelay = null;
        } else {
            this.maxPlayoutDelay = num5;
        }
        if ((i10 & 128) == 0) {
            this.syncStreams = null;
        } else {
            this.syncStreams = num6;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
            this.agents = null;
        } else {
            this.agents = list;
        }
    }

    public static /* synthetic */ RoomConfiguration copy$default(RoomConfiguration roomConfiguration, String str, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, Integer num6, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = roomConfiguration.name;
        }
        if ((i10 & 2) != 0) {
            num = roomConfiguration.emptyTimeout;
        }
        if ((i10 & 4) != 0) {
            num2 = roomConfiguration.departureTimeout;
        }
        if ((i10 & 8) != 0) {
            num3 = roomConfiguration.maxParticipants;
        }
        if ((i10 & 16) != 0) {
            str2 = roomConfiguration.metadata;
        }
        if ((i10 & 32) != 0) {
            num4 = roomConfiguration.minPlayoutDelay;
        }
        if ((i10 & 64) != 0) {
            num5 = roomConfiguration.maxPlayoutDelay;
        }
        if ((i10 & 128) != 0) {
            num6 = roomConfiguration.syncStreams;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            list = roomConfiguration.agents;
        }
        Integer num7 = num6;
        List list2 = list;
        Integer num8 = num4;
        Integer num9 = num5;
        String str3 = str2;
        Integer num10 = num2;
        return roomConfiguration.copy(str, num, num10, num3, str3, num8, num9, num7, list2);
    }

    public static final /* synthetic */ void write$Self$livekit_android_sdk_release(RoomConfiguration self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.C(serialDesc) || self.name != null) {
            output.o(serialDesc, 0, g1.f34588a, self.name);
        }
        if (output.C(serialDesc) || self.emptyTimeout != null) {
            output.o(serialDesc, 1, f0.f34579a, self.emptyTimeout);
        }
        if (output.C(serialDesc) || self.departureTimeout != null) {
            output.o(serialDesc, 2, f0.f34579a, self.departureTimeout);
        }
        if (output.C(serialDesc) || self.maxParticipants != null) {
            output.o(serialDesc, 3, f0.f34579a, self.maxParticipants);
        }
        if (output.C(serialDesc) || self.metadata != null) {
            output.o(serialDesc, 4, g1.f34588a, self.metadata);
        }
        if (output.C(serialDesc) || self.minPlayoutDelay != null) {
            output.o(serialDesc, 5, f0.f34579a, self.minPlayoutDelay);
        }
        if (output.C(serialDesc) || self.maxPlayoutDelay != null) {
            output.o(serialDesc, 6, f0.f34579a, self.maxPlayoutDelay);
        }
        if (output.C(serialDesc) || self.syncStreams != null) {
            output.o(serialDesc, 7, f0.f34579a, self.syncStreams);
        }
        if (output.C(serialDesc) || self.agents != null) {
            output.o(serialDesc, 8, kSerializerArr[8], self.agents);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getEmptyTimeout() {
        return this.emptyTimeout;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDepartureTimeout() {
        return this.departureTimeout;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getMinPlayoutDelay() {
        return this.minPlayoutDelay;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getMaxPlayoutDelay() {
        return this.maxPlayoutDelay;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getSyncStreams() {
        return this.syncStreams;
    }

    public final List<RoomAgentDispatch> component9() {
        return this.agents;
    }

    public final RoomConfiguration copy(String name, Integer emptyTimeout, Integer departureTimeout, Integer maxParticipants, String metadata, Integer minPlayoutDelay, Integer maxPlayoutDelay, Integer syncStreams, List<RoomAgentDispatch> agents) {
        return new RoomConfiguration(name, emptyTimeout, departureTimeout, maxParticipants, metadata, minPlayoutDelay, maxPlayoutDelay, syncStreams, agents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomConfiguration)) {
            return false;
        }
        RoomConfiguration roomConfiguration = (RoomConfiguration) other;
        if (m.c(this.name, roomConfiguration.name) && m.c(this.emptyTimeout, roomConfiguration.emptyTimeout) && m.c(this.departureTimeout, roomConfiguration.departureTimeout) && m.c(this.maxParticipants, roomConfiguration.maxParticipants) && m.c(this.metadata, roomConfiguration.metadata) && m.c(this.minPlayoutDelay, roomConfiguration.minPlayoutDelay) && m.c(this.maxPlayoutDelay, roomConfiguration.maxPlayoutDelay) && m.c(this.syncStreams, roomConfiguration.syncStreams) && m.c(this.agents, roomConfiguration.agents)) {
            return true;
        }
        return false;
    }

    public final List<RoomAgentDispatch> getAgents() {
        return this.agents;
    }

    public final Integer getDepartureTimeout() {
        return this.departureTimeout;
    }

    public final Integer getEmptyTimeout() {
        return this.emptyTimeout;
    }

    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    public final Integer getMaxPlayoutDelay() {
        return this.maxPlayoutDelay;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Integer getMinPlayoutDelay() {
        return this.minPlayoutDelay;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getSyncStreams() {
        return this.syncStreams;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        String str = this.name;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        Integer num = this.emptyTimeout;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Integer num2 = this.departureTimeout;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Integer num3 = this.maxParticipants;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str2 = this.metadata;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Integer num4 = this.minPlayoutDelay;
        if (num4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num4.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Integer num5 = this.maxPlayoutDelay;
        if (num5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num5.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Integer num6 = this.syncStreams;
        if (num6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num6.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        List<RoomAgentDispatch> list = this.agents;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i18 + i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RoomConfiguration(name=");
        sb.append(this.name);
        sb.append(", emptyTimeout=");
        sb.append(this.emptyTimeout);
        sb.append(", departureTimeout=");
        sb.append(this.departureTimeout);
        sb.append(", maxParticipants=");
        sb.append(this.maxParticipants);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", minPlayoutDelay=");
        sb.append(this.minPlayoutDelay);
        sb.append(", maxPlayoutDelay=");
        sb.append(this.maxPlayoutDelay);
        sb.append(", syncStreams=");
        sb.append(this.syncStreams);
        sb.append(", agents=");
        return n.k(sb, this.agents, ')');
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/token/RoomConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/token/RoomConfiguration;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return RoomConfiguration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RoomConfiguration() {
        this((String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (List) null, 511, (f) null);
    }

    public RoomConfiguration(String str, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, Integer num6, List<RoomAgentDispatch> list) {
        this.name = str;
        this.emptyTimeout = num;
        this.departureTimeout = num2;
        this.maxParticipants = num3;
        this.metadata = str2;
        this.minPlayoutDelay = num4;
        this.maxPlayoutDelay = num5;
        this.syncStreams = num6;
        this.agents = list;
    }

    public /* synthetic */ RoomConfiguration(String str, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, Integer num6, List list, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : num4, (i10 & 64) != 0 ? null : num5, (i10 & 128) != 0 ? null : num6, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : list);
    }
}
