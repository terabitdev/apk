package io.livekit.android.token;

import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.c;
import tr.b;
import ur.c1;
import ur.g1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lio/livekit/android/token/RoomAgentDispatch;", "", "", "agentName", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$livekit_android_sdk_release", "(Lio/livekit/android/token/RoomAgentDispatch;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/livekit/android/token/RoomAgentDispatch;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgentName", "getMetadata", "Companion", "$serializer", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes4.dex */
public final /* data */ class RoomAgentDispatch {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String agentName;
    private final String metadata;

    @c
    public /* synthetic */ RoomAgentDispatch(int i10, String str, String str2, c1 c1Var) {
        if ((i10 & 1) == 0) {
            this.agentName = null;
        } else {
            this.agentName = str;
        }
        if ((i10 & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = str2;
        }
    }

    public static /* synthetic */ RoomAgentDispatch copy$default(RoomAgentDispatch roomAgentDispatch, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = roomAgentDispatch.agentName;
        }
        if ((i10 & 2) != 0) {
            str2 = roomAgentDispatch.metadata;
        }
        return roomAgentDispatch.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$livekit_android_sdk_release(RoomAgentDispatch self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.agentName != null) {
            output.o(serialDesc, 0, g1.f34588a, self.agentName);
        }
        if (output.C(serialDesc) || self.metadata != null) {
            output.o(serialDesc, 1, g1.f34588a, self.metadata);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgentName() {
        return this.agentName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    public final RoomAgentDispatch copy(String agentName, String metadata) {
        return new RoomAgentDispatch(agentName, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomAgentDispatch)) {
            return false;
        }
        RoomAgentDispatch roomAgentDispatch = (RoomAgentDispatch) other;
        if (m.c(this.agentName, roomAgentDispatch.agentName) && m.c(this.metadata, roomAgentDispatch.metadata)) {
            return true;
        }
        return false;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode;
        String str = this.agentName;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.metadata;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RoomAgentDispatch(agentName=");
        sb.append(this.agentName);
        sb.append(", metadata=");
        return f.m(sb, this.metadata, ')');
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/token/RoomAgentDispatch$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/token/RoomAgentDispatch;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return RoomAgentDispatch$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RoomAgentDispatch() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.f) (0 == true ? 1 : 0));
    }

    public RoomAgentDispatch(String str, String str2) {
        this.agentName = str;
        this.metadata = str2;
    }

    public /* synthetic */ RoomAgentDispatch(String str, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
