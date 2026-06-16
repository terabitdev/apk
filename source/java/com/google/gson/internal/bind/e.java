package com.google.gson.internal.bind;

import android.support.v4.media.session.m;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.internal.h;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o4.b1;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class e {
    public static final j A;
    public static final j B;

    /* renamed from: a, reason: collision with root package name */
    public static final j f4303a = new TypeAdapters$29(Class.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.i
        public final Object b(w3.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported")));
        }

        @Override // com.google.gson.i
        public final void c(w3.b bVar, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }
    }.a());

    /* renamed from: b, reason: collision with root package name */
    public static final j f4304b = new TypeAdapters$29(BitSet.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.i
        public final Object b(w3.a aVar) {
            boolean z10;
            BitSet bitSet = new BitSet();
            aVar.b();
            int H = aVar.H();
            int i3 = 0;
            while (H != 2) {
                int c10 = c.i.c(H);
                if (c10 != 5 && c10 != 6) {
                    if (c10 == 7) {
                        z10 = aVar.x();
                    } else {
                        throw new RuntimeException("Invalid bitset value type: " + b1.o(H) + "; at path " + aVar.n(false));
                    }
                } else {
                    int z11 = aVar.z();
                    if (z11 == 0) {
                        z10 = false;
                    } else if (z11 == 1) {
                        z10 = true;
                    } else {
                        StringBuilder p7 = m.p(z11, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        p7.append(aVar.n(true));
                        throw new RuntimeException(p7.toString());
                    }
                }
                if (z10) {
                    bitSet.set(i3);
                }
                i3++;
                H = aVar.H();
            }
            aVar.g();
            return bitSet;
        }

        @Override // com.google.gson.i
        public final void c(w3.b bVar, Object obj) {
            BitSet bitSet = (BitSet) obj;
            bVar.d();
            int length = bitSet.length();
            for (int i3 = 0; i3 < length; i3++) {
                bVar.A(bitSet.get(i3) ? 1L : 0L);
            }
            bVar.g();
        }
    }.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i f4305c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f4306d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f4307e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f4308f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;

    /* renamed from: k, reason: collision with root package name */
    public static final i f4309k;
    public static final j l;
    public static final i m;

    /* renamed from: n, reason: collision with root package name */
    public static final i f4310n;
    public static final i o;
    public static final j p;
    public static final j q;
    public static final j r;
    public static final j s;
    public static final j t;
    public static final j u;
    public static final j v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f4311w;

    /* renamed from: x, reason: collision with root package name */
    public static final j f4312x;

    /* renamed from: y, reason: collision with root package name */
    public static final j f4313y;

    /* renamed from: z, reason: collision with root package name */
    public static final i f4314z;

    static {
        i iVar = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                int H = aVar.H();
                if (H == 9) {
                    aVar.D();
                    return null;
                }
                if (H == 6) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.F()));
                }
                return Boolean.valueOf(aVar.x());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String str;
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    bVar.q();
                    return;
                }
                bVar.E();
                bVar.b();
                Writer writer = bVar.f11136a;
                if (bool.booleanValue()) {
                    str = "true";
                } else {
                    str = "false";
                }
                writer.write(str);
            }
        };
        f4305c = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                return Boolean.valueOf(aVar.F());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String bool;
                Boolean bool2 = (Boolean) obj;
                if (bool2 == null) {
                    bool = "null";
                } else {
                    bool = bool2.toString();
                }
                bVar.C(bool);
            }
        };
        f4306d = new TypeAdapters$30(Boolean.TYPE, Boolean.class, iVar);
        f4307e = new TypeAdapters$30(Byte.TYPE, Byte.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    int z10 = aVar.z();
                    if (z10 <= 255 && z10 >= -128) {
                        return Byte.valueOf((byte) z10);
                    }
                    StringBuilder p7 = m.p(z10, "Lossy conversion from ", " to byte; at path ");
                    p7.append(aVar.n(true));
                    throw new RuntimeException(p7.toString());
                } catch (NumberFormatException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                if (((Number) obj) == null) {
                    bVar.q();
                } else {
                    bVar.A(r4.byteValue());
                }
            }
        });
        f4308f = new TypeAdapters$30(Short.TYPE, Short.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    int z10 = aVar.z();
                    if (z10 <= 65535 && z10 >= -32768) {
                        return Short.valueOf((short) z10);
                    }
                    StringBuilder p7 = m.p(z10, "Lossy conversion from ", " to short; at path ");
                    p7.append(aVar.n(true));
                    throw new RuntimeException(p7.toString());
                } catch (NumberFormatException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                if (((Number) obj) == null) {
                    bVar.q();
                } else {
                    bVar.A(r4.shortValue());
                }
            }
        });
        g = new TypeAdapters$30(Integer.TYPE, Integer.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.z());
                } catch (NumberFormatException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                if (((Number) obj) == null) {
                    bVar.q();
                } else {
                    bVar.A(r4.intValue());
                }
            }
        });
        h = new TypeAdapters$29(AtomicInteger.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                try {
                    return new AtomicInteger(aVar.z());
                } catch (NumberFormatException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                bVar.A(((AtomicInteger) obj).get());
            }
        }.a());
        i = new TypeAdapters$29(AtomicBoolean.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                return new AtomicBoolean(aVar.x());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                bVar.D(((AtomicBoolean) obj).get());
            }
        }.a());
        j = new TypeAdapters$29(AtomicIntegerArray.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.q()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.z()));
                    } catch (NumberFormatException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                aVar.g();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicIntegerArray.set(i3, ((Integer) arrayList.get(i3)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                bVar.d();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i3 = 0; i3 < length; i3++) {
                    bVar.A(r6.get(i3));
                }
                bVar.g();
            }
        }.a());
        f4309k = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.A());
                } catch (NumberFormatException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.q();
                } else {
                    bVar.A(number.longValue());
                }
            }
        };
        new i() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                return Float.valueOf((float) aVar.y());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.q();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                bVar.B(number);
            }
        };
        new i() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                return Double.valueOf(aVar.y());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.q();
                } else {
                    bVar.z(number.doubleValue());
                }
            }
        };
        l = new TypeAdapters$30(Character.TYPE, Character.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String F = aVar.F();
                if (F.length() == 1) {
                    return Character.valueOf(F.charAt(0));
                }
                StringBuilder v6 = m.v("Expecting character, got: ", F, "; at ");
                v6.append(aVar.n(true));
                throw new RuntimeException(v6.toString());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String valueOf;
                Character ch = (Character) obj;
                if (ch == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch);
                }
                bVar.C(valueOf);
            }
        });
        i iVar2 = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                int H = aVar.H();
                if (H == 9) {
                    aVar.D();
                    return null;
                }
                if (H == 8) {
                    return Boolean.toString(aVar.x());
                }
                return aVar.F();
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                bVar.C((String) obj);
            }
        };
        m = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String F = aVar.F();
                try {
                    return f.i(F);
                } catch (NumberFormatException e10) {
                    StringBuilder v6 = m.v("Failed parsing '", F, "' as BigDecimal; at path ");
                    v6.append(aVar.n(true));
                    throw new RuntimeException(v6.toString(), e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                bVar.B((BigDecimal) obj);
            }
        };
        f4310n = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String F = aVar.F();
                try {
                    f.c(F);
                    return new BigInteger(F);
                } catch (NumberFormatException e10) {
                    StringBuilder v6 = m.v("Failed parsing '", F, "' as BigInteger; at path ");
                    v6.append(aVar.n(true));
                    throw new RuntimeException(v6.toString(), e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                bVar.B((BigInteger) obj);
            }
        };
        o = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                return new h(aVar.F());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                bVar.B((h) obj);
            }
        };
        p = new TypeAdapters$29(String.class, iVar2);
        q = new TypeAdapters$29(StringBuilder.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                return new StringBuilder(aVar.F());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String sb;
                StringBuilder sb2 = (StringBuilder) obj;
                if (sb2 == null) {
                    sb = null;
                } else {
                    sb = sb2.toString();
                }
                bVar.C(sb);
            }
        });
        r = new TypeAdapters$29(StringBuffer.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                return new StringBuffer(aVar.F());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String stringBuffer;
                StringBuffer stringBuffer2 = (StringBuffer) obj;
                if (stringBuffer2 == null) {
                    stringBuffer = null;
                } else {
                    stringBuffer = stringBuffer2.toString();
                }
                bVar.C(stringBuffer);
            }
        });
        s = new TypeAdapters$29(URL.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String F = aVar.F();
                if (F.equals("null")) {
                    return null;
                }
                return new URL(F);
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String externalForm;
                URL url = (URL) obj;
                if (url == null) {
                    externalForm = null;
                } else {
                    externalForm = url.toExternalForm();
                }
                bVar.C(externalForm);
            }
        });
        t = new TypeAdapters$29(URI.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                try {
                    String F = aVar.F();
                    if (F.equals("null")) {
                        return null;
                    }
                    return new URI(F);
                } catch (URISyntaxException e10) {
                    throw new RuntimeException(e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String aSCIIString;
                URI uri = (URI) obj;
                if (uri == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri.toASCIIString();
                }
                bVar.C(aSCIIString);
            }
        });
        final i iVar3 = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                return InetAddress.getByName(aVar.F());
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String hostAddress;
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress.getHostAddress();
                }
                bVar.C(hostAddress);
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        u = new j() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.j
            public final i a(com.google.gson.b bVar, TypeToken typeToken) {
                final Class<?> cls2 = typeToken.f4354a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                return new i() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                    @Override // com.google.gson.i
                    public final Object b(w3.a aVar) {
                        Object b10 = iVar3.b(aVar);
                        if (b10 != null) {
                            Class cls3 = cls2;
                            if (!cls3.isInstance(b10)) {
                                throw new RuntimeException("Expected a " + cls3.getName() + " but was " + b10.getClass().getName() + "; at path " + aVar.n(true));
                            }
                        }
                        return b10;
                    }

                    @Override // com.google.gson.i
                    public final void c(w3.b bVar2, Object obj) {
                        iVar3.c(bVar2, obj);
                    }
                };
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + iVar3 + "]";
            }
        };
        v = new TypeAdapters$29(UUID.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                String F = aVar.F();
                try {
                    return UUID.fromString(F);
                } catch (IllegalArgumentException e10) {
                    StringBuilder v6 = m.v("Failed parsing '", F, "' as UUID; at path ");
                    v6.append(aVar.n(true));
                    throw new RuntimeException(v6.toString(), e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String uuid;
                UUID uuid2 = (UUID) obj;
                if (uuid2 == null) {
                    uuid = null;
                } else {
                    uuid = uuid2.toString();
                }
                bVar.C(uuid);
            }
        });
        f4311w = new TypeAdapters$29(Currency.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                String F = aVar.F();
                try {
                    return Currency.getInstance(F);
                } catch (IllegalArgumentException e10) {
                    StringBuilder v6 = m.v("Failed parsing '", F, "' as Currency; at path ");
                    v6.append(aVar.n(true));
                    throw new RuntimeException(v6.toString(), e10);
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                bVar.C(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final i iVar4 = new i() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
            
                if (r1.equals("month") == false) goto L11;
             */
            @Override // com.google.gson.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(w3.a aVar) {
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                aVar.d();
                int i3 = 0;
                int i8 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    char c10 = 4;
                    if (aVar.H() != 4) {
                        String B2 = aVar.B();
                        int z10 = aVar.z();
                        switch (B2.hashCode()) {
                            case -1181204563:
                                if (B2.equals("dayOfMonth")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1074026988:
                                if (B2.equals("minute")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -906279820:
                                if (B2.equals("second")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case 3704893:
                                if (B2.equals("year")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 104080000:
                                break;
                            case 985252545:
                                if (B2.equals("hourOfDay")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                        }
                        c10 = 65535;
                        switch (c10) {
                            case 0:
                                i10 = z10;
                                break;
                            case 1:
                                i12 = z10;
                                break;
                            case 2:
                                i13 = z10;
                                break;
                            case 3:
                                i3 = z10;
                                break;
                            case 4:
                                i8 = z10;
                                break;
                            case 5:
                                i11 = z10;
                                break;
                        }
                    } else {
                        aVar.h();
                        return new GregorianCalendar(i3, i8, i10, i11, i12, i13);
                    }
                }
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                if (((Calendar) obj) == null) {
                    bVar.q();
                    return;
                }
                bVar.e();
                bVar.k("year");
                bVar.A(r4.get(1));
                bVar.k("month");
                bVar.A(r4.get(2));
                bVar.k("dayOfMonth");
                bVar.A(r4.get(5));
                bVar.k("hourOfDay");
                bVar.A(r4.get(11));
                bVar.k("minute");
                bVar.A(r4.get(12));
                bVar.k("second");
                bVar.A(r4.get(13));
                bVar.h();
            }
        };
        f4312x = new j() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // com.google.gson.j
            public final i a(com.google.gson.b bVar, TypeToken typeToken) {
                Class cls2 = typeToken.f4354a;
                if (cls2 != Calendar.class && cls2 != GregorianCalendar.class) {
                    return null;
                }
                return i.this;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + i.this + "]";
            }
        };
        f4313y = new TypeAdapters$29(Locale.class, new i() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                String str;
                String str2;
                String str3 = null;
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.F(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null && str3 == null) {
                    return new Locale(str);
                }
                if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar, Object obj) {
                String locale;
                Locale locale2 = (Locale) obj;
                if (locale2 == null) {
                    locale = null;
                } else {
                    locale = locale2.toString();
                }
                bVar.C(locale);
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.f4260a;
        f4314z = jsonElementTypeAdapter;
        final Class<com.google.gson.d> cls2 = com.google.gson.d.class;
        A = new j() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.j
            public final i a(com.google.gson.b bVar, TypeToken typeToken) {
                final Class cls22 = typeToken.f4354a;
                if (!cls2.isAssignableFrom(cls22)) {
                    return null;
                }
                return new i() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                    @Override // com.google.gson.i
                    public final Object b(w3.a aVar) {
                        Object b10 = jsonElementTypeAdapter.b(aVar);
                        if (b10 != null) {
                            Class cls3 = cls22;
                            if (!cls3.isInstance(b10)) {
                                throw new RuntimeException("Expected a " + cls3.getName() + " but was " + b10.getClass().getName() + "; at path " + aVar.n(true));
                            }
                        }
                        return b10;
                    }

                    @Override // com.google.gson.i
                    public final void c(w3.b bVar2, Object obj) {
                        jsonElementTypeAdapter.c(bVar2, obj);
                    }
                };
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        B = EnumTypeAdapter.f4254d;
    }

    public static j a(Class cls, i iVar) {
        return new TypeAdapters$29(cls, iVar);
    }

    public static j b(Class cls, Class cls2, i iVar) {
        return new TypeAdapters$30(cls, cls2, iVar);
    }
}
