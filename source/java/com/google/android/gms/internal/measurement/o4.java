package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class o4 {
    public static final Object g = new Object();
    public static volatile e4 h;
    public static final AtomicInteger i;

    /* renamed from: a, reason: collision with root package name */
    public final p4 f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3915b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3916c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f3917d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f3918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3919f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ o4(p4 p4Var, String str, Object obj, int i3) {
        this.f3919f = i3;
        if (((Uri) p4Var.f3928b) != null) {
            this.f3914a = p4Var;
            this.f3915b = str;
            this.f3916c = obj;
            return;
        }
        f2.i.k("Must pass a valid SharedPreferences file name or ContentProvider URI");
        throw null;
    }

    public final Object a(Object obj) {
        switch (this.f3919f) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String obj2 = obj.toString();
                String str = this.f3915b;
                StringBuilder sb = new StringBuilder(str.length() + 25 + obj2.length());
                sb.append("Invalid long value for ");
                sb.append(str);
                sb.append(": ");
                sb.append(obj2);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (z3.f4059b.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (z3.f4060c.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String obj3 = obj.toString();
                String str3 = this.f3915b;
                StringBuilder sb2 = new StringBuilder(str3.length() + 28 + obj3.length());
                sb2.append("Invalid boolean value for ");
                sb2.append(str3);
                sb2.append(": ");
                sb2.append(obj3);
                Log.e("PhenotypeFlag", sb2.toString());
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String obj4 = obj.toString();
                String str4 = this.f3915b;
                StringBuilder sb3 = new StringBuilder(str4.length() + 27 + obj4.length());
                sb3.append("Invalid double value for ");
                sb3.append(str4);
                sb3.append(": ");
                sb3.append(obj4);
                Log.e("PhenotypeFlag", sb3.toString());
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        String str;
        boolean z10;
        g4 g4Var;
        Object obj;
        String f7;
        SimpleArrayMap simpleArrayMap;
        int i3 = i.get();
        if (this.f3917d < i3) {
            synchronized (this) {
                try {
                    if (this.f3917d < i3) {
                        e4 e4Var = h;
                        w1.b bVar = w1.a.f11123a;
                        Object obj2 = null;
                        if (e4Var != null) {
                            bVar = (w1.b) e4Var.f3757b.get();
                            if (bVar.b()) {
                                h4 h4Var = (h4) bVar.a();
                                Uri uri = (Uri) this.f3914a.f3928b;
                                String str2 = this.f3915b;
                                if (uri != null) {
                                    simpleArrayMap = (SimpleArrayMap) h4Var.f3796a.get(uri.toString());
                                } else {
                                    h4Var.getClass();
                                    simpleArrayMap = null;
                                }
                                if (simpleArrayMap != null) {
                                    str = (String) simpleArrayMap.get("".concat(str2));
                                    if (e4Var == null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        p4 p4Var = this.f3914a;
                                        Uri uri2 = (Uri) p4Var.f3928b;
                                        if (uri2 != null) {
                                            if (m4.a(e4Var.f3756a, uri2)) {
                                                g4Var = g4.a(e4Var.f3756a.getContentResolver(), uri2, q4.f3940a);
                                            } else {
                                                g4Var = null;
                                            }
                                            if (g4Var != null) {
                                                String str3 = (String) g4Var.b().get(this.f3915b);
                                                if (str3 != null) {
                                                    obj = a(str3);
                                                    if (obj == null) {
                                                        if (!p4Var.f3927a && (f7 = j4.d(e4Var.f3756a).f(this.f3915b)) != null) {
                                                            obj2 = a(f7);
                                                        }
                                                        if (obj2 == null) {
                                                            obj = this.f3916c;
                                                        } else {
                                                            obj = obj2;
                                                        }
                                                    }
                                                    if (bVar.b()) {
                                                        if (str == null) {
                                                            obj = this.f3916c;
                                                        } else {
                                                            obj = a(str);
                                                        }
                                                    }
                                                    this.f3918e = obj;
                                                    this.f3917d = i3;
                                                }
                                            }
                                            obj = null;
                                            if (obj == null) {
                                            }
                                            if (bVar.b()) {
                                            }
                                            this.f3918e = obj;
                                            this.f3917d = i3;
                                        } else {
                                            Context context = e4Var.f3756a;
                                            throw null;
                                        }
                                    } else {
                                        throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                                    }
                                }
                            }
                        }
                        str = null;
                        if (e4Var == null) {
                        }
                        if (!z10) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.f3918e;
    }
}
