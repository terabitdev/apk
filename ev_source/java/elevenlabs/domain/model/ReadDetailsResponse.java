package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003Ji\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0014\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004J\n\u0010.\u001a\u00020\nHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsResponse;", "", "sections", "", "Lio/elevenlabs/domain/model/ReadDetailsSection;", "pricingType", "Lio/elevenlabs/domain/model/ExplorePricingType;", "paymentConfig", "Lio/elevenlabs/domain/model/PaymentConfig;", "previewUrl", "", "shareUrl", "sampleReadId", "buttons", "Lio/elevenlabs/domain/model/ReadDetailsButtons;", "inReadLater", "", "<init>", "(Ljava/util/List;Lio/elevenlabs/domain/model/ExplorePricingType;Lio/elevenlabs/domain/model/PaymentConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/ReadDetailsButtons;Z)V", "getSections", "()Ljava/util/List;", "getPricingType", "()Lio/elevenlabs/domain/model/ExplorePricingType;", "getPaymentConfig", "()Lio/elevenlabs/domain/model/PaymentConfig;", "getPreviewUrl", "()Ljava/lang/String;", "getShareUrl", "getSampleReadId", "getButtons", "()Lio/elevenlabs/domain/model/ReadDetailsButtons;", "getInReadLater", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadDetailsResponse {
    private final ReadDetailsButtons buttons;
    private final boolean inReadLater;
    private final PaymentConfig paymentConfig;
    private final String previewUrl;
    private final ExplorePricingType pricingType;
    private final String sampleReadId;
    private final List<ReadDetailsSection> sections;
    private final String shareUrl;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReadDetailsResponse(List list, ExplorePricingType explorePricingType, PaymentConfig paymentConfig, String str, String str2, String str3, ReadDetailsButtons readDetailsButtons, boolean z6, int i10, f fVar) {
        this(list, r1, r2, r4, r5, r6, r3, r18);
        ExplorePricingType explorePricingType2;
        PaymentConfig paymentConfig2;
        String str4;
        String str5;
        String str6;
        boolean z10;
        if ((i10 & 2) != 0) {
            explorePricingType2 = ExplorePricingType.Free;
        } else {
            explorePricingType2 = explorePricingType;
        }
        if ((i10 & 4) != 0) {
            paymentConfig2 = null;
        } else {
            paymentConfig2 = paymentConfig;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i10 & 32) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        ReadDetailsButtons readDetailsButtons2 = (i10 & 64) == 0 ? readDetailsButtons : null;
        if ((i10 & 128) != 0) {
            z10 = false;
        } else {
            z10 = z6;
        }
    }

    public static /* synthetic */ ReadDetailsResponse copy$default(ReadDetailsResponse readDetailsResponse, List list, ExplorePricingType explorePricingType, PaymentConfig paymentConfig, String str, String str2, String str3, ReadDetailsButtons readDetailsButtons, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = readDetailsResponse.sections;
        }
        if ((i10 & 2) != 0) {
            explorePricingType = readDetailsResponse.pricingType;
        }
        if ((i10 & 4) != 0) {
            paymentConfig = readDetailsResponse.paymentConfig;
        }
        if ((i10 & 8) != 0) {
            str = readDetailsResponse.previewUrl;
        }
        if ((i10 & 16) != 0) {
            str2 = readDetailsResponse.shareUrl;
        }
        if ((i10 & 32) != 0) {
            str3 = readDetailsResponse.sampleReadId;
        }
        if ((i10 & 64) != 0) {
            readDetailsButtons = readDetailsResponse.buttons;
        }
        if ((i10 & 128) != 0) {
            z6 = readDetailsResponse.inReadLater;
        }
        ReadDetailsButtons readDetailsButtons2 = readDetailsButtons;
        boolean z10 = z6;
        String str4 = str2;
        String str5 = str3;
        return readDetailsResponse.copy(list, explorePricingType, paymentConfig, str, str4, str5, readDetailsButtons2, z10);
    }

    public final List<ReadDetailsSection> component1() {
        return this.sections;
    }

    /* renamed from: component2, reason: from getter */
    public final ExplorePricingType getPricingType() {
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

    public final ReadDetailsResponse copy(List<? extends ReadDetailsSection> sections, ExplorePricingType pricingType, PaymentConfig paymentConfig, String previewUrl, String shareUrl, String sampleReadId, ReadDetailsButtons buttons, boolean inReadLater) {
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
        if (m.c(this.sections, readDetailsResponse.sections) && this.pricingType == readDetailsResponse.pricingType && m.c(this.paymentConfig, readDetailsResponse.paymentConfig) && m.c(this.previewUrl, readDetailsResponse.previewUrl) && m.c(this.shareUrl, readDetailsResponse.shareUrl) && m.c(this.sampleReadId, readDetailsResponse.sampleReadId) && m.c(this.buttons, readDetailsResponse.buttons) && this.inReadLater == readDetailsResponse.inReadLater) {
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

    public final ExplorePricingType getPricingType() {
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
        int hashCode5 = (this.pricingType.hashCode() + (this.sections.hashCode() * 31)) * 31;
        PaymentConfig paymentConfig = this.paymentConfig;
        int i10 = 0;
        if (paymentConfig == null) {
            hashCode = 0;
        } else {
            hashCode = paymentConfig.hashCode();
        }
        int i11 = (hashCode5 + hashCode) * 31;
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
        ExplorePricingType explorePricingType = this.pricingType;
        PaymentConfig paymentConfig = this.paymentConfig;
        String str = this.previewUrl;
        String str2 = this.shareUrl;
        String str3 = this.sampleReadId;
        ReadDetailsButtons readDetailsButtons = this.buttons;
        boolean z6 = this.inReadLater;
        StringBuilder sb = new StringBuilder("ReadDetailsResponse(sections=");
        sb.append(list);
        sb.append(", pricingType=");
        sb.append(explorePricingType);
        sb.append(", paymentConfig=");
        sb.append(paymentConfig);
        sb.append(", previewUrl=");
        sb.append(str);
        sb.append(", shareUrl=");
        defpackage.f.x(sb, str2, ", sampleReadId=", str3, ", buttons=");
        sb.append(readDetailsButtons);
        sb.append(", inReadLater=");
        sb.append(z6);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadDetailsResponse(List<? extends ReadDetailsSection> list, ExplorePricingType explorePricingType, PaymentConfig paymentConfig, String str, String str2, String str3, ReadDetailsButtons readDetailsButtons, boolean z6) {
        list.getClass();
        explorePricingType.getClass();
        this.sections = list;
        this.pricingType = explorePricingType;
        this.paymentConfig = paymentConfig;
        this.previewUrl = str;
        this.shareUrl = str2;
        this.sampleReadId = str3;
        this.buttons = readDetailsButtons;
        this.inReadLater = z6;
    }
}
