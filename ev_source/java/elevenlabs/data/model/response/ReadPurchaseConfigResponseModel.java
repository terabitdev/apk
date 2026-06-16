package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.g1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001d¨\u00063"}, d2 = {"Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;", "", "", "iosProductId", "androidProductId", "stripeProductId", "", "canRedeemCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIosProductId", "getIosProductId$annotations", "()V", "getAndroidProductId", "getAndroidProductId$annotations", "getStripeProductId", "getStripeProductId$annotations", "Ljava/lang/Boolean;", "getCanRedeemCode", "getCanRedeemCode$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadPurchaseConfigResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String androidProductId;
    private final Boolean canRedeemCode;
    private final String iosProductId;
    private final String stripeProductId;

    public /* synthetic */ ReadPurchaseConfigResponseModel(int i10, String str, String str2, String str3, Boolean bool, c1 c1Var) {
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
            this.stripeProductId = null;
        } else {
            this.stripeProductId = str3;
        }
        if ((i10 & 8) == 0) {
            this.canRedeemCode = null;
        } else {
            this.canRedeemCode = bool;
        }
    }

    public static /* synthetic */ ReadPurchaseConfigResponseModel copy$default(ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel, String str, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readPurchaseConfigResponseModel.iosProductId;
        }
        if ((i10 & 2) != 0) {
            str2 = readPurchaseConfigResponseModel.androidProductId;
        }
        if ((i10 & 4) != 0) {
            str3 = readPurchaseConfigResponseModel.stripeProductId;
        }
        if ((i10 & 8) != 0) {
            bool = readPurchaseConfigResponseModel.canRedeemCode;
        }
        return readPurchaseConfigResponseModel.copy(str, str2, str3, bool);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadPurchaseConfigResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.iosProductId != null) {
            output.o(serialDesc, 0, g1.f34588a, self.iosProductId);
        }
        if (output.C(serialDesc) || self.androidProductId != null) {
            output.o(serialDesc, 1, g1.f34588a, self.androidProductId);
        }
        if (output.C(serialDesc) || self.stripeProductId != null) {
            output.o(serialDesc, 2, g1.f34588a, self.stripeProductId);
        }
        if (output.C(serialDesc) || self.canRedeemCode != null) {
            output.o(serialDesc, 3, ur.g.f34583a, self.canRedeemCode);
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
    public final String getStripeProductId() {
        return this.stripeProductId;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getCanRedeemCode() {
        return this.canRedeemCode;
    }

    public final ReadPurchaseConfigResponseModel copy(String iosProductId, String androidProductId, String stripeProductId, Boolean canRedeemCode) {
        return new ReadPurchaseConfigResponseModel(iosProductId, androidProductId, stripeProductId, canRedeemCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadPurchaseConfigResponseModel)) {
            return false;
        }
        ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel = (ReadPurchaseConfigResponseModel) other;
        if (m.c(this.iosProductId, readPurchaseConfigResponseModel.iosProductId) && m.c(this.androidProductId, readPurchaseConfigResponseModel.androidProductId) && m.c(this.stripeProductId, readPurchaseConfigResponseModel.stripeProductId) && m.c(this.canRedeemCode, readPurchaseConfigResponseModel.canRedeemCode)) {
            return true;
        }
        return false;
    }

    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    public final Boolean getCanRedeemCode() {
        return this.canRedeemCode;
    }

    public final String getIosProductId() {
        return this.iosProductId;
    }

    public final String getStripeProductId() {
        return this.stripeProductId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
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
        String str3 = this.stripeProductId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Boolean bool = this.canRedeemCode;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        String str = this.iosProductId;
        String str2 = this.androidProductId;
        String str3 = this.stripeProductId;
        Boolean bool = this.canRedeemCode;
        StringBuilder s10 = f.s("ReadPurchaseConfigResponseModel(iosProductId=", str, ", androidProductId=", str2, ", stripeProductId=");
        s10.append(str3);
        s10.append(", canRedeemCode=");
        s10.append(bool);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReadPurchaseConfigResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadPurchaseConfigResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAndroidProductId$annotations() {
    }

    public static /* synthetic */ void getCanRedeemCode$annotations() {
    }

    public static /* synthetic */ void getIosProductId$annotations() {
    }

    public static /* synthetic */ void getStripeProductId$annotations() {
    }

    public ReadPurchaseConfigResponseModel() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (kotlin.jvm.internal.f) null);
    }

    public ReadPurchaseConfigResponseModel(String str, String str2, String str3, Boolean bool) {
        this.iosProductId = str;
        this.androidProductId = str2;
        this.stripeProductId = str3;
        this.canRedeemCode = bool;
    }

    public /* synthetic */ ReadPurchaseConfigResponseModel(String str, String str2, String str3, Boolean bool, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : bool);
    }
}
