package com.google.android.gms.internal.measurement;

import android.animation.ValueAnimator;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.autofill.HintConstants;
import androidx.compose.ui.unit.Dp;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.inmobi.cmp.model.ChoiceError;
import com.uptodown.UptodownApp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import o4.ec;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class l5 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3883a = true;

    public static void A(String str) {
        str.equals("");
    }

    public static void B(String str) {
        if (str != null) {
            str.equals("");
        }
    }

    public static int C(int i, int... iArr) {
        for (int i3 : iArr) {
            i = Math.max(i, i3);
        }
        return i;
    }

    public static Comparable D(Dp dp, Dp dp2) {
        dp.getClass();
        dp2.getClass();
        if (dp.compareTo(dp2) >= 0) {
            return dp;
        }
        return dp2;
    }

    public static void E(ProgressBar progressBar, ImageView imageView) {
        progressBar.getClass();
        imageView.getClass();
        if (progressBar.getVisibility() == 8) {
            progressBar.setVisibility(0);
            progressBar.getContext().getClass();
            androidx.window.embedding.t tVar = new androidx.window.embedding.t(29);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.6f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new a6.o(imageView, 1));
            ofFloat.addListener(new a6.q(tVar, 1));
            ofFloat.start();
        }
    }

    public static String F(char c10, Locale locale) {
        locale.getClass();
        String valueOf = String.valueOf(c10);
        valueOf.getClass();
        String upperCase = valueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() > 1) {
            if (c10 != 329) {
                char charAt = upperCase.charAt(0);
                String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return charAt + lowerCase;
            }
        } else {
            String valueOf2 = String.valueOf(c10);
            valueOf2.getClass();
            String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        }
        return upperCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0111, code lost:
    
        if (r6.moveToFirst() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        r0 = r6.getString(r6.getColumnIndexOrThrow("packagename"));
        r2 = r6.getString(r6.getColumnIndexOrThrow("installer_packagename"));
        r0.getClass();
        r2.getClass();
        r1.add(new k5.h(r0, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0135, code lost:
    
        if (r6.moveToNext() != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013a, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        r0 = r1.iterator();
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0157, code lost:
    
        if (r0.hasNext() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0159, code lost:
    
        r1 = r0.next();
        r1.getClass();
        r1 = ((k5.h) r1).f7393a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0168, code lost:
    
        if (r4.contains(r1) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016a, code lost:
    
        r3.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016e, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0171, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G(Context context, o4.a0 a0Var) {
        Cursor cursor;
        Cursor cursor2;
        String str;
        context.getClass();
        w5.g f7 = w5.g.D.f(context);
        f7.b();
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        List c10 = a5.o.c(packageManager);
        List list = c10;
        ArrayList arrayList = new ArrayList(d7.u.i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApplicationInfo) it.next()).packageName);
        }
        Set X0 = d7.t.X0(arrayList);
        Iterator it2 = c10.iterator();
        while (true) {
            cursor = null;
            if (!it2.hasNext()) {
                break;
            }
            String str2 = ((ApplicationInfo) it2.next()).packageName;
            str2.getClass();
            String b10 = w5.a.b(context, str2);
            if (b10 == null) {
                f7.k(str2);
            } else {
                try {
                    SQLiteDatabase sQLiteDatabase = f7.f11192a;
                    sQLiteDatabase.getClass();
                    cursor2 = sQLiteDatabase.query("app_installers", new String[]{"installer_packagename"}, "packagename=?", new String[]{str2}, null, null, null, "1");
                    try {
                        if (cursor2.moveToFirst()) {
                            str = cursor2.getString(0);
                        } else {
                            str = null;
                        }
                        try {
                            cursor2.close();
                        } catch (Exception e10) {
                            e = e10;
                            e.printStackTrace();
                            if (cursor2 != null && !cursor2.isClosed()) {
                                cursor2.close();
                            }
                            if (str != null) {
                            }
                            if (kotlin.jvm.internal.p.b(str, b10)) {
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        str = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    cursor2 = null;
                    str = null;
                }
                if (str != null && b10.equalsIgnoreCase("com.uptodown")) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("packagename", str2);
                    contentValues.put("installer_packagename", b10);
                    SQLiteDatabase sQLiteDatabase2 = f7.f11192a;
                    sQLiteDatabase2.getClass();
                    sQLiteDatabase2.insert("app_installers", null, contentValues);
                } else if (kotlin.jvm.internal.p.b(str, b10)) {
                    f7.k(str2);
                    if (z7.v.a0(str, "com.uptodown", true) && b10.equalsIgnoreCase("com.android.vending") && a0Var != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("packagename", str2);
                        a0Var.u(bundle, "installer_overwritten");
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase3 = f7.f11192a;
            sQLiteDatabase3.getClass();
            cursor = sQLiteDatabase3.query("app_installers", null, null, null, null, null, null);
        } catch (Exception e13) {
            e13.printStackTrace();
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    public static int H(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 0;
        }
        return 5;
    }

    public static int I(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i3 = 0; i3 < 6; i3++) {
            int i8 = iArr[i3];
            int i10 = i8 - 1;
            if (i8 != 0) {
                if (i10 == i) {
                    return i8;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static g5 J() {
        String str;
        ClassLoader classLoader = l5.class.getClassLoader();
        if (!g5.class.equals(g5.class)) {
            if (!g5.class.getPackage().equals(l5.class.getPackage())) {
                f2.i.k(g5.class.getName());
                return null;
            }
            str = g5.class.getPackage().getName() + ".BlazeGenerated" + g5.class.getSimpleName() + "Loader";
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    try {
                        o4.b1.k(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (InvocationTargetException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (InstantiationException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new l5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                        break;
                    } catch (ServiceConfigurationError e14) {
                        Logger.getLogger(d5.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(g5.class.getSimpleName()), (Throwable) e14);
                    }
                }
                if (arrayList.size() == 1) {
                    return (g5) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (g5) g5.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(e15);
                } catch (NoSuchMethodException e16) {
                    throw new IllegalStateException(e16);
                } catch (InvocationTargetException e17) {
                    throw new IllegalStateException(e17);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static final r8.v0 a(String str, p8.d dVar) {
        if (!z7.n.r0(str)) {
            Iterator it = ((e7.h) r8.w0.f10375a.values()).iterator();
            while (((e7.d) it).hasNext()) {
                n8.b bVar = (n8.b) ((e7.d) it).next();
                if (str.equals(bVar.getDescriptor().a())) {
                    StringBuilder v = android.support.v4.media.session.m.v("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                    v.append(kotlin.jvm.internal.i0.a(bVar.getClass()).c());
                    v.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                    f2.i.k(z7.p.T(v.toString()));
                    return null;
                }
            }
            return new r8.v0(str, dVar);
        }
        f2.i.k("Blank serial names are prohibited");
        return null;
    }

    public static final p8.j b(String str, p8.e eVar) {
        eVar.getClass();
        if (!z7.n.r0(str)) {
            if (!(eVar.getKind() instanceof p8.d)) {
                if (!str.equals(eVar.a())) {
                    return new p8.j(str, eVar);
                }
                StringBuilder v = android.support.v4.media.session.m.v("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
                v.append(eVar.a());
                v.append(')');
                throw new IllegalArgumentException(v.toString().toString());
            }
            f2.i.k("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
            return null;
        }
        f2.i.k("Blank serial names are prohibited");
        return null;
    }

    public static long c(int i, String str) {
        long parseLong;
        if (i == str.length()) {
            if (i != str.length()) {
                f1.g.h(null, ChoiceError.ENCODE_INVALID_BIT_LENGTH.getMessage(), null, 5);
                parseLong = -1;
            } else {
                k(2);
                parseLong = Long.parseLong(str, 2);
            }
            return parseLong * 100;
        }
        throw new Throwable(kotlin.jvm.internal.p.g(": invalid bit length", "h.b"));
    }

    public static k9.d d() {
        k9.d dVar = k9.d.l;
        dVar.getClass();
        k9.d dVar2 = dVar.f7619f;
        if (dVar2 == null) {
            long nanoTime = System.nanoTime();
            k9.d.i.await(k9.d.j, TimeUnit.MILLISECONDS);
            k9.d dVar3 = k9.d.l;
            dVar3.getClass();
            if (dVar3.f7619f != null || System.nanoTime() - nanoTime < k9.d.f7617k) {
                return null;
            }
            return k9.d.l;
        }
        long nanoTime2 = dVar2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            k9.d.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        k9.d dVar4 = k9.d.l;
        dVar4.getClass();
        dVar4.f7619f = dVar2.f7619f;
        dVar2.f7619f = null;
        return dVar2;
    }

    public static p8.f e(String str, p8.e[] eVarArr) {
        if (!z7.n.r0(str)) {
            p8.a aVar = new p8.a(str);
            return new p8.f(str, p8.i.g, aVar.f9402b.size(), d7.p.x0(eVarArr), aVar);
        }
        f2.i.k("Blank serial names are prohibited");
        return null;
    }

    public static final p8.f f(String str, f1.g gVar, p8.e[] eVarArr, q7.c cVar) {
        if (!z7.n.r0(str)) {
            if (!gVar.equals(p8.i.g)) {
                p8.a aVar = new p8.a(str);
                cVar.invoke(aVar);
                return new p8.f(str, gVar, aVar.f9402b.size(), d7.p.x0(eVarArr), aVar);
            }
            f2.i.k("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        f2.i.k("Blank serial names are prohibited");
        return null;
    }

    public static p8.f g(String str, f1.g gVar, p8.e[] eVarArr) {
        if (!z7.n.r0(str)) {
            if (!gVar.equals(p8.i.g)) {
                p8.a aVar = new p8.a(str);
                return new p8.f(str, gVar, aVar.f9402b.size(), d7.p.x0(eVarArr), aVar);
            }
            f2.i.k("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        f2.i.k("Blank serial names are prohibited");
        return null;
    }

    public static void h(String str) {
        String str2;
        str.getClass();
        k5.r b10 = n5.b.b();
        String str3 = null;
        if (b10 != null) {
            str2 = b10.f7495b;
        } else {
            str2 = null;
        }
        if (kotlin.jvm.internal.p.b(str2, str)) {
            n5.b.f();
            return;
        }
        k5.r a10 = n5.d.a();
        if (a10 != null) {
            str3 = a10.f7495b;
        }
        if (kotlin.jvm.internal.p.b(str3, str)) {
            n5.d.d();
        }
    }

    public static void i(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        o2.a.h(str);
    }

    public static void k(int i) {
        if (2 <= i && i < 37) {
            return;
        }
        StringBuilder p = android.support.v4.media.session.m.p(i, "radix ", " was not in valid range ");
        p.append(new w7.d(2, 36, 1));
        throw new IllegalArgumentException(p.toString());
    }

    public static final void l(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (autoCloseable instanceof ExecutorService) {
                    androidx.compose.foundation.text.selection.k.f((ExecutorService) autoCloseable);
                    return;
                }
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                }
                if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                }
                if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof ContentProviderClient) {
                    ((ContentProviderClient) autoCloseable).release();
                    return;
                } else {
                    f2.i.n();
                    return;
                }
            }
            try {
                androidx.compose.ui.b.P(autoCloseable);
            } catch (Throwable th2) {
                c7.a.a(th, th2);
            }
        }
    }

    public static void m(d5.e eVar, b5.a aVar) {
        while (!aVar.g) {
            StringBuilder sb = new StringBuilder("Command is in position ");
            ArrayList arrayList = eVar.i;
            sb.append(arrayList.indexOf(aVar));
            sb.append(" currently executing command at position ");
            sb.append(eVar.o);
            sb.append(" and the number of commands is ");
            sb.append(arrayList.size());
            A(sb.toString());
            A("Processed " + aVar.f3300b + " of " + aVar.f3299a + " output from command.");
            synchronized (aVar) {
                try {
                    if (!aVar.g) {
                        aVar.wait(2000L);
                    }
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
            if (!aVar.f3303e && !aVar.g) {
                boolean z10 = eVar.f4686k;
                if (!z10 && !eVar.l) {
                    A("Waiting for a command to be executed in a shell that is not executing and not reading! \n\n Command: ".concat(aVar.b()));
                    Exception exc = new Exception();
                    exc.setStackTrace(Thread.currentThread().getStackTrace());
                    exc.printStackTrace();
                } else if (z10 && !eVar.l) {
                    A("Waiting for a command to be executed in a shell that is executing but not reading! \n\n Command: ".concat(aVar.b()));
                    Exception exc2 = new Exception();
                    exc2.setStackTrace(Thread.currentThread().getStackTrace());
                    exc2.printStackTrace();
                } else {
                    A("Waiting for a command to be executed in a shell that is not reading! \n\n Command: ".concat(aVar.b()));
                    Exception exc3 = new Exception();
                    exc3.setStackTrace(Thread.currentThread().getStackTrace());
                    exc3.printStackTrace();
                }
            }
        }
    }

    public static int n(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void o(int i, boolean z10) {
        c8.r rVar = (c8.r) a5.n.f152c.get(Integer.valueOf(i));
        if (rVar != null) {
            ((c8.s) rVar).O(Boolean.valueOf(z10));
        }
    }

    public static void p(int i, boolean z10) {
        c8.r rVar = (c8.r) a5.n.f153d.get(Integer.valueOf(i));
        if (rVar != null) {
            ((c8.s) rVar).O(Boolean.valueOf(z10));
        }
    }

    public static final void q(int i, int i3) {
        if (i <= i3) {
            return;
        }
        o2.a.d(") is greater than size (", i, i3, "toIndex (");
    }

    public static int r(char c10) {
        int digit = Character.digit((int) c10, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static void s(ProgressBar progressBar, ImageView imageView) {
        progressBar.getClass();
        imageView.getClass();
        if (progressBar.getVisibility() == 0) {
            progressBar.getContext().getClass();
            ec ecVar = new ec(progressBar, 7);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.6f, 1.0f);
            ofFloat.setStartDelay(200L);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new a6.o(imageView, 0));
            ofFloat.addListener(new a6.q(ecVar, 0));
            ofFloat.start();
        }
    }

    public static final boolean t(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static ArrayList u(JSONObject jSONObject) {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                int optInt = optJSONObject.optInt("id");
                k5.j jVar = new k5.j(0, (String) null, 7);
                jVar.a(optJSONObject, optInt);
                if (optInt == 831) {
                    jVar.q = new ArrayList();
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("children");
                    if (optJSONArray2 != null) {
                        int length2 = optJSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                            k5.j jVar2 = new k5.j(0, (String) null, 7);
                            optJSONObject2.getClass();
                            jVar2.a(optJSONObject2, optInt);
                            ArrayList arrayList2 = jVar.q;
                            arrayList2.getClass();
                            arrayList2.add(jVar2);
                        }
                    }
                }
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static ArrayList v(JSONObject jSONObject) {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                k5.j jVar = new k5.j(0, (String) null, 7);
                optJSONObject.getClass();
                if (!optJSONObject.isNull("id")) {
                    jVar.f7407a = optJSONObject.optInt("id");
                }
                if (!optJSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
                    jVar.f7408b = optJSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
                }
                if (!optJSONObject.isNull(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                    if (kotlin.jvm.internal.p.b(optJSONObject.optString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY), "floatingCategory")) {
                        jVar.m = true;
                    } else {
                        jVar.f7409n = true;
                    }
                }
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public static void w(UptodownApp uptodownApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(z1.f.c());
        }
        firebaseMessaging.getClass();
        v1.h hVar = new v1.h();
        firebaseMessaging.f4206f.execute(new a6.d(22, firebaseMessaging, hVar));
        v1.o oVar = hVar.f10870a;
        androidx.core.view.inputmethod.b bVar = new androidx.core.view.inputmethod.b(uptodownApp, 14);
        oVar.getClass();
        oVar.f10883b.e(new v1.l(v1.i.f10871a, bVar));
        oVar.p();
    }

    public static boolean x(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }

    public static String y(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb;
        int i = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    if (sb3.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(sb3);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + sb3.length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i3] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i8 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i8)) != -1) {
            sb5.append((CharSequence) str, i8, indexOf);
            sb5.append(objArr[i]);
            i8 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) str, i8, str.length());
        if (i < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i10 = i + 1; i10 < objArr.length; i10++) {
                sb5.append(", ");
                sb5.append(objArr[i10]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [k5.n2, java.lang.Object] */
    public static k5.o2 z(k5.g2 g2Var, k5.j jVar) {
        int i;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        jVar.getClass();
        k5.o2 o2Var = new k5.o2(null, null, 7);
        o2Var.f7464a = jVar;
        JSONObject jSONObject = g2Var.f7392d;
        if (jSONObject != null) {
            if (!jSONObject.isNull("success")) {
                i = jSONObject.optInt("success");
            } else {
                i = 0;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
            if (optJSONObject3 != null) {
                if (!optJSONObject3.isNull("category") && (optJSONObject2 = optJSONObject3.optJSONObject("category")) != null && !optJSONObject2.isNull("description")) {
                    o2Var.f7464a.l = optJSONObject2.optString("description");
                }
                if (!optJSONObject3.isNull("title")) {
                    o2Var.f7464a.f7408b = optJSONObject3.optString("title");
                }
                if (!optJSONObject3.isNull("description")) {
                    o2Var.f7464a.l = optJSONObject3.optString("description");
                }
                if (jVar.m) {
                    ?? obj = new Object();
                    obj.f7450a = -1L;
                    obj.f7451b = -1;
                    obj.f7452c = -1;
                    obj.f7453d = null;
                    obj.f7454e = null;
                    obj.f7455f = null;
                    obj.g = null;
                    o2Var.f7467d = obj;
                    if (!optJSONObject3.isNull("lastUpdate")) {
                        k5.n2 n2Var = o2Var.f7467d;
                        n2Var.getClass();
                        n2Var.f7450a = optJSONObject3.optLong("lastUpdate");
                    }
                    if (!optJSONObject3.isNull("totalApps")) {
                        k5.n2 n2Var2 = o2Var.f7467d;
                        n2Var2.getClass();
                        n2Var2.f7451b = optJSONObject3.optInt("totalApps");
                    }
                    if (!optJSONObject3.isNull("url")) {
                        k5.n2 n2Var3 = o2Var.f7467d;
                        n2Var3.getClass();
                        n2Var3.g = optJSONObject3.optString("url");
                    }
                    if (!optJSONObject3.isNull("editor") && (optJSONObject = optJSONObject3.optJSONObject("editor")) != null) {
                        if (!optJSONObject.isNull("editorID")) {
                            k5.n2 n2Var4 = o2Var.f7467d;
                            n2Var4.getClass();
                            n2Var4.f7452c = optJSONObject.optInt("editorID");
                        }
                        if (!optJSONObject.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
                            k5.n2 n2Var5 = o2Var.f7467d;
                            n2Var5.getClass();
                            n2Var5.f7453d = optJSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
                        }
                        if (!optJSONObject.isNull("avatar")) {
                            k5.n2 n2Var6 = o2Var.f7467d;
                            n2Var6.getClass();
                            n2Var6.f7454e = optJSONObject.optString("avatar");
                        }
                        if (!optJSONObject.isNull("jobTitle")) {
                            k5.n2 n2Var7 = o2Var.f7467d;
                            n2Var7.getClass();
                            n2Var7.f7455f = optJSONObject.optString("jobTitle");
                        }
                    }
                }
                if (!optJSONObject3.isNull("floatingCategoryRelated") && (optJSONArray = optJSONObject3.optJSONArray("floatingCategoryRelated")) != null) {
                    o2Var.f7468e = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        JSONObject optJSONObject4 = optJSONArray.optJSONObject(i3);
                        optJSONObject4.getClass();
                        k5.j jVar2 = new k5.j(0, (String) null, 7);
                        if (!optJSONObject4.isNull("id")) {
                            jVar2.f7407a = optJSONObject4.optInt("id");
                        }
                        if (!optJSONObject4.isNull(HintConstants.AUTOFILL_HINT_NAME)) {
                            jVar2.f7408b = optJSONObject4.optString(HintConstants.AUTOFILL_HINT_NAME);
                        }
                        jVar2.m = true;
                        ArrayList arrayList = o2Var.f7468e;
                        arrayList.getClass();
                        arrayList.add(jVar2);
                    }
                }
                JSONArray optJSONArray2 = optJSONObject3.optJSONArray("apps");
                if (optJSONArray2 != null && i == 1 && optJSONArray2.length() > 0) {
                    int length2 = optJSONArray2.length();
                    for (int i8 = 0; i8 < length2; i8++) {
                        JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i8);
                        optJSONObject5.getClass();
                        k5.g gVar = new k5.g();
                        gVar.a(null, optJSONObject5);
                        o2Var.f7465b.add(gVar);
                    }
                }
            }
        }
        return o2Var;
    }
}
