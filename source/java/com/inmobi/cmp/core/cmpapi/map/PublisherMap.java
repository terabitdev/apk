package com.inmobi.cmp.core.cmpapi.map;

import androidx.annotation.Keep;
import h6.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class PublisherMap {
    private Map<String, Boolean> consents;
    private final ConsentMap customPurpose;
    private Map<String, Boolean> legitimateInterests;
    private Map<String, Map<String, i>> restrictions;
    private int vendorId;

    public /* synthetic */ PublisherMap(int i, Map map, Map map2, ConsentMap consentMap, Map map3, int i3, h hVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? new LinkedHashMap() : map, (i3 & 4) != 0 ? new LinkedHashMap() : map2, (i3 & 8) != 0 ? new ConsentMap(null, null, 3, null) : consentMap, (i3 & 16) != 0 ? new LinkedHashMap() : map3);
    }

    public static /* synthetic */ PublisherMap copy$default(PublisherMap publisherMap, int i, Map map, Map map2, ConsentMap consentMap, Map map3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = publisherMap.vendorId;
        }
        if ((i3 & 2) != 0) {
            map = publisherMap.consents;
        }
        if ((i3 & 4) != 0) {
            map2 = publisherMap.legitimateInterests;
        }
        if ((i3 & 8) != 0) {
            consentMap = publisherMap.customPurpose;
        }
        if ((i3 & 16) != 0) {
            map3 = publisherMap.restrictions;
        }
        Map map4 = map3;
        Map map5 = map2;
        return publisherMap.copy(i, map, map5, consentMap, map4);
    }

    public final int component1() {
        return this.vendorId;
    }

    public final Map<String, Boolean> component2() {
        return this.consents;
    }

    public final Map<String, Boolean> component3() {
        return this.legitimateInterests;
    }

    public final ConsentMap component4() {
        return this.customPurpose;
    }

    public final Map<String, Map<String, i>> component5() {
        return this.restrictions;
    }

    public final PublisherMap copy(int i, Map<String, Boolean> map, Map<String, Boolean> map2, ConsentMap consentMap, Map<String, Map<String, i>> map3) {
        map.getClass();
        map2.getClass();
        consentMap.getClass();
        map3.getClass();
        return new PublisherMap(i, map, map2, consentMap, map3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublisherMap)) {
            return false;
        }
        PublisherMap publisherMap = (PublisherMap) obj;
        if (this.vendorId == publisherMap.vendorId && p.b(this.consents, publisherMap.consents) && p.b(this.legitimateInterests, publisherMap.legitimateInterests) && p.b(this.customPurpose, publisherMap.customPurpose) && p.b(this.restrictions, publisherMap.restrictions)) {
            return true;
        }
        return false;
    }

    public final Map<String, Boolean> getConsents() {
        return this.consents;
    }

    public final ConsentMap getCustomPurpose() {
        return this.customPurpose;
    }

    public final Map<String, Boolean> getLegitimateInterests() {
        return this.legitimateInterests;
    }

    public final Map<String, Map<String, i>> getRestrictions() {
        return this.restrictions;
    }

    public final int getVendorId() {
        return this.vendorId;
    }

    public int hashCode() {
        return this.restrictions.hashCode() + ((this.customPurpose.hashCode() + ((this.legitimateInterests.hashCode() + ((this.consents.hashCode() + (this.vendorId * 31)) * 31)) * 31)) * 31);
    }

    public final void setConsents(Map<String, Boolean> map) {
        map.getClass();
        this.consents = map;
    }

    public final void setLegitimateInterests(Map<String, Boolean> map) {
        map.getClass();
        this.legitimateInterests = map;
    }

    public final void setRestrictions(Map<String, Map<String, i>> map) {
        map.getClass();
        this.restrictions = map;
    }

    public final void setVendorId(int i) {
        this.vendorId = i;
    }

    public String toString() {
        return "PublisherMap(vendorId=" + this.vendorId + ", consents=" + this.consents + ", legitimateInterests=" + this.legitimateInterests + ", customPurpose=" + this.customPurpose + ", restrictions=" + this.restrictions + ')';
    }

    public PublisherMap(int i, Map<String, Boolean> map, Map<String, Boolean> map2, ConsentMap consentMap, Map<String, Map<String, i>> map3) {
        map.getClass();
        map2.getClass();
        consentMap.getClass();
        map3.getClass();
        this.vendorId = i;
        this.consents = map;
        this.legitimateInterests = map2;
        this.customPurpose = consentMap;
        this.restrictions = map3;
    }

    public PublisherMap() {
        this(0, null, null, null, null, 31, null);
    }
}
