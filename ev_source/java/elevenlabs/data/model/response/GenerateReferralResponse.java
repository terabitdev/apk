package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b+\u0010'\u001a\u0004\b\u0006\u0010\u001b¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/GenerateReferralResponse;", "", "", "referralCode", "referralUrl", "", "isNew", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GenerateReferralResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lio/elevenlabs/data/model/response/GenerateReferralResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReferralCode", "getReferralCode$annotations", "()V", "getReferralUrl", "getReferralUrl$annotations", "Z", "isNew$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GenerateReferralResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isNew;
    private final String referralCode;
    private final String referralUrl;

    public /* synthetic */ GenerateReferralResponse(int i10, String str, String str2, boolean z6, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.referralCode = str;
            this.referralUrl = str2;
            this.isNew = z6;
            return;
        }
        t0.j(i10, 7, GenerateReferralResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ GenerateReferralResponse copy$default(GenerateReferralResponse generateReferralResponse, String str, String str2, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = generateReferralResponse.referralCode;
        }
        if ((i10 & 2) != 0) {
            str2 = generateReferralResponse.referralUrl;
        }
        if ((i10 & 4) != 0) {
            z6 = generateReferralResponse.isNew;
        }
        return generateReferralResponse.copy(str, str2, z6);
    }

    public static final /* synthetic */ void write$Self$data_release(GenerateReferralResponse self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.referralCode);
        output.V(serialDesc, 1, self.referralUrl);
        output.T(serialDesc, 2, self.isNew);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReferralUrl() {
        return this.referralUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    public final GenerateReferralResponse copy(String referralCode, String referralUrl, boolean isNew) {
        referralCode.getClass();
        referralUrl.getClass();
        return new GenerateReferralResponse(referralCode, referralUrl, isNew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateReferralResponse)) {
            return false;
        }
        GenerateReferralResponse generateReferralResponse = (GenerateReferralResponse) other;
        if (m.c(this.referralCode, generateReferralResponse.referralCode) && m.c(this.referralUrl, generateReferralResponse.referralUrl) && this.isNew == generateReferralResponse.isNew) {
            return true;
        }
        return false;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public final String getReferralUrl() {
        return this.referralUrl;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNew) + j0.c.c(this.referralCode.hashCode() * 31, 31, this.referralUrl);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        String str = this.referralCode;
        String str2 = this.referralUrl;
        return n.j(Separators.RPAREN, f.s("GenerateReferralResponse(referralCode=", str, ", referralUrl=", str2, ", isNew="), this.isNew);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GenerateReferralResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GenerateReferralResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GenerateReferralResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getReferralCode$annotations() {
    }

    public static /* synthetic */ void getReferralUrl$annotations() {
    }

    public static /* synthetic */ void isNew$annotations() {
    }

    public GenerateReferralResponse(String str, String str2, boolean z6) {
        str.getClass();
        str2.getClass();
        this.referralCode = str;
        this.referralUrl = str2;
        this.isNew = z6;
    }
}
