package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3732b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f3733a;

    public d0(int i) {
        this.f3733a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            int i = ((d0) obj).f3733a;
            int i3 = this.f3733a;
            if (i3 != 0) {
                if (i3 == i) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3733a;
        if (i != 0) {
            return ((i ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i = this.f3733a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "NO_CHECKS";
                    }
                } else {
                    str = "SKIP_SECURITY_CHECK";
                }
            } else {
                str = "SKIP_COMPLIANCE_CHECK";
            }
        } else {
            str = "ALL_CHECKS";
        }
        StringBuilder sb = new StringBuilder("READ_AND_WRITE".length() + str.length() + "".length() + 73 + 91 + 1);
        androidx.compose.ui.b.Q(sb, "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE");
        sb.append("}");
        return sb.toString();
    }
}
