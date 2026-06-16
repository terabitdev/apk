package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class p extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f4338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4339c;

    public p(Object obj, Method method) {
        this.f4338b = method;
        this.f4339c = obj;
    }

    @Override // com.google.gson.internal.t
    public final Object a(Class cls) {
        String a10 = b.a(cls);
        if (a10 == null) {
            return this.f4338b.invoke(this.f4339c, cls);
        }
        f2.i.i("UnsafeAllocator is used for non-instantiable type: ".concat(a10));
        return null;
    }
}
