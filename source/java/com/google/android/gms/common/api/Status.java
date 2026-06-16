package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.a4;
import java.util.Arrays;
import o4.a0;
import q1.f;
import t0.b;
import u0.i;
import w0.x;
import x0.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class Status extends a implements i, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3681a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3682b;
    public final PendingIntent l;
    public final b m;

    /* renamed from: n, reason: collision with root package name */
    public static final Status f3680n = new Status(0, null, null, null);
    public static final Status o = new Status(14, null, null, null);
    public static final Status p = new Status(8, null, null, null);
    public static final Status q = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new f(19);

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.f3681a = i;
        this.f3682b = str;
        this.l = pendingIntent;
        this.m = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f3681a != status.f3681a || !x.j(this.f3682b, status.f3682b) || !x.j(this.l, status.l) || !x.j(this.m, status.m)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3681a), this.f3682b, this.l, this.m});
    }

    public final String toString() {
        a0 a0Var = new a0(this);
        String str = this.f3682b;
        if (str == null) {
            int i = this.f3681a;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    str = sb.toString();
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        a0Var.e(str, "statusCode");
        a0Var.e(this.l, "resolution");
        return a0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = a4.J(parcel, 20293);
        a4.H(parcel, 1, 4);
        parcel.writeInt(this.f3681a);
        a4.C(parcel, 2, this.f3682b);
        a4.B(parcel, 3, this.l, i);
        a4.B(parcel, 4, this.m, i);
        a4.N(parcel, J);
    }

    @Override // u0.i
    public final Status getStatus() {
        return this;
    }
}
