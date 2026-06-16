package com.google.gson.internal.bind;

import com.google.gson.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4294a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f4297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f4298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f4299f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public c(String str, Field field, Method method, i iVar, i iVar2, boolean z10, boolean z11) {
        this.f4297d = method;
        this.f4298e = iVar;
        this.f4299f = iVar2;
        this.g = z10;
        this.h = z11;
        this.f4294a = str;
        this.f4295b = field;
        this.f4296c = field.getName();
    }

    public final void a(w3.b bVar, Object obj) {
        Object obj2;
        Method method = this.f4297d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(androidx.compose.ui.b.N("Accessor ", v3.c.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            obj2 = this.f4295b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.k(this.f4294a);
        this.f4298e.c(bVar, obj2);
    }
}
