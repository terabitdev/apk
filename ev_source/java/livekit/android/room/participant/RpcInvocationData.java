package io.livekit.android.room.participant;

import ib.i;
import io.livekit.android.room.participant.Participant;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import xq.a;
import xq.b;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0016\u0010\u0012\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010\fR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lio/livekit/android/room/participant/RpcInvocationData;", "", "", "requestId", "Lio/livekit/android/room/participant/Participant$Identity;", "callerIdentity", "payload", "Lxq/b;", "responseTimeout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/f;)V", "component1", "()Ljava/lang/String;", "component2--XNT-vU", "component2", "component3", "component4-UwyO8pc", "()J", "component4", "copy-CBtOpK0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lio/livekit/android/room/participant/RpcInvocationData;", "copy", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "getCallerIdentity--XNT-vU", "getPayload", "J", "getResponseTimeout-UwyO8pc", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class RpcInvocationData {
    private final String callerIdentity;
    private final String payload;
    private final String requestId;
    private final long responseTimeout;

    private RpcInvocationData(String str, String str2, String str3, long j4) {
        i.s(str, str2, str3);
        this.requestId = str;
        this.callerIdentity = str2;
        this.payload = str3;
        this.responseTimeout = j4;
    }

    /* renamed from: copy-CBtOpK0$default, reason: not valid java name */
    public static /* synthetic */ RpcInvocationData m2626copyCBtOpK0$default(RpcInvocationData rpcInvocationData, String str, String str2, String str3, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rpcInvocationData.requestId;
        }
        if ((i10 & 2) != 0) {
            str2 = rpcInvocationData.callerIdentity;
        }
        if ((i10 & 4) != 0) {
            str3 = rpcInvocationData.payload;
        }
        if ((i10 & 8) != 0) {
            j4 = rpcInvocationData.responseTimeout;
        }
        String str4 = str3;
        return rpcInvocationData.m2629copyCBtOpK0(str, str2, str4, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2--XNT-vU, reason: not valid java name and from getter */
    public final String getCallerIdentity() {
        return this.callerIdentity;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* renamed from: component4-UwyO8pc, reason: not valid java name and from getter */
    public final long getResponseTimeout() {
        return this.responseTimeout;
    }

    /* renamed from: copy-CBtOpK0, reason: not valid java name */
    public final RpcInvocationData m2629copyCBtOpK0(String requestId, String callerIdentity, String payload, long responseTimeout) {
        requestId.getClass();
        callerIdentity.getClass();
        payload.getClass();
        return new RpcInvocationData(requestId, callerIdentity, payload, responseTimeout, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof RpcInvocationData) {
            RpcInvocationData rpcInvocationData = (RpcInvocationData) other;
            if (m.c(this.requestId, rpcInvocationData.requestId) && Participant.Identity.m2607equalsimpl0(this.callerIdentity, rpcInvocationData.callerIdentity) && m.c(this.payload, rpcInvocationData.payload)) {
                long j4 = this.responseTimeout;
                long j10 = rpcInvocationData.responseTimeout;
                a aVar = b.f38124b;
                if (j4 == j10) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: getCallerIdentity--XNT-vU, reason: not valid java name */
    public final String m2630getCallerIdentityXNTvU() {
        return this.callerIdentity;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: getResponseTimeout-UwyO8pc, reason: not valid java name */
    public final long m2631getResponseTimeoutUwyO8pc() {
        return this.responseTimeout;
    }

    public int hashCode() {
        int c5 = c.c((Participant.Identity.m2608hashCodeimpl(this.callerIdentity) + (this.requestId.hashCode() * 31)) * 31, 31, this.payload);
        long j4 = this.responseTimeout;
        a aVar = b.f38124b;
        return Long.hashCode(j4) + c5;
    }

    public String toString() {
        return "RpcInvocationData(requestId=" + this.requestId + ", callerIdentity=" + ((Object) Participant.Identity.m2609toStringimpl(this.callerIdentity)) + ", payload=" + this.payload + ", responseTimeout=" + ((Object) b.j(this.responseTimeout)) + ')';
    }

    public /* synthetic */ RpcInvocationData(String str, String str2, String str3, long j4, f fVar) {
        this(str, str2, str3, j4);
    }
}
