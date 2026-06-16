package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class a7 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f3700a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f3701b;

    /* renamed from: c, reason: collision with root package name */
    public static final z6 f3702c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3703d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f3704e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f3705f;
    public static final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    static {
        ?? r16;
        z6 z6Var;
        boolean z10;
        Field b10;
        z6 z6Var2;
        Unsafe l = l();
        f3700a = l;
        int i = w4.f4033a;
        f3701b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean m = m(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean m10 = m(cls2);
        z6 z6Var3 = null;
        if (l != null) {
            if (m) {
                z6Var3 = new z6(l);
            } else if (m10) {
                z6Var3 = new z6(l);
            }
        }
        f3702c = z6Var3;
        boolean z11 = true;
        boolean z12 = false;
        if (z6Var3 != null) {
            try {
                Class<?> cls3 = z6Var3.f4063a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                r16 = 0;
                Logger.getLogger(a7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                z12 = false;
            }
            if (b() != null) {
                r16 = 0;
                z12 = true;
                f3703d = z12;
                z6Var = f3702c;
                if (z6Var != null) {
                    try {
                        Class<?> cls4 = z6Var.f4063a.getClass();
                        Class<?>[] clsArr = new Class[1];
                        clsArr[r16] = Field.class;
                        cls4.getMethod("objectFieldOffset", clsArr);
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[r16] = Class.class;
                        cls4.getMethod("arrayBaseOffset", clsArr2);
                        Class<?>[] clsArr3 = new Class[1];
                        clsArr3[r16] = Class.class;
                        cls4.getMethod("arrayIndexScale", clsArr3);
                        Class<?>[] clsArr4 = new Class[2];
                        clsArr4[r16] = Object.class;
                        clsArr4[1] = cls;
                        cls4.getMethod("getInt", clsArr4);
                        Class<?>[] clsArr5 = new Class[3];
                        clsArr5[r16] = Object.class;
                        clsArr5[1] = cls;
                        clsArr5[2] = cls2;
                        cls4.getMethod("putInt", clsArr5);
                        Class<?>[] clsArr6 = new Class[2];
                        clsArr6[r16] = Object.class;
                        clsArr6[1] = cls;
                        cls4.getMethod("getLong", clsArr6);
                        Class<?>[] clsArr7 = new Class[3];
                        clsArr7[r16] = Object.class;
                        clsArr7[1] = cls;
                        clsArr7[2] = cls;
                        cls4.getMethod("putLong", clsArr7);
                        Class<?>[] clsArr8 = new Class[2];
                        clsArr8[r16] = Object.class;
                        clsArr8[1] = cls;
                        cls4.getMethod("getObject", clsArr8);
                        Class<?>[] clsArr9 = new Class[3];
                        clsArr9[r16] = Object.class;
                        clsArr9[1] = cls;
                        clsArr9[2] = Object.class;
                        cls4.getMethod("putObject", clsArr9);
                        z10 = true;
                    } catch (Throwable th2) {
                        Logger.getLogger(a7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                    }
                    f3704e = z10;
                    f3705f = p(byte[].class);
                    p(boolean[].class);
                    a(boolean[].class);
                    p(int[].class);
                    a(int[].class);
                    p(long[].class);
                    a(long[].class);
                    p(float[].class);
                    a(float[].class);
                    p(double[].class);
                    a(double[].class);
                    p(Object[].class);
                    a(Object[].class);
                    b10 = b();
                    if (b10 != null && (z6Var2 = f3702c) != null) {
                        z6Var2.f4063a.objectFieldOffset(b10);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z11 = r16;
                    }
                    g = z11;
                }
                z10 = r16;
                f3704e = z10;
                f3705f = p(byte[].class);
                p(boolean[].class);
                a(boolean[].class);
                p(int[].class);
                a(int[].class);
                p(long[].class);
                a(long[].class);
                p(float[].class);
                a(float[].class);
                p(double[].class);
                a(double[].class);
                p(Object[].class);
                a(Object[].class);
                b10 = b();
                if (b10 != null) {
                    z6Var2.f4063a.objectFieldOffset(b10);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                g = z11;
            }
        }
        r16 = 0;
        f3703d = z12;
        z6Var = f3702c;
        if (z6Var != null) {
        }
        z10 = r16;
        f3704e = z10;
        f3705f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        b10 = b();
        if (b10 != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        g = z11;
    }

    public static void a(Class cls) {
        if (f3704e) {
            f3702c.f4063a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i = w4.f4033a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    public static void c(Object obj, long j, byte b10) {
        Unsafe unsafe = f3702c.f4063a;
        long j10 = (-4) & j;
        int i = unsafe.getInt(obj, j10);
        int i3 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i3) | (i & (~(255 << i3))));
    }

    public static void d(Object obj, long j, byte b10) {
        Unsafe unsafe = f3702c.f4063a;
        long j10 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i) | (unsafe.getInt(obj, j10) & (~(255 << i))));
    }

    public static Object e(Class cls) {
        try {
            return f3700a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int f(Object obj, long j) {
        return f3702c.f4063a.getInt(obj, j);
    }

    public static void g(Object obj, int i, long j) {
        f3702c.f4063a.putInt(obj, j, i);
    }

    public static long h(Object obj, long j) {
        return f3702c.f4063a.getLong(obj, j);
    }

    public static void i(Object obj, long j, long j10) {
        f3702c.f4063a.putLong(obj, j, j10);
    }

    public static Object j(Object obj, long j) {
        return f3702c.f4063a.getObject(obj, j);
    }

    public static void k(long j, Object obj, Object obj2) {
        f3702c.f4063a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean m(Class cls) {
        int i = w4.f4033a;
        try {
            Class cls2 = f3701b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean n(Object obj, long j) {
        if (((byte) ((f3702c.f4063a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean o(Object obj, long j) {
        if (((byte) ((f3702c.f4063a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static int p(Class cls) {
        if (f3704e) {
            return f3702c.f4063a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
