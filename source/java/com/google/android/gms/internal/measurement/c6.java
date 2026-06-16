package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class c6 implements w1.d, g6 {

    /* renamed from: b, reason: collision with root package name */
    public static final m5 f3725b = new m5(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f3726a;

    public c6(int i) {
        switch (i) {
            case 1:
                this.f3726a = new HashMap();
                return;
            default:
                n6 n6Var = n6.f3904c;
                c6 c6Var = new c6(new g6[]{m5.f3892b, f3725b});
                Charset charset = u5.f3981a;
                this.f3726a = c6Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((g6[]) this.f3726a)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public p6 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            g6 g6Var = ((g6[]) this.f3726a)[i];
            if (g6Var.a(cls)) {
                return g6Var.b(cls);
            }
        }
        a8.c.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public /* synthetic */ Object c() {
        Map hashMap;
        g4 g4Var = (g4) this.f3726a;
        ContentResolver contentResolver = g4Var.f3780a;
        Uri uri = g4Var.f3781b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, g4.j, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                if (count <= 256) {
                    hashMap = new ArrayMap(count);
                } else {
                    hashMap = new HashMap(count, 1.0f);
                }
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                if (!query.isAfterLast()) {
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map2 = Collections.EMPTY_MAP;
                    query.close();
                    return map2;
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (RemoteException e10) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public void d(int i, Object obj, q6 q6Var) {
        u4 u4Var = (u4) obj;
        d5 d5Var = (d5) this.f3726a;
        d5Var.m((i << 3) | 2);
        d5Var.m(u4Var.b(q6Var));
        q6Var.d(u4Var, d5Var.f3739a);
    }

    public void e(int i, Object obj, q6 q6Var) {
        d5 d5Var = (d5) this.f3726a;
        d5Var.c(i, 3);
        q6Var.d((u4) obj, d5Var.f3739a);
        d5Var.c(i, 4);
    }

    @Override // w1.d
    public /* synthetic */ Object get() {
        Object obj = o4.g;
        return k4.c((Context) this.f3726a);
    }

    public /* synthetic */ c6(Object obj) {
        this.f3726a = obj;
    }

    public c6(d5 d5Var) {
        Charset charset = u5.f3981a;
        this.f3726a = d5Var;
        d5Var.f3739a = this;
    }
}
