package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABS\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\t\u001a\u00060\u0002j\u0002`\b\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0014\u0010\u0015\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0014\u0010\u001a\u001a\u00060\u0002j\u0002`\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0014\u0010\u001b\u001a\u00060\u0002j\u0002`\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJh\u0010\u001e\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\f\b\u0002\u0010\t\u001a\u00060\u0002j\u0002`\b2\f\b\u0002\u0010\u000b\u001a\u00060\u0002j\u0002`\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J'\u0010/\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.R$\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b5\u00103\u001a\u0004\b4\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b7\u00103\u001a\u0004\b6\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b9\u00103\u001a\u0004\b8\u0010\u0016R$\u0010\t\u001a\u00060\u0002j\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b;\u00103\u001a\u0004\b:\u0010\u0016R$\u0010\u000b\u001a\u00060\u0002j\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b=\u00103\u001a\u0004\b<\u0010\u0016R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\b@\u00103\u001a\u0004\b?\u0010\u001d¨\u0006C"}, d2 = {"Lio/elevenlabs/data/model/SubscriptionProductV2;", "", "", "Lio/elevenlabs/data/model/RevenueCatSubscriptionProductId;", "id", "title", "description", "badgeText", "Lio/elevenlabs/data/model/ReaderSubscriptionPlan;", "plan", "Lio/elevenlabs/data/model/BillingPeriod;", "billingPeriod", "Lio/elevenlabs/data/model/StripePrice;", "stripePrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/StripePrice;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/StripePrice;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lio/elevenlabs/data/model/StripePrice;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/StripePrice;)Lio/elevenlabs/data/model/SubscriptionProductV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/SubscriptionProductV2;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "getBadgeText", "getBadgeText$annotations", "getPlan", "getPlan$annotations", "getBillingPeriod", "getBillingPeriod$annotations", "Lio/elevenlabs/data/model/StripePrice;", "getStripePrice", "getStripePrice$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionProductV2 {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String badgeText;
    private final String billingPeriod;
    private final String description;
    private final String id;
    private final String plan;
    private final StripePrice stripePrice;
    private final String title;

    static {
        io.elevenlabs.data.database.entities.reads.a aVar = new io.elevenlabs.data.database.entities.reads.a(27);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), null, null, null, sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(28)), sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(29)), null};
    }

    public /* synthetic */ SubscriptionProductV2(int i10, String str, String str2, String str3, String str4, String str5, String str6, StripePrice stripePrice, c1 c1Var) {
        if (63 == (i10 & 63)) {
            this.id = str;
            this.title = str2;
            this.description = str3;
            this.badgeText = str4;
            this.plan = str5;
            this.billingPeriod = str6;
            if ((i10 & 64) == 0) {
                this.stripePrice = null;
                return;
            } else {
                this.stripePrice = stripePrice;
                return;
            }
        }
        t0.j(i10, 63, SubscriptionProductV2$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final KSerializer _childSerializers$_anonymous_() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$1() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static /* synthetic */ SubscriptionProductV2 copy$default(SubscriptionProductV2 subscriptionProductV2, String str, String str2, String str3, String str4, String str5, String str6, StripePrice stripePrice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionProductV2.id;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriptionProductV2.title;
        }
        if ((i10 & 4) != 0) {
            str3 = subscriptionProductV2.description;
        }
        if ((i10 & 8) != 0) {
            str4 = subscriptionProductV2.badgeText;
        }
        if ((i10 & 16) != 0) {
            str5 = subscriptionProductV2.plan;
        }
        if ((i10 & 32) != 0) {
            str6 = subscriptionProductV2.billingPeriod;
        }
        if ((i10 & 64) != 0) {
            stripePrice = subscriptionProductV2.stripePrice;
        }
        String str7 = str6;
        StripePrice stripePrice2 = stripePrice;
        String str8 = str5;
        String str9 = str3;
        return subscriptionProductV2.copy(str, str2, str9, str4, str8, str7, stripePrice2);
    }

    public static final /* synthetic */ void write$Self$data_release(SubscriptionProductV2 self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.id);
        output.V(serialDesc, 1, self.title);
        g1 g1Var = g1.f34588a;
        output.o(serialDesc, 2, g1Var, self.description);
        output.o(serialDesc, 3, g1Var, self.badgeText);
        output.g(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.plan);
        output.g(serialDesc, 5, (KSerializer) hVarArr[5].getValue(), self.billingPeriod);
        if (output.C(serialDesc) || self.stripePrice != null) {
            output.o(serialDesc, 6, StripePrice$$serializer.INSTANCE, self.stripePrice);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlan() {
        return this.plan;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    /* renamed from: component7, reason: from getter */
    public final StripePrice getStripePrice() {
        return this.stripePrice;
    }

    public final SubscriptionProductV2 copy(String id2, String title, String description, String badgeText, String plan, String billingPeriod, StripePrice stripePrice) {
        id2.getClass();
        title.getClass();
        plan.getClass();
        billingPeriod.getClass();
        return new SubscriptionProductV2(id2, title, description, badgeText, plan, billingPeriod, stripePrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionProductV2)) {
            return false;
        }
        SubscriptionProductV2 subscriptionProductV2 = (SubscriptionProductV2) other;
        if (m.c(this.id, subscriptionProductV2.id) && m.c(this.title, subscriptionProductV2.title) && m.c(this.description, subscriptionProductV2.description) && m.c(this.badgeText, subscriptionProductV2.badgeText) && m.c(this.plan, subscriptionProductV2.plan) && m.c(this.billingPeriod, subscriptionProductV2.billingPeriod) && m.c(this.stripePrice, subscriptionProductV2.stripePrice)) {
            return true;
        }
        return false;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPlan() {
        return this.plan;
    }

    public final StripePrice getStripePrice() {
        return this.stripePrice;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c5 = c.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str2 = this.badgeText;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int c10 = c.c(c.c((i11 + hashCode2) * 31, 31, this.plan), 31, this.billingPeriod);
        StripePrice stripePrice = this.stripePrice;
        if (stripePrice != null) {
            i10 = stripePrice.hashCode();
        }
        return c10 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.badgeText;
        String str5 = this.plan;
        String str6 = this.billingPeriod;
        StripePrice stripePrice = this.stripePrice;
        StringBuilder s10 = f.s("SubscriptionProductV2(id=", str, ", title=", str2, ", description=");
        f.x(s10, str3, ", badgeText=", str4, ", plan=");
        f.x(s10, str5, ", billingPeriod=", str6, ", stripePrice=");
        s10.append(stripePrice);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/SubscriptionProductV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/SubscriptionProductV2;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return SubscriptionProductV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBadgeText$annotations() {
    }

    public static /* synthetic */ void getBillingPeriod$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getPlan$annotations() {
    }

    public static /* synthetic */ void getStripePrice$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public SubscriptionProductV2(String str, String str2, String str3, String str4, String str5, String str6, StripePrice stripePrice) {
        c.u(str, str2, str5, str6);
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.badgeText = str4;
        this.plan = str5;
        this.billingPeriod = str6;
        this.stripePrice = stripePrice;
    }

    public /* synthetic */ SubscriptionProductV2(String str, String str2, String str3, String str4, String str5, String str6, StripePrice stripePrice, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, str4, str5, str6, (i10 & 64) != 0 ? null : stripePrice);
    }
}
