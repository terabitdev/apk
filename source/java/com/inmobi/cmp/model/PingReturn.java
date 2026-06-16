package com.inmobi.cmp.model;

import a.a;
import androidx.annotation.Keep;
import ba.b;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class PingReturn {
    public static final b Companion = new Object();
    private static final PingReturn LOADING_PING;
    private static final PingReturn STUB_PING;
    private String apiVersion;
    private Integer cmpId;
    private boolean cmpLoaded;
    private CmpStatus cmpStatus;
    private String cmpVersion;
    private DisplayStatus displayStatus;
    private Boolean gdprApplies;
    private Integer gvlVersion;
    private Integer tcfPolicyVersion;
    private Boolean usRegulationApplies;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ba.b] */
    static {
        CmpStatus cmpStatus = CmpStatus.STUB;
        DisplayStatus displayStatus = DisplayStatus.HIDDEN;
        STUB_PING = new PingReturn(null, false, cmpStatus, displayStatus, "2.0", null, null, null, null, null, 512, null);
        LOADING_PING = new PingReturn(null, false, CmpStatus.LOADING, displayStatus, "2.0", "0.1", 10, null == true ? 1 : 0, null, null, 512, null);
    }

    public PingReturn(Boolean bool, boolean z10, CmpStatus cmpStatus, DisplayStatus displayStatus, String str, String str2, Integer num, Integer num2, Integer num3, Boolean bool2) {
        cmpStatus.getClass();
        displayStatus.getClass();
        str.getClass();
        this.gdprApplies = bool;
        this.cmpLoaded = z10;
        this.cmpStatus = cmpStatus;
        this.displayStatus = displayStatus;
        this.apiVersion = str;
        this.cmpVersion = str2;
        this.cmpId = num;
        this.gvlVersion = num2;
        this.tcfPolicyVersion = num3;
        this.usRegulationApplies = bool2;
    }

    public static /* synthetic */ PingReturn copy$default(PingReturn pingReturn, Boolean bool, boolean z10, CmpStatus cmpStatus, DisplayStatus displayStatus, String str, String str2, Integer num, Integer num2, Integer num3, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = pingReturn.gdprApplies;
        }
        if ((i & 2) != 0) {
            z10 = pingReturn.cmpLoaded;
        }
        if ((i & 4) != 0) {
            cmpStatus = pingReturn.cmpStatus;
        }
        if ((i & 8) != 0) {
            displayStatus = pingReturn.displayStatus;
        }
        if ((i & 16) != 0) {
            str = pingReturn.apiVersion;
        }
        if ((i & 32) != 0) {
            str2 = pingReturn.cmpVersion;
        }
        if ((i & 64) != 0) {
            num = pingReturn.cmpId;
        }
        if ((i & 128) != 0) {
            num2 = pingReturn.gvlVersion;
        }
        if ((i & 256) != 0) {
            num3 = pingReturn.tcfPolicyVersion;
        }
        if ((i & 512) != 0) {
            bool2 = pingReturn.usRegulationApplies;
        }
        Integer num4 = num3;
        Boolean bool3 = bool2;
        Integer num5 = num;
        Integer num6 = num2;
        String str3 = str;
        String str4 = str2;
        return pingReturn.copy(bool, z10, cmpStatus, displayStatus, str3, str4, num5, num6, num4, bool3);
    }

    public final Boolean component1() {
        return this.gdprApplies;
    }

    public final Boolean component10() {
        return this.usRegulationApplies;
    }

    public final boolean component2() {
        return this.cmpLoaded;
    }

    public final CmpStatus component3() {
        return this.cmpStatus;
    }

    public final DisplayStatus component4() {
        return this.displayStatus;
    }

    public final String component5() {
        return this.apiVersion;
    }

    public final String component6() {
        return this.cmpVersion;
    }

    public final Integer component7() {
        return this.cmpId;
    }

    public final Integer component8() {
        return this.gvlVersion;
    }

    public final Integer component9() {
        return this.tcfPolicyVersion;
    }

    public final PingReturn copy(Boolean bool, boolean z10, CmpStatus cmpStatus, DisplayStatus displayStatus, String str, String str2, Integer num, Integer num2, Integer num3, Boolean bool2) {
        cmpStatus.getClass();
        displayStatus.getClass();
        str.getClass();
        return new PingReturn(bool, z10, cmpStatus, displayStatus, str, str2, num, num2, num3, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PingReturn)) {
            return false;
        }
        PingReturn pingReturn = (PingReturn) obj;
        if (p.b(this.gdprApplies, pingReturn.gdprApplies) && this.cmpLoaded == pingReturn.cmpLoaded && this.cmpStatus == pingReturn.cmpStatus && this.displayStatus == pingReturn.displayStatus && p.b(this.apiVersion, pingReturn.apiVersion) && p.b(this.cmpVersion, pingReturn.cmpVersion) && p.b(this.cmpId, pingReturn.cmpId) && p.b(this.gvlVersion, pingReturn.gvlVersion) && p.b(this.tcfPolicyVersion, pingReturn.tcfPolicyVersion) && p.b(this.usRegulationApplies, pingReturn.usRegulationApplies)) {
            return true;
        }
        return false;
    }

    public final String getApiVersion() {
        return this.apiVersion;
    }

    public final Integer getCmpId() {
        return this.cmpId;
    }

    public final boolean getCmpLoaded() {
        return this.cmpLoaded;
    }

    public final CmpStatus getCmpStatus() {
        return this.cmpStatus;
    }

    public final String getCmpVersion() {
        return this.cmpVersion;
    }

    public final DisplayStatus getDisplayStatus() {
        return this.displayStatus;
    }

    public final Boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final Integer getGvlVersion() {
        return this.gvlVersion;
    }

    public final Integer getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    public final Boolean getUsRegulationApplies() {
        return this.usRegulationApplies;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Boolean bool = this.gdprApplies;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i3 = hashCode * 31;
        boolean z10 = this.cmpLoaded;
        int i8 = z10;
        if (z10 != 0) {
            i8 = 1;
        }
        int a10 = a.a((this.displayStatus.hashCode() + ((this.cmpStatus.hashCode() + ((i3 + i8) * 31)) * 31)) * 31, this.apiVersion);
        String str = this.cmpVersion;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (a10 + hashCode2) * 31;
        Integer num = this.cmpId;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num2 = this.gvlVersion;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Integer num3 = this.tcfPolicyVersion;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Boolean bool2 = this.usRegulationApplies;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i13 + i;
    }

    public final void setApiVersion(String str) {
        str.getClass();
        this.apiVersion = str;
    }

    public final void setCmpId(Integer num) {
        this.cmpId = num;
    }

    public final void setCmpLoaded(boolean z10) {
        this.cmpLoaded = z10;
    }

    public final void setCmpStatus(CmpStatus cmpStatus) {
        cmpStatus.getClass();
        this.cmpStatus = cmpStatus;
    }

    public final void setCmpVersion(String str) {
        this.cmpVersion = str;
    }

    public final void setDisplayStatus(DisplayStatus displayStatus) {
        displayStatus.getClass();
        this.displayStatus = displayStatus;
    }

    public final void setGdprApplies(Boolean bool) {
        this.gdprApplies = bool;
    }

    public final void setGvlVersion(Integer num) {
        this.gvlVersion = num;
    }

    public final void setTcfPolicyVersion(Integer num) {
        this.tcfPolicyVersion = num;
    }

    public final void setUsRegulationApplies(Boolean bool) {
        this.usRegulationApplies = bool;
    }

    public String toString() {
        return "PingReturn(gdprApplies=" + this.gdprApplies + ", cmpLoaded=" + this.cmpLoaded + ", cmpStatus=" + this.cmpStatus + ", displayStatus=" + this.displayStatus + ", apiVersion=" + this.apiVersion + ", cmpVersion=" + ((Object) this.cmpVersion) + ", cmpId=" + this.cmpId + ", gvlVersion=" + this.gvlVersion + ", tcfPolicyVersion=" + this.tcfPolicyVersion + ", usRegulationApplies=" + this.usRegulationApplies + ')';
    }

    public /* synthetic */ PingReturn(Boolean bool, boolean z10, CmpStatus cmpStatus, DisplayStatus displayStatus, String str, String str2, Integer num, Integer num2, Integer num3, Boolean bool2, int i, h hVar) {
        this(bool, z10, cmpStatus, displayStatus, str, str2, num, num2, num3, (i & 512) != 0 ? null : bool2);
    }
}
