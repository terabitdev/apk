package io.livekit.android.room.participant;

import ho.p;
import io.livekit.android.room.participant.Participant;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0012\u001a\u00020\u00002\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR-\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lio/livekit/android/room/participant/PendingRpcResponse;", "", "Lkotlin/Function2;", "", "Lio/livekit/android/rpc/RpcError;", "Lsn/z;", "onResolve", "Lio/livekit/android/room/participant/Participant$Identity;", "participantIdentity", "<init>", "(Lho/p;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "component1", "()Lho/p;", "component2--XNT-vU", "()Ljava/lang/String;", "component2", "copy-Fe0n8cs", "(Lho/p;Ljava/lang/String;)Lio/livekit/android/room/participant/PendingRpcResponse;", "copy", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lho/p;", "getOnResolve", "Ljava/lang/String;", "getParticipantIdentity--XNT-vU", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PendingRpcResponse {
    private final p onResolve;
    private final String participantIdentity;

    private PendingRpcResponse(p pVar, String str) {
        pVar.getClass();
        str.getClass();
        this.onResolve = pVar;
        this.participantIdentity = str;
    }

    /* renamed from: copy-Fe0n8cs$default, reason: not valid java name */
    public static /* synthetic */ PendingRpcResponse m2622copyFe0n8cs$default(PendingRpcResponse pendingRpcResponse, p pVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pVar = pendingRpcResponse.onResolve;
        }
        if ((i10 & 2) != 0) {
            str = pendingRpcResponse.participantIdentity;
        }
        return pendingRpcResponse.m2624copyFe0n8cs(pVar, str);
    }

    /* renamed from: component1, reason: from getter */
    public final p getOnResolve() {
        return this.onResolve;
    }

    /* renamed from: component2--XNT-vU, reason: not valid java name and from getter */
    public final String getParticipantIdentity() {
        return this.participantIdentity;
    }

    /* renamed from: copy-Fe0n8cs, reason: not valid java name */
    public final PendingRpcResponse m2624copyFe0n8cs(p onResolve, String participantIdentity) {
        onResolve.getClass();
        participantIdentity.getClass();
        return new PendingRpcResponse(onResolve, participantIdentity, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingRpcResponse)) {
            return false;
        }
        PendingRpcResponse pendingRpcResponse = (PendingRpcResponse) other;
        if (m.c(this.onResolve, pendingRpcResponse.onResolve) && Participant.Identity.m2607equalsimpl0(this.participantIdentity, pendingRpcResponse.participantIdentity)) {
            return true;
        }
        return false;
    }

    public final p getOnResolve() {
        return this.onResolve;
    }

    /* renamed from: getParticipantIdentity--XNT-vU, reason: not valid java name */
    public final String m2625getParticipantIdentityXNTvU() {
        return this.participantIdentity;
    }

    public int hashCode() {
        return Participant.Identity.m2608hashCodeimpl(this.participantIdentity) + (this.onResolve.hashCode() * 31);
    }

    public String toString() {
        return "PendingRpcResponse(onResolve=" + this.onResolve + ", participantIdentity=" + ((Object) Participant.Identity.m2609toStringimpl(this.participantIdentity)) + ')';
    }

    public /* synthetic */ PendingRpcResponse(p pVar, String str, f fVar) {
        this(pVar, str);
    }
}
