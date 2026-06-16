package io.elevenlabs.data.services.optimized;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lio/elevenlabs/data/services/optimized/TsPairBlob;", "", "", "charOffset", "", "ts", "<init>", "(JD)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IJDLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/services/optimized/TsPairBlob;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()D", "copy", "(JD)Lio/elevenlabs/data/services/optimized/TsPairBlob;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCharOffset", "D", "getTs", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class TsPairBlob {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long charOffset;
    private final double ts;

    public /* synthetic */ TsPairBlob(int i10, long j4, double d10, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.charOffset = j4;
            this.ts = d10;
        } else {
            t0.j(i10, 3, TsPairBlob$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ TsPairBlob copy$default(TsPairBlob tsPairBlob, long j4, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = tsPairBlob.charOffset;
        }
        if ((i10 & 2) != 0) {
            d10 = tsPairBlob.ts;
        }
        return tsPairBlob.copy(j4, d10);
    }

    public static final /* synthetic */ void write$Self$data_release(TsPairBlob self, b output, SerialDescriptor serialDesc) {
        output.h0(serialDesc, 0, self.charOffset);
        output.e0(serialDesc, 1, self.ts);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCharOffset() {
        return this.charOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTs() {
        return this.ts;
    }

    public final TsPairBlob copy(long charOffset, double ts) {
        return new TsPairBlob(charOffset, ts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TsPairBlob)) {
            return false;
        }
        TsPairBlob tsPairBlob = (TsPairBlob) other;
        if (this.charOffset == tsPairBlob.charOffset && Double.compare(this.ts, tsPairBlob.ts) == 0) {
            return true;
        }
        return false;
    }

    public final long getCharOffset() {
        return this.charOffset;
    }

    public final double getTs() {
        return this.ts;
    }

    public int hashCode() {
        return Double.hashCode(this.ts) + (Long.hashCode(this.charOffset) * 31);
    }

    public String toString() {
        long j4 = this.charOffset;
        double d10 = this.ts;
        StringBuilder q = com.google.android.gms.internal.play_billing.b.q("TsPairBlob(charOffset=", j4, ", ts=");
        q.append(d10);
        q.append(Separators.RPAREN);
        return q.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/services/optimized/TsPairBlob$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/services/optimized/TsPairBlob;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return TsPairBlob$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TsPairBlob(long j4, double d10) {
        this.charOffset = j4;
        this.ts = d10;
    }
}
