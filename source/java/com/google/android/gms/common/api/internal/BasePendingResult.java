package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.h0;
import e9.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import u0.g;
import u0.i;
import v0.j;
import v0.o;
import w0.x;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@KeepName
/* loaded from: classes4.dex */
public abstract class BasePendingResult<R extends i> {
    public static final c j = new c(4);

    /* renamed from: e, reason: collision with root package name */
    public i f3687e;

    /* renamed from: f, reason: collision with root package name */
    public Status f3688f;
    public volatile boolean g;
    public boolean h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3683a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f3684b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3685c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f3686d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(g gVar) {
        Looper mainLooper;
        if (gVar != null) {
            mainLooper = ((o) gVar).f10858b.f10795f;
        } else {
            mainLooper = Looper.getMainLooper();
        }
        new h0(mainLooper, 1);
        new WeakReference(gVar);
    }

    public final void a(j jVar) {
        synchronized (this.f3683a) {
            try {
                if (d()) {
                    jVar.a(this.f3688f);
                } else {
                    this.f3685c.add(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract i b(Status status);

    public final void c(Status status) {
        synchronized (this.f3683a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.f3684b.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void e(i iVar) {
        synchronized (this.f3683a) {
            try {
                if (!this.h) {
                    d();
                    x.i(!d(), "Results have already been set");
                    x.i(!this.g, "Result has already been consumed");
                    this.f3687e = iVar;
                    this.f3688f = iVar.getStatus();
                    this.f3684b.countDown();
                    ArrayList arrayList = this.f3685c;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((j) arrayList.get(i)).a(this.f3688f);
                    }
                    arrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
