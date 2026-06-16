package com.google.android.gms.internal.measurement;

import androidx.collection.ArrayMap;
import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class r4 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayMap f3944a = new ArrayMap();

    public static synchronized void a() {
        synchronized (r4.class) {
            ArrayMap arrayMap = f3944a;
            Iterator it = arrayMap.values().iterator();
            if (!it.hasNext()) {
                arrayMap.clear();
            } else {
                ((r4) it.next()).getClass();
                throw null;
            }
        }
    }
}
