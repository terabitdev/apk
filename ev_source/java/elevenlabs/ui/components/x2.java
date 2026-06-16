package io.elevenlabs.ui.components;

import java.util.Iterator;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17711a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f17712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17713c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17714d;

    public /* synthetic */ x2(float f10, w1.e0 e0Var, long j4) {
        this.f17712b = f10;
        this.f17714d = e0Var;
        this.f17713c = j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x027d, code lost:
    
        if (((int) (r2 & 4294967295L)) > 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x023b, code lost:
    
        if (((int) (r12 & 4294967295L)) > 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
    
        if (((int) (r13 & 4294967295L)) > 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        if (((int) (r10 & 4294967295L)) > 0) goto L77;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141 A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #3 {all -> 0x013a, blocks: (B:42:0x011a, B:44:0x0120, B:48:0x0129, B:50:0x0132, B:53:0x0141), top: B:41:0x011a, outer: #5 }] */
    @Override // ho.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        sn.z wormTransition_1gnV_Wk$lambda$0;
        g3.g f10;
        ho.l lVar;
        g3.g j4;
        float intBitsToFloat;
        float intBitsToFloat2;
        ho.l lVar2;
        long j10;
        Iterator it;
        int i10 = this.f17711a;
        long j11 = this.f17713c;
        float f11 = this.f17712b;
        Object obj2 = this.f17714d;
        switch (i10) {
            case 0:
                wormTransition_1gnV_Wk$lambda$0 = TabIndicatorKt.wormTransition_1gnV_Wk$lambda$0(f11, (w1.e0) obj2, j11, (r3.e) obj);
                return wormTransition_1gnV_Wk$lambda$0;
            default:
                vl.g gVar = (vl.g) obj2;
                r3.e eVar = (r3.e) obj;
                eVar.getClass();
                Object obj3 = vl.i.f35700a;
                long j12 = gVar.C0;
                if (j12 == 16) {
                    j12 = gVar.f35693e.f35710a;
                }
                if (j12 == 16) {
                    j12 = gVar.f35692d.f35710a;
                }
                if (j12 != 16) {
                    r3.e.q0(eVar, j12, 0L, 0L, t2.u.P, null, 0, 126);
                }
                ja.c1 f02 = eVar.f0();
                long L = f02.L();
                f02.y().o();
                try {
                    long j13 = 0;
                    ((j8.g) f02.f18786b).W(f11, 0L, f11);
                    long g10 = o3.b.g(j11, gVar.f35694f);
                    if (((((g10 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && !o3.b.c(g10, 0L)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (g10 >> 32));
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (g10 & 4294967295L));
                        ((j8.g) eVar.f0().f18786b).X(intBitsToFloat3, intBitsToFloat4);
                        try {
                            Iterator it2 = gVar.H0.iterator();
                            while (it2.hasNext()) {
                                vl.b bVar = (vl.b) it2.next();
                                if (!bVar.f35674g) {
                                    f10 = g3.t.f();
                                    if (f10 != null) {
                                        lVar2 = f10.e();
                                    } else {
                                        lVar2 = null;
                                    }
                                    j4 = g3.t.j(f10);
                                    try {
                                        long b10 = bVar.b();
                                        if ((b10 & 9223372034707292159L) != 9205357640488583168L) {
                                            j10 = j13;
                                            j13 = b10;
                                        } else {
                                            j10 = j13;
                                        }
                                        g3.t.m(f10, j4, lVar);
                                        if (((((j13 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == j10 && !o3.b.c(j13, j10)) {
                                            intBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
                                            intBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
                                            ((j8.g) eVar.f0().f18786b).X(intBitsToFloat, intBitsToFloat2);
                                            try {
                                                s3.b a10 = bVar.a();
                                                if (a10 != null) {
                                                    if (a10.f30908s) {
                                                        a10 = null;
                                                    }
                                                    if (a10 != null) {
                                                        long j14 = a10.f30910u;
                                                        it = it2;
                                                        if (((int) (j14 >> 32)) > 0) {
                                                            break;
                                                        }
                                                        a10 = null;
                                                        if (a10 != null) {
                                                            wn.e.l(eVar, a10);
                                                        }
                                                        ((j8.g) eVar.f0().f18786b).X(-intBitsToFloat, -intBitsToFloat2);
                                                    }
                                                }
                                                it = it2;
                                                a10 = null;
                                                if (a10 != null) {
                                                }
                                                ((j8.g) eVar.f0().f18786b).X(-intBitsToFloat, -intBitsToFloat2);
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        } else {
                                            it = it2;
                                            s3.b a11 = bVar.a();
                                            if (a11 != null) {
                                                if (a11.f30908s) {
                                                    a11 = null;
                                                }
                                                if (a11 != null) {
                                                    long j15 = a11.f30910u;
                                                    if (((int) (j15 >> 32)) > 0) {
                                                        break;
                                                    }
                                                }
                                            }
                                            a11 = null;
                                            if (a11 != null) {
                                                wn.e.l(eVar, a11);
                                            }
                                        }
                                        it2 = it;
                                        j13 = 0;
                                    } finally {
                                    }
                                } else {
                                    throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                                }
                            }
                            ((j8.g) eVar.f0().f18786b).X(-intBitsToFloat3, -intBitsToFloat4);
                            com.google.android.gms.internal.play_billing.b.v(f02, L);
                            return sn.z.f31622a;
                        } catch (Throwable th2) {
                            ((j8.g) eVar.f0().f18786b).X(-intBitsToFloat3, -intBitsToFloat4);
                            throw th2;
                        }
                    }
                    for (vl.b bVar2 : gVar.H0) {
                        if (!bVar2.f35674g) {
                            f10 = g3.t.f();
                            if (f10 != null) {
                                lVar = f10.e();
                            } else {
                                lVar = null;
                            }
                            j4 = g3.t.j(f10);
                            try {
                                long b11 = bVar2.b();
                                if ((b11 & 9223372034707292159L) == 9205357640488583168L) {
                                    b11 = 0;
                                }
                                g3.t.m(f10, j4, lVar);
                                if (((((b11 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && !o3.b.c(b11, 0L)) {
                                    intBitsToFloat = Float.intBitsToFloat((int) (b11 >> 32));
                                    intBitsToFloat2 = Float.intBitsToFloat((int) (b11 & 4294967295L));
                                    ((j8.g) eVar.f0().f18786b).X(intBitsToFloat, intBitsToFloat2);
                                    try {
                                        s3.b a12 = bVar2.a();
                                        if (a12 != null) {
                                            if (a12.f30908s) {
                                                a12 = null;
                                            }
                                            if (a12 != null) {
                                                long j16 = a12.f30910u;
                                                if (((int) (j16 >> 32)) > 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        a12 = null;
                                        if (a12 != null) {
                                            wn.e.l(eVar, a12);
                                        }
                                        ((j8.g) eVar.f0().f18786b).X(-intBitsToFloat, -intBitsToFloat2);
                                    } finally {
                                        ((j8.g) eVar.f0().f18786b).X(-intBitsToFloat, -intBitsToFloat2);
                                    }
                                } else {
                                    s3.b a13 = bVar2.a();
                                    if (a13 != null) {
                                        if (a13.f30908s) {
                                            a13 = null;
                                        }
                                        if (a13 != null) {
                                            long j17 = a13.f30910u;
                                            if (((int) (j17 >> 32)) > 0) {
                                                break;
                                            }
                                        }
                                    }
                                    a13 = null;
                                    if (a13 != null) {
                                        wn.e.l(eVar, a13);
                                    }
                                }
                            } finally {
                            }
                        } else {
                            throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                        }
                    }
                    com.google.android.gms.internal.play_billing.b.v(f02, L);
                    return sn.z.f31622a;
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.b.v(f02, L);
                    throw th3;
                }
        }
    }

    public /* synthetic */ x2(vl.g gVar, float f10, long j4) {
        this.f17714d = gVar;
        this.f17712b = f10;
        this.f17713c = j4;
    }
}
