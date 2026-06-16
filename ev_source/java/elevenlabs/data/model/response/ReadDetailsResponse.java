package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.model.PaymentConfig;
import io.elevenlabs.data.model.PaymentConfig$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBe\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bo\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#Jp\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00109\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b@\u00108\u001a\u0004\b?\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\bB\u00108\u001a\u0004\bA\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010!R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bI\u00108\u001a\u0004\bH\u0010#¨\u0006L"}, d2 = {"Lio/elevenlabs/data/model/response/ReadDetailsResponse;", "", "", "Lio/elevenlabs/data/model/response/ReadDetailsSection;", "sections", "", "pricingType", "Lio/elevenlabs/data/model/PaymentConfig;", "paymentConfig", "previewUrl", "shareUrl", "sampleReadId", "Lio/elevenlabs/data/model/response/ReadDetailsButtons;", "buttons", "", "inReadLater", "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/elevenlabs/data/model/PaymentConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReadDetailsButtons;Z)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lio/elevenlabs/data/model/PaymentConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReadDetailsButtons;ZLur/c1;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lio/elevenlabs/data/model/PaymentConfig;", "component4", "component5", "component6", "component7", "()Lio/elevenlabs/data/model/response/ReadDetailsButtons;", "component8", "()Z", "copy", "(Ljava/util/List;Ljava/lang/String;Lio/elevenlabs/data/model/PaymentConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReadDetailsButtons;Z)Lio/elevenlabs/data/model/response/ReadDetailsResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReadDetailsResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getSections", "getSections$annotations", "()V", "Ljava/lang/String;", "getPricingType", "getPricingType$annotations", "Lio/elevenlabs/data/model/PaymentConfig;", "getPaymentConfig", "getPaymentConfig$annotations", "getPreviewUrl", "getPreviewUrl$annotations", "getShareUrl", "getShareUrl$annotations", "getSampleReadId", "getSampleReadId$annotations", "Lio/elevenlabs/data/model/response/ReadDetailsButtons;", "getButtons", "Z", "getInReadLater", "getInReadLater$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadDetailsResponse {
    private final ReadDetailsButtons buttons;
    private final boolean inReadLater;
    private final PaymentConfig paymentConfig;
    private final String previewUrl;
    private final String pricingType;
    private final String sampleReadId;
    private final List<ReadDetailsSection> sections;
    private final String shareUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new c(9)), null, null, null, null, null, null, null};

    public /* synthetic */ ReadDetailsResponse(int i10, List list, String str, PaymentConfig paymentConfig, String str2, String str3, String str4, ReadDetailsButtons readDetailsButtons, boolean z6, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.sections = list;
            if ((i10 & 2) == 0) {
                this.pricingType = "free";
            } else {
                this.pricingType = str;
            }
            if ((i10 & 4) == 0) {
                this.paymentConfig = null;
            } else {
                this.paymentConfig = paymentConfig;
            }
            if ((i10 & 8) == 0) {
                this.previewUrl = null;
            } else {
                this.previewUrl = str2;
            }
            if ((i10 & 16) == 0) {
                this.shareUrl = null;
            } else {
                this.shareUrl = str3;
            }
            if ((i10 & 32) == 0) {
                this.sampleReadId = null;
            } else {
                this.sampleReadId = str4;
            }
            if ((i10 & 64) == 0) {
                this.buttons = null;
            } else {
                this.buttons = readDetailsButtons;
            }
            if ((i10 & 128) == 0) {
                this.inReadLater = false;
                return;
            } else {
                this.inReadLater = z6;
                return;
            }
        }
        t0.j(i10, 1, ReadDetailsResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ReadDetailsSectionListSerializer();
    }

    public static /* synthetic */ ReadDetailsResponse copy$default(ReadDetailsResponse readDetailsResponse, List list, String str, PaymentConfig paymentConfig, String str2, String str3, String str4, ReadDetailsButtons readDetailsButtons, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = readDetailsResponse.sections;
        }
        if ((i10 & 2) != 0) {
            str = readDetailsResponse.pricingType;
        }
        if ((i10 & 4) != 0) {
            paymentConfig = readDetailsResponse.paymentConfig;
        }
        if ((i10 & 8) != 0) {
            str2 = readDetailsResponse.previewUrl;
        }
        if ((i10 & 16) != 0) {
            str3 = readDetailsResponse.shareUrl;
        }
        if ((i10 & 32) != 0) {
            str4 = readDetailsResponse.sampleReadId;
        }
        if ((i10 & 64) != 0) {
            readDetailsButtons = readDetailsResponse.buttons;
        }
        if ((i10 & 128) != 0) {
            z6 = readDetailsResponse.inReadLater;
        }
        ReadDetailsButtons readDetailsButtons2 = readDetailsButtons;
        boolean z10 = z6;
        String str5 = str3;
        String str6 = str4;
        return readDetailsResponse.copy(list, str, paymentConfig, str2, str5, str6, readDetailsButtons2, z10);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadDetailsResponse self, tr.b output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.sections);
        if (output.C(serialDesc) || !m.c(self.pricingType, "free")) {
            output.V(serialDesc, 1, self.pricingType);
        }
        if (output.C(serialDesc) || self.paymentConfig != null) {
            output.o(serialDesc, 2, PaymentConfig$$serializer.INSTANCE, self.paymentConfig);
        }
        if (output.C(serialDesc) || self.previewUrl != null) {
            output.o(serialDesc, 3, g1.f34588a, self.previewUrl);
        }
        if (output.C(serialDesc) || self.shareUrl != null) {
            output.o(serialDesc, 4, g1.f34588a, self.shareUrl);
        }
        if (output.C(serialDesc) || self.sampleReadId != null) {
            output.o(serialDesc, 5, g1.f34588a, self.sampleReadId);
        }
        if (output.C(serialDesc) || self.buttons != null) {
            output.o(serialDesc, 6, ReadDetailsButtons$$serializer.INSTANCE, self.buttons);
        }
        if (output.C(serialDesc) || self.inReadLater) {
            output.T(serialDesc, 7, self.inReadLater);
        }
    }

    public final List<ReadDetailsSection> component1() {
        return this.sections;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPricingType() {
        return this.pricingType;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentConfig getPaymentConfig() {
        return this.paymentConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSampleReadId() {
        return this.sampleReadId;
    }

    /* renamed from: component7, reason: from getter */
    public final ReadDetailsButtons getButtons() {
        return this.buttons;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getInReadLater() {
        return this.inReadLater;
    }

    public final ReadDetailsResponse copy(List<? extends ReadDetailsSection> sections, String pricingType, PaymentConfig paymentConfig, String previewUrl, String shareUrl, String sampleReadId, ReadDetailsButtons buttons, boolean inReadLater) {
        sections.getClass();
        pricingType.getClass();
        return new ReadDetailsResponse(sections, pricingType, paymentConfig, previewUrl, shareUrl, sampleReadId, buttons, inReadLater);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadDetailsResponse)) {
            return false;
        }
        ReadDetailsResponse readDetailsResponse = (ReadDetailsResponse) other;
        if (m.c(this.sections, readDetailsResponse.sections) && m.c(this.pricingType, readDetailsResponse.pricingType) && m.c(this.paymentConfig, readDetailsResponse.paymentConfig) && m.c(this.previewUrl, readDetailsResponse.previewUrl) && m.c(this.shareUrl, readDetailsResponse.shareUrl) && m.c(this.sampleReadId, readDetailsResponse.sampleReadId) && m.c(this.buttons, readDetailsResponse.buttons) && this.inReadLater == readDetailsResponse.inReadLater) {
            return true;
        }
        return false;
    }

    public final ReadDetailsButtons getButtons() {
        return this.buttons;
    }

    public final boolean getInReadLater() {
        return this.inReadLater;
    }

    public final PaymentConfig getPaymentConfig() {
        return this.paymentConfig;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final String getPricingType() {
        return this.pricingType;
    }

    public final String getSampleReadId() {
        return this.sampleReadId;
    }

    public final List<ReadDetailsSection> getSections() {
        return this.sections;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int c5 = j0.c.c(this.sections.hashCode() * 31, 31, this.pricingType);
        PaymentConfig paymentConfig = this.paymentConfig;
        int i10 = 0;
        if (paymentConfig == null) {
            hashCode = 0;
        } else {
            hashCode = paymentConfig.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        String str = this.previewUrl;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str2 = this.shareUrl;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str3 = this.sampleReadId;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        ReadDetailsButtons readDetailsButtons = this.buttons;
        if (readDetailsButtons != null) {
            i10 = readDetailsButtons.hashCode();
        }
        return Boolean.hashCode(this.inReadLater) + ((i14 + i10) * 31);
    }

    public String toString() {
        List<ReadDetailsSection> list = this.sections;
        String str = this.pricingType;
        PaymentConfig paymentConfig = this.paymentConfig;
        String str2 = this.previewUrl;
        String str3 = this.shareUrl;
        String str4 = this.sampleReadId;
        ReadDetailsButtons readDetailsButtons = this.buttons;
        boolean z6 = this.inReadLater;
        StringBuilder sb = new StringBuilder("ReadDetailsResponse(sections=");
        sb.append(list);
        sb.append(", pricingType=");
        sb.append(str);
        sb.append(", paymentConfig=");
        sb.append(paymentConfig);
        sb.append(", previewUrl=");
        sb.append(str2);
        sb.append(", shareUrl=");
        f.x(sb, str3, ", sampleReadId=", str4, ", buttons=");
        sb.append(readDetailsButtons);
        sb.append(", inReadLater=");
        sb.append(z6);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReadDetailsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReadDetailsResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadDetailsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getInReadLater$annotations() {
    }

    public static /* synthetic */ void getPaymentConfig$annotations() {
    }

    public static /* synthetic */ void getPreviewUrl$annotations() {
    }

    public static /* synthetic */ void getPricingType$annotations() {
    }

    public static /* synthetic */ void getSampleReadId$annotations() {
    }

    @g(with = ReadDetailsSectionListSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    public static /* synthetic */ void getShareUrl$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadDetailsResponse(List<? extends ReadDetailsSection> list, String str, PaymentConfig paymentConfig, String str2, String str3, String str4, ReadDetailsButtons readDetailsButtons, boolean z6) {
        list.getClass();
        str.getClass();
        this.sections = list;
        this.pricingType = str;
        this.paymentConfig = paymentConfig;
        this.previewUrl = str2;
        this.shareUrl = str3;
        this.sampleReadId = str4;
        this.buttons = readDetailsButtons;
        this.inReadLater = z6;
    }

    public /* synthetic */ ReadDetailsResponse(List list, String str, PaymentConfig paymentConfig, String str2, String str3, String str4, ReadDetailsButtons readDetailsButtons, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
        this(list, (i10 & 2) != 0 ? "free" : str, (i10 & 4) != 0 ? null : paymentConfig, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) == 0 ? readDetailsButtons : null, (i10 & 128) != 0 ? false : z6);
    }
}
