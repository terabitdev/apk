package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001e¨\u00067"}, d2 = {"Lio/elevenlabs/data/model/response/UseReferralResponse;", "", "", FirebaseAnalytics.Param.SUCCESS, "", "creditsAllocated", "hoursAllocated", "subscriptionMonths", "<init>", "(ZJJLjava/lang/Long;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IZJJLjava/lang/Long;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/UseReferralResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()J", "component3", "component4", "()Ljava/lang/Long;", "copy", "(ZJJLjava/lang/Long;)Lio/elevenlabs/data/model/response/UseReferralResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "getSuccess$annotations", "()V", "J", "getCreditsAllocated", "getCreditsAllocated$annotations", "getHoursAllocated", "getHoursAllocated$annotations", "Ljava/lang/Long;", "getSubscriptionMonths", "getSubscriptionMonths$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class UseReferralResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long creditsAllocated;
    private final long hoursAllocated;
    private final Long subscriptionMonths;
    private final boolean success;

    public /* synthetic */ UseReferralResponse(int i10, boolean z6, long j4, long j10, Long l4, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.success = z6;
            this.creditsAllocated = j4;
            this.hoursAllocated = j10;
            if ((i10 & 8) == 0) {
                this.subscriptionMonths = null;
                return;
            } else {
                this.subscriptionMonths = l4;
                return;
            }
        }
        t0.j(i10, 7, UseReferralResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ UseReferralResponse copy$default(UseReferralResponse useReferralResponse, boolean z6, long j4, long j10, Long l4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = useReferralResponse.success;
        }
        if ((i10 & 2) != 0) {
            j4 = useReferralResponse.creditsAllocated;
        }
        if ((i10 & 4) != 0) {
            j10 = useReferralResponse.hoursAllocated;
        }
        if ((i10 & 8) != 0) {
            l4 = useReferralResponse.subscriptionMonths;
        }
        Long l7 = l4;
        return useReferralResponse.copy(z6, j4, j10, l7);
    }

    public static final /* synthetic */ void write$Self$data_release(UseReferralResponse self, tr.b output, SerialDescriptor serialDesc) {
        output.T(serialDesc, 0, self.success);
        output.h0(serialDesc, 1, self.creditsAllocated);
        output.h0(serialDesc, 2, self.hoursAllocated);
        if (output.C(serialDesc) || self.subscriptionMonths != null) {
            output.o(serialDesc, 3, l0.f34611a, self.subscriptionMonths);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCreditsAllocated() {
        return this.creditsAllocated;
    }

    /* renamed from: component3, reason: from getter */
    public final long getHoursAllocated() {
        return this.hoursAllocated;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getSubscriptionMonths() {
        return this.subscriptionMonths;
    }

    public final UseReferralResponse copy(boolean success, long creditsAllocated, long hoursAllocated, Long subscriptionMonths) {
        return new UseReferralResponse(success, creditsAllocated, hoursAllocated, subscriptionMonths);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UseReferralResponse)) {
            return false;
        }
        UseReferralResponse useReferralResponse = (UseReferralResponse) other;
        if (this.success == useReferralResponse.success && this.creditsAllocated == useReferralResponse.creditsAllocated && this.hoursAllocated == useReferralResponse.hoursAllocated && m.c(this.subscriptionMonths, useReferralResponse.subscriptionMonths)) {
            return true;
        }
        return false;
    }

    public final long getCreditsAllocated() {
        return this.creditsAllocated;
    }

    public final long getHoursAllocated() {
        return this.hoursAllocated;
    }

    public final Long getSubscriptionMonths() {
        return this.subscriptionMonths;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode;
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.hoursAllocated, com.google.android.gms.internal.play_billing.b.g(this.creditsAllocated, Boolean.hashCode(this.success) * 31, 31), 31);
        Long l4 = this.subscriptionMonths;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        return g10 + hashCode;
    }

    public String toString() {
        boolean z6 = this.success;
        long j4 = this.creditsAllocated;
        long j10 = this.hoursAllocated;
        Long l4 = this.subscriptionMonths;
        StringBuilder sb = new StringBuilder("UseReferralResponse(success=");
        sb.append(z6);
        sb.append(", creditsAllocated=");
        sb.append(j4);
        com.google.android.gms.internal.play_billing.b.w(sb, ", hoursAllocated=", j10, ", subscriptionMonths=");
        sb.append(l4);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/UseReferralResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/UseReferralResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return UseReferralResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCreditsAllocated$annotations() {
    }

    public static /* synthetic */ void getHoursAllocated$annotations() {
    }

    public static /* synthetic */ void getSubscriptionMonths$annotations() {
    }

    public static /* synthetic */ void getSuccess$annotations() {
    }

    public UseReferralResponse(boolean z6, long j4, long j10, Long l4) {
        this.success = z6;
        this.creditsAllocated = j4;
        this.hoursAllocated = j10;
        this.subscriptionMonths = l4;
    }

    public /* synthetic */ UseReferralResponse(boolean z6, long j4, long j10, Long l4, int i10, f fVar) {
        this(z6, j4, j10, (i10 & 8) != 0 ? null : l4);
    }
}
