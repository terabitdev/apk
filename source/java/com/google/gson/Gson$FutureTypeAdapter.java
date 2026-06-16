package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public i f4214a = null;

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        i iVar = this.f4214a;
        if (iVar != null) {
            return iVar.b(aVar);
        }
        b.d.j("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        i iVar = this.f4214a;
        if (iVar != null) {
            iVar.c(bVar, obj);
        } else {
            b.d.j("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final i d() {
        i iVar = this.f4214a;
        if (iVar != null) {
            return iVar;
        }
        b.d.j("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
