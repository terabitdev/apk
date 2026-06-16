package com.inmobi.cmp.core.model;

import aa.c;
import androidx.annotation.Keep;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.core.cmpapi.map.ConsentMap;
import com.inmobi.cmp.core.cmpapi.map.OutOfBandMap;
import com.inmobi.cmp.core.cmpapi.map.PublisherMap;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import d7.t;
import h6.b;
import h6.g;
import h6.h;
import h6.i;
import h6.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import x8.e;
import z9.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class GDPRData {
    private Integer cmpId;
    private CmpStatus cmpStatus;
    private Integer cmpVersion;
    private Boolean gdprApplies;
    private String gppString;
    private boolean isServiceSpecific;
    private final OutOfBandMap outOfBand;
    private PrivacyEncodingMode privacyEncodingMode;
    private final PublisherMap publisher;
    private String publisherCC;
    private final ConsentMap purpose;
    private boolean purposeOneTreatment;
    private Map<String, Boolean> specialFeaturesOptions;
    private String tcString;
    private final int tcfPolicyVersion;
    private boolean useNonStandardStacks;
    private final ConsentMap vendor;

    public GDPRData(Set<Integer> set) {
        int i;
        this.tcfPolicyVersion = 2;
        this.cmpStatus = CmpStatus.LOADING;
        PrivacyEncodingMode privacyEncodingMode = null;
        this.purpose = new ConsentMap(null, null, 3, null);
        this.vendor = new ConsentMap(null, null, 3, null);
        this.specialFeaturesOptions = new LinkedHashMap();
        this.publisher = new PublisherMap(0, null, null, null, null, 31, null);
        this.outOfBand = new OutOfBandMap(null, null, 3, null);
        m tcModel$app_release = ChoiceCmp.INSTANCE.getTcModel$app_release();
        a aVar = (a) c.v.getValue();
        if (tcModel$app_release == null) {
            return;
        }
        String str = c.e().f11797n.f11763a;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (upperCase.equals("TCF")) {
                privacyEncodingMode = PrivacyEncodingMode.TCF;
            } else if (upperCase.equals("GPP")) {
                privacyEncodingMode = PrivacyEncodingMode.GPP;
            } else {
                privacyEncodingMode = PrivacyEncodingMode.TCF_AND_GPP;
            }
        }
        setPrivacyEncodingMode(privacyEncodingMode == null ? PrivacyEncodingMode.TCF_AND_GPP : privacyEncodingMode);
        PrivacyEncodingMode privacyEncodingMode2 = getPrivacyEncodingMode();
        if (privacyEncodingMode2 == null) {
            i = -1;
        } else {
            i = b.f6074a[privacyEncodingMode2.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                setTcString(aVar.j(8));
                setGppString(aVar.j(63));
            } else {
                setGppString(aVar.j(63));
            }
        } else {
            setTcString(aVar.j(8));
        }
        setServiceSpecific(tcModel$app_release.f6103e);
        setUseNonStandardStacks(tcModel$app_release.f6104f);
        setPurposeOneTreatment(tcModel$app_release.g);
        setPublisherCC(tcModel$app_release.h);
        setCmpId(Integer.valueOf(tcModel$app_release.m));
        setCmpVersion(Integer.valueOf(tcModel$app_release.f6106n));
        setGdprApplies(Boolean.valueOf(aVar.f11814a.getInt("IABTCF_gdprApplies", 0) == 1));
        OutOfBandMap outOfBand = getOutOfBand();
        outOfBand.setAllowedVendors(e.e(tcModel$app_release.F, set));
        outOfBand.setDisclosedVendors(e.e(tcModel$app_release.E, set));
        ConsentMap purpose = getPurpose();
        purpose.setConsents(e.d(tcModel$app_release.r));
        purpose.setLegitimateInterests(e.d(tcModel$app_release.s));
        ConsentMap vendor = getVendor();
        vendor.setConsents(e.d(tcModel$app_release.f6110z));
        vendor.setLegitimateInterests(e.d(tcModel$app_release.C));
        setSpecialFeaturesOptions(e.d(tcModel$app_release.q));
        PublisherMap publisher = getPublisher();
        publisher.setVendorId(getPublisherVendorId());
        publisher.setConsents(e.d(tcModel$app_release.v));
        publisher.setLegitimateInterests(e.d(tcModel$app_release.f6107w));
        ConsentMap customPurpose = publisher.getCustomPurpose();
        customPurpose.setConsents(e.d(tcModel$app_release.f6108x));
        customPurpose.setLegitimateInterests(e.d(tcModel$app_release.f6109y));
        publisher.setRestrictions(createRestrictions(tcModel$app_release.G));
    }

    private final Map<String, Map<String, i>> createRestrictions(h hVar) {
        int intValue;
        int intValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = hVar.f6087c;
        Iterator it = linkedHashMap2.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) t.I0((Iterable) ((Map.Entry) it.next()).getValue());
            if (num == null) {
                intValue2 = 0;
            } else {
                intValue2 = num.intValue();
            }
            i = Math.max(i, intValue2);
        }
        if (i > 0) {
            Iterator it2 = linkedHashMap2.entrySet().iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                Integer num2 = (Integer) t.I0((Iterable) ((Map.Entry) it2.next()).getValue());
                if (num2 == null) {
                    intValue = 0;
                } else {
                    intValue = num2.intValue();
                }
                i3 = Math.max(i3, intValue);
            }
            int i8 = 1;
            if (1 <= i3) {
                while (true) {
                    int i10 = i8 + 1;
                    Integer valueOf = Integer.valueOf(i8);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        if (((Set) entry.getValue()).contains(valueOf)) {
                            arrayList.add(z1.b.c((String) entry.getKey()));
                        }
                    }
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        g gVar = (g) obj;
                        int i12 = gVar.f6083a;
                        if (!linkedHashMap.containsKey(String.valueOf(i12))) {
                            linkedHashMap.put(String.valueOf(i12), new LinkedHashMap());
                        }
                        Map map = (Map) linkedHashMap.get(String.valueOf(i12));
                        if (map != null) {
                        }
                    }
                    if (i8 == i3) {
                        break;
                    }
                    i8 = i10;
                }
            }
        }
        return linkedHashMap;
    }

    private final int getPublisherVendorId() {
        int i = c6.a.f3507a;
        return -1;
    }

    public final Integer getCmpId() {
        return this.cmpId;
    }

    public final CmpStatus getCmpStatus() {
        return this.cmpStatus;
    }

    public final Integer getCmpVersion() {
        return this.cmpVersion;
    }

    public final Boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final String getGppString() {
        return this.gppString;
    }

    public final OutOfBandMap getOutOfBand() {
        return this.outOfBand;
    }

    public final PrivacyEncodingMode getPrivacyEncodingMode() {
        return this.privacyEncodingMode;
    }

    public final PublisherMap getPublisher() {
        return this.publisher;
    }

    public final String getPublisherCC() {
        return this.publisherCC;
    }

    public final ConsentMap getPurpose() {
        return this.purpose;
    }

    public final boolean getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public final Map<String, Boolean> getSpecialFeaturesOptions() {
        return this.specialFeaturesOptions;
    }

    public final String getTcString() {
        return this.tcString;
    }

    public final int getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    public final boolean getUseNonStandardStacks() {
        return this.useNonStandardStacks;
    }

    public final ConsentMap getVendor() {
        return this.vendor;
    }

    public final boolean isServiceSpecific() {
        return this.isServiceSpecific;
    }

    public final void setCmpId(Integer num) {
        this.cmpId = num;
    }

    public final void setCmpStatus(CmpStatus cmpStatus) {
        cmpStatus.getClass();
        this.cmpStatus = cmpStatus;
    }

    public final void setCmpVersion(Integer num) {
        this.cmpVersion = num;
    }

    public final void setGdprApplies(Boolean bool) {
        this.gdprApplies = bool;
    }

    public final void setGppString(String str) {
        this.gppString = str;
    }

    public final void setPrivacyEncodingMode(PrivacyEncodingMode privacyEncodingMode) {
        this.privacyEncodingMode = privacyEncodingMode;
    }

    public final void setPublisherCC(String str) {
        this.publisherCC = str;
    }

    public final void setPurposeOneTreatment(boolean z10) {
        this.purposeOneTreatment = z10;
    }

    public final void setServiceSpecific(boolean z10) {
        this.isServiceSpecific = z10;
    }

    public final void setSpecialFeaturesOptions(Map<String, Boolean> map) {
        map.getClass();
        this.specialFeaturesOptions = map;
    }

    public final void setTcString(String str) {
        this.tcString = str;
    }

    public final void setUseNonStandardStacks(boolean z10) {
        this.useNonStandardStacks = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GDPRData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GDPRData(Set set, int i, kotlin.jvm.internal.h hVar) {
        this((i & 1) != 0 ? null : set);
    }
}
