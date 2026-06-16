package com.google.firebase.analytics;

import a2.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.z0;
import f3.c;
import f3.d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q1.z2;
import w0.x;
import z1.b;
import z1.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f4188b;

    /* renamed from: a, reason: collision with root package name */
    public final l1 f4189a;

    public FirebaseAnalytics(l1 l1Var) {
        x.g(l1Var);
        this.f4189a = l1Var;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f4188b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f4188b == null) {
                        f4188b = new FirebaseAnalytics(l1.c(context, null));
                    }
                } finally {
                }
            }
        }
        return f4188b;
    }

    @Nullable
    @Keep
    public static z2 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        l1 c10 = l1.c(context, bundle);
        if (c10 == null) {
            return null;
        }
        return new a(c10);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = c.m;
            return (String) b.l(((c) f.c().b(d.class)).d(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        x0 b10 = x0.b(activity);
        l1 l1Var = this.f4189a;
        l1Var.getClass();
        l1Var.a(new z0(l1Var, b10, str, str2));
    }
}
