package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends i {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.b f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4282b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f4283c;

    public TypeAdapterRuntimeTypeWrapper(com.google.gson.b bVar, i iVar, Type type) {
        this.f4281a = bVar;
        this.f4282b = iVar;
        this.f4283c = type;
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        return this.f4282b.b(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if ((r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(w3.b bVar, Object obj) {
        Class<?> cls;
        i d10;
        ?? r02 = this.f4283c;
        if (obj != null && ((r02 instanceof Class) || (r02 instanceof TypeVariable))) {
            cls = obj.getClass();
        } else {
            cls = r02;
        }
        i iVar = this.f4282b;
        if (cls != r02) {
            i c10 = this.f4281a.c(new TypeToken(cls));
            if (c10 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                i iVar2 = iVar;
                while ((iVar2 instanceof SerializationDelegatingTypeAdapter) && (d10 = ((SerializationDelegatingTypeAdapter) iVar2).d()) != iVar2) {
                    iVar2 = d10;
                }
            }
            iVar = c10;
        }
        iVar.c(bVar, obj);
    }
}
