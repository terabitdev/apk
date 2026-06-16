package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.a4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import q0.d;
import q0.e;
import x0.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Deprecated
/* loaded from: classes4.dex */
public class GoogleSignInOptions extends a implements u0.a, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions t;
    public static final Scope u;
    public static final Scope v;

    /* renamed from: w, reason: collision with root package name */
    public static final Scope f3663w;

    /* renamed from: x, reason: collision with root package name */
    public static final Scope f3664x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f3665y;

    /* renamed from: a, reason: collision with root package name */
    public final int f3666a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3667b;
    public final Account l;
    public final boolean m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3668n;
    public final boolean o;
    public final String p;
    public final String q;
    public final ArrayList r;
    public final String s;

    static {
        Scope scope = new Scope(1, "profile");
        u = new Scope(1, NotificationCompat.CATEGORY_EMAIL);
        Scope scope2 = new Scope(1, "openid");
        v = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f3663w = scope3;
        f3664x = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f3664x)) {
            Scope scope4 = f3663w;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        t = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f3664x)) {
            Scope scope5 = f3663w;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new e(1);
        f3665y = new d(1);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, HashMap hashMap, String str3) {
        this.f3666a = i;
        this.f3667b = arrayList;
        this.l = account;
        this.m = z10;
        this.f3668n = z11;
        this.o = z12;
        this.p = str;
        this.q = str2;
        this.r = new ArrayList(hashMap.values());
        this.s = str3;
    }

    public static GoogleSignInOptions b(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, str3, str4, new HashMap(), null);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                r0.a aVar = (r0.a) obj;
                hashMap.put(Integer.valueOf(aVar.f9990b), aVar);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.p;
        ArrayList arrayList = this.f3667b;
        if (obj != null) {
            try {
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                ArrayList arrayList2 = googleSignInOptions.f3667b;
                String str2 = googleSignInOptions.p;
                if (this.r.isEmpty() && googleSignInOptions.r.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                    Account account = this.l;
                    Account account2 = googleSignInOptions.l;
                    if (account == null) {
                        if (account2 != null) {
                            return false;
                        }
                    } else if (!account.equals(account2)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.o == googleSignInOptions.o && this.m == googleSignInOptions.m && this.f3668n == googleSignInOptions.f3668n) {
                        if (TextUtils.equals(this.s, googleSignInOptions.s)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f3667b;
        int size = arrayList2.size();
        int i = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Scope) arrayList2.get(i3)).f3679b);
        }
        Collections.sort(arrayList);
        int hashCode3 = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.l;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        int i8 = (hashCode3 + hashCode) * 31;
        String str = this.p;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (((((((i8 + hashCode2) * 31) + (this.o ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.f3668n ? 1 : 0)) * 31;
        String str2 = this.s;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i10 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = a4.J(parcel, 20293);
        a4.H(parcel, 1, 4);
        parcel.writeInt(this.f3666a);
        a4.E(parcel, 2, new ArrayList(this.f3667b));
        a4.B(parcel, 3, this.l, i);
        a4.H(parcel, 4, 4);
        parcel.writeInt(this.m ? 1 : 0);
        a4.H(parcel, 5, 4);
        parcel.writeInt(this.f3668n ? 1 : 0);
        a4.H(parcel, 6, 4);
        parcel.writeInt(this.o ? 1 : 0);
        a4.C(parcel, 7, this.p);
        a4.C(parcel, 8, this.q);
        a4.E(parcel, 9, this.r);
        a4.C(parcel, 10, this.s);
        a4.N(parcel, J);
    }
}
