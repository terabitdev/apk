package io.livekit.android.room.participant;

import ho.a;
import io.livekit.android.room.participant.Participant;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lio/livekit/android/room/participant/PendingRpcAck;", "", "Lkotlin/Function0;", "Lsn/z;", "onResolve", "Lio/livekit/android/room/participant/Participant$Identity;", "participantIdentity", "<init>", "(Lho/a;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "component1", "()Lho/a;", "component2--XNT-vU", "()Ljava/lang/String;", "component2", "copy-Fe0n8cs", "(Lho/a;Ljava/lang/String;)Lio/livekit/android/room/participant/PendingRpcAck;", "copy", "", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lho/a;", "getOnResolve", "Ljava/lang/String;", "getParticipantIdentity--XNT-vU", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PendingRpcAck {
    private final a onResolve;
    private final String participantIdentity;

    private PendingRpcAck(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        this.onResolve = aVar;
        this.participantIdentity = str;
    }

    /* renamed from: copy-Fe0n8cs$default, reason: not valid java name */
    public static /* synthetic */ PendingRpcAck m2618copyFe0n8cs$default(PendingRpcAck pendingRpcAck, a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = pendingRpcAck.onResolve;
        }
        if ((i10 & 2) != 0) {
            str = pendingRpcAck.participantIdentity;
        }
        return pendingRpcAck.m2620copyFe0n8cs(aVar, str);
    }

    /* renamed from: component1, reason: from getter */
    public final a getOnResolve() {
        return this.onResolve;
    }

    /* renamed from: component2--XNT-vU, reason: not valid java name and from getter */
    public final String getParticipantIdentity() {
        return this.participantIdentity;
    }

    /* renamed from: copy-Fe0n8cs, reason: not valid java name */
    public final PendingRpcAck m2620copyFe0n8cs(a onResolve, String participantIdentity) {
        onResolve.getClass();
        participantIdentity.getClass();
        return new PendingRpcAck(onResolve, participantIdentity, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingRpcAck)) {
            return false;
        }
        PendingRpcAck pendingRpcAck = (PendingRpcAck) other;
        if (m.c(this.onResolve, pendingRpcAck.onResolve) && Participant.Identity.m2607equalsimpl0(this.participantIdentity, pendingRpcAck.participantIdentity)) {
            return true;
        }
        return false;
    }

    public final a getOnResolve() {
        return this.onResolve;
    }

    /* renamed from: getParticipantIdentity--XNT-vU, reason: not valid java name */
    public final String m2621getParticipantIdentityXNTvU() {
        return this.participantIdentity;
    }

    public int hashCode() {
        return Participant.Identity.m2608hashCodeimpl(this.participantIdentity) + (this.onResolve.hashCode() * 31);
    }

    public String toString() {
        return "PendingRpcAck(onResolve=" + this.onResolve + ", participantIdentity=" + ((Object) Participant.Identity.m2609toStringimpl(this.participantIdentity)) + ')';
    }

    public /* synthetic */ PendingRpcAck(a aVar, String str, f fVar) {
        this(aVar, str);
    }
}
