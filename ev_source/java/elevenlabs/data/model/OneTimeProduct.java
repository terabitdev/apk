package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
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
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBg\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\u0010\f\u001a\u00060\u0002j\u0002`\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0014\u0010\u0017\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0014\u0010 \u001a\u00060\u0002j\u0002`\u000bHÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0018\u0010!\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\rHÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J~\u0010#\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00022\f\b\u0002\u0010\f\u001a\u00060\u0002j\u0002`\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R$\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\u0018R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\b=\u00108\u001a\u0004\b<\u0010\u001bR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b?\u00108\u001a\u0004\b>\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010@\u0012\u0004\bB\u00108\u001a\u0004\bA\u0010\u001eR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010\u0018R$\u0010\f\u001a\u00060\u0002j\u0002`\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\bF\u00108\u001a\u0004\bE\u0010\u0018R(\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\bH\u00108\u001a\u0004\bG\u0010\u0018R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00105\u0012\u0004\bJ\u00108\u001a\u0004\bI\u0010\u0018¨\u0006M"}, d2 = {"Lio/elevenlabs/data/model/OneTimeProduct;", "", "", "Lio/elevenlabs/data/model/RevenueCatOneTimeCreditsProductId;", "id", "title", "", "credits", "hours", "hoursBeforeDiscount", "description", "Lio/elevenlabs/data/model/CreditsTier;", "creditsTier", "Lio/elevenlabs/data/model/RevenueCatProductType;", "type", "badgeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "()Ljava/lang/Long;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/OneTimeProduct;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/OneTimeProduct;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "J", "getCredits", "getCredits$annotations", "getHours", "getHours$annotations", "Ljava/lang/Long;", "getHoursBeforeDiscount", "getHoursBeforeDiscount$annotations", "getDescription", "getDescription$annotations", "getCreditsTier", "getCreditsTier$annotations", "getType", "getType$annotations", "getBadgeText", "getBadgeText$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class OneTimeProduct {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String badgeText;
    private final long credits;
    private final String creditsTier;
    private final String description;
    private final long hours;
    private final Long hoursBeforeDiscount;
    private final String id;
    private final String title;
    private final String type;

    static {
        io.elevenlabs.data.database.entities.reads.a aVar = new io.elevenlabs.data.database.entities.reads.a(10);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), null, null, null, null, null, sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(11)), sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(12)), null};
    }

    public /* synthetic */ OneTimeProduct(int i10, String str, String str2, long j4, long j10, Long l4, String str3, String str4, String str5, String str6, c1 c1Var) {
        if (127 == (i10 & 127)) {
            this.id = str;
            this.title = str2;
            this.credits = j4;
            this.hours = j10;
            this.hoursBeforeDiscount = l4;
            this.description = str3;
            this.creditsTier = str4;
            if ((i10 & 128) == 0) {
                this.type = null;
            } else {
                this.type = str5;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.badgeText = null;
                return;
            } else {
                this.badgeText = str6;
                return;
            }
        }
        t0.j(i10, 127, OneTimeProduct$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final KSerializer _childSerializers$_anonymous_() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$1() {
        return new qr.a(e0.f20562a.b(String.class), rd.c1.w(g1.f34588a), new KSerializer[0]);
    }

    public static /* synthetic */ OneTimeProduct copy$default(OneTimeProduct oneTimeProduct, String str, String str2, long j4, long j10, Long l4, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oneTimeProduct.id;
        }
        if ((i10 & 2) != 0) {
            str2 = oneTimeProduct.title;
        }
        if ((i10 & 4) != 0) {
            j4 = oneTimeProduct.credits;
        }
        if ((i10 & 8) != 0) {
            j10 = oneTimeProduct.hours;
        }
        if ((i10 & 16) != 0) {
            l4 = oneTimeProduct.hoursBeforeDiscount;
        }
        if ((i10 & 32) != 0) {
            str3 = oneTimeProduct.description;
        }
        if ((i10 & 64) != 0) {
            str4 = oneTimeProduct.creditsTier;
        }
        if ((i10 & 128) != 0) {
            str5 = oneTimeProduct.type;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str6 = oneTimeProduct.badgeText;
        }
        String str7 = str6;
        String str8 = str4;
        Long l7 = l4;
        long j11 = j10;
        long j12 = j4;
        return oneTimeProduct.copy(str, str2, j12, j11, l7, str3, str8, str5, str7);
    }

    public static final /* synthetic */ void write$Self$data_release(OneTimeProduct self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.id);
        output.V(serialDesc, 1, self.title);
        output.h0(serialDesc, 2, self.credits);
        output.h0(serialDesc, 3, self.hours);
        output.o(serialDesc, 4, l0.f34611a, self.hoursBeforeDiscount);
        output.V(serialDesc, 5, self.description);
        output.g(serialDesc, 6, (KSerializer) hVarArr[6].getValue(), self.creditsTier);
        if (output.C(serialDesc) || self.type != null) {
            output.o(serialDesc, 7, (KSerializer) hVarArr[7].getValue(), self.type);
        }
        if (output.C(serialDesc) || self.badgeText != null) {
            output.o(serialDesc, 8, g1.f34588a, self.badgeText);
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
    public final long getCredits() {
        return this.credits;
    }

    /* renamed from: component4, reason: from getter */
    public final long getHours() {
        return this.hours;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getHoursBeforeDiscount() {
        return this.hoursBeforeDiscount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCreditsTier() {
        return this.creditsTier;
    }

    /* renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    public final OneTimeProduct copy(String id2, String title, long credits, long hours, Long hoursBeforeDiscount, String description, String creditsTier, String type, String badgeText) {
        id2.getClass();
        title.getClass();
        description.getClass();
        creditsTier.getClass();
        return new OneTimeProduct(id2, title, credits, hours, hoursBeforeDiscount, description, creditsTier, type, badgeText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeProduct)) {
            return false;
        }
        OneTimeProduct oneTimeProduct = (OneTimeProduct) other;
        if (m.c(this.id, oneTimeProduct.id) && m.c(this.title, oneTimeProduct.title) && this.credits == oneTimeProduct.credits && this.hours == oneTimeProduct.hours && m.c(this.hoursBeforeDiscount, oneTimeProduct.hoursBeforeDiscount) && m.c(this.description, oneTimeProduct.description) && m.c(this.creditsTier, oneTimeProduct.creditsTier) && m.c(this.type, oneTimeProduct.type) && m.c(this.badgeText, oneTimeProduct.badgeText)) {
            return true;
        }
        return false;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final long getCredits() {
        return this.credits;
    }

    public final String getCreditsTier() {
        return this.creditsTier;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getHours() {
        return this.hours;
    }

    public final Long getHoursBeforeDiscount() {
        return this.hoursBeforeDiscount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.hours, com.google.android.gms.internal.play_billing.b.g(this.credits, c.c(this.id.hashCode() * 31, 31, this.title), 31), 31);
        Long l4 = this.hoursBeforeDiscount;
        int i10 = 0;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        int c5 = c.c(c.c((g10 + hashCode) * 31, 31, this.description), 31, this.creditsTier);
        String str = this.type;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (c5 + hashCode2) * 31;
        String str2 = this.badgeText;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        long j4 = this.credits;
        long j10 = this.hours;
        Long l4 = this.hoursBeforeDiscount;
        String str3 = this.description;
        String str4 = this.creditsTier;
        String str5 = this.type;
        String str6 = this.badgeText;
        StringBuilder s10 = f.s("OneTimeProduct(id=", str, ", title=", str2, ", credits=");
        s10.append(j4);
        com.google.android.gms.internal.play_billing.b.w(s10, ", hours=", j10, ", hoursBeforeDiscount=");
        s10.append(l4);
        s10.append(", description=");
        s10.append(str3);
        s10.append(", creditsTier=");
        f.x(s10, str4, ", type=", str5, ", badgeText=");
        return f.l(str6, Separators.RPAREN, s10);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/OneTimeProduct$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/OneTimeProduct;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return OneTimeProduct$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBadgeText$annotations() {
    }

    public static /* synthetic */ void getCredits$annotations() {
    }

    public static /* synthetic */ void getCreditsTier$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getHours$annotations() {
    }

    public static /* synthetic */ void getHoursBeforeDiscount$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public OneTimeProduct(String str, String str2, long j4, long j10, Long l4, String str3, String str4, String str5, String str6) {
        c.u(str, str2, str3, str4);
        this.id = str;
        this.title = str2;
        this.credits = j4;
        this.hours = j10;
        this.hoursBeforeDiscount = l4;
        this.description = str3;
        this.creditsTier = str4;
        this.type = str5;
        this.badgeText = str6;
    }

    public /* synthetic */ OneTimeProduct(String str, String str2, long j4, long j10, Long l4, String str3, String str4, String str5, String str6, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, j4, j10, l4, str3, str4, (i10 & 128) != 0 ? null : str5, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : str6);
    }
}
