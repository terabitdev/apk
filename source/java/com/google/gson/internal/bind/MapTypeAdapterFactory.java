package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.internal.m;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import q1.e0;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.b f4261a;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public final class Adapter<K, V> extends i {

        /* renamed from: a, reason: collision with root package name */
        public final i f4262a;

        /* renamed from: b, reason: collision with root package name */
        public final i f4263b;

        /* renamed from: c, reason: collision with root package name */
        public final m f4264c;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, i iVar, i iVar2, m mVar) {
            this.f4262a = iVar;
            this.f4263b = iVar2;
            this.f4264c = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.i
        public final Object b(w3.a aVar) {
            int H = aVar.H();
            if (H == 9) {
                aVar.D();
                return null;
            }
            Map map = (Map) this.f4264c.d();
            if (H == 1) {
                aVar.b();
                while (aVar.q()) {
                    aVar.b();
                    Object b10 = ((TypeAdapterRuntimeTypeWrapper) this.f4262a).f4282b.b(aVar);
                    if (map.put(b10, ((TypeAdapterRuntimeTypeWrapper) this.f4263b).f4282b.b(aVar)) == null) {
                        aVar.g();
                    } else {
                        throw new RuntimeException("duplicate key: " + b10);
                    }
                }
                aVar.g();
                return map;
            }
            aVar.d();
            while (aVar.q()) {
                e0.m.getClass();
                int i = aVar.p;
                if (i == 0) {
                    i = aVar.f();
                }
                if (i == 13) {
                    aVar.p = 9;
                } else if (i == 12) {
                    aVar.p = 8;
                } else if (i == 14) {
                    aVar.p = 10;
                } else {
                    throw aVar.P("a name");
                }
                Object b11 = ((TypeAdapterRuntimeTypeWrapper) this.f4262a).f4282b.b(aVar);
                if (map.put(b11, ((TypeAdapterRuntimeTypeWrapper) this.f4263b).f4282b.b(aVar)) != null) {
                    throw new RuntimeException("duplicate key: " + b11);
                }
            }
            aVar.h();
            return map;
        }

        @Override // com.google.gson.i
        public final void c(w3.b bVar, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                bVar.q();
                return;
            }
            bVar.e();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                bVar.k(String.valueOf(entry.getKey()));
                this.f4263b.c(bVar, entry.getValue());
            }
            bVar.h();
        }
    }

    public MapTypeAdapterFactory(com.google.gson.internal.b bVar) {
        this.f4261a = bVar;
    }

    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        Type[] typeArr;
        i iVar;
        Type type = typeToken.f4355b;
        Class cls = typeToken.f4354a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(cls)) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type h = f.h(type, cls, Map.class);
            if (h instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) h).getActualTypeArguments();
            } else {
                typeArr = new Type[]{Object.class, Object.class};
            }
        }
        Type type2 = typeArr[0];
        Type type3 = typeArr[1];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            iVar = bVar.c(new TypeToken(type2));
        } else {
            iVar = e.f4305c;
        }
        return new Adapter(this, new TypeAdapterRuntimeTypeWrapper(bVar, iVar, type2), new TypeAdapterRuntimeTypeWrapper(bVar, bVar.c(new TypeToken(type3)), type3), this.f4261a.b(typeToken, false));
    }
}
