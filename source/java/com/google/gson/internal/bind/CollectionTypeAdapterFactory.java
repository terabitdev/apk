package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.internal.m;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.b f4248a;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class Adapter<E> extends i {

        /* renamed from: a, reason: collision with root package name */
        public final i f4249a;

        /* renamed from: b, reason: collision with root package name */
        public final m f4250b;

        public Adapter(i iVar, m mVar) {
            this.f4249a = iVar;
            this.f4250b = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.i
        public final Object b(w3.a aVar) {
            if (aVar.H() == 9) {
                aVar.D();
                return null;
            }
            Collection collection = (Collection) this.f4250b.d();
            aVar.b();
            while (aVar.q()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.f4249a).f4282b.b(aVar));
            }
            aVar.g();
            return collection;
        }

        @Override // com.google.gson.i
        public final void c(w3.b bVar, Object obj) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.q();
                return;
            }
            bVar.d();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f4249a.c(bVar, it.next());
            }
            bVar.g();
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.b bVar) {
        this.f4248a = bVar;
    }

    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        Type type;
        Type type2 = typeToken.f4355b;
        Class cls = typeToken.f4354a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type h = f.h(type2, cls, Collection.class);
        if (h instanceof ParameterizedType) {
            type = ((ParameterizedType) h).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(bVar, bVar.c(new TypeToken(type)), type), this.f4248a.b(typeToken, false));
    }
}
