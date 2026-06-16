package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class g4 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public static final String[] j = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f3780a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f3781b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f3782c;
    public volatile Map g;

    /* renamed from: d, reason: collision with root package name */
    public b4 f3783d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f3784e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3785f = new Object();
    public final ArrayList h = new ArrayList();

    public g4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f3780a = contentResolver;
        this.f3781b = uri;
        this.f3782c = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g4 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        g4 g4Var;
        if (Build.VERSION.SDK_INT >= 24) {
            g4Var = (g4) ConcurrentMap$EL.computeIfAbsent(i, uri, new Function() { // from class: com.google.android.gms.internal.measurement.f4
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return new g4(contentResolver, uri, runnable);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            ConcurrentHashMap concurrentHashMap = i;
            g4 g4Var2 = (g4) concurrentHashMap.get(uri);
            if (g4Var2 == null) {
                g4Var2 = new g4(contentResolver, uri, runnable);
                g4Var = (g4) concurrentHashMap.putIfAbsent(uri, g4Var2);
            }
            g4Var = g4Var2;
        }
        try {
            if (g4Var.f3784e) {
                synchronized (g4Var) {
                    try {
                        if (g4Var.f3784e) {
                            b4 b4Var = new b4(g4Var);
                            g4Var.f3780a.registerContentObserver(g4Var.f3781b, false, b4Var);
                            g4Var.f3783d = b4Var;
                            g4Var.f3784e = false;
                        }
                    } finally {
                    }
                }
                return g4Var;
            }
            return g4Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = i.values().iterator();
        while (it.hasNext()) {
            g4 g4Var = (g4) it.next();
            synchronized (g4Var) {
                try {
                    if (g4Var.f3784e) {
                        g4Var.f3784e = false;
                    } else {
                        b4 b4Var = g4Var.f3783d;
                        if (b4Var != null) {
                            g4Var.f3780a.unregisterContentObserver(b4Var);
                            g4Var.f3783d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map b() {
        Map map;
        Map map2;
        Object c10;
        Map map3 = this.g;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f3785f) {
                ?? r02 = this.g;
                map2 = r02;
                if (r02 == 0) {
                    try {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                c6 c6Var = new c6(this);
                                try {
                                    c10 = c6Var.c();
                                } catch (SecurityException unused) {
                                    long clearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        c10 = c6Var.c();
                                    } finally {
                                        Binder.restoreCallingIdentity(clearCallingIdentity);
                                    }
                                }
                                map = (Map) c10;
                            } catch (SecurityException e10) {
                                e = e10;
                                Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                map = Collections.EMPTY_MAP;
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                this.g = map;
                                map2 = map;
                                map4 = map2;
                                if (map4 == null) {
                                }
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            this.g = map;
                            map2 = map;
                            map4 = map2;
                            if (map4 == null) {
                            }
                        } catch (IllegalStateException e12) {
                            e = e12;
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            this.g = map;
                            map2 = map;
                            map4 = map2;
                            if (map4 == null) {
                            }
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        this.g = map;
                        map2 = map;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(r02);
                        throw th;
                    }
                }
            }
            map4 = map2;
        }
        if (map4 == null) {
            return map4;
        }
        return Collections.EMPTY_MAP;
    }
}
