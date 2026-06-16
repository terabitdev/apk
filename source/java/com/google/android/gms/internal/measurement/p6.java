package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f3931a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3932b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f3933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3934d;

    public p6(u4 u4Var, String str, Object[] objArr) {
        this.f3931a = u4Var;
        this.f3932b = str;
        this.f3933c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3934d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i3 = 1;
        int i8 = 13;
        while (true) {
            int i10 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i8;
                i8 += 13;
                i3 = i10;
            } else {
                this.f3934d = i | (charAt2 << i8);
                return;
            }
        }
    }

    public final int a() {
        int i = this.f3934d;
        if ((i & 1) != 0) {
            return 1;
        }
        if ((i & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
