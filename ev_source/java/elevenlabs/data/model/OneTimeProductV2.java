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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B1\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R$\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u001e¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/OneTimeProductV2;", "", "", "Lio/elevenlabs/data/model/RevenueCatOneTimeCreditsProductId;", "id", "title", "description", "Lio/elevenlabs/data/model/StripePrice;", "stripePrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/StripePrice;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/StripePrice;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/OneTimeProductV2;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lio/elevenlabs/data/model/StripePrice;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/StripePrice;)Lio/elevenlabs/data/model/OneTimeProductV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "Lio/elevenlabs/data/model/StripePrice;", "getStripePrice", "getStripePrice$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class OneTimeProductV2 {
    private final String description;
    private final String id;
    private final StripePrice stripePrice;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new io.elevenlabs.data.database.entities.reads.a(13)), null, null, null};

    public /* synthetic */ OneTimeProductV2(int i10, String str, String str2, String str3, StripePrice stripePrice, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.id = str;
            this.title = str2;
            this.description = str3;
            if ((i10 & 8) == 0) {
                this.stripePrice = null;
                return;
            } else {
                this.stripePrice = stripePrice;
                return;
            }
        }
        t0.j(i10, 7, OneTimeProductV2$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final KSerializer _childSerializers$_anonymous_() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static /* synthetic */ OneTimeProductV2 copy$default(OneTimeProductV2 oneTimeProductV2, String str, String str2, String str3, StripePrice stripePrice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oneTimeProductV2.id;
        }
        if ((i10 & 2) != 0) {
            str2 = oneTimeProductV2.title;
        }
        if ((i10 & 4) != 0) {
            str3 = oneTimeProductV2.description;
        }
        if ((i10 & 8) != 0) {
            stripePrice = oneTimeProductV2.stripePrice;
        }
        return oneTimeProductV2.copy(str, str2, str3, stripePrice);
    }

    public static final /* synthetic */ void write$Self$data_release(OneTimeProductV2 self, b output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.id);
        output.V(serialDesc, 1, self.title);
        output.o(serialDesc, 2, g1.f34588a, self.description);
        if (output.C(serialDesc) || self.stripePrice != null) {
            output.o(serialDesc, 3, StripePrice$$serializer.INSTANCE, self.stripePrice);
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
    public final StripePrice getStripePrice() {
        return this.stripePrice;
    }

    public final OneTimeProductV2 copy(String id2, String title, String description, StripePrice stripePrice) {
        id2.getClass();
        title.getClass();
        return new OneTimeProductV2(id2, title, description, stripePrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeProductV2)) {
            return false;
        }
        OneTimeProductV2 oneTimeProductV2 = (OneTimeProductV2) other;
        if (m.c(this.id, oneTimeProductV2.id) && m.c(this.title, oneTimeProductV2.title) && m.c(this.description, oneTimeProductV2.description) && m.c(this.stripePrice, oneTimeProductV2.stripePrice)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final StripePrice getStripePrice() {
        return this.stripePrice;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        StripePrice stripePrice = this.stripePrice;
        if (stripePrice != null) {
            i10 = stripePrice.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        StripePrice stripePrice = this.stripePrice;
        StringBuilder s10 = f.s("OneTimeProductV2(id=", str, ", title=", str2, ", description=");
        s10.append(str3);
        s10.append(", stripePrice=");
        s10.append(stripePrice);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/OneTimeProductV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/OneTimeProductV2;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return OneTimeProductV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getStripePrice$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public OneTimeProductV2(String str, String str2, String str3, StripePrice stripePrice) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.stripePrice = stripePrice;
    }

    public /* synthetic */ OneTimeProductV2(String str, String str2, String str3, StripePrice stripePrice, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : stripePrice);
    }
}
