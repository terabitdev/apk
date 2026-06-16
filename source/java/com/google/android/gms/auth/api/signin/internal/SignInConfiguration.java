package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.a4;
import q1.f;
import w0.x;
import x0.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new f(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f3671a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f3672b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        x.d(str);
        this.f3671a = str;
        this.f3672b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f3671a.equals(signInConfiguration.f3671a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f3672b;
            GoogleSignInOptions googleSignInOptions2 = this.f3672b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1 * 31;
        int i3 = 0;
        String str = this.f3671a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (i + hashCode) * 31;
        GoogleSignInOptions googleSignInOptions = this.f3672b;
        if (googleSignInOptions != null) {
            i3 = googleSignInOptions.hashCode();
        }
        return i8 + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = a4.J(parcel, 20293);
        a4.C(parcel, 2, this.f3671a);
        a4.B(parcel, 5, this.f3672b, i);
        a4.N(parcel, J);
    }
}
