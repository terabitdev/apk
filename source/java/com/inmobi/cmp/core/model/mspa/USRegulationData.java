package com.inmobi.cmp.core.model.mspa;

import a.a;
import android.support.v4.media.session.m;
import androidx.annotation.Keep;
import d7.a0;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import x8.e;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class USRegulationData {
    private int additionalProcessingDataConsent;
    private String gppString;
    private List<Integer> knownChildSensitiveDataConsents;
    private int mspaCoveredTransaction;
    private int mspaOptOutOptionMode;
    private int mspaServiceProviderMode;
    private int personalDataConsents;
    private int processingNotice;
    private int saleOptOut;
    private int saleOptOutNotice;
    private int sensitiveDataLimitUseNotice;
    private List<Integer> sensitiveDataProcessing;
    private int sensitiveDataProcessingOptOutNotice;
    private int sharingNotice;
    private int sharingOptOut;
    private int sharingOptOutNotice;
    private int targetedAdvertisingOptOut;
    private int targetedAdvertisingOptOutNotice;
    private int version;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ USRegulationData(int i, String str, int i3, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List list, List list2, int i18, int i19, int i20, int i21, int i22, int i23, h hVar) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14 != 0 ? r15 : list, (i23 & 8192) == 0 ? list2 : r15, (i23 & 16384) != 0 ? 0 : i18, (i23 & 32768) != 0 ? 0 : i19, (i23 & 65536) != 0 ? 0 : i20, (i23 & 131072) != 0 ? 0 : i21, (i23 & 262144) != 0 ? 0 : i22);
        int i24 = (i23 & 1) != 0 ? 0 : i;
        String str2 = (i23 & 2) != 0 ? "" : str;
        int i25 = (i23 & 4) != 0 ? 0 : i3;
        int i26 = (i23 & 8) != 0 ? 0 : i8;
        int i27 = (i23 & 16) != 0 ? 0 : i10;
        int i28 = (i23 & 32) != 0 ? 0 : i11;
        int i29 = (i23 & 64) != 0 ? 0 : i12;
        int i30 = (i23 & 128) != 0 ? 0 : i13;
        int i31 = (i23 & 256) != 0 ? 0 : i14;
        int i32 = (i23 & 512) != 0 ? 0 : i15;
        int i33 = (i23 & 1024) != 0 ? 0 : i16;
        int i34 = (i23 & 2048) != 0 ? 0 : i17;
        int i35 = i23 & 4096;
        List list3 = a0.f4706a;
    }

    public static /* synthetic */ USRegulationData copy$default(USRegulationData uSRegulationData, int i, String str, int i3, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List list, List list2, int i18, int i19, int i20, int i21, int i22, int i23, Object obj) {
        int i24;
        int i25;
        int i26 = (i23 & 1) != 0 ? uSRegulationData.version : i;
        String str2 = (i23 & 2) != 0 ? uSRegulationData.gppString : str;
        int i27 = (i23 & 4) != 0 ? uSRegulationData.sharingNotice : i3;
        int i28 = (i23 & 8) != 0 ? uSRegulationData.saleOptOutNotice : i8;
        int i29 = (i23 & 16) != 0 ? uSRegulationData.sharingOptOutNotice : i10;
        int i30 = (i23 & 32) != 0 ? uSRegulationData.targetedAdvertisingOptOutNotice : i11;
        int i31 = (i23 & 64) != 0 ? uSRegulationData.sensitiveDataProcessingOptOutNotice : i12;
        int i32 = (i23 & 128) != 0 ? uSRegulationData.sensitiveDataLimitUseNotice : i13;
        int i33 = (i23 & 256) != 0 ? uSRegulationData.processingNotice : i14;
        int i34 = (i23 & 512) != 0 ? uSRegulationData.saleOptOut : i15;
        int i35 = (i23 & 1024) != 0 ? uSRegulationData.sharingOptOut : i16;
        int i36 = (i23 & 2048) != 0 ? uSRegulationData.targetedAdvertisingOptOut : i17;
        List list3 = (i23 & 4096) != 0 ? uSRegulationData.sensitiveDataProcessing : list;
        List list4 = (i23 & 8192) != 0 ? uSRegulationData.knownChildSensitiveDataConsents : list2;
        int i37 = i26;
        int i38 = (i23 & 16384) != 0 ? uSRegulationData.personalDataConsents : i18;
        int i39 = (i23 & 32768) != 0 ? uSRegulationData.additionalProcessingDataConsent : i19;
        int i40 = (i23 & 65536) != 0 ? uSRegulationData.mspaCoveredTransaction : i20;
        int i41 = (i23 & 131072) != 0 ? uSRegulationData.mspaOptOutOptionMode : i21;
        if ((i23 & 262144) != 0) {
            i25 = i41;
            i24 = uSRegulationData.mspaServiceProviderMode;
        } else {
            i24 = i22;
            i25 = i41;
        }
        return uSRegulationData.copy(i37, str2, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, list3, list4, i38, i39, i40, i25, i24);
    }

    public final int component1() {
        return this.version;
    }

    public final int component10() {
        return this.saleOptOut;
    }

    public final int component11() {
        return this.sharingOptOut;
    }

    public final int component12() {
        return this.targetedAdvertisingOptOut;
    }

    public final List<Integer> component13() {
        return this.sensitiveDataProcessing;
    }

    public final List<Integer> component14() {
        return this.knownChildSensitiveDataConsents;
    }

    public final int component15() {
        return this.personalDataConsents;
    }

    public final int component16() {
        return this.additionalProcessingDataConsent;
    }

    public final int component17() {
        return this.mspaCoveredTransaction;
    }

    public final int component18() {
        return this.mspaOptOutOptionMode;
    }

    public final int component19() {
        return this.mspaServiceProviderMode;
    }

    public final String component2() {
        return this.gppString;
    }

    public final int component3() {
        return this.sharingNotice;
    }

    public final int component4() {
        return this.saleOptOutNotice;
    }

    public final int component5() {
        return this.sharingOptOutNotice;
    }

    public final int component6() {
        return this.targetedAdvertisingOptOutNotice;
    }

    public final int component7() {
        return this.sensitiveDataProcessingOptOutNotice;
    }

    public final int component8() {
        return this.sensitiveDataLimitUseNotice;
    }

    public final int component9() {
        return this.processingNotice;
    }

    public final USRegulationData copy(int i, String str, int i3, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List<Integer> list, List<Integer> list2, int i18, int i19, int i20, int i21, int i22) {
        str.getClass();
        list.getClass();
        list2.getClass();
        return new USRegulationData(i, str, i3, i8, i10, i11, i12, i13, i14, i15, i16, i17, list, list2, i18, i19, i20, i21, i22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof USRegulationData)) {
            return false;
        }
        USRegulationData uSRegulationData = (USRegulationData) obj;
        if (this.version == uSRegulationData.version && p.b(this.gppString, uSRegulationData.gppString) && this.sharingNotice == uSRegulationData.sharingNotice && this.saleOptOutNotice == uSRegulationData.saleOptOutNotice && this.sharingOptOutNotice == uSRegulationData.sharingOptOutNotice && this.targetedAdvertisingOptOutNotice == uSRegulationData.targetedAdvertisingOptOutNotice && this.sensitiveDataProcessingOptOutNotice == uSRegulationData.sensitiveDataProcessingOptOutNotice && this.sensitiveDataLimitUseNotice == uSRegulationData.sensitiveDataLimitUseNotice && this.processingNotice == uSRegulationData.processingNotice && this.saleOptOut == uSRegulationData.saleOptOut && this.sharingOptOut == uSRegulationData.sharingOptOut && this.targetedAdvertisingOptOut == uSRegulationData.targetedAdvertisingOptOut && p.b(this.sensitiveDataProcessing, uSRegulationData.sensitiveDataProcessing) && p.b(this.knownChildSensitiveDataConsents, uSRegulationData.knownChildSensitiveDataConsents) && this.personalDataConsents == uSRegulationData.personalDataConsents && this.additionalProcessingDataConsent == uSRegulationData.additionalProcessingDataConsent && this.mspaCoveredTransaction == uSRegulationData.mspaCoveredTransaction && this.mspaOptOutOptionMode == uSRegulationData.mspaOptOutOptionMode && this.mspaServiceProviderMode == uSRegulationData.mspaServiceProviderMode) {
            return true;
        }
        return false;
    }

    public final int getAdditionalProcessingDataConsent() {
        return this.additionalProcessingDataConsent;
    }

    public final String getGppString() {
        return this.gppString;
    }

    public final List<Integer> getKnownChildSensitiveDataConsents() {
        return this.knownChildSensitiveDataConsents;
    }

    public final int getMspaCoveredTransaction() {
        return this.mspaCoveredTransaction;
    }

    public final int getMspaOptOutOptionMode() {
        return this.mspaOptOutOptionMode;
    }

    public final int getMspaServiceProviderMode() {
        return this.mspaServiceProviderMode;
    }

    public final int getPersonalDataConsents() {
        return this.personalDataConsents;
    }

    public final int getProcessingNotice() {
        return this.processingNotice;
    }

    public final int getSaleOptOut() {
        return this.saleOptOut;
    }

    public final int getSaleOptOutNotice() {
        return this.saleOptOutNotice;
    }

    public final int getSensitiveDataLimitUseNotice() {
        return this.sensitiveDataLimitUseNotice;
    }

    public final List<Integer> getSensitiveDataProcessing() {
        return this.sensitiveDataProcessing;
    }

    public final int getSensitiveDataProcessingOptOutNotice() {
        return this.sensitiveDataProcessingOptOutNotice;
    }

    public final int getSharingNotice() {
        return this.sharingNotice;
    }

    public final int getSharingOptOut() {
        return this.sharingOptOut;
    }

    public final int getSharingOptOutNotice() {
        return this.sharingOptOutNotice;
    }

    public final int getTargetedAdvertisingOptOut() {
        return this.targetedAdvertisingOptOut;
    }

    public final int getTargetedAdvertisingOptOutNotice() {
        return this.targetedAdvertisingOptOutNotice;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.mspaServiceProviderMode + ((this.mspaOptOutOptionMode + ((this.mspaCoveredTransaction + ((this.additionalProcessingDataConsent + ((this.personalDataConsents + e.a(e.a((this.targetedAdvertisingOptOut + ((this.sharingOptOut + ((this.saleOptOut + ((this.processingNotice + ((this.sensitiveDataLimitUseNotice + ((this.sensitiveDataProcessingOptOutNotice + ((this.targetedAdvertisingOptOutNotice + ((this.sharingOptOutNotice + ((this.saleOptOutNotice + ((this.sharingNotice + a.a(this.version * 31, this.gppString)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.sensitiveDataProcessing), this.knownChildSensitiveDataConsents)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setAdditionalProcessingDataConsent(int i) {
        this.additionalProcessingDataConsent = i;
    }

    public final void setGppString(String str) {
        str.getClass();
        this.gppString = str;
    }

    public final void setKnownChildSensitiveDataConsents(List<Integer> list) {
        list.getClass();
        this.knownChildSensitiveDataConsents = list;
    }

    public final void setMspaCoveredTransaction(int i) {
        this.mspaCoveredTransaction = i;
    }

    public final void setMspaOptOutOptionMode(int i) {
        this.mspaOptOutOptionMode = i;
    }

    public final void setMspaServiceProviderMode(int i) {
        this.mspaServiceProviderMode = i;
    }

    public final void setPersonalDataConsents(int i) {
        this.personalDataConsents = i;
    }

    public final void setProcessingNotice(int i) {
        this.processingNotice = i;
    }

    public final void setSaleOptOut(int i) {
        this.saleOptOut = i;
    }

    public final void setSaleOptOutNotice(int i) {
        this.saleOptOutNotice = i;
    }

    public final void setSensitiveDataLimitUseNotice(int i) {
        this.sensitiveDataLimitUseNotice = i;
    }

    public final void setSensitiveDataProcessing(List<Integer> list) {
        list.getClass();
        this.sensitiveDataProcessing = list;
    }

    public final void setSensitiveDataProcessingOptOutNotice(int i) {
        this.sensitiveDataProcessingOptOutNotice = i;
    }

    public final void setSharingNotice(int i) {
        this.sharingNotice = i;
    }

    public final void setSharingOptOut(int i) {
        this.sharingOptOut = i;
    }

    public final void setSharingOptOutNotice(int i) {
        this.sharingOptOutNotice = i;
    }

    public final void setTargetedAdvertisingOptOut(int i) {
        this.targetedAdvertisingOptOut = i;
    }

    public final void setTargetedAdvertisingOptOutNotice(int i) {
        this.targetedAdvertisingOptOutNotice = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("USRegulationData(version=");
        sb.append(this.version);
        sb.append(", gppString=");
        sb.append(this.gppString);
        sb.append(", sharingNotice=");
        sb.append(this.sharingNotice);
        sb.append(", saleOptOutNotice=");
        sb.append(this.saleOptOutNotice);
        sb.append(", sharingOptOutNotice=");
        sb.append(this.sharingOptOutNotice);
        sb.append(", targetedAdvertisingOptOutNotice=");
        sb.append(this.targetedAdvertisingOptOutNotice);
        sb.append(", sensitiveDataProcessingOptOutNotice=");
        sb.append(this.sensitiveDataProcessingOptOutNotice);
        sb.append(", sensitiveDataLimitUseNotice=");
        sb.append(this.sensitiveDataLimitUseNotice);
        sb.append(", processingNotice=");
        sb.append(this.processingNotice);
        sb.append(", saleOptOut=");
        sb.append(this.saleOptOut);
        sb.append(", sharingOptOut=");
        sb.append(this.sharingOptOut);
        sb.append(", targetedAdvertisingOptOut=");
        sb.append(this.targetedAdvertisingOptOut);
        sb.append(", sensitiveDataProcessing=");
        sb.append(this.sensitiveDataProcessing);
        sb.append(", knownChildSensitiveDataConsents=");
        sb.append(this.knownChildSensitiveDataConsents);
        sb.append(", personalDataConsents=");
        sb.append(this.personalDataConsents);
        sb.append(", additionalProcessingDataConsent=");
        sb.append(this.additionalProcessingDataConsent);
        sb.append(", mspaCoveredTransaction=");
        sb.append(this.mspaCoveredTransaction);
        sb.append(", mspaOptOutOptionMode=");
        sb.append(this.mspaOptOutOptionMode);
        sb.append(", mspaServiceProviderMode=");
        return m.n(sb, this.mspaServiceProviderMode, ')');
    }

    public USRegulationData(int i, String str, int i3, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List<Integer> list, List<Integer> list2, int i18, int i19, int i20, int i21, int i22) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.version = i;
        this.gppString = str;
        this.sharingNotice = i3;
        this.saleOptOutNotice = i8;
        this.sharingOptOutNotice = i10;
        this.targetedAdvertisingOptOutNotice = i11;
        this.sensitiveDataProcessingOptOutNotice = i12;
        this.sensitiveDataLimitUseNotice = i13;
        this.processingNotice = i14;
        this.saleOptOut = i15;
        this.sharingOptOut = i16;
        this.targetedAdvertisingOptOut = i17;
        this.sensitiveDataProcessing = list;
        this.knownChildSensitiveDataConsents = list2;
        this.personalDataConsents = i18;
        this.additionalProcessingDataConsent = i19;
        this.mspaCoveredTransaction = i20;
        this.mspaOptOutOptionMode = i21;
        this.mspaServiceProviderMode = i22;
    }

    public USRegulationData() {
        this(0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 524287, null);
    }
}
