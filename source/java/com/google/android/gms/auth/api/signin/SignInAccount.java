package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.a4;
import q0.e;
import w0.x;
import x0.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class SignInAccount extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f3669a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f3670b;
    public final String l;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f3670b = googleSignInAccount;
        x.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f3669a = str;
        x.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = a4.J(parcel, 20293);
        a4.C(parcel, 4, this.f3669a);
        a4.B(parcel, 7, this.f3670b, i);
        a4.C(parcel, 8, this.l);
        a4.N(parcel, J);
    }
}
