package com.google.gson;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class h extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f4231a;

    public h(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f4231a = bool;
    }

    public static boolean e(h hVar) {
        Serializable serializable = hVar.f4231a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final BigInteger b() {
        Serializable serializable = this.f4231a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (e(this)) {
            return BigInteger.valueOf(c().longValue());
        }
        String d10 = d();
        com.google.gson.internal.f.c(d10);
        return new BigInteger(d10);
    }

    public final Number c() {
        Serializable serializable = this.f4231a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.h((String) serializable);
        }
        a8.c.u("Primitive is neither a number nor a string");
        return null;
    }

    public final String d() {
        Serializable serializable = this.f4231a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        double parseDouble;
        double parseDouble2;
        BigDecimal i;
        BigDecimal i3;
        if (this != obj) {
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                Serializable serializable = hVar.f4231a;
                Serializable serializable2 = this.f4231a;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                }
                if (e(this) && e(hVar)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (c().longValue() == hVar.c().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return b().equals(hVar.b());
                }
                if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            i = (BigDecimal) serializable2;
                        } else {
                            i = com.google.gson.internal.f.i(d());
                        }
                        if (serializable instanceof BigDecimal) {
                            i3 = (BigDecimal) serializable;
                        } else {
                            i3 = com.google.gson.internal.f.i(hVar.d());
                        }
                        if (i.compareTo(i3) == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (serializable2 instanceof Number) {
                        parseDouble = c().doubleValue();
                    } else {
                        parseDouble = Double.parseDouble(d());
                    }
                    if (serializable instanceof Number) {
                        parseDouble2 = hVar.c().doubleValue();
                    } else {
                        parseDouble2 = Double.parseDouble(hVar.d());
                    }
                    if (parseDouble != parseDouble2) {
                        if (Double.isNaN(parseDouble) && Double.isNaN(parseDouble2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return serializable2.equals(serializable);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f4231a;
        if (serializable == null) {
            return 31;
        }
        if (e(this)) {
            doubleToLongBits = c().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public h(Number number) {
        Objects.requireNonNull(number);
        this.f4231a = number;
    }

    public h(String str) {
        Objects.requireNonNull(str);
        this.f4231a = str;
    }
}
