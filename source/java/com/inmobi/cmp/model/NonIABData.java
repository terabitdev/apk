package com.inmobi.cmp.model;

import a.a;
import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class NonIABData {
    private boolean gdprApplies;
    private boolean hasGlobalConsent;
    private boolean hasGlobalScope;
    private String metadata;
    private Map<Integer, Boolean> nonIabVendorConsents;

    public NonIABData(boolean z10, boolean z11, boolean z12, String str, Map<Integer, Boolean> map) {
        str.getClass();
        map.getClass();
        this.gdprApplies = z10;
        this.hasGlobalConsent = z11;
        this.hasGlobalScope = z12;
        this.metadata = str;
        this.nonIabVendorConsents = map;
    }

    public static /* synthetic */ NonIABData copy$default(NonIABData nonIABData, boolean z10, boolean z11, boolean z12, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = nonIABData.gdprApplies;
        }
        if ((i & 2) != 0) {
            z11 = nonIABData.hasGlobalConsent;
        }
        if ((i & 4) != 0) {
            z12 = nonIABData.hasGlobalScope;
        }
        if ((i & 8) != 0) {
            str = nonIABData.metadata;
        }
        if ((i & 16) != 0) {
            map = nonIABData.nonIabVendorConsents;
        }
        Map map2 = map;
        boolean z13 = z12;
        return nonIABData.copy(z10, z11, z13, str, map2);
    }

    public final boolean component1() {
        return this.gdprApplies;
    }

    public final boolean component2() {
        return this.hasGlobalConsent;
    }

    public final boolean component3() {
        return this.hasGlobalScope;
    }

    public final String component4() {
        return this.metadata;
    }

    public final Map<Integer, Boolean> component5() {
        return this.nonIabVendorConsents;
    }

    public final NonIABData copy(boolean z10, boolean z11, boolean z12, String str, Map<Integer, Boolean> map) {
        str.getClass();
        map.getClass();
        return new NonIABData(z10, z11, z12, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonIABData)) {
            return false;
        }
        NonIABData nonIABData = (NonIABData) obj;
        if (this.gdprApplies == nonIABData.gdprApplies && this.hasGlobalConsent == nonIABData.hasGlobalConsent && this.hasGlobalScope == nonIABData.hasGlobalScope && p.b(this.metadata, nonIABData.metadata) && p.b(this.nonIabVendorConsents, nonIABData.nonIabVendorConsents)) {
            return true;
        }
        return false;
    }

    public final boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final boolean getHasGlobalConsent() {
        return this.hasGlobalConsent;
    }

    public final boolean getHasGlobalScope() {
        return this.hasGlobalScope;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Map<Integer, Boolean> getNonIabVendorConsents() {
        return this.nonIabVendorConsents;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.gdprApplies;
        int i = 1;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i3 = r02 * 31;
        ?? r22 = this.hasGlobalConsent;
        int i8 = r22;
        if (r22 != 0) {
            i8 = 1;
        }
        int i10 = (i3 + i8) * 31;
        boolean z11 = this.hasGlobalScope;
        if (!z11) {
            i = z11 ? 1 : 0;
        }
        return this.nonIabVendorConsents.hashCode() + a.a((i10 + i) * 31, this.metadata);
    }

    public final void setGdprApplies(boolean z10) {
        this.gdprApplies = z10;
    }

    public final void setHasGlobalConsent(boolean z10) {
        this.hasGlobalConsent = z10;
    }

    public final void setHasGlobalScope(boolean z10) {
        this.hasGlobalScope = z10;
    }

    public final void setMetadata(String str) {
        str.getClass();
        this.metadata = str;
    }

    public final void setNonIabVendorConsents(Map<Integer, Boolean> map) {
        map.getClass();
        this.nonIabVendorConsents = map;
    }

    public String toString() {
        return "NonIABData(gdprApplies=" + this.gdprApplies + ", hasGlobalConsent=" + this.hasGlobalConsent + ", hasGlobalScope=" + this.hasGlobalScope + ", metadata=" + this.metadata + ", nonIabVendorConsents=" + this.nonIabVendorConsents + ')';
    }
}
