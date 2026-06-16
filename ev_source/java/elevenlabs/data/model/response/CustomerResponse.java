package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.model.BigDecimalJson;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bq\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00060\u0002j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0014\u0010\u001b\u001a\u00060\u0002j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%Jx\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u00042\f\b\u0002\u0010\u0007\u001a\u00060\u0002j\u0002`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0019R$\u0010\u0005\u001a\u00060\u0002j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b<\u0010:\u001a\u0004\b;\u0010\u0019R$\u0010\u0007\u001a\u00060\u0002j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b>\u0010:\u001a\u0004\b=\u0010\u0019R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bA\u0010:\u001a\u0004\b@\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010\u001dR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010D\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010 R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bH\u0010:\u001a\u0004\bG\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bJ\u0010:\u001a\u0004\b\u000e\u0010#R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010K\u0012\u0004\bM\u0010:\u001a\u0004\bL\u0010%¨\u0006P"}, d2 = {"Lio/elevenlabs/data/model/response/CustomerResponse;", "", "", "id", "Lio/elevenlabs/data/model/ReaderSubscriptionPlan;", "plan", "Lio/elevenlabs/data/model/BillingPeriod;", "billingPeriod", "Lio/elevenlabs/data/model/BigDecimalJson;", "currentCredits", "premiumBooksCredits", "", "canUpgrade", "canTrial", "isWinBackEligible", "", "nextCreditDateUnix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;ZZLjava/lang/Boolean;Ljava/lang/Long;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;ZZLjava/lang/Boolean;Ljava/lang/Long;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lio/elevenlabs/data/model/BigDecimalJson;", "component5", "component6", "()Z", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;ZZLjava/lang/Boolean;Ljava/lang/Long;)Lio/elevenlabs/data/model/response/CustomerResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/CustomerResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getPlan", "getPlan$annotations", "getBillingPeriod", "getBillingPeriod$annotations", "Lio/elevenlabs/data/model/BigDecimalJson;", "getCurrentCredits", "getCurrentCredits$annotations", "getPremiumBooksCredits", "getPremiumBooksCredits$annotations", "Z", "getCanUpgrade", "getCanUpgrade$annotations", "getCanTrial", "getCanTrial$annotations", "Ljava/lang/Boolean;", "isWinBackEligible$annotations", "Ljava/lang/Long;", "getNextCreditDateUnix", "getNextCreditDateUnix$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class CustomerResponse {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String billingPeriod;
    private final boolean canTrial;
    private final boolean canUpgrade;
    private final BigDecimalJson currentCredits;
    private final String id;
    private final Boolean isWinBackEligible;
    private final Long nextCreditDateUnix;
    private final String plan;
    private final BigDecimalJson premiumBooksCredits;

    static {
        io.elevenlabs.data.model.a aVar = new io.elevenlabs.data.model.a(22);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, sn.a.d(iVar, aVar), sn.a.d(iVar, new io.elevenlabs.data.model.a(23)), sn.a.d(iVar, new io.elevenlabs.data.model.a(24)), sn.a.d(iVar, new io.elevenlabs.data.model.a(25)), null, null, null, null};
    }

    public /* synthetic */ CustomerResponse(int i10, String str, String str2, String str3, BigDecimalJson bigDecimalJson, BigDecimalJson bigDecimalJson2, boolean z6, boolean z10, Boolean bool, Long l4, c1 c1Var) {
        if (47 == (i10 & 47)) {
            this.id = str;
            this.plan = str2;
            this.billingPeriod = str3;
            this.currentCredits = bigDecimalJson;
            if ((i10 & 16) == 0) {
                this.premiumBooksCredits = null;
            } else {
                this.premiumBooksCredits = bigDecimalJson2;
            }
            this.canUpgrade = z6;
            if ((i10 & 64) == 0) {
                this.canTrial = true;
            } else {
                this.canTrial = z10;
            }
            if ((i10 & 128) == 0) {
                this.isWinBackEligible = null;
            } else {
                this.isWinBackEligible = bool;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.nextCreditDateUnix = null;
                return;
            } else {
                this.nextCreditDateUnix = l4;
                return;
            }
        }
        t0.j(i10, 47, CustomerResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final KSerializer _childSerializers$_anonymous_() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$1() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), BigDecimalJson.INSTANCE.serializer(), new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$2() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), rd.c1.w(BigDecimalJson.INSTANCE.serializer()), new KSerializer[0]);
    }

    public static /* synthetic */ CustomerResponse copy$default(CustomerResponse customerResponse, String str, String str2, String str3, BigDecimalJson bigDecimalJson, BigDecimalJson bigDecimalJson2, boolean z6, boolean z10, Boolean bool, Long l4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerResponse.id;
        }
        if ((i10 & 2) != 0) {
            str2 = customerResponse.plan;
        }
        if ((i10 & 4) != 0) {
            str3 = customerResponse.billingPeriod;
        }
        if ((i10 & 8) != 0) {
            bigDecimalJson = customerResponse.currentCredits;
        }
        if ((i10 & 16) != 0) {
            bigDecimalJson2 = customerResponse.premiumBooksCredits;
        }
        if ((i10 & 32) != 0) {
            z6 = customerResponse.canUpgrade;
        }
        if ((i10 & 64) != 0) {
            z10 = customerResponse.canTrial;
        }
        if ((i10 & 128) != 0) {
            bool = customerResponse.isWinBackEligible;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            l4 = customerResponse.nextCreditDateUnix;
        }
        Boolean bool2 = bool;
        Long l7 = l4;
        boolean z11 = z6;
        boolean z12 = z10;
        BigDecimalJson bigDecimalJson3 = bigDecimalJson2;
        String str4 = str3;
        return customerResponse.copy(str, str2, str4, bigDecimalJson, bigDecimalJson3, z11, z12, bool2, l7);
    }

    public static final /* synthetic */ void write$Self$data_release(CustomerResponse self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.id);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.plan);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.billingPeriod);
        output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.currentCredits);
        if (output.C(serialDesc) || self.premiumBooksCredits != null) {
            output.o(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.premiumBooksCredits);
        }
        output.T(serialDesc, 5, self.canUpgrade);
        if (output.C(serialDesc) || !self.canTrial) {
            output.T(serialDesc, 6, self.canTrial);
        }
        if (output.C(serialDesc) || self.isWinBackEligible != null) {
            output.o(serialDesc, 7, ur.g.f34583a, self.isWinBackEligible);
        }
        if (output.C(serialDesc) || self.nextCreditDateUnix != null) {
            output.o(serialDesc, 8, l0.f34611a, self.nextCreditDateUnix);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlan() {
        return this.plan;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimalJson getCurrentCredits() {
        return this.currentCredits;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimalJson getPremiumBooksCredits() {
        return this.premiumBooksCredits;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCanTrial() {
        return this.canTrial;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsWinBackEligible() {
        return this.isWinBackEligible;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getNextCreditDateUnix() {
        return this.nextCreditDateUnix;
    }

    public final CustomerResponse copy(String id2, String plan, String billingPeriod, BigDecimalJson currentCredits, BigDecimalJson premiumBooksCredits, boolean canUpgrade, boolean canTrial, Boolean isWinBackEligible, Long nextCreditDateUnix) {
        id2.getClass();
        plan.getClass();
        billingPeriod.getClass();
        currentCredits.getClass();
        return new CustomerResponse(id2, plan, billingPeriod, currentCredits, premiumBooksCredits, canUpgrade, canTrial, isWinBackEligible, nextCreditDateUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerResponse)) {
            return false;
        }
        CustomerResponse customerResponse = (CustomerResponse) other;
        if (m.c(this.id, customerResponse.id) && m.c(this.plan, customerResponse.plan) && m.c(this.billingPeriod, customerResponse.billingPeriod) && m.c(this.currentCredits, customerResponse.currentCredits) && m.c(this.premiumBooksCredits, customerResponse.premiumBooksCredits) && this.canUpgrade == customerResponse.canUpgrade && this.canTrial == customerResponse.canTrial && m.c(this.isWinBackEligible, customerResponse.isWinBackEligible) && m.c(this.nextCreditDateUnix, customerResponse.nextCreditDateUnix)) {
            return true;
        }
        return false;
    }

    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    public final boolean getCanTrial() {
        return this.canTrial;
    }

    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final BigDecimalJson getCurrentCredits() {
        return this.currentCredits;
    }

    public final String getId() {
        return this.id;
    }

    public final Long getNextCreditDateUnix() {
        return this.nextCreditDateUnix;
    }

    public final String getPlan() {
        return this.plan;
    }

    public final BigDecimalJson getPremiumBooksCredits() {
        return this.premiumBooksCredits;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.currentCredits.hashCode() + j0.c.c(j0.c.c(this.id.hashCode() * 31, 31, this.plan), 31, this.billingPeriod)) * 31;
        BigDecimalJson bigDecimalJson = this.premiumBooksCredits;
        int i10 = 0;
        if (bigDecimalJson == null) {
            hashCode = 0;
        } else {
            hashCode = bigDecimalJson.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((hashCode3 + hashCode) * 31, 31, this.canUpgrade), 31, this.canTrial);
        Boolean bool = this.isWinBackEligible;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        Long l4 = this.nextCreditDateUnix;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return i11 + i10;
    }

    public final Boolean isWinBackEligible() {
        return this.isWinBackEligible;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.plan;
        String str3 = this.billingPeriod;
        BigDecimalJson bigDecimalJson = this.currentCredits;
        BigDecimalJson bigDecimalJson2 = this.premiumBooksCredits;
        boolean z6 = this.canUpgrade;
        boolean z10 = this.canTrial;
        Boolean bool = this.isWinBackEligible;
        Long l4 = this.nextCreditDateUnix;
        StringBuilder s10 = f.s("CustomerResponse(id=", str, ", plan=", str2, ", billingPeriod=");
        s10.append(str3);
        s10.append(", currentCredits=");
        s10.append(bigDecimalJson);
        s10.append(", premiumBooksCredits=");
        s10.append(bigDecimalJson2);
        s10.append(", canUpgrade=");
        s10.append(z6);
        s10.append(", canTrial=");
        s10.append(z10);
        s10.append(", isWinBackEligible=");
        s10.append(bool);
        s10.append(", nextCreditDateUnix=");
        s10.append(l4);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/CustomerResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/CustomerResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return CustomerResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBillingPeriod$annotations() {
    }

    public static /* synthetic */ void getCanTrial$annotations() {
    }

    public static /* synthetic */ void getCanUpgrade$annotations() {
    }

    public static /* synthetic */ void getCurrentCredits$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getNextCreditDateUnix$annotations() {
    }

    public static /* synthetic */ void getPlan$annotations() {
    }

    public static /* synthetic */ void getPremiumBooksCredits$annotations() {
    }

    public static /* synthetic */ void isWinBackEligible$annotations() {
    }

    public CustomerResponse(String str, String str2, String str3, BigDecimalJson bigDecimalJson, BigDecimalJson bigDecimalJson2, boolean z6, boolean z10, Boolean bool, Long l4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        bigDecimalJson.getClass();
        this.id = str;
        this.plan = str2;
        this.billingPeriod = str3;
        this.currentCredits = bigDecimalJson;
        this.premiumBooksCredits = bigDecimalJson2;
        this.canUpgrade = z6;
        this.canTrial = z10;
        this.isWinBackEligible = bool;
        this.nextCreditDateUnix = l4;
    }

    public /* synthetic */ CustomerResponse(String str, String str2, String str3, BigDecimalJson bigDecimalJson, BigDecimalJson bigDecimalJson2, boolean z6, boolean z10, Boolean bool, Long l4, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, bigDecimalJson, (i10 & 16) != 0 ? null : bigDecimalJson2, z6, (i10 & 64) != 0 ? true : z10, (i10 & 128) != 0 ? null : bool, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : l4);
    }
}
