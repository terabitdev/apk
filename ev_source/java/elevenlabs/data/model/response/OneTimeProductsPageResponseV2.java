package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.model.OneTimeProductV2;
import io.elevenlabs.data.model.OneTimeProductV2$$serializer;
import io.elevenlabs.data.model.SubscriptionProductV2;
import io.elevenlabs.data.model.SubscriptionProductV2$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJb\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010\u0016R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00109\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u001aR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010\u001aR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010\u001dR \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010\u001d¨\u0006E"}, d2 = {"Lio/elevenlabs/data/model/response/OneTimeProductsPageResponseV2;", "", "", "currentCredits", "currentHours", "currentMinutes", "", "Lio/elevenlabs/data/model/OneTimeProductV2;", "oneTimeProducts", "Lio/elevenlabs/data/model/SubscriptionProductV2;", "subscriptionProducts", "", "title", "subtitle", "<init>", "(JJJLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IJJJLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "component1", "()J", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Ljava/lang/String;", "component7", "copy", "(JJJLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/OneTimeProductsPageResponseV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/OneTimeProductsPageResponseV2;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "J", "getCurrentCredits", "getCurrentCredits$annotations", "()V", "getCurrentHours", "getCurrentHours$annotations", "getCurrentMinutes", "getCurrentMinutes$annotations", "Ljava/util/List;", "getOneTimeProducts", "getOneTimeProducts$annotations", "getSubscriptionProducts", "getSubscriptionProducts$annotations", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class OneTimeProductsPageResponseV2 {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long currentCredits;
    private final long currentHours;
    private final long currentMinutes;
    private final List<OneTimeProductV2> oneTimeProducts;
    private final List<SubscriptionProductV2> subscriptionProducts;
    private final String subtitle;
    private final String title;

    static {
        c cVar = new c(1);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, null, null, sn.a.d(iVar, cVar), sn.a.d(iVar, new c(2)), null, null};
    }

    public /* synthetic */ OneTimeProductsPageResponseV2(int i10, long j4, long j10, long j11, List list, List list2, String str, String str2, c1 c1Var) {
        if (127 == (i10 & 127)) {
            this.currentCredits = j4;
            this.currentHours = j10;
            this.currentMinutes = j11;
            this.oneTimeProducts = list;
            this.subscriptionProducts = list2;
            this.title = str;
            this.subtitle = str2;
            return;
        }
        t0.j(i10, 127, OneTimeProductsPageResponseV2$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(OneTimeProductV2$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ur.d(SubscriptionProductV2$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ OneTimeProductsPageResponseV2 copy$default(OneTimeProductsPageResponseV2 oneTimeProductsPageResponseV2, long j4, long j10, long j11, List list, List list2, String str, String str2, int i10, Object obj) {
        long j12;
        List list3;
        List list4;
        String str3;
        String str4;
        if ((i10 & 1) != 0) {
            j4 = oneTimeProductsPageResponseV2.currentCredits;
        }
        long j13 = j4;
        if ((i10 & 2) != 0) {
            j10 = oneTimeProductsPageResponseV2.currentHours;
        }
        long j14 = j10;
        if ((i10 & 4) != 0) {
            j12 = oneTimeProductsPageResponseV2.currentMinutes;
        } else {
            j12 = j11;
        }
        if ((i10 & 8) != 0) {
            list3 = oneTimeProductsPageResponseV2.oneTimeProducts;
        } else {
            list3 = list;
        }
        if ((i10 & 16) != 0) {
            list4 = oneTimeProductsPageResponseV2.subscriptionProducts;
        } else {
            list4 = list2;
        }
        if ((i10 & 32) != 0) {
            str3 = oneTimeProductsPageResponseV2.title;
        } else {
            str3 = str;
        }
        if ((i10 & 64) != 0) {
            str4 = oneTimeProductsPageResponseV2.subtitle;
        } else {
            str4 = str2;
        }
        return oneTimeProductsPageResponseV2.copy(j13, j14, j12, list3, list4, str3, str4);
    }

    public static final /* synthetic */ void write$Self$data_release(OneTimeProductsPageResponseV2 self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.h0(serialDesc, 0, self.currentCredits);
        output.h0(serialDesc, 1, self.currentHours);
        output.h0(serialDesc, 2, self.currentMinutes);
        output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.oneTimeProducts);
        output.g(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.subscriptionProducts);
        output.V(serialDesc, 5, self.title);
        output.V(serialDesc, 6, self.subtitle);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCurrentCredits() {
        return this.currentCredits;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCurrentHours() {
        return this.currentHours;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCurrentMinutes() {
        return this.currentMinutes;
    }

    public final List<OneTimeProductV2> component4() {
        return this.oneTimeProducts;
    }

    public final List<SubscriptionProductV2> component5() {
        return this.subscriptionProducts;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final OneTimeProductsPageResponseV2 copy(long currentCredits, long currentHours, long currentMinutes, List<OneTimeProductV2> oneTimeProducts, List<SubscriptionProductV2> subscriptionProducts, String title, String subtitle) {
        oneTimeProducts.getClass();
        subscriptionProducts.getClass();
        title.getClass();
        subtitle.getClass();
        return new OneTimeProductsPageResponseV2(currentCredits, currentHours, currentMinutes, oneTimeProducts, subscriptionProducts, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeProductsPageResponseV2)) {
            return false;
        }
        OneTimeProductsPageResponseV2 oneTimeProductsPageResponseV2 = (OneTimeProductsPageResponseV2) other;
        if (this.currentCredits == oneTimeProductsPageResponseV2.currentCredits && this.currentHours == oneTimeProductsPageResponseV2.currentHours && this.currentMinutes == oneTimeProductsPageResponseV2.currentMinutes && m.c(this.oneTimeProducts, oneTimeProductsPageResponseV2.oneTimeProducts) && m.c(this.subscriptionProducts, oneTimeProductsPageResponseV2.subscriptionProducts) && m.c(this.title, oneTimeProductsPageResponseV2.title) && m.c(this.subtitle, oneTimeProductsPageResponseV2.subtitle)) {
            return true;
        }
        return false;
    }

    public final long getCurrentCredits() {
        return this.currentCredits;
    }

    public final long getCurrentHours() {
        return this.currentHours;
    }

    public final long getCurrentMinutes() {
        return this.currentMinutes;
    }

    public final List<OneTimeProductV2> getOneTimeProducts() {
        return this.oneTimeProducts;
    }

    public final List<SubscriptionProductV2> getSubscriptionProducts() {
        return this.subscriptionProducts;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + j0.c.c(n.d(n.d(com.google.android.gms.internal.play_billing.b.g(this.currentMinutes, com.google.android.gms.internal.play_billing.b.g(this.currentHours, Long.hashCode(this.currentCredits) * 31, 31), 31), 31, this.oneTimeProducts), 31, this.subscriptionProducts), 31, this.title);
    }

    public String toString() {
        long j4 = this.currentCredits;
        long j10 = this.currentHours;
        long j11 = this.currentMinutes;
        List<OneTimeProductV2> list = this.oneTimeProducts;
        List<SubscriptionProductV2> list2 = this.subscriptionProducts;
        String str = this.title;
        String str2 = this.subtitle;
        StringBuilder q = com.google.android.gms.internal.play_billing.b.q("OneTimeProductsPageResponseV2(currentCredits=", j4, ", currentHours=");
        q.append(j10);
        com.google.android.gms.internal.play_billing.b.w(q, ", currentMinutes=", j11, ", oneTimeProducts=");
        q.append(list);
        q.append(", subscriptionProducts=");
        q.append(list2);
        q.append(", title=");
        return f.n(q, str, ", subtitle=", str2, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/OneTimeProductsPageResponseV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/OneTimeProductsPageResponseV2;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return OneTimeProductsPageResponseV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCurrentCredits$annotations() {
    }

    public static /* synthetic */ void getCurrentHours$annotations() {
    }

    public static /* synthetic */ void getCurrentMinutes$annotations() {
    }

    public static /* synthetic */ void getOneTimeProducts$annotations() {
    }

    public static /* synthetic */ void getSubscriptionProducts$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public OneTimeProductsPageResponseV2(long j4, long j10, long j11, List<OneTimeProductV2> list, List<SubscriptionProductV2> list2, String str, String str2) {
        list.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        this.currentCredits = j4;
        this.currentHours = j10;
        this.currentMinutes = j11;
        this.oneTimeProducts = list;
        this.subscriptionProducts = list2;
        this.title = str;
        this.subtitle = str2;
    }
}
