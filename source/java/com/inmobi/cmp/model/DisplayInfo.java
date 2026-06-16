package com.inmobi.cmp.model;

import a.a;
import android.support.v4.media.session.m;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class DisplayInfo {

    /* renamed from: a, reason: collision with root package name */
    public DisplayStatus f4367a;

    /* renamed from: b, reason: collision with root package name */
    public String f4368b;

    /* renamed from: c, reason: collision with root package name */
    public Regulations f4369c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4370d;

    public DisplayInfo(DisplayStatus displayStatus, String str, Regulations regulations, boolean z10) {
        displayStatus.getClass();
        str.getClass();
        regulations.getClass();
        this.f4367a = displayStatus;
        this.f4368b = str;
        this.f4369c = regulations;
        this.f4370d = z10;
    }

    public static /* synthetic */ DisplayInfo copy$default(DisplayInfo displayInfo, DisplayStatus displayStatus, String str, Regulations regulations, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            displayStatus = displayInfo.f4367a;
        }
        if ((i & 2) != 0) {
            str = displayInfo.f4368b;
        }
        if ((i & 4) != 0) {
            regulations = displayInfo.f4369c;
        }
        if ((i & 8) != 0) {
            z10 = displayInfo.f4370d;
        }
        return displayInfo.copy(displayStatus, str, regulations, z10);
    }

    public final DisplayStatus component1() {
        return this.f4367a;
    }

    public final String component2() {
        return this.f4368b;
    }

    public final Regulations component3() {
        return this.f4369c;
    }

    public final boolean component4() {
        return this.f4370d;
    }

    public final DisplayInfo copy(DisplayStatus displayStatus, String str, Regulations regulations, boolean z10) {
        displayStatus.getClass();
        str.getClass();
        regulations.getClass();
        return new DisplayInfo(displayStatus, str, regulations, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayInfo)) {
            return false;
        }
        DisplayInfo displayInfo = (DisplayInfo) obj;
        if (this.f4367a == displayInfo.f4367a && p.b(this.f4368b, displayInfo.f4368b) && this.f4369c == displayInfo.f4369c && this.f4370d == displayInfo.f4370d) {
            return true;
        }
        return false;
    }

    public final String getDisplayMessage() {
        return this.f4368b;
    }

    public final DisplayStatus getDisplayStatus() {
        return this.f4367a;
    }

    public final boolean getGbcShown() {
        return this.f4370d;
    }

    public final Regulations getRegulationShown() {
        return this.f4369c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.f4369c.hashCode() + a.a(this.f4367a.hashCode() * 31, this.f4368b)) * 31;
        boolean z10 = this.f4370d;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final void setDisplayMessage(String str) {
        str.getClass();
        this.f4368b = str;
    }

    public final void setDisplayStatus(DisplayStatus displayStatus) {
        displayStatus.getClass();
        this.f4367a = displayStatus;
    }

    public final void setGbcShown(boolean z10) {
        this.f4370d = z10;
    }

    public final void setRegulationShown(Regulations regulations) {
        regulations.getClass();
        this.f4369c = regulations;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DisplayInfo(displayStatus=");
        sb.append(this.f4367a);
        sb.append(", displayMessage=");
        sb.append(this.f4368b);
        sb.append(", regulationShown=");
        sb.append(this.f4369c);
        sb.append(", gbcShown=");
        return m.o(sb, this.f4370d, ')');
    }

    public /* synthetic */ DisplayInfo(DisplayStatus displayStatus, String str, Regulations regulations, boolean z10, int i, h hVar) {
        this(displayStatus, str, regulations, (i & 8) != 0 ? false : z10);
    }
}
