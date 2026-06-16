package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class h6 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3798a;

    static {
        char[] cArr = new char[80];
        f3798a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            c5 c5Var = c5.l;
            sb.append(a.a.S(new c5(((String) obj).getBytes(u5.f3981a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof c5) {
            sb.append(": \"");
            sb.append(a.a.S((c5) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof o5) {
            sb.append(" {");
            b((o5) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i8 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i8, "key", entry.getKey());
            a(sb, i8, "value", entry.getValue());
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    public static void b(o5 o5Var, StringBuilder sb, int i) {
        int i3;
        int i8;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = o5Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i3 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i3);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null) {
                i8 = i3;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), o5.m(method2, o5Var, new Object[0]));
                    i3 = i8;
                }
            } else {
                i8 = i3;
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), o5.m(method, o5Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m = o5.m(method4, o5Var, new Object[0]);
                    if (method5 == null) {
                        if (m instanceof Boolean) {
                            if (!((Boolean) m).booleanValue()) {
                            }
                            a(sb, i, substring, m);
                        } else if (m instanceof Integer) {
                            if (((Integer) m).intValue() == 0) {
                            }
                            a(sb, i, substring, m);
                        } else if (m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m).floatValue()) == 0) {
                            }
                            a(sb, i, substring, m);
                        } else if (m instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m).doubleValue()) == 0) {
                            }
                            a(sb, i, substring, m);
                        } else {
                            if (m instanceof String) {
                                equals = m.equals("");
                            } else if (m instanceof c5) {
                                equals = m.equals(c5.l);
                            } else if (m instanceof u4) {
                                if (m == ((o5) ((o5) ((u4) m)).n(6))) {
                                }
                                a(sb, i, substring, m);
                            } else {
                                if ((m instanceof Enum) && ((Enum) m).ordinal() == 0) {
                                }
                                a(sb, i, substring, m);
                            }
                            if (equals) {
                            }
                            a(sb, i, substring, m);
                        }
                    } else {
                        if (!((Boolean) o5.m(method5, o5Var, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, m);
                    }
                }
            }
            i3 = i8;
        }
        v6 v6Var = o5Var.zzc;
        if (v6Var != null) {
            for (int i11 = 0; i11 < v6Var.f3996a; i11++) {
                a(sb, i, String.valueOf(v6Var.f3997b[i11] >>> 3), v6Var.f3998c[i11]);
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i3 = 80;
            if (i <= 80) {
                i3 = i;
            }
            sb.append(f3798a, 0, i3);
            i -= i3;
        }
    }
}
