package com.google.android.gms.internal.measurement;

import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Double f3776a;

    public g(Double d10) {
        if (d10 == null) {
            this.f3776a = Double.valueOf(Double.NaN);
        } else {
            this.f3776a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        Double d10 = this.f3776a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f3776a.equals(((g) obj).f3776a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        BigDecimal stripTrailingZeros;
        int scale;
        Double d10 = this.f3776a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            if (d10.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d10.doubleValue());
        if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = valueOf.stripTrailingZeros();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf(ExifInterface.LONGITUDE_EAST);
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace(ExifInterface.LONGITUDE_EAST, "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, k3.t tVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(f());
        }
        throw new IllegalArgumentException(f() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double h() {
        return this.f3776a;
    }

    public final int hashCode() {
        return this.f3776a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return new g(this.f3776a);
    }

    public final String toString() {
        return f();
    }
}
