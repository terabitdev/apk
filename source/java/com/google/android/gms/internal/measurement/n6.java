package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class n6 {

    /* renamed from: c, reason: collision with root package name */
    public static final n6 f3904c = new n6();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3906b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final c6 f3905a = new c6(0);

    public final q6 a(Class cls) {
        q6 u;
        Charset charset = u5.f3981a;
        m5 m5Var = null;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f3906b;
            q6 q6Var = (q6) concurrentHashMap.get(cls);
            if (q6Var == null) {
                c6 c6Var = this.f3905a;
                c6Var.getClass();
                m5 m5Var2 = r6.f3945a;
                o5.class.isAssignableFrom(cls);
                p6 b10 = ((c6) c6Var.f3726a).b(cls);
                if ((b10.f3934d & 2) == 2) {
                    m5 m5Var3 = r6.f3945a;
                    m5 m5Var4 = h5.f3797a;
                    u = new k6(m5Var3, b10.f3931a);
                } else {
                    int i = l6.f3884a;
                    int i3 = z5.f4062a;
                    m5 m5Var5 = r6.f3945a;
                    if (b10.a() - 1 != 1) {
                        m5Var = h5.f3797a;
                    }
                    int i8 = f6.f3771a;
                    u = j6.u(b10, m5Var5, m5Var);
                }
                q6 q6Var2 = (q6) concurrentHashMap.putIfAbsent(cls, u);
                if (q6Var2 != null) {
                    return q6Var2;
                }
                return u;
            }
            return q6Var;
        }
        o2.a.h("messageType");
        return null;
    }
}
