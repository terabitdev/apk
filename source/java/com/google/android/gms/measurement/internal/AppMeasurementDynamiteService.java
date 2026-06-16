package com.google.android.gms.measurement.internal;

import a3.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.work.WorkRequest;
import b.d;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.x0;
import e1.b;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k3.k;
import o4.a0;
import q1.a2;
import q1.c3;
import q1.e3;
import q1.g3;
import q1.j3;
import q1.j4;
import q1.k2;
import q1.l4;
import q1.o0;
import q1.o2;
import q1.p1;
import q1.p2;
import q1.q1;
import q1.q2;
import q1.s1;
import q1.s2;
import q1.t2;
import q1.u;
import q1.v;
import q1.v0;
import q1.x4;
import q1.y0;
import q1.y2;
import q1.y4;
import q1.z;
import w0.x;
import y1.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@DynamiteApi
/* loaded from: classes4.dex */
public class AppMeasurementDynamiteService extends k0 {
    public s1 i;
    public final ArrayMap j;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.i = null;
        this.j = new ArrayMap();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        c();
        z zVar = this.i.f9768w;
        s1.j(zVar);
        zVar.h(j, str);
    }

    public final void c() {
        if (this.i != null) {
            return;
        }
        d.j("Attempting to perform action before initialize.");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.u(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.h();
        p1 p1Var = y2Var.f9510a.p;
        s1.m(p1Var);
        p1Var.p(new a(12, y2Var, false, null));
    }

    public final void d(String str, n0 n0Var) {
        c();
        x4 x4Var = this.i.r;
        s1.k(x4Var);
        x4Var.P(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        c();
        z zVar = this.i.f9768w;
        s1.j(zVar);
        zVar.i(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void generateEventId(n0 n0Var) throws RemoteException {
        c();
        x4 x4Var = this.i.r;
        s1.k(x4Var);
        long d02 = x4Var.d0();
        c();
        x4 x4Var2 = this.i.r;
        s1.k(x4Var2);
        x4Var2.Q(n0Var, d02);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getAppInstanceId(n0 n0Var) throws RemoteException {
        c();
        p1 p1Var = this.i.p;
        s1.m(p1Var);
        p1Var.p(new q1(this, n0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCachedAppInstanceId(n0 n0Var) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        d((String) y2Var.p.get(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getConditionalUserProperties(String str, String str2, n0 n0Var) throws RemoteException {
        c();
        p1 p1Var = this.i.p;
        s1.m(p1Var);
        p1Var.p(new a2(4, this, n0Var, str2, str));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenClass(n0 n0Var) throws RemoteException {
        String str;
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        j3 j3Var = y2Var.f9510a.u;
        s1.l(j3Var);
        g3 g3Var = j3Var.l;
        if (g3Var != null) {
            str = g3Var.f9608b;
        } else {
            str = null;
        }
        d(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getCurrentScreenName(n0 n0Var) throws RemoteException {
        String str;
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        j3 j3Var = y2Var.f9510a.u;
        s1.l(j3Var);
        g3 g3Var = j3Var.l;
        if (g3Var != null) {
            str = g3Var.f9607a;
        } else {
            str = null;
        }
        d(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getGmpAppId(n0 n0Var) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        d(y2Var.v(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getMaxUserProperties(String str, n0 n0Var) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        x.d(str);
        y2Var.f9510a.getClass();
        c();
        x4 x4Var = this.i.r;
        s1.k(x4Var);
        x4Var.R(n0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getSessionId(n0 n0Var) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        p1 p1Var = y2Var.f9510a.p;
        s1.m(p1Var);
        p1Var.p(new a(y2Var, n0Var));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getTestFlag(n0 n0Var, int i) throws RemoteException {
        c();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        x4 x4Var = this.i.r;
                        s1.k(x4Var);
                        y2 y2Var = this.i.v;
                        s1.l(y2Var);
                        AtomicReference atomicReference = new AtomicReference();
                        p1 p1Var = y2Var.f9510a.p;
                        s1.m(p1Var);
                        x4Var.T(n0Var, ((Boolean) p1Var.q(atomicReference, 15000L, "boolean test flag value", new s2(y2Var, atomicReference, 0))).booleanValue());
                        return;
                    }
                    x4 x4Var2 = this.i.r;
                    s1.k(x4Var2);
                    y2 y2Var2 = this.i.v;
                    s1.l(y2Var2);
                    AtomicReference atomicReference2 = new AtomicReference();
                    p1 p1Var2 = y2Var2.f9510a.p;
                    s1.m(p1Var2);
                    x4Var2.R(n0Var, ((Integer) p1Var2.q(atomicReference2, 15000L, "int test flag value", new s2(y2Var2, atomicReference2, 3))).intValue());
                    return;
                }
                x4 x4Var3 = this.i.r;
                s1.k(x4Var3);
                y2 y2Var3 = this.i.v;
                s1.l(y2Var3);
                AtomicReference atomicReference3 = new AtomicReference();
                p1 p1Var3 = y2Var3.f9510a.p;
                s1.m(p1Var3);
                double doubleValue = ((Double) p1Var3.q(atomicReference3, 15000L, "double test flag value", new s2(y2Var3, atomicReference3, 4))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    n0Var.s(bundle);
                    return;
                } catch (RemoteException e10) {
                    v0 v0Var = x4Var3.f9510a.o;
                    s1.m(v0Var);
                    v0Var.r.c(e10, "Error returning double value to wrapper");
                    return;
                }
            }
            x4 x4Var4 = this.i.r;
            s1.k(x4Var4);
            y2 y2Var4 = this.i.v;
            s1.l(y2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            p1 p1Var4 = y2Var4.f9510a.p;
            s1.m(p1Var4);
            x4Var4.Q(n0Var, ((Long) p1Var4.q(atomicReference4, 15000L, "long test flag value", new s2(y2Var4, atomicReference4, 2))).longValue());
            return;
        }
        x4 x4Var5 = this.i.r;
        s1.k(x4Var5);
        y2 y2Var5 = this.i.v;
        s1.l(y2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        p1 p1Var5 = y2Var5.f9510a.p;
        s1.m(p1Var5);
        x4Var5.P((String) p1Var5.q(atomicReference5, 15000L, "String test flag value", new s2(y2Var5, atomicReference5, 1)), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void getUserProperties(String str, String str2, boolean z10, n0 n0Var) throws RemoteException {
        c();
        p1 p1Var = this.i.p;
        s1.m(p1Var);
        p1Var.p(new p2(this, n0Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initForTests(@NonNull Map map) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void initialize(e1.a aVar, com.google.android.gms.internal.measurement.v0 v0Var, long j) throws RemoteException {
        s1 s1Var = this.i;
        if (s1Var == null) {
            Context context = (Context) b.J(aVar);
            x.g(context);
            this.i = s1.s(context, v0Var, Long.valueOf(j));
        } else {
            v0 v0Var2 = s1Var.o;
            s1.m(v0Var2);
            v0Var2.r.b("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void isDataCollectionEnabled(n0 n0Var) throws RemoteException {
        c();
        p1 p1Var = this.i.p;
        s1.m(p1Var);
        p1Var.p(new q1(this, n0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z10, boolean z11, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.l(str, str2, bundle, z10, z11, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j) throws RemoteException {
        Bundle bundle2;
        c();
        x.d(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        v vVar = new v(str2, new u(bundle), "app", j);
        p1 p1Var = this.i.p;
        s1.m(p1Var);
        p1Var.p(new a2(this, n0Var, vVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void logHealthData(int i, @NonNull String str, @NonNull e1.a aVar, @NonNull e1.a aVar2, @NonNull e1.a aVar3) throws RemoteException {
        Object J;
        Object J2;
        c();
        Object obj = null;
        if (aVar == null) {
            J = null;
        } else {
            J = b.J(aVar);
        }
        if (aVar2 == null) {
            J2 = null;
        } else {
            J2 = b.J(aVar2);
        }
        if (aVar3 != null) {
            obj = b.J(aVar3);
        }
        Object obj2 = obj;
        v0 v0Var = this.i.o;
        s1.m(v0Var);
        v0Var.p(i, true, false, str, J, J2, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreated(@NonNull e1.a aVar, @NonNull Bundle bundle, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        x.g(activity);
        onActivityCreatedByScionActivityInfo(x0.b(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityCreatedByScionActivityInfo(x0 x0Var, Bundle bundle, long j) {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        k kVar = y2Var.l;
        if (kVar != null) {
            y2 y2Var2 = this.i.v;
            s1.l(y2Var2);
            y2Var2.z();
            kVar.j(x0Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyed(@NonNull e1.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        x.g(activity);
        onActivityDestroyedByScionActivityInfo(x0.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityDestroyedByScionActivityInfo(x0 x0Var, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        k kVar = y2Var.l;
        if (kVar != null) {
            y2 y2Var2 = this.i.v;
            s1.l(y2Var2);
            y2Var2.z();
            kVar.k(x0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPaused(@NonNull e1.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        x.g(activity);
        onActivityPausedByScionActivityInfo(x0.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityPausedByScionActivityInfo(x0 x0Var, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        k kVar = y2Var.l;
        if (kVar != null) {
            y2 y2Var2 = this.i.v;
            s1.l(y2Var2);
            y2Var2.z();
            kVar.l(x0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumed(@NonNull e1.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        x.g(activity);
        onActivityResumedByScionActivityInfo(x0.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityResumedByScionActivityInfo(x0 x0Var, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        k kVar = y2Var.l;
        if (kVar != null) {
            y2 y2Var2 = this.i.v;
            s1.l(y2Var2);
            y2Var2.z();
            kVar.m(x0Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceState(e1.a aVar, n0 n0Var, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        x.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(x0.b(activity), n0Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivitySaveInstanceStateByScionActivityInfo(x0 x0Var, n0 n0Var, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        k kVar = y2Var.l;
        Bundle bundle = new Bundle();
        if (kVar != null) {
            y2 y2Var2 = this.i.v;
            s1.l(y2Var2);
            y2Var2.z();
            kVar.n(x0Var, bundle);
        }
        try {
            n0Var.s(bundle);
        } catch (RemoteException e10) {
            v0 v0Var = this.i.o;
            s1.m(v0Var);
            v0Var.r.c(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStarted(@NonNull e1.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        x.g(activity);
        onActivityStartedByScionActivityInfo(x0.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStartedByScionActivityInfo(x0 x0Var, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        if (y2Var.l != null) {
            y2 y2Var2 = this.i.v;
            s1.l(y2Var2);
            y2Var2.z();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStopped(@NonNull e1.a aVar, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        x.g(activity);
        onActivityStoppedByScionActivityInfo(x0.b(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void onActivityStoppedByScionActivityInfo(x0 x0Var, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        if (y2Var.l != null) {
            y2 y2Var2 = this.i.v;
            s1.l(y2Var2);
            y2Var2.z();
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void performAction(Bundle bundle, n0 n0Var, long j) throws RemoteException {
        c();
        n0Var.s(null);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void registerOnMeasurementEventListener(s0 s0Var) throws RemoteException {
        Object obj;
        c();
        ArrayMap arrayMap = this.j;
        synchronized (arrayMap) {
            try {
                obj = (k2) arrayMap.get(Integer.valueOf(s0Var.b()));
                if (obj == null) {
                    obj = new y4(this, s0Var);
                    arrayMap.put(Integer.valueOf(s0Var.b()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.h();
        if (!y2Var.f9860n.add(obj)) {
            v0 v0Var = y2Var.f9510a.o;
            s1.m(v0Var);
            v0Var.r.b("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void resetAnalyticsData(long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.p.set(null);
        p1 p1Var = y2Var.f9510a.p;
        s1.m(p1Var);
        p1Var.p(new q2(y2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void retrieveAndUploadBatches(p0 p0Var) {
        e3 e3Var;
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.h();
        s1 s1Var = y2Var.f9510a;
        p1 p1Var = s1Var.p;
        s1.m(p1Var);
        if (!p1Var.m()) {
            p1 p1Var2 = s1Var.p;
            s1.m(p1Var2);
            if (Thread.currentThread() == p1Var2.m) {
                v0 v0Var = s1Var.o;
                s1.m(v0Var);
                v0Var.o.b("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            boolean b10 = o9.a.b();
            v0 v0Var2 = s1Var.o;
            if (!b10) {
                s1.m(v0Var2);
                v0Var2.f9815w.b("[sgtm] Started client-side batch upload work.");
                boolean z10 = false;
                int i = 0;
                int i3 = 0;
                loop0: while (!z10) {
                    v0 v0Var3 = s1Var.o;
                    s1.m(v0Var3);
                    v0Var3.f9815w.b("[sgtm] Getting upload batches from service (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    p1 p1Var3 = s1Var.p;
                    s1.m(p1Var3);
                    p1Var3.q(atomicReference, WorkRequest.MIN_BACKOFF_MILLIS, "[sgtm] Getting upload batches", new s2(y2Var, atomicReference, 6, false));
                    l4 l4Var = (l4) atomicReference.get();
                    if (l4Var == null) {
                        break;
                    }
                    List list = l4Var.f9676a;
                    if (list.isEmpty()) {
                        break;
                    }
                    v0 v0Var4 = s1Var.o;
                    s1.m(v0Var4);
                    v0Var4.f9815w.c(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
                    i += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            j4 j4Var = (j4) it.next();
                            try {
                                URL url = new URI(j4Var.l).toURL();
                                AtomicReference atomicReference2 = new AtomicReference();
                                o0 r = y2Var.f9510a.r();
                                r.h();
                                x.g(r.p);
                                String str = r.p;
                                s1 s1Var2 = y2Var.f9510a;
                                v0 v0Var5 = s1Var2.o;
                                s1.m(v0Var5);
                                d9.a aVar = v0Var5.f9815w;
                                Long valueOf = Long.valueOf(j4Var.f9649a);
                                aVar.e("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, j4Var.l, Integer.valueOf(j4Var.f9650b.length));
                                if (!TextUtils.isEmpty(j4Var.p)) {
                                    v0 v0Var6 = s1Var2.o;
                                    s1.m(v0Var6);
                                    v0Var6.f9815w.d(valueOf, "[sgtm] Uploading data from app. row_id", j4Var.p);
                                }
                                HashMap hashMap = new HashMap();
                                Bundle bundle = j4Var.m;
                                for (String str2 : bundle.keySet()) {
                                    String string = bundle.getString(str2);
                                    if (!TextUtils.isEmpty(string)) {
                                        hashMap.put(str2, string);
                                    }
                                }
                                c3 c3Var = s1Var2.f9769x;
                                s1.m(c3Var);
                                byte[] bArr = j4Var.f9650b;
                                i iVar = new i(y2Var, atomicReference2, j4Var, 28);
                                c3Var.i();
                                x.g(url);
                                x.g(bArr);
                                p1 p1Var4 = c3Var.f9510a.p;
                                s1.m(p1Var4);
                                p1Var4.s(new y0(c3Var, str, url, bArr, hashMap, iVar));
                                try {
                                    x4 x4Var = s1Var2.r;
                                    s1.k(x4Var);
                                    s1 s1Var3 = x4Var.f9510a;
                                    s1Var3.t.getClass();
                                    long currentTimeMillis = System.currentTimeMillis() + 60000;
                                    synchronized (atomicReference2) {
                                        for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                            try {
                                                atomicReference2.wait(j);
                                                s1Var3.t.getClass();
                                            } catch (Throwable th) {
                                                throw th;
                                                break loop0;
                                            }
                                        }
                                    }
                                } catch (InterruptedException unused) {
                                    v0 v0Var7 = y2Var.f9510a.o;
                                    s1.m(v0Var7);
                                    v0Var7.r.b("[sgtm] Interrupted waiting for uploading batch");
                                }
                                if (atomicReference2.get() == null) {
                                    e3Var = e3.UNKNOWN;
                                } else {
                                    e3Var = (e3) atomicReference2.get();
                                }
                            } catch (MalformedURLException | URISyntaxException e10) {
                                v0 v0Var8 = y2Var.f9510a.o;
                                s1.m(v0Var8);
                                v0Var8.o.e("[sgtm] Bad upload url for row_id", j4Var.l, Long.valueOf(j4Var.f9649a), e10);
                                e3Var = e3.FAILURE;
                            }
                            if (e3Var == e3.SUCCESS) {
                                i3++;
                            } else if (e3Var == e3.BACKOFF) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
                v0 v0Var9 = s1Var.o;
                s1.m(v0Var9);
                v0Var9.f9815w.d(Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i3));
                try {
                    p0Var.e();
                    return;
                } catch (RemoteException e11) {
                    s1 s1Var4 = this.i;
                    x.g(s1Var4);
                    v0 v0Var10 = s1Var4.o;
                    s1.m(v0Var10);
                    v0Var10.r.c(e11, "Failed to call IDynamiteUploadBatchesCallback");
                    return;
                }
            }
            s1.m(v0Var2);
            v0Var2.o.b("Cannot retrieve and upload batches from main thread");
            return;
        }
        v0 v0Var11 = s1Var.o;
        s1.m(v0Var11);
        v0Var11.o.b("Cannot retrieve and upload batches from analytics worker thread");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        c();
        s1 s1Var = this.i;
        if (bundle == null) {
            v0 v0Var = s1Var.o;
            s1.m(v0Var);
            v0Var.o.b("Conditional user property must not be null");
        } else {
            y2 y2Var = s1Var.v;
            s1.l(y2Var);
            y2Var.t(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.A(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setCurrentScreen(@NonNull e1.a aVar, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        c();
        Activity activity = (Activity) b.J(aVar);
        x.g(activity);
        setCurrentScreenByScionActivityInfo(x0.b(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r3 <= 500) goto L31;
     */
    @Override // com.google.android.gms.internal.measurement.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(x0 x0Var, String str, String str2, long j) throws RemoteException {
        String str3;
        c();
        j3 j3Var = this.i.u;
        s1.l(j3Var);
        s1 s1Var = j3Var.f9510a;
        if (!s1Var.m.u()) {
            v0 v0Var = s1Var.o;
            s1.m(v0Var);
            v0Var.t.b("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        g3 g3Var = j3Var.l;
        if (g3Var == null) {
            v0 v0Var2 = s1Var.o;
            s1.m(v0Var2);
            v0Var2.t.b("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = j3Var.o;
        Integer valueOf = Integer.valueOf(x0Var.f4039a);
        if (concurrentHashMap.get(valueOf) == null) {
            v0 v0Var3 = s1Var.o;
            s1.m(v0Var3);
            v0Var3.t.b("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = j3Var.n(x0Var.f4040b);
        }
        String str4 = g3Var.f9608b;
        String str5 = g3Var.f9607a;
        boolean equals = Objects.equals(str4, str2);
        boolean equals2 = Objects.equals(str5, str);
        if (equals && equals2) {
            v0 v0Var4 = s1Var.o;
            s1.m(v0Var4);
            v0Var4.t.b("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                s1Var.m.getClass();
            }
            v0 v0Var5 = s1Var.o;
            s1.m(v0Var5);
            v0Var5.t.c(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            s1Var.m.getClass();
            if (length2 <= 500) {
                v0 v0Var6 = s1Var.o;
                s1.m(v0Var6);
                d9.a aVar = v0Var6.f9815w;
                if (str == null) {
                    str3 = "null";
                } else {
                    str3 = str;
                }
                aVar.d(str3, "Setting current screen to name, class", str2);
                x4 x4Var = s1Var.r;
                s1.k(x4Var);
                g3 g3Var2 = new g3(x4Var.d0(), str, str2);
                concurrentHashMap.put(valueOf, g3Var2);
                j3Var.p(x0Var.f4040b, g3Var2, true);
                return;
            }
        }
        v0 v0Var7 = s1Var.o;
        s1.m(v0Var7);
        v0Var7.t.c(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.h();
        p1 p1Var = y2Var.f9510a.p;
        s1.m(p1Var);
        p1Var.p(new o2(y2Var, z10));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        Bundle bundle2;
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        p1 p1Var = y2Var.f9510a.p;
        s1.m(p1Var);
        p1Var.p(new t2(y2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setEventInterceptor(s0 s0Var) throws RemoteException {
        boolean z10;
        c();
        a0 a0Var = new a0(7, this, false, s0Var);
        p1 p1Var = this.i.p;
        s1.m(p1Var);
        boolean m = p1Var.m();
        s1 s1Var = this.i;
        if (m) {
            y2 y2Var = s1Var.v;
            s1.l(y2Var);
            y2Var.g();
            y2Var.h();
            a0 a0Var2 = y2Var.m;
            if (a0Var != a0Var2) {
                if (a0Var2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x.i(z10, "EventInterceptor already set.");
            }
            y2Var.m = a0Var;
            return;
        }
        p1 p1Var2 = s1Var.p;
        s1.m(p1Var2);
        p1Var2.p(new a(14, this, false, a0Var));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setInstanceIdProvider(u0 u0Var) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMeasurementEnabled(boolean z10, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        Boolean valueOf = Boolean.valueOf(z10);
        y2Var.h();
        p1 p1Var = y2Var.f9510a.p;
        s1.m(p1Var);
        p1Var.p(new a(12, y2Var, false, valueOf));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        p1 p1Var = y2Var.f9510a.p;
        s1.m(p1Var);
        p1Var.p(new q2(y2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        s1 s1Var = y2Var.f9510a;
        Uri data = intent.getData();
        if (data == null) {
            v0 v0Var = s1Var.o;
            s1.m(v0Var);
            v0Var.u.b("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter != null && queryParameter.equals("1")) {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                v0 v0Var2 = s1Var.o;
                s1.m(v0Var2);
                v0Var2.u.c(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
                s1Var.m.l = queryParameter2;
                return;
            }
            return;
        }
        v0 v0Var3 = s1Var.o;
        s1.m(v0Var3);
        v0Var3.u.b("[sgtm] Preview Mode was not enabled.");
        s1Var.m.l = null;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserId(@NonNull String str, long j) throws RemoteException {
        c();
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        s1 s1Var = y2Var.f9510a;
        if (str != null && TextUtils.isEmpty(str)) {
            v0 v0Var = s1Var.o;
            s1.m(v0Var);
            v0Var.r.b("User ID must be non-empty or null");
        } else {
            p1 p1Var = s1Var.p;
            s1.m(p1Var);
            p1Var.p(new a(15, y2Var, str));
            y2Var.q(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull e1.a aVar, boolean z10, long j) throws RemoteException {
        c();
        Object J = b.J(aVar);
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.q(str, str2, J, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void unregisterOnMeasurementEventListener(s0 s0Var) throws RemoteException {
        Object obj;
        c();
        ArrayMap arrayMap = this.j;
        synchronized (arrayMap) {
            obj = (k2) arrayMap.remove(Integer.valueOf(s0Var.b()));
        }
        if (obj == null) {
            obj = new y4(this, s0Var);
        }
        y2 y2Var = this.i.v;
        s1.l(y2Var);
        y2Var.h();
        if (!y2Var.f9860n.remove(obj)) {
            v0 v0Var = y2Var.f9510a.o;
            s1.m(v0Var);
            v0Var.r.b("OnEventListener had not been registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
    }
}
