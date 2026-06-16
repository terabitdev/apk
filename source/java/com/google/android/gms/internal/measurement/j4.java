package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayDeque;
import o4.bd;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class j4 {

    /* renamed from: d, reason: collision with root package name */
    public static j4 f3815d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3816a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3817b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3818c;

    public j4(int i) {
        switch (i) {
            case 2:
                this.f3817b = new Object();
                return;
            default:
                this.f3816a = false;
                this.f3817b = null;
                this.f3818c = null;
                return;
        }
    }

    public static final void a(j4 j4Var, Context context, String str, k5.g2 g2Var) {
        j4Var.f3816a = true;
        k5.t2.c(context);
        j4Var.f3817b = null;
        if (str != null) {
            j4Var.f3818c = str;
        }
        Bundle k10 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "loginSource", "google");
        if (g2Var != null) {
            k10.putString("responseCode", String.valueOf(g2Var.f7390b));
            String str2 = g2Var.f7391c;
            if (str2 != null) {
                k10.putString("exception", str2);
            }
        }
        new o4.a0(context, 22).u(k10, "login");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, com.google.android.gms.internal.measurement.j4] */
    public static j4 d(Context context) {
        j4 j4Var;
        j4 j4Var2;
        synchronized (j4.class) {
            try {
                if (f3815d == null) {
                    if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        ?? obj = new Object();
                        obj.f3816a = false;
                        obj.f3817b = context;
                        obj.f3818c = new ContentObserver(null);
                        j4Var2 = obj;
                    } else {
                        j4Var2 = new j4(0);
                    }
                    f3815d = j4Var2;
                }
                j4 j4Var3 = f3815d;
                if (j4Var3 != null && ((i4) j4Var3.f3818c) != null && !j4Var3.f3816a) {
                    try {
                        context.getContentResolver().registerContentObserver(z3.f4058a, true, (i4) f3815d.f3818c);
                        j4 j4Var4 = f3815d;
                        j4Var4.getClass();
                        j4Var4.f3816a = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                j4Var = f3815d;
                j4Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j4Var;
    }

    public static synchronized void h() {
        Context context;
        synchronized (j4.class) {
            try {
                j4 j4Var = f3815d;
                if (j4Var != null && (context = (Context) j4Var.f3817b) != null && ((i4) j4Var.f3818c) != null && j4Var.f3816a) {
                    context.getContentResolver().unregisterContentObserver((i4) f3815d.f3818c);
                }
                f3815d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(u0.b bVar, v1.h hVar) {
        bd bdVar = (bd) ((p6.c) this.f3818c).f9394a;
        bdVar.getClass();
        y0.a aVar = (y0.a) ((y0.c) bVar).t();
        w0.m mVar = (w0.m) bdVar.f8551b;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f4038k);
        int i = j1.a.f7025a;
        if (mVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            mVar.writeToParcel(obtain, 0);
        }
        try {
            aVar.j.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.a(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    public Object c(String str, Context context, i7.j jVar) {
        this.f3817b = new k5.v2();
        ?? obj = new Object();
        j8.e eVar = c8.p0.f3588a;
        Object K = c8.f0.K(j8.d.f7053a, new a5.q(context, (kotlin.jvm.internal.h0) obj, str, this, (g7.c) null), jVar);
        if (K == h7.a.f6117a) {
            return K;
        }
        return c7.z.f3538a;
    }

    public void e(v1.n nVar) {
        synchronized (this.f3817b) {
            try {
                if (((ArrayDeque) this.f3818c) == null) {
                    this.f3818c = new ArrayDeque();
                }
                ((ArrayDeque) this.f3818c).add(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String f(String str) {
        Object a10;
        Context context = (Context) this.f3817b;
        if (context != null && (!d4.a() || d4.b(context))) {
            try {
                try {
                    t tVar = new t(this, str);
                    try {
                        a10 = tVar.a();
                    } catch (SecurityException unused) {
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            a10 = tVar.a();
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    }
                    return (String) a10;
                } catch (SecurityException e10) {
                    e = e10;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            } catch (IllegalStateException e11) {
                e = e11;
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            }
        }
        return null;
    }

    public void g(v1.o oVar) {
        v1.n nVar;
        synchronized (this.f3817b) {
            if (((ArrayDeque) this.f3818c) != null && !this.f3816a) {
                this.f3816a = true;
                while (true) {
                    synchronized (this.f3817b) {
                        try {
                            nVar = (v1.n) ((ArrayDeque) this.f3818c).poll();
                            if (nVar == null) {
                                this.f3816a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nVar.a(oVar);
                }
            }
        }
    }
}
