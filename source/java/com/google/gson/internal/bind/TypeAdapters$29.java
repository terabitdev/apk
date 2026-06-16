package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class TypeAdapters$29 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f4284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f4285b;

    public TypeAdapters$29(Class cls, i iVar) {
        this.f4284a = cls;
        this.f4285b = iVar;
    }

    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        if (typeToken.f4354a == this.f4284a) {
            return this.f4285b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f4284a.getName() + ",adapter=" + this.f4285b + "]";
    }
}
