package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements j {
    public static final j l;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.b f4258a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4259b = new ConcurrentHashMap();

    static {
        int i = 0;
        l = new DummyTypeAdapterFactory(i);
        new DummyTypeAdapterFactory(i);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.b bVar) {
        this.f4258a = bVar;
    }

    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        t3.a aVar = (t3.a) typeToken.f4354a.getAnnotation(t3.a.class);
        if (aVar == null) {
            return null;
        }
        return b(this.f4258a, bVar, typeToken, aVar, true);
    }

    public final i b(com.google.gson.internal.b bVar, com.google.gson.b bVar2, TypeToken typeToken, t3.a aVar, boolean z10) {
        i a10;
        Object d10 = bVar.b(new TypeToken(aVar.value()), true).d();
        boolean nullSafe = aVar.nullSafe();
        if (d10 instanceof i) {
            a10 = (i) d10;
        } else if (d10 instanceof j) {
            j jVar = (j) d10;
            if (z10) {
                j jVar2 = (j) this.f4259b.putIfAbsent(typeToken.f4354a, jVar);
                if (jVar2 != null) {
                    jVar = jVar2;
                }
            }
            a10 = jVar.a(bVar2, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + d10.getClass().getName() + " as a @JsonAdapter for " + f.k(typeToken.f4355b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (a10 != null && nullSafe) {
            return a10.a();
        }
        return a10;
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class DummyTypeAdapterFactory implements j {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i) {
            this();
        }
    }
}
