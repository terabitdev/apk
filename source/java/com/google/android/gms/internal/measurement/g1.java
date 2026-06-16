package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class g1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f3779a = Executors.defaultThreadFactory();

    public g1(l1 l1Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3779a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
