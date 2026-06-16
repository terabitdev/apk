package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.a4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import q0.e;
import w0.x;
import x0.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Deprecated
/* loaded from: classes4.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3660a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3661b;
    public final String l;
    public final String m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3662n;
    public final Uri o;
    public String p;
    public final long q;
    public final String r;
    public final List s;
    public final String t;
    public final String u;
    public final HashSet v = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f3660a = i;
        this.f3661b = str;
        this.l = str2;
        this.m = str3;
        this.f3662n = str4;
        this.o = uri;
        this.p = str5;
        this.q = j;
        this.r = str6;
        this.s = arrayList;
        this.t = str7;
        this.u = str8;
    }

    public static GoogleSignInAccount b(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has(NotificationCompat.CATEGORY_EMAIL)) {
            str3 = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL);
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        x.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.p = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.r.equals(this.r)) {
                        HashSet hashSet = new HashSet(googleSignInAccount.s);
                        hashSet.addAll(googleSignInAccount.v);
                        HashSet hashSet2 = new HashSet(this.s);
                        hashSet2.addAll(this.v);
                        if (hashSet.equals(hashSet2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() + 527;
        HashSet hashSet = new HashSet(this.s);
        hashSet.addAll(this.v);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = a4.J(parcel, 20293);
        a4.H(parcel, 1, 4);
        parcel.writeInt(this.f3660a);
        a4.C(parcel, 2, this.f3661b);
        a4.C(parcel, 3, this.l);
        a4.C(parcel, 4, this.m);
        a4.C(parcel, 5, this.f3662n);
        a4.B(parcel, 6, this.o, i);
        a4.C(parcel, 7, this.p);
        a4.H(parcel, 8, 8);
        parcel.writeLong(this.q);
        a4.C(parcel, 9, this.r);
        a4.E(parcel, 10, this.s);
        a4.C(parcel, 11, this.t);
        a4.C(parcel, 12, this.u);
        a4.N(parcel, J);
    }
}
