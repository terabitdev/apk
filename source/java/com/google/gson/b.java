package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.inmobi.cmp.core.model.Vector;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class b {
    public static final a l = a.f4216d;
    public static final int m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f4220n = 1;
    public static final int o = 2;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f4221a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4222b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.b f4223c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f4224d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4225e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f4226f;
    public final boolean g;
    public final a h;
    public final List i;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public final List f4227k;

    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.gson.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.gson.i, java.lang.Object] */
    public b() {
        j d10;
        Excluder excluder = Excluder.l;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f4221a = new ThreadLocal();
        this.f4222b = new ConcurrentHashMap();
        this.f4226f = map;
        com.google.gson.internal.b bVar = new com.google.gson.internal.b();
        this.f4223c = bVar;
        this.g = true;
        this.h = l;
        this.i = list;
        this.j = list;
        this.f4227k = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.e.A);
        arrayList.add(ObjectTypeAdapter.d(f4220n));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(com.google.gson.internal.bind.e.p);
        arrayList.add(com.google.gson.internal.bind.e.g);
        arrayList.add(com.google.gson.internal.bind.e.f4306d);
        arrayList.add(com.google.gson.internal.bind.e.f4307e);
        arrayList.add(com.google.gson.internal.bind.e.f4308f);
        final i iVar = com.google.gson.internal.bind.e.f4309k;
        arrayList.add(com.google.gson.internal.bind.e.b(Long.TYPE, Long.class, iVar));
        arrayList.add(com.google.gson.internal.bind.e.b(Double.TYPE, Double.class, new Object()));
        arrayList.add(com.google.gson.internal.bind.e.b(Float.TYPE, Float.class, new Object()));
        int i = o;
        if (i == 2) {
            d10 = NumberTypeAdapter.f4265b;
        } else {
            d10 = NumberTypeAdapter.d(i);
        }
        arrayList.add(d10);
        arrayList.add(com.google.gson.internal.bind.e.h);
        arrayList.add(com.google.gson.internal.bind.e.i);
        arrayList.add(com.google.gson.internal.bind.e.a(AtomicLong.class, new i() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                return new AtomicLong(((Number) i.this.b(aVar)).longValue());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar2, Object obj) {
                i.this.c(bVar2, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.a()));
        arrayList.add(com.google.gson.internal.bind.e.a(AtomicLongArray.class, new i() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                ArrayList arrayList2 = new ArrayList();
                aVar.b();
                while (aVar.q()) {
                    arrayList2.add(Long.valueOf(((Number) i.this.b(aVar)).longValue()));
                }
                aVar.g();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((Long) arrayList2.get(i3)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar2, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar2.d();
                int length = atomicLongArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    i.this.c(bVar2, Long.valueOf(atomicLongArray.get(i3)));
                }
                bVar2.g();
            }
        }.a()));
        arrayList.add(com.google.gson.internal.bind.e.j);
        arrayList.add(com.google.gson.internal.bind.e.l);
        arrayList.add(com.google.gson.internal.bind.e.q);
        arrayList.add(com.google.gson.internal.bind.e.r);
        arrayList.add(com.google.gson.internal.bind.e.a(BigDecimal.class, com.google.gson.internal.bind.e.m));
        arrayList.add(com.google.gson.internal.bind.e.a(BigInteger.class, com.google.gson.internal.bind.e.f4310n));
        arrayList.add(com.google.gson.internal.bind.e.a(com.google.gson.internal.h.class, com.google.gson.internal.bind.e.o));
        arrayList.add(com.google.gson.internal.bind.e.s);
        arrayList.add(com.google.gson.internal.bind.e.t);
        arrayList.add(com.google.gson.internal.bind.e.v);
        arrayList.add(com.google.gson.internal.bind.e.f4311w);
        arrayList.add(com.google.gson.internal.bind.e.f4313y);
        arrayList.add(com.google.gson.internal.bind.e.u);
        arrayList.add(com.google.gson.internal.bind.e.f4304b);
        arrayList.add(DefaultDateTypeAdapter.f4251c);
        arrayList.add(com.google.gson.internal.bind.e.f4312x);
        if (com.google.gson.internal.sql.b.f4349a) {
            arrayList.add(com.google.gson.internal.sql.b.f4351c);
            arrayList.add(com.google.gson.internal.sql.b.f4350b);
            arrayList.add(com.google.gson.internal.sql.b.f4352d);
        }
        arrayList.add(ArrayTypeAdapter.f4245c);
        arrayList.add(com.google.gson.internal.bind.e.f4303a);
        arrayList.add(new CollectionTypeAdapterFactory(bVar));
        arrayList.add(new MapTypeAdapterFactory(bVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(bVar);
        this.f4224d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.e.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(bVar, m, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f4225e = DesugarCollections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* JADX WARN: Finally extract failed */
    public final Object b(String str, Type type) {
        Object obj;
        TypeToken typeToken = new TypeToken(type);
        w3.a aVar = new w3.a(new StringReader(str));
        aVar.f11134x = 2;
        boolean z10 = true;
        aVar.f11134x = 1;
        try {
            try {
                try {
                    aVar.H();
                    z10 = false;
                    i c10 = c(typeToken);
                    Class cls = typeToken.f4354a;
                    obj = c10.b(aVar);
                    Class l10 = com.google.gson.internal.f.l(cls);
                    if (obj != null && !l10.isInstance(obj)) {
                        throw new ClassCastException("Type adapter '" + c10 + "' returned wrong type; requested " + cls + " but got instance of " + obj.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    aVar.f11134x = 2;
                } catch (Throwable th) {
                    aVar.f11134x = 2;
                    throw th;
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            } catch (IllegalStateException e11) {
                throw new RuntimeException(e11);
            }
        } catch (EOFException e12) {
            if (z10) {
                aVar.f11134x = 2;
                obj = null;
            } else {
                throw new RuntimeException(e12);
            }
        } catch (AssertionError e13) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e13.getMessage(), e13);
        }
        if (obj != null) {
            try {
                if (aVar.H() != 10) {
                    throw new RuntimeException("JSON document was not fully consumed.");
                }
            } catch (w3.c e14) {
                throw new RuntimeException(e14);
            } catch (IOException e15) {
                throw new RuntimeException(e15);
            }
        }
        return obj;
    }

    public final i c(TypeToken typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f4222b;
        i iVar = (i) concurrentHashMap.get(typeToken);
        if (iVar != null) {
            return iVar;
        }
        ThreadLocal threadLocal = this.f4221a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            i iVar2 = (i) map.get(typeToken);
            if (iVar2 != null) {
                return iVar2;
            }
            z10 = false;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter = new Gson$FutureTypeAdapter();
            map.put(typeToken, gson$FutureTypeAdapter);
            Iterator it = this.f4225e.iterator();
            i iVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                iVar3 = ((j) it.next()).a(this, typeToken);
                if (iVar3 != null) {
                    if (gson$FutureTypeAdapter.f4214a == null) {
                        gson$FutureTypeAdapter.f4214a = iVar3;
                        map.put(typeToken, iVar3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (iVar3 != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return iVar3;
            }
            b.d.k(typeToken, "GSON (2.13.2) cannot handle ");
            return null;
        } catch (Throwable th) {
            if (z10) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        if (r4 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r4 == r8) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i d(j jVar, TypeToken typeToken) {
        boolean z10;
        Objects.requireNonNull(jVar, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.f4224d;
        jsonAdapterAnnotationTypeAdapterFactory.getClass();
        ConcurrentHashMap concurrentHashMap = jsonAdapterAnnotationTypeAdapterFactory.f4259b;
        if (jVar != JsonAdapterAnnotationTypeAdapterFactory.l) {
            Class cls = typeToken.f4354a;
            j jVar2 = (j) concurrentHashMap.get(cls);
            if (jVar2 == null) {
                t3.a aVar = (t3.a) cls.getAnnotation(t3.a.class);
                if (aVar != null) {
                    Class value = aVar.value();
                    if (j.class.isAssignableFrom(value)) {
                        j jVar3 = (j) jsonAdapterAnnotationTypeAdapterFactory.f4258a.b(new TypeToken(value), true).d();
                        j jVar4 = (j) concurrentHashMap.putIfAbsent(cls, jVar3);
                        if (jVar4 != null) {
                            jVar3 = jVar4;
                        }
                    }
                }
            }
            z10 = false;
            for (j jVar5 : this.f4225e) {
                if (!z10) {
                    if (jVar5 == jVar) {
                        z10 = true;
                    }
                } else {
                    i a10 = jVar5.a(this, typeToken);
                    if (a10 != null) {
                        return a10;
                    }
                }
            }
            if (z10) {
                return c(typeToken);
            }
            b.d.k(typeToken, "GSON cannot serialize or deserialize ");
            return null;
        }
        jVar = jsonAdapterAnnotationTypeAdapterFactory;
        z10 = false;
        while (r0.hasNext()) {
        }
        if (z10) {
        }
    }

    public final void e(Vector vector, Class cls, w3.b bVar) {
        i c10 = c(new TypeToken(cls));
        int i = bVar.q;
        if (i == 2) {
            bVar.q = 1;
        }
        boolean z10 = bVar.r;
        boolean z11 = bVar.t;
        bVar.r = this.g;
        bVar.t = false;
        try {
            try {
                c10.c(bVar, vector);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } finally {
            bVar.x(i);
            bVar.r = z10;
            bVar.t = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f4225e + ",instanceCreators:" + this.f4223c + "}";
    }
}
