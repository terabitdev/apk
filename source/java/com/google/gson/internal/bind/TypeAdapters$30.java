package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class TypeAdapters$30 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f4286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f4287b;
    public final /* synthetic */ i l;

    public TypeAdapters$30(Class cls, Class cls2, i iVar) {
        this.f4286a = cls;
        this.f4287b = cls2;
        this.l = iVar;
    }

    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        Class cls = typeToken.f4354a;
        if (cls != this.f4286a && cls != this.f4287b) {
            return null;
        }
        return this.l;
    }

    public final String toString() {
        return "Factory[type=" + this.f4287b.getName() + "+" + this.f4286a.getName() + ",adapter=" + this.l + "]";
    }
}
