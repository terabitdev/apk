package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3756a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.d f3757b;

    public e4(Context context, w1.d dVar) {
        this.f3756a = context;
        this.f3757b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e4) {
                e4 e4Var = (e4) obj;
                if (this.f3756a.equals(e4Var.f3756a) && this.f3757b.equals(e4Var.f3757b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f3756a.hashCode() ^ 1000003) * 1000003) ^ this.f3757b.hashCode();
    }

    public final String toString() {
        String obj = this.f3756a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f3757b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        androidx.compose.ui.b.Q(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
