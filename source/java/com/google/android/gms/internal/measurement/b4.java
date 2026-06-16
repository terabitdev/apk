package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class b4 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3713a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3714b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(q2.c cVar) {
        super(null);
        Objects.requireNonNull(cVar);
        this.f3714b = cVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.f3713a) {
            case 0:
                ((AtomicBoolean) ((q2.c) this.f3714b).f9890b).set(true);
                return;
            default:
                g4 g4Var = (g4) this.f3714b;
                synchronized (g4Var.f3785f) {
                    g4Var.g = null;
                    g4Var.f3782c.run();
                }
                synchronized (g4Var) {
                    try {
                        Iterator it = g4Var.h.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(g4 g4Var) {
        super(null);
        this.f3714b = g4Var;
    }
}
