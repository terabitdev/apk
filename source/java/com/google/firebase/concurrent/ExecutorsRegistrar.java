package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import b.d;
import com.google.android.gms.internal.measurement.l5;
import com.google.firebase.components.ComponentRegistrar;
import d2.c;
import e2.b;
import e2.f;
import e2.n;
import e2.r;
import f2.a;
import f2.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final n f4190a = new n(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final n f4191b = new n(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final n f4192c = new n(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final n f4193d = new n(new f(5));

    public static f2.f a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new f2.f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) f4193d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(d2.a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(d2.a.class, ExecutorService.class), new r(d2.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            l5.j(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new d(27), hashSet3);
        r rVar3 = new r(d2.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(d2.b.class, ExecutorService.class), new r(d2.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            l5.j(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new d(28), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            l5.j(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new d(29), hashSet9);
        e2.a a10 = b.a(new r(d2.d.class, Executor.class));
        a10.g = new i(0);
        return Arrays.asList(bVar, bVar2, bVar3, a10.d());
    }
}
