package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4242a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final List f4243b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f4244c;

    public b() {
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f4244c = map;
        this.f4243b = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        if (com.google.gson.internal.f.g(r0[0]) != java.lang.String.class) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m b(TypeToken typeToken, boolean z10) {
        m mVar;
        String str;
        m bVar;
        final Type type = typeToken.f4355b;
        Class cls = typeToken.f4354a;
        Map map = Collections.EMPTY_MAP;
        b.d dVar = null;
        if (map.get(type) == null) {
            if (map.get(cls) == null) {
                final int i = 0;
                final int i3 = 1;
                if (EnumSet.class.isAssignableFrom(cls)) {
                    mVar = new m() { // from class: com.google.gson.internal.a
                        @Override // com.google.gson.internal.m
                        public final Object d() {
                            switch (i) {
                                case 0:
                                    Type type2 = type;
                                    if (type2 instanceof ParameterizedType) {
                                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                                        if (type3 instanceof Class) {
                                            return EnumSet.noneOf((Class) type3);
                                        }
                                        b.d.m(type2, "Invalid EnumSet type: ");
                                    } else {
                                        b.d.m(type2, "Invalid EnumSet type: ");
                                    }
                                    return null;
                                default:
                                    Type type4 = type;
                                    if (type4 instanceof ParameterizedType) {
                                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                                        if (type5 instanceof Class) {
                                            return new EnumMap((Class) type5);
                                        }
                                        b.d.m(type4, "Invalid EnumMap type: ");
                                    } else {
                                        b.d.m(type4, "Invalid EnumMap type: ");
                                    }
                                    return null;
                            }
                        }
                    };
                } else if (cls == EnumMap.class) {
                    mVar = new m() { // from class: com.google.gson.internal.a
                        @Override // com.google.gson.internal.m
                        public final Object d() {
                            switch (i3) {
                                case 0:
                                    Type type2 = type;
                                    if (type2 instanceof ParameterizedType) {
                                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                                        if (type3 instanceof Class) {
                                            return EnumSet.noneOf((Class) type3);
                                        }
                                        b.d.m(type2, "Invalid EnumSet type: ");
                                    } else {
                                        b.d.m(type2, "Invalid EnumSet type: ");
                                    }
                                    return null;
                                default:
                                    Type type4 = type;
                                    if (type4 instanceof ParameterizedType) {
                                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                                        if (type5 instanceof Class) {
                                            return new EnumMap((Class) type5);
                                        }
                                        b.d.m(type4, "Invalid EnumMap type: ");
                                    } else {
                                        b.d.m(type4, "Invalid EnumMap type: ");
                                    }
                                    return null;
                            }
                        }
                    };
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    return mVar;
                }
                List list = Collections.EMPTY_LIST;
                f.e();
                if (!Modifier.isAbstract(cls.getModifiers())) {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        a.a aVar = v3.c.f10892a;
                        try {
                            declaredConstructor.setAccessible(true);
                            str = null;
                        } catch (Exception e10) {
                            str = "Failed making constructor '" + v3.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + v3.c.e(e10);
                        }
                        if (str != null) {
                            bVar = new androidx.constraintlayout.core.state.a(str, 1);
                        } else {
                            bVar = new androidx.core.view.inputmethod.b(declaredConstructor, 7);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (bVar == null) {
                        return bVar;
                    }
                    if (Collection.class.isAssignableFrom(cls)) {
                        if (cls.isAssignableFrom(ArrayList.class)) {
                            dVar = new b.d(18);
                        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                            dVar = new b.d(19);
                        } else if (cls.isAssignableFrom(TreeSet.class)) {
                            dVar = new b.d(20);
                        } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                            dVar = new b.d(21);
                        }
                    } else if (Map.class.isAssignableFrom(cls)) {
                        if (cls.isAssignableFrom(l.class)) {
                            if (type instanceof ParameterizedType) {
                                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                if (actualTypeArguments.length != 0) {
                                }
                            }
                            dVar = new b.d(13);
                        }
                        if (cls.isAssignableFrom(LinkedHashMap.class)) {
                            dVar = new b.d(14);
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
                            dVar = new b.d(15);
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                            dVar = new b.d(16);
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            dVar = new b.d(17);
                        }
                    }
                    if (dVar != null) {
                        return dVar;
                    }
                    String a10 = a(cls);
                    if (a10 != null) {
                        return new androidx.constraintlayout.core.state.a(a10, 2);
                    }
                    if (!z10) {
                        return new androidx.constraintlayout.core.state.a("Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.", 3);
                    }
                    return new androidx.core.view.inputmethod.b(cls, 8);
                }
                bVar = null;
                if (bVar == null) {
                }
            } else {
                a8.c.i();
                return null;
            }
        } else {
            a8.c.i();
            return null;
        }
    }

    public String toString() {
        switch (this.f4242a) {
            case 0:
                return this.f4244c.toString();
            default:
                return super.toString();
        }
    }

    public b(List list, Map map) {
        this.f4243b = list;
        this.f4244c = map;
    }
}
