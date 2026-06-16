package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b2.a;
import b2.b;
import com.google.android.gms.internal.measurement.l1;
import com.google.firebase.components.ComponentRegistrar;
import e2.c;
import e2.j;
import e2.l;
import java.util.Arrays;
import java.util.List;
import w0.x;
import z1.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        f fVar = (f) cVar.a(f.class);
        Context context = (Context) cVar.a(Context.class);
        b3.c cVar2 = (b3.c) cVar.a(b3.c.class);
        x.g(fVar);
        x.g(context);
        x.g(cVar2);
        x.g(context.getApplicationContext());
        if (b.f3282c == null) {
            synchronized (b.class) {
                try {
                    if (b.f3282c == null) {
                        Bundle bundle = new Bundle(1);
                        fVar.a();
                        if ("[DEFAULT]".equals(fVar.f11487b)) {
                            ((l) cVar2).a(b2.c.f3285b, c3.f.f3501b);
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.h());
                        }
                        b.f3282c = new b(l1.c(context, bundle).f3878b);
                    }
                } finally {
                }
            }
        }
        return b.f3282c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<e2.b> getComponents() {
        e2.a b10 = e2.b.b(a.class);
        b10.c(j.b(f.class));
        b10.c(j.b(Context.class));
        b10.c(j.b(b3.c.class));
        b10.g = c3.f.l;
        b10.e(2);
        return Arrays.asList(b10.d(), a.a.k("fire-analytics", "23.0.0"));
    }
}
