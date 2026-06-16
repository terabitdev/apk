package com.google.gson.internal.bind;

import android.support.v4.media.session.m;
import com.google.android.gms.internal.measurement.i6;
import com.google.gson.i;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.b f4272a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4273b;
    public final Excluder l;
    public final JsonAdapterAnnotationTypeAdapterFactory m;

    /* renamed from: n, reason: collision with root package name */
    public final List f4274n;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends i {
        @Override // com.google.gson.i
        public final Object b(w3.a aVar) {
            aVar.N();
            return null;
        }

        @Override // com.google.gson.i
        public final void c(w3.b bVar, Object obj) {
            bVar.q();
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static abstract class Adapter<T, A> extends i {

        /* renamed from: a, reason: collision with root package name */
        public final d f4275a;

        public Adapter(d dVar) {
            this.f4275a = dVar;
        }

        @Override // com.google.gson.i
        public final Object b(w3.a aVar) {
            if (aVar.H() == 9) {
                aVar.D();
                return null;
            }
            Object d10 = d();
            Map map = this.f4275a.f4301a;
            try {
                aVar.d();
                while (aVar.q()) {
                    c cVar = (c) map.get(aVar.B());
                    if (cVar == null) {
                        aVar.N();
                    } else {
                        f(d10, aVar, cVar);
                    }
                }
                aVar.h();
                return e(d10);
            } catch (IllegalAccessException e10) {
                a.a aVar2 = v3.c.f10892a;
                androidx.privacysandbox.ads.adservices.customaudience.a.l("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
                return null;
            } catch (IllegalStateException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.google.gson.i
        public final void c(w3.b bVar, Object obj) {
            if (obj == null) {
                bVar.q();
                return;
            }
            bVar.e();
            try {
                Iterator it = this.f4275a.f4302b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(bVar, obj);
                }
                bVar.h();
            } catch (IllegalAccessException e10) {
                a.a aVar = v3.c.f10892a;
                androidx.privacysandbox.ads.adservices.customaudience.a.l("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, w3.a aVar, c cVar);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        public static final HashMap f4277e;

        /* renamed from: b, reason: collision with root package name */
        public final Constructor f4278b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f4279c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f4280d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f4277e = hashMap;
        }

        public RecordAdapter(Class cls, d dVar) {
            super(dVar);
            this.f4280d = new HashMap();
            a.a aVar = v3.c.f10892a;
            Constructor w6 = aVar.w(cls);
            this.f4278b = w6;
            v3.c.f(w6);
            String[] A = aVar.A(cls);
            for (int i = 0; i < A.length; i++) {
                this.f4280d.put(A[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.f4278b.getParameterTypes();
            this.f4279c = new Object[parameterTypes.length];
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                this.f4279c[i3] = f4277e.get(parameterTypes[i3]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.f4279c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f4278b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                a.a aVar = v3.c.f10892a;
                androidx.privacysandbox.ads.adservices.customaudience.a.l("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
                return null;
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + v3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + v3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                androidx.privacysandbox.ads.adservices.customaudience.a.l("Failed to invoke constructor '" + v3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
                return null;
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, w3.a aVar, c cVar) {
            Object[] objArr = (Object[]) obj;
            String str = cVar.f4296c;
            Integer num = (Integer) this.f4280d.get(str);
            if (num != null) {
                int intValue = num.intValue();
                Object b10 = cVar.f4299f.b(aVar);
                if (b10 == null && cVar.g) {
                    StringBuilder v = m.v("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                    v.append(aVar.n(false));
                    throw new RuntimeException(v.toString());
                }
                objArr[intValue] = b10;
                return;
            }
            androidx.privacysandbox.ads.adservices.customaudience.a.j("Could not find the index in the constructor '", v3.c.b(this.f4278b), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.b bVar, int i, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        List list = Collections.EMPTY_LIST;
        this.f4272a = bVar;
        this.f4273b = i;
        this.l = excluder;
        this.m = jsonAdapterAnnotationTypeAdapterFactory;
        this.f4274n = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + v3.c.c(field) + " and " + v3.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.gson.i, java.lang.Object] */
    @Override // com.google.gson.j
    public final i a(com.google.gson.b bVar, TypeToken typeToken) {
        Class cls = typeToken.f4354a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        a.a aVar = v3.c.f10892a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new Object();
        }
        List list = Collections.EMPTY_LIST;
        f.e();
        if (v3.c.f10892a.E(cls)) {
            return new RecordAdapter(cls, c(bVar, typeToken, cls, true));
        }
        return new FieldReflectionAdapter(this.f4272a.b(typeToken, true), c(bVar, typeToken, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d c(com.google.gson.b bVar, TypeToken typeToken, Class cls, boolean z10) {
        boolean z11;
        Method method;
        t3.b bVar2;
        List asList;
        String str;
        boolean z12;
        List list;
        String str2;
        Class cls2;
        boolean z13;
        int modifiers;
        boolean z14;
        t3.a aVar;
        com.google.gson.b bVar3;
        boolean z15;
        Field field;
        List<String> list2;
        i iVar;
        boolean z16;
        i iVar2;
        Field field2;
        c cVar;
        i typeAdapterRuntimeTypeWrapper;
        if (cls.isInterface()) {
            return d.f4300c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken typeToken2 = typeToken;
        Class cls3 = cls;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            if (cls3 != cls && declaredFields.length > 0) {
                List list3 = Collections.EMPTY_LIST;
                f.e();
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i = 0;
            while (i < length) {
                Field field3 = declaredFields[i];
                boolean d10 = d(field3, true);
                boolean d11 = d(field3, r14);
                if (d10 || d11) {
                    if (z10) {
                        if (Modifier.isStatic(field3.getModifiers())) {
                            z11 = r14;
                        } else {
                            Method v = v3.c.f10892a.v(cls3, field3);
                            v3.c.f(v);
                            if (v.getAnnotation(t3.b.class) != null && field3.getAnnotation(t3.b.class) == null) {
                                throw new RuntimeException(androidx.compose.ui.b.N("@SerializedName on ", v3.c.d(v, r14), " is not supported"));
                            }
                            z11 = d11;
                            method = v;
                            if (method == null) {
                                v3.c.f(field3);
                            }
                            Type j = f.j(typeToken2.f4355b, cls3, field3.getGenericType(), new HashMap());
                            bVar2 = (t3.b) field3.getAnnotation(t3.b.class);
                            if (bVar2 != null) {
                                switch (this.f4273b) {
                                    case 1:
                                        str = field3.getName();
                                        break;
                                    case 2:
                                        str = i6.e(field3.getName());
                                        break;
                                    case 3:
                                        str = i6.e(i6.d(field3.getName(), ' '));
                                        break;
                                    case 4:
                                        str = i6.d(field3.getName(), '_').toUpperCase(Locale.ENGLISH);
                                        break;
                                    case 5:
                                        str = i6.d(field3.getName(), '_').toLowerCase(Locale.ENGLISH);
                                        break;
                                    case 6:
                                        str = i6.d(field3.getName(), '-').toLowerCase(Locale.ENGLISH);
                                        break;
                                    default:
                                        str = i6.d(field3.getName(), '.').toLowerCase(Locale.ENGLISH);
                                        break;
                                }
                                asList = Collections.EMPTY_LIST;
                            } else {
                                String value = bVar2.value();
                                asList = Arrays.asList(bVar2.alternate());
                                str = value;
                            }
                            if (!asList.isEmpty()) {
                                z12 = true;
                                list = Collections.singletonList(str);
                            } else {
                                z12 = true;
                                ArrayList arrayList = new ArrayList(asList.size() + 1);
                                arrayList.add(str);
                                arrayList.addAll(asList);
                                list = arrayList;
                            }
                            str2 = (String) list.get(r14);
                            TypeToken typeToken3 = new TypeToken(j);
                            cls2 = typeToken3.f4354a;
                            if (cls2 == null && cls2.isPrimitive()) {
                                z13 = z12;
                            } else {
                                z13 = r14;
                            }
                            modifiers = field3.getModifiers();
                            if (!Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                                z14 = z12;
                            } else {
                                z14 = r14;
                            }
                            aVar = (t3.a) field3.getAnnotation(t3.a.class);
                            if (aVar == null) {
                                field = field3;
                                z15 = z12;
                                list2 = list;
                                bVar3 = bVar;
                                iVar = this.m.b(this.f4272a, bVar3, typeToken3, aVar, false);
                            } else {
                                bVar3 = bVar;
                                z15 = z12;
                                field = field3;
                                list2 = list;
                                iVar = null;
                            }
                            if (iVar == null) {
                                z16 = z15;
                            } else {
                                z16 = r14;
                            }
                            if (iVar == null) {
                                iVar = bVar3.c(typeToken3);
                            }
                            if (!d10) {
                                if (z16) {
                                    typeAdapterRuntimeTypeWrapper = iVar;
                                } else {
                                    typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(bVar3, iVar, typeToken3.f4355b);
                                }
                                iVar2 = typeAdapterRuntimeTypeWrapper;
                            } else {
                                iVar2 = iVar;
                            }
                            c cVar2 = new c(str2, field, method, iVar2, iVar, z13, z14);
                            field2 = field;
                            if (z11) {
                                for (String str3 : list2) {
                                    c cVar3 = (c) linkedHashMap.put(str3, cVar2);
                                    if (cVar3 != null) {
                                        b(cls, str3, cVar3.f4295b, field2);
                                        throw null;
                                    }
                                }
                            }
                            if (d10 && (cVar = (c) linkedHashMap2.put(str2, cVar2)) != null) {
                                b(cls, str2, cVar.f4295b, field2);
                                throw null;
                            }
                        }
                    } else {
                        z11 = d11;
                    }
                    method = null;
                    if (method == null) {
                    }
                    Type j10 = f.j(typeToken2.f4355b, cls3, field3.getGenericType(), new HashMap());
                    bVar2 = (t3.b) field3.getAnnotation(t3.b.class);
                    if (bVar2 != null) {
                    }
                    if (!asList.isEmpty()) {
                    }
                    str2 = (String) list.get(r14);
                    TypeToken typeToken32 = new TypeToken(j10);
                    cls2 = typeToken32.f4354a;
                    if (cls2 == null) {
                    }
                    z13 = r14;
                    modifiers = field3.getModifiers();
                    if (!Modifier.isStatic(modifiers)) {
                    }
                    z14 = r14;
                    aVar = (t3.a) field3.getAnnotation(t3.a.class);
                    if (aVar == null) {
                    }
                    if (iVar == null) {
                    }
                    if (iVar == null) {
                    }
                    if (!d10) {
                    }
                    c cVar22 = new c(str2, field, method, iVar2, iVar, z13, z14);
                    field2 = field;
                    if (z11) {
                    }
                    if (d10) {
                        b(cls, str2, cVar.f4295b, field2);
                        throw null;
                    }
                    continue;
                }
                i++;
                r14 = 0;
            }
            typeToken2 = new TypeToken(f.j(typeToken2.f4355b, cls3, cls3.getGenericSuperclass(), new HashMap()));
            cls3 = typeToken2.f4354a;
        }
        return new d(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }

    public final boolean d(Field field, boolean z10) {
        List list;
        boolean z11;
        Excluder excluder = this.l;
        excluder.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || excluder.b(field.getType(), z10)) {
            z11 = true;
        } else {
            if (z10) {
                list = excluder.f4232a;
            } else {
                list = excluder.f4233b;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    a8.c.i();
                    return false;
                }
            }
            z11 = false;
        }
        return !z11;
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b, reason: collision with root package name */
        public final com.google.gson.internal.m f4276b;

        public FieldReflectionAdapter(com.google.gson.internal.m mVar, d dVar) {
            super(dVar);
            this.f4276b = mVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.f4276b.d();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, w3.a aVar, c cVar) {
            Field field = cVar.f4295b;
            Object b10 = cVar.f4299f.b(aVar);
            if (b10 == null && cVar.g) {
                return;
            }
            if (!cVar.h) {
                field.set(obj, b10);
                return;
            }
            throw new RuntimeException("Cannot set value of 'static final' ".concat(v3.c.d(field, false)));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }
    }
}
