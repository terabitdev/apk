package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ArrayTypeAdapter<E> extends i {

    /* renamed from: c, reason: collision with root package name */
    public static final j f4245c = new j() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            Type componentType;
            Type type = typeToken.f4355b;
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z10) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new ArrayTypeAdapter(bVar, bVar.c(new TypeToken(componentType)), f.g(componentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class f4246a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4247b;

    public ArrayTypeAdapter(com.google.gson.b bVar, i iVar, Class cls) {
        this.f4247b = new TypeAdapterRuntimeTypeWrapper(bVar, iVar, cls);
        this.f4246a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.q()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f4247b).f4282b.b(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        Class cls = this.f4246a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        if (obj == null) {
            bVar.q();
            return;
        }
        bVar.d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f4247b.c(bVar, Array.get(obj, i));
        }
        bVar.g();
    }
}
