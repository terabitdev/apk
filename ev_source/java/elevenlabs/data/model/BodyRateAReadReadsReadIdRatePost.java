package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, d2 = {"Lio/elevenlabs/data/model/BodyRateAReadReadsReadIdRatePost;", "", "", MetaStatKeys.KEY_RATING, "<init>", "(J)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IJLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/BodyRateAReadReadsReadIdRatePost;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lio/elevenlabs/data/model/BodyRateAReadReadsReadIdRatePost;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getRating", "getRating$annotations", "()V", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BodyRateAReadReadsReadIdRatePost {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long rating;

    public /* synthetic */ BodyRateAReadReadsReadIdRatePost(int i10, long j4, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.rating = j4;
        } else {
            t0.j(i10, 1, BodyRateAReadReadsReadIdRatePost$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ BodyRateAReadReadsReadIdRatePost copy$default(BodyRateAReadReadsReadIdRatePost bodyRateAReadReadsReadIdRatePost, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = bodyRateAReadReadsReadIdRatePost.rating;
        }
        return bodyRateAReadReadsReadIdRatePost.copy(j4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRating() {
        return this.rating;
    }

    public final BodyRateAReadReadsReadIdRatePost copy(long rating) {
        return new BodyRateAReadReadsReadIdRatePost(rating);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof BodyRateAReadReadsReadIdRatePost) && this.rating == ((BodyRateAReadReadsReadIdRatePost) other).rating) {
            return true;
        }
        return false;
    }

    public final long getRating() {
        return this.rating;
    }

    public int hashCode() {
        return Long.hashCode(this.rating);
    }

    public String toString() {
        return android.gov.nist.javax.sip.header.a.k("BodyRateAReadReadsReadIdRatePost(rating=", this.rating, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BodyRateAReadReadsReadIdRatePost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BodyRateAReadReadsReadIdRatePost;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BodyRateAReadReadsReadIdRatePost$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getRating$annotations() {
    }

    public BodyRateAReadReadsReadIdRatePost(long j4) {
        this.rating = j4;
    }
}
