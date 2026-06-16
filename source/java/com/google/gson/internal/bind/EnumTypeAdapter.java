package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class EnumTypeAdapter<T extends Enum<T>> extends i {

    /* renamed from: d, reason: collision with root package name */
    public static final j f4254d = new j() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            Class cls = typeToken.f4354a;
            if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new EnumTypeAdapter(cls);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4255a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4256b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4257c = new HashMap();

    public EnumTypeAdapter(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String name = r42.name();
                String str = r42.toString();
                t3.b bVar = (t3.b) field2.getAnnotation(t3.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        this.f4255a.put(str2, r42);
                    }
                }
                this.f4255a.put(name, r42);
                this.f4256b.put(str, r42);
                this.f4257c.put(r42, name);
            }
        } catch (IllegalAccessException e10) {
            f2.i.i(e10);
            throw null;
        }
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String F = aVar.F();
        Enum r02 = (Enum) this.f4255a.get(F);
        if (r02 == null) {
            return (Enum) this.f4256b.get(F);
        }
        return r02;
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        String str;
        Enum r32 = (Enum) obj;
        if (r32 == null) {
            str = null;
        } else {
            str = (String) this.f4257c.get(r32);
        }
        bVar.C(str);
    }
}
