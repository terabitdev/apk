package com.inmobi.cmp.core.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class ACData {
    private final String acString;

    public /* synthetic */ ACData(String str, int i, h hVar) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ ACData copy$default(ACData aCData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aCData.acString;
        }
        return aCData.copy(str);
    }

    public final String component1() {
        return this.acString;
    }

    public final ACData copy(String str) {
        return new ACData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ACData) && p.b(this.acString, ((ACData) obj).acString)) {
            return true;
        }
        return false;
    }

    public final String getAcString() {
        return this.acString;
    }

    public int hashCode() {
        String str = this.acString;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ACData(acString=" + ((Object) this.acString) + ')';
    }

    public ACData(String str) {
        this.acString = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACData() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
