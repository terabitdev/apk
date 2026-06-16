package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class m5 implements g6 {

    /* renamed from: b, reason: collision with root package name */
    public static final m5 f3892b = new m5(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3893a;

    public /* synthetic */ m5(int i) {
        this.f3893a = i;
    }

    public static final e6 c(Object obj, Object obj2) {
        e6 e6Var = (e6) obj;
        e6 e6Var2 = (e6) obj2;
        if (!e6Var2.isEmpty()) {
            if (!e6Var.f3759a) {
                e6Var = e6Var.a();
            }
            e6Var.d();
            if (!e6Var2.isEmpty()) {
                e6Var.putAll(e6Var2);
            }
        }
        return e6Var;
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public boolean a(Class cls) {
        switch (this.f3893a) {
            case 0:
                return o5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g6
    public p6 b(Class cls) {
        switch (this.f3893a) {
            case 0:
                if (o5.class.isAssignableFrom(cls)) {
                    try {
                        return (p6) o5.k(cls.asSubclass(o5.class)).n(3);
                    } catch (Exception e10) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.l("Unable to get message info for ".concat(cls.getName()), e10);
                    }
                } else {
                    f2.i.k("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
