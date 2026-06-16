package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class a1 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3691n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1 k1Var, Activity activity, i0 i0Var) {
        super(k1Var.f3834a, true);
        this.f3691n = 3;
        this.p = activity;
        this.q = i0Var;
        this.o = k1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:19|20|(1:22)|23|24|(12:55|56|57|27|(1:54)(1:31)|32|33|34|(1:36)(1:50)|37|38|(2:40|41)(4:42|(1:48)(1:45)|46|47))|26|27|(1:29)|54|32|33|34|(0)(0)|37|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        r7.b(r0, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[Catch: Exception -> 0x0091, b -> 0x00c4, TRY_ENTER, TryCatch #0 {b -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:50:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00e8, B:46:0x0101, B:50:0x00c6, B:53:0x00d7, B:56:0x00a1), top: B:19:0x0076, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00e8, B:46:0x0101, B:50:0x00c6, B:53:0x00d7, B:56:0x00a1), top: B:19:0x0076, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[Catch: Exception -> 0x0091, b -> 0x00c4, TryCatch #0 {b -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:50:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    @Override // com.google.android.gms.internal.measurement.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Boolean valueOf;
        l1 l1Var;
        boolean z10;
        boolean z11;
        c3.f fVar;
        Bundle bundle;
        switch (this.f3691n) {
            case 0:
                try {
                    Context context = (Context) this.p;
                    w0.x.g(context);
                    String a10 = q1.j2.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(a10)) {
                        a10 = q1.j2.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", a10);
                    l0 l0Var = null;
                    if (identifier != 0) {
                        try {
                            valueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                        l1Var = (l1) this.o;
                        if (valueOf != null || !valueOf.booleanValue()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l1Var.getClass();
                        if (!z10) {
                            fVar = f1.e.f4958c;
                        } else {
                            fVar = f1.e.f4957b;
                        }
                        l0Var = k0.asInterface(f1.e.c(context, fVar, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                        l1Var.f3882f = l0Var;
                        if (l1Var.f3882f != null) {
                            Log.w("FA", "Failed to connect to measurement client.");
                            return;
                        }
                        int a11 = f1.e.a(context, ModuleDescriptor.MODULE_ID);
                        int d10 = f1.e.d(context, ModuleDescriptor.MODULE_ID, false);
                        int max = Math.max(a11, d10);
                        if (Boolean.TRUE.equals(valueOf) || d10 < a11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        v0 v0Var = new v0(133005L, max, z11, (Bundle) this.q, q1.j2.a(context));
                        l0 l0Var2 = l1Var.f3882f;
                        w0.x.g(l0Var2);
                        l0Var2.initialize(new e1.b(context), v0Var, this.f3794a);
                        return;
                    }
                    valueOf = null;
                    l1Var = (l1) this.o;
                    if (valueOf != null) {
                    }
                    z10 = true;
                    l1Var.getClass();
                    if (!z10) {
                    }
                    l0Var = k0.asInterface(f1.e.c(context, fVar, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    l1Var.f3882f = l0Var;
                    if (l1Var.f3882f != null) {
                    }
                } catch (Exception e10) {
                    ((l1) this.o).b(e10, true, false);
                    return;
                }
            case 1:
                l0 l0Var3 = ((l1) this.o).f3882f;
                w0.x.g(l0Var3);
                l0Var3.getMaxUserProperties((String) this.p, (i0) this.q);
                return;
            case 2:
                Bundle bundle2 = (Bundle) this.q;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                l0 l0Var4 = ((k1) this.o).f3834a.f3882f;
                w0.x.g(l0Var4);
                l0Var4.onActivityCreatedByScionActivityInfo(x0.b((Activity) this.p), bundle, this.f3795b);
                return;
            default:
                l0 l0Var5 = ((k1) this.o).f3834a.f3882f;
                w0.x.g(l0Var5);
                l0Var5.onActivitySaveInstanceStateByScionActivityInfo(x0.b((Activity) this.p), (i0) this.q, this.f3795b);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public void b() {
        switch (this.f3691n) {
            case 1:
                ((i0) this.q).s(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(l1 l1Var, Object obj, Object obj2, int i) {
        super(l1Var, true);
        this.f3691n = i;
        this.p = obj;
        this.q = obj2;
        this.o = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1 k1Var, Bundle bundle, Activity activity) {
        super(k1Var.f3834a, true);
        this.f3691n = 2;
        this.q = bundle;
        this.p = activity;
        this.o = k1Var;
    }
}
