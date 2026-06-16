package com.inmobi.cmp.core.cmpapi.map;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class ConsentMap {
    private Map<String, Boolean> consents;
    private Map<String, Boolean> legitimateInterests;

    public /* synthetic */ ConsentMap(Map map, Map map2, int i, h hVar) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? new LinkedHashMap() : map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsentMap copy$default(ConsentMap consentMap, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = consentMap.consents;
        }
        if ((i & 2) != 0) {
            map2 = consentMap.legitimateInterests;
        }
        return consentMap.copy(map, map2);
    }

    public final Map<String, Boolean> component1() {
        return this.consents;
    }

    public final Map<String, Boolean> component2() {
        return this.legitimateInterests;
    }

    public final ConsentMap copy(Map<String, Boolean> map, Map<String, Boolean> map2) {
        map.getClass();
        map2.getClass();
        return new ConsentMap(map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentMap)) {
            return false;
        }
        ConsentMap consentMap = (ConsentMap) obj;
        if (p.b(this.consents, consentMap.consents) && p.b(this.legitimateInterests, consentMap.legitimateInterests)) {
            return true;
        }
        return false;
    }

    public final Map<String, Boolean> getConsents() {
        return this.consents;
    }

    public final Map<String, Boolean> getLegitimateInterests() {
        return this.legitimateInterests;
    }

    public int hashCode() {
        return this.legitimateInterests.hashCode() + (this.consents.hashCode() * 31);
    }

    public final void setConsents(Map<String, Boolean> map) {
        map.getClass();
        this.consents = map;
    }

    public final void setLegitimateInterests(Map<String, Boolean> map) {
        map.getClass();
        this.legitimateInterests = map;
    }

    public String toString() {
        return "ConsentMap(consents=" + this.consents + ", legitimateInterests=" + this.legitimateInterests + ')';
    }

    public ConsentMap(Map<String, Boolean> map, Map<String, Boolean> map2) {
        map.getClass();
        map2.getClass();
        this.consents = map;
        this.legitimateInterests = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsentMap() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
