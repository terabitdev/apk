package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.g1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u0019¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/PaymentConfig;", "", "", "iosProductId", "androidProductId", "webUrl", "priceFormatted", "zeroPriceFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/PaymentConfig;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/PaymentConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIosProductId", "getIosProductId$annotations", "()V", "getAndroidProductId", "getAndroidProductId$annotations", "getWebUrl", "getWebUrl$annotations", "getPriceFormatted", "getPriceFormatted$annotations", "getZeroPriceFormatted", "getZeroPriceFormatted$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class PaymentConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String androidProductId;
    private final String iosProductId;
    private final String priceFormatted;
    private final String webUrl;
    private final String zeroPriceFormatted;

    public /* synthetic */ PaymentConfig(int i10, String str, String str2, String str3, String str4, String str5, c1 c1Var) {
        if ((i10 & 1) == 0) {
            this.iosProductId = null;
        } else {
            this.iosProductId = str;
        }
        if ((i10 & 2) == 0) {
            this.androidProductId = null;
        } else {
            this.androidProductId = str2;
        }
        if ((i10 & 4) == 0) {
            this.webUrl = null;
        } else {
            this.webUrl = str3;
        }
        if ((i10 & 8) == 0) {
            this.priceFormatted = null;
        } else {
            this.priceFormatted = str4;
        }
        if ((i10 & 16) == 0) {
            this.zeroPriceFormatted = null;
        } else {
            this.zeroPriceFormatted = str5;
        }
    }

    public static /* synthetic */ PaymentConfig copy$default(PaymentConfig paymentConfig, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentConfig.iosProductId;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentConfig.androidProductId;
        }
        if ((i10 & 4) != 0) {
            str3 = paymentConfig.webUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = paymentConfig.priceFormatted;
        }
        if ((i10 & 16) != 0) {
            str5 = paymentConfig.zeroPriceFormatted;
        }
        String str6 = str5;
        String str7 = str3;
        return paymentConfig.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$data_release(PaymentConfig self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.iosProductId != null) {
            output.o(serialDesc, 0, g1.f34588a, self.iosProductId);
        }
        if (output.C(serialDesc) || self.androidProductId != null) {
            output.o(serialDesc, 1, g1.f34588a, self.androidProductId);
        }
        if (output.C(serialDesc) || self.webUrl != null) {
            output.o(serialDesc, 2, g1.f34588a, self.webUrl);
        }
        if (output.C(serialDesc) || self.priceFormatted != null) {
            output.o(serialDesc, 3, g1.f34588a, self.priceFormatted);
        }
        if (output.C(serialDesc) || self.zeroPriceFormatted != null) {
            output.o(serialDesc, 4, g1.f34588a, self.zeroPriceFormatted);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getIosProductId() {
        return this.iosProductId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPriceFormatted() {
        return this.priceFormatted;
    }

    /* renamed from: component5, reason: from getter */
    public final String getZeroPriceFormatted() {
        return this.zeroPriceFormatted;
    }

    public final PaymentConfig copy(String iosProductId, String androidProductId, String webUrl, String priceFormatted, String zeroPriceFormatted) {
        return new PaymentConfig(iosProductId, androidProductId, webUrl, priceFormatted, zeroPriceFormatted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentConfig)) {
            return false;
        }
        PaymentConfig paymentConfig = (PaymentConfig) other;
        if (m.c(this.iosProductId, paymentConfig.iosProductId) && m.c(this.androidProductId, paymentConfig.androidProductId) && m.c(this.webUrl, paymentConfig.webUrl) && m.c(this.priceFormatted, paymentConfig.priceFormatted) && m.c(this.zeroPriceFormatted, paymentConfig.zeroPriceFormatted)) {
            return true;
        }
        return false;
    }

    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    public final String getIosProductId() {
        return this.iosProductId;
    }

    public final String getPriceFormatted() {
        return this.priceFormatted;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final String getZeroPriceFormatted() {
        return this.zeroPriceFormatted;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.iosProductId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.androidProductId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.webUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.priceFormatted;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.zeroPriceFormatted;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return i14 + i10;
    }

    public String toString() {
        String str = this.iosProductId;
        String str2 = this.androidProductId;
        String str3 = this.webUrl;
        String str4 = this.priceFormatted;
        String str5 = this.zeroPriceFormatted;
        StringBuilder s10 = f.s("PaymentConfig(iosProductId=", str, ", androidProductId=", str2, ", webUrl=");
        f.x(s10, str3, ", priceFormatted=", str4, ", zeroPriceFormatted=");
        return f.l(str5, Separators.RPAREN, s10);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/PaymentConfig$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/PaymentConfig;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return PaymentConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAndroidProductId$annotations() {
    }

    public static /* synthetic */ void getIosProductId$annotations() {
    }

    public static /* synthetic */ void getPriceFormatted$annotations() {
    }

    public static /* synthetic */ void getWebUrl$annotations() {
    }

    public static /* synthetic */ void getZeroPriceFormatted$annotations() {
    }

    public PaymentConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (kotlin.jvm.internal.f) null);
    }

    public PaymentConfig(String str, String str2, String str3, String str4, String str5) {
        this.iosProductId = str;
        this.androidProductId = str2;
        this.webUrl = str3;
        this.priceFormatted = str4;
        this.zeroPriceFormatted = str5;
    }

    public /* synthetic */ PaymentConfig(String str, String str2, String str3, String str4, String str5, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
