package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f3979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k3.t f3980b;

    public u(h hVar, k3.t tVar) {
        this.f3979a = hVar;
        this.f3980b = tVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (nVar instanceof r) {
            if (nVar2 instanceof r) {
                return 0;
            }
            return 1;
        }
        if (nVar2 instanceof r) {
            return -1;
        }
        h hVar = this.f3979a;
        if (hVar == null) {
            return nVar.f().compareTo(nVar2.f());
        }
        return (int) f1.g.e0(hVar.a(this.f3980b, Arrays.asList(nVar, nVar2)).h().doubleValue());
    }
}
